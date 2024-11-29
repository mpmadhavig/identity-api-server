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

package org.wso2.carbon.identity.api.server.xacml.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.identity.api.server.xacml.v1.model.AttributeDTOs;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class Policy  {
  
    private String policy;
    private String policyId;
    private Boolean active;
    private Boolean promote;
    private String policyType;
    private String policyEditor;
    private List<String> policyEditorData = null;

    private Integer policyOrder;
    private String version;
    private String lastModifiedTime;
    private String lastModifiedUser;
    private List<AttributeDTOs> attributeDTOs = null;

    private List<String> policySetIdReferences = null;

    private List<String> policyIdReferences = null;


    /**
    **/
    public Policy policy(String policy) {

        this.policy = policy;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("policy")
    @Valid
    public String getPolicy() {
        return policy;
    }
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
    **/
    public Policy policyId(String policyId) {

        this.policyId = policyId;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("policyId")
    @Valid
    public String getPolicyId() {
        return policyId;
    }
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
    **/
    public Policy active(Boolean active) {

        this.active = active;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("active")
    @Valid
    public Boolean getActive() {
        return active;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
    **/
    public Policy promote(Boolean promote) {

        this.promote = promote;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("promote")
    @Valid
    public Boolean getPromote() {
        return promote;
    }
    public void setPromote(Boolean promote) {
        this.promote = promote;
    }

    /**
    **/
    public Policy policyType(String policyType) {

        this.policyType = policyType;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("policyType")
    @Valid
    public String getPolicyType() {
        return policyType;
    }
    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
    **/
    public Policy policyEditor(String policyEditor) {

        this.policyEditor = policyEditor;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("policyEditor")
    @Valid
    public String getPolicyEditor() {
        return policyEditor;
    }
    public void setPolicyEditor(String policyEditor) {
        this.policyEditor = policyEditor;
    }

    /**
    **/
    public Policy policyEditorData(List<String> policyEditorData) {

        this.policyEditorData = policyEditorData;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("policyEditorData")
    @Valid
    public List<String> getPolicyEditorData() {
        return policyEditorData;
    }
    public void setPolicyEditorData(List<String> policyEditorData) {
        this.policyEditorData = policyEditorData;
    }

    public Policy addPolicyEditorDataItem(String policyEditorDataItem) {
        if (this.policyEditorData == null) {
            this.policyEditorData = new ArrayList<>();
        }
        this.policyEditorData.add(policyEditorDataItem);
        return this;
    }

        /**
    **/
    public Policy policyOrder(Integer policyOrder) {

        this.policyOrder = policyOrder;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("policyOrder")
    @Valid
    public Integer getPolicyOrder() {
        return policyOrder;
    }
    public void setPolicyOrder(Integer policyOrder) {
        this.policyOrder = policyOrder;
    }

    /**
    **/
    public Policy version(String version) {

        this.version = version;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("version")
    @Valid
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

    /**
    **/
    public Policy lastModifiedTime(String lastModifiedTime) {

        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("lastModifiedTime")
    @Valid
    public String getLastModifiedTime() {
        return lastModifiedTime;
    }
    public void setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
    **/
    public Policy lastModifiedUser(String lastModifiedUser) {

        this.lastModifiedUser = lastModifiedUser;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("lastModifiedUser")
    @Valid
    public String getLastModifiedUser() {
        return lastModifiedUser;
    }
    public void setLastModifiedUser(String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
    }

    /**
    **/
    public Policy attributeDTOs(List<AttributeDTOs> attributeDTOs) {

        this.attributeDTOs = attributeDTOs;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("attributeDTOs")
    @Valid
    public List<AttributeDTOs> getAttributeDTOs() {
        return attributeDTOs;
    }
    public void setAttributeDTOs(List<AttributeDTOs> attributeDTOs) {
        this.attributeDTOs = attributeDTOs;
    }

    public Policy addAttributeDTOsItem(AttributeDTOs attributeDTOsItem) {
        if (this.attributeDTOs == null) {
            this.attributeDTOs = new ArrayList<>();
        }
        this.attributeDTOs.add(attributeDTOsItem);
        return this;
    }

        /**
    **/
    public Policy policySetIdReferences(List<String> policySetIdReferences) {

        this.policySetIdReferences = policySetIdReferences;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("policySetIdReferences")
    @Valid
    public List<String> getPolicySetIdReferences() {
        return policySetIdReferences;
    }
    public void setPolicySetIdReferences(List<String> policySetIdReferences) {
        this.policySetIdReferences = policySetIdReferences;
    }

    public Policy addPolicySetIdReferencesItem(String policySetIdReferencesItem) {
        if (this.policySetIdReferences == null) {
            this.policySetIdReferences = new ArrayList<>();
        }
        this.policySetIdReferences.add(policySetIdReferencesItem);
        return this;
    }

        /**
    **/
    public Policy policyIdReferences(List<String> policyIdReferences) {

        this.policyIdReferences = policyIdReferences;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("policyIdReferences")
    @Valid
    public List<String> getPolicyIdReferences() {
        return policyIdReferences;
    }
    public void setPolicyIdReferences(List<String> policyIdReferences) {
        this.policyIdReferences = policyIdReferences;
    }

    public Policy addPolicyIdReferencesItem(String policyIdReferencesItem) {
        if (this.policyIdReferences == null) {
            this.policyIdReferences = new ArrayList<>();
        }
        this.policyIdReferences.add(policyIdReferencesItem);
        return this;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Policy policy = (Policy) o;
        return Objects.equals(this.policy, policy.policy) &&
            Objects.equals(this.policyId, policy.policyId) &&
            Objects.equals(this.active, policy.active) &&
            Objects.equals(this.promote, policy.promote) &&
            Objects.equals(this.policyType, policy.policyType) &&
            Objects.equals(this.policyEditor, policy.policyEditor) &&
            Objects.equals(this.policyEditorData, policy.policyEditorData) &&
            Objects.equals(this.policyOrder, policy.policyOrder) &&
            Objects.equals(this.version, policy.version) &&
            Objects.equals(this.lastModifiedTime, policy.lastModifiedTime) &&
            Objects.equals(this.lastModifiedUser, policy.lastModifiedUser) &&
            Objects.equals(this.attributeDTOs, policy.attributeDTOs) &&
            Objects.equals(this.policySetIdReferences, policy.policySetIdReferences) &&
            Objects.equals(this.policyIdReferences, policy.policyIdReferences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policy, policyId, active, promote, policyType, policyEditor, policyEditorData, policyOrder, version, lastModifiedTime, lastModifiedUser, attributeDTOs, policySetIdReferences, policyIdReferences);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class Policy {\n");
        
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    promote: ").append(toIndentedString(promote)).append("\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    policyEditor: ").append(toIndentedString(policyEditor)).append("\n");
        sb.append("    policyEditorData: ").append(toIndentedString(policyEditorData)).append("\n");
        sb.append("    policyOrder: ").append(toIndentedString(policyOrder)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
        sb.append("    lastModifiedUser: ").append(toIndentedString(lastModifiedUser)).append("\n");
        sb.append("    attributeDTOs: ").append(toIndentedString(attributeDTOs)).append("\n");
        sb.append("    policySetIdReferences: ").append(toIndentedString(policySetIdReferences)).append("\n");
        sb.append("    policyIdReferences: ").append(toIndentedString(policyIdReferences)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n");
    }
}

