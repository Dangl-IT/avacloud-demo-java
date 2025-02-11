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
 * This class holds specialized information that is relevant to trade or commerce based data exchange scenarios, e.g. between customers, vendors, suppliers and distributors. It is used when exporting to GAEB XML 9x exchange phases.
 */
@ApiModel(description = "This class holds specialized information that is relevant to trade or commerce based data exchange scenarios, e.g. between customers, vendors, suppliers and distributors. It is used when exporting to GAEB XML 9x exchange phases.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-02-11T12:55:14.413Z")
public class CommercePropertiesDto {
  @SerializedName("articleNumber")
  private String articleNumber = null;

  @SerializedName("eanGtinArticleNumber")
  private String eanGtinArticleNumber = null;

  @SerializedName("ilnArticleNumber")
  private String ilnArticleNumber = null;

  @SerializedName("catalogueNumber")
  private String catalogueNumber = null;

  @SerializedName("catalogueArticleNumber")
  private String catalogueArticleNumber = null;

  @SerializedName("priceBasis")
  private BigDecimal priceBasis = null;

  @SerializedName("subPositionIdentifier")
  private String subPositionIdentifier = null;

  @SerializedName("customerBaseItemNumber")
  private String customerBaseItemNumber = null;

  public CommercePropertiesDto articleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
    return this;
  }

   /**
   * This maps to ArtNo in GAEB XML and represents an article number given by the supplier.
   * @return articleNumber
  **/
  @ApiModelProperty(value = "This maps to ArtNo in GAEB XML and represents an article number given by the supplier.")
  public String getArticleNumber() {
    return articleNumber;
  }

  public void setArticleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
  }

  public CommercePropertiesDto eanGtinArticleNumber(String eanGtinArticleNumber) {
    this.eanGtinArticleNumber = eanGtinArticleNumber;
    return this;
  }

   /**
   * This maps to EAN in GAEB XML and represents an GTIN (formerly EAN) article number.
   * @return eanGtinArticleNumber
  **/
  @ApiModelProperty(value = "This maps to EAN in GAEB XML and represents an GTIN (formerly EAN) article number.")
  public String getEanGtinArticleNumber() {
    return eanGtinArticleNumber;
  }

  public void setEanGtinArticleNumber(String eanGtinArticleNumber) {
    this.eanGtinArticleNumber = eanGtinArticleNumber;
  }

  public CommercePropertiesDto ilnArticleNumber(String ilnArticleNumber) {
    this.ilnArticleNumber = ilnArticleNumber;
    return this;
  }

   /**
   * This maps to ArtNoID in GAEB XML and represents an ILN article number.
   * @return ilnArticleNumber
  **/
  @ApiModelProperty(value = "This maps to ArtNoID in GAEB XML and represents an ILN article number.")
  public String getIlnArticleNumber() {
    return ilnArticleNumber;
  }

  public void setIlnArticleNumber(String ilnArticleNumber) {
    this.ilnArticleNumber = ilnArticleNumber;
  }

  public CommercePropertiesDto catalogueNumber(String catalogueNumber) {
    this.catalogueNumber = catalogueNumber;
    return this;
  }

   /**
   * This maps to CatalogNo in GAEB XML and represents an identifier of a specific catalogue. The referenced catalogue is usually a customer specific one, not related to CatalogueReferences.
   * @return catalogueNumber
  **/
  @ApiModelProperty(value = "This maps to CatalogNo in GAEB XML and represents an identifier of a specific catalogue. The referenced catalogue is usually a customer specific one, not related to CatalogueReferences.")
  public String getCatalogueNumber() {
    return catalogueNumber;
  }

  public void setCatalogueNumber(String catalogueNumber) {
    this.catalogueNumber = catalogueNumber;
  }

  public CommercePropertiesDto catalogueArticleNumber(String catalogueArticleNumber) {
    this.catalogueArticleNumber = catalogueArticleNumber;
    return this;
  }

   /**
   * This maps to CatalogArtNo in GAEB XML and represents a key that maps to an entry in a specific catalogue. The referenced catalogue is usually a customer specific one, not related to CatalogueReferences.
   * @return catalogueArticleNumber
  **/
  @ApiModelProperty(value = "This maps to CatalogArtNo in GAEB XML and represents a key that maps to an entry in a specific catalogue. The referenced catalogue is usually a customer specific one, not related to CatalogueReferences.")
  public String getCatalogueArticleNumber() {
    return catalogueArticleNumber;
  }

  public void setCatalogueArticleNumber(String catalogueArticleNumber) {
    this.catalogueArticleNumber = catalogueArticleNumber;
  }

  public CommercePropertiesDto priceBasis(BigDecimal priceBasis) {
    this.priceBasis = priceBasis;
    return this;
  }

   /**
   * This optional property can be used to indicate the basis for prices for a single position. Price basis means that the price is given per unit of the basis, e.g. per a pack of five when this property is set to &#39;5&#39;.
   * @return priceBasis
  **/
  @ApiModelProperty(value = "This optional property can be used to indicate the basis for prices for a single position. Price basis means that the price is given per unit of the basis, e.g. per a pack of five when this property is set to '5'.")
  public BigDecimal getPriceBasis() {
    return priceBasis;
  }

  public void setPriceBasis(BigDecimal priceBasis) {
    this.priceBasis = priceBasis;
  }

  public CommercePropertiesDto subPositionIdentifier(String subPositionIdentifier) {
    this.subPositionIdentifier = subPositionIdentifier;
    return this;
  }

   /**
   * This optional property can be used to indicate a sub position identifier specific for the commerce exchange
   * @return subPositionIdentifier
  **/
  @ApiModelProperty(value = "This optional property can be used to indicate a sub position identifier specific for the commerce exchange")
  public String getSubPositionIdentifier() {
    return subPositionIdentifier;
  }

  public void setSubPositionIdentifier(String subPositionIdentifier) {
    this.subPositionIdentifier = subPositionIdentifier;
  }

  public CommercePropertiesDto customerBaseItemNumber(String customerBaseItemNumber) {
    this.customerBaseItemNumber = customerBaseItemNumber;
    return this;
  }

   /**
   * In a commerce exchange, this property is usually used to reference the base item number of an underlying phase 83 exchange file
   * @return customerBaseItemNumber
  **/
  @ApiModelProperty(value = "In a commerce exchange, this property is usually used to reference the base item number of an underlying phase 83 exchange file")
  public String getCustomerBaseItemNumber() {
    return customerBaseItemNumber;
  }

  public void setCustomerBaseItemNumber(String customerBaseItemNumber) {
    this.customerBaseItemNumber = customerBaseItemNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommercePropertiesDto commercePropertiesDto = (CommercePropertiesDto) o;
    return Objects.equals(this.articleNumber, commercePropertiesDto.articleNumber) &&
        Objects.equals(this.eanGtinArticleNumber, commercePropertiesDto.eanGtinArticleNumber) &&
        Objects.equals(this.ilnArticleNumber, commercePropertiesDto.ilnArticleNumber) &&
        Objects.equals(this.catalogueNumber, commercePropertiesDto.catalogueNumber) &&
        Objects.equals(this.catalogueArticleNumber, commercePropertiesDto.catalogueArticleNumber) &&
        Objects.equals(this.priceBasis, commercePropertiesDto.priceBasis) &&
        Objects.equals(this.subPositionIdentifier, commercePropertiesDto.subPositionIdentifier) &&
        Objects.equals(this.customerBaseItemNumber, commercePropertiesDto.customerBaseItemNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(articleNumber, eanGtinArticleNumber, ilnArticleNumber, catalogueNumber, catalogueArticleNumber, priceBasis, subPositionIdentifier, customerBaseItemNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommercePropertiesDto {\n");
    
    sb.append("    articleNumber: ").append(toIndentedString(articleNumber)).append("\n");
    sb.append("    eanGtinArticleNumber: ").append(toIndentedString(eanGtinArticleNumber)).append("\n");
    sb.append("    ilnArticleNumber: ").append(toIndentedString(ilnArticleNumber)).append("\n");
    sb.append("    catalogueNumber: ").append(toIndentedString(catalogueNumber)).append("\n");
    sb.append("    catalogueArticleNumber: ").append(toIndentedString(catalogueArticleNumber)).append("\n");
    sb.append("    priceBasis: ").append(toIndentedString(priceBasis)).append("\n");
    sb.append("    subPositionIdentifier: ").append(toIndentedString(subPositionIdentifier)).append("\n");
    sb.append("    customerBaseItemNumber: ").append(toIndentedString(customerBaseItemNumber)).append("\n");
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

