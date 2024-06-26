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
package org.docksidestage.app.web.ballet.dancers.greatest.favorite.studios.assist;

import java.util.List;

import javax.annotation.Resource;

import org.docksidestage.app.web.ballet.dancers.greatest.favorite.studios.GreatestFavoriteStudiosSearchForm;
import org.docksidestage.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.dbflute.exentity.Purchase;

/**
 * @author jflute
 */
public class GreatestFavoriteStudiosCrudAssist {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private PurchaseBhv purchaseBhv;

    // ===================================================================================
    //                                                                              Select
    //                                                                              ======
    public List<Purchase> selectPurchaseList(Integer productId, GreatestFavoriteStudiosSearchForm form) {
        return purchaseBhv.selectList(cb -> {
            cb.setupSelect_Member();
            cb.setupSelect_Product();
            cb.query().setProductId_Equal(productId);
            cb.query().addOrderBy_PurchaseDatetime_Desc();
        });
    }

    public Purchase selectPurchaseById(Integer productId, Long purchaseId) {
        return purchaseBhv.selectEntity(cb -> {
            cb.setupSelect_Member();
            cb.setupSelect_Product();
            cb.query().setProductId_Equal(productId); // #for_now jflute needed? (2021/05/15)
            cb.query().setPurchaseId_Equal(purchaseId);
        }).get();
    }
}
