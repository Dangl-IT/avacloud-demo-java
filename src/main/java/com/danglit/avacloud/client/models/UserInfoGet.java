/*
 * AVACloud API 1.59.0
 * AVACloud API specification
 *
 * OpenAPI spec version: 1.59.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.danglit.avacloud.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.danglit.avacloud.client.models.ClaimGet;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UserInfoGet
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-09T18:36:39.750Z")
public class UserInfoGet {
  @SerializedName("userIsAuthenticated")
  private Boolean userIsAuthenticated = null;

  @SerializedName("clientIsAuthenticated")
  private Boolean clientIsAuthenticated = null;

  @SerializedName("currentUserId")
  private String currentUserId = null;

  @SerializedName("currentUserIdenticonId")
  private String currentUserIdenticonId = null;

  @SerializedName("currentUserName")
  private String currentUserName = null;

  @SerializedName("currentUserEmail")
  private String currentUserEmail = null;

  @SerializedName("currentClientId")
  private String currentClientId = null;

  @SerializedName("userClaims")
  private List<ClaimGet> userClaims = null;

  @SerializedName("clientClaims")
  private List<ClaimGet> clientClaims = null;

  public UserInfoGet userIsAuthenticated(Boolean userIsAuthenticated) {
    this.userIsAuthenticated = userIsAuthenticated;
    return this;
  }

   /**
   * Get userIsAuthenticated
   * @return userIsAuthenticated
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isUserIsAuthenticated() {
    return userIsAuthenticated;
  }

  public void setUserIsAuthenticated(Boolean userIsAuthenticated) {
    this.userIsAuthenticated = userIsAuthenticated;
  }

  public UserInfoGet clientIsAuthenticated(Boolean clientIsAuthenticated) {
    this.clientIsAuthenticated = clientIsAuthenticated;
    return this;
  }

   /**
   * Get clientIsAuthenticated
   * @return clientIsAuthenticated
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isClientIsAuthenticated() {
    return clientIsAuthenticated;
  }

  public void setClientIsAuthenticated(Boolean clientIsAuthenticated) {
    this.clientIsAuthenticated = clientIsAuthenticated;
  }

  public UserInfoGet currentUserId(String currentUserId) {
    this.currentUserId = currentUserId;
    return this;
  }

   /**
   * Get currentUserId
   * @return currentUserId
  **/
  @ApiModelProperty(value = "")
  public String getCurrentUserId() {
    return currentUserId;
  }

  public void setCurrentUserId(String currentUserId) {
    this.currentUserId = currentUserId;
  }

  public UserInfoGet currentUserIdenticonId(String currentUserIdenticonId) {
    this.currentUserIdenticonId = currentUserIdenticonId;
    return this;
  }

   /**
   * Get currentUserIdenticonId
   * @return currentUserIdenticonId
  **/
  @ApiModelProperty(value = "")
  public String getCurrentUserIdenticonId() {
    return currentUserIdenticonId;
  }

  public void setCurrentUserIdenticonId(String currentUserIdenticonId) {
    this.currentUserIdenticonId = currentUserIdenticonId;
  }

  public UserInfoGet currentUserName(String currentUserName) {
    this.currentUserName = currentUserName;
    return this;
  }

   /**
   * Get currentUserName
   * @return currentUserName
  **/
  @ApiModelProperty(value = "")
  public String getCurrentUserName() {
    return currentUserName;
  }

  public void setCurrentUserName(String currentUserName) {
    this.currentUserName = currentUserName;
  }

  public UserInfoGet currentUserEmail(String currentUserEmail) {
    this.currentUserEmail = currentUserEmail;
    return this;
  }

   /**
   * Get currentUserEmail
   * @return currentUserEmail
  **/
  @ApiModelProperty(value = "")
  public String getCurrentUserEmail() {
    return currentUserEmail;
  }

  public void setCurrentUserEmail(String currentUserEmail) {
    this.currentUserEmail = currentUserEmail;
  }

  public UserInfoGet currentClientId(String currentClientId) {
    this.currentClientId = currentClientId;
    return this;
  }

   /**
   * Get currentClientId
   * @return currentClientId
  **/
  @ApiModelProperty(value = "")
  public String getCurrentClientId() {
    return currentClientId;
  }

  public void setCurrentClientId(String currentClientId) {
    this.currentClientId = currentClientId;
  }

  public UserInfoGet userClaims(List<ClaimGet> userClaims) {
    this.userClaims = userClaims;
    return this;
  }

  public UserInfoGet addUserClaimsItem(ClaimGet userClaimsItem) {
    if (this.userClaims == null) {
      this.userClaims = new ArrayList<>();
    }
    this.userClaims.add(userClaimsItem);
    return this;
  }

   /**
   * Get userClaims
   * @return userClaims
  **/
  @ApiModelProperty(value = "")
  public List<ClaimGet> getUserClaims() {
    return userClaims;
  }

  public void setUserClaims(List<ClaimGet> userClaims) {
    this.userClaims = userClaims;
  }

  public UserInfoGet clientClaims(List<ClaimGet> clientClaims) {
    this.clientClaims = clientClaims;
    return this;
  }

  public UserInfoGet addClientClaimsItem(ClaimGet clientClaimsItem) {
    if (this.clientClaims == null) {
      this.clientClaims = new ArrayList<>();
    }
    this.clientClaims.add(clientClaimsItem);
    return this;
  }

   /**
   * Get clientClaims
   * @return clientClaims
  **/
  @ApiModelProperty(value = "")
  public List<ClaimGet> getClientClaims() {
    return clientClaims;
  }

  public void setClientClaims(List<ClaimGet> clientClaims) {
    this.clientClaims = clientClaims;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInfoGet userInfoGet = (UserInfoGet) o;
    return Objects.equals(this.userIsAuthenticated, userInfoGet.userIsAuthenticated) &&
        Objects.equals(this.clientIsAuthenticated, userInfoGet.clientIsAuthenticated) &&
        Objects.equals(this.currentUserId, userInfoGet.currentUserId) &&
        Objects.equals(this.currentUserIdenticonId, userInfoGet.currentUserIdenticonId) &&
        Objects.equals(this.currentUserName, userInfoGet.currentUserName) &&
        Objects.equals(this.currentUserEmail, userInfoGet.currentUserEmail) &&
        Objects.equals(this.currentClientId, userInfoGet.currentClientId) &&
        Objects.equals(this.userClaims, userInfoGet.userClaims) &&
        Objects.equals(this.clientClaims, userInfoGet.clientClaims);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userIsAuthenticated, clientIsAuthenticated, currentUserId, currentUserIdenticonId, currentUserName, currentUserEmail, currentClientId, userClaims, clientClaims);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfoGet {\n");
    
    sb.append("    userIsAuthenticated: ").append(toIndentedString(userIsAuthenticated)).append("\n");
    sb.append("    clientIsAuthenticated: ").append(toIndentedString(clientIsAuthenticated)).append("\n");
    sb.append("    currentUserId: ").append(toIndentedString(currentUserId)).append("\n");
    sb.append("    currentUserIdenticonId: ").append(toIndentedString(currentUserIdenticonId)).append("\n");
    sb.append("    currentUserName: ").append(toIndentedString(currentUserName)).append("\n");
    sb.append("    currentUserEmail: ").append(toIndentedString(currentUserEmail)).append("\n");
    sb.append("    currentClientId: ").append(toIndentedString(currentClientId)).append("\n");
    sb.append("    userClaims: ").append(toIndentedString(userClaims)).append("\n");
    sb.append("    clientClaims: ").append(toIndentedString(clientClaims)).append("\n");
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
    return o.toString().replace("\n", "\n    ");
  }

}

