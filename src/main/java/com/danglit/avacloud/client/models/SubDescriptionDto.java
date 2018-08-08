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
import com.danglit.avacloud.client.models.AdditionTypeDto;
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
 * SubDescriptionDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-08T14:34:08.693Z")
public class SubDescriptionDto {
  @SerializedName("id")
  private String id = null;

  @SerializedName("quantity")
  private BigDecimal quantity = null;

  @SerializedName("quantityComponents")
  private List<CalculationDto> quantityComponents = null;

  @SerializedName("amountToBeEnteredByBidder")
  private Boolean amountToBeEnteredByBidder = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("shortText")
  private String shortText = null;

  @SerializedName("longText")
  private String longText = null;

  @SerializedName("htmlLongText")
  private String htmlLongText = null;

  @SerializedName("additionType")
  private AdditionTypeDto additionType = null;

  public SubDescriptionDto id(String id) {
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

  public SubDescriptionDto quantity(BigDecimal quantity) {
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

  public SubDescriptionDto quantityComponents(List<CalculationDto> quantityComponents) {
    this.quantityComponents = quantityComponents;
    return this;
  }

  public SubDescriptionDto addQuantityComponentsItem(CalculationDto quantityComponentsItem) {
    if (this.quantityComponents == null) {
      this.quantityComponents = new ArrayList<>();
    }
    this.quantityComponents.add(quantityComponentsItem);
    return this;
  }

   /**
   * Get quantityComponents
   * @return quantityComponents
  **/
  @ApiModelProperty(value = "")
  public List<CalculationDto> getQuantityComponents() {
    return quantityComponents;
  }

  public void setQuantityComponents(List<CalculationDto> quantityComponents) {
    this.quantityComponents = quantityComponents;
  }

  public SubDescriptionDto amountToBeEnteredByBidder(Boolean amountToBeEnteredByBidder) {
    this.amountToBeEnteredByBidder = amountToBeEnteredByBidder;
    return this;
  }

   /**
   * Get amountToBeEnteredByBidder
   * @return amountToBeEnteredByBidder
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isAmountToBeEnteredByBidder() {
    return amountToBeEnteredByBidder;
  }

  public void setAmountToBeEnteredByBidder(Boolean amountToBeEnteredByBidder) {
    this.amountToBeEnteredByBidder = amountToBeEnteredByBidder;
  }

  public SubDescriptionDto identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @ApiModelProperty(value = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public SubDescriptionDto shortText(String shortText) {
    this.shortText = shortText;
    return this;
  }

   /**
   * Get shortText
   * @return shortText
  **/
  @ApiModelProperty(value = "")
  public String getShortText() {
    return shortText;
  }

  public void setShortText(String shortText) {
    this.shortText = shortText;
  }

  public SubDescriptionDto longText(String longText) {
    this.longText = longText;
    return this;
  }

   /**
   * Get longText
   * @return longText
  **/
  @ApiModelProperty(value = "")
  public String getLongText() {
    return longText;
  }

  public void setLongText(String longText) {
    this.longText = longText;
  }

  public SubDescriptionDto htmlLongText(String htmlLongText) {
    this.htmlLongText = htmlLongText;
    return this;
  }

   /**
   * Get htmlLongText
   * @return htmlLongText
  **/
  @ApiModelProperty(value = "")
  public String getHtmlLongText() {
    return htmlLongText;
  }

  public void setHtmlLongText(String htmlLongText) {
    this.htmlLongText = htmlLongText;
  }

  public SubDescriptionDto additionType(AdditionTypeDto additionType) {
    this.additionType = additionType;
    return this;
  }

   /**
   * Get additionType
   * @return additionType
  **/
  @ApiModelProperty(required = true, value = "")
  public AdditionTypeDto getAdditionType() {
    return additionType;
  }

  public void setAdditionType(AdditionTypeDto additionType) {
    this.additionType = additionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubDescriptionDto subDescriptionDto = (SubDescriptionDto) o;
    return Objects.equals(this.id, subDescriptionDto.id) &&
        Objects.equals(this.quantity, subDescriptionDto.quantity) &&
        Objects.equals(this.quantityComponents, subDescriptionDto.quantityComponents) &&
        Objects.equals(this.amountToBeEnteredByBidder, subDescriptionDto.amountToBeEnteredByBidder) &&
        Objects.equals(this.identifier, subDescriptionDto.identifier) &&
        Objects.equals(this.shortText, subDescriptionDto.shortText) &&
        Objects.equals(this.longText, subDescriptionDto.longText) &&
        Objects.equals(this.htmlLongText, subDescriptionDto.htmlLongText) &&
        Objects.equals(this.additionType, subDescriptionDto.additionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity, quantityComponents, amountToBeEnteredByBidder, identifier, shortText, longText, htmlLongText, additionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubDescriptionDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    quantityComponents: ").append(toIndentedString(quantityComponents)).append("\n");
    sb.append("    amountToBeEnteredByBidder: ").append(toIndentedString(amountToBeEnteredByBidder)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    shortText: ").append(toIndentedString(shortText)).append("\n");
    sb.append("    longText: ").append(toIndentedString(longText)).append("\n");
    sb.append("    htmlLongText: ").append(toIndentedString(htmlLongText)).append("\n");
    sb.append("    additionType: ").append(toIndentedString(additionType)).append("\n");
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

