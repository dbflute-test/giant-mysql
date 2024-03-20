package org.docksidestage.giant.view;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.dbflute.exbhv.GiantBhv;
import org.docksidestage.dbflute.exbhv.MemberBhv;
import org.docksidestage.dbflute.exentity.Giant;
import org.docksidestage.dbflute.exentity.GiantRef;
import org.docksidestage.dbflute.exentity.GiantSide;
import org.docksidestage.dbflute.exentity.Member;
import org.docksidestage.unit.UnitGiantBasicTestCase;

/**
 * @author jflute
 */
public class GiantViewTest extends UnitGiantBasicTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private GiantBhv giantBhv;
    @Resource
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                               Giant
    //                                                                               =====
    public void test_giant_relationship() throws Exception {
        ListResultBean<Giant> giantList = giantBhv.selectList(cb -> {
            cb.setupSelect_GiantSideAsOne();
            cb.specify().derivedGiantRef().count(refCB -> {
                refCB.specify().columnGiantRefId();
            }, Giant.ALIAS_refCountAll);
            cb.specify().derivedGiantSelf().count(selfCB -> {
                selfCB.specify().columnGiantId();
            }, Giant.ALIAS_selfCountAll);
            cb.query().setGiantId_LessEqual(100L);
        });
        giantBhv.load(giantList, giantLoader -> {
            giantLoader.loadGiantRef(refCB -> {});
        });
        assertHasAnyElement(giantList);
        for (Giant giant : giantList) {
            Long giantId = giant.getGiantId();

            Integer refCountAll = giant.getRefCountAll();
            List<GiantRef> giantRefList = giant.getGiantRefList();
            List<Long> refIdList = giantRefList.stream().map(ref -> ref.getGiantRefId()).collect(Collectors.toList());

            Integer selfCountAll = giant.getSelfCountAll();

            GiantSide side = giant.getGiantSideAsOne().get();
            String sideString = side.getIndexString();

            log("{}, ref={}:{}, side={}, self={}", giantId, refCountAll, refIdList, sideString, selfCountAll);
        }
    }

    // ===================================================================================
    //                                                                             Maihama
    //                                                                             =======
    public void test_member_relationship() throws Exception {
        ListResultBean<Member> memberList = memberBhv.selectList(cb -> {
            cb.specify().derivedGiant().count(giantCB -> {
                giantCB.specify().columnGiantId();
            }, Member.ALIAS_giantCountAll);
        });
        for (Member member : memberList) {
            log(member.getMemberId(), "giant=" + member.getGiantCountAll());
        }
    }
}
