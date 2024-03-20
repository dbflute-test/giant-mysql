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
package org.docksidestage.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.dbflute.exbhv.*;
import org.docksidestage.dbflute.exentity.*;
import org.docksidestage.dbflute.cbean.*;

/**
 * The referrer loader of (商品)PRODUCT as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_CATEGORY_CODE, PRODUCT_STATUS_CODE, REGULAR_PRICE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     PRODUCT_CATEGORY, PRODUCT_STATUS
 *
 * [referrer table]
 *     GIANT, GIANT_REF, GIANT_SIDE, PURCHASE
 *
 * [foreign property]
 *     productCategory, productStatus
 *
 * [referrer property]
 *     giantList, giantRefList, giantSideList, purchaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfProduct {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Product> _selectedList;
    protected BehaviorSelector _selector;
    protected ProductBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfProduct ready(List<Product> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ProductBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ProductBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Giant> _referrerGiant;

    /**
     * Load referrer of giantList by the set-upper of referrer. <br>
     * (Giant as base point)GIANT by ZONE_PRODUCT_ID, named 'giantList'.
     * <pre>
     * <span style="color: #0000C0">productBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">productList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadGiant</span>(<span style="color: #553000">giantCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">giantCB</span>.setupSelect...
     *         <span style="color: #553000">giantCB</span>.query().set...
     *         <span style="color: #553000">giantCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">giantLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    giantLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Product product : <span style="color: #553000">productList</span>) {
     *     ... = product.<span style="color: #CC4747">getGiantList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setZoneProductId_InScope(pkList);
     * cb.query().addOrderBy_ZoneProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfGiant> loadGiant(ReferrerConditionSetupper<GiantCB> refCBLambda) {
        myBhv().loadGiant(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerGiant = refLs);
        return hd -> hd.handle(new LoaderOfGiant().ready(_referrerGiant, _selector));
    }

    protected List<GiantRef> _referrerGiantRef;

    /**
     * Load referrer of giantRefList by the set-upper of referrer. <br>
     * (Referrer of Giant)GIANT_REF by ZONE_PRODUCT_ID, named 'giantRefList'.
     * <pre>
     * <span style="color: #0000C0">productBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">productList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadGiantRef</span>(<span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">refCB</span>.setupSelect...
     *         <span style="color: #553000">refCB</span>.query().set...
     *         <span style="color: #553000">refCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">refLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    refLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Product product : <span style="color: #553000">productList</span>) {
     *     ... = product.<span style="color: #CC4747">getGiantRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setZoneProductId_InScope(pkList);
     * cb.query().addOrderBy_ZoneProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfGiantRef> loadGiantRef(ReferrerConditionSetupper<GiantRefCB> refCBLambda) {
        myBhv().loadGiantRef(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerGiantRef = refLs);
        return hd -> hd.handle(new LoaderOfGiantRef().ready(_referrerGiantRef, _selector));
    }

    protected List<GiantSide> _referrerGiantSide;

    /**
     * Load referrer of giantSideList by the set-upper of referrer. <br>
     * (simple Side of Giant)GIANT_SIDE by ZONE_PRODUCT_ID, named 'giantSideList'.
     * <pre>
     * <span style="color: #0000C0">productBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">productList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadGiantSide</span>(<span style="color: #553000">sideCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">sideCB</span>.setupSelect...
     *         <span style="color: #553000">sideCB</span>.query().set...
     *         <span style="color: #553000">sideCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">sideLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    sideLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Product product : <span style="color: #553000">productList</span>) {
     *     ... = product.<span style="color: #CC4747">getGiantSideList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setZoneProductId_InScope(pkList);
     * cb.query().addOrderBy_ZoneProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfGiantSide> loadGiantSide(ReferrerConditionSetupper<GiantSideCB> refCBLambda) {
        myBhv().loadGiantSide(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerGiantSide = refLs);
        return hd -> hd.handle(new LoaderOfGiantSide().ready(_referrerGiantSide, _selector));
    }

    protected List<Purchase> _referrerPurchase;

    /**
     * Load referrer of purchaseList by the set-upper of referrer. <br>
     * (購入)PURCHASE by PRODUCT_ID, named 'purchaseList'.
     * <pre>
     * <span style="color: #0000C0">productBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">productList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">purchaseLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Product product : <span style="color: #553000">productList</span>) {
     *     ... = product.<span style="color: #CC4747">getPurchaseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfPurchase> loadPurchase(ReferrerConditionSetupper<PurchaseCB> refCBLambda) {
        myBhv().loadPurchase(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPurchase = refLs);
        return hd -> hd.handle(new LoaderOfPurchase().ready(_referrerPurchase, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfProductCategory _foreignProductCategoryLoader;
    public LoaderOfProductCategory pulloutProductCategory() {
        if (_foreignProductCategoryLoader == null)
        { _foreignProductCategoryLoader = new LoaderOfProductCategory().ready(myBhv().pulloutProductCategory(_selectedList), _selector); }
        return _foreignProductCategoryLoader;
    }

    protected LoaderOfProductStatus _foreignProductStatusLoader;
    public LoaderOfProductStatus pulloutProductStatus() {
        if (_foreignProductStatusLoader == null)
        { _foreignProductStatusLoader = new LoaderOfProductStatus().ready(myBhv().pulloutProductStatus(_selectedList), _selector); }
        return _foreignProductStatusLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Product> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
