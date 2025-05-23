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
import com.danglit.avacloud.client.models.ExchangePhaseDto;
import com.danglit.avacloud.client.models.PostAvaSourceOptions;
import com.danglit.avacloud.client.models.PostGaebDestinationOptions;
import com.danglit.avacloud.client.models.PostOenormDestinationOptions;
import com.danglit.avacloud.client.models.ProjectDto;
import com.danglit.avacloud.client.models.ValidationType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Options for validating an AVA project
 */
@ApiModel(description = "Options for validating an AVA project")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-09T18:36:39.750Z")
public class PostAvaProjectValidationSourceOptions {
  @SerializedName("avaProject")
  private ProjectDto avaProject = null;

  @SerializedName("serviceSpecificationIndex")
  private Integer serviceSpecificationIndex = null;

  @SerializedName("validationType")
  private ValidationType validationType = null;

  @SerializedName("exchangePhase")
  private ExchangePhaseDto exchangePhase = null;

  @SerializedName("avaSourceOptions")
  private PostAvaSourceOptions avaSourceOptions = null;

  @SerializedName("oenormDestinationOptions")
  private PostOenormDestinationOptions oenormDestinationOptions = null;

  @SerializedName("gaebDestinationOptions")
  private PostGaebDestinationOptions gaebDestinationOptions = null;

  public PostAvaProjectValidationSourceOptions avaProject(ProjectDto avaProject) {
    this.avaProject = avaProject;
    return this;
  }

   /**
   * The project that should be validated
   * @return avaProject
  **/
  @ApiModelProperty(required = true, value = "The project that should be validated")
  public ProjectDto getAvaProject() {
    return avaProject;
  }

  public void setAvaProject(ProjectDto avaProject) {
    this.avaProject = avaProject;
  }

  public PostAvaProjectValidationSourceOptions serviceSpecificationIndex(Integer serviceSpecificationIndex) {
    this.serviceSpecificationIndex = serviceSpecificationIndex;
    return this;
  }

   /**
   * The index of the ServiceSpecification that should be validated. If not given, will default to the first one in the project.
   * @return serviceSpecificationIndex
  **/
  @ApiModelProperty(value = "The index of the ServiceSpecification that should be validated. If not given, will default to the first one in the project.")
  public Integer getServiceSpecificationIndex() {
    return serviceSpecificationIndex;
  }

  public void setServiceSpecificationIndex(Integer serviceSpecificationIndex) {
    this.serviceSpecificationIndex = serviceSpecificationIndex;
  }

  public PostAvaProjectValidationSourceOptions validationType(ValidationType validationType) {
    this.validationType = validationType;
    return this;
  }

   /**
   * This can optionally be specified to simulate a conversion to a specific target.
   * @return validationType
  **/
  @ApiModelProperty(required = true, value = "This can optionally be specified to simulate a conversion to a specific target.")
  public ValidationType getValidationType() {
    return validationType;
  }

  public void setValidationType(ValidationType validationType) {
    this.validationType = validationType;
  }

  public PostAvaProjectValidationSourceOptions exchangePhase(ExchangePhaseDto exchangePhase) {
    this.exchangePhase = exchangePhase;
    return this;
  }

   /**
   * This can optionally be supplied to test for a specific exchange phase. For example, missing prices will only trigger errors in some specific exchange phases. Please note: If a conversion to a specific format, e.g. GAEB or ÖNorm, is given, this parameter is not applied to the internal conversion. The converter options must be set in the appropriate properties as well.
   * @return exchangePhase
  **/
  @ApiModelProperty(value = "This can optionally be supplied to test for a specific exchange phase. For example, missing prices will only trigger errors in some specific exchange phases. Please note: If a conversion to a specific format, e.g. GAEB or ÖNorm, is given, this parameter is not applied to the internal conversion. The converter options must be set in the appropriate properties as well.")
  public ExchangePhaseDto getExchangePhase() {
    return exchangePhase;
  }

  public void setExchangePhase(ExchangePhaseDto exchangePhase) {
    this.exchangePhase = exchangePhase;
  }

