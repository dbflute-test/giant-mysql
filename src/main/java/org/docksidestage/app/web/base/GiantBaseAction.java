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
package org.docksidestage.app.web.base;

import javax.annotation.Resource;
import javax.validation.ConstraintViolation;

import org.dbflute.optional.OptionalThing;
import org.docksidestage.app.logic.context.AccessContextLogic;
import org.docksidestage.app.web.base.csrf.CsrfTokenAssist;
import org.docksidestage.app.web.base.login.GiantLoginAssist;
import org.docksidestage.bizfw.crosslogin.CrossLoginBridge;
import org.docksidestage.mylasta.action.GiantHtmlPath;
import org.docksidestage.mylasta.action.GiantMessages;
import org.docksidestage.mylasta.action.GiantUserBean;
import org.docksidestage.mylasta.direction.GiantConfig;
import org.lastaflute.core.message.UserMessages;
import org.lastaflute.core.message.supplier.UserMessagesCreator;
import org.lastaflute.db.dbflute.accesscontext.AccessContextArranger;
import org.lastaflute.web.TypicalAction;
import org.lastaflute.web.login.LoginManager;
import org.lastaflute.web.response.ActionResponse;
import org.lastaflute.web.ruts.process.ActionRuntime;
import org.lastaflute.web.servlet.request.RequestManager;
import org.lastaflute.web.validation.ActionValidator;
import org.lastaflute.web.validation.LaValidatable;

/**
 * @author jflute
 */
public abstract class GiantBaseAction extends TypicalAction // has several interfaces for direct use
        implements LaValidatable<GiantMessages>, GiantHtmlPath {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The application type for GiaNT, e.g. used by access context. */
    protected static final String APP_TYPE = "GNT";

    /** The user type for Member, e.g. used by access context. */
    protected static final String USER_TYPE = "M";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                 Basic
    //                                                 -----
    @Resource
    private RequestManager requestManager;
    @Resource
    private GiantConfig giantConfig;
    @Resource
    private GiantLoginAssist loginAssist;
    @Resource
    private AccessContextLogic accessContextLogic;

    // -----------------------------------------------------
    //                                           Cross Login
    //                                           -----------
    @Resource
    private CrossLoginBridge crossLoginBridge;

    // -----------------------------------------------------
    //                                            CSRF Token
    //                                            ----------
    @Resource
    private CsrfTokenAssist csrfTokenAssist;

    // ===================================================================================
    //                                                                          Validation
    //                                                                          ==========
    @Override
    protected <MESSAGES extends UserMessages> ActionValidator<MESSAGES> newActionValidator(RequestManager requestManager,
            UserMessagesCreator<MESSAGES> messagesCreator, Class<?>... runtimeGroups) {
        return new ActionValidator<MESSAGES>(requestManager, messagesCreator, runtimeGroups) {
            @Override
            protected String extractPropertyPath(ConstraintViolation<Object> vio) {
                return derivePropertyPathByNode(vio);
            }
        };
    }

    // ===================================================================================
    //                                                                               Hook
    //                                                                              ======
    // -----------------------------------------------------
    //                                              God Hand
    //                                              --------
    // to suppress unexpected override by sub-class
    // you should remove the 'final' if you need to override this
    @Override
    public final ActionResponse godHandPrologue(ActionRuntime runtime) {
        return super.godHandPrologue(runtime);
    }

    @Override
    public final ActionResponse godHandMonologue(ActionRuntime runtime) {
        return super.godHandMonologue(runtime);
    }

    @Override
    public final void godHandEpilogue(ActionRuntime runtime) {
        super.godHandEpilogue(runtime);
    }

    // -----------------------------------------------------
    //                                             Your Hook
    //                                             ---------
    // #app_customize you can customize the action hook
    @Override
    public ActionResponse hookBefore(ActionRuntime runtime) { // application may override
        crossLoginBridge.transfer(APP_TYPE, getUserBean(), USER_TYPE); // for e.g. RemoteApi
        csrfTokenAssist.hookBefore(runtime); // outsdie just decision-making

        return super.hookBefore(runtime);
    }

    @Override
    public void hookFinally(ActionRuntime runtime) { // application may override
        if (runtime.isForwardToHtml()) {
            runtime.registerData("headerBean", getUserBean().map(userBean -> {
                return new GiantHeaderBean(userBean);
            }).orElse(GiantHeaderBean.empty()));
        }
        super.hookFinally(runtime);

        csrfTokenAssist.hookFinally(runtime); // outsdie fitting with before
    }

    // ===================================================================================
    //                                                                      Access Context
    //                                                                      ==============
    @Override
    protected AccessContextArranger newAccessContextArranger() { // for framework
        return resource -> {
            return accessContextLogic.create(resource, () -> myUserType(), () -> getUserBean().map(userBean -> {
                return userBean.getUserId(); // as user expression
            }), () -> myAppType(), () -> requestManager.getHeaderUserAgent());
        };
    }

    // ===================================================================================
    //                                                                           User Info
    //                                                                           =========
    // -----------------------------------------------------
    //                                      Application Info
    //                                      ----------------
    @Override
    protected String myAppType() { // for framework
        return APP_TYPE;
    }

    // -----------------------------------------------------
    //                                            Login Info
    //                                            ----------
    // #app_customize return empty if login is unused
    @Override
    protected OptionalThing<GiantUserBean> getUserBean() { // application may call, overriding for co-variant
        return loginAssist.getSavedUserBean();
    }

    @Override
    protected OptionalThing<String> myUserType() { // for framework
        return OptionalThing.of(USER_TYPE);
    }

    @Override
    protected OptionalThing<LoginManager> myLoginManager() { // for framework
        return OptionalThing.of(loginAssist);
    }

    // ===================================================================================
    //                                                                          Validation
    //                                                                          ==========
    @SuppressWarnings("unchecked")
    @Override
    public ActionValidator<GiantMessages> createValidator() {
        return super.createValidator();
    }

    @Override
    public GiantMessages createMessages() { // application may call
        return new GiantMessages(); // overriding to change return type to concrete-class
    }

    // ===================================================================================
    //                                                                            Document
    //                                                                            ========
    // #app_customize you should override javadoc when you add new methods for sub class at super class.
    ///**
    // * {@inheritDoc} <br>
    // * Application Native Methods:
    // * <pre>
    // * <span style="font-size: 130%; color: #553000">[xxx]</span>
    // * o xxx() <span style="color: #3F7E5E">// xxx</span>
    // * </pre>
    // */
    //@Override
    //public void document1_CallableSuperMethod() {
    //    super.document1_CallableSuperMethod();
    //}
}
