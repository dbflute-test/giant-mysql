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
 * The referrer loader of (Referrer of Giant)GIANT_REF as TABLE. <br>
 * <pre>
 * [primary key]
 *     GIANT_REF_ID
 *
 * [column]
 *     GIANT_REF_ID, GIANT_ID, GIANT_STATUS_CODE, INDEX_STRING, INDEX_INTEGER, INDEX_DATE, INDEX_DATETIME, INDEX_BOOLEAN, NON_INDEX_STRING, NON_INDEX_INTEGER, NON_INDEX_DATE, NON_INDEX_DATETIME, NON_INDEX_BOOLEAN, NULLABLE_INDEX_STRING, NULLABLE_INDEX_INTEGER, NULLABLE_INDEX_DATE, NULLABLE_INDEX_DATETIME, NULLABLE_INDEX_BOOLEAN, SELF_PARENT_ID, UNIQUE_1ST_INTEGER, UNIQUE_2ND_INTEGER, UNIQUE_3RD_INTEGER, UNIQUE_4TH_INTEGER, UNIQUE_STRING, UNIQUE_INTEGER, ZONE_MEMBER_ID, ZONE_PURCHASE_ID, ZONE_PRODUCT_ID
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
 *     GIANT, GIANT_STATUS, GIANT_REF, MEMBER, PRODUCT, PURCHASE
 *
 * [referrer table]
 *     GIANT_REF
 *
 * [foreign property]
 *     giant, giantStatus, giantRefSelf, member, product, purchase
 *
 * [referrer property]
 *     giantRefSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfGiantRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<GiantRef> _selectedList;
    protected BehaviorSelector _selector;
    protected GiantRefBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfGiantRef ready(List<GiantRef> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected GiantRefBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(GiantRefBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<GiantRef> _referrerGiantRefSelf;

    /**
     * Load referrer of giantRefSelfList by the set-upper of referrer. <br>
     * (Referrer of Giant)GIANT_REF by SELF_PARENT_ID, named 'giantRefSelfList'.
     * <pre>
     * <span style="color: #0000C0">giantRefBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">giantRefList</span>, <span style="color: #553000">refLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">refLoader</span>.<span style="color: #CC4747">loadGiantRefSelf</span>(<span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">refCB</span>.setupSelect...
     *         <span style="color: #553000">refCB</span>.query().set...
     *         <span style="color: #553000">refCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">refLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    refLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (GiantRef giantRef : <span style="color: #553000">giantRefList</span>) {
     *     ... = giantRef.<span style="color: #CC4747">getGiantRefSelfList()</span>;
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
    public NestedReferrerLoaderGateway<LoaderOfGiantRef> loadGiantRefSelf(ReferrerConditionSetupper<GiantRefCB> refCBLambda) {
        myBhv().loadGiantRefSelf(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerGiantRefSelf = refLs);
        return hd -> hd.handle(new LoaderOfGiantRef().ready(_referrerGiantRefSelf, _selector));
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

    protected LoaderOfGiantRef _foreignGiantRefSelfLoader;
    public LoaderOfGiantRef pulloutGiantRefSelf() {
        if (_foreignGiantRefSelfLoader == null)
        { _foreignGiantRefSelfLoader = new LoaderOfGiantRef().ready(myBhv().pulloutGiantRefSelf(_selectedList), _selector); }
        return _foreignGiantRefSelfLoader;
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
    public List<GiantRef> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
