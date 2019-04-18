/*
 * AVACloud API 1.7.5
 * AVACloud API specification
 *
 * OpenAPI spec version: 1.7.5
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
 * This class is used to link data between catalogues and objects.
 */
@ApiModel(description = "This class is used to link data between catalogues and objects.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-18T15:34:26.579Z")
public class CatalogueReferenceDto {
  @SerializedName("id")
  private String id = null;

  @SerializedName("catalogueReferenceKey")
  private String catalogueReferenceKey = null;

  @SerializedName("catalogueReferenceId")
  private String catalogueReferenceId = null;

  @SerializedName("projectCatalogues")
  private List<CatalogueDto> projectCatalogues = null;

  @SerializedName("catalogue")
  private CatalogueDto catalogue = null;

  public CatalogueReferenceDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Elements GUID identifier.             
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Elements GUID identifier.             ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogueReferenceDto catalogueReferenceKey(String catalogueReferenceKey) {
    this.catalogueReferenceKey = catalogueReferenceKey;
    return this;
  }

   /**
   * This points to the item in the catalogue itself. This means that, for example when this quantity assignment references a \&quot;DIN 276\&quot; catalogue, this property indicates the number / identifier / key in DIN 276 that is referenced.
   * @return catalogueReferenceKey
  **/
  @ApiModelProperty(value = "This points to the item in the catalogue itself. This means that, for example when this quantity assignment references a \"DIN 276\" catalogue, this property indicates the number / identifier / key in DIN 276 that is referenced.")
  public String getCatalogueReferenceKey() {
    return catalogueReferenceKey;
  }

  public void setCatalogueReferenceKey(String catalogueReferenceKey) {
    this.catalogueReferenceKey = catalogueReferenceKey;
  }

  public CatalogueReferenceDto catalogueReferenceId(String catalogueReferenceId) {
    this.catalogueReferenceId = catalogueReferenceId;
    return this;
  }

   /**
   * The Id of the CatalogueReference that is targeted by this item. Set this property to set the referenced catalogue.
   * @return catalogueReferenceId
  **/
  @ApiModelProperty(required = true, value = "The Id of the CatalogueReference that is targeted by this item. Set this property to set the referenced catalogue.")
  public String getCatalogueReferenceId() {
    return catalogueReferenceId;
  }

  public void setCatalogueReferenceId(String catalogueReferenceId) {
    this.catalogueReferenceId = catalogueReferenceId;
  }

  public CatalogueReferenceDto projectCatalogues(List<CatalogueDto> projectCatalogues) {
    this.projectCatalogues = projectCatalogues;
    return this;
  }

  public CatalogueReferenceDto addProjectCataloguesItem(CatalogueDto projectCataloguesItem) {
    if (this.projectCatalogues == null) {
      this.projectCatalogues = new ArrayList<>();
    }
    this.projectCatalogues.add(projectCataloguesItem);
    return this;
  }

   /**
   * These are CatalogueReference that are used within this ServiceSpecification. Catalogue references are used to describe catalogues, or collections, that can be used to describe elements with commonly known properties. For example, QuantityAssignments use these to categorize themselves.
   * @return projectCatalogues
  **/
  @ApiModelProperty(value = "These are CatalogueReference that are used within this ServiceSpecification. Catalogue references are used to describe catalogues, or collections, that can be used to describe elements with commonly known properties. For example, QuantityAssignments use these to categorize themselves.")
  public List<CatalogueDto> getProjectCatalogues() {
    return projectCatalogues;
  }

  public void setProjectCatalogues(List<CatalogueDto> projectCatalogues) {
    this.projectCatalogues = projectCatalogues;
  }

   /**
   * This returns the referenced catalogue. Will return null if there is no reference or the catalogue is not present in the ProjectCatalogues.
   * @return catalogue
  **/
  @ApiModelProperty(value = "This returns the referenced catalogue. Will return null if there is no reference or the catalogue is not present in the ProjectCatalogues.")
  public CatalogueDto getCatalogue() {
    return catalogue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogueReferenceDto catalogueReferenceDto = (CatalogueReferenceDto) o;
    return Objects.equals(this.id, catalogueReferenceDto.id) &&
        Objects.equals(this.catalogueReferenceKey, catalogueReferenceDto.catalogueReferenceKey) &&
        Objects.equals(this.catalogueReferenceId, catalogueReferenceDto.catalogueReferenceId) &&
        Objects.equals(this.projectCatalogues, catalogueReferenceDto.projectCatalogues) &&
        Objects.equals(this.catalogue, catalogueReferenceDto.catalogue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, catalogueReferenceKey, catalogueReferenceId, projectCatalogues, catalogue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogueReferenceDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    catalogueReferenceKey: ").append(toIndentedString(catalogueReferenceKey)).append("\n");
    sb.append("    catalogueReferenceId: ").append(toIndentedString(catalogueReferenceId)).append("\n");
    sb.append("    projectCatalogues: ").append(toIndentedString(projectCatalogues)).append("\n");
    sb.append("    catalogue: ").append(toIndentedString(catalogue)).append("\n");
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

