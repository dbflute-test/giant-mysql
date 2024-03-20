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

import org.dbflute.Entity;

/**
 * @author jflute
 */
public interface Giantable extends Entity {

    /**
     * [get] GIANT_ID: {PK, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'GIANT_ID'. (basically NotNull if selected: for the constraint)
     */
    Long getGiantId();

    /**
     * [set] GIANT_ID: {PK, NotNull, BIGINT(19)} <br>
     * @param giantId The value of the column 'GIANT_ID'. (basically NotNull if update: for the constraint)
     */
    void setGiantId(Long giantId);

    /**
     * [get] GIANT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to giant_status, classification=GiantStatus} <br>
     * @return The value of the column 'GIANT_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    String getGiantStatusCode();

    /**
     * [get] INDEX_STRING: {IX, NotNull, VARCHAR(64)} <br>
     * @return The value of the column 'INDEX_STRING'. (basically NotNull if selected: for the constraint)
     */
    String getIndexString();

    /**
     * [set] INDEX_STRING: {IX, NotNull, VARCHAR(64)} <br>
     * @param indexString The value of the column 'INDEX_STRING'. (basically NotNull if update: for the constraint)
     */
    void setIndexString(String indexString);

    /**
     * [get] INDEX_INTEGER: {IX, NotNull, INT(10)} <br>
     * @return The value of the column 'INDEX_INTEGER'. (basically NotNull if selected: for the constraint)
     */
    Integer getIndexInteger();

    /**
     * [set] INDEX_INTEGER: {IX, NotNull, INT(10)} <br>
     * @param indexInteger The value of the column 'INDEX_INTEGER'. (basically NotNull if update: for the constraint)
     */
    void setIndexInteger(Integer indexInteger);

    /**
     * [get] INDEX_DATE: {IX, NotNull, DATE(10)} <br>
     * @return The value of the column 'INDEX_DATE'. (basically NotNull if selected: for the constraint)
     */
    java.time.LocalDate getIndexDate();

    /**
     * [set] INDEX_DATE: {IX, NotNull, DATE(10)} <br>
     * @param indexDate The value of the column 'INDEX_DATE'. (basically NotNull if update: for the constraint)
     */
    void setIndexDate(java.time.LocalDate indexDate);

    /**
     * [get] INDEX_DATETIME: {IX, NotNull, DATETIME(19)} <br>
     * @return The value of the column 'INDEX_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    java.time.LocalDateTime getIndexDatetime();

    /**
     * [set] INDEX_DATETIME: {IX, NotNull, DATETIME(19)} <br>
     * @param indexDatetime The value of the column 'INDEX_DATETIME'. (basically NotNull if update: for the constraint)
     */
    void setIndexDatetime(java.time.LocalDateTime indexDatetime);

    /**
     * [get] INDEX_BOOLEAN: {IX, NotNull, BIT} <br>
     * @return The value of the column 'INDEX_BOOLEAN'. (basically NotNull if selected: for the constraint)
     */
    Boolean getIndexBoolean();

    /**
     * [set] INDEX_BOOLEAN: {IX, NotNull, BIT} <br>
     * @param indexBoolean The value of the column 'INDEX_BOOLEAN'. (basically NotNull if update: for the constraint)
     */
    void setIndexBoolean(Boolean indexBoolean);

    /**
     * [get] NON_INDEX_STRING: {NotNull, VARCHAR(64)} <br>
     * @return The value of the column 'NON_INDEX_STRING'. (basically NotNull if selected: for the constraint)
     */
    String getNonIndexString();

    /**
     * [set] NON_INDEX_STRING: {NotNull, VARCHAR(64)} <br>
     * @param nonIndexString The value of the column 'NON_INDEX_STRING'. (basically NotNull if update: for the constraint)
     */
    void setNonIndexString(String nonIndexString);

    /**
     * [get] NON_INDEX_INTEGER: {NotNull, INT(10)} <br>
     * @return The value of the column 'NON_INDEX_INTEGER'. (basically NotNull if selected: for the constraint)
     */
    Integer getNonIndexInteger();

    /**
     * [set] NON_INDEX_INTEGER: {NotNull, INT(10)} <br>
     * @param nonIndexInteger The value of the column 'NON_INDEX_INTEGER'. (basically NotNull if update: for the constraint)
     */
    void setNonIndexInteger(Integer nonIndexInteger);

    /**
     * [get] NON_INDEX_DATE: {NotNull, DATE(10)} <br>
     * @return The value of the column 'NON_INDEX_DATE'. (basically NotNull if selected: for the constraint)
     */
    java.time.LocalDate getNonIndexDate();

    /**
     * [set] NON_INDEX_DATE: {NotNull, DATE(10)} <br>
     * @param nonIndexDate The value of the column 'NON_INDEX_DATE'. (basically NotNull if update: for the constraint)
     */
    void setNonIndexDate(java.time.LocalDate nonIndexDate);

