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
 * The condition-query for in-line of giant_status.
 * @author DBFlute(AutoGenerator)
 */
public class GiantStatusCIQ extends AbstractBsGiantStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsGiantStatusCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public GiantStatusCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsGiantStatusCQ myCQ) {
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
    protected ConditionValue xgetCValueGiantStatusCode() { return _myCQ.xdfgetGiantStatusCode(); }
    public String keepGiantStatusCode_ExistsReferrer_GiantList(GiantCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepGiantStatusCode_ExistsReferrer_GiantRefList(GiantRefCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepGiantStatusCode_ExistsReferrer_GiantSideList(GiantSideCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepGiantStatusCode_NotExistsReferrer_GiantList(GiantCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepGiantStatusCode_NotExistsReferrer_GiantRefList(GiantRefCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepGiantStatusCode_NotExistsReferrer_GiantSideList(GiantSideCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepGiantStatusCode_SpecifyDerivedReferrer_GiantList(GiantCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepGiantStatusCode_SpecifyDerivedReferrer_GiantRefList(GiantRefCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepGiantStatusCode_SpecifyDerivedReferrer_GiantSideList(GiantSideCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepGiantStatusCode_QueryDerivedReferrer_GiantList(GiantCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGiantStatusCode_QueryDerivedReferrer_GiantListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGiantStatusCode_QueryDerivedReferrer_GiantRefList(GiantRefCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGiantStatusCode_QueryDerivedReferrer_GiantRefListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGiantStatusCode_QueryDerivedReferrer_GiantSideList(GiantSideCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGiantStatusCode_QueryDerivedReferrer_GiantSideListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueGiantStatusName() { return _myCQ.xdfgetGiantStatusName(); }
    protected ConditionValue xgetCValueDisplayOrder() { return _myCQ.xdfgetDisplayOrder(); }
    protected ConditionValue xgetCValueDescription() { return _myCQ.xdfgetDescription(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(GiantStatusCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(GiantStatusCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(GiantStatusCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(GiantStatusCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return GiantStatusCB.class.getName(); }
    protected String xinCQ() { return GiantStatusCQ.class.getName(); }
}
