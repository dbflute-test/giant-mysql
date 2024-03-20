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
 * The referrer loader of (Status of Giant)GIANT_STATUS as TABLE. <br>
 * <pre>
 * [primary key]
 *     GIANT_STATUS_CODE
 *
 * [column]
 *     GIANT_STATUS_CODE, GIANT_STATUS_NAME, DISPLAY_ORDER, DESCRIPTION
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
 *     
 *
 * [referrer table]
 *     GIANT, GIANT_REF, GIANT_SIDE
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     giantList, giantRefList, giantSideList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfGiantStatus {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<GiantStatus> _selectedList;
    protected BehaviorSelector _selector;
    protected GiantStatusBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfGiantStatus ready(List<GiantStatus> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected GiantStatusBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(GiantStatusBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Giant> _referrerGiant;

    /**
     * Load referrer of giantList by the set-upper of referrer. <br>
     * (Giant as base point)GIANT by GIANT_STATUS_CODE, named 'giantList'.
     * <pre>
     * <span style="color: #0000C0">giantStatusBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">giantStatusList</span>, <span style="color: #553000">statusLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">statusLoader</span>.<span style="color: #CC4747">loadGiant</span>(<span style="color: #553000">giantCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">giantCB</span>.setupSelect...
     *         <span style="color: #553000">giantCB</span>.query().set...
     *         <span style="color: #553000">giantCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">giantLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    giantLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (GiantStatus giantStatus : <span style="color: #553000">giantStatusList</span>) {
     *     ... = giantStatus.<span style="color: #CC4747">getGiantList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGiantStatusCode_InScope(pkList);
     * cb.query().addOrderBy_GiantStatusCode_Asc();
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
     * (Referrer of Giant)GIANT_REF by GIANT_STATUS_CODE, named 'giantRefList'.
     * <pre>
     * <span style="color: #0000C0">giantStatusBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">giantStatusList</span>, <span style="color: #553000">statusLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">statusLoader</span>.<span style="color: #CC4747">loadGiantRef</span>(<span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">refCB</span>.setupSelect...
     *         <span style="color: #553000">refCB</span>.query().set...
     *         <span style="color: #553000">refCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">refLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    refLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (GiantStatus giantStatus : <span style="color: #553000">giantStatusList</span>) {
     *     ... = giantStatus.<span style="color: #CC4747">getGiantRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGiantStatusCode_InScope(pkList);
     * cb.query().addOrderBy_GiantStatusCode_Asc();
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
     * (simple Side of Giant)GIANT_SIDE by GIANT_STATUS_CODE, named 'giantSideList'.
     * <pre>
     * <span style="color: #0000C0">giantStatusBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">giantStatusList</span>, <span style="color: #553000">statusLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">statusLoader</span>.<span style="color: #CC4747">loadGiantSide</span>(<span style="color: #553000">sideCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">sideCB</span>.setupSelect...
     *         <span style="color: #553000">sideCB</span>.query().set...
     *         <span style="color: #553000">sideCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">sideLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    sideLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (GiantStatus giantStatus : <span style="color: #553000">giantStatusList</span>) {
     *     ... = giantStatus.<span style="color: #CC4747">getGiantSideList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGiantStatusCode_InScope(pkList);
     * cb.query().addOrderBy_GiantStatusCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfGiantSide> loadGiantSide(ReferrerConditionSetupper<GiantSideCB> refCBLambda) {
        myBhv().loadGiantSide(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerGiantSide = refLs);
        return hd -> hd.handle(new LoaderOfGiantSide().ready(_referrerGiantSide, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<GiantStatus> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
