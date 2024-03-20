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

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.docksidestage.dbflute.allcommon.*;
import org.docksidestage.dbflute.cbean.*;
import org.docksidestage.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of giant_ref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsGiantRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsGiantRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "giant_ref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * GIANT_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param giantRefId The value of giantRefId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiantRefId_Equal(Long giantRefId) {
        doSetGiantRefId_Equal(giantRefId);
    }

    protected void doSetGiantRefId_Equal(Long giantRefId) {
        regGiantRefId(CK_EQ, giantRefId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GIANT_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param giantRefId The value of giantRefId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiantRefId_NotEqual(Long giantRefId) {
        doSetGiantRefId_NotEqual(giantRefId);
    }

    protected void doSetGiantRefId_NotEqual(Long giantRefId) {
        regGiantRefId(CK_NES, giantRefId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GIANT_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param giantRefId The value of giantRefId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiantRefId_GreaterThan(Long giantRefId) {
        regGiantRefId(CK_GT, giantRefId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GIANT_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param giantRefId The value of giantRefId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiantRefId_LessThan(Long giantRefId) {
        regGiantRefId(CK_LT, giantRefId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GIANT_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param giantRefId The value of giantRefId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiantRefId_GreaterEqual(Long giantRefId) {
        regGiantRefId(CK_GE, giantRefId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GIANT_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param giantRefId The value of giantRefId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiantRefId_LessEqual(Long giantRefId) {
        regGiantRefId(CK_LE, giantRefId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GIANT_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of giantRefId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of giantRefId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setGiantRefId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setGiantRefId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GIANT_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of giantRefId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of giantRefId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setGiantRefId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGiantRefId(), "GIANT_REF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GIANT_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param giantRefIdList The collection of giantRefId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiantRefId_InScope(Collection<Long> giantRefIdList) {
        doSetGiantRefId_InScope(giantRefIdList);
    }

    protected void doSetGiantRefId_InScope(Collection<Long> giantRefIdList) {
        regINS(CK_INS, cTL(giantRefIdList), xgetCValueGiantRefId(), "GIANT_REF_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GIANT_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param giantRefIdList The collection of giantRefId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiantRefId_NotInScope(Collection<Long> giantRefIdList) {
        doSetGiantRefId_NotInScope(giantRefIdList);
    }

    protected void doSetGiantRefId_NotInScope(Collection<Long> giantRefIdList) {
        regINS(CK_NINS, cTL(giantRefIdList), xgetCValueGiantRefId(), "GIANT_REF_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SELF_PARENT_ID from giant_ref where ...)} <br>
     * (Referrer of Giant)giant_ref by SELF_PARENT_ID, named 'giantRefSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsGiantRefSelf</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of GiantRefSelfList for 'exists'. (NotNull)
     */
    public void existsGiantRefSelf(SubQuery<GiantRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        GiantRefCB cb = new GiantRefCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGiantRefId_ExistsReferrer_GiantRefSelfList(cb.query());
        registerExistsReferrer(cb.query(), "GIANT_REF_ID", "SELF_PARENT_ID", pp, "giantRefSelfList");
    }
    public abstract String keepGiantRefId_ExistsReferrer_GiantRefSelfList(GiantRefCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SELF_PARENT_ID from giant_ref where ...)} <br>
     * (Referrer of Giant)giant_ref by SELF_PARENT_ID, named 'giantRefSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsGiantRefSelf</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of GiantRefId_NotExistsReferrer_GiantRefSelfList for 'not exists'. (NotNull)
     */
    public void notExistsGiantRefSelf(SubQuery<GiantRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        GiantRefCB cb = new GiantRefCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGiantRefId_NotExistsReferrer_GiantRefSelfList(cb.query());
        registerNotExistsReferrer(cb.query(), "GIANT_REF_ID", "SELF_PARENT_ID", pp, "giantRefSelfList");
    }
    public abstract String keepGiantRefId_NotExistsReferrer_GiantRefSelfList(GiantRefCQ sq);

    public void xsderiveGiantRefSelfList(String fn, SubQuery<GiantRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        GiantRefCB cb = new GiantRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepGiantRefId_SpecifyDerivedReferrer_GiantRefSelfList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "GIANT_REF_ID", "SELF_PARENT_ID", pp, "giantRefSelfList", al, op);
    }
    public abstract String keepGiantRefId_SpecifyDerivedReferrer_GiantRefSelfList(GiantRefCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from giant_ref where ...)} <br>
     * (Referrer of Giant)giant_ref by SELF_PARENT_ID, named 'giantRefSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedGiantRefSelf()</span>.<span style="color: #CC4747">max</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     refCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<GiantRefCB> derivedGiantRefSelf() {
        return xcreateQDRFunctionGiantRefSelfList();
    }
    protected HpQDRFunction<GiantRefCB> xcreateQDRFunctionGiantRefSelfList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveGiantRefSelfList(fn, sq, rd, vl, op));
    }
    public void xqderiveGiantRefSelfList(String fn, SubQuery<GiantRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        GiantRefCB cb = new GiantRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepGiantRefId_QueryDerivedReferrer_GiantRefSelfList(cb.query()); String prpp = keepGiantRefId_QueryDerivedReferrer_GiantRefSelfListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "GIANT_REF_ID", "SELF_PARENT_ID", sqpp, "giantRefSelfList", rd, vl, prpp, op);
    }
    public abstract String keepGiantRefId_QueryDerivedReferrer_GiantRefSelfList(GiantRefCQ sq);
    public abstract String keepGiantRefId_QueryDerivedReferrer_GiantRefSelfListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GIANT_REF_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setGiantRefId_IsNull() { regGiantRefId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GIANT_REF_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setGiantRefId_IsNotNull() { regGiantRefId(CK_ISNN, DOBJ); }

    protected void regGiantRefId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGiantRefId(), "GIANT_REF_ID"); }
    protected abstract ConditionValue xgetCValueGiantRefId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (Giant ID (FK))GIANT_ID: {IX+, NotNull, BIGINT(19), FK to giant}
     * @param giantId The value of giantId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiantId_Equal(Long giantId) {
        doSetGiantId_Equal(giantId);
    }

    protected void doSetGiantId_Equal(Long giantId) {
        regGiantId(CK_EQ, giantId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (Giant ID (FK))GIANT_ID: {IX+, NotNull, BIGINT(19), FK to giant}
     * @param giantId The value of giantId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiantId_NotEqual(Long giantId) {
        doSetGiantId_NotEqual(giantId);
    }

    protected void doSetGiantId_NotEqual(Long giantId) {
        regGiantId(CK_NES, giantId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (Giant ID (FK))GIANT_ID: {IX+, NotNull, BIGINT(19), FK to giant}
     * @param giantId The value of giantId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiantId_GreaterThan(Long giantId) {
        regGiantId(CK_GT, giantId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (Giant ID (FK))GIANT_ID: {IX+, NotNull, BIGINT(19), FK to giant}
     * @param giantId The value of giantId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiantId_LessThan(Long giantId) {
        regGiantId(CK_LT, giantId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (Giant ID (FK))GIANT_ID: {IX+, NotNull, BIGINT(19), FK to giant}
     * @param giantId The value of giantId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiantId_GreaterEqual(Long giantId) {
        regGiantId(CK_GE, giantId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (Giant ID (FK))GIANT_ID: {IX+, NotNull, BIGINT(19), FK to giant}
     * @param giantId The value of giantId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiantId_LessEqual(Long giantId) {
        regGiantId(CK_LE, giantId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (Giant ID (FK))GIANT_ID: {IX+, NotNull, BIGINT(19), FK to giant}
     * @param minNumber The min number of giantId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of giantId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setGiantId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setGiantId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (Giant ID (FK))GIANT_ID: {IX+, NotNull, BIGINT(19), FK to giant}
     * @param minNumber The min number of giantId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of giantId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setGiantId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGiantId(), "GIANT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (Giant ID (FK))GIANT_ID: {IX+, NotNull, BIGINT(19), FK to giant}
     * @param giantIdList The collection of giantId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiantId_InScope(Collection<Long> giantIdList) {
        doSetGiantId_InScope(giantIdList);
    }

    protected void doSetGiantId_InScope(Collection<Long> giantIdList) {
        regINS(CK_INS, cTL(giantIdList), xgetCValueGiantId(), "GIANT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (Giant ID (FK))GIANT_ID: {IX+, NotNull, BIGINT(19), FK to giant}
     * @param giantIdList The collection of giantId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiantId_NotInScope(Collection<Long> giantIdList) {
        doSetGiantId_NotInScope(giantIdList);
    }

    protected void doSetGiantId_NotInScope(Collection<Long> giantIdList) {
        regINS(CK_NINS, cTL(giantIdList), xgetCValueGiantId(), "GIANT_ID");
    }

    protected void regGiantId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGiantId(), "GIANT_ID"); }
    protected abstract ConditionValue xgetCValueGiantId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIANT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to giant_status, classification=GiantStatus}
     * @param giantStatusCode The value of giantStatusCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setGiantStatusCode_Equal(String giantStatusCode) {
        doSetGiantStatusCode_Equal(fRES(giantStatusCode));
    }

    /**
     * Equal(=). As GiantStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIANT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to giant_status, classification=GiantStatus} <br>
     * status of giant tables
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setGiantStatusCode_Equal_AsGiantStatus(CDef.GiantStatus cdef) {
        doSetGiantStatusCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As A1Giant (AAA). And OnlyOnceRegistered. <br>
     * A1Giant: marked as A
     */
    public void setGiantStatusCode_Equal_A1Giant() {
        setGiantStatusCode_Equal_AsGiantStatus(CDef.GiantStatus.A1Giant);
    }

    /**
     * Equal(=). As B2Giant (BBB). And OnlyOnceRegistered. <br>
     * B2Giant: marked as B
     */
    public void setGiantStatusCode_Equal_B2Giant() {
        setGiantStatusCode_Equal_AsGiantStatus(CDef.GiantStatus.B2Giant);
    }

    /**
     * Equal(=). As C3Giant (CCC). And OnlyOnceRegistered. <br>
     * C3Giant: marked as C
     */
    public void setGiantStatusCode_Equal_C3Giant() {
        setGiantStatusCode_Equal_AsGiantStatus(CDef.GiantStatus.C3Giant);
    }

    /**
     * Equal(=). As D4Giant (DDD). And OnlyOnceRegistered. <br>
     * D4Giant: marked as D
     */
    public void setGiantStatusCode_Equal_D4Giant() {
        setGiantStatusCode_Equal_AsGiantStatus(CDef.GiantStatus.D4Giant);
    }

    /**
     * Equal(=). As E5Giant (EEE). And OnlyOnceRegistered. <br>
     * E5Giant: marked as E
     */
    public void setGiantStatusCode_Equal_E5Giant() {
        setGiantStatusCode_Equal_AsGiantStatus(CDef.GiantStatus.E5Giant);
    }

    /**
     * Equal(=). As F6Giant (FFF). And OnlyOnceRegistered. <br>
     * F6Giant: marked as F
     */
    public void setGiantStatusCode_Equal_F6Giant() {
        setGiantStatusCode_Equal_AsGiantStatus(CDef.GiantStatus.F6Giant);
    }

    /**
     * Equal(=). As G7Giant (GGG). And OnlyOnceRegistered. <br>
     * G7Giant: marked as G
     */
    public void setGiantStatusCode_Equal_G7Giant() {
        setGiantStatusCode_Equal_AsGiantStatus(CDef.GiantStatus.G7Giant);
    }

    /**
     * Equal(=). As H8Giant (HHH). And OnlyOnceRegistered. <br>
     * H8Giant: marked as H
     */
    public void setGiantStatusCode_Equal_H8Giant() {
        setGiantStatusCode_Equal_AsGiantStatus(CDef.GiantStatus.H8Giant);
    }

    protected void doSetGiantStatusCode_Equal(String giantStatusCode) {
        regGiantStatusCode(CK_EQ, giantStatusCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIANT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to giant_status, classification=GiantStatus}
     * @param giantStatusCode The value of giantStatusCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setGiantStatusCode_NotEqual(String giantStatusCode) {
        doSetGiantStatusCode_NotEqual(fRES(giantStatusCode));
    }

    /**
     * NotEqual(&lt;&gt;). As GiantStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIANT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to giant_status, classification=GiantStatus} <br>
     * status of giant tables
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setGiantStatusCode_NotEqual_AsGiantStatus(CDef.GiantStatus cdef) {
        doSetGiantStatusCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As A1Giant (AAA). And OnlyOnceRegistered. <br>
     * A1Giant: marked as A
     */
    public void setGiantStatusCode_NotEqual_A1Giant() {
        setGiantStatusCode_NotEqual_AsGiantStatus(CDef.GiantStatus.A1Giant);
    }

    /**
     * NotEqual(&lt;&gt;). As B2Giant (BBB). And OnlyOnceRegistered. <br>
     * B2Giant: marked as B
     */
    public void setGiantStatusCode_NotEqual_B2Giant() {
        setGiantStatusCode_NotEqual_AsGiantStatus(CDef.GiantStatus.B2Giant);
    }

    /**
     * NotEqual(&lt;&gt;). As C3Giant (CCC). And OnlyOnceRegistered. <br>
     * C3Giant: marked as C
     */
    public void setGiantStatusCode_NotEqual_C3Giant() {
        setGiantStatusCode_NotEqual_AsGiantStatus(CDef.GiantStatus.C3Giant);
    }

    /**
     * NotEqual(&lt;&gt;). As D4Giant (DDD). And OnlyOnceRegistered. <br>
     * D4Giant: marked as D
     */
    public void setGiantStatusCode_NotEqual_D4Giant() {
        setGiantStatusCode_NotEqual_AsGiantStatus(CDef.GiantStatus.D4Giant);
    }

    /**
     * NotEqual(&lt;&gt;). As E5Giant (EEE). And OnlyOnceRegistered. <br>
     * E5Giant: marked as E
     */
    public void setGiantStatusCode_NotEqual_E5Giant() {
        setGiantStatusCode_NotEqual_AsGiantStatus(CDef.GiantStatus.E5Giant);
    }

    /**
     * NotEqual(&lt;&gt;). As F6Giant (FFF). And OnlyOnceRegistered. <br>
     * F6Giant: marked as F
     */
    public void setGiantStatusCode_NotEqual_F6Giant() {
        setGiantStatusCode_NotEqual_AsGiantStatus(CDef.GiantStatus.F6Giant);
    }

    /**
     * NotEqual(&lt;&gt;). As G7Giant (GGG). And OnlyOnceRegistered. <br>
     * G7Giant: marked as G
     */
    public void setGiantStatusCode_NotEqual_G7Giant() {
        setGiantStatusCode_NotEqual_AsGiantStatus(CDef.GiantStatus.G7Giant);
    }

    /**
     * NotEqual(&lt;&gt;). As H8Giant (HHH). And OnlyOnceRegistered. <br>
     * H8Giant: marked as H
     */
    public void setGiantStatusCode_NotEqual_H8Giant() {
        setGiantStatusCode_NotEqual_AsGiantStatus(CDef.GiantStatus.H8Giant);
    }

    protected void doSetGiantStatusCode_NotEqual(String giantStatusCode) {
        regGiantStatusCode(CK_NES, giantStatusCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIANT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to giant_status, classification=GiantStatus}
     * @param giantStatusCodeList The collection of giantStatusCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setGiantStatusCode_InScope(Collection<String> giantStatusCodeList) {
        doSetGiantStatusCode_InScope(giantStatusCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As GiantStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIANT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to giant_status, classification=GiantStatus} <br>
     * status of giant tables
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiantStatusCode_InScope_AsGiantStatus(Collection<CDef.GiantStatus> cdefList) {
        doSetGiantStatusCode_InScope(cTStrL(cdefList));
    }

    protected void doSetGiantStatusCode_InScope(Collection<String> giantStatusCodeList) {
        regINS(CK_INS, cTL(giantStatusCodeList), xgetCValueGiantStatusCode(), "GIANT_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIANT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to giant_status, classification=GiantStatus}
     * @param giantStatusCodeList The collection of giantStatusCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setGiantStatusCode_NotInScope(Collection<String> giantStatusCodeList) {
        doSetGiantStatusCode_NotInScope(giantStatusCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As GiantStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIANT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to giant_status, classification=GiantStatus} <br>
     * status of giant tables
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiantStatusCode_NotInScope_AsGiantStatus(Collection<CDef.GiantStatus> cdefList) {
        doSetGiantStatusCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetGiantStatusCode_NotInScope(Collection<String> giantStatusCodeList) {
        regINS(CK_NINS, cTL(giantStatusCodeList), xgetCValueGiantStatusCode(), "GIANT_STATUS_CODE");
    }

    protected void regGiantStatusCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGiantStatusCode(), "GIANT_STATUS_CODE"); }
    protected abstract ConditionValue xgetCValueGiantStatusCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDEX_STRING: {IX, NotNull, VARCHAR(64)}
     * @param indexString The value of indexString as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndexString_Equal(String indexString) {
        doSetIndexString_Equal(fRES(indexString));
    }

    protected void doSetIndexString_Equal(String indexString) {
        regIndexString(CK_EQ, indexString);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDEX_STRING: {IX, NotNull, VARCHAR(64)}
     * @param indexString The value of indexString as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndexString_NotEqual(String indexString) {
        doSetIndexString_NotEqual(fRES(indexString));
    }

    protected void doSetIndexString_NotEqual(String indexString) {
        regIndexString(CK_NES, indexString);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INDEX_STRING: {IX, NotNull, VARCHAR(64)}
     * @param indexStringList The collection of indexString as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndexString_InScope(Collection<String> indexStringList) {
        doSetIndexString_InScope(indexStringList);
    }

    protected void doSetIndexString_InScope(Collection<String> indexStringList) {
        regINS(CK_INS, cTL(indexStringList), xgetCValueIndexString(), "INDEX_STRING");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INDEX_STRING: {IX, NotNull, VARCHAR(64)}
     * @param indexStringList The collection of indexString as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndexString_NotInScope(Collection<String> indexStringList) {
        doSetIndexString_NotInScope(indexStringList);
    }

    protected void doSetIndexString_NotInScope(Collection<String> indexStringList) {
        regINS(CK_NINS, cTL(indexStringList), xgetCValueIndexString(), "INDEX_STRING");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INDEX_STRING: {IX, NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setIndexString_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param indexString The value of indexString as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setIndexString_LikeSearch(String indexString, ConditionOptionCall<LikeSearchOption> opLambda) {
        setIndexString_LikeSearch(indexString, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INDEX_STRING: {IX, NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setIndexString_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param indexString The value of indexString as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setIndexString_LikeSearch(String indexString, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(indexString), xgetCValueIndexString(), "INDEX_STRING", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INDEX_STRING: {IX, NotNull, VARCHAR(64)}
     * @param indexString The value of indexString as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setIndexString_NotLikeSearch(String indexString, ConditionOptionCall<LikeSearchOption> opLambda) {
        setIndexString_NotLikeSearch(indexString, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INDEX_STRING: {IX, NotNull, VARCHAR(64)}
     * @param indexString The value of indexString as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setIndexString_NotLikeSearch(String indexString, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(indexString), xgetCValueIndexString(), "INDEX_STRING", likeSearchOption);
    }

    protected void regIndexString(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIndexString(), "INDEX_STRING"); }
    protected abstract ConditionValue xgetCValueIndexString();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_INTEGER: {IX+, NotNull, INT(10)}
     * @param indexInteger The value of indexInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexInteger_Equal(Integer indexInteger) {
        doSetIndexInteger_Equal(indexInteger);
    }

    protected void doSetIndexInteger_Equal(Integer indexInteger) {
        regIndexInteger(CK_EQ, indexInteger);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_INTEGER: {IX+, NotNull, INT(10)}
     * @param indexInteger The value of indexInteger as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexInteger_NotEqual(Integer indexInteger) {
        doSetIndexInteger_NotEqual(indexInteger);
    }

    protected void doSetIndexInteger_NotEqual(Integer indexInteger) {
        regIndexInteger(CK_NES, indexInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_INTEGER: {IX+, NotNull, INT(10)}
     * @param indexInteger The value of indexInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexInteger_GreaterThan(Integer indexInteger) {
        regIndexInteger(CK_GT, indexInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_INTEGER: {IX+, NotNull, INT(10)}
     * @param indexInteger The value of indexInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexInteger_LessThan(Integer indexInteger) {
        regIndexInteger(CK_LT, indexInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_INTEGER: {IX+, NotNull, INT(10)}
     * @param indexInteger The value of indexInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexInteger_GreaterEqual(Integer indexInteger) {
        regIndexInteger(CK_GE, indexInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_INTEGER: {IX+, NotNull, INT(10)}
     * @param indexInteger The value of indexInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexInteger_LessEqual(Integer indexInteger) {
        regIndexInteger(CK_LE, indexInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_INTEGER: {IX+, NotNull, INT(10)}
     * @param minNumber The min number of indexInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of indexInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setIndexInteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setIndexInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_INTEGER: {IX+, NotNull, INT(10)}
     * @param minNumber The min number of indexInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of indexInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setIndexInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueIndexInteger(), "INDEX_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INDEX_INTEGER: {IX+, NotNull, INT(10)}
     * @param indexIntegerList The collection of indexInteger as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndexInteger_InScope(Collection<Integer> indexIntegerList) {
        doSetIndexInteger_InScope(indexIntegerList);
    }

    protected void doSetIndexInteger_InScope(Collection<Integer> indexIntegerList) {
        regINS(CK_INS, cTL(indexIntegerList), xgetCValueIndexInteger(), "INDEX_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INDEX_INTEGER: {IX+, NotNull, INT(10)}
     * @param indexIntegerList The collection of indexInteger as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndexInteger_NotInScope(Collection<Integer> indexIntegerList) {
        doSetIndexInteger_NotInScope(indexIntegerList);
    }

    protected void doSetIndexInteger_NotInScope(Collection<Integer> indexIntegerList) {
        regINS(CK_NINS, cTL(indexIntegerList), xgetCValueIndexInteger(), "INDEX_INTEGER");
    }

    protected void regIndexInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIndexInteger(), "INDEX_INTEGER"); }
    protected abstract ConditionValue xgetCValueIndexInteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_DATE: {IX, NotNull, DATE(10)}
     * @param indexDate The value of indexDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexDate_Equal(java.time.LocalDate indexDate) {
        regIndexDate(CK_EQ,  indexDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_DATE: {IX, NotNull, DATE(10)}
     * @param indexDate The value of indexDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexDate_GreaterThan(java.time.LocalDate indexDate) {
        regIndexDate(CK_GT,  indexDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_DATE: {IX, NotNull, DATE(10)}
     * @param indexDate The value of indexDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexDate_LessThan(java.time.LocalDate indexDate) {
        regIndexDate(CK_LT,  indexDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_DATE: {IX, NotNull, DATE(10)}
     * @param indexDate The value of indexDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexDate_GreaterEqual(java.time.LocalDate indexDate) {
        regIndexDate(CK_GE,  indexDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_DATE: {IX, NotNull, DATE(10)}
     * @param indexDate The value of indexDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexDate_LessEqual(java.time.LocalDate indexDate) {
        regIndexDate(CK_LE, indexDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_DATE: {IX, NotNull, DATE(10)}
     * <pre>e.g. setIndexDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of indexDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of indexDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setIndexDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setIndexDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_DATE: {IX, NotNull, DATE(10)}
     * <pre>e.g. setIndexDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of indexDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of indexDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setIndexDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "INDEX_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueIndexDate(), nm, op);
    }

    protected void regIndexDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIndexDate(), "INDEX_DATE"); }
    protected abstract ConditionValue xgetCValueIndexDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_DATETIME: {IX, NotNull, DATETIME(19)}
     * @param indexDatetime The value of indexDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexDatetime_Equal(java.time.LocalDateTime indexDatetime) {
        regIndexDatetime(CK_EQ,  indexDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_DATETIME: {IX, NotNull, DATETIME(19)}
     * @param indexDatetime The value of indexDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexDatetime_GreaterThan(java.time.LocalDateTime indexDatetime) {
        regIndexDatetime(CK_GT,  indexDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_DATETIME: {IX, NotNull, DATETIME(19)}
     * @param indexDatetime The value of indexDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexDatetime_LessThan(java.time.LocalDateTime indexDatetime) {
        regIndexDatetime(CK_LT,  indexDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_DATETIME: {IX, NotNull, DATETIME(19)}
     * @param indexDatetime The value of indexDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexDatetime_GreaterEqual(java.time.LocalDateTime indexDatetime) {
        regIndexDatetime(CK_GE,  indexDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_DATETIME: {IX, NotNull, DATETIME(19)}
     * @param indexDatetime The value of indexDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexDatetime_LessEqual(java.time.LocalDateTime indexDatetime) {
        regIndexDatetime(CK_LE, indexDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_DATETIME: {IX, NotNull, DATETIME(19)}
     * <pre>e.g. setIndexDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of indexDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of indexDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setIndexDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setIndexDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_DATETIME: {IX, NotNull, DATETIME(19)}
     * <pre>e.g. setIndexDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of indexDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of indexDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setIndexDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "INDEX_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueIndexDatetime(), nm, op);
    }

    protected void regIndexDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIndexDatetime(), "INDEX_DATETIME"); }
    protected abstract ConditionValue xgetCValueIndexDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BOOLEAN: {IX, NotNull, BIT}
     * @param indexBoolean The value of indexBoolean as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexBoolean_Equal(Boolean indexBoolean) {
        regIndexBoolean(CK_EQ, indexBoolean);
    }

    protected void regIndexBoolean(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIndexBoolean(), "INDEX_BOOLEAN"); }
    protected abstract ConditionValue xgetCValueIndexBoolean();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NON_INDEX_STRING: {NotNull, VARCHAR(64)}
     * @param nonIndexString The value of nonIndexString as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNonIndexString_Equal(String nonIndexString) {
        doSetNonIndexString_Equal(fRES(nonIndexString));
    }

    protected void doSetNonIndexString_Equal(String nonIndexString) {
        regNonIndexString(CK_EQ, nonIndexString);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NON_INDEX_STRING: {NotNull, VARCHAR(64)}
     * @param nonIndexString The value of nonIndexString as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNonIndexString_NotEqual(String nonIndexString) {
        doSetNonIndexString_NotEqual(fRES(nonIndexString));
    }

    protected void doSetNonIndexString_NotEqual(String nonIndexString) {
        regNonIndexString(CK_NES, nonIndexString);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NON_INDEX_STRING: {NotNull, VARCHAR(64)}
     * @param nonIndexStringList The collection of nonIndexString as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNonIndexString_InScope(Collection<String> nonIndexStringList) {
        doSetNonIndexString_InScope(nonIndexStringList);
    }

    protected void doSetNonIndexString_InScope(Collection<String> nonIndexStringList) {
        regINS(CK_INS, cTL(nonIndexStringList), xgetCValueNonIndexString(), "NON_INDEX_STRING");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NON_INDEX_STRING: {NotNull, VARCHAR(64)}
     * @param nonIndexStringList The collection of nonIndexString as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNonIndexString_NotInScope(Collection<String> nonIndexStringList) {
        doSetNonIndexString_NotInScope(nonIndexStringList);
    }

    protected void doSetNonIndexString_NotInScope(Collection<String> nonIndexStringList) {
        regINS(CK_NINS, cTL(nonIndexStringList), xgetCValueNonIndexString(), "NON_INDEX_STRING");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NON_INDEX_STRING: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setNonIndexString_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param nonIndexString The value of nonIndexString as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNonIndexString_LikeSearch(String nonIndexString, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNonIndexString_LikeSearch(nonIndexString, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NON_INDEX_STRING: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setNonIndexString_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nonIndexString The value of nonIndexString as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setNonIndexString_LikeSearch(String nonIndexString, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nonIndexString), xgetCValueNonIndexString(), "NON_INDEX_STRING", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NON_INDEX_STRING: {NotNull, VARCHAR(64)}
     * @param nonIndexString The value of nonIndexString as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNonIndexString_NotLikeSearch(String nonIndexString, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNonIndexString_NotLikeSearch(nonIndexString, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NON_INDEX_STRING: {NotNull, VARCHAR(64)}
     * @param nonIndexString The value of nonIndexString as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setNonIndexString_NotLikeSearch(String nonIndexString, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nonIndexString), xgetCValueNonIndexString(), "NON_INDEX_STRING", likeSearchOption);
    }

    protected void regNonIndexString(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNonIndexString(), "NON_INDEX_STRING"); }
    protected abstract ConditionValue xgetCValueNonIndexString();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NON_INDEX_INTEGER: {NotNull, INT(10)}
     * @param nonIndexInteger The value of nonIndexInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNonIndexInteger_Equal(Integer nonIndexInteger) {
        doSetNonIndexInteger_Equal(nonIndexInteger);
    }

    protected void doSetNonIndexInteger_Equal(Integer nonIndexInteger) {
        regNonIndexInteger(CK_EQ, nonIndexInteger);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NON_INDEX_INTEGER: {NotNull, INT(10)}
     * @param nonIndexInteger The value of nonIndexInteger as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNonIndexInteger_NotEqual(Integer nonIndexInteger) {
        doSetNonIndexInteger_NotEqual(nonIndexInteger);
    }

    protected void doSetNonIndexInteger_NotEqual(Integer nonIndexInteger) {
        regNonIndexInteger(CK_NES, nonIndexInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NON_INDEX_INTEGER: {NotNull, INT(10)}
     * @param nonIndexInteger The value of nonIndexInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNonIndexInteger_GreaterThan(Integer nonIndexInteger) {
        regNonIndexInteger(CK_GT, nonIndexInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NON_INDEX_INTEGER: {NotNull, INT(10)}
     * @param nonIndexInteger The value of nonIndexInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNonIndexInteger_LessThan(Integer nonIndexInteger) {
        regNonIndexInteger(CK_LT, nonIndexInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NON_INDEX_INTEGER: {NotNull, INT(10)}
     * @param nonIndexInteger The value of nonIndexInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNonIndexInteger_GreaterEqual(Integer nonIndexInteger) {
        regNonIndexInteger(CK_GE, nonIndexInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NON_INDEX_INTEGER: {NotNull, INT(10)}
     * @param nonIndexInteger The value of nonIndexInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNonIndexInteger_LessEqual(Integer nonIndexInteger) {
        regNonIndexInteger(CK_LE, nonIndexInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NON_INDEX_INTEGER: {NotNull, INT(10)}
     * @param minNumber The min number of nonIndexInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nonIndexInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNonIndexInteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNonIndexInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NON_INDEX_INTEGER: {NotNull, INT(10)}
     * @param minNumber The min number of nonIndexInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nonIndexInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setNonIndexInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNonIndexInteger(), "NON_INDEX_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NON_INDEX_INTEGER: {NotNull, INT(10)}
     * @param nonIndexIntegerList The collection of nonIndexInteger as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNonIndexInteger_InScope(Collection<Integer> nonIndexIntegerList) {
        doSetNonIndexInteger_InScope(nonIndexIntegerList);
    }

    protected void doSetNonIndexInteger_InScope(Collection<Integer> nonIndexIntegerList) {
        regINS(CK_INS, cTL(nonIndexIntegerList), xgetCValueNonIndexInteger(), "NON_INDEX_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NON_INDEX_INTEGER: {NotNull, INT(10)}
     * @param nonIndexIntegerList The collection of nonIndexInteger as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNonIndexInteger_NotInScope(Collection<Integer> nonIndexIntegerList) {
        doSetNonIndexInteger_NotInScope(nonIndexIntegerList);
    }

    protected void doSetNonIndexInteger_NotInScope(Collection<Integer> nonIndexIntegerList) {
        regINS(CK_NINS, cTL(nonIndexIntegerList), xgetCValueNonIndexInteger(), "NON_INDEX_INTEGER");
    }

    protected void regNonIndexInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNonIndexInteger(), "NON_INDEX_INTEGER"); }
    protected abstract ConditionValue xgetCValueNonIndexInteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NON_INDEX_DATE: {NotNull, DATE(10)}
     * @param nonIndexDate The value of nonIndexDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNonIndexDate_Equal(java.time.LocalDate nonIndexDate) {
        regNonIndexDate(CK_EQ,  nonIndexDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NON_INDEX_DATE: {NotNull, DATE(10)}
     * @param nonIndexDate The value of nonIndexDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNonIndexDate_GreaterThan(java.time.LocalDate nonIndexDate) {
        regNonIndexDate(CK_GT,  nonIndexDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NON_INDEX_DATE: {NotNull, DATE(10)}
     * @param nonIndexDate The value of nonIndexDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNonIndexDate_LessThan(java.time.LocalDate nonIndexDate) {
        regNonIndexDate(CK_LT,  nonIndexDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NON_INDEX_DATE: {NotNull, DATE(10)}
     * @param nonIndexDate The value of nonIndexDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNonIndexDate_GreaterEqual(java.time.LocalDate nonIndexDate) {
        regNonIndexDate(CK_GE,  nonIndexDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NON_INDEX_DATE: {NotNull, DATE(10)}
     * @param nonIndexDate The value of nonIndexDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNonIndexDate_LessEqual(java.time.LocalDate nonIndexDate) {
        regNonIndexDate(CK_LE, nonIndexDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NON_INDEX_DATE: {NotNull, DATE(10)}
     * <pre>e.g. setNonIndexDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nonIndexDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nonIndexDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setNonIndexDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setNonIndexDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NON_INDEX_DATE: {NotNull, DATE(10)}
     * <pre>e.g. setNonIndexDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nonIndexDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nonIndexDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setNonIndexDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "NON_INDEX_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueNonIndexDate(), nm, op);
    }

    protected void regNonIndexDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNonIndexDate(), "NON_INDEX_DATE"); }
    protected abstract ConditionValue xgetCValueNonIndexDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NON_INDEX_DATETIME: {NotNull, DATETIME(19)}
     * @param nonIndexDatetime The value of nonIndexDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNonIndexDatetime_Equal(java.time.LocalDateTime nonIndexDatetime) {
        regNonIndexDatetime(CK_EQ,  nonIndexDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NON_INDEX_DATETIME: {NotNull, DATETIME(19)}
     * @param nonIndexDatetime The value of nonIndexDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNonIndexDatetime_GreaterThan(java.time.LocalDateTime nonIndexDatetime) {
        regNonIndexDatetime(CK_GT,  nonIndexDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NON_INDEX_DATETIME: {NotNull, DATETIME(19)}
     * @param nonIndexDatetime The value of nonIndexDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNonIndexDatetime_LessThan(java.time.LocalDateTime nonIndexDatetime) {
        regNonIndexDatetime(CK_LT,  nonIndexDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NON_INDEX_DATETIME: {NotNull, DATETIME(19)}
     * @param nonIndexDatetime The value of nonIndexDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNonIndexDatetime_GreaterEqual(java.time.LocalDateTime nonIndexDatetime) {
        regNonIndexDatetime(CK_GE,  nonIndexDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NON_INDEX_DATETIME: {NotNull, DATETIME(19)}
     * @param nonIndexDatetime The value of nonIndexDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNonIndexDatetime_LessEqual(java.time.LocalDateTime nonIndexDatetime) {
        regNonIndexDatetime(CK_LE, nonIndexDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NON_INDEX_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setNonIndexDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nonIndexDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nonIndexDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setNonIndexDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setNonIndexDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NON_INDEX_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setNonIndexDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nonIndexDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nonIndexDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setNonIndexDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "NON_INDEX_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueNonIndexDatetime(), nm, op);
    }

    protected void regNonIndexDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNonIndexDatetime(), "NON_INDEX_DATETIME"); }
    protected abstract ConditionValue xgetCValueNonIndexDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NON_INDEX_BOOLEAN: {NotNull, BIT}
     * @param nonIndexBoolean The value of nonIndexBoolean as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNonIndexBoolean_Equal(Boolean nonIndexBoolean) {
        regNonIndexBoolean(CK_EQ, nonIndexBoolean);
    }

    protected void regNonIndexBoolean(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNonIndexBoolean(), "NON_INDEX_BOOLEAN"); }
    protected abstract ConditionValue xgetCValueNonIndexBoolean();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_STRING: {IX, VARCHAR(64)}
     * @param nullableIndexString The value of nullableIndexString as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNullableIndexString_Equal(String nullableIndexString) {
        doSetNullableIndexString_Equal(fRES(nullableIndexString));
    }

    protected void doSetNullableIndexString_Equal(String nullableIndexString) {
        regNullableIndexString(CK_EQ, nullableIndexString);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_STRING: {IX, VARCHAR(64)}
     * @param nullableIndexString The value of nullableIndexString as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNullableIndexString_NotEqual(String nullableIndexString) {
        doSetNullableIndexString_NotEqual(fRES(nullableIndexString));
    }

    protected void doSetNullableIndexString_NotEqual(String nullableIndexString) {
        regNullableIndexString(CK_NES, nullableIndexString);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NULLABLE_INDEX_STRING: {IX, VARCHAR(64)}
     * @param nullableIndexStringList The collection of nullableIndexString as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNullableIndexString_InScope(Collection<String> nullableIndexStringList) {
        doSetNullableIndexString_InScope(nullableIndexStringList);
    }

    protected void doSetNullableIndexString_InScope(Collection<String> nullableIndexStringList) {
        regINS(CK_INS, cTL(nullableIndexStringList), xgetCValueNullableIndexString(), "NULLABLE_INDEX_STRING");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NULLABLE_INDEX_STRING: {IX, VARCHAR(64)}
     * @param nullableIndexStringList The collection of nullableIndexString as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNullableIndexString_NotInScope(Collection<String> nullableIndexStringList) {
        doSetNullableIndexString_NotInScope(nullableIndexStringList);
    }

    protected void doSetNullableIndexString_NotInScope(Collection<String> nullableIndexStringList) {
        regINS(CK_NINS, cTL(nullableIndexStringList), xgetCValueNullableIndexString(), "NULLABLE_INDEX_STRING");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NULLABLE_INDEX_STRING: {IX, VARCHAR(64)} <br>
     * <pre>e.g. setNullableIndexString_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param nullableIndexString The value of nullableIndexString as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNullableIndexString_LikeSearch(String nullableIndexString, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNullableIndexString_LikeSearch(nullableIndexString, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NULLABLE_INDEX_STRING: {IX, VARCHAR(64)} <br>
     * <pre>e.g. setNullableIndexString_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nullableIndexString The value of nullableIndexString as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setNullableIndexString_LikeSearch(String nullableIndexString, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nullableIndexString), xgetCValueNullableIndexString(), "NULLABLE_INDEX_STRING", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NULLABLE_INDEX_STRING: {IX, VARCHAR(64)}
     * @param nullableIndexString The value of nullableIndexString as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNullableIndexString_NotLikeSearch(String nullableIndexString, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNullableIndexString_NotLikeSearch(nullableIndexString, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NULLABLE_INDEX_STRING: {IX, VARCHAR(64)}
     * @param nullableIndexString The value of nullableIndexString as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setNullableIndexString_NotLikeSearch(String nullableIndexString, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nullableIndexString), xgetCValueNullableIndexString(), "NULLABLE_INDEX_STRING", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_STRING: {IX, VARCHAR(64)}
     */
    public void setNullableIndexString_IsNull() { regNullableIndexString(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_STRING: {IX, VARCHAR(64)}
     */
    public void setNullableIndexString_IsNullOrEmpty() { regNullableIndexString(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_STRING: {IX, VARCHAR(64)}
     */
    public void setNullableIndexString_IsNotNull() { regNullableIndexString(CK_ISNN, DOBJ); }

    protected void regNullableIndexString(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNullableIndexString(), "NULLABLE_INDEX_STRING"); }
    protected abstract ConditionValue xgetCValueNullableIndexString();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_INTEGER: {IX, INT(10)}
     * @param nullableIndexInteger The value of nullableIndexInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableIndexInteger_Equal(Integer nullableIndexInteger) {
        doSetNullableIndexInteger_Equal(nullableIndexInteger);
    }

    protected void doSetNullableIndexInteger_Equal(Integer nullableIndexInteger) {
        regNullableIndexInteger(CK_EQ, nullableIndexInteger);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_INTEGER: {IX, INT(10)}
     * @param nullableIndexInteger The value of nullableIndexInteger as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableIndexInteger_NotEqual(Integer nullableIndexInteger) {
        doSetNullableIndexInteger_NotEqual(nullableIndexInteger);
    }

    protected void doSetNullableIndexInteger_NotEqual(Integer nullableIndexInteger) {
        regNullableIndexInteger(CK_NES, nullableIndexInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_INTEGER: {IX, INT(10)}
     * @param nullableIndexInteger The value of nullableIndexInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableIndexInteger_GreaterThan(Integer nullableIndexInteger) {
        regNullableIndexInteger(CK_GT, nullableIndexInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_INTEGER: {IX, INT(10)}
     * @param nullableIndexInteger The value of nullableIndexInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableIndexInteger_LessThan(Integer nullableIndexInteger) {
        regNullableIndexInteger(CK_LT, nullableIndexInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_INTEGER: {IX, INT(10)}
     * @param nullableIndexInteger The value of nullableIndexInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableIndexInteger_GreaterEqual(Integer nullableIndexInteger) {
        regNullableIndexInteger(CK_GE, nullableIndexInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_INTEGER: {IX, INT(10)}
     * @param nullableIndexInteger The value of nullableIndexInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableIndexInteger_LessEqual(Integer nullableIndexInteger) {
        regNullableIndexInteger(CK_LE, nullableIndexInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_INTEGER: {IX, INT(10)}
     * @param minNumber The min number of nullableIndexInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nullableIndexInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNullableIndexInteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNullableIndexInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_INTEGER: {IX, INT(10)}
     * @param minNumber The min number of nullableIndexInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nullableIndexInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setNullableIndexInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNullableIndexInteger(), "NULLABLE_INDEX_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NULLABLE_INDEX_INTEGER: {IX, INT(10)}
     * @param nullableIndexIntegerList The collection of nullableIndexInteger as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNullableIndexInteger_InScope(Collection<Integer> nullableIndexIntegerList) {
        doSetNullableIndexInteger_InScope(nullableIndexIntegerList);
    }

    protected void doSetNullableIndexInteger_InScope(Collection<Integer> nullableIndexIntegerList) {
        regINS(CK_INS, cTL(nullableIndexIntegerList), xgetCValueNullableIndexInteger(), "NULLABLE_INDEX_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NULLABLE_INDEX_INTEGER: {IX, INT(10)}
     * @param nullableIndexIntegerList The collection of nullableIndexInteger as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNullableIndexInteger_NotInScope(Collection<Integer> nullableIndexIntegerList) {
        doSetNullableIndexInteger_NotInScope(nullableIndexIntegerList);
    }

    protected void doSetNullableIndexInteger_NotInScope(Collection<Integer> nullableIndexIntegerList) {
        regINS(CK_NINS, cTL(nullableIndexIntegerList), xgetCValueNullableIndexInteger(), "NULLABLE_INDEX_INTEGER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_INTEGER: {IX, INT(10)}
     */
    public void setNullableIndexInteger_IsNull() { regNullableIndexInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_INTEGER: {IX, INT(10)}
     */
    public void setNullableIndexInteger_IsNotNull() { regNullableIndexInteger(CK_ISNN, DOBJ); }

    protected void regNullableIndexInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNullableIndexInteger(), "NULLABLE_INDEX_INTEGER"); }
    protected abstract ConditionValue xgetCValueNullableIndexInteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_DATE: {IX, DATE(10)}
     * @param nullableIndexDate The value of nullableIndexDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableIndexDate_Equal(java.time.LocalDate nullableIndexDate) {
        regNullableIndexDate(CK_EQ,  nullableIndexDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_DATE: {IX, DATE(10)}
     * @param nullableIndexDate The value of nullableIndexDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableIndexDate_GreaterThan(java.time.LocalDate nullableIndexDate) {
        regNullableIndexDate(CK_GT,  nullableIndexDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_DATE: {IX, DATE(10)}
     * @param nullableIndexDate The value of nullableIndexDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableIndexDate_LessThan(java.time.LocalDate nullableIndexDate) {
        regNullableIndexDate(CK_LT,  nullableIndexDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_DATE: {IX, DATE(10)}
     * @param nullableIndexDate The value of nullableIndexDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableIndexDate_GreaterEqual(java.time.LocalDate nullableIndexDate) {
        regNullableIndexDate(CK_GE,  nullableIndexDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_DATE: {IX, DATE(10)}
     * @param nullableIndexDate The value of nullableIndexDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableIndexDate_LessEqual(java.time.LocalDate nullableIndexDate) {
        regNullableIndexDate(CK_LE, nullableIndexDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_DATE: {IX, DATE(10)}
     * <pre>e.g. setNullableIndexDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nullableIndexDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nullableIndexDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setNullableIndexDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setNullableIndexDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_DATE: {IX, DATE(10)}
     * <pre>e.g. setNullableIndexDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nullableIndexDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nullableIndexDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setNullableIndexDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "NULLABLE_INDEX_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueNullableIndexDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_DATE: {IX, DATE(10)}
     */
    public void setNullableIndexDate_IsNull() { regNullableIndexDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_DATE: {IX, DATE(10)}
     */
    public void setNullableIndexDate_IsNotNull() { regNullableIndexDate(CK_ISNN, DOBJ); }

    protected void regNullableIndexDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNullableIndexDate(), "NULLABLE_INDEX_DATE"); }
    protected abstract ConditionValue xgetCValueNullableIndexDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_DATETIME: {IX, DATETIME(19)}
     * @param nullableIndexDatetime The value of nullableIndexDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableIndexDatetime_Equal(java.time.LocalDateTime nullableIndexDatetime) {
        regNullableIndexDatetime(CK_EQ,  nullableIndexDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_DATETIME: {IX, DATETIME(19)}
     * @param nullableIndexDatetime The value of nullableIndexDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableIndexDatetime_GreaterThan(java.time.LocalDateTime nullableIndexDatetime) {
        regNullableIndexDatetime(CK_GT,  nullableIndexDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_DATETIME: {IX, DATETIME(19)}
     * @param nullableIndexDatetime The value of nullableIndexDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableIndexDatetime_LessThan(java.time.LocalDateTime nullableIndexDatetime) {
        regNullableIndexDatetime(CK_LT,  nullableIndexDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_DATETIME: {IX, DATETIME(19)}
     * @param nullableIndexDatetime The value of nullableIndexDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableIndexDatetime_GreaterEqual(java.time.LocalDateTime nullableIndexDatetime) {
        regNullableIndexDatetime(CK_GE,  nullableIndexDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_DATETIME: {IX, DATETIME(19)}
     * @param nullableIndexDatetime The value of nullableIndexDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableIndexDatetime_LessEqual(java.time.LocalDateTime nullableIndexDatetime) {
        regNullableIndexDatetime(CK_LE, nullableIndexDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_DATETIME: {IX, DATETIME(19)}
     * <pre>e.g. setNullableIndexDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nullableIndexDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nullableIndexDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setNullableIndexDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setNullableIndexDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_DATETIME: {IX, DATETIME(19)}
     * <pre>e.g. setNullableIndexDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nullableIndexDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nullableIndexDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setNullableIndexDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "NULLABLE_INDEX_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueNullableIndexDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_DATETIME: {IX, DATETIME(19)}
     */
    public void setNullableIndexDatetime_IsNull() { regNullableIndexDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_DATETIME: {IX, DATETIME(19)}
     */
    public void setNullableIndexDatetime_IsNotNull() { regNullableIndexDatetime(CK_ISNN, DOBJ); }

    protected void regNullableIndexDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNullableIndexDatetime(), "NULLABLE_INDEX_DATETIME"); }
    protected abstract ConditionValue xgetCValueNullableIndexDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_BOOLEAN: {IX, BIT}
     * @param nullableIndexBoolean The value of nullableIndexBoolean as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableIndexBoolean_Equal(Boolean nullableIndexBoolean) {
        regNullableIndexBoolean(CK_EQ, nullableIndexBoolean);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_BOOLEAN: {IX, BIT}
     */
    public void setNullableIndexBoolean_IsNull() { regNullableIndexBoolean(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NULLABLE_INDEX_BOOLEAN: {IX, BIT}
     */
    public void setNullableIndexBoolean_IsNotNull() { regNullableIndexBoolean(CK_ISNN, DOBJ); }

    protected void regNullableIndexBoolean(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNullableIndexBoolean(), "NULLABLE_INDEX_BOOLEAN"); }
    protected abstract ConditionValue xgetCValueNullableIndexBoolean();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (Self Reference ID)SELF_PARENT_ID: {IX, BIGINT(19), FK to giant_ref}
     * @param selfParentId The value of selfParentId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSelfParentId_Equal(Long selfParentId) {
        doSetSelfParentId_Equal(selfParentId);
    }

    protected void doSetSelfParentId_Equal(Long selfParentId) {
        regSelfParentId(CK_EQ, selfParentId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (Self Reference ID)SELF_PARENT_ID: {IX, BIGINT(19), FK to giant_ref}
     * @param selfParentId The value of selfParentId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSelfParentId_NotEqual(Long selfParentId) {
        doSetSelfParentId_NotEqual(selfParentId);
    }

    protected void doSetSelfParentId_NotEqual(Long selfParentId) {
        regSelfParentId(CK_NES, selfParentId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (Self Reference ID)SELF_PARENT_ID: {IX, BIGINT(19), FK to giant_ref}
     * @param selfParentId The value of selfParentId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSelfParentId_GreaterThan(Long selfParentId) {
        regSelfParentId(CK_GT, selfParentId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (Self Reference ID)SELF_PARENT_ID: {IX, BIGINT(19), FK to giant_ref}
     * @param selfParentId The value of selfParentId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSelfParentId_LessThan(Long selfParentId) {
        regSelfParentId(CK_LT, selfParentId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (Self Reference ID)SELF_PARENT_ID: {IX, BIGINT(19), FK to giant_ref}
     * @param selfParentId The value of selfParentId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSelfParentId_GreaterEqual(Long selfParentId) {
        regSelfParentId(CK_GE, selfParentId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (Self Reference ID)SELF_PARENT_ID: {IX, BIGINT(19), FK to giant_ref}
     * @param selfParentId The value of selfParentId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSelfParentId_LessEqual(Long selfParentId) {
        regSelfParentId(CK_LE, selfParentId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (Self Reference ID)SELF_PARENT_ID: {IX, BIGINT(19), FK to giant_ref}
     * @param minNumber The min number of selfParentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of selfParentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSelfParentId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSelfParentId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (Self Reference ID)SELF_PARENT_ID: {IX, BIGINT(19), FK to giant_ref}
     * @param minNumber The min number of selfParentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of selfParentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSelfParentId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSelfParentId(), "SELF_PARENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (Self Reference ID)SELF_PARENT_ID: {IX, BIGINT(19), FK to giant_ref}
     * @param selfParentIdList The collection of selfParentId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelfParentId_InScope(Collection<Long> selfParentIdList) {
        doSetSelfParentId_InScope(selfParentIdList);
    }

    protected void doSetSelfParentId_InScope(Collection<Long> selfParentIdList) {
        regINS(CK_INS, cTL(selfParentIdList), xgetCValueSelfParentId(), "SELF_PARENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (Self Reference ID)SELF_PARENT_ID: {IX, BIGINT(19), FK to giant_ref}
     * @param selfParentIdList The collection of selfParentId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelfParentId_NotInScope(Collection<Long> selfParentIdList) {
        doSetSelfParentId_NotInScope(selfParentIdList);
    }

    protected void doSetSelfParentId_NotInScope(Collection<Long> selfParentIdList) {
        regINS(CK_NINS, cTL(selfParentIdList), xgetCValueSelfParentId(), "SELF_PARENT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (Self Reference ID)SELF_PARENT_ID: {IX, BIGINT(19), FK to giant_ref}
     */
    public void setSelfParentId_IsNull() { regSelfParentId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (Self Reference ID)SELF_PARENT_ID: {IX, BIGINT(19), FK to giant_ref}
     */
    public void setSelfParentId_IsNotNull() { regSelfParentId(CK_ISNN, DOBJ); }

    protected void regSelfParentId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSelfParentId(), "SELF_PARENT_ID"); }
    protected abstract ConditionValue xgetCValueSelfParentId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique First)UNIQUE_1ST_INTEGER: {UQ+, NotNull, INT(10)}
     * @param unique1stInteger The value of unique1stInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnique1stInteger_Equal(Integer unique1stInteger) {
        doSetUnique1stInteger_Equal(unique1stInteger);
    }

    protected void doSetUnique1stInteger_Equal(Integer unique1stInteger) {
        regUnique1stInteger(CK_EQ, unique1stInteger);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique First)UNIQUE_1ST_INTEGER: {UQ+, NotNull, INT(10)}
     * @param unique1stInteger The value of unique1stInteger as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnique1stInteger_NotEqual(Integer unique1stInteger) {
        doSetUnique1stInteger_NotEqual(unique1stInteger);
    }

    protected void doSetUnique1stInteger_NotEqual(Integer unique1stInteger) {
        regUnique1stInteger(CK_NES, unique1stInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique First)UNIQUE_1ST_INTEGER: {UQ+, NotNull, INT(10)}
     * @param unique1stInteger The value of unique1stInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnique1stInteger_GreaterThan(Integer unique1stInteger) {
        regUnique1stInteger(CK_GT, unique1stInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique First)UNIQUE_1ST_INTEGER: {UQ+, NotNull, INT(10)}
     * @param unique1stInteger The value of unique1stInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnique1stInteger_LessThan(Integer unique1stInteger) {
        regUnique1stInteger(CK_LT, unique1stInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique First)UNIQUE_1ST_INTEGER: {UQ+, NotNull, INT(10)}
     * @param unique1stInteger The value of unique1stInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnique1stInteger_GreaterEqual(Integer unique1stInteger) {
        regUnique1stInteger(CK_GE, unique1stInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique First)UNIQUE_1ST_INTEGER: {UQ+, NotNull, INT(10)}
     * @param unique1stInteger The value of unique1stInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnique1stInteger_LessEqual(Integer unique1stInteger) {
        regUnique1stInteger(CK_LE, unique1stInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique First)UNIQUE_1ST_INTEGER: {UQ+, NotNull, INT(10)}
     * @param minNumber The min number of unique1stInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unique1stInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUnique1stInteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUnique1stInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique First)UNIQUE_1ST_INTEGER: {UQ+, NotNull, INT(10)}
     * @param minNumber The min number of unique1stInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unique1stInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUnique1stInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnique1stInteger(), "UNIQUE_1ST_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (Compound Unique First)UNIQUE_1ST_INTEGER: {UQ+, NotNull, INT(10)}
     * @param unique1stIntegerList The collection of unique1stInteger as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnique1stInteger_InScope(Collection<Integer> unique1stIntegerList) {
        doSetUnique1stInteger_InScope(unique1stIntegerList);
    }

    protected void doSetUnique1stInteger_InScope(Collection<Integer> unique1stIntegerList) {
        regINS(CK_INS, cTL(unique1stIntegerList), xgetCValueUnique1stInteger(), "UNIQUE_1ST_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (Compound Unique First)UNIQUE_1ST_INTEGER: {UQ+, NotNull, INT(10)}
     * @param unique1stIntegerList The collection of unique1stInteger as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnique1stInteger_NotInScope(Collection<Integer> unique1stIntegerList) {
        doSetUnique1stInteger_NotInScope(unique1stIntegerList);
    }

    protected void doSetUnique1stInteger_NotInScope(Collection<Integer> unique1stIntegerList) {
        regINS(CK_NINS, cTL(unique1stIntegerList), xgetCValueUnique1stInteger(), "UNIQUE_1ST_INTEGER");
    }

    protected void regUnique1stInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnique1stInteger(), "UNIQUE_1ST_INTEGER"); }
    protected abstract ConditionValue xgetCValueUnique1stInteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique Second)UNIQUE_2ND_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @param unique2ndInteger The value of unique2ndInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnique2ndInteger_Equal(Integer unique2ndInteger) {
        doSetUnique2ndInteger_Equal(unique2ndInteger);
    }

    protected void doSetUnique2ndInteger_Equal(Integer unique2ndInteger) {
        regUnique2ndInteger(CK_EQ, unique2ndInteger);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique Second)UNIQUE_2ND_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @param unique2ndInteger The value of unique2ndInteger as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnique2ndInteger_NotEqual(Integer unique2ndInteger) {
        doSetUnique2ndInteger_NotEqual(unique2ndInteger);
    }

    protected void doSetUnique2ndInteger_NotEqual(Integer unique2ndInteger) {
        regUnique2ndInteger(CK_NES, unique2ndInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique Second)UNIQUE_2ND_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @param unique2ndInteger The value of unique2ndInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnique2ndInteger_GreaterThan(Integer unique2ndInteger) {
        regUnique2ndInteger(CK_GT, unique2ndInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique Second)UNIQUE_2ND_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @param unique2ndInteger The value of unique2ndInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnique2ndInteger_LessThan(Integer unique2ndInteger) {
        regUnique2ndInteger(CK_LT, unique2ndInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique Second)UNIQUE_2ND_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @param unique2ndInteger The value of unique2ndInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnique2ndInteger_GreaterEqual(Integer unique2ndInteger) {
        regUnique2ndInteger(CK_GE, unique2ndInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique Second)UNIQUE_2ND_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @param unique2ndInteger The value of unique2ndInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnique2ndInteger_LessEqual(Integer unique2ndInteger) {
        regUnique2ndInteger(CK_LE, unique2ndInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique Second)UNIQUE_2ND_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @param minNumber The min number of unique2ndInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unique2ndInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUnique2ndInteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUnique2ndInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique Second)UNIQUE_2ND_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @param minNumber The min number of unique2ndInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unique2ndInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUnique2ndInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnique2ndInteger(), "UNIQUE_2ND_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (Compound Unique Second)UNIQUE_2ND_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @param unique2ndIntegerList The collection of unique2ndInteger as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnique2ndInteger_InScope(Collection<Integer> unique2ndIntegerList) {
        doSetUnique2ndInteger_InScope(unique2ndIntegerList);
    }

    protected void doSetUnique2ndInteger_InScope(Collection<Integer> unique2ndIntegerList) {
        regINS(CK_INS, cTL(unique2ndIntegerList), xgetCValueUnique2ndInteger(), "UNIQUE_2ND_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (Compound Unique Second)UNIQUE_2ND_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @param unique2ndIntegerList The collection of unique2ndInteger as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnique2ndInteger_NotInScope(Collection<Integer> unique2ndIntegerList) {
        doSetUnique2ndInteger_NotInScope(unique2ndIntegerList);
    }

    protected void doSetUnique2ndInteger_NotInScope(Collection<Integer> unique2ndIntegerList) {
        regINS(CK_NINS, cTL(unique2ndIntegerList), xgetCValueUnique2ndInteger(), "UNIQUE_2ND_INTEGER");
    }

    protected void regUnique2ndInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnique2ndInteger(), "UNIQUE_2ND_INTEGER"); }
    protected abstract ConditionValue xgetCValueUnique2ndInteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique Third)UNIQUE_3RD_INTEGER: {+UQ, NotNull, INT(10)}
     * @param unique3rdInteger The value of unique3rdInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnique3rdInteger_Equal(Integer unique3rdInteger) {
        doSetUnique3rdInteger_Equal(unique3rdInteger);
    }

    protected void doSetUnique3rdInteger_Equal(Integer unique3rdInteger) {
        regUnique3rdInteger(CK_EQ, unique3rdInteger);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique Third)UNIQUE_3RD_INTEGER: {+UQ, NotNull, INT(10)}
     * @param unique3rdInteger The value of unique3rdInteger as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnique3rdInteger_NotEqual(Integer unique3rdInteger) {
        doSetUnique3rdInteger_NotEqual(unique3rdInteger);
    }

    protected void doSetUnique3rdInteger_NotEqual(Integer unique3rdInteger) {
        regUnique3rdInteger(CK_NES, unique3rdInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique Third)UNIQUE_3RD_INTEGER: {+UQ, NotNull, INT(10)}
     * @param unique3rdInteger The value of unique3rdInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnique3rdInteger_GreaterThan(Integer unique3rdInteger) {
        regUnique3rdInteger(CK_GT, unique3rdInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique Third)UNIQUE_3RD_INTEGER: {+UQ, NotNull, INT(10)}
     * @param unique3rdInteger The value of unique3rdInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnique3rdInteger_LessThan(Integer unique3rdInteger) {
        regUnique3rdInteger(CK_LT, unique3rdInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique Third)UNIQUE_3RD_INTEGER: {+UQ, NotNull, INT(10)}
     * @param unique3rdInteger The value of unique3rdInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnique3rdInteger_GreaterEqual(Integer unique3rdInteger) {
        regUnique3rdInteger(CK_GE, unique3rdInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique Third)UNIQUE_3RD_INTEGER: {+UQ, NotNull, INT(10)}
     * @param unique3rdInteger The value of unique3rdInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnique3rdInteger_LessEqual(Integer unique3rdInteger) {
        regUnique3rdInteger(CK_LE, unique3rdInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique Third)UNIQUE_3RD_INTEGER: {+UQ, NotNull, INT(10)}
     * @param minNumber The min number of unique3rdInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unique3rdInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUnique3rdInteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUnique3rdInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique Third)UNIQUE_3RD_INTEGER: {+UQ, NotNull, INT(10)}
     * @param minNumber The min number of unique3rdInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unique3rdInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUnique3rdInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnique3rdInteger(), "UNIQUE_3RD_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (Compound Unique Third)UNIQUE_3RD_INTEGER: {+UQ, NotNull, INT(10)}
     * @param unique3rdIntegerList The collection of unique3rdInteger as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnique3rdInteger_InScope(Collection<Integer> unique3rdIntegerList) {
        doSetUnique3rdInteger_InScope(unique3rdIntegerList);
    }

    protected void doSetUnique3rdInteger_InScope(Collection<Integer> unique3rdIntegerList) {
        regINS(CK_INS, cTL(unique3rdIntegerList), xgetCValueUnique3rdInteger(), "UNIQUE_3RD_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (Compound Unique Third)UNIQUE_3RD_INTEGER: {+UQ, NotNull, INT(10)}
     * @param unique3rdIntegerList The collection of unique3rdInteger as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnique3rdInteger_NotInScope(Collection<Integer> unique3rdIntegerList) {
        doSetUnique3rdInteger_NotInScope(unique3rdIntegerList);
    }

    protected void doSetUnique3rdInteger_NotInScope(Collection<Integer> unique3rdIntegerList) {
        regINS(CK_NINS, cTL(unique3rdIntegerList), xgetCValueUnique3rdInteger(), "UNIQUE_3RD_INTEGER");
    }

    protected void regUnique3rdInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnique3rdInteger(), "UNIQUE_3RD_INTEGER"); }
    protected abstract ConditionValue xgetCValueUnique3rdInteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique Fourth)UNIQUE_4TH_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @param unique4thInteger The value of unique4thInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnique4thInteger_Equal(Integer unique4thInteger) {
        doSetUnique4thInteger_Equal(unique4thInteger);
    }

    protected void doSetUnique4thInteger_Equal(Integer unique4thInteger) {
        regUnique4thInteger(CK_EQ, unique4thInteger);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique Fourth)UNIQUE_4TH_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @param unique4thInteger The value of unique4thInteger as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnique4thInteger_NotEqual(Integer unique4thInteger) {
        doSetUnique4thInteger_NotEqual(unique4thInteger);
    }

    protected void doSetUnique4thInteger_NotEqual(Integer unique4thInteger) {
        regUnique4thInteger(CK_NES, unique4thInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique Fourth)UNIQUE_4TH_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @param unique4thInteger The value of unique4thInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnique4thInteger_GreaterThan(Integer unique4thInteger) {
        regUnique4thInteger(CK_GT, unique4thInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique Fourth)UNIQUE_4TH_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @param unique4thInteger The value of unique4thInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnique4thInteger_LessThan(Integer unique4thInteger) {
        regUnique4thInteger(CK_LT, unique4thInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique Fourth)UNIQUE_4TH_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @param unique4thInteger The value of unique4thInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnique4thInteger_GreaterEqual(Integer unique4thInteger) {
        regUnique4thInteger(CK_GE, unique4thInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique Fourth)UNIQUE_4TH_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @param unique4thInteger The value of unique4thInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnique4thInteger_LessEqual(Integer unique4thInteger) {
        regUnique4thInteger(CK_LE, unique4thInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique Fourth)UNIQUE_4TH_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @param minNumber The min number of unique4thInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unique4thInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUnique4thInteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUnique4thInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (Compound Unique Fourth)UNIQUE_4TH_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @param minNumber The min number of unique4thInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unique4thInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUnique4thInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnique4thInteger(), "UNIQUE_4TH_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (Compound Unique Fourth)UNIQUE_4TH_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @param unique4thIntegerList The collection of unique4thInteger as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnique4thInteger_InScope(Collection<Integer> unique4thIntegerList) {
        doSetUnique4thInteger_InScope(unique4thIntegerList);
    }

    protected void doSetUnique4thInteger_InScope(Collection<Integer> unique4thIntegerList) {
        regINS(CK_INS, cTL(unique4thIntegerList), xgetCValueUnique4thInteger(), "UNIQUE_4TH_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (Compound Unique Fourth)UNIQUE_4TH_INTEGER: {+UQ, IX, NotNull, INT(10)}
     * @param unique4thIntegerList The collection of unique4thInteger as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnique4thInteger_NotInScope(Collection<Integer> unique4thIntegerList) {
        doSetUnique4thInteger_NotInScope(unique4thIntegerList);
    }

    protected void doSetUnique4thInteger_NotInScope(Collection<Integer> unique4thIntegerList) {
        regINS(CK_NINS, cTL(unique4thIntegerList), xgetCValueUnique4thInteger(), "UNIQUE_4TH_INTEGER");
    }

    protected void regUnique4thInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnique4thInteger(), "UNIQUE_4TH_INTEGER"); }
    protected abstract ConditionValue xgetCValueUnique4thInteger();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIQUE_STRING: {UQ, NotNull, VARCHAR(64)}
     * @param uniqueString The value of uniqueString as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniqueString_Equal(String uniqueString) {
        doSetUniqueString_Equal(fRES(uniqueString));
    }

    protected void doSetUniqueString_Equal(String uniqueString) {
        regUniqueString(CK_EQ, uniqueString);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIQUE_STRING: {UQ, NotNull, VARCHAR(64)}
     * @param uniqueString The value of uniqueString as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniqueString_NotEqual(String uniqueString) {
        doSetUniqueString_NotEqual(fRES(uniqueString));
    }

    protected void doSetUniqueString_NotEqual(String uniqueString) {
        regUniqueString(CK_NES, uniqueString);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIQUE_STRING: {UQ, NotNull, VARCHAR(64)}
     * @param uniqueStringList The collection of uniqueString as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniqueString_InScope(Collection<String> uniqueStringList) {
        doSetUniqueString_InScope(uniqueStringList);
    }

    protected void doSetUniqueString_InScope(Collection<String> uniqueStringList) {
        regINS(CK_INS, cTL(uniqueStringList), xgetCValueUniqueString(), "UNIQUE_STRING");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIQUE_STRING: {UQ, NotNull, VARCHAR(64)}
     * @param uniqueStringList The collection of uniqueString as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniqueString_NotInScope(Collection<String> uniqueStringList) {
        doSetUniqueString_NotInScope(uniqueStringList);
    }

    protected void doSetUniqueString_NotInScope(Collection<String> uniqueStringList) {
        regINS(CK_NINS, cTL(uniqueStringList), xgetCValueUniqueString(), "UNIQUE_STRING");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIQUE_STRING: {UQ, NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setUniqueString_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param uniqueString The value of uniqueString as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUniqueString_LikeSearch(String uniqueString, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUniqueString_LikeSearch(uniqueString, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIQUE_STRING: {UQ, NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setUniqueString_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param uniqueString The value of uniqueString as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUniqueString_LikeSearch(String uniqueString, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(uniqueString), xgetCValueUniqueString(), "UNIQUE_STRING", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIQUE_STRING: {UQ, NotNull, VARCHAR(64)}
     * @param uniqueString The value of uniqueString as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUniqueString_NotLikeSearch(String uniqueString, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUniqueString_NotLikeSearch(uniqueString, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIQUE_STRING: {UQ, NotNull, VARCHAR(64)}
     * @param uniqueString The value of uniqueString as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUniqueString_NotLikeSearch(String uniqueString, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(uniqueString), xgetCValueUniqueString(), "UNIQUE_STRING", likeSearchOption);
    }

    protected void regUniqueString(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUniqueString(), "UNIQUE_STRING"); }
    protected abstract ConditionValue xgetCValueUniqueString();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIQUE_INTEGER: {UQ, NotNull, INT(10)}
     * @param uniqueInteger The value of uniqueInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUniqueInteger_Equal(Integer uniqueInteger) {
        doSetUniqueInteger_Equal(uniqueInteger);
    }

    protected void doSetUniqueInteger_Equal(Integer uniqueInteger) {
        regUniqueInteger(CK_EQ, uniqueInteger);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIQUE_INTEGER: {UQ, NotNull, INT(10)}
     * @param uniqueInteger The value of uniqueInteger as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUniqueInteger_NotEqual(Integer uniqueInteger) {
        doSetUniqueInteger_NotEqual(uniqueInteger);
    }

    protected void doSetUniqueInteger_NotEqual(Integer uniqueInteger) {
        regUniqueInteger(CK_NES, uniqueInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIQUE_INTEGER: {UQ, NotNull, INT(10)}
     * @param uniqueInteger The value of uniqueInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUniqueInteger_GreaterThan(Integer uniqueInteger) {
        regUniqueInteger(CK_GT, uniqueInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIQUE_INTEGER: {UQ, NotNull, INT(10)}
     * @param uniqueInteger The value of uniqueInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUniqueInteger_LessThan(Integer uniqueInteger) {
        regUniqueInteger(CK_LT, uniqueInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIQUE_INTEGER: {UQ, NotNull, INT(10)}
     * @param uniqueInteger The value of uniqueInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUniqueInteger_GreaterEqual(Integer uniqueInteger) {
        regUniqueInteger(CK_GE, uniqueInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIQUE_INTEGER: {UQ, NotNull, INT(10)}
     * @param uniqueInteger The value of uniqueInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUniqueInteger_LessEqual(Integer uniqueInteger) {
        regUniqueInteger(CK_LE, uniqueInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UNIQUE_INTEGER: {UQ, NotNull, INT(10)}
     * @param minNumber The min number of uniqueInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of uniqueInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUniqueInteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUniqueInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UNIQUE_INTEGER: {UQ, NotNull, INT(10)}
     * @param minNumber The min number of uniqueInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of uniqueInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUniqueInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUniqueInteger(), "UNIQUE_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIQUE_INTEGER: {UQ, NotNull, INT(10)}
     * @param uniqueIntegerList The collection of uniqueInteger as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniqueInteger_InScope(Collection<Integer> uniqueIntegerList) {
        doSetUniqueInteger_InScope(uniqueIntegerList);
    }

    protected void doSetUniqueInteger_InScope(Collection<Integer> uniqueIntegerList) {
        regINS(CK_INS, cTL(uniqueIntegerList), xgetCValueUniqueInteger(), "UNIQUE_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIQUE_INTEGER: {UQ, NotNull, INT(10)}
     * @param uniqueIntegerList The collection of uniqueInteger as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniqueInteger_NotInScope(Collection<Integer> uniqueIntegerList) {
        doSetUniqueInteger_NotInScope(uniqueIntegerList);
    }

    protected void doSetUniqueInteger_NotInScope(Collection<Integer> uniqueIntegerList) {
        regINS(CK_NINS, cTL(uniqueIntegerList), xgetCValueUniqueInteger(), "UNIQUE_INTEGER");
    }

    protected void regUniqueInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUniqueInteger(), "UNIQUE_INTEGER"); }
    protected abstract ConditionValue xgetCValueUniqueInteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_MEMBER_ID: {IX, NotNull, INT(10), FK to member}
     * @param zoneMemberId The value of zoneMemberId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneMemberId_Equal(Integer zoneMemberId) {
        doSetZoneMemberId_Equal(zoneMemberId);
    }

    protected void doSetZoneMemberId_Equal(Integer zoneMemberId) {
        regZoneMemberId(CK_EQ, zoneMemberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_MEMBER_ID: {IX, NotNull, INT(10), FK to member}
     * @param zoneMemberId The value of zoneMemberId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneMemberId_NotEqual(Integer zoneMemberId) {
        doSetZoneMemberId_NotEqual(zoneMemberId);
    }

    protected void doSetZoneMemberId_NotEqual(Integer zoneMemberId) {
        regZoneMemberId(CK_NES, zoneMemberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_MEMBER_ID: {IX, NotNull, INT(10), FK to member}
     * @param zoneMemberId The value of zoneMemberId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneMemberId_GreaterThan(Integer zoneMemberId) {
        regZoneMemberId(CK_GT, zoneMemberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_MEMBER_ID: {IX, NotNull, INT(10), FK to member}
     * @param zoneMemberId The value of zoneMemberId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneMemberId_LessThan(Integer zoneMemberId) {
        regZoneMemberId(CK_LT, zoneMemberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_MEMBER_ID: {IX, NotNull, INT(10), FK to member}
     * @param zoneMemberId The value of zoneMemberId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneMemberId_GreaterEqual(Integer zoneMemberId) {
        regZoneMemberId(CK_GE, zoneMemberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_MEMBER_ID: {IX, NotNull, INT(10), FK to member}
     * @param zoneMemberId The value of zoneMemberId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneMemberId_LessEqual(Integer zoneMemberId) {
        regZoneMemberId(CK_LE, zoneMemberId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_MEMBER_ID: {IX, NotNull, INT(10), FK to member}
     * @param minNumber The min number of zoneMemberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of zoneMemberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setZoneMemberId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setZoneMemberId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_MEMBER_ID: {IX, NotNull, INT(10), FK to member}
     * @param minNumber The min number of zoneMemberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of zoneMemberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setZoneMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueZoneMemberId(), "ZONE_MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ZONE_MEMBER_ID: {IX, NotNull, INT(10), FK to member}
     * @param zoneMemberIdList The collection of zoneMemberId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneMemberId_InScope(Collection<Integer> zoneMemberIdList) {
        doSetZoneMemberId_InScope(zoneMemberIdList);
    }

    protected void doSetZoneMemberId_InScope(Collection<Integer> zoneMemberIdList) {
        regINS(CK_INS, cTL(zoneMemberIdList), xgetCValueZoneMemberId(), "ZONE_MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ZONE_MEMBER_ID: {IX, NotNull, INT(10), FK to member}
     * @param zoneMemberIdList The collection of zoneMemberId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneMemberId_NotInScope(Collection<Integer> zoneMemberIdList) {
        doSetZoneMemberId_NotInScope(zoneMemberIdList);
    }

    protected void doSetZoneMemberId_NotInScope(Collection<Integer> zoneMemberIdList) {
        regINS(CK_NINS, cTL(zoneMemberIdList), xgetCValueZoneMemberId(), "ZONE_MEMBER_ID");
    }

    protected void regZoneMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZoneMemberId(), "ZONE_MEMBER_ID"); }
    protected abstract ConditionValue xgetCValueZoneMemberId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase}
     * @param zonePurchaseId The value of zonePurchaseId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setZonePurchaseId_Equal(Long zonePurchaseId) {
        doSetZonePurchaseId_Equal(zonePurchaseId);
    }

    protected void doSetZonePurchaseId_Equal(Long zonePurchaseId) {
        regZonePurchaseId(CK_EQ, zonePurchaseId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase}
     * @param zonePurchaseId The value of zonePurchaseId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZonePurchaseId_NotEqual(Long zonePurchaseId) {
        doSetZonePurchaseId_NotEqual(zonePurchaseId);
    }

    protected void doSetZonePurchaseId_NotEqual(Long zonePurchaseId) {
        regZonePurchaseId(CK_NES, zonePurchaseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase}
     * @param zonePurchaseId The value of zonePurchaseId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZonePurchaseId_GreaterThan(Long zonePurchaseId) {
        regZonePurchaseId(CK_GT, zonePurchaseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase}
     * @param zonePurchaseId The value of zonePurchaseId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZonePurchaseId_LessThan(Long zonePurchaseId) {
        regZonePurchaseId(CK_LT, zonePurchaseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase}
     * @param zonePurchaseId The value of zonePurchaseId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZonePurchaseId_GreaterEqual(Long zonePurchaseId) {
        regZonePurchaseId(CK_GE, zonePurchaseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase}
     * @param zonePurchaseId The value of zonePurchaseId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZonePurchaseId_LessEqual(Long zonePurchaseId) {
        regZonePurchaseId(CK_LE, zonePurchaseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase}
     * @param minNumber The min number of zonePurchaseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of zonePurchaseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setZonePurchaseId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setZonePurchaseId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase}
     * @param minNumber The min number of zonePurchaseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of zonePurchaseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setZonePurchaseId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueZonePurchaseId(), "ZONE_PURCHASE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ZONE_PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase}
     * @param zonePurchaseIdList The collection of zonePurchaseId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZonePurchaseId_InScope(Collection<Long> zonePurchaseIdList) {
        doSetZonePurchaseId_InScope(zonePurchaseIdList);
    }

    protected void doSetZonePurchaseId_InScope(Collection<Long> zonePurchaseIdList) {
        regINS(CK_INS, cTL(zonePurchaseIdList), xgetCValueZonePurchaseId(), "ZONE_PURCHASE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ZONE_PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase}
     * @param zonePurchaseIdList The collection of zonePurchaseId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZonePurchaseId_NotInScope(Collection<Long> zonePurchaseIdList) {
        doSetZonePurchaseId_NotInScope(zonePurchaseIdList);
    }

    protected void doSetZonePurchaseId_NotInScope(Collection<Long> zonePurchaseIdList) {
        regINS(CK_NINS, cTL(zonePurchaseIdList), xgetCValueZonePurchaseId(), "ZONE_PURCHASE_ID");
    }

    protected void regZonePurchaseId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZonePurchaseId(), "ZONE_PURCHASE_ID"); }
    protected abstract ConditionValue xgetCValueZonePurchaseId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_PRODUCT_ID: {IX, NotNull, INT(10), FK to product}
     * @param zoneProductId The value of zoneProductId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneProductId_Equal(Integer zoneProductId) {
        doSetZoneProductId_Equal(zoneProductId);
    }

    protected void doSetZoneProductId_Equal(Integer zoneProductId) {
        regZoneProductId(CK_EQ, zoneProductId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_PRODUCT_ID: {IX, NotNull, INT(10), FK to product}
     * @param zoneProductId The value of zoneProductId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneProductId_NotEqual(Integer zoneProductId) {
        doSetZoneProductId_NotEqual(zoneProductId);
    }

    protected void doSetZoneProductId_NotEqual(Integer zoneProductId) {
        regZoneProductId(CK_NES, zoneProductId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_PRODUCT_ID: {IX, NotNull, INT(10), FK to product}
     * @param zoneProductId The value of zoneProductId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneProductId_GreaterThan(Integer zoneProductId) {
        regZoneProductId(CK_GT, zoneProductId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_PRODUCT_ID: {IX, NotNull, INT(10), FK to product}
     * @param zoneProductId The value of zoneProductId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneProductId_LessThan(Integer zoneProductId) {
        regZoneProductId(CK_LT, zoneProductId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_PRODUCT_ID: {IX, NotNull, INT(10), FK to product}
     * @param zoneProductId The value of zoneProductId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneProductId_GreaterEqual(Integer zoneProductId) {
        regZoneProductId(CK_GE, zoneProductId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_PRODUCT_ID: {IX, NotNull, INT(10), FK to product}
     * @param zoneProductId The value of zoneProductId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneProductId_LessEqual(Integer zoneProductId) {
        regZoneProductId(CK_LE, zoneProductId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_PRODUCT_ID: {IX, NotNull, INT(10), FK to product}
     * @param minNumber The min number of zoneProductId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of zoneProductId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setZoneProductId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setZoneProductId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_PRODUCT_ID: {IX, NotNull, INT(10), FK to product}
     * @param minNumber The min number of zoneProductId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of zoneProductId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setZoneProductId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueZoneProductId(), "ZONE_PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ZONE_PRODUCT_ID: {IX, NotNull, INT(10), FK to product}
     * @param zoneProductIdList The collection of zoneProductId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneProductId_InScope(Collection<Integer> zoneProductIdList) {
        doSetZoneProductId_InScope(zoneProductIdList);
    }

    protected void doSetZoneProductId_InScope(Collection<Integer> zoneProductIdList) {
        regINS(CK_INS, cTL(zoneProductIdList), xgetCValueZoneProductId(), "ZONE_PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ZONE_PRODUCT_ID: {IX, NotNull, INT(10), FK to product}
     * @param zoneProductIdList The collection of zoneProductId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneProductId_NotInScope(Collection<Integer> zoneProductIdList) {
        doSetZoneProductId_NotInScope(zoneProductIdList);
    }

    protected void doSetZoneProductId_NotInScope(Collection<Integer> zoneProductIdList) {
        regINS(CK_NINS, cTL(zoneProductIdList), xgetCValueZoneProductId(), "ZONE_PRODUCT_ID");
    }

    protected void regZoneProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZoneProductId(), "ZONE_PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueZoneProductId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<GiantRefCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, GiantRefCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<GiantRefCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, GiantRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<GiantRefCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, GiantRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<GiantRefCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, GiantRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<GiantRefCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, GiantRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;GiantRefCB&gt;() {
     *     public void query(GiantRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<GiantRefCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, GiantRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        GiantRefCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(GiantRefCQ sq);

    protected GiantRefCB xcreateScalarConditionCB() {
        GiantRefCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected GiantRefCB xcreateScalarConditionPartitionByCB() {
        GiantRefCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<GiantRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        GiantRefCB cb = new GiantRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "GIANT_REF_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(GiantRefCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<GiantRefCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(GiantRefCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        GiantRefCB cb = new GiantRefCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "GIANT_REF_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(GiantRefCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<GiantRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        GiantRefCB cb = new GiantRefCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(GiantRefCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected GiantRefCB newMyCB() {
        return new GiantRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return GiantRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
