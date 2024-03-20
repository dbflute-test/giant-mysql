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
 * The base condition-query of giant.
 * @author DBFlute(AutoGenerator)
 */
public class BsGiantCQ extends AbstractBsGiantCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected GiantCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsGiantCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from giant) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public GiantCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected GiantCIQ xcreateCIQ() {
        GiantCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected GiantCIQ xnewCIQ() {
        return new GiantCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join giant on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public GiantCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        GiantCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _giantId;
    public ConditionValue xdfgetGiantId()
    { if (_giantId == null) { _giantId = nCV(); }
      return _giantId; }
    protected ConditionValue xgetCValueGiantId() { return xdfgetGiantId(); }

    public Map<String, GiantCQ> xdfgetGiantId_ExistsReferrer_GiantSelfList() { return xgetSQueMap("giantId_ExistsReferrer_GiantSelfList"); }
    public String keepGiantId_ExistsReferrer_GiantSelfList(GiantCQ sq) { return xkeepSQue("giantId_ExistsReferrer_GiantSelfList", sq); }

    public Map<String, GiantRefCQ> xdfgetGiantId_ExistsReferrer_GiantRefList() { return xgetSQueMap("giantId_ExistsReferrer_GiantRefList"); }
    public String keepGiantId_ExistsReferrer_GiantRefList(GiantRefCQ sq) { return xkeepSQue("giantId_ExistsReferrer_GiantRefList", sq); }

    public Map<String, GiantCQ> xdfgetGiantId_NotExistsReferrer_GiantSelfList() { return xgetSQueMap("giantId_NotExistsReferrer_GiantSelfList"); }
    public String keepGiantId_NotExistsReferrer_GiantSelfList(GiantCQ sq) { return xkeepSQue("giantId_NotExistsReferrer_GiantSelfList", sq); }

    public Map<String, GiantRefCQ> xdfgetGiantId_NotExistsReferrer_GiantRefList() { return xgetSQueMap("giantId_NotExistsReferrer_GiantRefList"); }
    public String keepGiantId_NotExistsReferrer_GiantRefList(GiantRefCQ sq) { return xkeepSQue("giantId_NotExistsReferrer_GiantRefList", sq); }

    public Map<String, GiantCQ> xdfgetGiantId_SpecifyDerivedReferrer_GiantSelfList() { return xgetSQueMap("giantId_SpecifyDerivedReferrer_GiantSelfList"); }
    public String keepGiantId_SpecifyDerivedReferrer_GiantSelfList(GiantCQ sq) { return xkeepSQue("giantId_SpecifyDerivedReferrer_GiantSelfList", sq); }

    public Map<String, GiantRefCQ> xdfgetGiantId_SpecifyDerivedReferrer_GiantRefList() { return xgetSQueMap("giantId_SpecifyDerivedReferrer_GiantRefList"); }
    public String keepGiantId_SpecifyDerivedReferrer_GiantRefList(GiantRefCQ sq) { return xkeepSQue("giantId_SpecifyDerivedReferrer_GiantRefList", sq); }

    public Map<String, GiantCQ> xdfgetGiantId_QueryDerivedReferrer_GiantSelfList() { return xgetSQueMap("giantId_QueryDerivedReferrer_GiantSelfList"); }
    public String keepGiantId_QueryDerivedReferrer_GiantSelfList(GiantCQ sq) { return xkeepSQue("giantId_QueryDerivedReferrer_GiantSelfList", sq); }
    public Map<String, Object> xdfgetGiantId_QueryDerivedReferrer_GiantSelfListParameter() { return xgetSQuePmMap("giantId_QueryDerivedReferrer_GiantSelfList"); }
    public String keepGiantId_QueryDerivedReferrer_GiantSelfListParameter(Object pm) { return xkeepSQuePm("giantId_QueryDerivedReferrer_GiantSelfList", pm); }

    public Map<String, GiantRefCQ> xdfgetGiantId_QueryDerivedReferrer_GiantRefList() { return xgetSQueMap("giantId_QueryDerivedReferrer_GiantRefList"); }
    public String keepGiantId_QueryDerivedReferrer_GiantRefList(GiantRefCQ sq) { return xkeepSQue("giantId_QueryDerivedReferrer_GiantRefList", sq); }
    public Map<String, Object> xdfgetGiantId_QueryDerivedReferrer_GiantRefListParameter() { return xgetSQuePmMap("giantId_QueryDerivedReferrer_GiantRefList"); }
    public String keepGiantId_QueryDerivedReferrer_GiantRefListParameter(Object pm) { return xkeepSQuePm("giantId_QueryDerivedReferrer_GiantRefList", pm); }

    /**
     * Add order-by as ascend. <br>
     * GIANT_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_GiantId_Asc() { regOBA("GIANT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * GIANT_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_GiantId_Desc() { regOBD("GIANT_ID"); return this; }

    protected ConditionValue _giantStatusCode;
    public ConditionValue xdfgetGiantStatusCode()
    { if (_giantStatusCode == null) { _giantStatusCode = nCV(); }
      return _giantStatusCode; }
    protected ConditionValue xgetCValueGiantStatusCode() { return xdfgetGiantStatusCode(); }

    /**
     * Add order-by as ascend. <br>
     * GIANT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to giant_status, classification=GiantStatus}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_GiantStatusCode_Asc() { regOBA("GIANT_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * GIANT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to giant_status, classification=GiantStatus}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_GiantStatusCode_Desc() { regOBD("GIANT_STATUS_CODE"); return this; }

    protected ConditionValue _indexString;
    public ConditionValue xdfgetIndexString()
    { if (_indexString == null) { _indexString = nCV(); }
      return _indexString; }
    protected ConditionValue xgetCValueIndexString() { return xdfgetIndexString(); }

    /**
     * Add order-by as ascend. <br>
     * INDEX_STRING: {IX, NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_IndexString_Asc() { regOBA("INDEX_STRING"); return this; }

    /**
     * Add order-by as descend. <br>
     * INDEX_STRING: {IX, NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_IndexString_Desc() { regOBD("INDEX_STRING"); return this; }

    protected ConditionValue _indexInteger;
    public ConditionValue xdfgetIndexInteger()
    { if (_indexInteger == null) { _indexInteger = nCV(); }
      return _indexInteger; }
    protected ConditionValue xgetCValueIndexInteger() { return xdfgetIndexInteger(); }

    /**
     * Add order-by as ascend. <br>
     * INDEX_INTEGER: {IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_IndexInteger_Asc() { regOBA("INDEX_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * INDEX_INTEGER: {IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_IndexInteger_Desc() { regOBD("INDEX_INTEGER"); return this; }

    protected ConditionValue _indexDate;
    public ConditionValue xdfgetIndexDate()
    { if (_indexDate == null) { _indexDate = nCV(); }
      return _indexDate; }
    protected ConditionValue xgetCValueIndexDate() { return xdfgetIndexDate(); }

    /**
     * Add order-by as ascend. <br>
     * INDEX_DATE: {IX, NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_IndexDate_Asc() { regOBA("INDEX_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * INDEX_DATE: {IX, NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_IndexDate_Desc() { regOBD("INDEX_DATE"); return this; }

    protected ConditionValue _indexDatetime;
    public ConditionValue xdfgetIndexDatetime()
    { if (_indexDatetime == null) { _indexDatetime = nCV(); }
      return _indexDatetime; }
    protected ConditionValue xgetCValueIndexDatetime() { return xdfgetIndexDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * INDEX_DATETIME: {IX, NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_IndexDatetime_Asc() { regOBA("INDEX_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * INDEX_DATETIME: {IX, NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_IndexDatetime_Desc() { regOBD("INDEX_DATETIME"); return this; }

    protected ConditionValue _indexBoolean;
    public ConditionValue xdfgetIndexBoolean()
    { if (_indexBoolean == null) { _indexBoolean = nCV(); }
      return _indexBoolean; }
    protected ConditionValue xgetCValueIndexBoolean() { return xdfgetIndexBoolean(); }

    /**
     * Add order-by as ascend. <br>
     * INDEX_BOOLEAN: {IX, NotNull, BIT}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_IndexBoolean_Asc() { regOBA("INDEX_BOOLEAN"); return this; }

    /**
     * Add order-by as descend. <br>
     * INDEX_BOOLEAN: {IX, NotNull, BIT}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_IndexBoolean_Desc() { regOBD("INDEX_BOOLEAN"); return this; }

    protected ConditionValue _nonIndexString;
    public ConditionValue xdfgetNonIndexString()
    { if (_nonIndexString == null) { _nonIndexString = nCV(); }
      return _nonIndexString; }
    protected ConditionValue xgetCValueNonIndexString() { return xdfgetNonIndexString(); }

    /**
     * Add order-by as ascend. <br>
     * NON_INDEX_STRING: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_NonIndexString_Asc() { regOBA("NON_INDEX_STRING"); return this; }

    /**
     * Add order-by as descend. <br>
     * NON_INDEX_STRING: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_NonIndexString_Desc() { regOBD("NON_INDEX_STRING"); return this; }

    protected ConditionValue _nonIndexInteger;
    public ConditionValue xdfgetNonIndexInteger()
    { if (_nonIndexInteger == null) { _nonIndexInteger = nCV(); }
      return _nonIndexInteger; }
    protected ConditionValue xgetCValueNonIndexInteger() { return xdfgetNonIndexInteger(); }

    /**
     * Add order-by as ascend. <br>
     * NON_INDEX_INTEGER: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_NonIndexInteger_Asc() { regOBA("NON_INDEX_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * NON_INDEX_INTEGER: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_NonIndexInteger_Desc() { regOBD("NON_INDEX_INTEGER"); return this; }

    protected ConditionValue _nonIndexDate;
    public ConditionValue xdfgetNonIndexDate()
    { if (_nonIndexDate == null) { _nonIndexDate = nCV(); }
      return _nonIndexDate; }
    protected ConditionValue xgetCValueNonIndexDate() { return xdfgetNonIndexDate(); }

    /**
     * Add order-by as ascend. <br>
     * NON_INDEX_DATE: {NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_NonIndexDate_Asc() { regOBA("NON_INDEX_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * NON_INDEX_DATE: {NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_NonIndexDate_Desc() { regOBD("NON_INDEX_DATE"); return this; }

    protected ConditionValue _nonIndexDatetime;
    public ConditionValue xdfgetNonIndexDatetime()
    { if (_nonIndexDatetime == null) { _nonIndexDatetime = nCV(); }
      return _nonIndexDatetime; }
    protected ConditionValue xgetCValueNonIndexDatetime() { return xdfgetNonIndexDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * NON_INDEX_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_NonIndexDatetime_Asc() { regOBA("NON_INDEX_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * NON_INDEX_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_NonIndexDatetime_Desc() { regOBD("NON_INDEX_DATETIME"); return this; }

    protected ConditionValue _nonIndexBoolean;
    public ConditionValue xdfgetNonIndexBoolean()
    { if (_nonIndexBoolean == null) { _nonIndexBoolean = nCV(); }
      return _nonIndexBoolean; }
    protected ConditionValue xgetCValueNonIndexBoolean() { return xdfgetNonIndexBoolean(); }

    /**
     * Add order-by as ascend. <br>
     * NON_INDEX_BOOLEAN: {NotNull, BIT}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_NonIndexBoolean_Asc() { regOBA("NON_INDEX_BOOLEAN"); return this; }

    /**
     * Add order-by as descend. <br>
     * NON_INDEX_BOOLEAN: {NotNull, BIT}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_NonIndexBoolean_Desc() { regOBD("NON_INDEX_BOOLEAN"); return this; }

    protected ConditionValue _nullableIndexString;
    public ConditionValue xdfgetNullableIndexString()
    { if (_nullableIndexString == null) { _nullableIndexString = nCV(); }
      return _nullableIndexString; }
    protected ConditionValue xgetCValueNullableIndexString() { return xdfgetNullableIndexString(); }

    /**
     * Add order-by as ascend. <br>
     * NULLABLE_INDEX_STRING: {IX, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_NullableIndexString_Asc() { regOBA("NULLABLE_INDEX_STRING"); return this; }

    /**
     * Add order-by as descend. <br>
     * NULLABLE_INDEX_STRING: {IX, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_NullableIndexString_Desc() { regOBD("NULLABLE_INDEX_STRING"); return this; }

    protected ConditionValue _nullableIndexInteger;
    public ConditionValue xdfgetNullableIndexInteger()
    { if (_nullableIndexInteger == null) { _nullableIndexInteger = nCV(); }
      return _nullableIndexInteger; }
    protected ConditionValue xgetCValueNullableIndexInteger() { return xdfgetNullableIndexInteger(); }

    /**
     * Add order-by as ascend. <br>
     * NULLABLE_INDEX_INTEGER: {IX, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_NullableIndexInteger_Asc() { regOBA("NULLABLE_INDEX_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * NULLABLE_INDEX_INTEGER: {IX, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_NullableIndexInteger_Desc() { regOBD("NULLABLE_INDEX_INTEGER"); return this; }

    protected ConditionValue _nullableIndexDate;
    public ConditionValue xdfgetNullableIndexDate()
    { if (_nullableIndexDate == null) { _nullableIndexDate = nCV(); }
      return _nullableIndexDate; }
    protected ConditionValue xgetCValueNullableIndexDate() { return xdfgetNullableIndexDate(); }

    /**
     * Add order-by as ascend. <br>
     * NULLABLE_INDEX_DATE: {IX, DATE(10)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_NullableIndexDate_Asc() { regOBA("NULLABLE_INDEX_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * NULLABLE_INDEX_DATE: {IX, DATE(10)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_NullableIndexDate_Desc() { regOBD("NULLABLE_INDEX_DATE"); return this; }

    protected ConditionValue _nullableIndexDatetime;
    public ConditionValue xdfgetNullableIndexDatetime()
    { if (_nullableIndexDatetime == null) { _nullableIndexDatetime = nCV(); }
      return _nullableIndexDatetime; }
    protected ConditionValue xgetCValueNullableIndexDatetime() { return xdfgetNullableIndexDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * NULLABLE_INDEX_DATETIME: {IX, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_NullableIndexDatetime_Asc() { regOBA("NULLABLE_INDEX_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * NULLABLE_INDEX_DATETIME: {IX, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_NullableIndexDatetime_Desc() { regOBD("NULLABLE_INDEX_DATETIME"); return this; }

    protected ConditionValue _nullableIndexBoolean;
    public ConditionValue xdfgetNullableIndexBoolean()
    { if (_nullableIndexBoolean == null) { _nullableIndexBoolean = nCV(); }
      return _nullableIndexBoolean; }
    protected ConditionValue xgetCValueNullableIndexBoolean() { return xdfgetNullableIndexBoolean(); }

    /**
     * Add order-by as ascend. <br>
     * NULLABLE_INDEX_BOOLEAN: {IX, BIT}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_NullableIndexBoolean_Asc() { regOBA("NULLABLE_INDEX_BOOLEAN"); return this; }

    /**
     * Add order-by as descend. <br>
     * NULLABLE_INDEX_BOOLEAN: {IX, BIT}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_NullableIndexBoolean_Desc() { regOBD("NULLABLE_INDEX_BOOLEAN"); return this; }

    protected ConditionValue _selfParentId;
    public ConditionValue xdfgetSelfParentId()
    { if (_selfParentId == null) { _selfParentId = nCV(); }
      return _selfParentId; }
    protected ConditionValue xgetCValueSelfParentId() { return xdfgetSelfParentId(); }

    /**
     * Add order-by as ascend. <br>
     * (Self Reference ID)SELF_PARENT_ID: {IX, BIGINT(19), FK to giant}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_SelfParentId_Asc() { regOBA("SELF_PARENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (Self Reference ID)SELF_PARENT_ID: {IX, BIGINT(19), FK to giant}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_SelfParentId_Desc() { regOBD("SELF_PARENT_ID"); return this; }

    protected ConditionValue _unique1stInteger;
    public ConditionValue xdfgetUnique1stInteger()
    { if (_unique1stInteger == null) { _unique1stInteger = nCV(); }
      return _unique1stInteger; }
    protected ConditionValue xgetCValueUnique1stInteger() { return xdfgetUnique1stInteger(); }

    /**
     * Add order-by as ascend. <br>
     * (Compound Unique First)UNIQUE_1ST_INTEGER: {UQ+, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_Unique1stInteger_Asc() { regOBA("UNIQUE_1ST_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (Compound Unique First)UNIQUE_1ST_INTEGER: {UQ+, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_Unique1stInteger_Desc() { regOBD("UNIQUE_1ST_INTEGER"); return this; }

    protected ConditionValue _unique2ndInteger;
    public ConditionValue xdfgetUnique2ndInteger()
    { if (_unique2ndInteger == null) { _unique2ndInteger = nCV(); }
      return _unique2ndInteger; }
    protected ConditionValue xgetCValueUnique2ndInteger() { return xdfgetUnique2ndInteger(); }

    /**
     * Add order-by as ascend. <br>
     * (Compound Unique Second)UNIQUE_2ND_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_Unique2ndInteger_Asc() { regOBA("UNIQUE_2ND_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (Compound Unique Second)UNIQUE_2ND_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_Unique2ndInteger_Desc() { regOBD("UNIQUE_2ND_INTEGER"); return this; }

    protected ConditionValue _unique3rdInteger;
    public ConditionValue xdfgetUnique3rdInteger()
    { if (_unique3rdInteger == null) { _unique3rdInteger = nCV(); }
      return _unique3rdInteger; }
    protected ConditionValue xgetCValueUnique3rdInteger() { return xdfgetUnique3rdInteger(); }

    /**
     * Add order-by as ascend. <br>
     * (Compound Unique Third)UNIQUE_3RD_INTEGER: {+UQ, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_Unique3rdInteger_Asc() { regOBA("UNIQUE_3RD_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (Compound Unique Third)UNIQUE_3RD_INTEGER: {+UQ, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_Unique3rdInteger_Desc() { regOBD("UNIQUE_3RD_INTEGER"); return this; }

    protected ConditionValue _unique4thInteger;
    public ConditionValue xdfgetUnique4thInteger()
    { if (_unique4thInteger == null) { _unique4thInteger = nCV(); }
      return _unique4thInteger; }
    protected ConditionValue xgetCValueUnique4thInteger() { return xdfgetUnique4thInteger(); }

    /**
     * Add order-by as ascend. <br>
     * (Compound Unique Fourth)UNIQUE_4TH_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_Unique4thInteger_Asc() { regOBA("UNIQUE_4TH_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (Compound Unique Fourth)UNIQUE_4TH_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_Unique4thInteger_Desc() { regOBD("UNIQUE_4TH_INTEGER"); return this; }

    protected ConditionValue _uniqueString;
    public ConditionValue xdfgetUniqueString()
    { if (_uniqueString == null) { _uniqueString = nCV(); }
      return _uniqueString; }
    protected ConditionValue xgetCValueUniqueString() { return xdfgetUniqueString(); }

    /**
     * Add order-by as ascend. <br>
     * UNIQUE_STRING: {UQ, NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_UniqueString_Asc() { regOBA("UNIQUE_STRING"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIQUE_STRING: {UQ, NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_UniqueString_Desc() { regOBD("UNIQUE_STRING"); return this; }

    protected ConditionValue _uniqueInteger;
    public ConditionValue xdfgetUniqueInteger()
    { if (_uniqueInteger == null) { _uniqueInteger = nCV(); }
      return _uniqueInteger; }
    protected ConditionValue xgetCValueUniqueInteger() { return xdfgetUniqueInteger(); }

    /**
     * Add order-by as ascend. <br>
     * UNIQUE_INTEGER: {UQ, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_UniqueInteger_Asc() { regOBA("UNIQUE_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIQUE_INTEGER: {UQ, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_UniqueInteger_Desc() { regOBD("UNIQUE_INTEGER"); return this; }

    protected ConditionValue _zoneMemberId;
    public ConditionValue xdfgetZoneMemberId()
    { if (_zoneMemberId == null) { _zoneMemberId = nCV(); }
      return _zoneMemberId; }
    protected ConditionValue xgetCValueZoneMemberId() { return xdfgetZoneMemberId(); }

    /**
     * Add order-by as ascend. <br>
     * ZONE_MEMBER_ID: {IX, NotNull, INT(10), FK to member}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_ZoneMemberId_Asc() { regOBA("ZONE_MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZONE_MEMBER_ID: {IX, NotNull, INT(10), FK to member}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_ZoneMemberId_Desc() { regOBD("ZONE_MEMBER_ID"); return this; }

    protected ConditionValue _zonePurchaseId;
    public ConditionValue xdfgetZonePurchaseId()
    { if (_zonePurchaseId == null) { _zonePurchaseId = nCV(); }
      return _zonePurchaseId; }
    protected ConditionValue xgetCValueZonePurchaseId() { return xdfgetZonePurchaseId(); }

    /**
     * Add order-by as ascend. <br>
     * ZONE_PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_ZonePurchaseId_Asc() { regOBA("ZONE_PURCHASE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZONE_PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_ZonePurchaseId_Desc() { regOBD("ZONE_PURCHASE_ID"); return this; }

    protected ConditionValue _zoneProductId;
    public ConditionValue xdfgetZoneProductId()
    { if (_zoneProductId == null) { _zoneProductId = nCV(); }
      return _zoneProductId; }
    protected ConditionValue xgetCValueZoneProductId() { return xdfgetZoneProductId(); }

    /**
     * Add order-by as ascend. <br>
     * ZONE_PRODUCT_ID: {IX, NotNull, INT(10), FK to product}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_ZoneProductId_Asc() { regOBA("ZONE_PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZONE_PRODUCT_ID: {IX, NotNull, INT(10), FK to product}
     * @return this. (NotNull)
     */
    public BsGiantCQ addOrderBy_ZoneProductId_Desc() { regOBD("ZONE_PRODUCT_ID"); return this; }

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
    public BsGiantCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsGiantCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        GiantCQ bq = (GiantCQ)bqs;
        GiantCQ uq = (GiantCQ)uqs;
        if (bq.hasConditionQueryGiantStatus()) {
            uq.queryGiantStatus().reflectRelationOnUnionQuery(bq.queryGiantStatus(), uq.queryGiantStatus());
        }
        if (bq.hasConditionQueryGiantSelf()) {
            uq.queryGiantSelf().reflectRelationOnUnionQuery(bq.queryGiantSelf(), uq.queryGiantSelf());
        }
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
        }
        if (bq.hasConditionQueryProduct()) {
            uq.queryProduct().reflectRelationOnUnionQuery(bq.queryProduct(), uq.queryProduct());
        }
        if (bq.hasConditionQueryPurchase()) {
            uq.queryPurchase().reflectRelationOnUnionQuery(bq.queryPurchase(), uq.queryPurchase());
        }
        if (bq.hasConditionQueryGiantSideAsOne()) {
            uq.queryGiantSideAsOne().reflectRelationOnUnionQuery(bq.queryGiantSideAsOne(), uq.queryGiantSideAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (Status of Giant)GIANT_STATUS by my GIANT_STATUS_CODE, named 'giantStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public GiantStatusCQ queryGiantStatus() {
        return xdfgetConditionQueryGiantStatus();
    }
    public GiantStatusCQ xdfgetConditionQueryGiantStatus() {
        String prop = "giantStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryGiantStatus()); xsetupOuterJoinGiantStatus(); }
        return xgetQueRlMap(prop);
    }
    protected GiantStatusCQ xcreateQueryGiantStatus() {
        String nrp = xresolveNRP("giant", "giantStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new GiantStatusCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "giantStatus", nrp);
    }
    protected void xsetupOuterJoinGiantStatus() { xregOutJo("giantStatus"); }
    public boolean hasConditionQueryGiantStatus() { return xhasQueRlMap("giantStatus"); }

    /**
     * Get the condition-query for relation table. <br>
     * (Giant as base point)GIANT by my SELF_PARENT_ID, named 'giantSelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public GiantCQ queryGiantSelf() {
        return xdfgetConditionQueryGiantSelf();
    }
    public GiantCQ xdfgetConditionQueryGiantSelf() {
        String prop = "giantSelf";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryGiantSelf()); xsetupOuterJoinGiantSelf(); }
        return xgetQueRlMap(prop);
    }
    protected GiantCQ xcreateQueryGiantSelf() {
        String nrp = xresolveNRP("giant", "giantSelf"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new GiantCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "giantSelf", nrp);
    }
    protected void xsetupOuterJoinGiantSelf() { xregOutJo("giantSelf"); }
    public boolean hasConditionQueryGiantSelf() { return xhasQueRlMap("giantSelf"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員)MEMBER by my ZONE_MEMBER_ID, named 'member'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberCQ queryMember() {
        return xdfgetConditionQueryMember();
    }
    public MemberCQ xdfgetConditionQueryMember() {
        String prop = "member";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMember()); xsetupOuterJoinMember(); }
        return xgetQueRlMap(prop);
    }
    protected MemberCQ xcreateQueryMember() {
        String nrp = xresolveNRP("giant", "member"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "member", nrp);
    }
    protected void xsetupOuterJoinMember() { xregOutJo("member"); }
    public boolean hasConditionQueryMember() { return xhasQueRlMap("member"); }

    /**
     * Get the condition-query for relation table. <br>
     * (商品)PRODUCT by my ZONE_PRODUCT_ID, named 'product'.
     * @return The instance of condition-query. (NotNull)
     */
    public ProductCQ queryProduct() {
        return xdfgetConditionQueryProduct();
    }
    public ProductCQ xdfgetConditionQueryProduct() {
        String prop = "product";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProduct()); xsetupOuterJoinProduct(); }
        return xgetQueRlMap(prop);
    }
    protected ProductCQ xcreateQueryProduct() {
        String nrp = xresolveNRP("giant", "product"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "product", nrp);
    }
    protected void xsetupOuterJoinProduct() { xregOutJo("product"); }
    public boolean hasConditionQueryProduct() { return xhasQueRlMap("product"); }

