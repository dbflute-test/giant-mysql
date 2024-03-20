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
 * The referrer loader of (simple Side of Giant)GIANT_SIDE as TABLE. <br>
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
public class LoaderOfGiantSide {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<GiantSide> _selectedList;
    protected BehaviorSelector _selector;
    protected GiantSideBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfGiantSide ready(List<GiantSide> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected GiantSideBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(GiantSideBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<GiantSide> _referrerGiantSideSelf;

    /**
     * Load referrer of giantSideSelfList by the set-upper of referrer. <br>
     * (simple Side of Giant)GIANT_SIDE by SELF_PARENT_ID, named 'giantSideSelfList'.
     * <pre>
     * <span style="color: #0000C0">giantSideBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">giantSideList</span>, <span style="color: #553000">sideLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">sideLoader</span>.<span style="color: #CC4747">loadGiantSideSelf</span>(<span style="color: #553000">sideCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">sideCB</span>.setupSelect...
     *         <span style="color: #553000">sideCB</span>.query().set...
     *         <span style="color: #553000">sideCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">sideLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    sideLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (GiantSide giantSide : <span style="color: #553000">giantSideList</span>) {
     *     ... = giantSide.<span style="color: #CC4747">getGiantSideSelfList()</span>;
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
    public NestedReferrerLoaderGateway<LoaderOfGiantSide> loadGiantSideSelf(ReferrerConditionSetupper<GiantSideCB> refCBLambda) {
        myBhv().loadGiantSideSelf(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerGiantSideSelf = refLs);
        return hd -> hd.handle(new LoaderOfGiantSide().ready(_referrerGiantSideSelf, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfGiant _foreignGiantLoader;
    public LoaderOfGiant pulloutGiant() {
        if (_foreignGiantLoader == null)
        { _foreignGiantLoader = new LoaderOfGiant().ready(myBhv().pulloutGiant(_selectedList), _selector); }
        return _foreignGiantLoader;
    }

    protected LoaderOfGiantStatus _foreignGiantStatusLoader;
    public LoaderOfGiantStatus pulloutGiantStatus() {
        if (_foreignGiantStatusLoader == null)
        { _foreignGiantStatusLoader = new LoaderOfGiantStatus().ready(myBhv().pulloutGiantStatus(_selectedList), _selector); }
        return _foreignGiantStatusLoader;
    }

    protected LoaderOfGiantSide _foreignGiantSideSelfLoader;
    public LoaderOfGiantSide pulloutGiantSideSelf() {
        if (_foreignGiantSideSelfLoader == null)
        { _foreignGiantSideSelfLoader = new LoaderOfGiantSide().ready(myBhv().pulloutGiantSideSelf(_selectedList), _selector); }
        return _foreignGiantSideSelfLoader;
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

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<GiantSide> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
