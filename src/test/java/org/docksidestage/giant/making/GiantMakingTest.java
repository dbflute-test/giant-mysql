package org.docksidestage.giant.making;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

import javax.annotation.Resource;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.info.ColumnInfo;
import org.dbflute.util.DfCollectionUtil;
import org.dbflute.util.DfTypeUtil;
import org.dbflute.util.Srl;
import org.docksidestage.dbflute.allcommon.CDef;
import org.docksidestage.dbflute.bsentity.dbmeta.GiantDbm;
import org.docksidestage.dbflute.bsentity.dbmeta.GiantRefDbm;
import org.docksidestage.dbflute.bsentity.dbmeta.GiantSideDbm;
import org.docksidestage.dbflute.exbhv.MemberBhv;
import org.docksidestage.dbflute.exbhv.ProductBhv;
import org.docksidestage.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.dbflute.exentity.Giantable;
import org.docksidestage.dbflute.exentity.Member;
import org.docksidestage.dbflute.exentity.Product;
import org.docksidestage.dbflute.exentity.Purchase;
import org.docksidestage.unit.UnitGiantBasicTestCase;

/**
 * @author jflute
 */
public class GiantMakingTest extends UnitGiantBasicTestCase {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    public static final List<String> namePrefixList;
    static {
        namePrefixList = Arrays.asList("sea", "land", "piari", "dstore", "bonvo", "amba", "miraco", "dohotel", "toytoy");
    }

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private MemberBhv memberBhv;
    @Resource
    private PurchaseBhv purchaseBhv;
    @Resource
    private ProductBhv productBhv;

    // -----------------------------------------------------
    //                                                Cached
    //                                                ------
    private final List<CDef.GiantStatus> giantStatusList = CDef.GiantStatus.listAll();

    private Map<Integer, Member> memberMap = newLinkedHashMap();
    private Map<Long, Purchase> purchaseMap = newLinkedHashMap();
    private Map<Integer, Product> productMap = newLinkedHashMap();

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    public void setUp() throws Exception {
        super.setUp();

        for (Member member : memberBhv.selectList(cb -> cb.addOrderBy_PK_Asc())) {
            memberMap.put(member.getMemberId(), member);
        }
        for (Purchase purchase : purchaseBhv.selectList(cb -> cb.addOrderBy_PK_Asc())) {
            purchaseMap.put(purchase.getPurchaseId(), purchase);
        }
        for (Product product : productBhv.selectList(cb -> cb.addOrderBy_PK_Asc())) {
            productMap.put(product.getProductId(), product);
        }
    }

    // ===================================================================================
    //                                                                         Giant Maker
    //                                                                         ===========
    // _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
    // you can make giant data as TSV files for ReplaceSchema
    // and the data can be registered when ReplaceSchema (the TSV files are git-ignored)
    // _/_/_/_/_/_/_/_/_/_/
    public void test_making_TSV() throws Exception {
        final int basePointCount = filterRecordCount(300);
        final int refCount = filterRecordCount(1000); // as one-to-many
        final int sideCount = basePointCount; // as one-to-one
        outputGiant(92, basePointCount, GiantDbm.getInstance());
        outputGiantRef(93, refCount, GiantRefDbm.getInstance(), basePointCount);
        outputGiantSide(94, sideCount, GiantSideDbm.getInstance(), basePointCount);
    }

    protected boolean isRealPerformance() {
        return false; // temporarily change it if performance
    }

    // -----------------------------------------------------
    //                                           Record Size
    //                                           -----------
    protected int filterRecordCount(int standardCount) {
        if (isRealPerformance()) {
            return standardCount * 10000;
        } else { // training
            return standardCount;
        }
    }

    // ===================================================================================
    //                                                                              Output
    //                                                                              ======
    private void outputGiant(int giantPrefixNumber, int recordCount, DBMeta dbmeta) {
        doOutputGiantable(giantPrefixNumber, recordCount, dbmeta, currentId -> null); // as base point
    }

    private void outputGiantRef(int prefixNumber, int recordCount, DBMeta dbmeta, int basePointSize) {
        final Random random = new Random();
        doOutputGiantable(prefixNumber, recordCount, dbmeta, currentId -> {
            final int parentId = random.nextInt(basePointSize) + 1; // completely random
            return Long.valueOf(parentId);
        });
    }

    private void outputGiantSide(int prefixNumber, int recordCount, DBMeta dbmeta, int basePointSize) {
        doOutputGiantable(prefixNumber, recordCount, dbmeta, currentId -> Long.valueOf(currentId));
    }

    private void doOutputGiantable(int prefixNumber, int recordCount, DBMeta dbmeta, Function<Integer, Long> fkIdProvider) {
        final String tsvPath = prepareTsvPath(prefixNumber, dbmeta);
        writeTsv(tsvPath, recordCount, dbmeta, fkIdProvider);
    }

