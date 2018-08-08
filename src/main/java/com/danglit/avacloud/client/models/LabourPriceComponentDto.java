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
import com.danglit.avacloud.client.models.CalculationDto;
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
 * LabourPriceComponentDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-08T14:34:08.693Z")
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

  public LabourPriceComponentDto label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public LabourPriceComponentDto price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public LabourPriceComponentDto hourlyWage(BigDecimal hourlyWage) {
    this.hourlyWage = hourlyWage;
    return this;
  }

   /**
   * Get hourlyWage
   * @return hourlyWage
  **/
  @ApiModelProperty(required = true, value = "")
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
   * Get values
   * @return values
  **/
  @ApiModelProperty(value = "")
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
   * Get useOwnHourlyWage
   * @return useOwnHourlyWage
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isUseOwnHourlyWage() {
    return useOwnHourlyWage;
  }

  public void setUseOwnHourlyWage(Boolean useOwnHourlyWage) {
    this.useOwnHourlyWage = useOwnHourlyWage;
  }

  public LabourPriceComponentDto totalTime(BigDecimal totalTime) {
    this.totalTime = totalTime;
    return this;
  }

   /**
   * Get totalTime
   * @return totalTime
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getTotalTime() {
    return totalTime;
  }

  public void setTotalTime(BigDecimal totalTime) {
    this.totalTime = totalTime;
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
        Objects.equals(this.totalTime, labourPriceComponentDto.totalTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, price, hourlyWage, values, useOwnHourlyWage, totalTime);
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

