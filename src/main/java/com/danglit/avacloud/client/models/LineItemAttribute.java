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
 * A key-value pair for additional information
 */
@ApiModel(description = "A key-value pair for additional information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-09T18:36:39.750Z")
public class LineItemAttribute {
  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private String value = null;

  public LineItemAttribute name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The key / name of the attribute
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The key / name of the attribute")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LineItemAttribute value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the attribute
   * @return value
  **/
  @ApiModelProperty(value = "The value of the attribute")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineItemAttribute lineItemAttribute = (LineItemAttribute) o;
    return Objects.equals(this.name, lineItemAttribute.name) &&
        Objects.equals(this.value, lineItemAttribute.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItemAttribute {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

