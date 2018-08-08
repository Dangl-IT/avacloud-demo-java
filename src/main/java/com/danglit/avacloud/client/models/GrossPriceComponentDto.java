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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * GrossPriceComponentDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-08T14:34:08.693Z")
public class GrossPriceComponentDto {
  @SerializedName("taxRate")
  private BigDecimal taxRate = null;

  @SerializedName("deductionFactor")
  private BigDecimal deductionFactor = null;

  @SerializedName("totalNet")
  private BigDecimal totalNet = null;

  @SerializedName("totalDeducted")
  private BigDecimal totalDeducted = null;

  @SerializedName("totalTax")
  private BigDecimal totalTax = null;

  @SerializedName("totalGross")
  private BigDecimal totalGross = null;

  public GrossPriceComponentDto taxRate(BigDecimal taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Get taxRate
   * @return taxRate
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(BigDecimal taxRate) {
    this.taxRate = taxRate;
  }

  public GrossPriceComponentDto deductionFactor(BigDecimal deductionFactor) {
    this.deductionFactor = deductionFactor;
    return this;
  }

   /**
   * Get deductionFactor
   * @return deductionFactor
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getDeductionFactor() {
    return deductionFactor;
  }

  public void setDeductionFactor(BigDecimal deductionFactor) {
    this.deductionFactor = deductionFactor;
  }

  public GrossPriceComponentDto totalNet(BigDecimal totalNet) {
    this.totalNet = totalNet;
    return this;
  }

   /**
   * Get totalNet
   * @return totalNet
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getTotalNet() {
    return totalNet;
  }

  public void setTotalNet(BigDecimal totalNet) {
    this.totalNet = totalNet;
  }

  public GrossPriceComponentDto totalDeducted(BigDecimal totalDeducted) {
    this.totalDeducted = totalDeducted;
    return this;
  }

   /**
   * Get totalDeducted
   * @return totalDeducted
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getTotalDeducted() {
    return totalDeducted;
  }

  public void setTotalDeducted(BigDecimal totalDeducted) {
    this.totalDeducted = totalDeducted;
  }

  public GrossPriceComponentDto totalTax(BigDecimal totalTax) {
    this.totalTax = totalTax;
    return this;
  }

   /**
   * Get totalTax
   * @return totalTax
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(BigDecimal totalTax) {
    this.totalTax = totalTax;
  }

  public GrossPriceComponentDto totalGross(BigDecimal totalGross) {
    this.totalGross = totalGross;
    return this;
  }

   /**
   * Get totalGross
   * @return totalGross
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getTotalGross() {
    return totalGross;
  }

  public void setTotalGross(BigDecimal totalGross) {
    this.totalGross = totalGross;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrossPriceComponentDto grossPriceComponentDto = (GrossPriceComponentDto) o;
    return Objects.equals(this.taxRate, grossPriceComponentDto.taxRate) &&
        Objects.equals(this.deductionFactor, grossPriceComponentDto.deductionFactor) &&
        Objects.equals(this.totalNet, grossPriceComponentDto.totalNet) &&
        Objects.equals(this.totalDeducted, grossPriceComponentDto.totalDeducted) &&
        Objects.equals(this.totalTax, grossPriceComponentDto.totalTax) &&
        Objects.equals(this.totalGross, grossPriceComponentDto.totalGross);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxRate, deductionFactor, totalNet, totalDeducted, totalTax, totalGross);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrossPriceComponentDto {\n");
    
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    deductionFactor: ").append(toIndentedString(deductionFactor)).append("\n");
    sb.append("    totalNet: ").append(toIndentedString(totalNet)).append("\n");
    sb.append("    totalDeducted: ").append(toIndentedString(totalDeducted)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    totalGross: ").append(toIndentedString(totalGross)).append("\n");
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
