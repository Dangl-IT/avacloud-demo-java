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
import com.danglit.avacloud.client.models.AwardTypeDto;
import com.danglit.avacloud.client.models.ItemNumberSchemaDto;
import com.danglit.avacloud.client.models.PartyInformationDto;
import com.danglit.avacloud.client.models.PriceComponentTypeDto;
import com.danglit.avacloud.client.models.SpecialAwardKindDto;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * General information about a Project.
 */
@ApiModel(description = "General information about a Project.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-04T13:13:59.221Z")
public class ProjectInformationDto {
  @SerializedName("buyer")
  private PartyInformationDto buyer = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("descriptionShort")
  private String descriptionShort = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("site")
  private PartyInformationDto site = null;

  @SerializedName("itemNumberSchema")
  private ItemNumberSchemaDto itemNumberSchema = null;

  @SerializedName("currencyShort")
  private String currencyShort = null;

  @SerializedName("currencyLong")
  private String currencyLong = null;

  @SerializedName("labourTimeLabel")
  private String labourTimeLabel = null;

  @SerializedName("priceComponents")
  private List<String> priceComponents = null;

  @SerializedName("priceComponentTypes")
  private Map<String, PriceComponentTypeDto> priceComponentTypes = null;

  @SerializedName("bidderCommentAllowed")
  private Boolean bidderCommentAllowed = null;

  @SerializedName("sideOffersAllowed")
  private Boolean sideOffersAllowed = null;

  @SerializedName("awardType")
  private AwardTypeDto awardType = null;

  @SerializedName("specialAwardKind")
  private SpecialAwardKindDto specialAwardKind = null;

  @SerializedName("requesters")
  private List<PartyInformationDto> requesters = null;

  @SerializedName("notificationSites")
  private List<PartyInformationDto> notificationSites = null;

  public ProjectInformationDto buyer(PartyInformationDto buyer) {
    this.buyer = buyer;
    return this;
  }

   /**
   * Information about the buyer.
   * @return buyer
  **/
  @ApiModelProperty(value = "Information about the buyer.")
  public PartyInformationDto getBuyer() {
    return buyer;
  }

  public void setBuyer(PartyInformationDto buyer) {
    this.buyer = buyer;
  }

  public ProjectInformationDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description for the project.
   * @return description
  **/
  @ApiModelProperty(value = "Description for the project.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProjectInformationDto descriptionShort(String descriptionShort) {
    this.descriptionShort = descriptionShort;
    return this;
  }

   /**
   * Short description for the project.
   * @return descriptionShort
  **/
  @ApiModelProperty(value = "Short description for the project.")
  public String getDescriptionShort() {
    return descriptionShort;
  }

  public void setDescriptionShort(String descriptionShort) {
    this.descriptionShort = descriptionShort;
  }

  public ProjectInformationDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the project.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the project.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProjectInformationDto site(PartyInformationDto site) {
    this.site = site;
    return this;
  }

   /**
   * Information about the site.
   * @return site
  **/
  @ApiModelProperty(value = "Information about the site.")
  public PartyInformationDto getSite() {
    return site;
  }

  public void setSite(PartyInformationDto site) {
    this.site = site;
  }

  public ProjectInformationDto itemNumberSchema(ItemNumberSchemaDto itemNumberSchema) {
    this.itemNumberSchema = itemNumberSchema;
    return this;
  }

   /**
   * The ItemNumberSchema used in the project.
   * @return itemNumberSchema
  **/
  @ApiModelProperty(value = "The ItemNumberSchema used in the project.")
  public ItemNumberSchemaDto getItemNumberSchema() {
    return itemNumberSchema;
  }

  public void setItemNumberSchema(ItemNumberSchemaDto itemNumberSchema) {
    this.itemNumberSchema = itemNumberSchema;
  }

  public ProjectInformationDto currencyShort(String currencyShort) {
    this.currencyShort = currencyShort;
    return this;
  }

   /**
   * Short label for the currency used.
   * @return currencyShort
  **/
  @ApiModelProperty(value = "Short label for the currency used.")
  public String getCurrencyShort() {
    return currencyShort;
  }

  public void setCurrencyShort(String currencyShort) {
    this.currencyShort = currencyShort;
  }

  public ProjectInformationDto currencyLong(String currencyLong) {
    this.currencyLong = currencyLong;
    return this;
  }

   /**
   * Full label of the currency used.
   * @return currencyLong
  **/
  @ApiModelProperty(value = "Full label of the currency used.")
  public String getCurrencyLong() {
    return currencyLong;
  }

  public void setCurrencyLong(String currencyLong) {
    this.currencyLong = currencyLong;
  }

  public ProjectInformationDto labourTimeLabel(String labourTimeLabel) {
    this.labourTimeLabel = labourTimeLabel;
    return this;
  }

   /**
   * Label for the labour time part of prices used in the project.
   * @return labourTimeLabel
  **/
  @ApiModelProperty(value = "Label for the labour time part of prices used in the project.")
  public String getLabourTimeLabel() {
    return labourTimeLabel;
  }

