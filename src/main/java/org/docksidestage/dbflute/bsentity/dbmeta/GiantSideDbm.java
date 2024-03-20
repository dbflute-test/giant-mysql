/*
 * Copyright 2015-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.docksidestage.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.dbflute.allcommon.*;
import org.docksidestage.dbflute.exentity.*;

/**
 * The DB meta of giant_side. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class GiantSideDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final GiantSideDbm _instance = new GiantSideDbm();
    private GiantSideDbm() {}
    public static GiantSideDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((GiantSide)et).getGiantSideId(), (et, vl) -> ((GiantSide)et).setGiantSideId(ctl(vl)), "giantSideId");
        setupEpg(_epgMap, et -> ((GiantSide)et).getGiantId(), (et, vl) -> ((GiantSide)et).setGiantId(ctl(vl)), "giantId");
        setupEpg(_epgMap, et -> ((GiantSide)et).getGiantStatusCode(), (et, vl) -> {
            CDef.GiantStatus cls = (CDef.GiantStatus)gcls(et, columnGiantStatusCode(), vl);
            if (cls != null) {
                ((GiantSide)et).setGiantStatusCodeAsGiantStatus(cls);
            } else {
                ((GiantSide)et).mynativeMappingGiantStatusCode((String)vl);
            }
        }, "giantStatusCode");
        setupEpg(_epgMap, et -> ((GiantSide)et).getIndexString(), (et, vl) -> ((GiantSide)et).setIndexString((String)vl), "indexString");
        setupEpg(_epgMap, et -> ((GiantSide)et).getIndexInteger(), (et, vl) -> ((GiantSide)et).setIndexInteger(cti(vl)), "indexInteger");
        setupEpg(_epgMap, et -> ((GiantSide)et).getIndexDate(), (et, vl) -> ((GiantSide)et).setIndexDate(ctld(vl)), "indexDate");
        setupEpg(_epgMap, et -> ((GiantSide)et).getIndexDatetime(), (et, vl) -> ((GiantSide)et).setIndexDatetime(ctldt(vl)), "indexDatetime");
        setupEpg(_epgMap, et -> ((GiantSide)et).getIndexBoolean(), (et, vl) -> ((GiantSide)et).setIndexBoolean((Boolean)vl), "indexBoolean");
        setupEpg(_epgMap, et -> ((GiantSide)et).getNonIndexString(), (et, vl) -> ((GiantSide)et).setNonIndexString((String)vl), "nonIndexString");
        setupEpg(_epgMap, et -> ((GiantSide)et).getNonIndexInteger(), (et, vl) -> ((GiantSide)et).setNonIndexInteger(cti(vl)), "nonIndexInteger");
        setupEpg(_epgMap, et -> ((GiantSide)et).getNonIndexDate(), (et, vl) -> ((GiantSide)et).setNonIndexDate(ctld(vl)), "nonIndexDate");
        setupEpg(_epgMap, et -> ((GiantSide)et).getNonIndexDatetime(), (et, vl) -> ((GiantSide)et).setNonIndexDatetime(ctldt(vl)), "nonIndexDatetime");
        setupEpg(_epgMap, et -> ((GiantSide)et).getNonIndexBoolean(), (et, vl) -> ((GiantSide)et).setNonIndexBoolean((Boolean)vl), "nonIndexBoolean");
        setupEpg(_epgMap, et -> ((GiantSide)et).getNullableIndexString(), (et, vl) -> ((GiantSide)et).setNullableIndexString((String)vl), "nullableIndexString");
        setupEpg(_epgMap, et -> ((GiantSide)et).getNullableIndexInteger(), (et, vl) -> ((GiantSide)et).setNullableIndexInteger(cti(vl)), "nullableIndexInteger");
        setupEpg(_epgMap, et -> ((GiantSide)et).getNullableIndexDate(), (et, vl) -> ((GiantSide)et).setNullableIndexDate(ctld(vl)), "nullableIndexDate");
        setupEpg(_epgMap, et -> ((GiantSide)et).getNullableIndexDatetime(), (et, vl) -> ((GiantSide)et).setNullableIndexDatetime(ctldt(vl)), "nullableIndexDatetime");
        setupEpg(_epgMap, et -> ((GiantSide)et).getNullableIndexBoolean(), (et, vl) -> ((GiantSide)et).setNullableIndexBoolean((Boolean)vl), "nullableIndexBoolean");
        setupEpg(_epgMap, et -> ((GiantSide)et).getSelfParentId(), (et, vl) -> ((GiantSide)et).setSelfParentId(ctl(vl)), "selfParentId");
        setupEpg(_epgMap, et -> ((GiantSide)et).getUnique1stInteger(), (et, vl) -> ((GiantSide)et).setUnique1stInteger(cti(vl)), "unique1stInteger");
        setupEpg(_epgMap, et -> ((GiantSide)et).getUnique2ndInteger(), (et, vl) -> ((GiantSide)et).setUnique2ndInteger(cti(vl)), "unique2ndInteger");
        setupEpg(_epgMap, et -> ((GiantSide)et).getUnique3rdInteger(), (et, vl) -> ((GiantSide)et).setUnique3rdInteger(cti(vl)), "unique3rdInteger");
        setupEpg(_epgMap, et -> ((GiantSide)et).getUnique4thInteger(), (et, vl) -> ((GiantSide)et).setUnique4thInteger(cti(vl)), "unique4thInteger");
        setupEpg(_epgMap, et -> ((GiantSide)et).getUniqueString(), (et, vl) -> ((GiantSide)et).setUniqueString((String)vl), "uniqueString");
        setupEpg(_epgMap, et -> ((GiantSide)et).getUniqueInteger(), (et, vl) -> ((GiantSide)et).setUniqueInteger(cti(vl)), "uniqueInteger");
        setupEpg(_epgMap, et -> ((GiantSide)et).getZoneMemberId(), (et, vl) -> ((GiantSide)et).setZoneMemberId(cti(vl)), "zoneMemberId");
        setupEpg(_epgMap, et -> ((GiantSide)et).getZonePurchaseId(), (et, vl) -> ((GiantSide)et).setZonePurchaseId(ctl(vl)), "zonePurchaseId");
        setupEpg(_epgMap, et -> ((GiantSide)et).getZoneProductId(), (et, vl) -> ((GiantSide)et).setZoneProductId(cti(vl)), "zoneProductId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((GiantSide)et).getGiant(), (et, vl) -> ((GiantSide)et).setGiant((OptionalEntity<Giant>)vl), "giant");
        setupEfpg(_efpgMap, et -> ((GiantSide)et).getGiantStatus(), (et, vl) -> ((GiantSide)et).setGiantStatus((OptionalEntity<GiantStatus>)vl), "giantStatus");
        setupEfpg(_efpgMap, et -> ((GiantSide)et).getGiantSideSelf(), (et, vl) -> ((GiantSide)et).setGiantSideSelf((OptionalEntity<GiantSide>)vl), "giantSideSelf");
        setupEfpg(_efpgMap, et -> ((GiantSide)et).getMember(), (et, vl) -> ((GiantSide)et).setMember((OptionalEntity<Member>)vl), "member");
        setupEfpg(_efpgMap, et -> ((GiantSide)et).getProduct(), (et, vl) -> ((GiantSide)et).setProduct((OptionalEntity<Product>)vl), "product");
        setupEfpg(_efpgMap, et -> ((GiantSide)et).getPurchase(), (et, vl) -> ((GiantSide)et).setPurchase((OptionalEntity<Purchase>)vl), "purchase");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "giant_side";
    protected final String _tableDispName = "GIANT_SIDE";
    protected final String _tablePropertyName = "giantSide";
    protected final TableSqlName _tableSqlName = new TableSqlName("GIANT_SIDE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "simple Side of Giant";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnGiantSideId = cci("GIANT_SIDE_ID", "GIANT_SIDE_ID", null, null, Long.class, "giantSideId", null, true, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, "giantSideSelfList", null, false);
    protected final ColumnInfo _columnGiantId = cci("GIANT_ID", "GIANT_ID", null, "Giant ID (FK)", Long.class, "giantId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "giant", null, null, false);
    protected final ColumnInfo _columnGiantStatusCode = cci("GIANT_STATUS_CODE", "GIANT_STATUS_CODE", null, null, String.class, "giantStatusCode", null, false, false, true, "CHAR", 3, 0, null, null, false, null, null, "giantStatus", null, CDef.DefMeta.GiantStatus, false);
    protected final ColumnInfo _columnIndexString = cci("INDEX_STRING", "INDEX_STRING", null, null, String.class, "indexString", null, false, false, true, "VARCHAR", 64, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIndexInteger = cci("INDEX_INTEGER", "INDEX_INTEGER", null, null, Integer.class, "indexInteger", null, false, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIndexDate = cci("INDEX_DATE", "INDEX_DATE", null, null, java.time.LocalDate.class, "indexDate", null, false, false, true, "DATE", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIndexDatetime = cci("INDEX_DATETIME", "INDEX_DATETIME", null, null, java.time.LocalDateTime.class, "indexDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIndexBoolean = cci("INDEX_BOOLEAN", "INDEX_BOOLEAN", null, null, Boolean.class, "indexBoolean", null, false, false, true, "BIT", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNonIndexString = cci("NON_INDEX_STRING", "NON_INDEX_STRING", null, null, String.class, "nonIndexString", null, false, false, true, "VARCHAR", 64, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNonIndexInteger = cci("NON_INDEX_INTEGER", "NON_INDEX_INTEGER", null, null, Integer.class, "nonIndexInteger", null, false, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNonIndexDate = cci("NON_INDEX_DATE", "NON_INDEX_DATE", null, null, java.time.LocalDate.class, "nonIndexDate", null, false, false, true, "DATE", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNonIndexDatetime = cci("NON_INDEX_DATETIME", "NON_INDEX_DATETIME", null, null, java.time.LocalDateTime.class, "nonIndexDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNonIndexBoolean = cci("NON_INDEX_BOOLEAN", "NON_INDEX_BOOLEAN", null, null, Boolean.class, "nonIndexBoolean", null, false, false, true, "BIT", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNullableIndexString = cci("NULLABLE_INDEX_STRING", "NULLABLE_INDEX_STRING", null, null, String.class, "nullableIndexString", null, false, false, false, "VARCHAR", 64, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNullableIndexInteger = cci("NULLABLE_INDEX_INTEGER", "NULLABLE_INDEX_INTEGER", null, null, Integer.class, "nullableIndexInteger", null, false, false, false, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNullableIndexDate = cci("NULLABLE_INDEX_DATE", "NULLABLE_INDEX_DATE", null, null, java.time.LocalDate.class, "nullableIndexDate", null, false, false, false, "DATE", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNullableIndexDatetime = cci("NULLABLE_INDEX_DATETIME", "NULLABLE_INDEX_DATETIME", null, null, java.time.LocalDateTime.class, "nullableIndexDatetime", null, false, false, false, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNullableIndexBoolean = cci("NULLABLE_INDEX_BOOLEAN", "NULLABLE_INDEX_BOOLEAN", null, null, Boolean.class, "nullableIndexBoolean", null, false, false, false, "BIT", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSelfParentId = cci("SELF_PARENT_ID", "SELF_PARENT_ID", null, "Self Reference ID", Long.class, "selfParentId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "giantSideSelf", null, null, false);
    protected final ColumnInfo _columnUnique1stInteger = cci("UNIQUE_1ST_INTEGER", "UNIQUE_1ST_INTEGER", null, "Compound Unique First", Integer.class, "unique1stInteger", null, false, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnique2ndInteger = cci("UNIQUE_2ND_INTEGER", "UNIQUE_2ND_INTEGER", null, "Compound Unique Second", Integer.class, "unique2ndInteger", null, false, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnique3rdInteger = cci("UNIQUE_3RD_INTEGER", "UNIQUE_3RD_INTEGER", null, "Compound Unique Third", Integer.class, "unique3rdInteger", null, false, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnique4thInteger = cci("UNIQUE_4TH_INTEGER", "UNIQUE_4TH_INTEGER", null, "Compound Unique Fourth", Integer.class, "unique4thInteger", null, false, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUniqueString = cci("UNIQUE_STRING", "UNIQUE_STRING", null, null, String.class, "uniqueString", null, false, false, true, "VARCHAR", 64, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUniqueInteger = cci("UNIQUE_INTEGER", "UNIQUE_INTEGER", null, null, Integer.class, "uniqueInteger", null, false, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZoneMemberId = cci("ZONE_MEMBER_ID", "ZONE_MEMBER_ID", null, null, Integer.class, "zoneMemberId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "member", null, null, false);
    protected final ColumnInfo _columnZonePurchaseId = cci("ZONE_PURCHASE_ID", "ZONE_PURCHASE_ID", null, null, Long.class, "zonePurchaseId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "purchase", null, null, false);
    protected final ColumnInfo _columnZoneProductId = cci("ZONE_PRODUCT_ID", "ZONE_PRODUCT_ID", null, null, Integer.class, "zoneProductId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "product", null, null, false);

    /**
     * GIANT_SIDE_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGiantSideId() { return _columnGiantSideId; }
    /**
     * (Giant ID (FK))GIANT_ID: {UQ, IX+, NotNull, BIGINT(19), FK to giant}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGiantId() { return _columnGiantId; }
    /**
     * GIANT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to giant_status, classification=GiantStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGiantStatusCode() { return _columnGiantStatusCode; }
    /**
     * INDEX_STRING: {IX, NotNull, VARCHAR(64)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIndexString() { return _columnIndexString; }
    /**
     * INDEX_INTEGER: {IX+, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIndexInteger() { return _columnIndexInteger; }
    /**
     * INDEX_DATE: {IX, NotNull, DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIndexDate() { return _columnIndexDate; }
    /**
     * INDEX_DATETIME: {IX, NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIndexDatetime() { return _columnIndexDatetime; }
    /**
     * INDEX_BOOLEAN: {IX, NotNull, BIT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIndexBoolean() { return _columnIndexBoolean; }
    /**
     * NON_INDEX_STRING: {NotNull, VARCHAR(64)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNonIndexString() { return _columnNonIndexString; }
    /**
     * NON_INDEX_INTEGER: {NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNonIndexInteger() { return _columnNonIndexInteger; }
    /**
     * NON_INDEX_DATE: {NotNull, DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNonIndexDate() { return _columnNonIndexDate; }
    /**
     * NON_INDEX_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNonIndexDatetime() { return _columnNonIndexDatetime; }
    /**
     * NON_INDEX_BOOLEAN: {NotNull, BIT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNonIndexBoolean() { return _columnNonIndexBoolean; }
    /**
     * NULLABLE_INDEX_STRING: {IX, VARCHAR(64)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNullableIndexString() { return _columnNullableIndexString; }
    /**
     * NULLABLE_INDEX_INTEGER: {IX, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNullableIndexInteger() { return _columnNullableIndexInteger; }
    /**
     * NULLABLE_INDEX_DATE: {IX, DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNullableIndexDate() { return _columnNullableIndexDate; }
    /**
     * NULLABLE_INDEX_DATETIME: {IX, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNullableIndexDatetime() { return _columnNullableIndexDatetime; }
    /**
     * NULLABLE_INDEX_BOOLEAN: {IX, BIT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNullableIndexBoolean() { return _columnNullableIndexBoolean; }
    /**
     * (Self Reference ID)SELF_PARENT_ID: {IX, BIGINT(19), FK to giant_side}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSelfParentId() { return _columnSelfParentId; }
    /**
     * (Compound Unique First)UNIQUE_1ST_INTEGER: {UQ+, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnique1stInteger() { return _columnUnique1stInteger; }
    /**
     * (Compound Unique Second)UNIQUE_2ND_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnique2ndInteger() { return _columnUnique2ndInteger; }
    /**
     * (Compound Unique Third)UNIQUE_3RD_INTEGER: {+UQ, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnique3rdInteger() { return _columnUnique3rdInteger; }
    /**
     * (Compound Unique Fourth)UNIQUE_4TH_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnique4thInteger() { return _columnUnique4thInteger; }
    /**
     * UNIQUE_STRING: {UQ, NotNull, VARCHAR(64)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUniqueString() { return _columnUniqueString; }
    /**
     * UNIQUE_INTEGER: {UQ, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUniqueInteger() { return _columnUniqueInteger; }
    /**
     * ZONE_MEMBER_ID: {IX, NotNull, INT(10), FK to member}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZoneMemberId() { return _columnZoneMemberId; }
    /**
     * ZONE_PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZonePurchaseId() { return _columnZonePurchaseId; }
    /**
     * ZONE_PRODUCT_ID: {IX, NotNull, INT(10), FK to product}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZoneProductId() { return _columnZoneProductId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnGiantSideId());
        ls.add(columnGiantId());
        ls.add(columnGiantStatusCode());
        ls.add(columnIndexString());
        ls.add(columnIndexInteger());
        ls.add(columnIndexDate());
        ls.add(columnIndexDatetime());
        ls.add(columnIndexBoolean());
        ls.add(columnNonIndexString());
        ls.add(columnNonIndexInteger());
        ls.add(columnNonIndexDate());
        ls.add(columnNonIndexDatetime());
        ls.add(columnNonIndexBoolean());
        ls.add(columnNullableIndexString());
        ls.add(columnNullableIndexInteger());
        ls.add(columnNullableIndexDate());
        ls.add(columnNullableIndexDatetime());
        ls.add(columnNullableIndexBoolean());
        ls.add(columnSelfParentId());
        ls.add(columnUnique1stInteger());
        ls.add(columnUnique2ndInteger());
        ls.add(columnUnique3rdInteger());
        ls.add(columnUnique4thInteger());
        ls.add(columnUniqueString());
        ls.add(columnUniqueInteger());
        ls.add(columnZoneMemberId());
        ls.add(columnZonePurchaseId());
        ls.add(columnZoneProductId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnGiantSideId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOfGiantId() { return hpcui(columnGiantId()); }
    public UniqueInfo uniqueOfUnique1stIntegerUnique2ndIntegerUnique3rdIntegerUnique4thInteger() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnUnique1stInteger());
        ls.add(columnUnique2ndInteger());
        ls.add(columnUnique3rdInteger());
        ls.add(columnUnique4thInteger());
        return hpcui(ls);
    }
    public UniqueInfo uniqueOfUniqueInteger() { return hpcui(columnUniqueInteger()); }
    public UniqueInfo uniqueOfUniqueString() { return hpcui(columnUniqueString()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * (Giant as base point)GIANT by my GIANT_ID, named 'giant'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignGiant() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGiantId(), GiantDbm.getInstance().columnGiantId());
        return cfi("FK_GIANT_SIDE_GIANT", "giant", this, GiantDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, true, false, false, false, null, null, false, "giantSideAsOne", false);
    }
    /**
     * (Status of Giant)GIANT_STATUS by my GIANT_STATUS_CODE, named 'giantStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignGiantStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGiantStatusCode(), GiantStatusDbm.getInstance().columnGiantStatusCode());
        return cfi("FK_GIANT_SIDE_GIANT_STATUS", "giantStatus", this, GiantStatusDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "giantSideList", false);
    }
    /**
     * (simple Side of Giant)GIANT_SIDE by my SELF_PARENT_ID, named 'giantSideSelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignGiantSideSelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSelfParentId(), GiantSideDbm.getInstance().columnGiantSideId());
        return cfi("FK_GIANT_SIDE_SELF", "giantSideSelf", this, GiantSideDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "giantSideSelfList", false);
    }
    /**
     * (会員)MEMBER by my ZONE_MEMBER_ID, named 'member'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnZoneMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("FK_GIANT_SIDE_ZONE_MEMBER", "member", this, MemberDbm.getInstance(), mp, 3, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "giantSideList", false);
    }
    /**
     * (商品)PRODUCT by my ZONE_PRODUCT_ID, named 'product'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnZoneProductId(), ProductDbm.getInstance().columnProductId());
        return cfi("FK_GIANT_SIDE_ZONE_PRODUCT", "product", this, ProductDbm.getInstance(), mp, 4, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "giantSideList", false);
    }
    /**
     * (購入)PURCHASE by my ZONE_PURCHASE_ID, named 'purchase'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPurchase() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnZonePurchaseId(), PurchaseDbm.getInstance().columnPurchaseId());
        return cfi("FK_GIANT_SIDE_ZONE_PURCHASE", "purchase", this, PurchaseDbm.getInstance(), mp, 5, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "giantSideList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (simple Side of Giant)GIANT_SIDE by SELF_PARENT_ID, named 'giantSideSelfList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerGiantSideSelfList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGiantSideId(), GiantSideDbm.getInstance().columnSelfParentId());
        return cri("FK_GIANT_SIDE_SELF", "giantSideSelfList", this, GiantSideDbm.getInstance(), mp, false, "giantSideSelf");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.dbflute.exentity.GiantSide"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.dbflute.cbean.GiantSideCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.dbflute.exbhv.GiantSideBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<GiantSide> getEntityType() { return GiantSide.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public GiantSide newEntity() { return new GiantSide(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((GiantSide)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((GiantSide)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
