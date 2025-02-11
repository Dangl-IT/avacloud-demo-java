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
import com.danglit.avacloud.client.models.CatalogueDto;
import com.danglit.avacloud.client.models.CatalogueReferenceDto;
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
 * Base interface definition for elements within an ElementContainerBase.
 */
@ApiModel(description = "Base interface definition for elements within an ElementContainerBase.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-02-11T12:55:14.413Z")

public class IElementDto {
  @SerializedName("id")
  private String id = null;

  @SerializedName("gaebXmlId")
  private String gaebXmlId = null;

  @SerializedName("addendumNumber")
  private String addendumNumber = null;

  @SerializedName("projectCatalogues")
  private List<CatalogueDto> projectCatalogues = null;

  @SerializedName("catalogueReferences")
  private List<CatalogueReferenceDto> catalogueReferences = null;

  @SerializedName("elementTypeDiscriminator")
  private String elementTypeDiscriminator = null;

  public IElementDto() {
    this.elementTypeDiscriminator = this.getClass().getSimpleName();
  }
  public IElementDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Elements GUID identifier.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Elements GUID identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IElementDto gaebXmlId(String gaebXmlId) {
    this.gaebXmlId = gaebXmlId;
    return this;
  }

   /**
   * This is used to store the GAEB XML Id within this IElement. This data is not used for any calculations or evaluations but only for GAEB serialization and deserialization.
   * @return gaebXmlId
  **/
  @ApiModelProperty(value = "This is used to store the GAEB XML Id within this IElement. This data is not used for any calculations or evaluations but only for GAEB serialization and deserialization.")
  public String getGaebXmlId() {
    return gaebXmlId;
  }

  public void setGaebXmlId(String gaebXmlId) {
    this.gaebXmlId = gaebXmlId;
  }

  public IElementDto addendumNumber(String addendumNumber) {
    this.addendumNumber = addendumNumber;
    return this;
  }

   /**
   * This optional string property is shared by all IElements, and indicates if the element is part of an addendum, a &#39;Nachtrag&#39; in German.
   * @return addendumNumber
  **/
  @ApiModelProperty(value = "This optional string property is shared by all IElements, and indicates if the element is part of an addendum, a 'Nachtrag' in German.")
  public String getAddendumNumber() {
    return addendumNumber;
  }

  public void setAddendumNumber(String addendumNumber) {
    this.addendumNumber = addendumNumber;
  }

  public IElementDto projectCatalogues(List<CatalogueDto> projectCatalogues) {
    this.projectCatalogues = projectCatalogues;
    return this;
  }

  public IElementDto addProjectCataloguesItem(CatalogueDto projectCataloguesItem) {
    if (this.projectCatalogues == null) {
      this.projectCatalogues = new ArrayList<>();
    }
    this.projectCatalogues.add(projectCataloguesItem);
    return this;
  }

   /**
   * Get projectCatalogues
   * @return projectCatalogues
  **/
  @ApiModelProperty(value = "")
  public List<CatalogueDto> getProjectCatalogues() {
    return projectCatalogues;
  }

  public void setProjectCatalogues(List<CatalogueDto> projectCatalogues) {
    this.projectCatalogues = projectCatalogues;
  }

  public IElementDto catalogueReferences(List<CatalogueReferenceDto> catalogueReferences) {
    this.catalogueReferences = catalogueReferences;
    return this;
  }

  public IElementDto addCatalogueReferencesItem(CatalogueReferenceDto catalogueReferencesItem) {
    if (this.catalogueReferences == null) {
      this.catalogueReferences = new ArrayList<>();
    }
    this.catalogueReferences.add(catalogueReferencesItem);
    return this;
  }

   /**
   * Get catalogueReferences
   * @return catalogueReferences
  **/
  @ApiModelProperty(value = "")
  public List<CatalogueReferenceDto> getCatalogueReferences() {
    return catalogueReferences;
  }

  public void setCatalogueReferences(List<CatalogueReferenceDto> catalogueReferences) {
    this.catalogueReferences = catalogueReferences;
  }

  public IElementDto elementTypeDiscriminator(String elementTypeDiscriminator) {
    this.elementTypeDiscriminator = elementTypeDiscriminator;
    return this;
  }

   /**
   * Get elementTypeDiscriminator
   * @return elementTypeDiscriminator
  **/
  @ApiModelProperty(required = true, value = "")
  public String getElementTypeDiscriminator() {
    return elementTypeDiscriminator;
  }

  public void setElementTypeDiscriminator(String elementTypeDiscriminator) {
    this.elementTypeDiscriminator = elementTypeDiscriminator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IElementDto ielementDto = (IElementDto) o;
    return Objects.equals(this.id, ielementDto.id) &&
        Objects.equals(this.gaebXmlId, ielementDto.gaebXmlId) &&
        Objects.equals(this.addendumNumber, ielementDto.addendumNumber) &&
        Objects.equals(this.projectCatalogues, ielementDto.projectCatalogues) &&
        Objects.equals(this.catalogueReferences, ielementDto.catalogueReferences) &&
        Objects.equals(this.elementTypeDiscriminator, ielementDto.elementTypeDiscriminator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, gaebXmlId, addendumNumber, projectCatalogues, catalogueReferences, elementTypeDiscriminator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IElementDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    gaebXmlId: ").append(toIndentedString(gaebXmlId)).append("\n");
    sb.append("    addendumNumber: ").append(toIndentedString(addendumNumber)).append("\n");
    sb.append("    projectCatalogues: ").append(toIndentedString(projectCatalogues)).append("\n");
    sb.append("    catalogueReferences: ").append(toIndentedString(catalogueReferences)).append("\n");
    sb.append("    elementTypeDiscriminator: ").append(toIndentedString(elementTypeDiscriminator)).append("\n");
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

