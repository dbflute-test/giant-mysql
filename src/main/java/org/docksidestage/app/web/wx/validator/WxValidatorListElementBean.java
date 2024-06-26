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
package org.docksidestage.app.web.wx.validator;

import javax.validation.Valid;

import org.lastaflute.web.validation.Required;

/**
 * @author jflute
 */
public class WxValidatorListElementBean {

    @Required
    public final Integer seaId;
    @Required
    public final String landName;
    @Valid
    public WhiteboxValidatorNestedBean nestedBean;
    public WxValidatorListElementBean recursiveBean; // cannot check #for_now

    public WxValidatorListElementBean(Integer seaId, String landName) {
        this.seaId = seaId;
        this.landName = landName;
    }

    public static class WhiteboxValidatorNestedBean {

        @Required
        public Integer piariId;

        @Required
        public Boolean bonvo;
    }
}
