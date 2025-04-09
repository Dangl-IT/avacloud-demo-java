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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Indicates the status of the AVACloud service
 */
@ApiModel(description = "Indicates the status of the AVACloud service")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-09T18:36:39.750Z")
public class GetStatus {
  @SerializedName("isHealthy")
  private Boolean isHealthy = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("environment")
  private String environment = null;

  public GetStatus isHealthy(Boolean isHealthy) {
    this.isHealthy = isHealthy;
    return this;
  }

   /**
   * If any problems in the service health are known, this is set to false
   * @return isHealthy
  **/
  @ApiModelProperty(required = true, value = "If any problems in the service health are known, this is set to false")
  public Boolean isIsHealthy() {
    return isHealthy;
  }

  public void setIsHealthy(Boolean isHealthy) {
    this.isHealthy = isHealthy;
  }

  public GetStatus version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The current version of the AVACloud service
   * @return version
  **/
  @ApiModelProperty(value = "The current version of the AVACloud service")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public GetStatus environment(String environment) {
    this.environment = environment;
    return this;
  }

   /**
   * The environment of the current instance
   * @return environment
  **/
  @ApiModelProperty(value = "The environment of the current instance")
  public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStatus getStatus = (GetStatus) o;
    return Objects.equals(this.isHealthy, getStatus.isHealthy) &&
        Objects.equals(this.version, getStatus.version) &&
        Objects.equals(this.environment, getStatus.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isHealthy, version, environment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStatus {\n");
    
    sb.append("    isHealthy: ").append(toIndentedString(isHealthy)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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

