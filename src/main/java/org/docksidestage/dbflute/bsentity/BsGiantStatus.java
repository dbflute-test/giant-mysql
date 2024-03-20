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

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.dbflute.allcommon.CDef;
import org.docksidestage.dbflute.exentity.*;

/**
 * The entity of (Status of Giant)GIANT_STATUS as TABLE. <br>
 * simple classification
 * <pre>
 * [primary-key]
 *     GIANT_STATUS_CODE
 *
 * [column]
 *     GIANT_STATUS_CODE, GIANT_STATUS_NAME, DISPLAY_ORDER, DESCRIPTION
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
 *     
 *
 * [referrer table]
 *     GIANT, GIANT_REF, GIANT_SIDE
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     giantList, giantRefList, giantSideList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String giantStatusCode = entity.getGiantStatusCode();
 * String giantStatusName = entity.getGiantStatusName();
 * Integer displayOrder = entity.getDisplayOrder();
 * String description = entity.getDescription();
 * entity.setGiantStatusCode(giantStatusCode);
 * entity.setGiantStatusName(giantStatusName);
 * entity.setDisplayOrder(displayOrder);
 * entity.setDescription(description);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsGiantStatus extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** GIANT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=GiantStatus} */
    protected String _giantStatusCode;

    /** GIANT_STATUS_NAME: {NotNull, VARCHAR(64)} */
    protected String _giantStatusName;

    /** DISPLAY_ORDER: {NotNull, INT(10)} */
    protected Integer _displayOrder;

    /** DESCRIPTION: {NotNull, VARCHAR(128)} */
    protected String _description;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "giant_status";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_giantStatusCode == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of giantStatusCode as the classification of GiantStatus. <br>
     * GIANT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=GiantStatus} <br>
     * status of giant tables
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.GiantStatus getGiantStatusCodeAsGiantStatus() {
        return CDef.GiantStatus.of(getGiantStatusCode()).orElse(null);
    }

    /**
     * Set the value of giantStatusCode as the classification of GiantStatus. <br>
     * GIANT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=GiantStatus} <br>
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
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (Giant as base point)GIANT by GIANT_STATUS_CODE, named 'giantList'. */
    protected List<Giant> _giantList;

    /**
     * [get] (Giant as base point)GIANT by GIANT_STATUS_CODE, named 'giantList'.
     * @return The entity list of referrer property 'giantList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Giant> getGiantList() {
        if (_giantList == null) { _giantList = newReferrerList(); }
        return _giantList;
    }

    /**
     * [set] (Giant as base point)GIANT by GIANT_STATUS_CODE, named 'giantList'.
     * @param giantList The entity list of referrer property 'giantList'. (NullAllowed)
     */
    public void setGiantList(List<Giant> giantList) {
        _giantList = giantList;
    }

    /** (Referrer of Giant)GIANT_REF by GIANT_STATUS_CODE, named 'giantRefList'. */
    protected List<GiantRef> _giantRefList;

    /**
     * [get] (Referrer of Giant)GIANT_REF by GIANT_STATUS_CODE, named 'giantRefList'.
     * @return The entity list of referrer property 'giantRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<GiantRef> getGiantRefList() {
        if (_giantRefList == null) { _giantRefList = newReferrerList(); }
        return _giantRefList;
    }

    /**
     * [set] (Referrer of Giant)GIANT_REF by GIANT_STATUS_CODE, named 'giantRefList'.
     * @param giantRefList The entity list of referrer property 'giantRefList'. (NullAllowed)
     */
    public void setGiantRefList(List<GiantRef> giantRefList) {
        _giantRefList = giantRefList;
    }

    /** (simple Side of Giant)GIANT_SIDE by GIANT_STATUS_CODE, named 'giantSideList'. */
    protected List<GiantSide> _giantSideList;

    /**
     * [get] (simple Side of Giant)GIANT_SIDE by GIANT_STATUS_CODE, named 'giantSideList'.
     * @return The entity list of referrer property 'giantSideList'. (NotNull: even if no loading, returns empty list)
     */
    public List<GiantSide> getGiantSideList() {
        if (_giantSideList == null) { _giantSideList = newReferrerList(); }
        return _giantSideList;
    }

    /**
     * [set] (simple Side of Giant)GIANT_SIDE by GIANT_STATUS_CODE, named 'giantSideList'.
     * @param giantSideList The entity list of referrer property 'giantSideList'. (NullAllowed)
     */
    public void setGiantSideList(List<GiantSide> giantSideList) {
        _giantSideList = giantSideList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsGiantStatus) {
            BsGiantStatus other = (BsGiantStatus)obj;
            if (!xSV(_giantStatusCode, other._giantStatusCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _giantStatusCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_giantList != null) { for (Giant et : _giantList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "giantList")); } } }
        if (_giantRefList != null) { for (GiantRef et : _giantRefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "giantRefList")); } } }
        if (_giantSideList != null) { for (GiantSide et : _giantSideList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "giantSideList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_giantStatusCode));
        sb.append(dm).append(xfND(_giantStatusName));
        sb.append(dm).append(xfND(_displayOrder));
        sb.append(dm).append(xfND(_description));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_giantList != null && !_giantList.isEmpty())
        { sb.append(dm).append("giantList"); }
        if (_giantRefList != null && !_giantRefList.isEmpty())
        { sb.append(dm).append("giantRefList"); }
        if (_giantSideList != null && !_giantSideList.isEmpty())
        { sb.append(dm).append("giantSideList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public GiantStatus clone() {
        return (GiantStatus)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] GIANT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=GiantStatus} <br>
     * @return The value of the column 'GIANT_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getGiantStatusCode() {
        checkSpecifiedProperty("giantStatusCode");
        return convertEmptyToNull(_giantStatusCode);
    }

    /**
     * [set] GIANT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=GiantStatus} <br>
     * @param giantStatusCode The value of the column 'GIANT_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setGiantStatusCode(String giantStatusCode) {
        checkClassificationCode("GIANT_STATUS_CODE", CDef.DefMeta.GiantStatus, giantStatusCode);
        registerModifiedProperty("giantStatusCode");
        _giantStatusCode = giantStatusCode;
    }

    /**
     * [get] GIANT_STATUS_NAME: {NotNull, VARCHAR(64)} <br>
     * @return The value of the column 'GIANT_STATUS_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getGiantStatusName() {
        checkSpecifiedProperty("giantStatusName");
        return convertEmptyToNull(_giantStatusName);
    }

    /**
     * [set] GIANT_STATUS_NAME: {NotNull, VARCHAR(64)} <br>
     * @param giantStatusName The value of the column 'GIANT_STATUS_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setGiantStatusName(String giantStatusName) {
        registerModifiedProperty("giantStatusName");
        _giantStatusName = giantStatusName;
    }

    /**
     * [get] DISPLAY_ORDER: {NotNull, INT(10)} <br>
     * @return The value of the column 'DISPLAY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDisplayOrder() {
        checkSpecifiedProperty("displayOrder");
        return _displayOrder;
    }

    /**
     * [set] DISPLAY_ORDER: {NotNull, INT(10)} <br>
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (basically NotNull if update: for the constraint)
     */
    public void setDisplayOrder(Integer displayOrder) {
        registerModifiedProperty("displayOrder");
        _displayOrder = displayOrder;
    }

    /**
     * [get] DESCRIPTION: {NotNull, VARCHAR(128)} <br>
     * @return The value of the column 'DESCRIPTION'. (basically NotNull if selected: for the constraint)
     */
    public String getDescription() {
        checkSpecifiedProperty("description");
        return convertEmptyToNull(_description);
    }

    /**
     * [set] DESCRIPTION: {NotNull, VARCHAR(128)} <br>
     * @param description The value of the column 'DESCRIPTION'. (basically NotNull if update: for the constraint)
     */
    public void setDescription(String description) {
        registerModifiedProperty("description");
        _description = description;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param giantStatusCode The value of the column 'GIANT_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingGiantStatusCode(String giantStatusCode) {
        setGiantStatusCode(giantStatusCode);
    }
}