  public void setLabourTimeLabel(String labourTimeLabel) {
    this.labourTimeLabel = labourTimeLabel;
  }

  public ProjectInformationDto priceComponents(List<String> priceComponents) {
    this.priceComponents = priceComponents;
    return this;
  }

  public ProjectInformationDto addPriceComponentsItem(String priceComponentsItem) {
    if (this.priceComponents == null) {
      this.priceComponents = new ArrayList<>();
    }
    this.priceComponents.add(priceComponentsItem);
    return this;
  }

   /**
   * Labels for the price components used in the project. Caution: Removal of a price component will trigger to have dependent price informations be deleted in IElements that use this property. If this property is changed or altered after the project has already been used, it is strongly advised to do operations step by step, e.g. if renaming and reordering multiple price components, this should be done one by one. Otherwise, a combination of rename and reordering will not be correctly propagated downwards to child objects in this Project.
   * @return priceComponents
  **/
  @ApiModelProperty(value = "Labels for the price components used in the project. Caution: Removal of a price component will trigger to have dependent price informations be deleted in IElements that use this property. If this property is changed or altered after the project has already been used, it is strongly advised to do operations step by step, e.g. if renaming and reordering multiple price components, this should be done one by one. Otherwise, a combination of rename and reordering will not be correctly propagated downwards to child objects in this Project.")
  public List<String> getPriceComponents() {
    return priceComponents;
  }

  public void setPriceComponents(List<String> priceComponents) {
    this.priceComponents = priceComponents;
  }

   /**
   * This dictionary specifies actual types used for the PriceComponents. For example, a single price component might have the name &#39;Material&#39; as a string, ans this dictionary would then have a key &#39;Material&#39; and a value of Materials. You can not add keys here that are not also present in the PriceComponents property, and removing price components will also remove them from this dictionary here.
   * @return priceComponentTypes
  **/
  @ApiModelProperty(value = "This dictionary specifies actual types used for the PriceComponents. For example, a single price component might have the name 'Material' as a string, ans this dictionary would then have a key 'Material' and a value of Materials. You can not add keys here that are not also present in the PriceComponents property, and removing price components will also remove them from this dictionary here.")
  public Map<String, PriceComponentTypeDto> getPriceComponentTypes() {
    return priceComponentTypes;
  }

  public ProjectInformationDto bidderCommentAllowed(Boolean bidderCommentAllowed) {
    this.bidderCommentAllowed = bidderCommentAllowed;
    return this;
  }

   /**
   * This bool indicates if this project allows the bidder to add bidder comments. Bidder comments are a way to attach clarifying information when submitting an offer.
   * @return bidderCommentAllowed
  **/
  @ApiModelProperty(required = true, value = "This bool indicates if this project allows the bidder to add bidder comments. Bidder comments are a way to attach clarifying information when submitting an offer.")
  public Boolean isBidderCommentAllowed() {
    return bidderCommentAllowed;
  }

  public void setBidderCommentAllowed(Boolean bidderCommentAllowed) {
    this.bidderCommentAllowed = bidderCommentAllowed;
  }

  public ProjectInformationDto sideOffersAllowed(Boolean sideOffersAllowed) {
    this.sideOffersAllowed = sideOffersAllowed;
    return this;
  }

   /**
   * This property indicates if the project should allow side offers from contractors. In GAEB, a side offer would typically be in exchange phase 85.
   * @return sideOffersAllowed
  **/
  @ApiModelProperty(required = true, value = "This property indicates if the project should allow side offers from contractors. In GAEB, a side offer would typically be in exchange phase 85.")
  public Boolean isSideOffersAllowed() {
    return sideOffersAllowed;
  }

  public void setSideOffersAllowed(Boolean sideOffersAllowed) {
    this.sideOffersAllowed = sideOffersAllowed;
  }

  public ProjectInformationDto awardType(AwardTypeDto awardType) {
    this.awardType = awardType;
    return this;
  }

   /**
   * This enumeration describes the type of the award / procurement process. If this is used in a GAEB context, more information about award types can be found in the German VOB/A rules and the GAEB standard
   * @return awardType
  **/
  @ApiModelProperty(required = true, value = "This enumeration describes the type of the award / procurement process. If this is used in a GAEB context, more information about award types can be found in the German VOB/A rules and the GAEB standard")
  public AwardTypeDto getAwardType() {
    return awardType;
  }

  public void setAwardType(AwardTypeDto awardType) {
    this.awardType = awardType;
  }

  public ProjectInformationDto specialAwardKind(SpecialAwardKindDto specialAwardKind) {
    this.specialAwardKind = specialAwardKind;
    return this;
  }

   /**
   * This enumeration describes awards for project that are not just a regular procurement. For example, it can be used to describe recurring maintenance or an outline contract (German: Rahmenvertrag) which just specifies services and prices but may be requested on demand when necessary
   * @return specialAwardKind
  **/
  @ApiModelProperty(required = true, value = "This enumeration describes awards for project that are not just a regular procurement. For example, it can be used to describe recurring maintenance or an outline contract (German: Rahmenvertrag) which just specifies services and prices but may be requested on demand when necessary")
  public SpecialAwardKindDto getSpecialAwardKind() {
    return specialAwardKind;
  }

