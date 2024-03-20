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
 * The base condition-query of giant_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsGiantRefCQ extends AbstractBsGiantRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected GiantRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsGiantRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from giant_ref) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public GiantRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected GiantRefCIQ xcreateCIQ() {
        GiantRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected GiantRefCIQ xnewCIQ() {
        return new GiantRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join giant_ref on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public GiantRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        GiantRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _giantRefId;
    public ConditionValue xdfgetGiantRefId()
    { if (_giantRefId == null) { _giantRefId = nCV(); }
      return _giantRefId; }
    protected ConditionValue xgetCValueGiantRefId() { return xdfgetGiantRefId(); }

    public Map<String, GiantRefCQ> xdfgetGiantRefId_ExistsReferrer_GiantRefSelfList() { return xgetSQueMap("giantRefId_ExistsReferrer_GiantRefSelfList"); }
    public String keepGiantRefId_ExistsReferrer_GiantRefSelfList(GiantRefCQ sq) { return xkeepSQue("giantRefId_ExistsReferrer_GiantRefSelfList", sq); }

    public Map<String, GiantRefCQ> xdfgetGiantRefId_NotExistsReferrer_GiantRefSelfList() { return xgetSQueMap("giantRefId_NotExistsReferrer_GiantRefSelfList"); }
    public String keepGiantRefId_NotExistsReferrer_GiantRefSelfList(GiantRefCQ sq) { return xkeepSQue("giantRefId_NotExistsReferrer_GiantRefSelfList", sq); }

    public Map<String, GiantRefCQ> xdfgetGiantRefId_SpecifyDerivedReferrer_GiantRefSelfList() { return xgetSQueMap("giantRefId_SpecifyDerivedReferrer_GiantRefSelfList"); }
    public String keepGiantRefId_SpecifyDerivedReferrer_GiantRefSelfList(GiantRefCQ sq) { return xkeepSQue("giantRefId_SpecifyDerivedReferrer_GiantRefSelfList", sq); }

    public Map<String, GiantRefCQ> xdfgetGiantRefId_QueryDerivedReferrer_GiantRefSelfList() { return xgetSQueMap("giantRefId_QueryDerivedReferrer_GiantRefSelfList"); }
    public String keepGiantRefId_QueryDerivedReferrer_GiantRefSelfList(GiantRefCQ sq) { return xkeepSQue("giantRefId_QueryDerivedReferrer_GiantRefSelfList", sq); }
    public Map<String, Object> xdfgetGiantRefId_QueryDerivedReferrer_GiantRefSelfListParameter() { return xgetSQuePmMap("giantRefId_QueryDerivedReferrer_GiantRefSelfList"); }
    public String keepGiantRefId_QueryDerivedReferrer_GiantRefSelfListParameter(Object pm) { return xkeepSQuePm("giantRefId_QueryDerivedReferrer_GiantRefSelfList", pm); }

    /**
     * Add order-by as ascend. <br>
     * GIANT_REF_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_GiantRefId_Asc() { regOBA("GIANT_REF_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * GIANT_REF_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_GiantRefId_Desc() { regOBD("GIANT_REF_ID"); return this; }

    protected ConditionValue _giantId;
    public ConditionValue xdfgetGiantId()
    { if (_giantId == null) { _giantId = nCV(); }
      return _giantId; }
    protected ConditionValue xgetCValueGiantId() { return xdfgetGiantId(); }

    /**
     * Add order-by as ascend. <br>
     * (Giant ID (FK))GIANT_ID: {IX+, NotNull, BIGINT(19), FK to giant}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_GiantId_Asc() { regOBA("GIANT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (Giant ID (FK))GIANT_ID: {IX+, NotNull, BIGINT(19), FK to giant}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_GiantId_Desc() { regOBD("GIANT_ID"); return this; }

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
    public BsGiantRefCQ addOrderBy_GiantStatusCode_Asc() { regOBA("GIANT_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * GIANT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to giant_status, classification=GiantStatus}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_GiantStatusCode_Desc() { regOBD("GIANT_STATUS_CODE"); return this; }

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
    public BsGiantRefCQ addOrderBy_IndexString_Asc() { regOBA("INDEX_STRING"); return this; }

    /**
     * Add order-by as descend. <br>
     * INDEX_STRING: {IX, NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_IndexString_Desc() { regOBD("INDEX_STRING"); return this; }

    protected ConditionValue _indexInteger;
    public ConditionValue xdfgetIndexInteger()
    { if (_indexInteger == null) { _indexInteger = nCV(); }
      return _indexInteger; }
    protected ConditionValue xgetCValueIndexInteger() { return xdfgetIndexInteger(); }

    /**
     * Add order-by as ascend. <br>
     * INDEX_INTEGER: {IX+, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_IndexInteger_Asc() { regOBA("INDEX_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * INDEX_INTEGER: {IX+, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_IndexInteger_Desc() { regOBD("INDEX_INTEGER"); return this; }

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
    public BsGiantRefCQ addOrderBy_IndexDate_Asc() { regOBA("INDEX_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * INDEX_DATE: {IX, NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_IndexDate_Desc() { regOBD("INDEX_DATE"); return this; }

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
    public BsGiantRefCQ addOrderBy_IndexDatetime_Asc() { regOBA("INDEX_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * INDEX_DATETIME: {IX, NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_IndexDatetime_Desc() { regOBD("INDEX_DATETIME"); return this; }

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
    public BsGiantRefCQ addOrderBy_IndexBoolean_Asc() { regOBA("INDEX_BOOLEAN"); return this; }

    /**
     * Add order-by as descend. <br>
     * INDEX_BOOLEAN: {IX, NotNull, BIT}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_IndexBoolean_Desc() { regOBD("INDEX_BOOLEAN"); return this; }

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
    public BsGiantRefCQ addOrderBy_NonIndexString_Asc() { regOBA("NON_INDEX_STRING"); return this; }

    /**
     * Add order-by as descend. <br>
     * NON_INDEX_STRING: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_NonIndexString_Desc() { regOBD("NON_INDEX_STRING"); return this; }

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
    public BsGiantRefCQ addOrderBy_NonIndexInteger_Asc() { regOBA("NON_INDEX_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * NON_INDEX_INTEGER: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_NonIndexInteger_Desc() { regOBD("NON_INDEX_INTEGER"); return this; }

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
    public BsGiantRefCQ addOrderBy_NonIndexDate_Asc() { regOBA("NON_INDEX_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * NON_INDEX_DATE: {NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_NonIndexDate_Desc() { regOBD("NON_INDEX_DATE"); return this; }

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
    public BsGiantRefCQ addOrderBy_NonIndexDatetime_Asc() { regOBA("NON_INDEX_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * NON_INDEX_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_NonIndexDatetime_Desc() { regOBD("NON_INDEX_DATETIME"); return this; }

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
    public BsGiantRefCQ addOrderBy_NonIndexBoolean_Asc() { regOBA("NON_INDEX_BOOLEAN"); return this; }

    /**
     * Add order-by as descend. <br>
     * NON_INDEX_BOOLEAN: {NotNull, BIT}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_NonIndexBoolean_Desc() { regOBD("NON_INDEX_BOOLEAN"); return this; }

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
    public BsGiantRefCQ addOrderBy_NullableIndexString_Asc() { regOBA("NULLABLE_INDEX_STRING"); return this; }

    /**
     * Add order-by as descend. <br>
     * NULLABLE_INDEX_STRING: {IX, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_NullableIndexString_Desc() { regOBD("NULLABLE_INDEX_STRING"); return this; }

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
    public BsGiantRefCQ addOrderBy_NullableIndexInteger_Asc() { regOBA("NULLABLE_INDEX_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * NULLABLE_INDEX_INTEGER: {IX, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_NullableIndexInteger_Desc() { regOBD("NULLABLE_INDEX_INTEGER"); return this; }

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
    public BsGiantRefCQ addOrderBy_NullableIndexDate_Asc() { regOBA("NULLABLE_INDEX_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * NULLABLE_INDEX_DATE: {IX, DATE(10)}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_NullableIndexDate_Desc() { regOBD("NULLABLE_INDEX_DATE"); return this; }

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
    public BsGiantRefCQ addOrderBy_NullableIndexDatetime_Asc() { regOBA("NULLABLE_INDEX_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * NULLABLE_INDEX_DATETIME: {IX, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_NullableIndexDatetime_Desc() { regOBD("NULLABLE_INDEX_DATETIME"); return this; }

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
    public BsGiantRefCQ addOrderBy_NullableIndexBoolean_Asc() { regOBA("NULLABLE_INDEX_BOOLEAN"); return this; }

    /**
     * Add order-by as descend. <br>
     * NULLABLE_INDEX_BOOLEAN: {IX, BIT}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_NullableIndexBoolean_Desc() { regOBD("NULLABLE_INDEX_BOOLEAN"); return this; }

    protected ConditionValue _selfParentId;
    public ConditionValue xdfgetSelfParentId()
    { if (_selfParentId == null) { _selfParentId = nCV(); }
      return _selfParentId; }
    protected ConditionValue xgetCValueSelfParentId() { return xdfgetSelfParentId(); }

    /**
     * Add order-by as ascend. <br>
     * (Self Reference ID)SELF_PARENT_ID: {IX, BIGINT(19), FK to giant_ref}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_SelfParentId_Asc() { regOBA("SELF_PARENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (Self Reference ID)SELF_PARENT_ID: {IX, BIGINT(19), FK to giant_ref}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_SelfParentId_Desc() { regOBD("SELF_PARENT_ID"); return this; }

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
    public BsGiantRefCQ addOrderBy_Unique1stInteger_Asc() { regOBA("UNIQUE_1ST_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (Compound Unique First)UNIQUE_1ST_INTEGER: {UQ+, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_Unique1stInteger_Desc() { regOBD("UNIQUE_1ST_INTEGER"); return this; }

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
    public BsGiantRefCQ addOrderBy_Unique2ndInteger_Asc() { regOBA("UNIQUE_2ND_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (Compound Unique Second)UNIQUE_2ND_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_Unique2ndInteger_Desc() { regOBD("UNIQUE_2ND_INTEGER"); return this; }

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
    public BsGiantRefCQ addOrderBy_Unique3rdInteger_Asc() { regOBA("UNIQUE_3RD_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (Compound Unique Third)UNIQUE_3RD_INTEGER: {+UQ, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_Unique3rdInteger_Desc() { regOBD("UNIQUE_3RD_INTEGER"); return this; }

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
    public BsGiantRefCQ addOrderBy_Unique4thInteger_Asc() { regOBA("UNIQUE_4TH_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (Compound Unique Fourth)UNIQUE_4TH_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_Unique4thInteger_Desc() { regOBD("UNIQUE_4TH_INTEGER"); return this; }

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
    public BsGiantRefCQ addOrderBy_UniqueString_Asc() { regOBA("UNIQUE_STRING"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIQUE_STRING: {UQ, NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_UniqueString_Desc() { regOBD("UNIQUE_STRING"); return this; }

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
    public BsGiantRefCQ addOrderBy_UniqueInteger_Asc() { regOBA("UNIQUE_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIQUE_INTEGER: {UQ, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_UniqueInteger_Desc() { regOBD("UNIQUE_INTEGER"); return this; }

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
    public BsGiantRefCQ addOrderBy_ZoneMemberId_Asc() { regOBA("ZONE_MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZONE_MEMBER_ID: {IX, NotNull, INT(10), FK to member}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_ZoneMemberId_Desc() { regOBD("ZONE_MEMBER_ID"); return this; }

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
    public BsGiantRefCQ addOrderBy_ZonePurchaseId_Asc() { regOBA("ZONE_PURCHASE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZONE_PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_ZonePurchaseId_Desc() { regOBD("ZONE_PURCHASE_ID"); return this; }

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
    public BsGiantRefCQ addOrderBy_ZoneProductId_Asc() { regOBA("ZONE_PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZONE_PRODUCT_ID: {IX, NotNull, INT(10), FK to product}
     * @return this. (NotNull)
     */
    public BsGiantRefCQ addOrderBy_ZoneProductId_Desc() { regOBD("ZONE_PRODUCT_ID"); return this; }

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
    public BsGiantRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsGiantRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        GiantRefCQ bq = (GiantRefCQ)bqs;
        GiantRefCQ uq = (GiantRefCQ)uqs;
        if (bq.hasConditionQueryGiant()) {
            uq.queryGiant().reflectRelationOnUnionQuery(bq.queryGiant(), uq.queryGiant());
        }
        if (bq.hasConditionQueryGiantStatus()) {
            uq.queryGiantStatus().reflectRelationOnUnionQuery(bq.queryGiantStatus(), uq.queryGiantStatus());
        }
        if (bq.hasConditionQueryGiantRefSelf()) {
            uq.queryGiantRefSelf().reflectRelationOnUnionQuery(bq.queryGiantRefSelf(), uq.queryGiantRefSelf());
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
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (Giant as base point)GIANT by my GIANT_ID, named 'giant'.
     * @return The instance of condition-query. (NotNull)
     */
    public GiantCQ queryGiant() {
        return xdfgetConditionQueryGiant();
    }
    public GiantCQ xdfgetConditionQueryGiant() {
        String prop = "giant";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryGiant()); xsetupOuterJoinGiant(); }
        return xgetQueRlMap(prop);
    }
    protected GiantCQ xcreateQueryGiant() {
        String nrp = xresolveNRP("giant_ref", "giant"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new GiantCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "giant", nrp);
    }
    protected void xsetupOuterJoinGiant() { xregOutJo("giant"); }
    public boolean hasConditionQueryGiant() { return xhasQueRlMap("giant"); }

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
        String nrp = xresolveNRP("giant_ref", "giantStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new GiantStatusCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "giantStatus", nrp);
    }
    protected void xsetupOuterJoinGiantStatus() { xregOutJo("giantStatus"); }
    public boolean hasConditionQueryGiantStatus() { return xhasQueRlMap("giantStatus"); }

    /**
     * Get the condition-query for relation table. <br>
     * (Referrer of Giant)GIANT_REF by my SELF_PARENT_ID, named 'giantRefSelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public GiantRefCQ queryGiantRefSelf() {
        return xdfgetConditionQueryGiantRefSelf();
    }
    public GiantRefCQ xdfgetConditionQueryGiantRefSelf() {
        String prop = "giantRefSelf";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryGiantRefSelf()); xsetupOuterJoinGiantRefSelf(); }
        return xgetQueRlMap(prop);
    }
    protected GiantRefCQ xcreateQueryGiantRefSelf() {
        String nrp = xresolveNRP("giant_ref", "giantRefSelf"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new GiantRefCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "giantRefSelf", nrp);
    }
    protected void xsetupOuterJoinGiantRefSelf() { xregOutJo("giantRefSelf"); }
    public boolean hasConditionQueryGiantRefSelf() { return xhasQueRlMap("giantRefSelf"); }

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
        String nrp = xresolveNRP("giant_ref", "member"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("giant_ref", "product"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("giant_ref", "purchase"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PurchaseCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "purchase", nrp);
    }
    protected void xsetupOuterJoinPurchase() { xregOutJo("purchase"); }
    public boolean hasConditionQueryPurchase() { return xhasQueRlMap("purchase"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, GiantRefCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(GiantRefCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, GiantRefCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(GiantRefCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, GiantRefCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(GiantRefCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, GiantRefCQ> _myselfExistsMap;
    public Map<String, GiantRefCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(GiantRefCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, GiantRefCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(GiantRefCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return GiantRefCB.class.getName(); }
    protected String xCQ() { return GiantRefCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
