/*
 * AVACloud API 1.10.0
 * AVACloud API specification
 *
 * OpenAPI spec version: 1.10.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.danglit.avacloud.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.danglit.avacloud.client.models.HttpStatusCode;
import com.danglit.avacloud.client.models.ResponseErrorType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TokenResponseGet
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-16T17:38:52.250Z")
public class TokenResponseGet {
  @SerializedName("accessToken")
  private String accessToken = null;

  @SerializedName("error")
  private String error = null;

  @SerializedName("errorDescription")
  private String errorDescription = null;

  @SerializedName("expiresIn")
  private Long expiresIn = null;

  @SerializedName("httpErrorReason")
  private String httpErrorReason = null;

  @SerializedName("httpStatusCode")
  private HttpStatusCode httpStatusCode = null;

  @SerializedName("identityToken")
  private String identityToken = null;

  @SerializedName("isError")
  private Boolean isError = null;

  @SerializedName("refreshToken")
  private String refreshToken = null;

  @SerializedName("tokenType")
  private String tokenType = null;

  @SerializedName("errorType")
  private ResponseErrorType errorType = null;

  public TokenResponseGet accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  @ApiModelProperty(value = "")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public TokenResponseGet error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public TokenResponseGet errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

   /**
   * Get errorDescription
   * @return errorDescription
  **/
  @ApiModelProperty(value = "")
  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

  public TokenResponseGet expiresIn(Long expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * Get expiresIn
   * @return expiresIn
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Long expiresIn) {
    this.expiresIn = expiresIn;
  }

  public TokenResponseGet httpErrorReason(String httpErrorReason) {
    this.httpErrorReason = httpErrorReason;
    return this;
  }

   /**
   * Get httpErrorReason
   * @return httpErrorReason
  **/
  @ApiModelProperty(value = "")
  public String getHttpErrorReason() {
    return httpErrorReason;
  }

  public void setHttpErrorReason(String httpErrorReason) {
    this.httpErrorReason = httpErrorReason;
  }

  public TokenResponseGet httpStatusCode(HttpStatusCode httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
    return this;
  }

   /**
   * Get httpStatusCode
   * @return httpStatusCode
  **/
  @ApiModelProperty(required = true, value = "")
  public HttpStatusCode getHttpStatusCode() {
    return httpStatusCode;
  }

  public void setHttpStatusCode(HttpStatusCode httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }

  public TokenResponseGet identityToken(String identityToken) {
    this.identityToken = identityToken;
    return this;
  }

   /**
   * Get identityToken
   * @return identityToken
  **/
  @ApiModelProperty(value = "")
  public String getIdentityToken() {
    return identityToken;
  }

  public void setIdentityToken(String identityToken) {
    this.identityToken = identityToken;
  }

  public TokenResponseGet isError(Boolean isError) {
    this.isError = isError;
    return this;
  }

   /**
   * Get isError
   * @return isError
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsError() {
    return isError;
  }

  public void setIsError(Boolean isError) {
    this.isError = isError;
  }

  public TokenResponseGet refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Get refreshToken
   * @return refreshToken
  **/
  @ApiModelProperty(value = "")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public TokenResponseGet tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Get tokenType
   * @return tokenType
  **/
  @ApiModelProperty(value = "")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public TokenResponseGet errorType(ResponseErrorType errorType) {
    this.errorType = errorType;
    return this;
  }

   /**
   * Get errorType
   * @return errorType
  **/
  @ApiModelProperty(required = true, value = "")
  public ResponseErrorType getErrorType() {
    return errorType;
  }

  public void setErrorType(ResponseErrorType errorType) {
    this.errorType = errorType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenResponseGet tokenResponseGet = (TokenResponseGet) o;
    return Objects.equals(this.accessToken, tokenResponseGet.accessToken) &&
        Objects.equals(this.error, tokenResponseGet.error) &&
        Objects.equals(this.errorDescription, tokenResponseGet.errorDescription) &&
        Objects.equals(this.expiresIn, tokenResponseGet.expiresIn) &&
        Objects.equals(this.httpErrorReason, tokenResponseGet.httpErrorReason) &&
        Objects.equals(this.httpStatusCode, tokenResponseGet.httpStatusCode) &&
        Objects.equals(this.identityToken, tokenResponseGet.identityToken) &&
        Objects.equals(this.isError, tokenResponseGet.isError) &&
        Objects.equals(this.refreshToken, tokenResponseGet.refreshToken) &&
        Objects.equals(this.tokenType, tokenResponseGet.tokenType) &&
        Objects.equals(this.errorType, tokenResponseGet.errorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, error, errorDescription, expiresIn, httpErrorReason, httpStatusCode, identityToken, isError, refreshToken, tokenType, errorType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenResponseGet {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    httpErrorReason: ").append(toIndentedString(httpErrorReason)).append("\n");
    sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
    sb.append("    identityToken: ").append(toIndentedString(identityToken)).append("\n");
    sb.append("    isError: ").append(toIndentedString(isError)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
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

