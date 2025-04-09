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
import com.danglit.avacloud.client.models.DestinationOenormType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Options for conversions to Oenorm
 */
@ApiModel(description = "Options for conversions to Oenorm")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-09T18:36:39.750Z")
public class PostOenormDestinationOptions {
  @SerializedName("destinationOenormType")
  private DestinationOenormType destinationOenormType = null;

  @SerializedName("tryRepairProjectStructure")
  private Boolean tryRepairProjectStructure = null;

  @SerializedName("skipTryEnforceSchemaCompliantXmlOutput")
  private Boolean skipTryEnforceSchemaCompliantXmlOutput = null;

  @SerializedName("removeUnprintableCharactersFromTexts")
  private Boolean removeUnprintableCharactersFromTexts = null;

  public PostOenormDestinationOptions destinationOenormType(DestinationOenormType destinationOenormType) {
    this.destinationOenormType = destinationOenormType;
    return this;
  }

   /**
   * Defaults to Lv2015
   * @return destinationOenormType
  **/
  @ApiModelProperty(required = true, value = "Defaults to Lv2015")
  public DestinationOenormType getDestinationOenormType() {
    return destinationOenormType;
  }

  public void setDestinationOenormType(DestinationOenormType destinationOenormType) {
    this.destinationOenormType = destinationOenormType;
  }

  public PostOenormDestinationOptions tryRepairProjectStructure(Boolean tryRepairProjectStructure) {
    this.tryRepairProjectStructure = tryRepairProjectStructure;
    return this;
  }

   /**
   * Defaults to false. If this is enabled, the converter will try to ensure that the project structure can be mapped to Oenorm. It might introduce additional group levels to ensure a compatible target
   * @return tryRepairProjectStructure
  **/
  @ApiModelProperty(required = true, value = "Defaults to false. If this is enabled, the converter will try to ensure that the project structure can be mapped to Oenorm. It might introduce additional group levels to ensure a compatible target")
  public Boolean isTryRepairProjectStructure() {
    return tryRepairProjectStructure;
  }

  public void setTryRepairProjectStructure(Boolean tryRepairProjectStructure) {
    this.tryRepairProjectStructure = tryRepairProjectStructure;
  }

  public PostOenormDestinationOptions skipTryEnforceSchemaCompliantXmlOutput(Boolean skipTryEnforceSchemaCompliantXmlOutput) {
    this.skipTryEnforceSchemaCompliantXmlOutput = skipTryEnforceSchemaCompliantXmlOutput;
    return this;
  }

   /**
   * If this option is enabled, AVACloud will not attempt to force a schema-compliant Xml output for ÖNorm targets that are Xml based. By default, AVACloud will try to add required fields, even if no data is present, with sensible defaults. This behavior can be disabled with this option.
   * @return skipTryEnforceSchemaCompliantXmlOutput
  **/
  @ApiModelProperty(required = true, value = "If this option is enabled, AVACloud will not attempt to force a schema-compliant Xml output for ÖNorm targets that are Xml based. By default, AVACloud will try to add required fields, even if no data is present, with sensible defaults. This behavior can be disabled with this option.")
  public Boolean isSkipTryEnforceSchemaCompliantXmlOutput() {
    return skipTryEnforceSchemaCompliantXmlOutput;
  }

  public void setSkipTryEnforceSchemaCompliantXmlOutput(Boolean skipTryEnforceSchemaCompliantXmlOutput) {
    this.skipTryEnforceSchemaCompliantXmlOutput = skipTryEnforceSchemaCompliantXmlOutput;
  }

  public PostOenormDestinationOptions removeUnprintableCharactersFromTexts(Boolean removeUnprintableCharactersFromTexts) {
    this.removeUnprintableCharactersFromTexts = removeUnprintableCharactersFromTexts;
    return this;
  }

   /**
   * If this is enabled, unprintable characters are removed from text elements. Otherwise, the conversion might fail in case some text content contains characters that are not allowed in XML output formats. Defaults to true.
   * @return removeUnprintableCharactersFromTexts
  **/
  @ApiModelProperty(required = true, value = "If this is enabled, unprintable characters are removed from text elements. Otherwise, the conversion might fail in case some text content contains characters that are not allowed in XML output formats. Defaults to true.")
  public Boolean isRemoveUnprintableCharactersFromTexts() {
    return removeUnprintableCharactersFromTexts;
  }

  public void setRemoveUnprintableCharactersFromTexts(Boolean removeUnprintableCharactersFromTexts) {
    this.removeUnprintableCharactersFromTexts = removeUnprintableCharactersFromTexts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostOenormDestinationOptions postOenormDestinationOptions = (PostOenormDestinationOptions) o;
    return Objects.equals(this.destinationOenormType, postOenormDestinationOptions.destinationOenormType) &&
        Objects.equals(this.tryRepairProjectStructure, postOenormDestinationOptions.tryRepairProjectStructure) &&
        Objects.equals(this.skipTryEnforceSchemaCompliantXmlOutput, postOenormDestinationOptions.skipTryEnforceSchemaCompliantXmlOutput) &&
        Objects.equals(this.removeUnprintableCharactersFromTexts, postOenormDestinationOptions.removeUnprintableCharactersFromTexts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationOenormType, tryRepairProjectStructure, skipTryEnforceSchemaCompliantXmlOutput, removeUnprintableCharactersFromTexts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostOenormDestinationOptions {\n");
    
    sb.append("    destinationOenormType: ").append(toIndentedString(destinationOenormType)).append("\n");
    sb.append("    tryRepairProjectStructure: ").append(toIndentedString(tryRepairProjectStructure)).append("\n");
    sb.append("    skipTryEnforceSchemaCompliantXmlOutput: ").append(toIndentedString(skipTryEnforceSchemaCompliantXmlOutput)).append("\n");
    sb.append("    removeUnprintableCharactersFromTexts: ").append(toIndentedString(removeUnprintableCharactersFromTexts)).append("\n");
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