    private String prepareTsvPath(int prefixNumber, DBMeta dbmeta) {
        final File projectDir = getProjectDir();
        final String projectPath;
        try {
            projectPath = projectDir.getCanonicalPath();
        } catch (IOException e) {
            throw new IllegalStateException("Failed to get canonical path: " + projectDir, e);
        }
        String outputDir = projectPath + "/dbflute_maihamadb/playsql/data/ut/tsv/UTF-8";
        if (!isRealPerformance()) { // as training
            outputDir = outputDir + "/giant_backup";
        }
        return outputDir + "/" + prefixNumber + "-" + dbmeta.getTableSqlName() + ".tsv";
    }

    // ===================================================================================
    //                                                                              Writer
    //                                                                              ======
    private void writeTsv(String tsvPath, int recordCount, DBMeta dbmeta, Function<Integer, Long> fkIdProvider) {
        BufferedWriter bw = null;
        try {
            log("...Writing {}", dbmeta.getTableDispName());

            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(tsvPath), "UTF-8"));
            doWriteHeader(bw, dbmeta);
            doWriteRecords(bw, dbmeta, recordCount, prepareGiantableCreator(dbmeta), fkIdProvider);
        } catch (IOException e) {
            throw new IllegalStateException("Failed to write the TSV: " + tsvPath, e);
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException ignored) {}
            }
        }
    }

    private Supplier<Giantable> prepareGiantableCreator(DBMeta dbmeta) {
        return () -> (Giantable) dbmeta.newEntity(); // always Giantable entity here
    }

    private void doWriteHeader(BufferedWriter bw, DBMeta dbmeta) throws IOException {
        final List<ColumnInfo> columnInfoList = dbmeta.getColumnInfoList();
        int index = 0;
        for (ColumnInfo columnInfo : columnInfoList) {
            bw.write((index > 0 ? "\t" : "") + columnInfo.getColumnDbName());
            ++index;
        }
    }

    private void doWriteRecords(BufferedWriter bw, DBMeta dbmeta, int recordCount, Supplier<Giantable> giantableCreator,
            Function<Integer, Long> fkIdProvider) throws IOException {
        final int initialBaseId = 1; // fixed
        final int loopLimitCount = recordCount + initialBaseId;
        final CurrentSelfParent selfParentId = new CurrentSelfParent();
        for (int currentId = initialBaseId; currentId < loopLimitCount; currentId++) {
            final Giantable giantable = prepareGiantable(giantableCreator, fkIdProvider, selfParentId, currentId);
            final String record = buildRecord(dbmeta.extractAllColumnMap(giantable));
            bw.write(ln() + record);
        }
    }

    protected String buildRecord(Map<String, Object> columnValueMap) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (Entry<String, Object> entry : columnValueMap.entrySet()) {
            Object value = entry.getValue();
            if (index > 0) {
                sb.append("\t");
            }
            if (value == null) {
                sb.append("");
            } else if (value instanceof LocalDate) {
                sb.append(DfTypeUtil.toString(value, "yyyy-MM-dd"));
            } else if (value instanceof LocalDateTime) {
                sb.append(DfTypeUtil.toString(value, "yyyy-MM-dd HH:mm:ss.SSS"));
            } else if (value instanceof LocalTime) {
                sb.append(DfTypeUtil.toString(value, "HH:mm:ss"));
            } else if (value instanceof Timestamp) {
                sb.append(DfTypeUtil.toString(value, "yyyy-MM-dd HH:mm:ss.SSS"));
            } else if (value instanceof java.util.Date) {
                sb.append(DfTypeUtil.toString(value, "yyyy-MM-dd"));
            } else {
                sb.append(value);
            }
            ++index;
        }
        return sb.toString();
    }

    // ===================================================================================
    //                                                                           Giantable
    //                                                                           =========
    private Giantable prepareGiantable(Supplier<Giantable> giantableCreator, Function<Integer, Long> fkIdProvider,
            CurrentSelfParent selfParentId, int currentId) {
        final Giantable giantable = giantableCreator.get();
        final DBMeta dbmeta = giantable.asDBMeta();

        final String primaryColumnName = dbmeta.getPrimaryInfo().getFirstColumn().getColumnDbName();
        dbmeta.acceptPrimaryKeyMap(giantable, DfCollectionUtil.newLinkedHashMap(primaryColumnName, currentId));

        final Long fkId = fkIdProvider.apply(currentId);
        if (fkId != null) { // except GIANT table
            giantable.setGiantId(fkId);
        }

        giantable.mynativeMappingGiantStatusCode(deriveStatusCode());

        final String namePrefix = deriveNamePrefix();

        giantable.setIndexString(namePrefix + deriveNameSuffix(currentId));
        giantable.setIndexInteger(deriveAdjustedInteger(currentId));
        giantable.setIndexDate(deriveRandomDate());
        giantable.setIndexDatetime(deriveRandomDatetime());
        giantable.setIndexBoolean(deriveRandomBoolean());

        giantable.setNonIndexString(giantable.getIndexString());
        giantable.setNonIndexInteger(giantable.getIndexInteger());
        giantable.setNonIndexDate(giantable.getIndexDate());
        giantable.setNonIndexDatetime(giantable.getIndexDatetime());
        giantable.setNonIndexBoolean(giantable.getIndexBoolean());

        giantable.setNullableIndexString(deriveNullable(giantable.getIndexString()));
        giantable.setNullableIndexInteger(deriveNullable(giantable.getIndexInteger()));
        giantable.setNullableIndexDate(deriveNullable(giantable.getIndexDate()));
        giantable.setNullableIndexDatetime(deriveNullable(giantable.getIndexDatetime()));
        giantable.setNullableIndexBoolean(deriveNullable(giantable.getIndexBoolean()));

        if (currentId % 100 == 0) { // means independent
            selfParentId.setParentid(null); // and initialize it
        } else if (currentId % 100 == 1) { // means parent
            selfParentId.setParentid(giantable.getGiantId());
        } else if (selfParentId.getParentid() != null) { // child now
            giantable.setSelfParentId(selfParentId.getParentid());
        }

        Integer[] compoundUniques = deriveCompoundUniques(currentId);
        giantable.setUnique1stInteger(compoundUniques[0]);
        giantable.setUnique2ndInteger(compoundUniques[1]);
        giantable.setUnique3rdInteger(compoundUniques[2]);
        giantable.setUnique4thInteger(compoundUniques[3]);

        giantable.setUniqueString(namePrefix + currentId);
        giantable.setUniqueInteger(currentId);

        giantable.setZoneMemberId(deriveRandomMemberId());
        giantable.setZonePurchaseId(deriveRandomPurchaseId());
        giantable.setZoneProductId(deriveRandomProductId());
        return giantable;
    }

    public static class CurrentSelfParent {

        private Long parentid;

        public Long getParentid() {
            return parentid;
        }

        public void setParentid(Long parentid) {
            this.parentid = parentid;
        }
    }

    // ===================================================================================
    //                                                                         Derive Item
    //                                                                         ===========
    private String deriveStatusCode() {
        Random random = new Random();
        int randomIndex = random.nextInt(giantStatusList.size());
        return giantStatusList.get(randomIndex).code();
    }

    private String deriveNamePrefix() {
        Random random = new Random();
        int randomIndex = random.nextInt(namePrefixList.size());
        return namePrefixList.get(randomIndex);
    }

    private int deriveNameSuffix(int currentId) {
        return currentId % 1000;
    }

    private int deriveAdjustedInteger(int currentId) {
        return currentId % 10000;
    }

    private LocalDate deriveRandomDate() {
        LocalDate standardDate = LocalDate.of(2000, 1, 1);
        Random random = new Random();
        int randomYear = random.nextInt(200);
        int randomMonth = random.nextInt(11);
        int randomDays = random.nextInt(30);
        return standardDate.plusYears(randomYear).plusMonths(randomMonth).plusDays(randomDays);
    }

    private LocalDateTime deriveRandomDatetime() {
        LocalDate randomDate = deriveRandomDate();
        LocalTime standardTime = LocalTime.of(0, 0, 0);
        Random random = new Random();
        int randomHours = random.nextInt(24);
        int randomMinutes = random.nextInt(60);
        int randomSeconds = random.nextInt(60);
        return randomDate.atTime(standardTime.plusHours(randomHours).plusMinutes(randomMinutes).plusSeconds(randomSeconds));
    }

    private boolean deriveRandomBoolean() {
        return new Random().nextBoolean();
    }

    private <COLUMN> COLUMN deriveNullable(COLUMN obj) {
        int nextInt = new Random().nextInt(3);
        return nextInt <= 1 ? obj : null;
    }

    private Integer deriveRandomMemberId() {
        return new Random().nextInt(memberMap.size()) + 1;
    }

    private Long deriveRandomPurchaseId() {
        return new Random().nextInt(purchaseMap.size()) + 1L;
    }

    private Integer deriveRandomProductId() {
        return new Random().nextInt(productMap.size()) + 1;
    }

    private Integer[] deriveCompoundUniques(Integer currentId) {
        String indented = Srl.indent(8 - currentId.toString().length()) + currentId;
        String zeroLefted = indented.replace(" ", "0");

        Integer first = Integer.valueOf(zeroLefted.substring(0, 3));
        Integer second = Integer.valueOf(zeroLefted.substring(1, 5));
        Integer third = Integer.valueOf(zeroLefted.substring(2, 6));
        Integer fourth = Integer.valueOf(zeroLefted.substring(3, 8));
        return new Integer[] { first, second, third, fourth };
    }
}
