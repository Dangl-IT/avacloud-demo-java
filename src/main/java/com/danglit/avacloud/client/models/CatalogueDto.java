/*
 * AVACloud API 1.2.0
 * The full AVACloud API specification
 *
 * OpenAPI spec version: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.danglit.avacloud.client.models;

import java.util.Objects;
import com.danglit.avacloud.client.models.CatalogueTypeDto;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CatalogueDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T20:18:08.781Z")
public class CatalogueDto {
  @SerializedName("id")
  private String id = null;

  @SerializedName("gaebXmlId")
  private String gaebXmlId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("catalogueType")
  private CatalogueTypeDto catalogueType = null;

  public CatalogueDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogueDto gaebXmlId(String gaebXmlId) {
    this.gaebXmlId = gaebXmlId;
    return this;
  }

   /**
   * Get gaebXmlId
   * @return gaebXmlId
  **/
  @ApiModelProperty(value = "")
  public String getGaebXmlId() {
    return gaebXmlId;
  }

  public void setGaebXmlId(String gaebXmlId) {
    this.gaebXmlId = gaebXmlId;
  }

  public CatalogueDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogueDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CatalogueDto catalogueType(CatalogueTypeDto catalogueType) {
    this.catalogueType = catalogueType;
    return this;
  }

   /**
   * Get catalogueType
   * @return catalogueType
  **/
  @ApiModelProperty(required = true, value = "")
  public CatalogueTypeDto getCatalogueType() {
    return catalogueType;
  }

  public void setCatalogueType(CatalogueTypeDto catalogueType) {
    this.catalogueType = catalogueType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogueDto catalogueDto = (CatalogueDto) o;
    return Objects.equals(this.id, catalogueDto.id) &&
        Objects.equals(this.gaebXmlId, catalogueDto.gaebXmlId) &&
        Objects.equals(this.name, catalogueDto.name) &&
        Objects.equals(this.description, catalogueDto.description) &&
        Objects.equals(this.catalogueType, catalogueDto.catalogueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, gaebXmlId, name, description, catalogueType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogueDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    gaebXmlId: ").append(toIndentedString(gaebXmlId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    catalogueType: ").append(toIndentedString(catalogueType)).append("\n");
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

