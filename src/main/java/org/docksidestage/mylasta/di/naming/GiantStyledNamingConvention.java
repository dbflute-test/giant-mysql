/*
 * Copyright 2015-2019 the original author or authors.
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
package org.docksidestage.mylasta.di.naming;

import org.lastaflute.di.naming.StyledNamingConvention;

/**
 * @author jflute
 * @since Lasta Di-0.8.2 (2020/09/25)
 */
public class GiantStyledNamingConvention extends StyledNamingConvention {

    protected static final String APPLICATION_SERVICE_PACKAGE = "application";

    @Override
    public String fromSuffixToPackageName(String suffix) {
        if (suffix.equals(serviceSuffix)) {
            return APPLICATION_SERVICE_PACKAGE;
        }
        return super.fromSuffixToPackageName(suffix);
    }
}
