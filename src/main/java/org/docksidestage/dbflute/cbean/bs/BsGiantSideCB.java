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
package org.docksidestage.dbflute.cbean.bs;

import org.dbflute.cbean.AbstractConditionBean;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.dream.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.dbflute.cbean.scoping.*;
import org.dbflute.dbmeta.DBMetaProvider;
import org.dbflute.twowaysql.factory.SqlAnalyzerFactory;
import org.dbflute.twowaysql.style.BoundDateDisplayTimeZoneProvider;
import org.docksidestage.dbflute.allcommon.DBFluteConfig;
import org.docksidestage.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.dbflute.allcommon.ImplementedInvokerAssistant;
import org.docksidestage.dbflute.allcommon.ImplementedSqlClauseCreator;
import org.docksidestage.dbflute.cbean.*;
import org.docksidestage.dbflute.cbean.cq.*;
import org.docksidestage.dbflute.cbean.nss.*;

/**
 * The base condition-bean of giant_side.
 * @author DBFlute(AutoGenerator)
 */
public class BsGiantSideCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected GiantSideCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsGiantSideCB() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (DBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (DBFluteConfig.getInstance().isNonSpecifiedColumnAccessAllowed()) {
            enableNonSpecifiedColumnAccess();
        }
        if (DBFluteConfig.getInstance().isSpecifyColumnRequired()) {
            enableSpecifyColumnRequired();
        }
        xsetSpecifyColumnRequiredExceptDeterminer(DBFluteConfig.getInstance().getSpecifyColumnRequiredExceptDeterminer());
        if (DBFluteConfig.getInstance().isSpecifyColumnRequiredWarningOnly()) {
            xenableSpecifyColumnRequiredWarningOnly();
        }
        if (DBFluteConfig.getInstance().isQueryUpdateCountPreCheck()) {
            enableQueryUpdateCountPreCheck();
        }
    }

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected SqlClause createSqlClause() {
        SqlClauseCreator creator = DBFluteConfig.getInstance().getSqlClauseCreator();
        if (creator != null) {
            return creator.createSqlClause(this);
        }
        return new ImplementedSqlClauseCreator().createSqlClause(this); // as default
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider(); // as default
    }

    public String asTableDbName() {
        return "giant_side";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param giantSideId : PK, NotNull, BIGINT(19). (NotNull)
     * @return this. (NotNull)
     */
    public GiantSideCB acceptPK(Long giantSideId) {
        assertObjectNotNull("giantSideId", giantSideId);
        BsGiantSideCB cb = this;
        cb.query().setGiantSideId_Equal(giantSideId);
        return (GiantSideCB)this;
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param giantId (Giant ID (FK)): UQ, IX+, NotNull, BIGINT(19), FK to giant. (NotNull)
     * @return this. (NotNull)
     */
    public GiantSideCB acceptUniqueOfGiantId(Long giantId) {
        assertObjectNotNull("giantId", giantId);
        BsGiantSideCB cb = this;
        cb.query().setGiantId_Equal(giantId);
        return (GiantSideCB)this;
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param unique1stInteger (Compound Unique First): UQ+, NotNull, INT(10). (NotNull)
     * @param unique2ndInteger (Compound Unique Second): +UQ, IX, NotNull, INT(10). (NotNull)
     * @param unique3rdInteger (Compound Unique Third): +UQ, NotNull, INT(10). (NotNull)
     * @param unique4thInteger (Compound Unique Fourth): +UQ, IX, NotNull, INT(10). (NotNull)
     * @return this. (NotNull)
     */
    public GiantSideCB acceptUniqueOfUnique1stIntegerUnique2ndIntegerUnique3rdIntegerUnique4thInteger(Integer unique1stInteger, Integer unique2ndInteger, Integer unique3rdInteger, Integer unique4thInteger) {
        assertObjectNotNull("unique1stInteger", unique1stInteger);assertObjectNotNull("unique2ndInteger", unique2ndInteger);assertObjectNotNull("unique3rdInteger", unique3rdInteger);assertObjectNotNull("unique4thInteger", unique4thInteger);
        BsGiantSideCB cb = this;
        cb.query().setUnique1stInteger_Equal(unique1stInteger);cb.query().setUnique2ndInteger_Equal(unique2ndInteger);cb.query().setUnique3rdInteger_Equal(unique3rdInteger);cb.query().setUnique4thInteger_Equal(unique4thInteger);
        return (GiantSideCB)this;
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param uniqueInteger : UQ, NotNull, INT(10). (NotNull)
     * @return this. (NotNull)
     */
    public GiantSideCB acceptUniqueOfUniqueInteger(Integer uniqueInteger) {
        assertObjectNotNull("uniqueInteger", uniqueInteger);
        BsGiantSideCB cb = this;
        cb.query().setUniqueInteger_Equal(uniqueInteger);
        return (GiantSideCB)this;
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param uniqueString : UQ, NotNull, VARCHAR(64). (NotNull)
     * @return this. (NotNull)
     */
    public GiantSideCB acceptUniqueOfUniqueString(String uniqueString) {
        assertObjectNotNull("uniqueString", uniqueString);
        BsGiantSideCB cb = this;
        cb.query().setUniqueString_Equal(uniqueString);
        return (GiantSideCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_GiantSideId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_GiantSideId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Prepare for various queries. <br>
     * Examples of main functions are following:
     * <pre>
     * <span style="color: #3F7E5E">// Basic Queries</span>
     * cb.query().setMemberId_Equal(value);        <span style="color: #3F7E5E">// =</span>
     * cb.query().setMemberId_NotEqual(value);     <span style="color: #3F7E5E">// !=</span>
     * cb.query().setMemberId_GreaterThan(value);  <span style="color: #3F7E5E">// &gt;</span>
     * cb.query().setMemberId_LessThan(value);     <span style="color: #3F7E5E">// &lt;</span>
     * cb.query().setMemberId_GreaterEqual(value); <span style="color: #3F7E5E">// &gt;=</span>
     * cb.query().setMemberId_LessEqual(value);    <span style="color: #3F7E5E">// &lt;=</span>
     * cb.query().setMemberName_InScope(valueList);    <span style="color: #3F7E5E">// in ('a', 'b')</span>
     * cb.query().setMemberName_NotInScope(valueList); <span style="color: #3F7E5E">// not in ('a', 'b')</span>
     * <span style="color: #3F7E5E">// LikeSearch with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {like ... [options]}</span>
     * cb.query().setMemberName_LikeSearch(value, option);
     * cb.query().setMemberName_NotLikeSearch(value, option); <span style="color: #3F7E5E">// not like ...</span>
     * <span style="color: #3F7E5E">// FromTo with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {(default) fromDatetime &lt;= BIRTHDATE &lt;= toDatetime}</span>
     * cb.query().setBirthdate_FromTo(fromDatetime, toDatetime, option);
     * <span style="color: #3F7E5E">// DateFromTo: (Date means yyyy/MM/dd)</span>
     * <span style="color: #3F7E5E">// {fromDate &lt;= BIRTHDATE &lt; toDate + 1 day}</span>
     * cb.query().setBirthdate_IsNull();    <span style="color: #3F7E5E">// is null</span>
     * cb.query().setBirthdate_IsNotNull(); <span style="color: #3F7E5E">// is not null</span>
     *
     * <span style="color: #3F7E5E">// ExistsReferrer: (correlated sub-query)</span>
     * <span style="color: #3F7E5E">// {where exists (select PURCHASE_ID from PURCHASE where ...)}</span>
     * cb.query().existsPurchase(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * });
     * cb.query().notExistsPurchase...
     *
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (correlated sub-query)</span>
     * cb.query().derivedPurchaseList().max(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// derived column for function</span>
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * }).greaterEqual(value);
     *
     * <span style="color: #3F7E5E">// ScalarCondition: (self-table sub-query)</span>
     * cb.query().scalar_Equal().max(scalarCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     scalarCB.specify().columnBirthdate(); <span style="color: #3F7E5E">// derived column for function</span>
     *     scalarCB.query().set... <span style="color: #3F7E5E">// scalar sub-query condition</span>
     * });
     *
     * <span style="color: #3F7E5E">// OrderBy</span>
     * cb.query().addOrderBy_MemberName_Asc();
     * cb.query().addOrderBy_MemberName_Desc().withManualOrder(option);
     * cb.query().addOrderBy_MemberName_Desc().withNullsFirst();
     * cb.query().addOrderBy_MemberName_Desc().withNullsLast();
     * cb.query().addSpecifiedDerivedOrderBy_Desc(aliasName);
     *
     * <span style="color: #3F7E5E">// Query(Relation)</span>
     * cb.query().queryMemberStatus()...;
     * cb.query().queryMemberAddressAsValid(targetDate)...;
     * </pre>
     * @return The instance of condition-query for base-point table to set up query. (NotNull)
     */
    public GiantSideCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public GiantSideCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected GiantSideCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected GiantSideCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected GiantSideCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        GiantSideCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected GiantSideCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new GiantSideCQ(childQuery, sqlClause, aliasName, nestLevel);
    }

    /**
     * {@inheritDoc}
     */
    public ConditionQuery localCQ() {
        return doGetConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">union</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union'. (NotNull)
     */
    public void union(UnionQuery<GiantSideCB> unionCBLambda) {
        final GiantSideCB cb = new GiantSideCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final GiantSideCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">unionAll</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<GiantSideCB> unionCBLambda) {
        final GiantSideCB cb = new GiantSideCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final GiantSideCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected GiantNss _nssGiant;
    public GiantNss xdfgetNssGiant() {
        if (_nssGiant == null) { _nssGiant = new GiantNss(null); }
        return _nssGiant;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (Giant as base point)GIANT by my GIANT_ID, named 'giant'.
     * <pre>
     * <span style="color: #0000C0">giantSideBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_Giant()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">giantSide</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">giantSide</span>.<span style="color: #CC4747">getGiant()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public GiantNss setupSelect_Giant() {
        assertSetupSelectPurpose("giant");
        if (hasSpecifiedLocalColumn()) {
            specify().columnGiantId();
        }
        doSetupSelect(() -> query().queryGiant());
        if (_nssGiant == null || !_nssGiant.hasConditionQuery())
        { _nssGiant = new GiantNss(query().queryGiant()); }
        return _nssGiant;
    }

    /**
     * Set up relation columns to select clause. <br>
     * (Status of Giant)GIANT_STATUS by my GIANT_STATUS_CODE, named 'giantStatus'.
     * <pre>
     * <span style="color: #0000C0">giantSideBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_GiantStatus()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">giantSide</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">giantSide</span>.<span style="color: #CC4747">getGiantStatus()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_GiantStatus() {
        assertSetupSelectPurpose("giantStatus");
        if (hasSpecifiedLocalColumn()) {
            specify().columnGiantStatusCode();
        }
        doSetupSelect(() -> query().queryGiantStatus());
    }

    protected GiantSideNss _nssGiantSideSelf;
    public GiantSideNss xdfgetNssGiantSideSelf() {
        if (_nssGiantSideSelf == null) { _nssGiantSideSelf = new GiantSideNss(null); }
        return _nssGiantSideSelf;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (simple Side of Giant)GIANT_SIDE by my SELF_PARENT_ID, named 'giantSideSelf'.
     * <pre>
     * <span style="color: #0000C0">giantSideBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_GiantSideSelf()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">giantSide</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">giantSide</span>.<span style="color: #CC4747">getGiantSideSelf()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public GiantSideNss setupSelect_GiantSideSelf() {
        assertSetupSelectPurpose("giantSideSelf");
        if (hasSpecifiedLocalColumn()) {
            specify().columnSelfParentId();
        }
        doSetupSelect(() -> query().queryGiantSideSelf());
        if (_nssGiantSideSelf == null || !_nssGiantSideSelf.hasConditionQuery())
        { _nssGiantSideSelf = new GiantSideNss(query().queryGiantSideSelf()); }
        return _nssGiantSideSelf;
    }

    protected MemberNss _nssMember;
    public MemberNss xdfgetNssMember() {
        if (_nssMember == null) { _nssMember = new MemberNss(null); }
        return _nssMember;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員)MEMBER by my ZONE_MEMBER_ID, named 'member'.
     * <pre>
     * <span style="color: #0000C0">giantSideBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_Member()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">giantSide</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">giantSide</span>.<span style="color: #CC4747">getMember()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberNss setupSelect_Member() {
        assertSetupSelectPurpose("member");
        if (hasSpecifiedLocalColumn()) {
            specify().columnZoneMemberId();
        }
        doSetupSelect(() -> query().queryMember());
        if (_nssMember == null || !_nssMember.hasConditionQuery())
        { _nssMember = new MemberNss(query().queryMember()); }
        return _nssMember;
    }

    protected ProductNss _nssProduct;
    public ProductNss xdfgetNssProduct() {
        if (_nssProduct == null) { _nssProduct = new ProductNss(null); }
        return _nssProduct;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (商品)PRODUCT by my ZONE_PRODUCT_ID, named 'product'.
     * <pre>
     * <span style="color: #0000C0">giantSideBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_Product()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">giantSide</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">giantSide</span>.<span style="color: #CC4747">getProduct()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public ProductNss setupSelect_Product() {
        assertSetupSelectPurpose("product");
        if (hasSpecifiedLocalColumn()) {
            specify().columnZoneProductId();
        }
        doSetupSelect(() -> query().queryProduct());
        if (_nssProduct == null || !_nssProduct.hasConditionQuery())
        { _nssProduct = new ProductNss(query().queryProduct()); }
        return _nssProduct;
    }

    protected PurchaseNss _nssPurchase;
    public PurchaseNss xdfgetNssPurchase() {
        if (_nssPurchase == null) { _nssPurchase = new PurchaseNss(null); }
        return _nssPurchase;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (購入)PURCHASE by my ZONE_PURCHASE_ID, named 'purchase'.
     * <pre>
     * <span style="color: #0000C0">giantSideBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_Purchase()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">giantSide</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">giantSide</span>.<span style="color: #CC4747">getPurchase()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public PurchaseNss setupSelect_Purchase() {
        assertSetupSelectPurpose("purchase");
        if (hasSpecifiedLocalColumn()) {
            specify().columnZonePurchaseId();
        }
        doSetupSelect(() -> query().queryPurchase());
        if (_nssPurchase == null || !_nssPurchase.hasConditionQuery())
        { _nssPurchase = new PurchaseNss(query().queryPurchase()); }
        return _nssPurchase;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected HpSpecification _specification;

    /**
     * Prepare for SpecifyColumn, (Specify)DerivedReferrer. <br>
     * This method should be called after SetupSelect.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.setupSelect_MemberStatus(); <span style="color: #3F7E5E">// should be called before specify()</span>
     *     <span style="color: #553000">cb</span>.specify().columnMemberName();
     *     <span style="color: #553000">cb</span>.specify().specifyMemberStatus().columnMemberStatusName();
     *     <span style="color: #553000">cb</span>.specify().derivedPurchaseList().max(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.specify().columnPurchaseDatetime();
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *     }, aliasName);
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ...
     * });
     * </pre>
     * @return The instance of specification. (NotNull)
     */
    public HpSpecification specify() {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpSpecification(this
            , xcreateSpQyCall(() -> true, () -> xdfgetConditionQuery())
            , _purpose, getDBMetaProvider(), xcSDRFnFc()); }
        return _specification;
    }

    public HpColumnSpHandler localSp() {
        return specify();
    }

    public boolean hasSpecifiedLocalColumn() {
        return _specification != null && _specification.hasSpecifiedColumn();
    }

    public static class HpSpecification extends HpAbstractSpecification<GiantSideCQ> {
        protected GiantCB.HpSpecification _giant;
        protected GiantStatusCB.HpSpecification _giantStatus;
        protected GiantSideCB.HpSpecification _giantSideSelf;
        protected MemberCB.HpSpecification _member;
        protected ProductCB.HpSpecification _product;
        protected PurchaseCB.HpSpecification _purchase;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<GiantSideCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * GIANT_SIDE_ID: {PK, NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGiantSideId() { return doColumn("GIANT_SIDE_ID"); }
        /**
         * (Giant ID (FK))GIANT_ID: {UQ, IX+, NotNull, BIGINT(19), FK to giant}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGiantId() { return doColumn("GIANT_ID"); }
        /**
         * GIANT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to giant_status, classification=GiantStatus}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGiantStatusCode() { return doColumn("GIANT_STATUS_CODE"); }
        /**
         * INDEX_STRING: {IX, NotNull, VARCHAR(64)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnIndexString() { return doColumn("INDEX_STRING"); }
        /**
         * INDEX_INTEGER: {IX+, NotNull, INT(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnIndexInteger() { return doColumn("INDEX_INTEGER"); }
        /**
         * INDEX_DATE: {IX, NotNull, DATE(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnIndexDate() { return doColumn("INDEX_DATE"); }
        /**
         * INDEX_DATETIME: {IX, NotNull, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnIndexDatetime() { return doColumn("INDEX_DATETIME"); }
        /**
         * INDEX_BOOLEAN: {IX, NotNull, BIT}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnIndexBoolean() { return doColumn("INDEX_BOOLEAN"); }
        /**
         * NON_INDEX_STRING: {NotNull, VARCHAR(64)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNonIndexString() { return doColumn("NON_INDEX_STRING"); }
        /**
         * NON_INDEX_INTEGER: {NotNull, INT(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNonIndexInteger() { return doColumn("NON_INDEX_INTEGER"); }
        /**
         * NON_INDEX_DATE: {NotNull, DATE(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNonIndexDate() { return doColumn("NON_INDEX_DATE"); }
        /**
         * NON_INDEX_DATETIME: {NotNull, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNonIndexDatetime() { return doColumn("NON_INDEX_DATETIME"); }
        /**
         * NON_INDEX_BOOLEAN: {NotNull, BIT}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNonIndexBoolean() { return doColumn("NON_INDEX_BOOLEAN"); }
        /**
         * NULLABLE_INDEX_STRING: {IX, VARCHAR(64)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNullableIndexString() { return doColumn("NULLABLE_INDEX_STRING"); }
        /**
         * NULLABLE_INDEX_INTEGER: {IX, INT(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNullableIndexInteger() { return doColumn("NULLABLE_INDEX_INTEGER"); }
        /**
         * NULLABLE_INDEX_DATE: {IX, DATE(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNullableIndexDate() { return doColumn("NULLABLE_INDEX_DATE"); }
        /**
         * NULLABLE_INDEX_DATETIME: {IX, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNullableIndexDatetime() { return doColumn("NULLABLE_INDEX_DATETIME"); }
        /**
         * NULLABLE_INDEX_BOOLEAN: {IX, BIT}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNullableIndexBoolean() { return doColumn("NULLABLE_INDEX_BOOLEAN"); }
        /**
         * (Self Reference ID)SELF_PARENT_ID: {IX, BIGINT(19), FK to giant_side}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSelfParentId() { return doColumn("SELF_PARENT_ID"); }
        /**
         * (Compound Unique First)UNIQUE_1ST_INTEGER: {UQ+, NotNull, INT(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUnique1stInteger() { return doColumn("UNIQUE_1ST_INTEGER"); }
        /**
         * (Compound Unique Second)UNIQUE_2ND_INTEGER: {+UQ, IX, NotNull, INT(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUnique2ndInteger() { return doColumn("UNIQUE_2ND_INTEGER"); }
        /**
         * (Compound Unique Third)UNIQUE_3RD_INTEGER: {+UQ, NotNull, INT(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUnique3rdInteger() { return doColumn("UNIQUE_3RD_INTEGER"); }
        /**
         * (Compound Unique Fourth)UNIQUE_4TH_INTEGER: {+UQ, IX, NotNull, INT(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUnique4thInteger() { return doColumn("UNIQUE_4TH_INTEGER"); }
        /**
         * UNIQUE_STRING: {UQ, NotNull, VARCHAR(64)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUniqueString() { return doColumn("UNIQUE_STRING"); }
        /**
         * UNIQUE_INTEGER: {UQ, NotNull, INT(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUniqueInteger() { return doColumn("UNIQUE_INTEGER"); }
        /**
         * ZONE_MEMBER_ID: {IX, NotNull, INT(10), FK to member}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnZoneMemberId() { return doColumn("ZONE_MEMBER_ID"); }
        /**
         * ZONE_PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnZonePurchaseId() { return doColumn("ZONE_PURCHASE_ID"); }
        /**
         * ZONE_PRODUCT_ID: {IX, NotNull, INT(10), FK to product}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnZoneProductId() { return doColumn("ZONE_PRODUCT_ID"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnGiantSideId(); // PK
            if (qyCall().qy().hasConditionQueryGiant()
                    || qyCall().qy().xgetReferrerQuery() instanceof GiantCQ) {
                columnGiantId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryGiantStatus()
                    || qyCall().qy().xgetReferrerQuery() instanceof GiantStatusCQ) {
                columnGiantStatusCode(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryGiantSideSelf()
                    || qyCall().qy().xgetReferrerQuery() instanceof GiantSideCQ) {
                columnSelfParentId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMember()
                    || qyCall().qy().xgetReferrerQuery() instanceof MemberCQ) {
                columnZoneMemberId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryProduct()
                    || qyCall().qy().xgetReferrerQuery() instanceof ProductCQ) {
                columnZoneProductId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryPurchase()
                    || qyCall().qy().xgetReferrerQuery() instanceof PurchaseCQ) {
                columnZonePurchaseId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "giant_side"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * (Giant as base point)GIANT by my GIANT_ID, named 'giant'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public GiantCB.HpSpecification specifyGiant() {
            assertRelation("giant");
            if (_giant == null) {
                _giant = new GiantCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryGiant()
                                    , () -> _qyCall.qy().queryGiant())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _giant.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryGiant()
                      , () -> xsyncQyCall().qy().queryGiant()));
                }
            }
            return _giant;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (Status of Giant)GIANT_STATUS by my GIANT_STATUS_CODE, named 'giantStatus'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public GiantStatusCB.HpSpecification specifyGiantStatus() {
            assertRelation("giantStatus");
            if (_giantStatus == null) {
                _giantStatus = new GiantStatusCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryGiantStatus()
                                    , () -> _qyCall.qy().queryGiantStatus())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _giantStatus.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryGiantStatus()
                      , () -> xsyncQyCall().qy().queryGiantStatus()));
                }
            }
            return _giantStatus;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (simple Side of Giant)GIANT_SIDE by my SELF_PARENT_ID, named 'giantSideSelf'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public GiantSideCB.HpSpecification specifyGiantSideSelf() {
            assertRelation("giantSideSelf");
            if (_giantSideSelf == null) {
                _giantSideSelf = new GiantSideCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryGiantSideSelf()
                                    , () -> _qyCall.qy().queryGiantSideSelf())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _giantSideSelf.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryGiantSideSelf()
                      , () -> xsyncQyCall().qy().queryGiantSideSelf()));
                }
            }
            return _giantSideSelf;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員)MEMBER by my ZONE_MEMBER_ID, named 'member'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberCB.HpSpecification specifyMember() {
            assertRelation("member");
            if (_member == null) {
                _member = new MemberCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMember()
                                    , () -> _qyCall.qy().queryMember())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _member.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMember()
                      , () -> xsyncQyCall().qy().queryMember()));
                }
            }
            return _member;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (商品)PRODUCT by my ZONE_PRODUCT_ID, named 'product'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public ProductCB.HpSpecification specifyProduct() {
            assertRelation("product");
            if (_product == null) {
                _product = new ProductCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryProduct()
                                    , () -> _qyCall.qy().queryProduct())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _product.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryProduct()
                      , () -> xsyncQyCall().qy().queryProduct()));
                }
            }
            return _product;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (購入)PURCHASE by my ZONE_PURCHASE_ID, named 'purchase'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public PurchaseCB.HpSpecification specifyPurchase() {
            assertRelation("purchase");
            if (_purchase == null) {
                _purchase = new PurchaseCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryPurchase()
                                    , () -> _qyCall.qy().queryPurchase())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _purchase.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryPurchase()
                      , () -> xsyncQyCall().qy().queryPurchase()));
                }
            }
            return _purchase;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from giant_side where ...) as FOO_MAX} <br>
         * (simple Side of Giant)GIANT_SIDE by SELF_PARENT_ID, named 'giantSideSelfList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(sideCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     sideCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     sideCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, GiantSide.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<GiantSideCB, GiantSideCQ> derivedGiantSideSelf() {
            assertDerived("giantSideSelfList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<GiantSideCB> sq, GiantSideCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveGiantSideSelfList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<GiantSideCB, GiantSideCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<GiantSideCB> sq, GiantSideCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsmyselfDerive(fn, sq, al, op), _dbmetaProvider);
        }
    }

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    /**
     * Welcome to the Dream Cruise for condition-bean deep world. <br>
     * This is very specialty so you can get the frontier spirit. Bon voyage!
     * @return The condition-bean for dream cruise, which is linked to main condition-bean.
     */
    public GiantSideCB dreamCruiseCB() {
        GiantSideCB cb = new GiantSideCB();
        cb.xsetupForDreamCruise((GiantSideCB) this);
        return cb;
    }

    protected ConditionBean xdoCreateDreamCruiseCB() {
        return dreamCruiseCB();
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                        Column Query
    //                                                                        ============
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #CC4747">columnQuery</span>(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     * }).lessThan(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param colCBLambda The callback for specify-query of left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<GiantSideCB> columnQuery(final SpecifyQuery<GiantSideCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected GiantSideCB xcreateColumnQueryCB() {
        GiantSideCB cb = new GiantSideCB();
        cb.xsetupForColumnQuery((GiantSideCB)this);
        return cb;
    }

    // [DBFlute-0.9.6.3]
    // ===================================================================================
    //                                                                       OrScope Query
    //                                                                       =============
    /**
     * Set up the query for or-scope. <br>
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #CC4747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.query().setBar...
     * });
     * </pre>
     * @param orCBLambda The callback for query of or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<GiantSideCB> orCBLambda) {
        xorSQ((GiantSideCB)this, orCBLambda);
    }

    /**
     * Set up the and-part of or-scope. <br>
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #994747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.<span style="color: #CC4747">orScopeQueryAndPart</span>(<span style="color: #553000">andCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">andCB</span>.query().setBar...
     *         <span style="color: #553000">andCB</span>.query().setQux...
     *     });
     * });
     * </pre>
     * @param andCBLambda The callback for query of and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<GiantSideCB> andCBLambda) {
        xorSQAP((GiantSideCB)this, andCBLambda);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    public void customizeCursorSelect(SVOptionCall<CursorSelectOption> opLambda) {
        doAcceptCursorSelectOption(opLambda);
    }

    // ===================================================================================
    //                                                                          DisplaySQL
    //                                                                          ==========
    @Override
    protected SqlAnalyzerFactory getSqlAnalyzerFactory()
    { return new ImplementedInvokerAssistant().assistSqlAnalyzerFactory(); }
    @Override
    protected String getConfiguredLogDatePattern() { return DBFluteConfig.getInstance().getLogDatePattern(); }
    @Override
    protected String getConfiguredLogTimestampPattern() { return DBFluteConfig.getInstance().getLogTimestampPattern(); }
    @Override
    protected String getConfiguredLogTimePattern() { return DBFluteConfig.getInstance().getLogTimePattern(); }
    @Override
    protected BoundDateDisplayTimeZoneProvider getConfiguredLogTimeZoneProvider() { return DBFluteConfig.getInstance().getLogTimeZoneProvider(); }

    // ===================================================================================
    //                                                                       Meta Handling
    //                                                                       =============
    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Purpose Type
    //                                                                        ============
    @Override
    protected void xprepareSyncQyCall(ConditionBean mainCB) {
        final GiantSideCB cb;
        if (mainCB != null) {
            cb = (GiantSideCB)mainCB;
        } else {
            cb = new GiantSideCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return GiantSideCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return GiantSideCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
