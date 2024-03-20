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
package org.docksidestage.dbflute.exentity;

import org.docksidestage.dbflute.bsentity.BsGiant;

/**
 * The entity of GIANT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 * @author jflute
 */
public class Giant extends BsGiant implements Giantable {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    /** REF_COUNT_ALL: Derived Referrer Alias. */
    public static final String ALIAS_refCountAll = "REF_COUNT_ALL";

    /** REF_COUNT_ALL: (Derived Referrer) */
    protected Integer _refCountAll;

    /** SELF_COUNT_ALL: Derived Referrer Alias. */
    public static final String ALIAS_selfCountAll = "SELF_COUNT_ALL";

    /** SELF_COUNT_ALL: (Derived Referrer) */
    protected Integer _selfCountAll;

    /**
     * [get] REF_COUNT_ALL: (Derived Referrer)
     * @return The value of the column 'REF_COUNT_ALL'. (NullAllowed)
     */
    public Integer getRefCountAll() {
        return _refCountAll;
    }

    /**
     * [set] REF_COUNT_ALL: (Derived Referrer)
     * @param refCountAll The value of the column 'REF_COUNT_ALL'. (NullAllowed)
     */
    public void setRefCountAll(Integer refCountAll) {
        _refCountAll = refCountAll;
    }

    /**
     * [get] SELF_COUNT_ALL: (Derived Referrer)
     * @return The value of the column 'SELF_COUNT_ALL'. (NullAllowed)
     */
    public Integer getSelfCountAll() {
        return _selfCountAll;
    }

    /**
     * [set] SELF_COUNT_ALL: (Derived Referrer)
     * @param selfCountAll The value of the column 'SELF_COUNT_ALL'. (NullAllowed)
     */
    public void setSelfCountAll(Integer selfCountAll) {
        _selfCountAll = selfCountAll;
    }
}