  public void setSpecialAwardKind(SpecialAwardKindDto specialAwardKind) {
    this.specialAwardKind = specialAwardKind;
  }

  public ProjectInformationDto requesters(List<PartyInformationDto> requesters) {
    this.requesters = requesters;
    return this;
  }

  public ProjectInformationDto addRequestersItem(PartyInformationDto requestersItem) {
    if (this.requesters == null) {
      this.requesters = new ArrayList<>();
    }
    this.requesters.add(requestersItem);
    return this;
  }

   /**
   * Requesters in a construction project, in German also called &#39;Bedarfsträger&#39;, are parties connected to the building process, e.g. architects or planners.
   * @return requesters
  **/
  @ApiModelProperty(value = "Requesters in a construction project, in German also called 'Bedarfsträger', are parties connected to the building process, e.g. architects or planners.")
  public List<PartyInformationDto> getRequesters() {
    return requesters;
  }

  public void setRequesters(List<PartyInformationDto> requesters) {
    this.requesters = requesters;
  }

  public ProjectInformationDto notificationSites(List<PartyInformationDto> notificationSites) {
    this.notificationSites = notificationSites;
    return this;
  }

  public ProjectInformationDto addNotificationSitesItem(PartyInformationDto notificationSitesItem) {
    if (this.notificationSites == null) {
      this.notificationSites = new ArrayList<>();
    }
    this.notificationSites.add(notificationSitesItem);
    return this;
  }

   /**
   * Notification sites are addresses that are used for delivering messages in the context of construction projects.
   * @return notificationSites
  **/
  @ApiModelProperty(value = "Notification sites are addresses that are used for delivering messages in the context of construction projects.")
  public List<PartyInformationDto> getNotificationSites() {
    return notificationSites;
  }

  public void setNotificationSites(List<PartyInformationDto> notificationSites) {
    this.notificationSites = notificationSites;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectInformationDto projectInformationDto = (ProjectInformationDto) o;
    return Objects.equals(this.buyer, projectInformationDto.buyer) &&
        Objects.equals(this.description, projectInformationDto.description) &&
        Objects.equals(this.descriptionShort, projectInformationDto.descriptionShort) &&
        Objects.equals(this.name, projectInformationDto.name) &&
        Objects.equals(this.site, projectInformationDto.site) &&
        Objects.equals(this.itemNumberSchema, projectInformationDto.itemNumberSchema) &&
        Objects.equals(this.currencyShort, projectInformationDto.currencyShort) &&
        Objects.equals(this.currencyLong, projectInformationDto.currencyLong) &&
        Objects.equals(this.labourTimeLabel, projectInformationDto.labourTimeLabel) &&
        Objects.equals(this.priceComponents, projectInformationDto.priceComponents) &&
        Objects.equals(this.priceComponentTypes, projectInformationDto.priceComponentTypes) &&
        Objects.equals(this.bidderCommentAllowed, projectInformationDto.bidderCommentAllowed) &&
        Objects.equals(this.sideOffersAllowed, projectInformationDto.sideOffersAllowed) &&
        Objects.equals(this.awardType, projectInformationDto.awardType) &&
        Objects.equals(this.specialAwardKind, projectInformationDto.specialAwardKind) &&
        Objects.equals(this.requesters, projectInformationDto.requesters) &&
        Objects.equals(this.notificationSites, projectInformationDto.notificationSites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyer, description, descriptionShort, name, site, itemNumberSchema, currencyShort, currencyLong, labourTimeLabel, priceComponents, priceComponentTypes, bidderCommentAllowed, sideOffersAllowed, awardType, specialAwardKind, requesters, notificationSites);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectInformationDto {\n");
    
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionShort: ").append(toIndentedString(descriptionShort)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    itemNumberSchema: ").append(toIndentedString(itemNumberSchema)).append("\n");
    sb.append("    currencyShort: ").append(toIndentedString(currencyShort)).append("\n");
    sb.append("    currencyLong: ").append(toIndentedString(currencyLong)).append("\n");
    sb.append("    labourTimeLabel: ").append(toIndentedString(labourTimeLabel)).append("\n");
    sb.append("    priceComponents: ").append(toIndentedString(priceComponents)).append("\n");
    sb.append("    priceComponentTypes: ").append(toIndentedString(priceComponentTypes)).append("\n");
    sb.append("    bidderCommentAllowed: ").append(toIndentedString(bidderCommentAllowed)).append("\n");
    sb.append("    sideOffersAllowed: ").append(toIndentedString(sideOffersAllowed)).append("\n");
    sb.append("    awardType: ").append(toIndentedString(awardType)).append("\n");
    sb.append("    specialAwardKind: ").append(toIndentedString(specialAwardKind)).append("\n");
    sb.append("    requesters: ").append(toIndentedString(requesters)).append("\n");
    sb.append("    notificationSites: ").append(toIndentedString(notificationSites)).append("\n");
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

