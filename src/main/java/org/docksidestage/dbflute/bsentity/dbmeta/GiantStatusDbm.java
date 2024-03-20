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
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.dbflute.allcommon.*;
import org.docksidestage.dbflute.exentity.*;

/**
 * The DB meta of giant_status. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class GiantStatusDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final GiantStatusDbm _instance = new GiantStatusDbm();
    private GiantStatusDbm() {}
    public static GiantStatusDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((GiantStatus)et).getGiantStatusCode(), (et, vl) -> {
            CDef.GiantStatus cls = (CDef.GiantStatus)gcls(et, columnGiantStatusCode(), vl);
            if (cls != null) {
                ((GiantStatus)et).setGiantStatusCodeAsGiantStatus(cls);
            } else {
                ((GiantStatus)et).mynativeMappingGiantStatusCode((String)vl);
            }
        }, "giantStatusCode");
        setupEpg(_epgMap, et -> ((GiantStatus)et).getGiantStatusName(), (et, vl) -> ((GiantStatus)et).setGiantStatusName((String)vl), "giantStatusName");
        setupEpg(_epgMap, et -> ((GiantStatus)et).getDisplayOrder(), (et, vl) -> ((GiantStatus)et).setDisplayOrder(cti(vl)), "displayOrder");
        setupEpg(_epgMap, et -> ((GiantStatus)et).getDescription(), (et, vl) -> ((GiantStatus)et).setDescription((String)vl), "description");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "giant_status";
    protected final String _tableDispName = "GIANT_STATUS";
    protected final String _tablePropertyName = "giantStatus";
    protected final TableSqlName _tableSqlName = new TableSqlName("GIANT_STATUS", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "Status of Giant";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnGiantStatusCode = cci("GIANT_STATUS_CODE", "GIANT_STATUS_CODE", null, null, String.class, "giantStatusCode", null, true, false, true, "CHAR", 3, 0, null, null, false, null, null, null, "giantList,giantRefList,giantSideList", CDef.DefMeta.GiantStatus, false);
    protected final ColumnInfo _columnGiantStatusName = cci("GIANT_STATUS_NAME", "GIANT_STATUS_NAME", null, null, String.class, "giantStatusName", null, false, false, true, "VARCHAR", 64, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDisplayOrder = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, null, Integer.class, "displayOrder", null, false, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDescription = cci("DESCRIPTION", "DESCRIPTION", null, null, String.class, "description", null, false, false, true, "VARCHAR", 128, 0, null, null, false, null, null, null, null, null, false);

    /**
     * GIANT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=GiantStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGiantStatusCode() { return _columnGiantStatusCode; }
    /**
     * GIANT_STATUS_NAME: {NotNull, VARCHAR(64)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGiantStatusName() { return _columnGiantStatusName; }
    /**
     * DISPLAY_ORDER: {NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }
    /**
     * DESCRIPTION: {NotNull, VARCHAR(128)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDescription() { return _columnDescription; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnGiantStatusCode());
        ls.add(columnGiantStatusName());
        ls.add(columnDisplayOrder());
        ls.add(columnDescription());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnGiantStatusCode()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (Giant as base point)GIANT by GIANT_STATUS_CODE, named 'giantList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerGiantList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGiantStatusCode(), GiantDbm.getInstance().columnGiantStatusCode());
        return cri("FK_GIANT_GIANT_STATUS", "giantList", this, GiantDbm.getInstance(), mp, false, "giantStatus");
    }
    /**
     * (Referrer of Giant)GIANT_REF by GIANT_STATUS_CODE, named 'giantRefList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerGiantRefList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGiantStatusCode(), GiantRefDbm.getInstance().columnGiantStatusCode());
        return cri("FK_GIANT_REF_GIANT_STATUS", "giantRefList", this, GiantRefDbm.getInstance(), mp, false, "giantStatus");
    }
    /**
     * (simple Side of Giant)GIANT_SIDE by GIANT_STATUS_CODE, named 'giantSideList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerGiantSideList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGiantStatusCode(), GiantSideDbm.getInstance().columnGiantStatusCode());
        return cri("FK_GIANT_SIDE_GIANT_STATUS", "giantSideList", this, GiantSideDbm.getInstance(), mp, false, "giantStatus");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.dbflute.exentity.GiantStatus"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.dbflute.cbean.GiantStatusCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.dbflute.exbhv.GiantStatusBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<GiantStatus> getEntityType() { return GiantStatus.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public GiantStatus newEntity() { return new GiantStatus(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((GiantStatus)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((GiantStatus)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
