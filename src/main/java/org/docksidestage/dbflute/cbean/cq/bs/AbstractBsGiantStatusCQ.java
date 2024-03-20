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
 * The abstract condition-query of giant_status.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsGiantStatusCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsGiantStatusCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "giant_status";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIANT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=GiantStatus}
     * @param giantStatusCode The value of giantStatusCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setGiantStatusCode_Equal(String giantStatusCode) {
        doSetGiantStatusCode_Equal(fRES(giantStatusCode));
    }

    /**
     * Equal(=). As GiantStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIANT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=GiantStatus} <br>
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
     * GIANT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=GiantStatus}
     * @param giantStatusCode The value of giantStatusCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setGiantStatusCode_NotEqual(String giantStatusCode) {
        doSetGiantStatusCode_NotEqual(fRES(giantStatusCode));
    }

    /**
     * NotEqual(&lt;&gt;). As GiantStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIANT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=GiantStatus} <br>
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
     * GIANT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=GiantStatus}
     * @param giantStatusCodeList The collection of giantStatusCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setGiantStatusCode_InScope(Collection<String> giantStatusCodeList) {
        doSetGiantStatusCode_InScope(giantStatusCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As GiantStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIANT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=GiantStatus} <br>
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
     * GIANT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=GiantStatus}
     * @param giantStatusCodeList The collection of giantStatusCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setGiantStatusCode_NotInScope(Collection<String> giantStatusCodeList) {
        doSetGiantStatusCode_NotInScope(giantStatusCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As GiantStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIANT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=GiantStatus} <br>
     * status of giant tables
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiantStatusCode_NotInScope_AsGiantStatus(Collection<CDef.GiantStatus> cdefList) {
        doSetGiantStatusCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetGiantStatusCode_NotInScope(Collection<String> giantStatusCodeList) {
        regINS(CK_NINS, cTL(giantStatusCodeList), xgetCValueGiantStatusCode(), "GIANT_STATUS_CODE");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select GIANT_STATUS_CODE from giant where ...)} <br>
     * (Giant as base point)giant by GIANT_STATUS_CODE, named 'giantAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsGiant</span>(giantCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     giantCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of GiantList for 'exists'. (NotNull)
     */
    public void existsGiant(SubQuery<GiantCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        GiantCB cb = new GiantCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGiantStatusCode_ExistsReferrer_GiantList(cb.query());
        registerExistsReferrer(cb.query(), "GIANT_STATUS_CODE", "GIANT_STATUS_CODE", pp, "giantList");
    }
    public abstract String keepGiantStatusCode_ExistsReferrer_GiantList(GiantCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select GIANT_STATUS_CODE from giant_ref where ...)} <br>
     * (Referrer of Giant)giant_ref by GIANT_STATUS_CODE, named 'giantRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsGiantRef</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of GiantRefList for 'exists'. (NotNull)
     */
    public void existsGiantRef(SubQuery<GiantRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        GiantRefCB cb = new GiantRefCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGiantStatusCode_ExistsReferrer_GiantRefList(cb.query());
        registerExistsReferrer(cb.query(), "GIANT_STATUS_CODE", "GIANT_STATUS_CODE", pp, "giantRefList");
    }
    public abstract String keepGiantStatusCode_ExistsReferrer_GiantRefList(GiantRefCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select GIANT_STATUS_CODE from giant_side where ...)} <br>
     * (simple Side of Giant)giant_side by GIANT_STATUS_CODE, named 'giantSideAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsGiantSide</span>(sideCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     sideCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of GiantSideList for 'exists'. (NotNull)
     */
    public void existsGiantSide(SubQuery<GiantSideCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        GiantSideCB cb = new GiantSideCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGiantStatusCode_ExistsReferrer_GiantSideList(cb.query());
        registerExistsReferrer(cb.query(), "GIANT_STATUS_CODE", "GIANT_STATUS_CODE", pp, "giantSideList");
    }
    public abstract String keepGiantStatusCode_ExistsReferrer_GiantSideList(GiantSideCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select GIANT_STATUS_CODE from giant where ...)} <br>
     * (Giant as base point)giant by GIANT_STATUS_CODE, named 'giantAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsGiant</span>(giantCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     giantCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of GiantStatusCode_NotExistsReferrer_GiantList for 'not exists'. (NotNull)
     */
    public void notExistsGiant(SubQuery<GiantCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        GiantCB cb = new GiantCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGiantStatusCode_NotExistsReferrer_GiantList(cb.query());
        registerNotExistsReferrer(cb.query(), "GIANT_STATUS_CODE", "GIANT_STATUS_CODE", pp, "giantList");
    }
    public abstract String keepGiantStatusCode_NotExistsReferrer_GiantList(GiantCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select GIANT_STATUS_CODE from giant_ref where ...)} <br>
     * (Referrer of Giant)giant_ref by GIANT_STATUS_CODE, named 'giantRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsGiantRef</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of GiantStatusCode_NotExistsReferrer_GiantRefList for 'not exists'. (NotNull)
     */
    public void notExistsGiantRef(SubQuery<GiantRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        GiantRefCB cb = new GiantRefCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGiantStatusCode_NotExistsReferrer_GiantRefList(cb.query());
        registerNotExistsReferrer(cb.query(), "GIANT_STATUS_CODE", "GIANT_STATUS_CODE", pp, "giantRefList");
    }
    public abstract String keepGiantStatusCode_NotExistsReferrer_GiantRefList(GiantRefCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select GIANT_STATUS_CODE from giant_side where ...)} <br>
     * (simple Side of Giant)giant_side by GIANT_STATUS_CODE, named 'giantSideAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsGiantSide</span>(sideCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     sideCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of GiantStatusCode_NotExistsReferrer_GiantSideList for 'not exists'. (NotNull)
     */
    public void notExistsGiantSide(SubQuery<GiantSideCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        GiantSideCB cb = new GiantSideCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGiantStatusCode_NotExistsReferrer_GiantSideList(cb.query());
        registerNotExistsReferrer(cb.query(), "GIANT_STATUS_CODE", "GIANT_STATUS_CODE", pp, "giantSideList");
    }
    public abstract String keepGiantStatusCode_NotExistsReferrer_GiantSideList(GiantSideCQ sq);

    public void xsderiveGiantList(String fn, SubQuery<GiantCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        GiantCB cb = new GiantCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepGiantStatusCode_SpecifyDerivedReferrer_GiantList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "GIANT_STATUS_CODE", "GIANT_STATUS_CODE", pp, "giantList", al, op);
    }
    public abstract String keepGiantStatusCode_SpecifyDerivedReferrer_GiantList(GiantCQ sq);

    public void xsderiveGiantRefList(String fn, SubQuery<GiantRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        GiantRefCB cb = new GiantRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepGiantStatusCode_SpecifyDerivedReferrer_GiantRefList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "GIANT_STATUS_CODE", "GIANT_STATUS_CODE", pp, "giantRefList", al, op);
    }
    public abstract String keepGiantStatusCode_SpecifyDerivedReferrer_GiantRefList(GiantRefCQ sq);

    public void xsderiveGiantSideList(String fn, SubQuery<GiantSideCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        GiantSideCB cb = new GiantSideCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepGiantStatusCode_SpecifyDerivedReferrer_GiantSideList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "GIANT_STATUS_CODE", "GIANT_STATUS_CODE", pp, "giantSideList", al, op);
    }
    public abstract String keepGiantStatusCode_SpecifyDerivedReferrer_GiantSideList(GiantSideCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from giant where ...)} <br>
     * (Giant as base point)giant by GIANT_STATUS_CODE, named 'giantAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedGiant()</span>.<span style="color: #CC4747">max</span>(giantCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     giantCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     giantCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<GiantCB> derivedGiant() {
        return xcreateQDRFunctionGiantList();
    }
    protected HpQDRFunction<GiantCB> xcreateQDRFunctionGiantList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveGiantList(fn, sq, rd, vl, op));
    }
    public void xqderiveGiantList(String fn, SubQuery<GiantCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        GiantCB cb = new GiantCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepGiantStatusCode_QueryDerivedReferrer_GiantList(cb.query()); String prpp = keepGiantStatusCode_QueryDerivedReferrer_GiantListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "GIANT_STATUS_CODE", "GIANT_STATUS_CODE", sqpp, "giantList", rd, vl, prpp, op);
    }
    public abstract String keepGiantStatusCode_QueryDerivedReferrer_GiantList(GiantCQ sq);
    public abstract String keepGiantStatusCode_QueryDerivedReferrer_GiantListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from giant_ref where ...)} <br>
     * (Referrer of Giant)giant_ref by GIANT_STATUS_CODE, named 'giantRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedGiantRef()</span>.<span style="color: #CC4747">max</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     refCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<GiantRefCB> derivedGiantRef() {
        return xcreateQDRFunctionGiantRefList();
    }
    protected HpQDRFunction<GiantRefCB> xcreateQDRFunctionGiantRefList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveGiantRefList(fn, sq, rd, vl, op));
    }
    public void xqderiveGiantRefList(String fn, SubQuery<GiantRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        GiantRefCB cb = new GiantRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepGiantStatusCode_QueryDerivedReferrer_GiantRefList(cb.query()); String prpp = keepGiantStatusCode_QueryDerivedReferrer_GiantRefListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "GIANT_STATUS_CODE", "GIANT_STATUS_CODE", sqpp, "giantRefList", rd, vl, prpp, op);
    }
    public abstract String keepGiantStatusCode_QueryDerivedReferrer_GiantRefList(GiantRefCQ sq);
    public abstract String keepGiantStatusCode_QueryDerivedReferrer_GiantRefListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from giant_side where ...)} <br>
     * (simple Side of Giant)giant_side by GIANT_STATUS_CODE, named 'giantSideAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedGiantSide()</span>.<span style="color: #CC4747">max</span>(sideCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     sideCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     sideCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<GiantSideCB> derivedGiantSide() {
        return xcreateQDRFunctionGiantSideList();
    }
    protected HpQDRFunction<GiantSideCB> xcreateQDRFunctionGiantSideList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveGiantSideList(fn, sq, rd, vl, op));
    }
    public void xqderiveGiantSideList(String fn, SubQuery<GiantSideCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        GiantSideCB cb = new GiantSideCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepGiantStatusCode_QueryDerivedReferrer_GiantSideList(cb.query()); String prpp = keepGiantStatusCode_QueryDerivedReferrer_GiantSideListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "GIANT_STATUS_CODE", "GIANT_STATUS_CODE", sqpp, "giantSideList", rd, vl, prpp, op);
    }
    public abstract String keepGiantStatusCode_QueryDerivedReferrer_GiantSideList(GiantSideCQ sq);
    public abstract String keepGiantStatusCode_QueryDerivedReferrer_GiantSideListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GIANT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=GiantStatus}
     */
    public void setGiantStatusCode_IsNull() { regGiantStatusCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GIANT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=GiantStatus}
     */
    public void setGiantStatusCode_IsNotNull() { regGiantStatusCode(CK_ISNN, DOBJ); }

    protected void regGiantStatusCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGiantStatusCode(), "GIANT_STATUS_CODE"); }
    protected abstract ConditionValue xgetCValueGiantStatusCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIANT_STATUS_NAME: {NotNull, VARCHAR(64)}
     * @param giantStatusName The value of giantStatusName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiantStatusName_Equal(String giantStatusName) {
        doSetGiantStatusName_Equal(fRES(giantStatusName));
    }

    protected void doSetGiantStatusName_Equal(String giantStatusName) {
        regGiantStatusName(CK_EQ, giantStatusName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIANT_STATUS_NAME: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setGiantStatusName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param giantStatusName The value of giantStatusName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGiantStatusName_LikeSearch(String giantStatusName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGiantStatusName_LikeSearch(giantStatusName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIANT_STATUS_NAME: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setGiantStatusName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param giantStatusName The value of giantStatusName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setGiantStatusName_LikeSearch(String giantStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(giantStatusName), xgetCValueGiantStatusName(), "GIANT_STATUS_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIANT_STATUS_NAME: {NotNull, VARCHAR(64)}
     * @param giantStatusName The value of giantStatusName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGiantStatusName_NotLikeSearch(String giantStatusName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGiantStatusName_NotLikeSearch(giantStatusName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIANT_STATUS_NAME: {NotNull, VARCHAR(64)}
     * @param giantStatusName The value of giantStatusName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setGiantStatusName_NotLikeSearch(String giantStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(giantStatusName), xgetCValueGiantStatusName(), "GIANT_STATUS_NAME", likeSearchOption);
    }

    protected void regGiantStatusName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGiantStatusName(), "GIANT_STATUS_NAME"); }
    protected abstract ConditionValue xgetCValueGiantStatusName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DISPLAY_ORDER: {NotNull, INT(10)}
     * @param displayOrder The value of displayOrder as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDisplayOrder_Equal(Integer displayOrder) {
        doSetDisplayOrder_Equal(displayOrder);
    }

    protected void doSetDisplayOrder_Equal(Integer displayOrder) {
        regDisplayOrder(CK_EQ, displayOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DISPLAY_ORDER: {NotNull, INT(10)}
     * @param minNumber The min number of displayOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of displayOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDisplayOrder_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDisplayOrder_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DISPLAY_ORDER: {NotNull, INT(10)}
     * @param minNumber The min number of displayOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of displayOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDisplayOrder_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDisplayOrder(), "DISPLAY_ORDER", rangeOfOption);
    }

    protected void regDisplayOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDisplayOrder(), "DISPLAY_ORDER"); }
    protected abstract ConditionValue xgetCValueDisplayOrder();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR(128)}
     * @param description The value of description as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_Equal(String description) {
        doSetDescription_Equal(fRES(description));
    }

    protected void doSetDescription_Equal(String description) {
        regDescription(CK_EQ, description);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR(128)}
     * @param description The value of description as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_NotEqual(String description) {
        doSetDescription_NotEqual(fRES(description));
    }

    protected void doSetDescription_NotEqual(String description) {
        regDescription(CK_NES, description);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR(128)}
     * @param descriptionList The collection of description as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_InScope(Collection<String> descriptionList) {
        doSetDescription_InScope(descriptionList);
    }

    protected void doSetDescription_InScope(Collection<String> descriptionList) {
        regINS(CK_INS, cTL(descriptionList), xgetCValueDescription(), "DESCRIPTION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR(128)}
     * @param descriptionList The collection of description as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_NotInScope(Collection<String> descriptionList) {
        doSetDescription_NotInScope(descriptionList);
    }

    protected void doSetDescription_NotInScope(Collection<String> descriptionList) {
        regINS(CK_NINS, cTL(descriptionList), xgetCValueDescription(), "DESCRIPTION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR(128)} <br>
     * <pre>e.g. setDescription_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param description The value of description as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDescription_LikeSearch(description, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR(128)} <br>
     * <pre>e.g. setDescription_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param description The value of description as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setDescription_LikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(description), xgetCValueDescription(), "DESCRIPTION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR(128)}
     * @param description The value of description as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDescription_NotLikeSearch(String description, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDescription_NotLikeSearch(description, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR(128)}
     * @param description The value of description as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDescription_NotLikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(description), xgetCValueDescription(), "DESCRIPTION", likeSearchOption);
    }

    protected void regDescription(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDescription(), "DESCRIPTION"); }
    protected abstract ConditionValue xgetCValueDescription();

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
    public HpSLCFunction<GiantStatusCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, GiantStatusCB.class);
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
    public HpSLCFunction<GiantStatusCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, GiantStatusCB.class);
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
    public HpSLCFunction<GiantStatusCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, GiantStatusCB.class);
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
    public HpSLCFunction<GiantStatusCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, GiantStatusCB.class);
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
    public HpSLCFunction<GiantStatusCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, GiantStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;GiantStatusCB&gt;() {
     *     public void query(GiantStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<GiantStatusCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, GiantStatusCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        GiantStatusCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(GiantStatusCQ sq);

    protected GiantStatusCB xcreateScalarConditionCB() {
        GiantStatusCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected GiantStatusCB xcreateScalarConditionPartitionByCB() {
        GiantStatusCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<GiantStatusCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        GiantStatusCB cb = new GiantStatusCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "GIANT_STATUS_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(GiantStatusCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<GiantStatusCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(GiantStatusCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        GiantStatusCB cb = new GiantStatusCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "GIANT_STATUS_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(GiantStatusCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<GiantStatusCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        GiantStatusCB cb = new GiantStatusCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(GiantStatusCQ sq);

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
    protected GiantStatusCB newMyCB() {
        return new GiantStatusCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return GiantStatusCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
