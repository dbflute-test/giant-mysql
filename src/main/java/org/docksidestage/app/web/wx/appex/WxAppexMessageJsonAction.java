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
package org.docksidestage.app.web.wx.appex;

import java.util.stream.Stream;

import javax.annotation.Resource;

import org.docksidestage.app.web.base.GiantBaseAction;
import org.docksidestage.mylasta.action.GiantMessages;
import org.lastaflute.core.exception.LaApplicationMessage;
import org.lastaflute.core.json.JsonManager;
import org.lastaflute.core.message.UserMessage;
import org.lastaflute.core.message.exception.MessagingApplicationException;
import org.lastaflute.web.Execute;
import org.lastaflute.web.login.AllowAnyoneAccess;
import org.lastaflute.web.response.JsonResponse;
import org.lastaflute.web.ruts.process.ActionRuntime;

/**
 * @author jflute
 */
@AllowAnyoneAccess
public class WxAppexMessageJsonAction extends GiantBaseAction {

    @Resource
    private JsonManager jsonManager;

    @Override
    protected Object[] filterApplicationExceptionMessageValues(ActionRuntime runtime, LaApplicationMessage msg) {
        return Stream.of(msg.getValues()).map(vl -> jsonManager.toJson(vl)).toArray();
    }

    // http://localhost:8151/giant/wx/appex/message/json/
    @Execute
    public JsonResponse<String> index() {
        throw new MessagingApplicationException("none",
                createMessages().addWhiteboxMessageValuesIndexed(GLOBAL, "mystic", "onaman", "angel"));
    }

    // http://localhost:8151/giant/wx/appex/message/json/direct/
    @Execute
    public JsonResponse<String> direct() {
        GiantMessages messages = createMessages();
        messages.add(GLOBAL, new UserMessage(GiantMessages.WHITEBOX_MESSAGE_VALUES_INDEXED, "mystic", 3));
        throw new MessagingApplicationException("none", messages);
    }

    // http://localhost:8151/giant/wx/appex/message/json/novalues/
    @Execute
    public JsonResponse<String> novalues() {
        throw new MessagingApplicationException("none", createMessages().addErrorsAppDbAlreadyDeleted(GLOBAL));
    }
}
