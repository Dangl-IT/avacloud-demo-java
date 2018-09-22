/*
 * AVACloud API 1.2.0
 * The full AVACloud API specification
 *
 * OpenAPI spec version: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.danglit.avacloud.client.models;

import java.util.Objects;
import com.danglit.avacloud.client.models.PriceRoundingModeDto;
import com.danglit.avacloud.client.models.ProjectInformationDto;
import com.danglit.avacloud.client.models.ServiceSpecificationDto;
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
 * ProjectDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T20:18:08.781Z")
public class ProjectDto {
  @SerializedName("id")
  private String id = null;

  @SerializedName("priceAccuracy")
  private Integer priceAccuracy = null;

  @SerializedName("forceStrictTotals")
  private Boolean forceStrictTotals = null;

  @SerializedName("priceRoundingMode")
  private PriceRoundingModeDto priceRoundingMode = null;

  @SerializedName("projectInformation")
  private ProjectInformationDto projectInformation = null;

  @SerializedName("serviceSpecifications")
  private List<ServiceSpecificationDto> serviceSpecifications = null;

  @SerializedName("gaebXmlId")
  private String gaebXmlId = null;

  public ProjectDto id(String id) {
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

  public ProjectDto priceAccuracy(Integer priceAccuracy) {
    this.priceAccuracy = priceAccuracy;
    return this;
  }

   /**
   * Get priceAccuracy
   * @return priceAccuracy
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getPriceAccuracy() {
    return priceAccuracy;
  }

  public void setPriceAccuracy(Integer priceAccuracy) {
    this.priceAccuracy = priceAccuracy;
  }

  public ProjectDto forceStrictTotals(Boolean forceStrictTotals) {
    this.forceStrictTotals = forceStrictTotals;
    return this;
  }

   /**
   * Get forceStrictTotals
   * @return forceStrictTotals
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isForceStrictTotals() {
    return forceStrictTotals;
  }

  public void setForceStrictTotals(Boolean forceStrictTotals) {
    this.forceStrictTotals = forceStrictTotals;
  }

  public ProjectDto priceRoundingMode(PriceRoundingModeDto priceRoundingMode) {
    this.priceRoundingMode = priceRoundingMode;
    return this;
  }

   /**
   * Get priceRoundingMode
   * @return priceRoundingMode
  **/
  @ApiModelProperty(required = true, value = "")
  public PriceRoundingModeDto getPriceRoundingMode() {
    return priceRoundingMode;
  }

  public void setPriceRoundingMode(PriceRoundingModeDto priceRoundingMode) {
    this.priceRoundingMode = priceRoundingMode;
  }

  public ProjectDto projectInformation(ProjectInformationDto projectInformation) {
    this.projectInformation = projectInformation;
    return this;
  }

   /**
   * Get projectInformation
   * @return projectInformation
  **/
  @ApiModelProperty(value = "")
  public ProjectInformationDto getProjectInformation() {
    return projectInformation;
  }

  public void setProjectInformation(ProjectInformationDto projectInformation) {
    this.projectInformation = projectInformation;
  }

  public ProjectDto serviceSpecifications(List<ServiceSpecificationDto> serviceSpecifications) {
    this.serviceSpecifications = serviceSpecifications;
    return this;
  }

  public ProjectDto addServiceSpecificationsItem(ServiceSpecificationDto serviceSpecificationsItem) {
    if (this.serviceSpecifications == null) {
      this.serviceSpecifications = new ArrayList<>();
    }
    this.serviceSpecifications.add(serviceSpecificationsItem);
    return this;
  }

   /**
   * Get serviceSpecifications
   * @return serviceSpecifications
  **/
  @ApiModelProperty(value = "")
  public List<ServiceSpecificationDto> getServiceSpecifications() {
    return serviceSpecifications;
  }

  public void setServiceSpecifications(List<ServiceSpecificationDto> serviceSpecifications) {
    this.serviceSpecifications = serviceSpecifications;
  }

  public ProjectDto gaebXmlId(String gaebXmlId) {
    this.gaebXmlId = gaebXmlId;
    return this;
  }

   /**
   * Get gaebXmlId
   * @return gaebXmlId
  **/
  @ApiModelProperty(value = "")
  public String getGaebXmlId() {
    return gaebXmlId;
  }

  public void setGaebXmlId(String gaebXmlId) {
    this.gaebXmlId = gaebXmlId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectDto projectDto = (ProjectDto) o;
    return Objects.equals(this.id, projectDto.id) &&
        Objects.equals(this.priceAccuracy, projectDto.priceAccuracy) &&
        Objects.equals(this.forceStrictTotals, projectDto.forceStrictTotals) &&
        Objects.equals(this.priceRoundingMode, projectDto.priceRoundingMode) &&
        Objects.equals(this.projectInformation, projectDto.projectInformation) &&
        Objects.equals(this.serviceSpecifications, projectDto.serviceSpecifications) &&
        Objects.equals(this.gaebXmlId, projectDto.gaebXmlId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, priceAccuracy, forceStrictTotals, priceRoundingMode, projectInformation, serviceSpecifications, gaebXmlId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    priceAccuracy: ").append(toIndentedString(priceAccuracy)).append("\n");
    sb.append("    forceStrictTotals: ").append(toIndentedString(forceStrictTotals)).append("\n");
    sb.append("    priceRoundingMode: ").append(toIndentedString(priceRoundingMode)).append("\n");
    sb.append("    projectInformation: ").append(toIndentedString(projectInformation)).append("\n");
    sb.append("    serviceSpecifications: ").append(toIndentedString(serviceSpecifications)).append("\n");
    sb.append("    gaebXmlId: ").append(toIndentedString(gaebXmlId)).append("\n");
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

