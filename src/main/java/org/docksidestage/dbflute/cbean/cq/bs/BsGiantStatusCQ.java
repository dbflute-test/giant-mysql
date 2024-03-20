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
package org.docksidestage.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.dbflute.cbean.cq.ciq.*;
import org.docksidestage.dbflute.cbean.*;
import org.docksidestage.dbflute.cbean.cq.*;

/**
 * The base condition-query of giant_status.
 * @author DBFlute(AutoGenerator)
 */
public class BsGiantStatusCQ extends AbstractBsGiantStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected GiantStatusCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsGiantStatusCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from giant_status) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public GiantStatusCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected GiantStatusCIQ xcreateCIQ() {
        GiantStatusCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected GiantStatusCIQ xnewCIQ() {
        return new GiantStatusCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join giant_status on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public GiantStatusCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        GiantStatusCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _giantStatusCode;
    public ConditionValue xdfgetGiantStatusCode()
    { if (_giantStatusCode == null) { _giantStatusCode = nCV(); }
      return _giantStatusCode; }
    protected ConditionValue xgetCValueGiantStatusCode() { return xdfgetGiantStatusCode(); }

    public Map<String, GiantCQ> xdfgetGiantStatusCode_ExistsReferrer_GiantList() { return xgetSQueMap("giantStatusCode_ExistsReferrer_GiantList"); }
    public String keepGiantStatusCode_ExistsReferrer_GiantList(GiantCQ sq) { return xkeepSQue("giantStatusCode_ExistsReferrer_GiantList", sq); }

    public Map<String, GiantRefCQ> xdfgetGiantStatusCode_ExistsReferrer_GiantRefList() { return xgetSQueMap("giantStatusCode_ExistsReferrer_GiantRefList"); }
    public String keepGiantStatusCode_ExistsReferrer_GiantRefList(GiantRefCQ sq) { return xkeepSQue("giantStatusCode_ExistsReferrer_GiantRefList", sq); }

    public Map<String, GiantSideCQ> xdfgetGiantStatusCode_ExistsReferrer_GiantSideList() { return xgetSQueMap("giantStatusCode_ExistsReferrer_GiantSideList"); }
    public String keepGiantStatusCode_ExistsReferrer_GiantSideList(GiantSideCQ sq) { return xkeepSQue("giantStatusCode_ExistsReferrer_GiantSideList", sq); }

    public Map<String, GiantCQ> xdfgetGiantStatusCode_NotExistsReferrer_GiantList() { return xgetSQueMap("giantStatusCode_NotExistsReferrer_GiantList"); }
    public String keepGiantStatusCode_NotExistsReferrer_GiantList(GiantCQ sq) { return xkeepSQue("giantStatusCode_NotExistsReferrer_GiantList", sq); }

    public Map<String, GiantRefCQ> xdfgetGiantStatusCode_NotExistsReferrer_GiantRefList() { return xgetSQueMap("giantStatusCode_NotExistsReferrer_GiantRefList"); }
    public String keepGiantStatusCode_NotExistsReferrer_GiantRefList(GiantRefCQ sq) { return xkeepSQue("giantStatusCode_NotExistsReferrer_GiantRefList", sq); }

    public Map<String, GiantSideCQ> xdfgetGiantStatusCode_NotExistsReferrer_GiantSideList() { return xgetSQueMap("giantStatusCode_NotExistsReferrer_GiantSideList"); }
    public String keepGiantStatusCode_NotExistsReferrer_GiantSideList(GiantSideCQ sq) { return xkeepSQue("giantStatusCode_NotExistsReferrer_GiantSideList", sq); }

    public Map<String, GiantCQ> xdfgetGiantStatusCode_SpecifyDerivedReferrer_GiantList() { return xgetSQueMap("giantStatusCode_SpecifyDerivedReferrer_GiantList"); }
    public String keepGiantStatusCode_SpecifyDerivedReferrer_GiantList(GiantCQ sq) { return xkeepSQue("giantStatusCode_SpecifyDerivedReferrer_GiantList", sq); }

    public Map<String, GiantRefCQ> xdfgetGiantStatusCode_SpecifyDerivedReferrer_GiantRefList() { return xgetSQueMap("giantStatusCode_SpecifyDerivedReferrer_GiantRefList"); }
    public String keepGiantStatusCode_SpecifyDerivedReferrer_GiantRefList(GiantRefCQ sq) { return xkeepSQue("giantStatusCode_SpecifyDerivedReferrer_GiantRefList", sq); }

    public Map<String, GiantSideCQ> xdfgetGiantStatusCode_SpecifyDerivedReferrer_GiantSideList() { return xgetSQueMap("giantStatusCode_SpecifyDerivedReferrer_GiantSideList"); }
    public String keepGiantStatusCode_SpecifyDerivedReferrer_GiantSideList(GiantSideCQ sq) { return xkeepSQue("giantStatusCode_SpecifyDerivedReferrer_GiantSideList", sq); }

    public Map<String, GiantCQ> xdfgetGiantStatusCode_QueryDerivedReferrer_GiantList() { return xgetSQueMap("giantStatusCode_QueryDerivedReferrer_GiantList"); }
    public String keepGiantStatusCode_QueryDerivedReferrer_GiantList(GiantCQ sq) { return xkeepSQue("giantStatusCode_QueryDerivedReferrer_GiantList", sq); }
    public Map<String, Object> xdfgetGiantStatusCode_QueryDerivedReferrer_GiantListParameter() { return xgetSQuePmMap("giantStatusCode_QueryDerivedReferrer_GiantList"); }
    public String keepGiantStatusCode_QueryDerivedReferrer_GiantListParameter(Object pm) { return xkeepSQuePm("giantStatusCode_QueryDerivedReferrer_GiantList", pm); }

    public Map<String, GiantRefCQ> xdfgetGiantStatusCode_QueryDerivedReferrer_GiantRefList() { return xgetSQueMap("giantStatusCode_QueryDerivedReferrer_GiantRefList"); }
    public String keepGiantStatusCode_QueryDerivedReferrer_GiantRefList(GiantRefCQ sq) { return xkeepSQue("giantStatusCode_QueryDerivedReferrer_GiantRefList", sq); }
    public Map<String, Object> xdfgetGiantStatusCode_QueryDerivedReferrer_GiantRefListParameter() { return xgetSQuePmMap("giantStatusCode_QueryDerivedReferrer_GiantRefList"); }
    public String keepGiantStatusCode_QueryDerivedReferrer_GiantRefListParameter(Object pm) { return xkeepSQuePm("giantStatusCode_QueryDerivedReferrer_GiantRefList", pm); }

    public Map<String, GiantSideCQ> xdfgetGiantStatusCode_QueryDerivedReferrer_GiantSideList() { return xgetSQueMap("giantStatusCode_QueryDerivedReferrer_GiantSideList"); }
    public String keepGiantStatusCode_QueryDerivedReferrer_GiantSideList(GiantSideCQ sq) { return xkeepSQue("giantStatusCode_QueryDerivedReferrer_GiantSideList", sq); }
    public Map<String, Object> xdfgetGiantStatusCode_QueryDerivedReferrer_GiantSideListParameter() { return xgetSQuePmMap("giantStatusCode_QueryDerivedReferrer_GiantSideList"); }
    public String keepGiantStatusCode_QueryDerivedReferrer_GiantSideListParameter(Object pm) { return xkeepSQuePm("giantStatusCode_QueryDerivedReferrer_GiantSideList", pm); }

    /**
     * Add order-by as ascend. <br>
     * GIANT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=GiantStatus}
     * @return this. (NotNull)
     */
    public BsGiantStatusCQ addOrderBy_GiantStatusCode_Asc() { regOBA("GIANT_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * GIANT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=GiantStatus}
     * @return this. (NotNull)
     */
    public BsGiantStatusCQ addOrderBy_GiantStatusCode_Desc() { regOBD("GIANT_STATUS_CODE"); return this; }

    protected ConditionValue _giantStatusName;
    public ConditionValue xdfgetGiantStatusName()
    { if (_giantStatusName == null) { _giantStatusName = nCV(); }
      return _giantStatusName; }
    protected ConditionValue xgetCValueGiantStatusName() { return xdfgetGiantStatusName(); }

    /**
     * Add order-by as ascend. <br>
     * GIANT_STATUS_NAME: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsGiantStatusCQ addOrderBy_GiantStatusName_Asc() { regOBA("GIANT_STATUS_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * GIANT_STATUS_NAME: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsGiantStatusCQ addOrderBy_GiantStatusName_Desc() { regOBD("GIANT_STATUS_NAME"); return this; }

    protected ConditionValue _displayOrder;
    public ConditionValue xdfgetDisplayOrder()
    { if (_displayOrder == null) { _displayOrder = nCV(); }
      return _displayOrder; }
    protected ConditionValue xgetCValueDisplayOrder() { return xdfgetDisplayOrder(); }

    /**
     * Add order-by as ascend. <br>
     * DISPLAY_ORDER: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantStatusCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * DISPLAY_ORDER: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantStatusCQ addOrderBy_DisplayOrder_Desc() { regOBD("DISPLAY_ORDER"); return this; }

    protected ConditionValue _description;
    public ConditionValue xdfgetDescription()
    { if (_description == null) { _description = nCV(); }
      return _description; }
    protected ConditionValue xgetCValueDescription() { return xdfgetDescription(); }

    /**
     * Add order-by as ascend. <br>
     * DESCRIPTION: {NotNull, VARCHAR(128)}
     * @return this. (NotNull)
     */
    public BsGiantStatusCQ addOrderBy_Description_Asc() { regOBA("DESCRIPTION"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESCRIPTION: {NotNull, VARCHAR(128)}
     * @return this. (NotNull)
     */
    public BsGiantStatusCQ addOrderBy_Description_Desc() { regOBD("DESCRIPTION"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsGiantStatusCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsGiantStatusCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, GiantStatusCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(GiantStatusCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, GiantStatusCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(GiantStatusCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, GiantStatusCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(GiantStatusCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, GiantStatusCQ> _myselfExistsMap;
    public Map<String, GiantStatusCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(GiantStatusCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, GiantStatusCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(GiantStatusCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return GiantStatusCB.class.getName(); }
    protected String xCQ() { return GiantStatusCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
