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
package org.docksidestage.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.dbflute.cbean.*;
import org.docksidestage.dbflute.cbean.cq.bs.*;
import org.docksidestage.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of giant.
 * @author DBFlute(AutoGenerator)
 */
public class GiantCIQ extends AbstractBsGiantCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsGiantCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public GiantCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsGiantCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueGiantId() { return _myCQ.xdfgetGiantId(); }
    public String keepGiantId_ExistsReferrer_GiantSelfList(GiantCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepGiantId_ExistsReferrer_GiantRefList(GiantRefCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepGiantId_NotExistsReferrer_GiantSelfList(GiantCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepGiantId_NotExistsReferrer_GiantRefList(GiantRefCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepGiantId_SpecifyDerivedReferrer_GiantSelfList(GiantCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepGiantId_SpecifyDerivedReferrer_GiantRefList(GiantRefCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepGiantId_QueryDerivedReferrer_GiantSelfList(GiantCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGiantId_QueryDerivedReferrer_GiantSelfListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGiantId_QueryDerivedReferrer_GiantRefList(GiantRefCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGiantId_QueryDerivedReferrer_GiantRefListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueGiantStatusCode() { return _myCQ.xdfgetGiantStatusCode(); }
    protected ConditionValue xgetCValueIndexString() { return _myCQ.xdfgetIndexString(); }
    protected ConditionValue xgetCValueIndexInteger() { return _myCQ.xdfgetIndexInteger(); }
    protected ConditionValue xgetCValueIndexDate() { return _myCQ.xdfgetIndexDate(); }
    protected ConditionValue xgetCValueIndexDatetime() { return _myCQ.xdfgetIndexDatetime(); }
    protected ConditionValue xgetCValueIndexBoolean() { return _myCQ.xdfgetIndexBoolean(); }
    protected ConditionValue xgetCValueNonIndexString() { return _myCQ.xdfgetNonIndexString(); }
    protected ConditionValue xgetCValueNonIndexInteger() { return _myCQ.xdfgetNonIndexInteger(); }
    protected ConditionValue xgetCValueNonIndexDate() { return _myCQ.xdfgetNonIndexDate(); }
    protected ConditionValue xgetCValueNonIndexDatetime() { return _myCQ.xdfgetNonIndexDatetime(); }
    protected ConditionValue xgetCValueNonIndexBoolean() { return _myCQ.xdfgetNonIndexBoolean(); }
    protected ConditionValue xgetCValueNullableIndexString() { return _myCQ.xdfgetNullableIndexString(); }
    protected ConditionValue xgetCValueNullableIndexInteger() { return _myCQ.xdfgetNullableIndexInteger(); }
    protected ConditionValue xgetCValueNullableIndexDate() { return _myCQ.xdfgetNullableIndexDate(); }
    protected ConditionValue xgetCValueNullableIndexDatetime() { return _myCQ.xdfgetNullableIndexDatetime(); }
    protected ConditionValue xgetCValueNullableIndexBoolean() { return _myCQ.xdfgetNullableIndexBoolean(); }
    protected ConditionValue xgetCValueSelfParentId() { return _myCQ.xdfgetSelfParentId(); }
    protected ConditionValue xgetCValueUnique1stInteger() { return _myCQ.xdfgetUnique1stInteger(); }
    protected ConditionValue xgetCValueUnique2ndInteger() { return _myCQ.xdfgetUnique2ndInteger(); }
    protected ConditionValue xgetCValueUnique3rdInteger() { return _myCQ.xdfgetUnique3rdInteger(); }
    protected ConditionValue xgetCValueUnique4thInteger() { return _myCQ.xdfgetUnique4thInteger(); }
    protected ConditionValue xgetCValueUniqueString() { return _myCQ.xdfgetUniqueString(); }
    protected ConditionValue xgetCValueUniqueInteger() { return _myCQ.xdfgetUniqueInteger(); }
    protected ConditionValue xgetCValueZoneMemberId() { return _myCQ.xdfgetZoneMemberId(); }
    protected ConditionValue xgetCValueZonePurchaseId() { return _myCQ.xdfgetZonePurchaseId(); }
    protected ConditionValue xgetCValueZoneProductId() { return _myCQ.xdfgetZoneProductId(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(GiantCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(GiantCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(GiantCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(GiantCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return GiantCB.class.getName(); }
    protected String xinCQ() { return GiantCQ.class.getName(); }
}
