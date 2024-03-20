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
package org.docksidestage.dbflute.cbean.nss;

import org.docksidestage.dbflute.cbean.cq.GiantCQ;

/**
 * The nest select set-upper of giant.
 * @author DBFlute(AutoGenerator)
 */
public class GiantNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final GiantCQ _query;
    public GiantNss(GiantCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * (Status of Giant)GIANT_STATUS by my GIANT_STATUS_CODE, named 'giantStatus'.
     */
    public void withGiantStatus() {
        _query.xdoNss(() -> _query.queryGiantStatus());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (Giant as base point)GIANT by my SELF_PARENT_ID, named 'giantSelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public GiantNss withGiantSelf() {
        _query.xdoNss(() -> _query.queryGiantSelf());
        return new GiantNss(_query.queryGiantSelf());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員)MEMBER by my ZONE_MEMBER_ID, named 'member'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberNss withMember() {
        _query.xdoNss(() -> _query.queryMember());
        return new MemberNss(_query.queryMember());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (商品)PRODUCT by my ZONE_PRODUCT_ID, named 'product'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public ProductNss withProduct() {
        _query.xdoNss(() -> _query.queryProduct());
        return new ProductNss(_query.queryProduct());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (購入)PURCHASE by my ZONE_PURCHASE_ID, named 'purchase'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public PurchaseNss withPurchase() {
        _query.xdoNss(() -> _query.queryPurchase());
        return new PurchaseNss(_query.queryPurchase());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (simple Side of Giant)giant_side by GIANT_ID, named 'giantSideAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public GiantSideNss withGiantSideAsOne() {
        _query.xdoNss(() -> _query.queryGiantSideAsOne());
        return new GiantSideNss(_query.queryGiantSideAsOne());
    }
}
