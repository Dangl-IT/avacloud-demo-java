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
 * This class holds means to calculate mathematical expressions from given strings.
 */
@ApiModel(description = "This class holds means to calculate mathematical expressions from given strings.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-04T13:13:59.221Z")
public class CalculationDto {
  @SerializedName("description")
  private String description = null;

  @SerializedName("formula")
  private String formula = null;

  @SerializedName("result")
  private Double result = null;

  @SerializedName("valid")
  private Boolean valid = null;

  @SerializedName("errorPositionInLine")
  private Integer errorPositionInLine = null;

  @SerializedName("projectCatalogues")
  private List<CatalogueDto> projectCatalogues = null;

  @SerializedName("catalogueReferences")
  private List<CatalogueReferenceDto> catalogueReferences = null;

  public CalculationDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Descriptive text for this calculation.
   * @return description
  **/
  @ApiModelProperty(value = "Descriptive text for this calculation.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CalculationDto formula(String formula) {
    this.formula = formula;
    return this;
  }

   /**
   * This Calculation&#39;s mathematical expression. Please note that thousands separators are not supported. Both comma and point will be treated as decimal separators.
   * @return formula
  **/
  @ApiModelProperty(value = "This Calculation's mathematical expression. Please note that thousands separators are not supported. Both comma and point will be treated as decimal separators.")
  public String getFormula() {
    return formula;
  }

  public void setFormula(String formula) {
    this.formula = formula;
  }

   /**
   * The calculated result from the formula, 0 if invalid.
   * @return result
  **/
  @ApiModelProperty(required = true, value = "The calculated result from the formula, 0 if invalid.")
  public Double getResult() {
    return result;
  }

   /**
   * Whether the Formula is a valid expression.
   * @return valid
  **/
  @ApiModelProperty(required = true, value = "Whether the Formula is a valid expression.")
  public Boolean isValid() {
    return valid;
  }

   /**
   * Will be -1 if the Formula is correct, else it will show the position in the formula where an error was encountered. This is a zero based index.
   * @return errorPositionInLine
  **/
  @ApiModelProperty(required = true, value = "Will be -1 if the Formula is correct, else it will show the position in the formula where an error was encountered. This is a zero based index.")
  public Integer getErrorPositionInLine() {
    return errorPositionInLine;
  }

  public CalculationDto projectCatalogues(List<CatalogueDto> projectCatalogues) {
    this.projectCatalogues = projectCatalogues;
    return this;
  }

  public CalculationDto addProjectCataloguesItem(CatalogueDto projectCataloguesItem) {
    if (this.projectCatalogues == null) {
      this.projectCatalogues = new ArrayList<>();
    }
    this.projectCatalogues.add(projectCataloguesItem);
    return this;
  }

   /**
   * These are Catalogues that are used within this Calculation. Catalogues are used to describe catalogues, or collections, that can be used to describe elements with commonly known properties. For example, QuantityAssignments use these to categorize themselves. They are propagate to all child elements, e.g. other containers and QuantityAssignments. In the context of a ServiceSpecification, all elements share the same instance of the collection.
   * @return projectCatalogues
  **/
  @ApiModelProperty(value = "These are Catalogues that are used within this Calculation. Catalogues are used to describe catalogues, or collections, that can be used to describe elements with commonly known properties. For example, QuantityAssignments use these to categorize themselves. They are propagate to all child elements, e.g. other containers and QuantityAssignments. In the context of a ServiceSpecification, all elements share the same instance of the collection.")
  public List<CatalogueDto> getProjectCatalogues() {
    return projectCatalogues;
  }

  public void setProjectCatalogues(List<CatalogueDto> projectCatalogues) {
    this.projectCatalogues = projectCatalogues;
  }

  public CalculationDto catalogueReferences(List<CatalogueReferenceDto> catalogueReferences) {
    this.catalogueReferences = catalogueReferences;
    return this;
  }

  public CalculationDto addCatalogueReferencesItem(CatalogueReferenceDto catalogueReferencesItem) {
    if (this.catalogueReferences == null) {
      this.catalogueReferences = new ArrayList<>();
    }
    this.catalogueReferences.add(catalogueReferencesItem);
    return this;
  }

   /**
   * Referenced catalogues for this Calculation.
   * @return catalogueReferences
  **/
  @ApiModelProperty(value = "Referenced catalogues for this Calculation.")
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
    CalculationDto calculationDto = (CalculationDto) o;
    return Objects.equals(this.description, calculationDto.description) &&
        Objects.equals(this.formula, calculationDto.formula) &&
        Objects.equals(this.result, calculationDto.result) &&
        Objects.equals(this.valid, calculationDto.valid) &&
        Objects.equals(this.errorPositionInLine, calculationDto.errorPositionInLine) &&
        Objects.equals(this.projectCatalogues, calculationDto.projectCatalogues) &&
        Objects.equals(this.catalogueReferences, calculationDto.catalogueReferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, formula, result, valid, errorPositionInLine, projectCatalogues, catalogueReferences);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculationDto {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    errorPositionInLine: ").append(toIndentedString(errorPositionInLine)).append("\n");
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

