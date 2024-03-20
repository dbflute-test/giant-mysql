package org.docksidestage.app.web.wx.routing.restful;

import org.docksidestage.app.web.base.GiantBaseAction;
import org.lastaflute.web.Execute;
import org.lastaflute.web.login.AllowAnyoneAccess;
import org.lastaflute.web.response.JsonResponse;

/**
 * @author jflute
 */
@AllowAnyoneAccess
public class WxRoutingRestfulAction extends GiantBaseAction {

    // see ProductsAction for RESTful action test
    @Execute
    public JsonResponse<Void> get$dummy() {
        return JsonResponse.asEmptyBody();
    }
}
