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
package org.docksidestage.mylasta.direction;

import javax.annotation.Resource;

import org.docksidestage.bizfw.thymeleaf.ThymeleafConfigObject;
import org.docksidestage.bizfw.thymeleaf.ThymeleafJavaScriptSerializer;
import org.docksidestage.mylasta.direction.sponsor.GiantActionAdjustmentProvider;
import org.docksidestage.mylasta.direction.sponsor.GiantApiFailureHook;
import org.docksidestage.mylasta.direction.sponsor.GiantConcurrentAsyncExecutorProvider;
import org.docksidestage.mylasta.direction.sponsor.GiantCookieResourceProvider;
import org.docksidestage.mylasta.direction.sponsor.GiantCurtainBeforeHook;
import org.docksidestage.mylasta.direction.sponsor.GiantJsonResourceProvider;
import org.docksidestage.mylasta.direction.sponsor.GiantListedClassificationProvider;
import org.docksidestage.mylasta.direction.sponsor.GiantMailDeliveryDepartmentCreator;
import org.docksidestage.mylasta.direction.sponsor.GiantMultipartRequestHandler;
import org.docksidestage.mylasta.direction.sponsor.GiantPropertyFilter;
import org.docksidestage.mylasta.direction.sponsor.GiantSecurityResourceProvider;
import org.docksidestage.mylasta.direction.sponsor.GiantTimeResourceProvider;
import org.docksidestage.mylasta.direction.sponsor.GiantUserLocaleProcessProvider;
import org.docksidestage.mylasta.direction.sponsor.GiantUserTimeZoneProcessProvider;
import org.lastaflute.core.direction.CachedFwAssistantDirector;
import org.lastaflute.core.direction.FwAssistDirection;
import org.lastaflute.core.direction.FwCoreDirection;
import org.lastaflute.core.json.JsonManager;
import org.lastaflute.core.security.InvertibleCryptographer;
import org.lastaflute.core.security.OneWayCryptographer;
import org.lastaflute.core.util.ContainerUtil;
import org.lastaflute.db.dbflute.classification.ListedClassificationProvider;
import org.lastaflute.db.direction.FwDbDirection;
import org.lastaflute.thymeleaf.ThymeleafRenderingProvider;
import org.lastaflute.web.direction.FwWebDirection;
import org.lastaflute.web.ruts.multipart.MultipartResourceProvider;
import org.lastaflute.web.ruts.renderer.HtmlRenderingProvider;

/**
 * @author jflute
 */
public class GiantFwAssistantDirector extends CachedFwAssistantDirector {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private GiantConfig config;

    // ===================================================================================
    //                                                                              Assist
    //                                                                              ======
    @Override
    protected void prepareAssistDirection(FwAssistDirection direction) {
        direction.directConfig(nameList -> {
            nameList.add("giant_config.properties");
            nameList.add("giant_thymeleaf_config.properties");
        }, "giant_env.properties");
        direction.directPropertyFilter(createPropertyFilter());
    }

    protected GiantPropertyFilter createPropertyFilter() {
        return new GiantPropertyFilter();
    }

    // ===================================================================================
    //                                                                                Core
    //                                                                                ====
    @Override
    protected void prepareCoreDirection(FwCoreDirection direction) {
        // this configuration is on giant_env.properties because this is true only when development
        direction.directDevelopmentHere(config.isDevelopmentHere());

        // titles of the application for logging are from configurations
        direction.directLoggingTitle(config.getDomainTitle(), config.getEnvironmentTitle());

        // this configuration is on sea_env.properties because it has no influence to production
        // even if you set true manually and forget to set false back
        direction.directFrameworkDebug(config.isFrameworkDebug()); // basically false

        // you can add your own process when your application's curtain before
        direction.directCurtainBefore(createCurtainBeforeListener());

        direction.directSecurity(createSecurityResourceProvider());
        direction.directTime(createTimeResourceProvider());
        direction.directJson(createJsonResourceProvider());
        direction.directMail(createMailDeliveryDepartmentCreator().create());
        direction.directAsync(createConcurrentAsyncExecutorProvider());
    }

    protected GiantCurtainBeforeHook createCurtainBeforeListener() {
        return new GiantCurtainBeforeHook(config);
    }

    protected GiantSecurityResourceProvider createSecurityResourceProvider() { // #change_it
        final InvertibleCryptographer inver = InvertibleCryptographer.createAesCipher("giant12345678");
        final OneWayCryptographer oneWay = OneWayCryptographer.createSha256Cryptographer();
        return new GiantSecurityResourceProvider(inver, oneWay);
    }

    protected GiantTimeResourceProvider createTimeResourceProvider() {
        return new GiantTimeResourceProvider(config);
    }

    protected GiantJsonResourceProvider createJsonResourceProvider() {
        return new GiantJsonResourceProvider();
    }

    protected GiantMailDeliveryDepartmentCreator createMailDeliveryDepartmentCreator() {
        return new GiantMailDeliveryDepartmentCreator(config);
    }

    protected GiantConcurrentAsyncExecutorProvider createConcurrentAsyncExecutorProvider() {
        return new GiantConcurrentAsyncExecutorProvider();
    }

    // ===================================================================================
    //                                                                                 DB
    //                                                                                ====
    @Override
    protected void prepareDbDirection(FwDbDirection direction) {
        direction.directClassification(createListedClassificationProvider());
    }

    protected ListedClassificationProvider createListedClassificationProvider() {
        return new GiantListedClassificationProvider();
    }

    // ===================================================================================
    //                                                                                Web
    //                                                                               =====
    @Override
    protected void prepareWebDirection(FwWebDirection direction) {
        direction.directRequest(createUserLocaleProcessProvider(), createUserTimeZoneProcessProvider());
        direction.directCookie(createCookieResourceProvider());
        direction.directAdjustment(createActionAdjustmentProvider());
        direction.directMessage(nameList -> nameList.add("giant_message"), "giant_label");
        direction.directApiCall(createApiFailureHook());
        direction.directHtmlRendering(createHtmlRenderingProvider());
        direction.directMultipart(createMultipartResourceProvider());
    }

    protected GiantUserLocaleProcessProvider createUserLocaleProcessProvider() {
        return new GiantUserLocaleProcessProvider();
    }

    protected GiantUserTimeZoneProcessProvider createUserTimeZoneProcessProvider() {
        return new GiantUserTimeZoneProcessProvider();
    }

    protected GiantCookieResourceProvider createCookieResourceProvider() { // #change_it
        final InvertibleCryptographer cr = InvertibleCryptographer.createAesCipher("12345678giant");
        return new GiantCookieResourceProvider(config, cr);
    }

    protected GiantActionAdjustmentProvider createActionAdjustmentProvider() {
        return new GiantActionAdjustmentProvider(config);
    }

    protected GiantApiFailureHook createApiFailureHook() {
        return new GiantApiFailureHook();
    }

    protected HtmlRenderingProvider createHtmlRenderingProvider() {
        return new ThymeleafRenderingProvider().asDevelopment(config.isDevelopmentHere()).additionalExpression(resource -> {
            resource.registerExpressionObject("config", new ThymeleafConfigObject(config));
        }).customizeStandardDialect(dialect -> {
            JsonManager jsonManager = ContainerUtil.getComponent(JsonManager.class);
            dialect.setJavaScriptSerializer(new ThymeleafJavaScriptSerializer(jsonManager));
        });
    }

    // -----------------------------------------------------
    //                                             Multipart
    //                                             ---------
    protected MultipartResourceProvider createMultipartResourceProvider() {
        return () -> new GiantMultipartRequestHandler();
    }
}