  public PostAvaProjectValidationSourceOptions avaSourceOptions(PostAvaSourceOptions avaSourceOptions) {
    this.avaSourceOptions = avaSourceOptions;
    return this;
  }

   /**
   * Options for importing the AVA project
   * @return avaSourceOptions
  **/
  @ApiModelProperty(value = "Options for importing the AVA project")
  public PostAvaSourceOptions getAvaSourceOptions() {
    return avaSourceOptions;
  }

  public void setAvaSourceOptions(PostAvaSourceOptions avaSourceOptions) {
    this.avaSourceOptions = avaSourceOptions;
  }

  public PostAvaProjectValidationSourceOptions oenormDestinationOptions(PostOenormDestinationOptions oenormDestinationOptions) {
    this.oenormDestinationOptions = oenormDestinationOptions;
    return this;
  }

   /**
   * Options for conversion to Oenorm. Should be given if ValidationType is set to Oenorm.
   * @return oenormDestinationOptions
  **/
  @ApiModelProperty(value = "Options for conversion to Oenorm. Should be given if ValidationType is set to Oenorm.")
  public PostOenormDestinationOptions getOenormDestinationOptions() {
    return oenormDestinationOptions;
  }

  public void setOenormDestinationOptions(PostOenormDestinationOptions oenormDestinationOptions) {
    this.oenormDestinationOptions = oenormDestinationOptions;
  }

  public PostAvaProjectValidationSourceOptions gaebDestinationOptions(PostGaebDestinationOptions gaebDestinationOptions) {
    this.gaebDestinationOptions = gaebDestinationOptions;
    return this;
  }

   /**
   * Options for conversion to GAEB. Should be given if ValidationType is set to GAEB.
   * @return gaebDestinationOptions
  **/
  @ApiModelProperty(value = "Options for conversion to GAEB. Should be given if ValidationType is set to GAEB.")
  public PostGaebDestinationOptions getGaebDestinationOptions() {
    return gaebDestinationOptions;
  }

  public void setGaebDestinationOptions(PostGaebDestinationOptions gaebDestinationOptions) {
    this.gaebDestinationOptions = gaebDestinationOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostAvaProjectValidationSourceOptions postAvaProjectValidationSourceOptions = (PostAvaProjectValidationSourceOptions) o;
    return Objects.equals(this.avaProject, postAvaProjectValidationSourceOptions.avaProject) &&
        Objects.equals(this.serviceSpecificationIndex, postAvaProjectValidationSourceOptions.serviceSpecificationIndex) &&
        Objects.equals(this.validationType, postAvaProjectValidationSourceOptions.validationType) &&
        Objects.equals(this.exchangePhase, postAvaProjectValidationSourceOptions.exchangePhase) &&
        Objects.equals(this.avaSourceOptions, postAvaProjectValidationSourceOptions.avaSourceOptions) &&
        Objects.equals(this.oenormDestinationOptions, postAvaProjectValidationSourceOptions.oenormDestinationOptions) &&
        Objects.equals(this.gaebDestinationOptions, postAvaProjectValidationSourceOptions.gaebDestinationOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avaProject, serviceSpecificationIndex, validationType, exchangePhase, avaSourceOptions, oenormDestinationOptions, gaebDestinationOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostAvaProjectValidationSourceOptions {\n");
    
    sb.append("    avaProject: ").append(toIndentedString(avaProject)).append("\n");
    sb.append("    serviceSpecificationIndex: ").append(toIndentedString(serviceSpecificationIndex)).append("\n");
    sb.append("    validationType: ").append(toIndentedString(validationType)).append("\n");
    sb.append("    exchangePhase: ").append(toIndentedString(exchangePhase)).append("\n");
    sb.append("    avaSourceOptions: ").append(toIndentedString(avaSourceOptions)).append("\n");
    sb.append("    oenormDestinationOptions: ").append(toIndentedString(oenormDestinationOptions)).append("\n");
    sb.append("    gaebDestinationOptions: ").append(toIndentedString(gaebDestinationOptions)).append("\n");
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

