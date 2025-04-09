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
import com.danglit.avacloud.client.models.CalculationDto;
import com.danglit.avacloud.client.models.CatalogueDto;
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
 * Based on the PriceComponent, this class is responsible for labour time components.
 */
@ApiModel(description = "Based on the PriceComponent, this class is responsible for labour time components.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-09T18:36:39.750Z")
public class LabourPriceComponentDto {
  @SerializedName("label")
  private String label = null;

  @SerializedName("price")
  private BigDecimal price = null;

  @SerializedName("hourlyWage")
  private BigDecimal hourlyWage = null;

  @SerializedName("values")
  private List<CalculationDto> values = null;

  @SerializedName("useOwnHourlyWage")
  private Boolean useOwnHourlyWage = null;

  @SerializedName("totalTime")
  private BigDecimal totalTime = null;

  @SerializedName("projectCatalogues")
  private List<CatalogueDto> projectCatalogues = null;

  public LabourPriceComponentDto label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The label associated with this price component. Will be taken from the parent Projects ProjectInformation.
   * @return label
  **/
  @ApiModelProperty(value = "The label associated with this price component. Will be taken from the parent Projects ProjectInformation.")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

   /**
   * The total, calculated price of this component. Will multiply the calculated amount of hours with the ServiceSpecifications hourly wage rate.
   * @return price
  **/
  @ApiModelProperty(required = true, value = "The total, calculated price of this component. Will multiply the calculated amount of hours with the ServiceSpecifications hourly wage rate.")
  public BigDecimal getPrice() {
    return price;
  }

  public LabourPriceComponentDto hourlyWage(BigDecimal hourlyWage) {
    this.hourlyWage = hourlyWage;
    return this;
  }

   /**
   * The cost per hour of manual labor.
   * @return hourlyWage
  **/
  @ApiModelProperty(required = true, value = "The cost per hour of manual labor.")
  public BigDecimal getHourlyWage() {
    return hourlyWage;
  }

  public void setHourlyWage(BigDecimal hourlyWage) {
    this.hourlyWage = hourlyWage;
  }

  public LabourPriceComponentDto values(List<CalculationDto> values) {
    this.values = values;
    return this;
  }

  public LabourPriceComponentDto addValuesItem(CalculationDto valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * The single Calculation elements this price component is composed of.
   * @return values
  **/
  @ApiModelProperty(value = "The single Calculation elements this price component is composed of.")
  public List<CalculationDto> getValues() {
    return values;
  }

  public void setValues(List<CalculationDto> values) {
    this.values = values;
  }

  public LabourPriceComponentDto useOwnHourlyWage(Boolean useOwnHourlyWage) {
    this.useOwnHourlyWage = useOwnHourlyWage;
    return this;
  }

   /**
   * Indicates if the ServiceSpecification&#39;s standard HourlyWage is to be used or a custom value.
   * @return useOwnHourlyWage
  **/
  @ApiModelProperty(required = true, value = "Indicates if the ServiceSpecification's standard HourlyWage is to be used or a custom value.")
  public Boolean isUseOwnHourlyWage() {
    return useOwnHourlyWage;
  }

  public void setUseOwnHourlyWage(Boolean useOwnHourlyWage) {
    this.useOwnHourlyWage = useOwnHourlyWage;
  }

   /**
   * The total, calculated time of this component. Will return the result rounded to three decimal places.
   * @return totalTime
  **/
  @ApiModelProperty(required = true, value = "The total, calculated time of this component. Will return the result rounded to three decimal places.")
  public BigDecimal getTotalTime() {
    return totalTime;
  }

  public LabourPriceComponentDto projectCatalogues(List<CatalogueDto> projectCatalogues) {
    this.projectCatalogues = projectCatalogues;
    return this;
  }

  public LabourPriceComponentDto addProjectCataloguesItem(CatalogueDto projectCataloguesItem) {
    if (this.projectCatalogues == null) {
      this.projectCatalogues = new ArrayList<>();
    }
    this.projectCatalogues.add(projectCataloguesItem);
    return this;
  }

   /**
   * These are Catalogues that are used within this PriceComponent. Catalogues are used to describe catalogues, or collections, that can be used to describe elements with commonly known properties. For example, QuantityAssignments use these to categorize themselves. They are propagate to all child elements, e.g. other containers and QuantityAssignments. In the context of a ServiceSpecification, all elements share the same instance of the collection.
   * @return projectCatalogues
  **/
  @ApiModelProperty(value = "These are Catalogues that are used within this PriceComponent. Catalogues are used to describe catalogues, or collections, that can be used to describe elements with commonly known properties. For example, QuantityAssignments use these to categorize themselves. They are propagate to all child elements, e.g. other containers and QuantityAssignments. In the context of a ServiceSpecification, all elements share the same instance of the collection.")
  public List<CatalogueDto> getProjectCatalogues() {
    return projectCatalogues;
  }

  public void setProjectCatalogues(List<CatalogueDto> projectCatalogues) {
    this.projectCatalogues = projectCatalogues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabourPriceComponentDto labourPriceComponentDto = (LabourPriceComponentDto) o;
    return Objects.equals(this.label, labourPriceComponentDto.label) &&
        Objects.equals(this.price, labourPriceComponentDto.price) &&
        Objects.equals(this.hourlyWage, labourPriceComponentDto.hourlyWage) &&
        Objects.equals(this.values, labourPriceComponentDto.values) &&
        Objects.equals(this.useOwnHourlyWage, labourPriceComponentDto.useOwnHourlyWage) &&
        Objects.equals(this.totalTime, labourPriceComponentDto.totalTime) &&
        Objects.equals(this.projectCatalogues, labourPriceComponentDto.projectCatalogues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, price, hourlyWage, values, useOwnHourlyWage, totalTime, projectCatalogues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabourPriceComponentDto {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    hourlyWage: ").append(toIndentedString(hourlyWage)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    useOwnHourlyWage: ").append(toIndentedString(useOwnHourlyWage)).append("\n");
    sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
    sb.append("    projectCatalogues: ").append(toIndentedString(projectCatalogues)).append("\n");
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

