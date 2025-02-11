/*
 * AVACloud API 1.55.0
 * AVACloud API specification
 *
 * OpenAPI spec version: 1.55.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.danglit.avacloud.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LoginPost
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-02-11T12:55:14.413Z")
public class LoginPost {
  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("staySignedIn")
  private Boolean staySignedIn = null;

  public LoginPost identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @ApiModelProperty(required = true, value = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public LoginPost password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public LoginPost staySignedIn(Boolean staySignedIn) {
    this.staySignedIn = staySignedIn;
    return this;
  }

   /**
   * Get staySignedIn
   * @return staySignedIn
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isStaySignedIn() {
    return staySignedIn;
  }

  public void setStaySignedIn(Boolean staySignedIn) {
    this.staySignedIn = staySignedIn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginPost loginPost = (LoginPost) o;
    return Objects.equals(this.identifier, loginPost.identifier) &&
        Objects.equals(this.password, loginPost.password) &&
        Objects.equals(this.staySignedIn, loginPost.staySignedIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, password, staySignedIn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginPost {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    staySignedIn: ").append(toIndentedString(staySignedIn)).append("\n");
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

