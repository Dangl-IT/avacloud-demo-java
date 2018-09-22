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
 * PriceComponentDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T20:18:08.781Z")
public class PriceComponentDto {
  @SerializedName("price")
  private BigDecimal price = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("values")
  private List<CalculationDto> values = null;

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getPrice() {
    return price;
  }

  public PriceComponentDto label(String label) {
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

  public PriceComponentDto values(List<CalculationDto> values) {
    this.values = values;
    return this;
  }

  public PriceComponentDto addValuesItem(CalculationDto valuesItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceComponentDto priceComponentDto = (PriceComponentDto) o;
    return Objects.equals(this.price, priceComponentDto.price) &&
        Objects.equals(this.label, priceComponentDto.label) &&
        Objects.equals(this.values, priceComponentDto.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, label, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceComponentDto {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

