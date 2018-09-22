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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * QuantityAssignmentDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T20:18:08.781Z")
public class QuantityAssignmentDto {
  @SerializedName("id")
  private String id = null;

  @SerializedName("quantity")
  private BigDecimal quantity = null;

  @SerializedName("projectCatalogues")
  private List<CatalogueDto> projectCatalogues = null;

  @SerializedName("catalogueReferences")
  private List<CatalogueReferenceDto> catalogueReferences = null;

  public QuantityAssignmentDto id(String id) {
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

  public QuantityAssignmentDto quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public QuantityAssignmentDto projectCatalogues(List<CatalogueDto> projectCatalogues) {
    this.projectCatalogues = projectCatalogues;
    return this;
  }

  public QuantityAssignmentDto addProjectCataloguesItem(CatalogueDto projectCataloguesItem) {
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

  public QuantityAssignmentDto catalogueReferences(List<CatalogueReferenceDto> catalogueReferences) {
    this.catalogueReferences = catalogueReferences;
    return this;
  }

  public QuantityAssignmentDto addCatalogueReferencesItem(CatalogueReferenceDto catalogueReferencesItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuantityAssignmentDto quantityAssignmentDto = (QuantityAssignmentDto) o;
    return Objects.equals(this.id, quantityAssignmentDto.id) &&
        Objects.equals(this.quantity, quantityAssignmentDto.quantity) &&
        Objects.equals(this.projectCatalogues, quantityAssignmentDto.projectCatalogues) &&
        Objects.equals(this.catalogueReferences, quantityAssignmentDto.catalogueReferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity, projectCatalogues, catalogueReferences);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuantityAssignmentDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    projectCatalogues: ").append(toIndentedString(projectCatalogues)).append("\n");
    sb.append("    catalogueReferences: ").append(toIndentedString(catalogueReferences)).append("\n");
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

