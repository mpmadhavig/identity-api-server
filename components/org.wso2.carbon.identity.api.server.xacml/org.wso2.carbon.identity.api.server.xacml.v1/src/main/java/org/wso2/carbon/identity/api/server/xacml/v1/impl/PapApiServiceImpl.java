/*
 * Copyright (c) 2024, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.api.server.xacml.v1.impl;

import org.wso2.carbon.identity.api.server.xacml.v1.*;
import org.wso2.carbon.identity.api.server.xacml.v1.model.*;
import java.util.List;

import javax.ws.rs.core.Response;

public class PapApiServiceImpl implements PapApiService {

    @Override
    public Response getAllPolicies(Boolean isPDPPolicy, String policyType, String policySearchString, Integer pageNumber) {

        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response papCombiningAlgorithmGet() {

        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response papCombiningAlgorithmPatch(PolicyCombiningAlgorithmModel policyCombiningAlgorithmModel) {

        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response papPoliciesIdDelete(String id) {

        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response papPoliciesIdGet(String id, String version) {

        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response papPoliciesIdPatch(String id, PolicyDataModel policyDataModel) {

        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response papPoliciesPost(PolicyDataModel policyDataModel) {

        // do some magic!
        return Response.ok().entity("magic!").build();
    }
}