    /**
     * [get] NON_INDEX_DATETIME: {NotNull, DATETIME(19)} <br>
     * @return The value of the column 'NON_INDEX_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    java.time.LocalDateTime getNonIndexDatetime();

    /**
     * [set] NON_INDEX_DATETIME: {NotNull, DATETIME(19)} <br>
     * @param nonIndexDatetime The value of the column 'NON_INDEX_DATETIME'. (basically NotNull if update: for the constraint)
     */
    void setNonIndexDatetime(java.time.LocalDateTime nonIndexDatetime);

    /**
     * [get] NON_INDEX_BOOLEAN: {NotNull, BIT} <br>
     * @return The value of the column 'NON_INDEX_BOOLEAN'. (basically NotNull if selected: for the constraint)
     */
    Boolean getNonIndexBoolean();

    /**
     * [set] NON_INDEX_BOOLEAN: {NotNull, BIT} <br>
     * @param nonIndexBoolean The value of the column 'NON_INDEX_BOOLEAN'. (basically NotNull if update: for the constraint)
     */
    void setNonIndexBoolean(Boolean nonIndexBoolean);

    /**
     * [get] NULLABLE_INDEX_STRING: {IX, VARCHAR(64)} <br>
     * @return The value of the column 'NULLABLE_INDEX_STRING'. (NullAllowed even if selected: for no constraint)
     */
    String getNullableIndexString();

    /**
     * [set] NULLABLE_INDEX_STRING: {IX, VARCHAR(64)} <br>
     * @param nullableIndexString The value of the column 'NULLABLE_INDEX_STRING'. (NullAllowed: null update allowed for no constraint)
     */
    void setNullableIndexString(String nullableIndexString);

    /**
     * [get] NULLABLE_INDEX_INTEGER: {IX, INT(10)} <br>
     * @return The value of the column 'NULLABLE_INDEX_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    Integer getNullableIndexInteger();

    /**
     * [set] NULLABLE_INDEX_INTEGER: {IX, INT(10)} <br>
     * @param nullableIndexInteger The value of the column 'NULLABLE_INDEX_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    void setNullableIndexInteger(Integer nullableIndexInteger);

    /**
     * [get] NULLABLE_INDEX_DATE: {IX, DATE(10)} <br>
     * @return The value of the column 'NULLABLE_INDEX_DATE'. (NullAllowed even if selected: for no constraint)
     */
    java.time.LocalDate getNullableIndexDate();

    /**
     * [set] NULLABLE_INDEX_DATE: {IX, DATE(10)} <br>
     * @param nullableIndexDate The value of the column 'NULLABLE_INDEX_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    void setNullableIndexDate(java.time.LocalDate nullableIndexDate);

    /**
     * [get] NULLABLE_INDEX_DATETIME: {IX, DATETIME(19)} <br>
     * @return The value of the column 'NULLABLE_INDEX_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    java.time.LocalDateTime getNullableIndexDatetime();

    /**
     * [set] NULLABLE_INDEX_DATETIME: {IX, DATETIME(19)} <br>
     * @param nullableIndexDatetime The value of the column 'NULLABLE_INDEX_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    void setNullableIndexDatetime(java.time.LocalDateTime nullableIndexDatetime);

    /**
     * [get] NULLABLE_INDEX_BOOLEAN: {IX, BIT} <br>
     * @return The value of the column 'NULLABLE_INDEX_BOOLEAN'. (NullAllowed even if selected: for no constraint)
     */
    Boolean getNullableIndexBoolean();

    /**
     * [set] NULLABLE_INDEX_BOOLEAN: {IX, BIT} <br>
     * @param nullableIndexBoolean The value of the column 'NULLABLE_INDEX_BOOLEAN'. (NullAllowed: null update allowed for no constraint)
     */
    void setNullableIndexBoolean(Boolean nullableIndexBoolean);

    /**
     * [get] SELF_PARENT_ID: {IX, BIGINT(19), FK to giant} <br>
     * @return The value of the column 'SELF_PARENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    Long getSelfParentId();

    /**
     * [set] SELF_PARENT_ID: {IX, BIGINT(19), FK to giant} <br>
     * @param selfParentId The value of the column 'SELF_PARENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    void setSelfParentId(Long selfParentId);

    /**
     * [get] (root of compound unique index)UNIQUE_1ST_INTEGER: {UQ+, NotNull, INT(10)} <br>
     * @return The value of the column 'UNIQUE_1ST_INTEGER'. (basically NotNull if selected: for the constraint)
     */
    Integer getUnique1stInteger();