    /**
     * Get the condition-query for relation table. <br>
     * (購入)PURCHASE by my ZONE_PURCHASE_ID, named 'purchase'.
     * @return The instance of condition-query. (NotNull)
     */
    public PurchaseCQ queryPurchase() {
        return xdfgetConditionQueryPurchase();
    }
    public PurchaseCQ xdfgetConditionQueryPurchase() {
        String prop = "purchase";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPurchase()); xsetupOuterJoinPurchase(); }
        return xgetQueRlMap(prop);
    }
    protected PurchaseCQ xcreateQueryPurchase() {
        String nrp = xresolveNRP("giant", "purchase"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PurchaseCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "purchase", nrp);
    }
    protected void xsetupOuterJoinPurchase() { xregOutJo("purchase"); }
    public boolean hasConditionQueryPurchase() { return xhasQueRlMap("purchase"); }

    /**
     * Get the condition-query for relation table. <br>
     * (simple Side of Giant)giant_side by GIANT_ID, named 'giantSideAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public GiantSideCQ queryGiantSideAsOne() { return xdfgetConditionQueryGiantSideAsOne(); }
    public GiantSideCQ xdfgetConditionQueryGiantSideAsOne() {
        String prop = "giantSideAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryGiantSideAsOne()); xsetupOuterJoinGiantSideAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected GiantSideCQ xcreateQueryGiantSideAsOne() {
        String nrp = xresolveNRP("giant", "giantSideAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new GiantSideCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "giantSideAsOne", nrp);
    }
    protected void xsetupOuterJoinGiantSideAsOne() { xregOutJo("giantSideAsOne"); }
    public boolean hasConditionQueryGiantSideAsOne() { return xhasQueRlMap("giantSideAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, GiantCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(GiantCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, GiantCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(GiantCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, GiantCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(GiantCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, GiantCQ> _myselfExistsMap;
    public Map<String, GiantCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(GiantCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, GiantCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(GiantCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return GiantCB.class.getName(); }
    protected String xCQ() { return GiantCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
