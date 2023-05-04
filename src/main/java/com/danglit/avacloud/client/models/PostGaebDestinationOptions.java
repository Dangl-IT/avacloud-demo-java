/*
 * AVACloud API 1.41.0
 * AVACloud API specification
 *
 * OpenAPI spec version: 1.41.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.danglit.avacloud.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.danglit.avacloud.client.models.DestinationGaebExchangePhase;
import com.danglit.avacloud.client.models.DestinationGaebType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Options for conversions to GAEB
 */
@ApiModel(description = "Options for conversions to GAEB")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-04T13:13:59.221Z")
public class PostGaebDestinationOptions {
  @SerializedName("destinationGaebType")
  private DestinationGaebType destinationGaebType = null;

  @SerializedName("targetExchangePhaseTransform")
  private DestinationGaebExchangePhase targetExchangePhaseTransform = null;

  @SerializedName("enforceStrictOfferPhaseLongTextOutput")
  private Boolean enforceStrictOfferPhaseLongTextOutput = null;

  @SerializedName("exportQuantityDetermination")
  private Boolean exportQuantityDetermination = null;

  @SerializedName("removeUnprintableCharactersFromTexts")
  private Boolean removeUnprintableCharactersFromTexts = null;

  @SerializedName("forceIncludeDescriptions")
  private Boolean forceIncludeDescriptions = null;

  @SerializedName("treatNullItemNumberSchemaAsInvalid")
  private Boolean treatNullItemNumberSchemaAsInvalid = null;

  public PostGaebDestinationOptions destinationGaebType(DestinationGaebType destinationGaebType) {
    this.destinationGaebType = destinationGaebType;
    return this;
  }

   /**
   * Defaults to GAEB XML V3.2
   * @return destinationGaebType
  **/
  @ApiModelProperty(required = true, value = "Defaults to GAEB XML V3.2")
  public DestinationGaebType getDestinationGaebType() {
    return destinationGaebType;
  }

  public void setDestinationGaebType(DestinationGaebType destinationGaebType) {
    this.destinationGaebType = destinationGaebType;
  }

  public PostGaebDestinationOptions targetExchangePhaseTransform(DestinationGaebExchangePhase targetExchangePhaseTransform) {
    this.targetExchangePhaseTransform = targetExchangePhaseTransform;
    return this;
  }

   /**
   * Defaults to none, meaning no transformation will be done
   * @return targetExchangePhaseTransform
  **/
  @ApiModelProperty(required = true, value = "Defaults to none, meaning no transformation will be done")
  public DestinationGaebExchangePhase getTargetExchangePhaseTransform() {
    return targetExchangePhaseTransform;
  }

  public void setTargetExchangePhaseTransform(DestinationGaebExchangePhase targetExchangePhaseTransform) {
    this.targetExchangePhaseTransform = targetExchangePhaseTransform;
  }

  public PostGaebDestinationOptions enforceStrictOfferPhaseLongTextOutput(Boolean enforceStrictOfferPhaseLongTextOutput) {
    this.enforceStrictOfferPhaseLongTextOutput = enforceStrictOfferPhaseLongTextOutput;
    return this;
  }

   /**
   * Defaults to false. If this is enabled, exported long texts to GAEB XML that use text additions will be strictly schema compliant. If this is not enabled, any text that is marked to contain a text addition is exported in full to ensure that incorrectly used text additions are still preserved in the export.
   * @return enforceStrictOfferPhaseLongTextOutput
  **/
  @ApiModelProperty(required = true, value = "Defaults to false. If this is enabled, exported long texts to GAEB XML that use text additions will be strictly schema compliant. If this is not enabled, any text that is marked to contain a text addition is exported in full to ensure that incorrectly used text additions are still preserved in the export.")
  public Boolean isEnforceStrictOfferPhaseLongTextOutput() {
    return enforceStrictOfferPhaseLongTextOutput;
  }

  public void setEnforceStrictOfferPhaseLongTextOutput(Boolean enforceStrictOfferPhaseLongTextOutput) {
    this.enforceStrictOfferPhaseLongTextOutput = enforceStrictOfferPhaseLongTextOutput;
  }

  public PostGaebDestinationOptions exportQuantityDetermination(Boolean exportQuantityDetermination) {
    this.exportQuantityDetermination = exportQuantityDetermination;
    return this;
  }

   /**
   * Defaults to false. If this is enabled, quantities are exported in detail in GAEB XML targets via the &#39;QtyDeterm&#39; (Quantity Determination, or Quantity Take Off) fields. To control this, you can set custom quantity calculations in the &#39;QuantityComponents&#39; property of positions. Please see the entry for &#39;Quantity Determination&#39; in the Dangl.AVA HowTo documentation section. Please be advised that enabling this might export data that was not intended to be exported, like internal quantity calculation details, depending on what data you put in the &#39;QuantityComponents&#39; property.
   * @return exportQuantityDetermination
  **/
  @ApiModelProperty(required = true, value = "Defaults to false. If this is enabled, quantities are exported in detail in GAEB XML targets via the 'QtyDeterm' (Quantity Determination, or Quantity Take Off) fields. To control this, you can set custom quantity calculations in the 'QuantityComponents' property of positions. Please see the entry for 'Quantity Determination' in the Dangl.AVA HowTo documentation section. Please be advised that enabling this might export data that was not intended to be exported, like internal quantity calculation details, depending on what data you put in the 'QuantityComponents' property.")
  public Boolean isExportQuantityDetermination() {
    return exportQuantityDetermination;
  }

