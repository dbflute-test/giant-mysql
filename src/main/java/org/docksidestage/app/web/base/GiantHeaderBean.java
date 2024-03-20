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

import org.docksidestage.mylasta.action.GiantUserBean;

/**
 * @author jflute
 */
public class GiantHeaderBean {

    private static final GiantHeaderBean EMPTY_INSTANCE = new GiantHeaderBean();

    public final Integer memberId;
    public final String memberName;
    public final boolean isLogin;

    private GiantHeaderBean() {
        this.memberId = null;
        this.memberName = null;
        this.isLogin = false;
    }

    public GiantHeaderBean(GiantUserBean userBean) {
        this.memberId = userBean.getMemberId();
        this.memberName = userBean.getMemberName();
        this.isLogin = true;
    }

    public static GiantHeaderBean empty() {
        return EMPTY_INSTANCE;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append(memberId);
        sb.append(",");
        sb.append(memberName);
        if (isLogin) {
            sb.append(", login");
        }
        sb.append("}");
        return sb.toString();
    }
}
