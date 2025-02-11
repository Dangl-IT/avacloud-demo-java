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
import com.danglit.avacloud.client.models.CommerceInquiryTypeDto;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * This class represents properties used in commerce exchange scenarios
 */
@ApiModel(description = "This class represents properties used in commerce exchange scenarios")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-02-11T12:55:14.413Z")
public class ServiceSpecificationCommercePropertiesDto {
  @SerializedName("fixedPriceDate")
  private OffsetDateTime fixedPriceDate = null;

  @SerializedName("deliveryVoucherDate")
  private OffsetDateTime deliveryVoucherDate = null;

  @SerializedName("deliveryDate")
  private OffsetDateTime deliveryDate = null;

  @SerializedName("inquiryNumber")
  private String inquiryNumber = null;

  @SerializedName("offerNumber")
  private String offerNumber = null;

  @SerializedName("orderNumber")
  private String orderNumber = null;

  @SerializedName("orderConfirmationNumber")
  private String orderConfirmationNumber = null;

  @SerializedName("deliveryNumber")
  private String deliveryNumber = null;

  @SerializedName("customerReferenceNumber")
  private String customerReferenceNumber = null;

  @SerializedName("supplierReferenceNumber")
  private String supplierReferenceNumber = null;

  @SerializedName("shippingType")
  private String shippingType = null;

  @SerializedName("inquiryType")
  private CommerceInquiryTypeDto inquiryType = null;

  public ServiceSpecificationCommercePropertiesDto fixedPriceDate(OffsetDateTime fixedPriceDate) {
    this.fixedPriceDate = fixedPriceDate;
    return this;
  }

   /**
   * The date until the price is valid or fixed.
   * @return fixedPriceDate
  **/
  @ApiModelProperty(value = "The date until the price is valid or fixed.")
  public OffsetDateTime getFixedPriceDate() {
    return fixedPriceDate;
  }

  public void setFixedPriceDate(OffsetDateTime fixedPriceDate) {
    this.fixedPriceDate = fixedPriceDate;
  }

  public ServiceSpecificationCommercePropertiesDto deliveryVoucherDate(OffsetDateTime deliveryVoucherDate) {
    this.deliveryVoucherDate = deliveryVoucherDate;
    return this;
  }

   /**
   * The date of the delivery voucher note.
   * @return deliveryVoucherDate
  **/
  @ApiModelProperty(value = "The date of the delivery voucher note.")
  public OffsetDateTime getDeliveryVoucherDate() {
    return deliveryVoucherDate;
  }

  public void setDeliveryVoucherDate(OffsetDateTime deliveryVoucherDate) {
    this.deliveryVoucherDate = deliveryVoucherDate;
  }

  public ServiceSpecificationCommercePropertiesDto deliveryDate(OffsetDateTime deliveryDate) {
    this.deliveryDate = deliveryDate;
    return this;
  }

   /**
   * The actual date of delivery.
   * @return deliveryDate
  **/
  @ApiModelProperty(value = "The actual date of delivery.")
  public OffsetDateTime getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(OffsetDateTime deliveryDate) {
    this.deliveryDate = deliveryDate;
  }

  public ServiceSpecificationCommercePropertiesDto inquiryNumber(String inquiryNumber) {
    this.inquiryNumber = inquiryNumber;
    return this;
  }

   /**
   * The number of the inquiry, usually in a context of offer requests.
   * @return inquiryNumber
  **/
  @ApiModelProperty(value = "The number of the inquiry, usually in a context of offer requests.")
  public String getInquiryNumber() {
    return inquiryNumber;
  }

  public void setInquiryNumber(String inquiryNumber) {
    this.inquiryNumber = inquiryNumber;
  }

  public ServiceSpecificationCommercePropertiesDto offerNumber(String offerNumber) {
    this.offerNumber = offerNumber;
    return this;
  }

   /**
   * The number of the offer, usually in a context of an offer.
   * @return offerNumber
  **/
  @ApiModelProperty(value = "The number of the offer, usually in a context of an offer.")
  public String getOfferNumber() {
    return offerNumber;
  }

  public void setOfferNumber(String offerNumber) {
    this.offerNumber = offerNumber;
  }

  public ServiceSpecificationCommercePropertiesDto orderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * The order number, usually in the context of a grant or contract.
   * @return orderNumber
  **/
  @ApiModelProperty(value = "The order number, usually in the context of a grant or contract.")
  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  public ServiceSpecificationCommercePropertiesDto orderConfirmationNumber(String orderConfirmationNumber) {
    this.orderConfirmationNumber = orderConfirmationNumber;
    return this;
  }

   /**
   * The order confirmation number
   * @return orderConfirmationNumber
  **/
  @ApiModelProperty(value = "The order confirmation number")
  public String getOrderConfirmationNumber() {
    return orderConfirmationNumber;
  }

  public void setOrderConfirmationNumber(String orderConfirmationNumber) {
    this.orderConfirmationNumber = orderConfirmationNumber;
  }

  public ServiceSpecificationCommercePropertiesDto deliveryNumber(String deliveryNumber) {
    this.deliveryNumber = deliveryNumber;
    return this;
  }

   /**
   * The number of the delivery, e.g. on the delivery note voucher.
   * @return deliveryNumber
  **/
  @ApiModelProperty(value = "The number of the delivery, e.g. on the delivery note voucher.")
  public String getDeliveryNumber() {
    return deliveryNumber;
  }