  public void setExportQuantityDetermination(Boolean exportQuantityDetermination) {
    this.exportQuantityDetermination = exportQuantityDetermination;
  }

  public PostGaebDestinationOptions removeUnprintableCharactersFromTexts(Boolean removeUnprintableCharactersFromTexts) {
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

  public PostGaebDestinationOptions forceIncludeDescriptions(Boolean forceIncludeDescriptions) {
    this.forceIncludeDescriptions = forceIncludeDescriptions;
    return this;
  }

   /**
   * If this is enabled, all description elements like texts and execution descriptions will be output to the result. This is mostly only applicable to GAEB exports to phase 84 - Offer, which does typically not include descriptions.
   * @return forceIncludeDescriptions
  **/
  @ApiModelProperty(required = true, value = "If this is enabled, all description elements like texts and execution descriptions will be output to the result. This is mostly only applicable to GAEB exports to phase 84 - Offer, which does typically not include descriptions.")
  public Boolean isForceIncludeDescriptions() {
    return forceIncludeDescriptions;
  }

  public void setForceIncludeDescriptions(Boolean forceIncludeDescriptions) {
    this.forceIncludeDescriptions = forceIncludeDescriptions;
  }

  public PostGaebDestinationOptions treatNullItemNumberSchemaAsInvalid(Boolean treatNullItemNumberSchemaAsInvalid) {
    this.treatNullItemNumberSchemaAsInvalid = treatNullItemNumberSchemaAsInvalid;
    return this;
  }

   /**
   * When exporting to GAEB, an item number schema is usually required. AVACloud will try to fix invalid item number schemas. With this setting, you can also tell AVACloud to treat a null value as invalid. Otherwise, null schemas will simply be ignored and not lead to any schema being generated. It is recommended to enable this option, but it is disabled by default for compatibility reasons.
   * @return treatNullItemNumberSchemaAsInvalid
  **/
  @ApiModelProperty(required = true, value = "When exporting to GAEB, an item number schema is usually required. AVACloud will try to fix invalid item number schemas. With this setting, you can also tell AVACloud to treat a null value as invalid. Otherwise, null schemas will simply be ignored and not lead to any schema being generated. It is recommended to enable this option, but it is disabled by default for compatibility reasons.")
  public Boolean isTreatNullItemNumberSchemaAsInvalid() {
    return treatNullItemNumberSchemaAsInvalid;
  }

  public void setTreatNullItemNumberSchemaAsInvalid(Boolean treatNullItemNumberSchemaAsInvalid) {
    this.treatNullItemNumberSchemaAsInvalid = treatNullItemNumberSchemaAsInvalid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostGaebDestinationOptions postGaebDestinationOptions = (PostGaebDestinationOptions) o;
    return Objects.equals(this.destinationGaebType, postGaebDestinationOptions.destinationGaebType) &&
        Objects.equals(this.targetExchangePhaseTransform, postGaebDestinationOptions.targetExchangePhaseTransform) &&
        Objects.equals(this.enforceStrictOfferPhaseLongTextOutput, postGaebDestinationOptions.enforceStrictOfferPhaseLongTextOutput) &&
        Objects.equals(this.exportQuantityDetermination, postGaebDestinationOptions.exportQuantityDetermination) &&
        Objects.equals(this.removeUnprintableCharactersFromTexts, postGaebDestinationOptions.removeUnprintableCharactersFromTexts) &&
        Objects.equals(this.forceIncludeDescriptions, postGaebDestinationOptions.forceIncludeDescriptions) &&
        Objects.equals(this.treatNullItemNumberSchemaAsInvalid, postGaebDestinationOptions.treatNullItemNumberSchemaAsInvalid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationGaebType, targetExchangePhaseTransform, enforceStrictOfferPhaseLongTextOutput, exportQuantityDetermination, removeUnprintableCharactersFromTexts, forceIncludeDescriptions, treatNullItemNumberSchemaAsInvalid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostGaebDestinationOptions {\n");
    
    sb.append("    destinationGaebType: ").append(toIndentedString(destinationGaebType)).append("\n");
    sb.append("    targetExchangePhaseTransform: ").append(toIndentedString(targetExchangePhaseTransform)).append("\n");
    sb.append("    enforceStrictOfferPhaseLongTextOutput: ").append(toIndentedString(enforceStrictOfferPhaseLongTextOutput)).append("\n");
    sb.append("    exportQuantityDetermination: ").append(toIndentedString(exportQuantityDetermination)).append("\n");
    sb.append("    removeUnprintableCharactersFromTexts: ").append(toIndentedString(removeUnprintableCharactersFromTexts)).append("\n");
    sb.append("    forceIncludeDescriptions: ").append(toIndentedString(forceIncludeDescriptions)).append("\n");
    sb.append("    treatNullItemNumberSchemaAsInvalid: ").append(toIndentedString(treatNullItemNumberSchemaAsInvalid)).append("\n");
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
