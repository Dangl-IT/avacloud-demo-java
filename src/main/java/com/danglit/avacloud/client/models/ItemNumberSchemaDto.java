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
import com.danglit.avacloud.client.models.ItemNumberSchemaTierDto;
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
 * ItemNumberSchemaDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-08T14:34:08.693Z")
public class ItemNumberSchemaDto {
  @SerializedName("totalLength")
  private Integer totalLength = null;

  @SerializedName("tiers")
  private List<ItemNumberSchemaTierDto> tiers = null;

  public ItemNumberSchemaDto totalLength(Integer totalLength) {
    this.totalLength = totalLength;
    return this;
  }

   /**
   * Get totalLength
   * @return totalLength
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getTotalLength() {
    return totalLength;
  }

  public void setTotalLength(Integer totalLength) {
    this.totalLength = totalLength;
  }

  public ItemNumberSchemaDto tiers(List<ItemNumberSchemaTierDto> tiers) {
    this.tiers = tiers;
    return this;
  }

  public ItemNumberSchemaDto addTiersItem(ItemNumberSchemaTierDto tiersItem) {
    if (this.tiers == null) {
      this.tiers = new ArrayList<>();
    }
    this.tiers.add(tiersItem);
    return this;
  }

   /**
   * Get tiers
   * @return tiers
  **/
  @ApiModelProperty(value = "")
  public List<ItemNumberSchemaTierDto> getTiers() {
    return tiers;
  }

  public void setTiers(List<ItemNumberSchemaTierDto> tiers) {
    this.tiers = tiers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemNumberSchemaDto itemNumberSchemaDto = (ItemNumberSchemaDto) o;
    return Objects.equals(this.totalLength, itemNumberSchemaDto.totalLength) &&
        Objects.equals(this.tiers, itemNumberSchemaDto.tiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalLength, tiers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemNumberSchemaDto {\n");
    
    sb.append("    totalLength: ").append(toIndentedString(totalLength)).append("\n");
    sb.append("    tiers: ").append(toIndentedString(tiers)).append("\n");
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

