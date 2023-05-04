/*
 * AVACloud API 1.41.0
 * AVACloud API specification
 *
 * OpenAPI spec version: 1.41.0
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
 * Options for conversions from AVA
 */
@ApiModel(description = "Options for conversions from AVA")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-04T13:13:59.221Z")
public class PostAvaSourceOptions {
  @SerializedName("tryAutoGenerateItemNumbersAndSchema")
  private Boolean tryAutoGenerateItemNumbersAndSchema = null;

  public PostAvaSourceOptions tryAutoGenerateItemNumbersAndSchema(Boolean tryAutoGenerateItemNumbersAndSchema) {
    this.tryAutoGenerateItemNumbersAndSchema = tryAutoGenerateItemNumbersAndSchema;
    return this;
  }

   /**
   * If this is set to true, AVACloud will try to generate item numbers and an item number schema automatically for the input project. The operation will not have any effect if either an item number schema is already present, or if any of the elements already has an item number.
   * @return tryAutoGenerateItemNumbersAndSchema
  **/
  @ApiModelProperty(required = true, value = "If this is set to true, AVACloud will try to generate item numbers and an item number schema automatically for the input project. The operation will not have any effect if either an item number schema is already present, or if any of the elements already has an item number.")
  public Boolean isTryAutoGenerateItemNumbersAndSchema() {
    return tryAutoGenerateItemNumbersAndSchema;
  }

  public void setTryAutoGenerateItemNumbersAndSchema(Boolean tryAutoGenerateItemNumbersAndSchema) {
    this.tryAutoGenerateItemNumbersAndSchema = tryAutoGenerateItemNumbersAndSchema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostAvaSourceOptions postAvaSourceOptions = (PostAvaSourceOptions) o;
    return Objects.equals(this.tryAutoGenerateItemNumbersAndSchema, postAvaSourceOptions.tryAutoGenerateItemNumbersAndSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tryAutoGenerateItemNumbersAndSchema);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostAvaSourceOptions {\n");
    
    sb.append("    tryAutoGenerateItemNumbersAndSchema: ").append(toIndentedString(tryAutoGenerateItemNumbersAndSchema)).append("\n");
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
