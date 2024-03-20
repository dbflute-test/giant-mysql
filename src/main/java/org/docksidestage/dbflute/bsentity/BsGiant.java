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
package org.docksidestage.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.dbflute.allcommon.CDef;
import org.docksidestage.dbflute.exentity.*;

/**
 * The entity of (Giant as base point)GIANT as TABLE. <br>
 * many records
 * <pre>
 * [primary-key]
 *     GIANT_ID
 *
 * [column]
 *     GIANT_ID, GIANT_STATUS_CODE, INDEX_STRING, INDEX_INTEGER, INDEX_DATE, INDEX_DATETIME, INDEX_BOOLEAN, NON_INDEX_STRING, NON_INDEX_INTEGER, NON_INDEX_DATE, NON_INDEX_DATETIME, NON_INDEX_BOOLEAN, NULLABLE_INDEX_STRING, NULLABLE_INDEX_INTEGER, NULLABLE_INDEX_DATE, NULLABLE_INDEX_DATETIME, NULLABLE_INDEX_BOOLEAN, SELF_PARENT_ID, UNIQUE_1ST_INTEGER, UNIQUE_2ND_INTEGER, UNIQUE_3RD_INTEGER, UNIQUE_4TH_INTEGER, UNIQUE_STRING, UNIQUE_INTEGER, ZONE_MEMBER_ID, ZONE_PURCHASE_ID, ZONE_PRODUCT_ID
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     GIANT_STATUS, GIANT, MEMBER, PRODUCT, PURCHASE, GIANT_SIDE(AsOne)
 *
 * [referrer table]
 *     GIANT, GIANT_REF, GIANT_SIDE
 *
 * [foreign property]
 *     giantStatus, giantSelf, member, product, purchase, giantSideAsOne
 *
 * [referrer property]
 *     giantSelfList, giantRefList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long giantId = entity.getGiantId();
 * String giantStatusCode = entity.getGiantStatusCode();
 * String indexString = entity.getIndexString();
 * Integer indexInteger = entity.getIndexInteger();
 * java.time.LocalDate indexDate = entity.getIndexDate();
 * java.time.LocalDateTime indexDatetime = entity.getIndexDatetime();
 * Boolean indexBoolean = entity.getIndexBoolean();
 * String nonIndexString = entity.getNonIndexString();
 * Integer nonIndexInteger = entity.getNonIndexInteger();
 * java.time.LocalDate nonIndexDate = entity.getNonIndexDate();
 * java.time.LocalDateTime nonIndexDatetime = entity.getNonIndexDatetime();
 * Boolean nonIndexBoolean = entity.getNonIndexBoolean();
 * String nullableIndexString = entity.getNullableIndexString();
 * Integer nullableIndexInteger = entity.getNullableIndexInteger();
 * java.time.LocalDate nullableIndexDate = entity.getNullableIndexDate();
 * java.time.LocalDateTime nullableIndexDatetime = entity.getNullableIndexDatetime();
 * Boolean nullableIndexBoolean = entity.getNullableIndexBoolean();
 * Long selfParentId = entity.getSelfParentId();
 * Integer unique1stInteger = entity.getUnique1stInteger();
 * Integer unique2ndInteger = entity.getUnique2ndInteger();
 * Integer unique3rdInteger = entity.getUnique3rdInteger();
 * Integer unique4thInteger = entity.getUnique4thInteger();
 * String uniqueString = entity.getUniqueString();
 * Integer uniqueInteger = entity.getUniqueInteger();
 * Integer zoneMemberId = entity.getZoneMemberId();
 * Long zonePurchaseId = entity.getZonePurchaseId();
 * Integer zoneProductId = entity.getZoneProductId();
 * entity.setGiantId(giantId);
 * entity.setGiantStatusCode(giantStatusCode);
 * entity.setIndexString(indexString);
 * entity.setIndexInteger(indexInteger);
 * entity.setIndexDate(indexDate);
 * entity.setIndexDatetime(indexDatetime);
 * entity.setIndexBoolean(indexBoolean);
 * entity.setNonIndexString(nonIndexString);
 * entity.setNonIndexInteger(nonIndexInteger);
 * entity.setNonIndexDate(nonIndexDate);
 * entity.setNonIndexDatetime(nonIndexDatetime);
 * entity.setNonIndexBoolean(nonIndexBoolean);
 * entity.setNullableIndexString(nullableIndexString);
 * entity.setNullableIndexInteger(nullableIndexInteger);
 * entity.setNullableIndexDate(nullableIndexDate);
 * entity.setNullableIndexDatetime(nullableIndexDatetime);
 * entity.setNullableIndexBoolean(nullableIndexBoolean);
 * entity.setSelfParentId(selfParentId);
 * entity.setUnique1stInteger(unique1stInteger);
 * entity.setUnique2ndInteger(unique2ndInteger);
 * entity.setUnique3rdInteger(unique3rdInteger);
 * entity.setUnique4thInteger(unique4thInteger);
 * entity.setUniqueString(uniqueString);
 * entity.setUniqueInteger(uniqueInteger);
 * entity.setZoneMemberId(zoneMemberId);
 * entity.setZonePurchaseId(zonePurchaseId);
 * entity.setZoneProductId(zoneProductId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsGiant extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** GIANT_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _giantId;

    /** GIANT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to giant_status, classification=GiantStatus} */
    protected String _giantStatusCode;

    /** INDEX_STRING: {IX, NotNull, VARCHAR(64)} */
    protected String _indexString;

    /** INDEX_INTEGER: {IX, NotNull, INT(10)} */
    protected Integer _indexInteger;

    /** INDEX_DATE: {IX, NotNull, DATE(10)} */
    protected java.time.LocalDate _indexDate;

    /** INDEX_DATETIME: {IX, NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _indexDatetime;

    /** INDEX_BOOLEAN: {IX, NotNull, BIT} */
    protected Boolean _indexBoolean;

    /** NON_INDEX_STRING: {NotNull, VARCHAR(64)} */
    protected String _nonIndexString;

    /** NON_INDEX_INTEGER: {NotNull, INT(10)} */
    protected Integer _nonIndexInteger;

    /** NON_INDEX_DATE: {NotNull, DATE(10)} */
    protected java.time.LocalDate _nonIndexDate;

    /** NON_INDEX_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _nonIndexDatetime;

    /** NON_INDEX_BOOLEAN: {NotNull, BIT} */
    protected Boolean _nonIndexBoolean;

    /** NULLABLE_INDEX_STRING: {IX, VARCHAR(64)} */
    protected String _nullableIndexString;

    /** NULLABLE_INDEX_INTEGER: {IX, INT(10)} */
    protected Integer _nullableIndexInteger;

    /** NULLABLE_INDEX_DATE: {IX, DATE(10)} */
    protected java.time.LocalDate _nullableIndexDate;

    /** NULLABLE_INDEX_DATETIME: {IX, DATETIME(19)} */
    protected java.time.LocalDateTime _nullableIndexDatetime;

    /** NULLABLE_INDEX_BOOLEAN: {IX, BIT} */
    protected Boolean _nullableIndexBoolean;

    /** (Self Reference ID)SELF_PARENT_ID: {IX, BIGINT(19), FK to giant} */
    protected Long _selfParentId;

    /** (Compound Unique First)UNIQUE_1ST_INTEGER: {UQ+, NotNull, INT(10)} */
    protected Integer _unique1stInteger;

    /** (Compound Unique Second)UNIQUE_2ND_INTEGER: {+UQ, IX, NotNull, INT(10)} */
    protected Integer _unique2ndInteger;

    /** (Compound Unique Third)UNIQUE_3RD_INTEGER: {+UQ, NotNull, INT(10)} */
    protected Integer _unique3rdInteger;

    /** (Compound Unique Fourth)UNIQUE_4TH_INTEGER: {+UQ, IX, NotNull, INT(10)} */
    protected Integer _unique4thInteger;

    /** UNIQUE_STRING: {UQ, NotNull, VARCHAR(64)} */
    protected String _uniqueString;

    /** UNIQUE_INTEGER: {UQ, NotNull, INT(10)} */
    protected Integer _uniqueInteger;

    /** ZONE_MEMBER_ID: {IX, NotNull, INT(10), FK to member} */
    protected Integer _zoneMemberId;

    /** ZONE_PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase} */
    protected Long _zonePurchaseId;

    /** ZONE_PRODUCT_ID: {IX, NotNull, INT(10), FK to product} */
    protected Integer _zoneProductId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "giant";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_giantId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param unique1stInteger (Compound Unique First): UQ+, NotNull, INT(10). (NotNull)
     * @param unique2ndInteger (Compound Unique Second): +UQ, IX, NotNull, INT(10). (NotNull)
     * @param unique3rdInteger (Compound Unique Third): +UQ, NotNull, INT(10). (NotNull)
     * @param unique4thInteger (Compound Unique Fourth): +UQ, IX, NotNull, INT(10). (NotNull)
     */
    public void uniqueByUnique1stIntegerUnique2ndIntegerUnique3rdIntegerUnique4thInteger(Integer unique1stInteger, Integer unique2ndInteger, Integer unique3rdInteger, Integer unique4thInteger) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("unique1stInteger");
        __uniqueDrivenProperties.addPropertyName("unique2ndInteger");
        __uniqueDrivenProperties.addPropertyName("unique3rdInteger");
        __uniqueDrivenProperties.addPropertyName("unique4thInteger");
        setUnique1stInteger(unique1stInteger);setUnique2ndInteger(unique2ndInteger);setUnique3rdInteger(unique3rdInteger);setUnique4thInteger(unique4thInteger);
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param uniqueInteger : UQ, NotNull, INT(10). (NotNull)
     */
    public void uniqueByUniqueInteger(Integer uniqueInteger) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("uniqueInteger");
        setUniqueInteger(uniqueInteger);
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param uniqueString : UQ, NotNull, VARCHAR(64). (NotNull)
     */
    public void uniqueByUniqueString(String uniqueString) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("uniqueString");
        setUniqueString(uniqueString);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of giantStatusCode as the classification of GiantStatus. <br>
     * GIANT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to giant_status, classification=GiantStatus} <br>
     * status of giant tables
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.GiantStatus getGiantStatusCodeAsGiantStatus() {
        return CDef.GiantStatus.of(getGiantStatusCode()).orElse(null);
    }

    /**
     * Set the value of giantStatusCode as the classification of GiantStatus. <br>
     * GIANT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to giant_status, classification=GiantStatus} <br>
     * status of giant tables
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setGiantStatusCodeAsGiantStatus(CDef.GiantStatus cdef) {
        setGiantStatusCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of giantStatusCode as A1Giant (AAA). <br>
     * A1Giant: marked as A
     */
    public void setGiantStatusCode_A1Giant() {
        setGiantStatusCodeAsGiantStatus(CDef.GiantStatus.A1Giant);
    }

    /**
     * Set the value of giantStatusCode as B2Giant (BBB). <br>
     * B2Giant: marked as B
     */
    public void setGiantStatusCode_B2Giant() {
        setGiantStatusCodeAsGiantStatus(CDef.GiantStatus.B2Giant);
    }

    /**
     * Set the value of giantStatusCode as C3Giant (CCC). <br>
     * C3Giant: marked as C
     */
    public void setGiantStatusCode_C3Giant() {
        setGiantStatusCodeAsGiantStatus(CDef.GiantStatus.C3Giant);
    }

    /**
     * Set the value of giantStatusCode as D4Giant (DDD). <br>
     * D4Giant: marked as D
     */
    public void setGiantStatusCode_D4Giant() {
        setGiantStatusCodeAsGiantStatus(CDef.GiantStatus.D4Giant);
    }

    /**
     * Set the value of giantStatusCode as E5Giant (EEE). <br>
     * E5Giant: marked as E
     */
    public void setGiantStatusCode_E5Giant() {
        setGiantStatusCodeAsGiantStatus(CDef.GiantStatus.E5Giant);
    }

    /**
     * Set the value of giantStatusCode as F6Giant (FFF). <br>
     * F6Giant: marked as F
     */
    public void setGiantStatusCode_F6Giant() {
        setGiantStatusCodeAsGiantStatus(CDef.GiantStatus.F6Giant);
    }

    /**
     * Set the value of giantStatusCode as G7Giant (GGG). <br>
     * G7Giant: marked as G
     */
    public void setGiantStatusCode_G7Giant() {
        setGiantStatusCodeAsGiantStatus(CDef.GiantStatus.G7Giant);
    }

    /**
     * Set the value of giantStatusCode as H8Giant (HHH). <br>
     * H8Giant: marked as H
     */
    public void setGiantStatusCode_H8Giant() {
        setGiantStatusCodeAsGiantStatus(CDef.GiantStatus.H8Giant);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of giantStatusCode A1Giant? <br>
     * A1Giant: marked as A
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isGiantStatusCodeA1Giant() {
        CDef.GiantStatus cdef = getGiantStatusCodeAsGiantStatus();
        return cdef != null ? cdef.equals(CDef.GiantStatus.A1Giant) : false;
    }

    /**
     * Is the value of giantStatusCode B2Giant? <br>
     * B2Giant: marked as B
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isGiantStatusCodeB2Giant() {
        CDef.GiantStatus cdef = getGiantStatusCodeAsGiantStatus();
        return cdef != null ? cdef.equals(CDef.GiantStatus.B2Giant) : false;
    }

    /**
     * Is the value of giantStatusCode C3Giant? <br>
     * C3Giant: marked as C
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isGiantStatusCodeC3Giant() {
        CDef.GiantStatus cdef = getGiantStatusCodeAsGiantStatus();
        return cdef != null ? cdef.equals(CDef.GiantStatus.C3Giant) : false;
    }

    /**
     * Is the value of giantStatusCode D4Giant? <br>
     * D4Giant: marked as D
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isGiantStatusCodeD4Giant() {
        CDef.GiantStatus cdef = getGiantStatusCodeAsGiantStatus();
        return cdef != null ? cdef.equals(CDef.GiantStatus.D4Giant) : false;
    }

    /**
     * Is the value of giantStatusCode E5Giant? <br>
     * E5Giant: marked as E
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isGiantStatusCodeE5Giant() {
        CDef.GiantStatus cdef = getGiantStatusCodeAsGiantStatus();
        return cdef != null ? cdef.equals(CDef.GiantStatus.E5Giant) : false;
    }

    /**
     * Is the value of giantStatusCode F6Giant? <br>
     * F6Giant: marked as F
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isGiantStatusCodeF6Giant() {
        CDef.GiantStatus cdef = getGiantStatusCodeAsGiantStatus();
        return cdef != null ? cdef.equals(CDef.GiantStatus.F6Giant) : false;
    }

    /**
     * Is the value of giantStatusCode G7Giant? <br>
     * G7Giant: marked as G
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isGiantStatusCodeG7Giant() {
        CDef.GiantStatus cdef = getGiantStatusCodeAsGiantStatus();
        return cdef != null ? cdef.equals(CDef.GiantStatus.G7Giant) : false;
    }

    /**
     * Is the value of giantStatusCode H8Giant? <br>
     * H8Giant: marked as H
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isGiantStatusCodeH8Giant() {
        CDef.GiantStatus cdef = getGiantStatusCodeAsGiantStatus();
        return cdef != null ? cdef.equals(CDef.GiantStatus.H8Giant) : false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (Status of Giant)GIANT_STATUS by my GIANT_STATUS_CODE, named 'giantStatus'. */
    protected OptionalEntity<GiantStatus> _giantStatus;

    /**
     * [get] (Status of Giant)GIANT_STATUS by my GIANT_STATUS_CODE, named 'giantStatus'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'giantStatus'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<GiantStatus> getGiantStatus() {
        if (_giantStatus == null) { _giantStatus = OptionalEntity.relationEmpty(this, "giantStatus"); }
        return _giantStatus;
    }

    /**
     * [set] (Status of Giant)GIANT_STATUS by my GIANT_STATUS_CODE, named 'giantStatus'.
     * @param giantStatus The entity of foreign property 'giantStatus'. (NullAllowed)
     */
    public void setGiantStatus(OptionalEntity<GiantStatus> giantStatus) {
        _giantStatus = giantStatus;
    }

    /** (Giant as base point)GIANT by my SELF_PARENT_ID, named 'giantSelf'. */
    protected OptionalEntity<Giant> _giantSelf;

    /**
     * [get] (Giant as base point)GIANT by my SELF_PARENT_ID, named 'giantSelf'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'giantSelf'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Giant> getGiantSelf() {
        if (_giantSelf == null) { _giantSelf = OptionalEntity.relationEmpty(this, "giantSelf"); }
        return _giantSelf;
    }

    /**
     * [set] (Giant as base point)GIANT by my SELF_PARENT_ID, named 'giantSelf'.
     * @param giantSelf The entity of foreign property 'giantSelf'. (NullAllowed)
     */
    public void setGiantSelf(OptionalEntity<Giant> giantSelf) {
        _giantSelf = giantSelf;
    }

    /** (会員)MEMBER by my ZONE_MEMBER_ID, named 'member'. */
    protected OptionalEntity<Member> _member;

    /**
     * [get] (会員)MEMBER by my ZONE_MEMBER_ID, named 'member'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'member'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Member> getMember() {
        if (_member == null) { _member = OptionalEntity.relationEmpty(this, "member"); }
        return _member;
    }

    /**
     * [set] (会員)MEMBER by my ZONE_MEMBER_ID, named 'member'.
     * @param member The entity of foreign property 'member'. (NullAllowed)
     */
    public void setMember(OptionalEntity<Member> member) {
        _member = member;
    }

    /** (商品)PRODUCT by my ZONE_PRODUCT_ID, named 'product'. */
    protected OptionalEntity<Product> _product;

    /**
     * [get] (商品)PRODUCT by my ZONE_PRODUCT_ID, named 'product'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'product'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Product> getProduct() {
        if (_product == null) { _product = OptionalEntity.relationEmpty(this, "product"); }
        return _product;
    }

    /**
     * [set] (商品)PRODUCT by my ZONE_PRODUCT_ID, named 'product'.
     * @param product The entity of foreign property 'product'. (NullAllowed)
     */
    public void setProduct(OptionalEntity<Product> product) {
        _product = product;
    }

    /** (購入)PURCHASE by my ZONE_PURCHASE_ID, named 'purchase'. */
    protected OptionalEntity<Purchase> _purchase;

    /**
     * [get] (購入)PURCHASE by my ZONE_PURCHASE_ID, named 'purchase'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'purchase'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Purchase> getPurchase() {
        if (_purchase == null) { _purchase = OptionalEntity.relationEmpty(this, "purchase"); }
        return _purchase;
    }

    /**
     * [set] (購入)PURCHASE by my ZONE_PURCHASE_ID, named 'purchase'.
     * @param purchase The entity of foreign property 'purchase'. (NullAllowed)
     */
    public void setPurchase(OptionalEntity<Purchase> purchase) {
        _purchase = purchase;
    }

    /** (simple Side of Giant)giant_side by GIANT_ID, named 'giantSideAsOne'. */
    protected OptionalEntity<GiantSide> _giantSideAsOne;

    /**
     * [get] (simple Side of Giant)giant_side by GIANT_ID, named 'giantSideAsOne'.
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return the entity of foreign property(referrer-as-one) 'giantSideAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    public OptionalEntity<GiantSide> getGiantSideAsOne() {
        if (_giantSideAsOne == null) { _giantSideAsOne = OptionalEntity.relationEmpty(this, "giantSideAsOne"); }
        return _giantSideAsOne;
    }

    /**
     * [set] (simple Side of Giant)giant_side by GIANT_ID, named 'giantSideAsOne'.
     * @param giantSideAsOne The entity of foreign property(referrer-as-one) 'giantSideAsOne'. (NullAllowed)
     */
    public void setGiantSideAsOne(OptionalEntity<GiantSide> giantSideAsOne) {
        _giantSideAsOne = giantSideAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (Giant as base point)GIANT by SELF_PARENT_ID, named 'giantSelfList'. */
    protected List<Giant> _giantSelfList;

    /**
     * [get] (Giant as base point)GIANT by SELF_PARENT_ID, named 'giantSelfList'.
     * @return The entity list of referrer property 'giantSelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Giant> getGiantSelfList() {
        if (_giantSelfList == null) { _giantSelfList = newReferrerList(); }
        return _giantSelfList;
    }

    /**
     * [set] (Giant as base point)GIANT by SELF_PARENT_ID, named 'giantSelfList'.
     * @param giantSelfList The entity list of referrer property 'giantSelfList'. (NullAllowed)
     */
    public void setGiantSelfList(List<Giant> giantSelfList) {
        _giantSelfList = giantSelfList;
    }

    /** (Referrer of Giant)GIANT_REF by GIANT_ID, named 'giantRefList'. */
    protected List<GiantRef> _giantRefList;

    /**
     * [get] (Referrer of Giant)GIANT_REF by GIANT_ID, named 'giantRefList'.
     * @return The entity list of referrer property 'giantRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<GiantRef> getGiantRefList() {
        if (_giantRefList == null) { _giantRefList = newReferrerList(); }
        return _giantRefList;
    }

    /**
     * [set] (Referrer of Giant)GIANT_REF by GIANT_ID, named 'giantRefList'.
     * @param giantRefList The entity list of referrer property 'giantRefList'. (NullAllowed)
     */
    public void setGiantRefList(List<GiantRef> giantRefList) {
        _giantRefList = giantRefList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsGiant) {
            BsGiant other = (BsGiant)obj;
            if (!xSV(_giantId, other._giantId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _giantId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_giantStatus != null && _giantStatus.isPresent())
        { sb.append(li).append(xbRDS(_giantStatus, "giantStatus")); }
        if (_giantSelf != null && _giantSelf.isPresent())
        { sb.append(li).append(xbRDS(_giantSelf, "giantSelf")); }
        if (_member != null && _member.isPresent())
        { sb.append(li).append(xbRDS(_member, "member")); }
        if (_product != null && _product.isPresent())
        { sb.append(li).append(xbRDS(_product, "product")); }
        if (_purchase != null && _purchase.isPresent())
        { sb.append(li).append(xbRDS(_purchase, "purchase")); }
        if (_giantSideAsOne != null && _giantSideAsOne.isPresent())
        { sb.append(li).append(xbRDS(_giantSideAsOne, "giantSideAsOne")); }
        if (_giantSelfList != null) { for (Giant et : _giantSelfList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "giantSelfList")); } } }
        if (_giantRefList != null) { for (GiantRef et : _giantRefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "giantRefList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_giantId));
        sb.append(dm).append(xfND(_giantStatusCode));
        sb.append(dm).append(xfND(_indexString));
        sb.append(dm).append(xfND(_indexInteger));
        sb.append(dm).append(xfND(_indexDate));
        sb.append(dm).append(xfND(_indexDatetime));
        sb.append(dm).append(xfND(_indexBoolean));
        sb.append(dm).append(xfND(_nonIndexString));
        sb.append(dm).append(xfND(_nonIndexInteger));
        sb.append(dm).append(xfND(_nonIndexDate));
        sb.append(dm).append(xfND(_nonIndexDatetime));
        sb.append(dm).append(xfND(_nonIndexBoolean));
        sb.append(dm).append(xfND(_nullableIndexString));
        sb.append(dm).append(xfND(_nullableIndexInteger));
        sb.append(dm).append(xfND(_nullableIndexDate));
        sb.append(dm).append(xfND(_nullableIndexDatetime));
        sb.append(dm).append(xfND(_nullableIndexBoolean));
        sb.append(dm).append(xfND(_selfParentId));
        sb.append(dm).append(xfND(_unique1stInteger));
        sb.append(dm).append(xfND(_unique2ndInteger));
        sb.append(dm).append(xfND(_unique3rdInteger));
        sb.append(dm).append(xfND(_unique4thInteger));
        sb.append(dm).append(xfND(_uniqueString));
        sb.append(dm).append(xfND(_uniqueInteger));
        sb.append(dm).append(xfND(_zoneMemberId));
        sb.append(dm).append(xfND(_zonePurchaseId));
        sb.append(dm).append(xfND(_zoneProductId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_giantStatus != null && _giantStatus.isPresent())
        { sb.append(dm).append("giantStatus"); }
        if (_giantSelf != null && _giantSelf.isPresent())
        { sb.append(dm).append("giantSelf"); }
        if (_member != null && _member.isPresent())
        { sb.append(dm).append("member"); }
        if (_product != null && _product.isPresent())
        { sb.append(dm).append("product"); }
        if (_purchase != null && _purchase.isPresent())
        { sb.append(dm).append("purchase"); }
        if (_giantSideAsOne != null && _giantSideAsOne.isPresent())
        { sb.append(dm).append("giantSideAsOne"); }
        if (_giantSelfList != null && !_giantSelfList.isEmpty())
        { sb.append(dm).append("giantSelfList"); }
        if (_giantRefList != null && !_giantRefList.isEmpty())
        { sb.append(dm).append("giantRefList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Giant clone() {
        return (Giant)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] GIANT_ID: {PK, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'GIANT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getGiantId() {
        checkSpecifiedProperty("giantId");
        return _giantId;
    }

    /**
     * [set] GIANT_ID: {PK, NotNull, BIGINT(19)} <br>
     * @param giantId The value of the column 'GIANT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setGiantId(Long giantId) {
        registerModifiedProperty("giantId");
        _giantId = giantId;
    }

    /**
     * [get] GIANT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to giant_status, classification=GiantStatus} <br>
     * @return The value of the column 'GIANT_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getGiantStatusCode() {
        checkSpecifiedProperty("giantStatusCode");
        return convertEmptyToNull(_giantStatusCode);
    }

    /**
     * [set] GIANT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to giant_status, classification=GiantStatus} <br>
     * @param giantStatusCode The value of the column 'GIANT_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setGiantStatusCode(String giantStatusCode) {
        checkClassificationCode("GIANT_STATUS_CODE", CDef.DefMeta.GiantStatus, giantStatusCode);
        registerModifiedProperty("giantStatusCode");
        _giantStatusCode = giantStatusCode;
    }

    /**
     * [get] INDEX_STRING: {IX, NotNull, VARCHAR(64)} <br>
     * @return The value of the column 'INDEX_STRING'. (basically NotNull if selected: for the constraint)
     */
    public String getIndexString() {
        checkSpecifiedProperty("indexString");
        return convertEmptyToNull(_indexString);
    }

    /**
     * [set] INDEX_STRING: {IX, NotNull, VARCHAR(64)} <br>
     * @param indexString The value of the column 'INDEX_STRING'. (basically NotNull if update: for the constraint)
     */
    public void setIndexString(String indexString) {
        registerModifiedProperty("indexString");
        _indexString = indexString;
    }

    /**
     * [get] INDEX_INTEGER: {IX, NotNull, INT(10)} <br>
     * @return The value of the column 'INDEX_INTEGER'. (basically NotNull if selected: for the constraint)
     */
    public Integer getIndexInteger() {
        checkSpecifiedProperty("indexInteger");
        return _indexInteger;
    }

    /**
     * [set] INDEX_INTEGER: {IX, NotNull, INT(10)} <br>
     * @param indexInteger The value of the column 'INDEX_INTEGER'. (basically NotNull if update: for the constraint)
     */
    public void setIndexInteger(Integer indexInteger) {
        registerModifiedProperty("indexInteger");
        _indexInteger = indexInteger;
    }

    /**
     * [get] INDEX_DATE: {IX, NotNull, DATE(10)} <br>
     * @return The value of the column 'INDEX_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getIndexDate() {
        checkSpecifiedProperty("indexDate");
        return _indexDate;
    }

    /**
     * [set] INDEX_DATE: {IX, NotNull, DATE(10)} <br>
     * @param indexDate The value of the column 'INDEX_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setIndexDate(java.time.LocalDate indexDate) {
        registerModifiedProperty("indexDate");
        _indexDate = indexDate;
    }

    /**
     * [get] INDEX_DATETIME: {IX, NotNull, DATETIME(19)} <br>
     * @return The value of the column 'INDEX_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getIndexDatetime() {
        checkSpecifiedProperty("indexDatetime");
        return _indexDatetime;
    }

    /**
     * [set] INDEX_DATETIME: {IX, NotNull, DATETIME(19)} <br>
     * @param indexDatetime The value of the column 'INDEX_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setIndexDatetime(java.time.LocalDateTime indexDatetime) {
        registerModifiedProperty("indexDatetime");
        _indexDatetime = indexDatetime;
    }

    /**
     * [get] INDEX_BOOLEAN: {IX, NotNull, BIT} <br>
     * @return The value of the column 'INDEX_BOOLEAN'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getIndexBoolean() {
        checkSpecifiedProperty("indexBoolean");
        return _indexBoolean;
    }

    /**
     * [set] INDEX_BOOLEAN: {IX, NotNull, BIT} <br>
     * @param indexBoolean The value of the column 'INDEX_BOOLEAN'. (basically NotNull if update: for the constraint)
     */
    public void setIndexBoolean(Boolean indexBoolean) {
        registerModifiedProperty("indexBoolean");
        _indexBoolean = indexBoolean;
    }

    /**
     * [get] NON_INDEX_STRING: {NotNull, VARCHAR(64)} <br>
     * @return The value of the column 'NON_INDEX_STRING'. (basically NotNull if selected: for the constraint)
     */
    public String getNonIndexString() {
        checkSpecifiedProperty("nonIndexString");
        return convertEmptyToNull(_nonIndexString);
    }

    /**
     * [set] NON_INDEX_STRING: {NotNull, VARCHAR(64)} <br>
     * @param nonIndexString The value of the column 'NON_INDEX_STRING'. (basically NotNull if update: for the constraint)
     */
    public void setNonIndexString(String nonIndexString) {
        registerModifiedProperty("nonIndexString");
        _nonIndexString = nonIndexString;
    }

    /**
     * [get] NON_INDEX_INTEGER: {NotNull, INT(10)} <br>
     * @return The value of the column 'NON_INDEX_INTEGER'. (basically NotNull if selected: for the constraint)
     */
    public Integer getNonIndexInteger() {
        checkSpecifiedProperty("nonIndexInteger");
        return _nonIndexInteger;
    }

    /**
     * [set] NON_INDEX_INTEGER: {NotNull, INT(10)} <br>
     * @param nonIndexInteger The value of the column 'NON_INDEX_INTEGER'. (basically NotNull if update: for the constraint)
     */
    public void setNonIndexInteger(Integer nonIndexInteger) {
        registerModifiedProperty("nonIndexInteger");
        _nonIndexInteger = nonIndexInteger;
    }

    /**
     * [get] NON_INDEX_DATE: {NotNull, DATE(10)} <br>
     * @return The value of the column 'NON_INDEX_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getNonIndexDate() {
        checkSpecifiedProperty("nonIndexDate");
        return _nonIndexDate;
    }

    /**
     * [set] NON_INDEX_DATE: {NotNull, DATE(10)} <br>
     * @param nonIndexDate The value of the column 'NON_INDEX_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setNonIndexDate(java.time.LocalDate nonIndexDate) {
        registerModifiedProperty("nonIndexDate");
        _nonIndexDate = nonIndexDate;
    }

    /**
     * [get] NON_INDEX_DATETIME: {NotNull, DATETIME(19)} <br>
     * @return The value of the column 'NON_INDEX_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getNonIndexDatetime() {
        checkSpecifiedProperty("nonIndexDatetime");
        return _nonIndexDatetime;
    }

    /**
     * [set] NON_INDEX_DATETIME: {NotNull, DATETIME(19)} <br>
     * @param nonIndexDatetime The value of the column 'NON_INDEX_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setNonIndexDatetime(java.time.LocalDateTime nonIndexDatetime) {
        registerModifiedProperty("nonIndexDatetime");
        _nonIndexDatetime = nonIndexDatetime;
    }

    /**
     * [get] NON_INDEX_BOOLEAN: {NotNull, BIT} <br>
     * @return The value of the column 'NON_INDEX_BOOLEAN'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getNonIndexBoolean() {
        checkSpecifiedProperty("nonIndexBoolean");
        return _nonIndexBoolean;
    }

    /**
     * [set] NON_INDEX_BOOLEAN: {NotNull, BIT} <br>
     * @param nonIndexBoolean The value of the column 'NON_INDEX_BOOLEAN'. (basically NotNull if update: for the constraint)
     */
    public void setNonIndexBoolean(Boolean nonIndexBoolean) {
        registerModifiedProperty("nonIndexBoolean");
        _nonIndexBoolean = nonIndexBoolean;
    }

    /**
     * [get] NULLABLE_INDEX_STRING: {IX, VARCHAR(64)} <br>
     * @return The value of the column 'NULLABLE_INDEX_STRING'. (NullAllowed even if selected: for no constraint)
     */
    public String getNullableIndexString() {
        checkSpecifiedProperty("nullableIndexString");
        return convertEmptyToNull(_nullableIndexString);
    }

    /**
     * [set] NULLABLE_INDEX_STRING: {IX, VARCHAR(64)} <br>
     * @param nullableIndexString The value of the column 'NULLABLE_INDEX_STRING'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNullableIndexString(String nullableIndexString) {
        registerModifiedProperty("nullableIndexString");
        _nullableIndexString = nullableIndexString;
    }

    /**
     * [get] NULLABLE_INDEX_INTEGER: {IX, INT(10)} <br>
     * @return The value of the column 'NULLABLE_INDEX_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getNullableIndexInteger() {
        checkSpecifiedProperty("nullableIndexInteger");
        return _nullableIndexInteger;
    }

    /**
     * [set] NULLABLE_INDEX_INTEGER: {IX, INT(10)} <br>
     * @param nullableIndexInteger The value of the column 'NULLABLE_INDEX_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNullableIndexInteger(Integer nullableIndexInteger) {
        registerModifiedProperty("nullableIndexInteger");
        _nullableIndexInteger = nullableIndexInteger;
    }

    /**
     * [get] NULLABLE_INDEX_DATE: {IX, DATE(10)} <br>
     * @return The value of the column 'NULLABLE_INDEX_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getNullableIndexDate() {
        checkSpecifiedProperty("nullableIndexDate");
        return _nullableIndexDate;
    }

    /**
     * [set] NULLABLE_INDEX_DATE: {IX, DATE(10)} <br>
     * @param nullableIndexDate The value of the column 'NULLABLE_INDEX_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNullableIndexDate(java.time.LocalDate nullableIndexDate) {
        registerModifiedProperty("nullableIndexDate");
        _nullableIndexDate = nullableIndexDate;
    }

    /**
     * [get] NULLABLE_INDEX_DATETIME: {IX, DATETIME(19)} <br>
     * @return The value of the column 'NULLABLE_INDEX_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getNullableIndexDatetime() {
        checkSpecifiedProperty("nullableIndexDatetime");
        return _nullableIndexDatetime;
    }

    /**
     * [set] NULLABLE_INDEX_DATETIME: {IX, DATETIME(19)} <br>
     * @param nullableIndexDatetime The value of the column 'NULLABLE_INDEX_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNullableIndexDatetime(java.time.LocalDateTime nullableIndexDatetime) {
        registerModifiedProperty("nullableIndexDatetime");
        _nullableIndexDatetime = nullableIndexDatetime;
    }

    /**
     * [get] NULLABLE_INDEX_BOOLEAN: {IX, BIT} <br>
     * @return The value of the column 'NULLABLE_INDEX_BOOLEAN'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getNullableIndexBoolean() {
        checkSpecifiedProperty("nullableIndexBoolean");
        return _nullableIndexBoolean;
    }

    /**
     * [set] NULLABLE_INDEX_BOOLEAN: {IX, BIT} <br>
     * @param nullableIndexBoolean The value of the column 'NULLABLE_INDEX_BOOLEAN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNullableIndexBoolean(Boolean nullableIndexBoolean) {
        registerModifiedProperty("nullableIndexBoolean");
        _nullableIndexBoolean = nullableIndexBoolean;
    }

    /**
     * [get] (Self Reference ID)SELF_PARENT_ID: {IX, BIGINT(19), FK to giant} <br>
     * 20% null, (10% root, 10% independent)
     * @return The value of the column 'SELF_PARENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSelfParentId() {
        checkSpecifiedProperty("selfParentId");
        return _selfParentId;
    }

    /**
     * [set] (Self Reference ID)SELF_PARENT_ID: {IX, BIGINT(19), FK to giant} <br>
     * 20% null, (10% root, 10% independent)
     * @param selfParentId The value of the column 'SELF_PARENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSelfParentId(Long selfParentId) {
        registerModifiedProperty("selfParentId");
        _selfParentId = selfParentId;
    }

    /**
     * [get] (Compound Unique First)UNIQUE_1ST_INTEGER: {UQ+, NotNull, INT(10)} <br>
     * root of compound unique index
     * @return The value of the column 'UNIQUE_1ST_INTEGER'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUnique1stInteger() {
        checkSpecifiedProperty("unique1stInteger");
        return _unique1stInteger;
    }

    /**
     * [set] (Compound Unique First)UNIQUE_1ST_INTEGER: {UQ+, NotNull, INT(10)} <br>
     * root of compound unique index
     * @param unique1stInteger The value of the column 'UNIQUE_1ST_INTEGER'. (basically NotNull if update: for the constraint)
     */
    public void setUnique1stInteger(Integer unique1stInteger) {
        registerModifiedProperty("unique1stInteger");
        _unique1stInteger = unique1stInteger;
    }

    /**
     * [get] (Compound Unique Second)UNIQUE_2ND_INTEGER: {+UQ, IX, NotNull, INT(10)} <br>
     * has single index for itself
     * @return The value of the column 'UNIQUE_2ND_INTEGER'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUnique2ndInteger() {
        checkSpecifiedProperty("unique2ndInteger");
        return _unique2ndInteger;
    }

    /**
     * [set] (Compound Unique Second)UNIQUE_2ND_INTEGER: {+UQ, IX, NotNull, INT(10)} <br>
     * has single index for itself
     * @param unique2ndInteger The value of the column 'UNIQUE_2ND_INTEGER'. (basically NotNull if update: for the constraint)
     */
    public void setUnique2ndInteger(Integer unique2ndInteger) {
        registerModifiedProperty("unique2ndInteger");
        _unique2ndInteger = unique2ndInteger;
    }

    /**
     * [get] (Compound Unique Third)UNIQUE_3RD_INTEGER: {+UQ, NotNull, INT(10)} <br>
     * no single index
     * @return The value of the column 'UNIQUE_3RD_INTEGER'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUnique3rdInteger() {
        checkSpecifiedProperty("unique3rdInteger");
        return _unique3rdInteger;
    }

    /**
     * [set] (Compound Unique Third)UNIQUE_3RD_INTEGER: {+UQ, NotNull, INT(10)} <br>
     * no single index
     * @param unique3rdInteger The value of the column 'UNIQUE_3RD_INTEGER'. (basically NotNull if update: for the constraint)
     */
    public void setUnique3rdInteger(Integer unique3rdInteger) {
        registerModifiedProperty("unique3rdInteger");
        _unique3rdInteger = unique3rdInteger;
    }

    /**
     * [get] (Compound Unique Fourth)UNIQUE_4TH_INTEGER: {+UQ, IX, NotNull, INT(10)} <br>
     * has single index for itself
     * @return The value of the column 'UNIQUE_4TH_INTEGER'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUnique4thInteger() {
        checkSpecifiedProperty("unique4thInteger");
        return _unique4thInteger;
    }

    /**
     * [set] (Compound Unique Fourth)UNIQUE_4TH_INTEGER: {+UQ, IX, NotNull, INT(10)} <br>
     * has single index for itself
     * @param unique4thInteger The value of the column 'UNIQUE_4TH_INTEGER'. (basically NotNull if update: for the constraint)
     */
    public void setUnique4thInteger(Integer unique4thInteger) {
        registerModifiedProperty("unique4thInteger");
        _unique4thInteger = unique4thInteger;
    }

    /**
     * [get] UNIQUE_STRING: {UQ, NotNull, VARCHAR(64)} <br>
     * @return The value of the column 'UNIQUE_STRING'. (basically NotNull if selected: for the constraint)
     */
    public String getUniqueString() {
        checkSpecifiedProperty("uniqueString");
        return convertEmptyToNull(_uniqueString);
    }

    /**
     * [set] UNIQUE_STRING: {UQ, NotNull, VARCHAR(64)} <br>
     * @param uniqueString The value of the column 'UNIQUE_STRING'. (basically NotNull if update: for the constraint)
     */
    public void setUniqueString(String uniqueString) {
        registerModifiedProperty("uniqueString");
        _uniqueString = uniqueString;
    }

    /**
     * [get] UNIQUE_INTEGER: {UQ, NotNull, INT(10)} <br>
     * @return The value of the column 'UNIQUE_INTEGER'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUniqueInteger() {
        checkSpecifiedProperty("uniqueInteger");
        return _uniqueInteger;
    }

    /**
     * [set] UNIQUE_INTEGER: {UQ, NotNull, INT(10)} <br>
     * @param uniqueInteger The value of the column 'UNIQUE_INTEGER'. (basically NotNull if update: for the constraint)
     */
    public void setUniqueInteger(Integer uniqueInteger) {
        registerModifiedProperty("uniqueInteger");
        _uniqueInteger = uniqueInteger;
    }

    /**
     * [get] ZONE_MEMBER_ID: {IX, NotNull, INT(10), FK to member} <br>
     * @return The value of the column 'ZONE_MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getZoneMemberId() {
        checkSpecifiedProperty("zoneMemberId");
        return _zoneMemberId;
    }

    /**
     * [set] ZONE_MEMBER_ID: {IX, NotNull, INT(10), FK to member} <br>
     * @param zoneMemberId The value of the column 'ZONE_MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setZoneMemberId(Integer zoneMemberId) {
        registerModifiedProperty("zoneMemberId");
        _zoneMemberId = zoneMemberId;
    }

    /**
     * [get] ZONE_PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase} <br>
     * @return The value of the column 'ZONE_PURCHASE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getZonePurchaseId() {
        checkSpecifiedProperty("zonePurchaseId");
        return _zonePurchaseId;
    }

    /**
     * [set] ZONE_PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase} <br>
     * @param zonePurchaseId The value of the column 'ZONE_PURCHASE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setZonePurchaseId(Long zonePurchaseId) {
        registerModifiedProperty("zonePurchaseId");
        _zonePurchaseId = zonePurchaseId;
    }

    /**
     * [get] ZONE_PRODUCT_ID: {IX, NotNull, INT(10), FK to product} <br>
     * @return The value of the column 'ZONE_PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getZoneProductId() {
        checkSpecifiedProperty("zoneProductId");
        return _zoneProductId;
    }

    /**
     * [set] ZONE_PRODUCT_ID: {IX, NotNull, INT(10), FK to product} <br>
     * @param zoneProductId The value of the column 'ZONE_PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setZoneProductId(Integer zoneProductId) {
        registerModifiedProperty("zoneProductId");
        _zoneProductId = zoneProductId;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param giantStatusCode The value of the column 'GIANT_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingGiantStatusCode(String giantStatusCode) {
        setGiantStatusCode(giantStatusCode);
    }
}
