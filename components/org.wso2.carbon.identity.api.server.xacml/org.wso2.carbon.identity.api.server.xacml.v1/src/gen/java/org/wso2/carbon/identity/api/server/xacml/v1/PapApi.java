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

package org.wso2.carbon.identity.api.server.xacml.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;
import java.io.InputStream;
import java.util.List;

import org.wso2.carbon.identity.api.server.xacml.v1.model.Error;
import org.wso2.carbon.identity.api.server.xacml.v1.model.InlineResponse200;
import org.wso2.carbon.identity.api.server.xacml.v1.model.PolicyCombiningAlgorithmModel;
import org.wso2.carbon.identity.api.server.xacml.v1.model.PolicyDataModel;
import org.wso2.carbon.identity.api.server.xacml.v1.PapApiService;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import io.swagger.annotations.*;

import javax.validation.constraints.*;

@Path("/pap")
@Api(description = "The pap API")

public class PapApi  {

    @Autowired
    private PapApiService delegate;

    @Valid
    @GET
    @Path("/policies")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List All Policies ", notes = "This API provides the capability to retrieve the list of Policies available.<br>   <b>Permission required:</b> <br>       * /permission/admin/manage/identity/entitlementmgt/view <br>   <b>Scope required:</b> <br>       * internal_entitlement_mgt_view ", response = InlineResponse200.class, authorizations = {
        @Authorization(value = "basicAuth"),
        @Authorization(value = "oauth2", scopes = {
            
        })
    }, tags={ "Policy Administration Point", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of policies", response = InlineResponse200.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 500, message = "Server Error", response = Error.class)
    })
    public Response getAllPolicies(    @Valid @NotNull(message = "Property  cannot be null.") @ApiParam(value = "Whether PDP Policy or PAP Policy ",required=true, defaultValue="true") @DefaultValue("true")  @QueryParam("is PDP Policy") Boolean isPDPPolicy,     @Valid@ApiParam(value = "Policy Type filter ", allowableValues="ALL, PDP_ENABLED, PDP_DISABLED")  @QueryParam("policy type") String policyType,     @Valid@ApiParam(value = "Policy search string filter ")  @QueryParam("policy search string") String policySearchString,     @Valid @Min(1)@ApiParam(value = "Page Number filter ", defaultValue="1") @DefaultValue("1")  @QueryParam("page number") Integer pageNumber) {

        return delegate.getAllPolicies(isPDPPolicy,  policyType,  policySearchString,  pageNumber );
    }

    @Valid
    @GET
    @Path("/combining-algorithm")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get gloabl policy combining algorithm", notes = "This API provides the capability to get the gloabl policy combining algorithm.<br>   <b>Permission required:</b> <br>       * /permission/admin/manage/identity/policycombiningalgorithm/view <br>   <b>Scope required:</b> <br>       * internal_entitlement_mgt_policy_comb ", response = PolicyCombiningAlgorithmModel.class, authorizations = {
        @Authorization(value = "basicAuth"),
        @Authorization(value = "oauth2", scopes = {
            
        })
    }, tags={ "Policy Combining Algorithms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Policy combining algorithm is set.", response = PolicyCombiningAlgorithmModel.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 500, message = "Server Error", response = Error.class)
    })
    public Response papCombiningAlgorithmGet() {

        return delegate.papCombiningAlgorithmGet();
    }

    @Valid
    @PATCH
    @Path("/combining-algorithm")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Set policy combining algorithm", notes = "This API provides the capability to set the policy combining algorithm.<br>   <b>Permission required:</b> <br>       * /permission/admin/manage/identity/policycombiningalgorithm/update <br>   <b>Scope required:</b> <br>       * internal_entitlement_mgt_policy_comb ", response = Void.class, authorizations = {
        @Authorization(value = "basicAuth"),
        @Authorization(value = "oauth2", scopes = {
            
        })
    }, tags={ "Policy Combining Algorithms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Policy combining algorithm is set.", response = Void.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 500, message = "Server Error", response = Error.class)
    })
    public Response papCombiningAlgorithmPatch(@ApiParam(value = "" ) @Valid PolicyCombiningAlgorithmModel policyCombiningAlgorithmModel) {

        return delegate.papCombiningAlgorithmPatch(policyCombiningAlgorithmModel );
    }

    @Valid
    @DELETE
    @Path("/policies/{id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete policy", notes = "This API provides the capability to delete a Policy.<br>   <b>Permission required:</b> <br>       * /permission/admin/manage/identity/entitlementmgt/delete <br>   <b>Scope required:</b> <br>       * internal_entitlement_mgt_delete ", response = Void.class, authorizations = {
        @Authorization(value = "basicAuth"),
        @Authorization(value = "oauth2", scopes = {
            
        })
    }, tags={ "Policy Administration Point", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Policy deleted", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 500, message = "Server Error", response = Error.class)
    })
    public Response papPoliciesIdDelete(@ApiParam(value = "",required=true) @PathParam("id") String id) {

        return delegate.papPoliciesIdDelete(id );
    }

    @Valid
    @GET
    @Path("/policies/{id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get policy by id", notes = "This API provides the capability to Get a Policy.<br>   <b>Permission required:</b> <br>       * /permission/admin/manage/identity/entitlementmgt/view <br>   <b>Scope required:</b> <br>       * internal_entitlement_mgt_view ", response = PolicyDataModel.class, authorizations = {
        @Authorization(value = "basicAuth"),
        @Authorization(value = "oauth2", scopes = {
            
        })
    }, tags={ "Policy Administration Point", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A policy object", response = PolicyDataModel.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 500, message = "Server Error", response = Error.class)
    })
    public Response papPoliciesIdGet(@ApiParam(value = "",required=true) @PathParam("id") String id,     @Valid@ApiParam(value = "")  @QueryParam("version") String version) {

        return delegate.papPoliciesIdGet(id,  version );
    }

    @Valid
    @PATCH
    @Path("/policies/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update policy", notes = "This API provides the capability to Update a Policy.<br>   <b>Permission required:</b> <br>       * /permission/admin/manage/identity/entitlementmgt/update <br>   <b>Scope required:</b> <br>       * internal_entitlement_mgt_update ", response = Void.class, authorizations = {
        @Authorization(value = "basicAuth"),
        @Authorization(value = "oauth2", scopes = {
            
        })
    }, tags={ "Policy Administration Point", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Policy updated.", response = Void.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 500, message = "Server Error", response = Error.class)
    })
    public Response papPoliciesIdPatch(@ApiParam(value = "",required=true) @PathParam("id") String id, @ApiParam(value = "" ) @Valid PolicyDataModel policyDataModel) {

        return delegate.papPoliciesIdPatch(id,  policyDataModel );
    }

    @Valid
    @POST
    @Path("/policies")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create policy", notes = "This API provides the capability to create Policies.<br>   <b>Permission required:</b> <br>       * /permission/admin/manage/identity/entitlementmgt/create <br>   <b>Scope required:</b> <br>       * internal_entitlement_mgt_create ", response = Void.class, authorizations = {
        @Authorization(value = "basicAuth"),
        @Authorization(value = "oauth2", scopes = {
            
        })
    }, tags={ "Policy Administration Point" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Policy created", response = Void.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 500, message = "Server Error", response = Error.class)
    })
    public Response papPoliciesPost(@ApiParam(value = "" ) @Valid PolicyDataModel policyDataModel) {

        return delegate.papPoliciesPost(policyDataModel );
    }

}
