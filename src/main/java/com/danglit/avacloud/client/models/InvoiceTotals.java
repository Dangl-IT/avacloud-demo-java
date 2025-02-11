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
 * Totals for the invoice
 */
@ApiModel(description = "Totals for the invoice")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-02-11T12:55:14.413Z")
public class InvoiceTotals {
  @SerializedName("totalNet")
  private BigDecimal totalNet = null;

  @SerializedName("totalAllowances")
  private BigDecimal totalAllowances = null;

  @SerializedName("totalCharges")
  private BigDecimal totalCharges = null;

  @SerializedName("totalAfterDeductions")
  private BigDecimal totalAfterDeductions = null;

  @SerializedName("totalVatAmount")
  private BigDecimal totalVatAmount = null;

  @SerializedName("totalGross")
  private BigDecimal totalGross = null;

  @SerializedName("alreadyPaidTotal")
  private BigDecimal alreadyPaidTotal = null;

  @SerializedName("payableRoundingAmount")
  private BigDecimal payableRoundingAmount = null;

  @SerializedName("totalToBePaid")
  private BigDecimal totalToBePaid = null;

  public InvoiceTotals totalNet(BigDecimal totalNet) {
    this.totalNet = totalNet;
    return this;
  }

   /**
   * Sum of all invoice items in net. BT-106 in XRechnung.
   * @return totalNet
  **/
  @ApiModelProperty(value = "Sum of all invoice items in net. BT-106 in XRechnung.")
  public BigDecimal getTotalNet() {
    return totalNet;
  }

  public void setTotalNet(BigDecimal totalNet) {
    this.totalNet = totalNet;
  }

  public InvoiceTotals totalAllowances(BigDecimal totalAllowances) {
    this.totalAllowances = totalAllowances;
    return this;
  }

   /**
   * This is the sum of all allowances (e.g. deductions or withheld tax) in the invoice BT-107 in XRechnung.
   * @return totalAllowances
  **/
  @ApiModelProperty(value = "This is the sum of all allowances (e.g. deductions or withheld tax) in the invoice BT-107 in XRechnung.")
  public BigDecimal getTotalAllowances() {
    return totalAllowances;
  }

  public void setTotalAllowances(BigDecimal totalAllowances) {
    this.totalAllowances = totalAllowances;
  }

  public InvoiceTotals totalCharges(BigDecimal totalCharges) {
    this.totalCharges = totalCharges;
    return this;
  }

   /**
   * This is the sum of all charges in the invoice, except VAT. For example, late fees or surcharges. BT-108 in XRechnung.
   * @return totalCharges
  **/
  @ApiModelProperty(value = "This is the sum of all charges in the invoice, except VAT. For example, late fees or surcharges. BT-108 in XRechnung.")
  public BigDecimal getTotalCharges() {
    return totalCharges;
  }

  public void setTotalCharges(BigDecimal totalCharges) {
    this.totalCharges = totalCharges;
  }

  public InvoiceTotals totalAfterDeductions(BigDecimal totalAfterDeductions) {
    this.totalAfterDeductions = totalAfterDeductions;
    return this;
  }

   /**
   * This is the total net value of the invoice after applied allowances and charges, meaning the actual net sum to be paid. BT-109 in XRechnung.
   * @return totalAfterDeductions
  **/
  @ApiModelProperty(value = "This is the total net value of the invoice after applied allowances and charges, meaning the actual net sum to be paid. BT-109 in XRechnung.")
  public BigDecimal getTotalAfterDeductions() {
    return totalAfterDeductions;
  }

  public void setTotalAfterDeductions(BigDecimal totalAfterDeductions) {
    this.totalAfterDeductions = totalAfterDeductions;
  }

  public InvoiceTotals totalVatAmount(BigDecimal totalVatAmount) {
    this.totalVatAmount = totalVatAmount;
    return this;
  }

   /**
   * The total amount of VAT in the invoice. BT-110 in XRechnung.
   * @return totalVatAmount
  **/
  @ApiModelProperty(value = "The total amount of VAT in the invoice. BT-110 in XRechnung.")
  public BigDecimal getTotalVatAmount() {
    return totalVatAmount;
  }

  public void setTotalVatAmount(BigDecimal totalVatAmount) {
    this.totalVatAmount = totalVatAmount;
  }

  public InvoiceTotals totalGross(BigDecimal totalGross) {
    this.totalGross = totalGross;
    return this;
  }

