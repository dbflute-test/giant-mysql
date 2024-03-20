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
 * The referrer loader of (Giant as base point)GIANT as TABLE. <br>
 * <pre>
 * [primary key]
 *     GIANT_ID
 *
 * [column]
 *     GIANT_ID, GIANT_STATUS_CODE, INDEX_STRING, INDEX_INTEGER, INDEX_DATE, INDEX_DATETIME, INDEX_BOOLEAN, NON_INDEX_STRING, NON_INDEX_INTEGER, NON_INDEX_DATE, NON_INDEX_DATETIME, NON_INDEX_BOOLEAN, NULLABLE_INDEX_STRING, NULLABLE_INDEX_INTEGER, NULLABLE_INDEX_DATE, NULLABLE_INDEX_DATETIME, NULLABLE_INDEX_BOOLEAN, SELF_PARENT_ID, UNIQUE_1ST_INTEGER, UNIQUE_2ND_INTEGER, UNIQUE_3RD_INTEGER, UNIQUE_4TH_INTEGER, UNIQUE_STRING, UNIQUE_INTEGER, ZONE_MEMBER_ID, ZONE_PURCHASE_ID, ZONE_PRODUCT_ID
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
 *     GIANT_STATUS, GIANT, MEMBER, PRODUCT, PURCHASE, GIANT_SIDE(AsOne)
 *
 * [referrer table]
 *     GIANT, GIANT_REF, GIANT_SIDE
 *
 * [foreign property]
 *     giantStatus, giantSelf, member, product, purchase, giantSideAsOne
 *
 * [referrer property]
 *     giantSelfList, giantRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfGiant {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Giant> _selectedList;
    protected BehaviorSelector _selector;
    protected GiantBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfGiant ready(List<Giant> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected GiantBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(GiantBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Giant> _referrerGiantSelf;

    /**
     * Load referrer of giantSelfList by the set-upper of referrer. <br>
     * (Giant as base point)GIANT by SELF_PARENT_ID, named 'giantSelfList'.
     * <pre>
     * <span style="color: #0000C0">giantBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">giantList</span>, <span style="color: #553000">giantLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">giantLoader</span>.<span style="color: #CC4747">loadGiantSelf</span>(<span style="color: #553000">giantCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">giantCB</span>.setupSelect...
     *         <span style="color: #553000">giantCB</span>.query().set...
     *         <span style="color: #553000">giantCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">giantLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    giantLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Giant giant : <span style="color: #553000">giantList</span>) {
     *     ... = giant.<span style="color: #CC4747">getGiantSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSelfParentId_InScope(pkList);
     * cb.query().addOrderBy_SelfParentId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfGiant> loadGiantSelf(ReferrerConditionSetupper<GiantCB> refCBLambda) {
        myBhv().loadGiantSelf(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerGiantSelf = refLs);
        return hd -> hd.handle(new LoaderOfGiant().ready(_referrerGiantSelf, _selector));
    }

    protected List<GiantRef> _referrerGiantRef;

    /**
     * Load referrer of giantRefList by the set-upper of referrer. <br>
     * (Referrer of Giant)GIANT_REF by GIANT_ID, named 'giantRefList'.
     * <pre>
     * <span style="color: #0000C0">giantBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">giantList</span>, <span style="color: #553000">giantLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">giantLoader</span>.<span style="color: #CC4747">loadGiantRef</span>(<span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">refCB</span>.setupSelect...
     *         <span style="color: #553000">refCB</span>.query().set...
     *         <span style="color: #553000">refCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">refLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    refLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Giant giant : <span style="color: #553000">giantList</span>) {
     *     ... = giant.<span style="color: #CC4747">getGiantRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGiantId_InScope(pkList);
     * cb.query().addOrderBy_GiantId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfGiantRef> loadGiantRef(ReferrerConditionSetupper<GiantRefCB> refCBLambda) {
        myBhv().loadGiantRef(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerGiantRef = refLs);
        return hd -> hd.handle(new LoaderOfGiantRef().ready(_referrerGiantRef, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfGiantStatus _foreignGiantStatusLoader;
    public LoaderOfGiantStatus pulloutGiantStatus() {
        if (_foreignGiantStatusLoader == null)
        { _foreignGiantStatusLoader = new LoaderOfGiantStatus().ready(myBhv().pulloutGiantStatus(_selectedList), _selector); }
        return _foreignGiantStatusLoader;
    }

    protected LoaderOfGiant _foreignGiantSelfLoader;
    public LoaderOfGiant pulloutGiantSelf() {
        if (_foreignGiantSelfLoader == null)
        { _foreignGiantSelfLoader = new LoaderOfGiant().ready(myBhv().pulloutGiantSelf(_selectedList), _selector); }
        return _foreignGiantSelfLoader;
    }

    protected LoaderOfMember _foreignMemberLoader;
    public LoaderOfMember pulloutMember() {
        if (_foreignMemberLoader == null)
        { _foreignMemberLoader = new LoaderOfMember().ready(myBhv().pulloutMember(_selectedList), _selector); }
        return _foreignMemberLoader;
    }

    protected LoaderOfProduct _foreignProductLoader;
    public LoaderOfProduct pulloutProduct() {
        if (_foreignProductLoader == null)
        { _foreignProductLoader = new LoaderOfProduct().ready(myBhv().pulloutProduct(_selectedList), _selector); }
        return _foreignProductLoader;
    }

    protected LoaderOfPurchase _foreignPurchaseLoader;
    public LoaderOfPurchase pulloutPurchase() {
        if (_foreignPurchaseLoader == null)
        { _foreignPurchaseLoader = new LoaderOfPurchase().ready(myBhv().pulloutPurchase(_selectedList), _selector); }
        return _foreignPurchaseLoader;
    }

    protected LoaderOfGiantSide _foreignGiantSideAsOneLoader;
    public LoaderOfGiantSide pulloutGiantSideAsOne() {
        if (_foreignGiantSideAsOneLoader == null)
        { _foreignGiantSideAsOneLoader = new LoaderOfGiantSide().ready(myBhv().pulloutGiantSideAsOne(_selectedList), _selector); }
        return _foreignGiantSideAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Giant> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