    /**
     * [set] (root of compound unique index)UNIQUE_1ST_INTEGER: {UQ+, NotNull, INT(10)} <br>
     * @param unique1stInteger The value of the column 'UNIQUE_1ST_INTEGER'. (basically NotNull if update: for the constraint)
     */
    void setUnique1stInteger(Integer unique1stInteger);

    /**
     * [get] (has single index for itself)UNIQUE_2ND_INTEGER: {+UQ, IX, NotNull, INT(10)} <br>
     * @return The value of the column 'UNIQUE_2ND_INTEGER'. (basically NotNull if selected: for the constraint)
     */
    Integer getUnique2ndInteger();

    /**
     * [set] (has single index for itself)UNIQUE_2ND_INTEGER: {+UQ, IX, NotNull, INT(10)} <br>
     * @param unique2ndInteger The value of the column 'UNIQUE_2ND_INTEGER'. (basically NotNull if update: for the constraint)
     */
    void setUnique2ndInteger(Integer unique2ndInteger);

    /**
     * [get] (no single index)UNIQUE_3RD_INTEGER: {+UQ, NotNull, INT(10)} <br>
     * @return The value of the column 'UNIQUE_3RD_INTEGER'. (basically NotNull if selected: for the constraint)
     */
    Integer getUnique3rdInteger();

    /**
     * [set] (no single index)UNIQUE_3RD_INTEGER: {+UQ, NotNull, INT(10)} <br>
     * @param unique3rdInteger The value of the column 'UNIQUE_3RD_INTEGER'. (basically NotNull if update: for the constraint)
     */
    void setUnique3rdInteger(Integer unique3rdInteger);

    /**
     * [get] (has single index for itself)UNIQUE_4TH_INTEGER: {+UQ, IX, NotNull, INT(10)} <br>
     * @return The value of the column 'UNIQUE_4TH_INTEGER'. (basically NotNull if selected: for the constraint)
     */
    Integer getUnique4thInteger();

    /**
     * [set] (has single index for itself)UNIQUE_4TH_INTEGER: {+UQ, IX, NotNull, INT(10)} <br>
     * @param unique4thInteger The value of the column 'UNIQUE_4TH_INTEGER'. (basically NotNull if update: for the constraint)
     */
    void setUnique4thInteger(Integer unique4thInteger);

    /**
     * [get] UNIQUE_STRING: {UQ, NotNull, VARCHAR(64)} <br>
     * @return The value of the column 'UNIQUE_STRING'. (basically NotNull if selected: for the constraint)
     */
    String getUniqueString();

    /**
     * [set] UNIQUE_STRING: {UQ, NotNull, VARCHAR(64)} <br>
     * @param uniqueString The value of the column 'UNIQUE_STRING'. (basically NotNull if update: for the constraint)
     */
    void setUniqueString(String uniqueString);

    /**
     * [get] UNIQUE_INTEGER: {UQ, NotNull, INT(10)} <br>
     * @return The value of the column 'UNIQUE_INTEGER'. (basically NotNull if selected: for the constraint)
     */
    Integer getUniqueInteger();

    /**
     * [set] UNIQUE_INTEGER: {UQ, NotNull, INT(10)} <br>
     * @param uniqueInteger The value of the column 'UNIQUE_INTEGER'. (basically NotNull if update: for the constraint)
     */
    void setUniqueInteger(Integer uniqueInteger);

    /**
     * [get] ZONE_MEMBER_ID: {IX, NotNull, INT(10), FK to member} <br>
     * @return The value of the column 'ZONE_MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    Integer getZoneMemberId();

    /**
     * [set] ZONE_MEMBER_ID: {IX, NotNull, INT(10), FK to member} <br>
     * @param zoneMemberId The value of the column 'ZONE_MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    void setZoneMemberId(Integer zoneMemberId);

    /**
     * [get] ZONE_PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase} <br>
     * @return The value of the column 'ZONE_PURCHASE_ID'. (basically NotNull if selected: for the constraint)
     */
    Long getZonePurchaseId();

    /**
     * [set] ZONE_PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase} <br>
     * @param zonePurchaseId The value of the column 'ZONE_PURCHASE_ID'. (basically NotNull if update: for the constraint)
     */
    void setZonePurchaseId(Long zonePurchaseId);

    /**
     * [get] ZONE_PRODUCT_ID: {IX, NotNull, INT(10), FK to product} <br>
     * @return The value of the column 'ZONE_PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    Integer getZoneProductId();

    /**
     * [set] ZONE_PRODUCT_ID: {IX, NotNull, INT(10), FK to product} <br>
     * @param zoneProductId The value of the column 'ZONE_PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    void setZoneProductId(Integer zoneProductId);

    /**
     * For framework so basically DON'T use this method.
     * @param giantStatusCode The value of the column 'GIANT_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    void mynativeMappingGiantStatusCode(String giantStatusCode);
}
