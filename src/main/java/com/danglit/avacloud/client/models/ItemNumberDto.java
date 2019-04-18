/*
 * AVACloud API 1.7.5
 * AVACloud API specification
 *
 * OpenAPI spec version: 1.7.5
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.danglit.avacloud.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.danglit.avacloud.client.models.ItemNumberSchemaDto;
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
 * This class represents as identifier of a certain service specification&#39;s element and is uniquely within the service specification.             
 */
@ApiModel(description = "This class represents as identifier of a certain service specification's element and is uniquely within the service specification.             ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-18T15:34:26.579Z")
public class ItemNumberDto {
  @SerializedName("id")
  private String id = null;

  @SerializedName("stringRepresentation")
  private String stringRepresentation = null;

  @SerializedName("isSchemaCompliant")
  private Boolean isSchemaCompliant = null;

  @SerializedName("itemNumberSchema")
  private ItemNumberSchemaDto itemNumberSchema = null;

  @SerializedName("identifiers")
  private List<String> identifiers = null;

  @SerializedName("isLot")
  private Boolean isLot = null;

  public ItemNumberDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Elements GUID identifier.             
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Elements GUID identifier.             ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ItemNumberDto stringRepresentation(String stringRepresentation) {
    this.stringRepresentation = stringRepresentation;
    return this;
  }

   /**
   * Will return this ItemNumber as point delimited string. Will not distinguish between upper- and lowercase and return an all-lowercase representation. Will consider first numbers, then characters, e.g. 1a is considered preceding aa.             
   * @return stringRepresentation
  **/
  @ApiModelProperty(value = "Will return this ItemNumber as point delimited string. Will not distinguish between upper- and lowercase and return an all-lowercase representation. Will consider first numbers, then characters, e.g. 1a is considered preceding aa.             ")
  public String getStringRepresentation() {
    return stringRepresentation;
  }

  public void setStringRepresentation(String stringRepresentation) {
    this.stringRepresentation = stringRepresentation;
  }

   /**
   * Indicates if the characters and the length of the Identifiers match the current ItemNumberSchema.             
   * @return isSchemaCompliant
  **/
  @ApiModelProperty(required = true, value = "Indicates if the characters and the length of the Identifiers match the current ItemNumberSchema.             ")
  public Boolean isIsSchemaCompliant() {
    return isSchemaCompliant;
  }

  public ItemNumberDto itemNumberSchema(ItemNumberSchemaDto itemNumberSchema) {
    this.itemNumberSchema = itemNumberSchema;
    return this;
  }

   /**
   * Used for representing and validating this ItemNumber.             
   * @return itemNumberSchema
  **/
  @ApiModelProperty(value = "Used for representing and validating this ItemNumber.             ")
  public ItemNumberSchemaDto getItemNumberSchema() {
    return itemNumberSchema;
  }

  public void setItemNumberSchema(ItemNumberSchemaDto itemNumberSchema) {
    this.itemNumberSchema = itemNumberSchema;
  }

  public ItemNumberDto identifiers(List<String> identifiers) {
    this.identifiers = identifiers;
    return this;
  }

  public ItemNumberDto addIdentifiersItem(String identifiersItem) {
    if (this.identifiers == null) {
      this.identifiers = new ArrayList<>();
    }
    this.identifiers.add(identifiersItem);
    return this;
  }

   /**
   * Collection of the single identifiers in this ItemNumber. P.e., \&quot;02.03.004\&quot; will have three elements \&quot;02\&quot;, \&quot;03\&quot;, and \&quot;004\&quot;. Since ReadOnlyObservableCollection&#x60;1 does have the event set to protected, it can be accessed like this: (itemNumber.Identifiers as INotifyCollectionChanged).CollectionChanged             
   * @return identifiers
  **/
  @ApiModelProperty(value = "Collection of the single identifiers in this ItemNumber. P.e., \"02.03.004\" will have three elements \"02\", \"03\", and \"004\". Since ReadOnlyObservableCollection`1 does have the event set to protected, it can be accessed like this: (itemNumber.Identifiers as INotifyCollectionChanged).CollectionChanged             ")
  public List<String> getIdentifiers() {
    return identifiers;
  }

  public void setIdentifiers(List<String> identifiers) {
    this.identifiers = identifiers;
  }

   /**
   * This indicates if this item number is at the lot level. Find out more about lots in the documentation.
   * @return isLot
  **/
  @ApiModelProperty(required = true, value = "This indicates if this item number is at the lot level. Find out more about lots in the documentation.")
  public Boolean isIsLot() {
    return isLot;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemNumberDto itemNumberDto = (ItemNumberDto) o;
    return Objects.equals(this.id, itemNumberDto.id) &&
        Objects.equals(this.stringRepresentation, itemNumberDto.stringRepresentation) &&
        Objects.equals(this.isSchemaCompliant, itemNumberDto.isSchemaCompliant) &&
        Objects.equals(this.itemNumberSchema, itemNumberDto.itemNumberSchema) &&
        Objects.equals(this.identifiers, itemNumberDto.identifiers) &&
        Objects.equals(this.isLot, itemNumberDto.isLot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, stringRepresentation, isSchemaCompliant, itemNumberSchema, identifiers, isLot);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemNumberDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    stringRepresentation: ").append(toIndentedString(stringRepresentation)).append("\n");
    sb.append("    isSchemaCompliant: ").append(toIndentedString(isSchemaCompliant)).append("\n");
    sb.append("    itemNumberSchema: ").append(toIndentedString(itemNumberSchema)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    isLot: ").append(toIndentedString(isLot)).append("\n");
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

