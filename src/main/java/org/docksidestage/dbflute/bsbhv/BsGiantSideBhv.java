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
package org.docksidestage.dbflute.bsbhv;

import java.util.List;

import org.dbflute.*;
import org.dbflute.bhv.*;
import org.dbflute.bhv.readable.*;
import org.dbflute.bhv.writable.*;
import org.dbflute.bhv.referrer.*;
import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.HpSLSFunction;
import org.dbflute.cbean.result.*;
import org.dbflute.exception.*;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.outsidesql.executor.*;
import org.docksidestage.dbflute.exbhv.*;
import org.docksidestage.dbflute.bsbhv.loader.*;
import org.docksidestage.dbflute.exentity.*;
import org.docksidestage.dbflute.bsentity.dbmeta.*;
import org.docksidestage.dbflute.cbean.*;

/**
 * The behavior of (simple Side of Giant)GIANT_SIDE as TABLE. <br>
 * <pre>
 * [primary key]
 *     GIANT_SIDE_ID
 *
 * [column]
 *     GIANT_SIDE_ID, GIANT_ID, GIANT_STATUS_CODE, INDEX_STRING, INDEX_INTEGER, INDEX_DATE, INDEX_DATETIME, INDEX_BOOLEAN, NON_INDEX_STRING, NON_INDEX_INTEGER, NON_INDEX_DATE, NON_INDEX_DATETIME, NON_INDEX_BOOLEAN, NULLABLE_INDEX_STRING, NULLABLE_INDEX_INTEGER, NULLABLE_INDEX_DATE, NULLABLE_INDEX_DATETIME, NULLABLE_INDEX_BOOLEAN, SELF_PARENT_ID, UNIQUE_1ST_INTEGER, UNIQUE_2ND_INTEGER, UNIQUE_3RD_INTEGER, UNIQUE_4TH_INTEGER, UNIQUE_STRING, UNIQUE_INTEGER, ZONE_MEMBER_ID, ZONE_PURCHASE_ID, ZONE_PRODUCT_ID
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     GIANT, GIANT_STATUS, GIANT_SIDE, MEMBER, PRODUCT, PURCHASE
 *
 * [referrer table]
 *     GIANT_SIDE
 *
 * [foreign property]
 *     giant, giantStatus, giantSideSelf, member, product, purchase
 *
 * [referrer property]
 *     giantSideSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsGiantSideBhv extends AbstractBehaviorWritable<GiantSide, GiantSideCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public GiantSideDbm asDBMeta() { return GiantSideDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "giant_side"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public GiantSideCB newConditionBean() { return new GiantSideCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">giantSideBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of GiantSide. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<GiantSideCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, isPresent() and orElse(), ...</span>
     * <pre>
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">giantSideBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">giantSide</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">giantSide</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">giantSideBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">giantSide</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">giantSide</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of GiantSide. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<GiantSide> selectEntity(CBCall<GiantSideCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<GiantSide> facadeSelectEntity(GiantSideCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends GiantSide> OptionalEntity<ENTITY> doSelectOptionalEntity(GiantSideCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * GiantSide <span style="color: #553000">giantSide</span> = <span style="color: #0000C0">giantSideBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">giantSide</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of GiantSide. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public GiantSide selectEntityWithDeletedCheck(CBCall<GiantSideCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param giantSideId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<GiantSide> selectByPK(Long giantSideId) {
        return facadeSelectByPK(giantSideId);
    }

    protected OptionalEntity<GiantSide> facadeSelectByPK(Long giantSideId) {
        return doSelectOptionalByPK(giantSideId, typeOfSelectedEntity());
    }

    protected <ENTITY extends GiantSide> ENTITY doSelectByPK(Long giantSideId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(giantSideId), tp);
    }

    protected <ENTITY extends GiantSide> OptionalEntity<ENTITY> doSelectOptionalByPK(Long giantSideId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(giantSideId, tp), giantSideId);
    }

    protected GiantSideCB xprepareCBAsPK(Long giantSideId) {
        assertObjectNotNull("giantSideId", giantSideId);
        return newConditionBean().acceptPK(giantSideId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param giantId (Giant ID (FK)): UQ, IX+, NotNull, BIGINT(19), FK to giant. (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<GiantSide> selectByUniqueOfGiantId(Long giantId) {
        return facadeSelectByUniqueOfGiantId(giantId);
    }

    protected OptionalEntity<GiantSide> facadeSelectByUniqueOfGiantId(Long giantId) {
        return doSelectByUniqueOfGiantId(giantId, typeOfSelectedEntity());
    }

    protected <ENTITY extends GiantSide> OptionalEntity<ENTITY> doSelectByUniqueOfGiantId(Long giantId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOfGiantId(giantId), tp), giantId);
    }

    protected GiantSideCB xprepareCBAsUniqueOfGiantId(Long giantId) {
        assertObjectNotNull("giantId", giantId);
        return newConditionBean().acceptUniqueOfGiantId(giantId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param unique1stInteger (Compound Unique First): UQ+, NotNull, INT(10). (NotNull)
     * @param unique2ndInteger (Compound Unique Second): +UQ, IX, NotNull, INT(10). (NotNull)
     * @param unique3rdInteger (Compound Unique Third): +UQ, NotNull, INT(10). (NotNull)
     * @param unique4thInteger (Compound Unique Fourth): +UQ, IX, NotNull, INT(10). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<GiantSide> selectByUniqueOfUnique1stIntegerUnique2ndIntegerUnique3rdIntegerUnique4thInteger(Integer unique1stInteger, Integer unique2ndInteger, Integer unique3rdInteger, Integer unique4thInteger) {
        return facadeSelectByUniqueOfUnique1stIntegerUnique2ndIntegerUnique3rdIntegerUnique4thInteger(unique1stInteger, unique2ndInteger, unique3rdInteger, unique4thInteger);
    }

    protected OptionalEntity<GiantSide> facadeSelectByUniqueOfUnique1stIntegerUnique2ndIntegerUnique3rdIntegerUnique4thInteger(Integer unique1stInteger, Integer unique2ndInteger, Integer unique3rdInteger, Integer unique4thInteger) {
        return doSelectByUniqueOfUnique1stIntegerUnique2ndIntegerUnique3rdIntegerUnique4thInteger(unique1stInteger, unique2ndInteger, unique3rdInteger, unique4thInteger, typeOfSelectedEntity());
    }

    protected <ENTITY extends GiantSide> OptionalEntity<ENTITY> doSelectByUniqueOfUnique1stIntegerUnique2ndIntegerUnique3rdIntegerUnique4thInteger(Integer unique1stInteger, Integer unique2ndInteger, Integer unique3rdInteger, Integer unique4thInteger, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOfUnique1stIntegerUnique2ndIntegerUnique3rdIntegerUnique4thInteger(unique1stInteger, unique2ndInteger, unique3rdInteger, unique4thInteger), tp), unique1stInteger, unique2ndInteger, unique3rdInteger, unique4thInteger);
    }

    protected GiantSideCB xprepareCBAsUniqueOfUnique1stIntegerUnique2ndIntegerUnique3rdIntegerUnique4thInteger(Integer unique1stInteger, Integer unique2ndInteger, Integer unique3rdInteger, Integer unique4thInteger) {
        assertObjectNotNull("unique1stInteger", unique1stInteger);assertObjectNotNull("unique2ndInteger", unique2ndInteger);assertObjectNotNull("unique3rdInteger", unique3rdInteger);assertObjectNotNull("unique4thInteger", unique4thInteger);
        return newConditionBean().acceptUniqueOfUnique1stIntegerUnique2ndIntegerUnique3rdIntegerUnique4thInteger(unique1stInteger, unique2ndInteger, unique3rdInteger, unique4thInteger);
    }

    /**
     * Select the entity by the unique-key value.
     * @param uniqueInteger : UQ, NotNull, INT(10). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<GiantSide> selectByUniqueOfUniqueInteger(Integer uniqueInteger) {
        return facadeSelectByUniqueOfUniqueInteger(uniqueInteger);
    }

    protected OptionalEntity<GiantSide> facadeSelectByUniqueOfUniqueInteger(Integer uniqueInteger) {
        return doSelectByUniqueOfUniqueInteger(uniqueInteger, typeOfSelectedEntity());
    }

    protected <ENTITY extends GiantSide> OptionalEntity<ENTITY> doSelectByUniqueOfUniqueInteger(Integer uniqueInteger, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOfUniqueInteger(uniqueInteger), tp), uniqueInteger);
    }

    protected GiantSideCB xprepareCBAsUniqueOfUniqueInteger(Integer uniqueInteger) {
        assertObjectNotNull("uniqueInteger", uniqueInteger);
        return newConditionBean().acceptUniqueOfUniqueInteger(uniqueInteger);
    }

    /**
     * Select the entity by the unique-key value.
     * @param uniqueString : UQ, NotNull, VARCHAR(64). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<GiantSide> selectByUniqueOfUniqueString(String uniqueString) {
        return facadeSelectByUniqueOfUniqueString(uniqueString);
    }

    protected OptionalEntity<GiantSide> facadeSelectByUniqueOfUniqueString(String uniqueString) {
        return doSelectByUniqueOfUniqueString(uniqueString, typeOfSelectedEntity());
    }

    protected <ENTITY extends GiantSide> OptionalEntity<ENTITY> doSelectByUniqueOfUniqueString(String uniqueString, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOfUniqueString(uniqueString), tp), uniqueString);
    }

    protected GiantSideCB xprepareCBAsUniqueOfUniqueString(String uniqueString) {
        assertObjectNotNull("uniqueString", uniqueString);
        return newConditionBean().acceptUniqueOfUniqueString(uniqueString);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;GiantSide&gt; <span style="color: #553000">giantSideList</span> = <span style="color: #0000C0">giantSideBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (GiantSide <span style="color: #553000">giantSide</span> : <span style="color: #553000">giantSideList</span>) {
     *     ... = <span style="color: #553000">giantSide</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of GiantSide. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<GiantSide> selectList(CBCall<GiantSideCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    @Override
    protected boolean isEntityDerivedMappable() { return true; }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PagingResultBean&lt;GiantSide&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">giantSideBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (GiantSide giantSide : <span style="color: #553000">page</span>) {
     *     ... = giantSide.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of GiantSide. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<GiantSide> selectPage(CBCall<GiantSideCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">giantSideBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of GiantSide. (NotNull)
     * @param entityLambda The handler of entity row of GiantSide. (NotNull)
     */
    public void selectCursor(CBCall<GiantSideCB> cbLambda, EntityRowHandler<GiantSide> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">giantSideBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<GiantSideCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + asTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer for the list by the referrer loader.
     * <pre>
     * List&lt;Member&gt; <span style="color: #553000">memberList</span> = <span style="color: #0000C0">memberBhv</span>.selectList(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * memberBhv.<span style="color: #CC4747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * <span style="color: #70226C">for</span> (Member member : <span style="color: #553000">memberList</span>) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param giantSideList The entity list of giantSide. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<GiantSide> giantSideList, ReferrerLoaderHandler<LoaderOfGiantSide> loaderLambda) {
        xassLRArg(giantSideList, loaderLambda);
        loaderLambda.handle(new LoaderOfGiantSide().ready(giantSideList, _behaviorSelector));
    }

    /**
     * Load referrer for the entity by the referrer loader.
     * <pre>
     * Member <span style="color: #553000">member</span> = <span style="color: #0000C0">memberBhv</span>.selectEntityWithDeletedCheck(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> <span style="color: #553000">cb</span>.acceptPK(1));
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">load</span>(<span style="color: #553000">member</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * List&lt;Purchase&gt; purchaseList = <span style="color: #553000">member</span>.<span style="color: #CC4747">getPurchaseList()</span>;
     * <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *     ...
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param giantSide The entity of giantSide. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(GiantSide giantSide, ReferrerLoaderHandler<LoaderOfGiantSide> loaderLambda) {
        xassLRArg(giantSide, loaderLambda);
        loaderLambda.handle(new LoaderOfGiantSide().ready(xnewLRAryLs(giantSide), _behaviorSelector));
    }

    /**
     * Load referrer of giantSideSelfList by the set-upper of referrer. <br>
     * (simple Side of Giant)GIANT_SIDE by SELF_PARENT_ID, named 'giantSideSelfList'.
     * <pre>
     * <span style="color: #0000C0">giantSideBhv</span>.<span style="color: #CC4747">loadGiantSideSelf</span>(<span style="color: #553000">giantSideList</span>, <span style="color: #553000">sideCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">sideCB</span>.setupSelect...
     *     <span style="color: #553000">sideCB</span>.query().set...
     *     <span style="color: #553000">sideCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (GiantSide giantSide : <span style="color: #553000">giantSideList</span>) {
     *     ... = giantSide.<span style="color: #CC4747">getGiantSideSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSelfParentId_InScope(pkList);
     * cb.query().addOrderBy_SelfParentId_Asc();
     * </pre>
     * @param giantSideList The entity list of giantSide. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<GiantSide> loadGiantSideSelf(List<GiantSide> giantSideList, ReferrerConditionSetupper<GiantSideCB> refCBLambda) {
        xassLRArg(giantSideList, refCBLambda);
        return doLoadGiantSideSelf(giantSideList, new LoadReferrerOption<GiantSideCB, GiantSide>().xinit(refCBLambda));
    }

    /**
     * Load referrer of giantSideSelfList by the set-upper of referrer. <br>
     * (simple Side of Giant)GIANT_SIDE by SELF_PARENT_ID, named 'giantSideSelfList'.
     * <pre>
     * <span style="color: #0000C0">giantSideBhv</span>.<span style="color: #CC4747">loadGiantSideSelf</span>(<span style="color: #553000">giantSide</span>, <span style="color: #553000">sideCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">sideCB</span>.setupSelect...
     *     <span style="color: #553000">sideCB</span>.query().set...
     *     <span style="color: #553000">sideCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">giantSide</span>.<span style="color: #CC4747">getGiantSideSelfList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSelfParentId_InScope(pkList);
     * cb.query().addOrderBy_SelfParentId_Asc();
     * </pre>
     * @param giantSide The entity of giantSide. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<GiantSide> loadGiantSideSelf(GiantSide giantSide, ReferrerConditionSetupper<GiantSideCB> refCBLambda) {
        xassLRArg(giantSide, refCBLambda);
        return doLoadGiantSideSelf(xnewLRLs(giantSide), new LoadReferrerOption<GiantSideCB, GiantSide>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<GiantSide> doLoadGiantSideSelf(List<GiantSide> giantSideList, LoadReferrerOption<GiantSideCB, GiantSide> option) {
        return helpLoadReferrerInternally(giantSideList, option, "giantSideSelfList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'Giant'.
     * @param giantSideList The list of giantSide. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Giant> pulloutGiant(List<GiantSide> giantSideList)
    { return helpPulloutInternally(giantSideList, "giant"); }

    /**
     * Pull out the list of foreign table 'GiantStatus'.
     * @param giantSideList The list of giantSide. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<GiantStatus> pulloutGiantStatus(List<GiantSide> giantSideList)
    { return helpPulloutInternally(giantSideList, "giantStatus"); }

    /**
     * Pull out the list of foreign table 'GiantSide'.
     * @param giantSideList The list of giantSide. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<GiantSide> pulloutGiantSideSelf(List<GiantSide> giantSideList)
    { return helpPulloutInternally(giantSideList, "giantSideSelf"); }

    /**
     * Pull out the list of foreign table 'Member'.
     * @param giantSideList The list of giantSide. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Member> pulloutMember(List<GiantSide> giantSideList)
    { return helpPulloutInternally(giantSideList, "member"); }

    /**
     * Pull out the list of foreign table 'Product'.
     * @param giantSideList The list of giantSide. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Product> pulloutProduct(List<GiantSide> giantSideList)
    { return helpPulloutInternally(giantSideList, "product"); }

    /**
     * Pull out the list of foreign table 'Purchase'.
     * @param giantSideList The list of giantSide. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Purchase> pulloutPurchase(List<GiantSide> giantSideList)
    { return helpPulloutInternally(giantSideList, "purchase"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key giantSideId.
     * @param giantSideList The list of giantSide. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractGiantSideIdList(List<GiantSide> giantSideList)
    { return helpExtractListInternally(giantSideList, "giantSideId"); }

    /**
     * Extract the value list of (single) unique key giantId.
     * @param giantSideList The list of giantSide. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractGiantIdList(List<GiantSide> giantSideList)
    { return helpExtractListInternally(giantSideList, "giantId"); }

    /**
     * Extract the value list of (single) unique key uniqueInteger.
     * @param giantSideList The list of giantSide. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractUniqueIntegerList(List<GiantSide> giantSideList)
    { return helpExtractListInternally(giantSideList, "uniqueInteger"); }

    /**
     * Extract the value list of (single) unique key uniqueString.
     * @param giantSideList The list of giantSide. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractUniqueStringList(List<GiantSide> giantSideList)
    { return helpExtractListInternally(giantSideList, "uniqueString"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * GiantSide giantSide = <span style="color: #70226C">new</span> GiantSide();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * giantSide.setFoo...(value);
     * giantSide.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//giantSide.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//giantSide.set...;</span>
     * <span style="color: #0000C0">giantSideBhv</span>.<span style="color: #CC4747">insert</span>(giantSide);
     * ... = giantSide.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param giantSide The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(GiantSide giantSide) {
        doInsert(giantSide, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * GiantSide giantSide = <span style="color: #70226C">new</span> GiantSide();
     * giantSide.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * giantSide.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//giantSide.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//giantSide.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * giantSide.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">giantSideBhv</span>.<span style="color: #CC4747">update</span>(giantSide);
     * </pre>
     * @param giantSide The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(GiantSide giantSide) {
        doUpdate(giantSide, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param giantSide The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(GiantSide giantSide) {
        doInsertOrUpdate(giantSide, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * GiantSide giantSide = <span style="color: #70226C">new</span> GiantSide();
     * giantSide.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * giantSide.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">giantSideBhv</span>.<span style="color: #CC4747">delete</span>(giantSide);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param giantSide The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(GiantSide giantSide) {
        doDelete(giantSide, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <p><span style="color: #CC4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     GiantSide giantSide = <span style="color: #70226C">new</span> GiantSide();
     *     giantSide.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         giantSide.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     giantSideList.add(giantSide);
     * }
     * <span style="color: #0000C0">giantSideBhv</span>.<span style="color: #CC4747">batchInsert</span>(giantSideList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param giantSideList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<GiantSide> giantSideList) {
        return doBatchInsert(giantSideList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     GiantSide giantSide = <span style="color: #70226C">new</span> GiantSide();
     *     giantSide.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         giantSide.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         giantSide.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//giantSide.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     giantSideList.add(giantSide);
     * }
     * <span style="color: #0000C0">giantSideBhv</span>.<span style="color: #CC4747">batchUpdate</span>(giantSideList);
     * </pre>
     * @param giantSideList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<GiantSide> giantSideList) {
        return doBatchUpdate(giantSideList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param giantSideList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<GiantSide> giantSideList) {
        return doBatchDelete(giantSideList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">giantSideBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;GiantSide, GiantSideCB&gt;() {
     *     public ConditionBean setup(GiantSide entity, GiantSideCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param manyArgLambda The callback to set up query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<GiantSide, GiantSideCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * GiantSide giantSide = <span style="color: #70226C">new</span> GiantSide();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//giantSide.setPK...(value);</span>
     * giantSide.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//giantSide.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//giantSide.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//giantSide.setVersionNo(value);</span>
     * <span style="color: #0000C0">giantSideBhv</span>.<span style="color: #CC4747">queryUpdate</span>(giantSide, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param giantSide The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of GiantSide. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(GiantSide giantSide, CBCall<GiantSideCB> cbLambda) {
        return doQueryUpdate(giantSide, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">giantSideBhv</span>.<span style="color: #CC4747">queryDelete</span>(giantSide, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of GiantSide. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<GiantSideCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as insert(entity).
     * <pre>
     * GiantSide giantSide = <span style="color: #70226C">new</span> GiantSide();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * giantSide.setFoo...(value);
     * giantSide.setBar...(value);
     * <span style="color: #0000C0">giantSideBhv</span>.<span style="color: #CC4747">varyingInsert</span>(giantSide, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = giantSide.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param giantSide The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(GiantSide giantSide, WritableOptionCall<GiantSideCB, InsertOption<GiantSideCB>> opLambda) {
        doInsert(giantSide, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * GiantSide giantSide = <span style="color: #70226C">new</span> GiantSide();
     * giantSide.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * giantSide.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * giantSide.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">giantSideBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(giantSide, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param giantSide The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(GiantSide giantSide, WritableOptionCall<GiantSideCB, UpdateOption<GiantSideCB>> opLambda) {
        doUpdate(giantSide, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param giantSide The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(GiantSide giantSide, WritableOptionCall<GiantSideCB, InsertOption<GiantSideCB>> insertOpLambda, WritableOptionCall<GiantSideCB, UpdateOption<GiantSideCB>> updateOpLambda) {
        doInsertOrUpdate(giantSide, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param giantSide The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(GiantSide giantSide, WritableOptionCall<GiantSideCB, DeleteOption<GiantSideCB>> opLambda) {
        doDelete(giantSide, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param giantSideList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<GiantSide> giantSideList, WritableOptionCall<GiantSideCB, InsertOption<GiantSideCB>> opLambda) {
        return doBatchInsert(giantSideList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param giantSideList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<GiantSide> giantSideList, WritableOptionCall<GiantSideCB, UpdateOption<GiantSideCB>> opLambda) {
        return doBatchUpdate(giantSideList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param giantSideList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<GiantSide> giantSideList, WritableOptionCall<GiantSideCB, DeleteOption<GiantSideCB>> opLambda) {
        return doBatchDelete(giantSideList, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as queryInsert(entity, setupper).
     * @param manyArgLambda The set-upper of query-insert. (NotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<GiantSide, GiantSideCB> manyArgLambda, WritableOptionCall<GiantSideCB, InsertOption<GiantSideCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * GiantSide giantSide = <span style="color: #70226C">new</span> GiantSide();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//giantSide.setPK...(value);</span>
     * giantSide.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//giantSide.setVersionNo(value);</span>
     * <span style="color: #0000C0">giantSideBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(giantSide, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param giantSide The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of GiantSide. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(GiantSide giantSide, CBCall<GiantSideCB> cbLambda, WritableOptionCall<GiantSideCB, UpdateOption<GiantSideCB>> opLambda) {
        return doQueryUpdate(giantSide, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">giantSideBhv</span>.<span style="color: #CC4747">queryDelete</span>(giantSide, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of GiantSide. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<GiantSideCB> cbLambda, WritableOptionCall<GiantSideCB, DeleteOption<GiantSideCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * giantSideBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * giantSideBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * giantSideBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * giantSideBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * giantSideBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * giantSideBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * giantSideBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * giantSideBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * giantSideBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * giantSideBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * giantSideBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * giantSideBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * giantSideBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * giantSideBhv.outideSql().removeBlockComment().selectList()
     * giantSideBhv.outideSql().removeLineComment().selectList()
     * giantSideBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<GiantSideBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends GiantSide> typeOfSelectedEntity() { return GiantSide.class; }
    protected Class<GiantSide> typeOfHandlingEntity() { return GiantSide.class; }
    protected Class<GiantSideCB> typeOfHandlingConditionBean() { return GiantSideCB.class; }
}
