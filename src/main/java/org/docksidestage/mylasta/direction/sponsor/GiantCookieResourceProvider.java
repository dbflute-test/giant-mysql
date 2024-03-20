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
package org.docksidestage.mylasta.direction.sponsor;

import org.docksidestage.mylasta.direction.GiantConfig;
import org.lastaflute.core.security.InvertibleCryptographer;
import org.lastaflute.web.servlet.cookie.CookieResourceProvider;

/**
 * @author jflute
 */
public class GiantCookieResourceProvider implements CookieResourceProvider {

    protected final GiantConfig giantConfig;
    protected final InvertibleCryptographer cookieCipher;

    public GiantCookieResourceProvider(GiantConfig giantConfig, InvertibleCryptographer cookieCipher) {
        this.giantConfig = giantConfig;
        this.cookieCipher = cookieCipher;
    }

    public String provideDefaultPath() {
        return giantConfig.getCookieDefaultPath();
    }

    public Integer provideDefaultExpire() {
        return giantConfig.getCookieDefaultExpireAsInteger();
    }

    public InvertibleCryptographer provideCipher() {
        return cookieCipher;
    }
}
