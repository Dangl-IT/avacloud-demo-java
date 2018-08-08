/*
 * AVACloud API 1.0.7
 * The full AVACloud API specification
 *
 * OpenAPI spec version: 1.0.7
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.danglit.avacloud.client.models;

import java.util.Objects;
import com.danglit.avacloud.client.models.ItemNumberTypeDto;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ItemNumberSchemaTierDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-08T14:34:08.693Z")
public class ItemNumberSchemaTierDto {
  @SerializedName("length")
  private Integer length = null;

  @SerializedName("type")
  private ItemNumberTypeDto type = null;

  @SerializedName("isLot")
  private Boolean isLot = null;

  public ItemNumberSchemaTierDto length(Integer length) {
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public ItemNumberSchemaTierDto type(ItemNumberTypeDto type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public ItemNumberTypeDto getType() {
    return type;
  }

  public void setType(ItemNumberTypeDto type) {
    this.type = type;
  }

  public ItemNumberSchemaTierDto isLot(Boolean isLot) {
    this.isLot = isLot;
    return this;
  }

   /**
   * Get isLot
   * @return isLot
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsLot() {
    return isLot;
  }

  public void setIsLot(Boolean isLot) {
    this.isLot = isLot;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemNumberSchemaTierDto itemNumberSchemaTierDto = (ItemNumberSchemaTierDto) o;
    return Objects.equals(this.length, itemNumberSchemaTierDto.length) &&
        Objects.equals(this.type, itemNumberSchemaTierDto.type) &&
        Objects.equals(this.isLot, itemNumberSchemaTierDto.isLot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, type, isLot);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemNumberSchemaTierDto {\n");
    
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isLot: ").append(toIndentedString(isLot)).append("\n");
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

