/*
 * Copyright 2015-2019 the original author or authors.
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
package org.docksidestage.app.web.job;

import javax.annotation.Resource;

import org.docksidestage.app.web.base.GiantBaseAction;
import org.lastaflute.job.JobManager;
import org.lastaflute.job.LaScheduledJob;
import org.lastaflute.job.key.LaJobUnique;
import org.lastaflute.web.Execute;
import org.lastaflute.web.response.JsonResponse;
import org.lastaflute.web.servlet.request.ResponseManager;

/**
 * @author jflute
 */
public class JobStopAction extends GiantBaseAction {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private JobManager jobManager;
    @Resource
    private ResponseManager responseManager;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Execute
    public JsonResponse<Void> index(String jobCode) {
        LaScheduledJob job = findJob(jobCode);
        job.stopNow(); // request only, no waiting for ending (see info logging about stopped)
        return JsonResponse.asEmptyBody();
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    private LaScheduledJob findJob(String jobCode) {
        return jobManager.findJobByUniqueOf(LaJobUnique.of(jobCode)).orElseTranslatingThrow(cause -> {
            return responseManager.new400("Not found the job: " + jobCode, op -> op.cause(cause));
        });
    }
}
