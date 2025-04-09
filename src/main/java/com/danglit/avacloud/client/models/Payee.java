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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents a payee, meaning someone that receives the payment
 */
@ApiModel(description = "Represents a payee, meaning someone that receives the payment")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-09T18:36:39.750Z")
public class Payee {
  @SerializedName("name")
  private String name = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("legalRegistrationIdentifier")
  private String legalRegistrationIdentifier = null;

  public Payee name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the payee
   * @return name
  **/
  @ApiModelProperty(value = "The name of the payee")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Payee identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * The identifier of the payee
   * @return identifier
  **/
  @ApiModelProperty(value = "The identifier of the payee")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Payee legalRegistrationIdentifier(String legalRegistrationIdentifier) {
    this.legalRegistrationIdentifier = legalRegistrationIdentifier;
    return this;
  }

   /**
   * A registered identifier for the payee, e.g. a VAT ID or Tax ID
   * @return legalRegistrationIdentifier
  **/
  @ApiModelProperty(value = "A registered identifier for the payee, e.g. a VAT ID or Tax ID")
  public String getLegalRegistrationIdentifier() {
    return legalRegistrationIdentifier;
  }

  public void setLegalRegistrationIdentifier(String legalRegistrationIdentifier) {
    this.legalRegistrationIdentifier = legalRegistrationIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payee payee = (Payee) o;
    return Objects.equals(this.name, payee.name) &&
        Objects.equals(this.identifier, payee.identifier) &&
        Objects.equals(this.legalRegistrationIdentifier, payee.legalRegistrationIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, identifier, legalRegistrationIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payee {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    legalRegistrationIdentifier: ").append(toIndentedString(legalRegistrationIdentifier)).append("\n");
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