   /**
   * The total gross amount of the invoice, including all taxes and deductions. BT-112 in XRechnung.
   * @return totalGross
  **/
  @ApiModelProperty(value = "The total gross amount of the invoice, including all taxes and deductions. BT-112 in XRechnung.")
  public BigDecimal getTotalGross() {
    return totalGross;
  }

  public void setTotalGross(BigDecimal totalGross) {
    this.totalGross = totalGross;
  }

  public InvoiceTotals alreadyPaidTotal(BigDecimal alreadyPaidTotal) {
    this.alreadyPaidTotal = alreadyPaidTotal;
    return this;
  }

   /**
   * The total amount that has already been paid for this invoice, e.g. used when previous invoice sums are included here that have already been paid. BT-113 in XRechnung.
   * @return alreadyPaidTotal
  **/
  @ApiModelProperty(value = "The total amount that has already been paid for this invoice, e.g. used when previous invoice sums are included here that have already been paid. BT-113 in XRechnung.")
  public BigDecimal getAlreadyPaidTotal() {
    return alreadyPaidTotal;
  }

  public void setAlreadyPaidTotal(BigDecimal alreadyPaidTotal) {
    this.alreadyPaidTotal = alreadyPaidTotal;
  }

  public InvoiceTotals payableRoundingAmount(BigDecimal payableRoundingAmount) {
    this.payableRoundingAmount = payableRoundingAmount;
    return this;
  }

   /**
   * If this is given, this specifies if any rounding amount is applied to the invoice, before calculating the TotalToBePaid value. BT-114 in XRechnung.
   * @return payableRoundingAmount
  **/
  @ApiModelProperty(value = "If this is given, this specifies if any rounding amount is applied to the invoice, before calculating the TotalToBePaid value. BT-114 in XRechnung.")
  public BigDecimal getPayableRoundingAmount() {
    return payableRoundingAmount;
  }

  public void setPayableRoundingAmount(BigDecimal payableRoundingAmount) {
    this.payableRoundingAmount = payableRoundingAmount;
  }

  public InvoiceTotals totalToBePaid(BigDecimal totalToBePaid) {
    this.totalToBePaid = totalToBePaid;
    return this;
  }

   /**
   * The sum that needs to be paid for this invoice. This is the total gross amount minus the already paid amount. BT-115 in XRechnung.
   * @return totalToBePaid
  **/
  @ApiModelProperty(value = "The sum that needs to be paid for this invoice. This is the total gross amount minus the already paid amount. BT-115 in XRechnung.")
  public BigDecimal getTotalToBePaid() {
    return totalToBePaid;
  }

  public void setTotalToBePaid(BigDecimal totalToBePaid) {
    this.totalToBePaid = totalToBePaid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceTotals invoiceTotals = (InvoiceTotals) o;
    return Objects.equals(this.totalNet, invoiceTotals.totalNet) &&
        Objects.equals(this.totalAllowances, invoiceTotals.totalAllowances) &&
        Objects.equals(this.totalCharges, invoiceTotals.totalCharges) &&
        Objects.equals(this.totalAfterDeductions, invoiceTotals.totalAfterDeductions) &&
        Objects.equals(this.totalVatAmount, invoiceTotals.totalVatAmount) &&
        Objects.equals(this.totalGross, invoiceTotals.totalGross) &&
        Objects.equals(this.alreadyPaidTotal, invoiceTotals.alreadyPaidTotal) &&
        Objects.equals(this.payableRoundingAmount, invoiceTotals.payableRoundingAmount) &&
        Objects.equals(this.totalToBePaid, invoiceTotals.totalToBePaid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNet, totalAllowances, totalCharges, totalAfterDeductions, totalVatAmount, totalGross, alreadyPaidTotal, payableRoundingAmount, totalToBePaid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceTotals {\n");
    
    sb.append("    totalNet: ").append(toIndentedString(totalNet)).append("\n");
    sb.append("    totalAllowances: ").append(toIndentedString(totalAllowances)).append("\n");
    sb.append("    totalCharges: ").append(toIndentedString(totalCharges)).append("\n");
    sb.append("    totalAfterDeductions: ").append(toIndentedString(totalAfterDeductions)).append("\n");
    sb.append("    totalVatAmount: ").append(toIndentedString(totalVatAmount)).append("\n");
    sb.append("    totalGross: ").append(toIndentedString(totalGross)).append("\n");
    sb.append("    alreadyPaidTotal: ").append(toIndentedString(alreadyPaidTotal)).append("\n");
    sb.append("    payableRoundingAmount: ").append(toIndentedString(payableRoundingAmount)).append("\n");
    sb.append("    totalToBePaid: ").append(toIndentedString(totalToBePaid)).append("\n");
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