  public void setDeliveryNumber(String deliveryNumber) {
    this.deliveryNumber = deliveryNumber;
  }

  public ServiceSpecificationCommercePropertiesDto customerReferenceNumber(String customerReferenceNumber) {
    this.customerReferenceNumber = customerReferenceNumber;
    return this;
  }

   /**
   * The reference number of the customer / buyer.
   * @return customerReferenceNumber
  **/
  @ApiModelProperty(value = "The reference number of the customer / buyer.")
  public String getCustomerReferenceNumber() {
    return customerReferenceNumber;
  }

  public void setCustomerReferenceNumber(String customerReferenceNumber) {
    this.customerReferenceNumber = customerReferenceNumber;
  }

  public ServiceSpecificationCommercePropertiesDto supplierReferenceNumber(String supplierReferenceNumber) {
    this.supplierReferenceNumber = supplierReferenceNumber;
    return this;
  }

   /**
   * The reference number of the supplier / bidder.
   * @return supplierReferenceNumber
  **/
  @ApiModelProperty(value = "The reference number of the supplier / bidder.")
  public String getSupplierReferenceNumber() {
    return supplierReferenceNumber;
  }

  public void setSupplierReferenceNumber(String supplierReferenceNumber) {
    this.supplierReferenceNumber = supplierReferenceNumber;
  }

  public ServiceSpecificationCommercePropertiesDto shippingType(String shippingType) {
    this.shippingType = shippingType;
    return this;
  }

   /**
   * The type of shippment.
   * @return shippingType
  **/
  @ApiModelProperty(value = "The type of shippment.")
  public String getShippingType() {
    return shippingType;
  }

  public void setShippingType(String shippingType) {
    this.shippingType = shippingType;
  }

  public ServiceSpecificationCommercePropertiesDto inquiryType(CommerceInquiryTypeDto inquiryType) {
    this.inquiryType = inquiryType;
    return this;
  }

   /**
   * The type of the price inquiry.
   * @return inquiryType
  **/
  @ApiModelProperty(required = true, value = "The type of the price inquiry.")
  public CommerceInquiryTypeDto getInquiryType() {
    return inquiryType;
  }

  public void setInquiryType(CommerceInquiryTypeDto inquiryType) {
    this.inquiryType = inquiryType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceSpecificationCommercePropertiesDto serviceSpecificationCommercePropertiesDto = (ServiceSpecificationCommercePropertiesDto) o;
    return Objects.equals(this.fixedPriceDate, serviceSpecificationCommercePropertiesDto.fixedPriceDate) &&
        Objects.equals(this.deliveryVoucherDate, serviceSpecificationCommercePropertiesDto.deliveryVoucherDate) &&
        Objects.equals(this.deliveryDate, serviceSpecificationCommercePropertiesDto.deliveryDate) &&
        Objects.equals(this.inquiryNumber, serviceSpecificationCommercePropertiesDto.inquiryNumber) &&
        Objects.equals(this.offerNumber, serviceSpecificationCommercePropertiesDto.offerNumber) &&
        Objects.equals(this.orderNumber, serviceSpecificationCommercePropertiesDto.orderNumber) &&
        Objects.equals(this.orderConfirmationNumber, serviceSpecificationCommercePropertiesDto.orderConfirmationNumber) &&
        Objects.equals(this.deliveryNumber, serviceSpecificationCommercePropertiesDto.deliveryNumber) &&
        Objects.equals(this.customerReferenceNumber, serviceSpecificationCommercePropertiesDto.customerReferenceNumber) &&
        Objects.equals(this.supplierReferenceNumber, serviceSpecificationCommercePropertiesDto.supplierReferenceNumber) &&
        Objects.equals(this.shippingType, serviceSpecificationCommercePropertiesDto.shippingType) &&
        Objects.equals(this.inquiryType, serviceSpecificationCommercePropertiesDto.inquiryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fixedPriceDate, deliveryVoucherDate, deliveryDate, inquiryNumber, offerNumber, orderNumber, orderConfirmationNumber, deliveryNumber, customerReferenceNumber, supplierReferenceNumber, shippingType, inquiryType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSpecificationCommercePropertiesDto {\n");
    
    sb.append("    fixedPriceDate: ").append(toIndentedString(fixedPriceDate)).append("\n");
    sb.append("    deliveryVoucherDate: ").append(toIndentedString(deliveryVoucherDate)).append("\n");
    sb.append("    deliveryDate: ").append(toIndentedString(deliveryDate)).append("\n");
    sb.append("    inquiryNumber: ").append(toIndentedString(inquiryNumber)).append("\n");
    sb.append("    offerNumber: ").append(toIndentedString(offerNumber)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    orderConfirmationNumber: ").append(toIndentedString(orderConfirmationNumber)).append("\n");
    sb.append("    deliveryNumber: ").append(toIndentedString(deliveryNumber)).append("\n");
    sb.append("    customerReferenceNumber: ").append(toIndentedString(customerReferenceNumber)).append("\n");
    sb.append("    supplierReferenceNumber: ").append(toIndentedString(supplierReferenceNumber)).append("\n");
    sb.append("    shippingType: ").append(toIndentedString(shippingType)).append("\n");
    sb.append("    inquiryType: ").append(toIndentedString(inquiryType)).append("\n");
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

