/*
 * AVACloud API 1.9.1
 * AVACloud API specification
 *
 * OpenAPI spec version: 1.9.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.danglit.avacloud.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.danglit.avacloud.client.models.AdditionTypeDto;
import com.danglit.avacloud.client.models.CalculationDto;
import com.danglit.avacloud.client.models.CatalogueDto;
import com.danglit.avacloud.client.models.CatalogueReferenceDto;
import com.danglit.avacloud.client.models.ComissionStatusDto;
import com.danglit.avacloud.client.models.CommercePropertiesDto;
import com.danglit.avacloud.client.models.IElementDto;
import com.danglit.avacloud.client.models.ItemNumberDto;
import com.danglit.avacloud.client.models.LabourPriceComponentDto;
import com.danglit.avacloud.client.models.PositionTypeDto;
import com.danglit.avacloud.client.models.PriceComponentDto;
import com.danglit.avacloud.client.models.PriceTypeDto;
import com.danglit.avacloud.client.models.QuantityAssignmentDto;
import com.danglit.avacloud.client.models.ServiceTypeDto;
import com.danglit.avacloud.client.models.StandardizedDescriptionDto;
import com.danglit.avacloud.client.models.SubDescriptionDto;
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
 * PositionDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-27T19:12:20.812Z")
public class PositionDto extends IElementDto {
  @SerializedName("unitPrice")
  private BigDecimal unitPrice = null;

  @SerializedName("unitPriceOverride")
  private BigDecimal unitPriceOverride = null;

  @SerializedName("quantity")
  private BigDecimal quantity = null;

  @SerializedName("quantityOverride")
  private BigDecimal quantityOverride = null;

  @SerializedName("unitTag")
  private String unitTag = null;

  @SerializedName("labourComponents")
  private LabourPriceComponentDto labourComponents = null;

  @SerializedName("priceComponents")
  private List<PriceComponentDto> priceComponents = null;

  @SerializedName("quantityComponents")
  private List<CalculationDto> quantityComponents = null;

  @SerializedName("subDescriptions")
  private List<SubDescriptionDto> subDescriptions = null;

  @SerializedName("comissionStatus")
  private ComissionStatusDto comissionStatus = null;

  @SerializedName("complementedBy")
  private List<String> complementedBy = null;

  @SerializedName("complemented")
  private Boolean complemented = null;

  @SerializedName("amountToBeEnteredByBidder")
  private Boolean amountToBeEnteredByBidder = null;

  @SerializedName("priceCompositionRequired")
  private Boolean priceCompositionRequired = null;

  @SerializedName("useDifferentTaxRate")
  private Boolean useDifferentTaxRate = null;

  @SerializedName("taxRate")
  private BigDecimal taxRate = null;

  @SerializedName("itemNumber")
  private ItemNumberDto itemNumber = null;

  @SerializedName("deductionFactor")
  private BigDecimal deductionFactor = null;

  @SerializedName("totalPrice")
  private BigDecimal totalPrice = null;

  @SerializedName("totalPriceGross")
  private BigDecimal totalPriceGross = null;

  @SerializedName("totalPriceGrossDeducted")
  private BigDecimal totalPriceGrossDeducted = null;

  @SerializedName("deductedPrice")
  private BigDecimal deductedPrice = null;

  @SerializedName("positionType")
  private PositionTypeDto positionType = null;

  @SerializedName("priceType")
  private PriceTypeDto priceType = null;

  @SerializedName("serviceType")
  private ServiceTypeDto serviceType = null;

  @SerializedName("shortText")
  private String shortText = null;

  @SerializedName("longText")
  private String longText = null;

  @SerializedName("htmlLongText")
  private String htmlLongText = null;

  @SerializedName("additionType")
  private AdditionTypeDto additionType = null;

  @SerializedName("elementType")
  private String elementType = null;

  @SerializedName("quantityAssignments")
  private List<QuantityAssignmentDto> quantityAssignments = null;

  @SerializedName("commerceProperties")
  private CommercePropertiesDto commerceProperties = null;

  @SerializedName("alternativeTo")
  private String alternativeTo = null;

  @SerializedName("isLumpSum")
  private Boolean isLumpSum = null;

  @SerializedName("repetitionTo")
  private String repetitionTo = null;

  @SerializedName("projectCatalogues")
  private List<CatalogueDto> projectCatalogues = null;

  @SerializedName("catalogueReferences")
  private List<CatalogueReferenceDto> catalogueReferences = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("standardizedDescription")
  private StandardizedDescriptionDto standardizedDescription = null;

   /**
   * Will return the price per unit, rounded according to the project settings or the default value of three decimal places
   * @return unitPrice
  **/
  @ApiModelProperty(required = true, value = "Will return the price per unit, rounded according to the project settings or the default value of three decimal places")
  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public PositionDto unitPriceOverride(BigDecimal unitPriceOverride) {
    this.unitPriceOverride = unitPriceOverride;
    return this;
  }

   /**
   * You can use this property to directly set the unit price for this position. This will override any given PriceComponents
   * @return unitPriceOverride
  **/
  @ApiModelProperty(value = "You can use this property to directly set the unit price for this position. This will override any given PriceComponents")
  public BigDecimal getUnitPriceOverride() {
    return unitPriceOverride;
  }

  public void setUnitPriceOverride(BigDecimal unitPriceOverride) {
    this.unitPriceOverride = unitPriceOverride;
  }

   /**
   * Will return this Position&#39;s total quantity, rounded to three decimal places.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "Will return this Position's total quantity, rounded to three decimal places.")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public PositionDto quantityOverride(BigDecimal quantityOverride) {
    this.quantityOverride = quantityOverride;
    return this;
  }

   /**
   * You can use this property to directly set the quantity for this position. This will override any given QuantityComponents
   * @return quantityOverride
  **/
  @ApiModelProperty(value = "You can use this property to directly set the quantity for this position. This will override any given QuantityComponents")
  public BigDecimal getQuantityOverride() {
    return quantityOverride;
  }

  public void setQuantityOverride(BigDecimal quantityOverride) {
    this.quantityOverride = quantityOverride;
  }

  public PositionDto unitTag(String unitTag) {
    this.unitTag = unitTag;
    return this;
  }

   /**
   * The tag of the unit used for this positions quantity.
   * @return unitTag
  **/
  @ApiModelProperty(value = "The tag of the unit used for this positions quantity.")
  public String getUnitTag() {
    return unitTag;
  }

  public void setUnitTag(String unitTag) {
    this.unitTag = unitTag;
  }

  public PositionDto labourComponents(LabourPriceComponentDto labourComponents) {
    this.labourComponents = labourComponents;
    return this;
  }

   /**
   * The components for labour time in this Position.
   * @return labourComponents
  **/
  @ApiModelProperty(value = "The components for labour time in this Position.")
  public LabourPriceComponentDto getLabourComponents() {
    return labourComponents;
  }

  public void setLabourComponents(LabourPriceComponentDto labourComponents) {
    this.labourComponents = labourComponents;
  }

  public PositionDto priceComponents(List<PriceComponentDto> priceComponents) {
    this.priceComponents = priceComponents;
    return this;
  }

  public PositionDto addPriceComponentsItem(PriceComponentDto priceComponentsItem) {
    if (this.priceComponents == null) {
      this.priceComponents = new ArrayList<>();
    }
    this.priceComponents.add(priceComponentsItem);
    return this;
  }

   /**
   * The single price components in this Position. Price components should not be handled directly on a per-position basis but set globally in the parent Projects ProjectInformation.
   * @return priceComponents
  **/
  @ApiModelProperty(value = "The single price components in this Position. Price components should not be handled directly on a per-position basis but set globally in the parent Projects ProjectInformation.")
  public List<PriceComponentDto> getPriceComponents() {
    return priceComponents;
  }

  public void setPriceComponents(List<PriceComponentDto> priceComponents) {
    this.priceComponents = priceComponents;
  }

  public PositionDto quantityComponents(List<CalculationDto> quantityComponents) {
    this.quantityComponents = quantityComponents;
    return this;
  }

  public PositionDto addQuantityComponentsItem(CalculationDto quantityComponentsItem) {
    if (this.quantityComponents == null) {
      this.quantityComponents = new ArrayList<>();
    }
    this.quantityComponents.add(quantityComponentsItem);
    return this;
  }

   /**
   * The quantity components of this Position.
   * @return quantityComponents
  **/
  @ApiModelProperty(value = "The quantity components of this Position.")
  public List<CalculationDto> getQuantityComponents() {
    return quantityComponents;
  }

  public void setQuantityComponents(List<CalculationDto> quantityComponents) {
    this.quantityComponents = quantityComponents;
  }

  public PositionDto subDescriptions(List<SubDescriptionDto> subDescriptions) {
    this.subDescriptions = subDescriptions;
    return this;
  }

  public PositionDto addSubDescriptionsItem(SubDescriptionDto subDescriptionsItem) {
    if (this.subDescriptions == null) {
      this.subDescriptions = new ArrayList<>();
    }
    this.subDescriptions.add(subDescriptionsItem);
    return this;
  }

   /**
   * Further structuring of this Position.
   * @return subDescriptions
  **/
  @ApiModelProperty(value = "Further structuring of this Position.")
  public List<SubDescriptionDto> getSubDescriptions() {
    return subDescriptions;
  }

  public void setSubDescriptions(List<SubDescriptionDto> subDescriptions) {
    this.subDescriptions = subDescriptions;
  }

  public PositionDto comissionStatus(ComissionStatusDto comissionStatus) {
    this.comissionStatus = comissionStatus;
    return this;
  }

   /**
   * Indicates the status of this Position&#39;s comission.
   * @return comissionStatus
  **/
  @ApiModelProperty(required = true, value = "Indicates the status of this Position's comission.")
  public ComissionStatusDto getComissionStatus() {
    return comissionStatus;
  }

  public void setComissionStatus(ComissionStatusDto comissionStatus) {
    this.comissionStatus = comissionStatus;
  }

  public PositionDto complementedBy(List<String> complementedBy) {
    this.complementedBy = complementedBy;
    return this;
  }

  public PositionDto addComplementedByItem(String complementedByItem) {
    if (this.complementedBy == null) {
      this.complementedBy = new ArrayList<>();
    }
    this.complementedBy.add(complementedByItem);
    return this;
  }

   /**
   * A list of positions that complement this Position. The positions are referenced by their GUIDs.
   * @return complementedBy
  **/
  @ApiModelProperty(value = "A list of positions that complement this Position. The positions are referenced by their GUIDs.")
  public List<String> getComplementedBy() {
    return complementedBy;
  }

  public void setComplementedBy(List<String> complementedBy) {
    this.complementedBy = complementedBy;
  }

  public PositionDto complemented(Boolean complemented) {
    this.complemented = complemented;
    return this;
  }

   /**
   * Will indicate if this Position is complemented in this ServiceSpecification by other Positions.
   * @return complemented
  **/
  @ApiModelProperty(required = true, value = "Will indicate if this Position is complemented in this ServiceSpecification by other Positions.")
  public Boolean isComplemented() {
    return complemented;
  }

  public void setComplemented(Boolean complemented) {
    this.complemented = complemented;
  }

  public PositionDto amountToBeEnteredByBidder(Boolean amountToBeEnteredByBidder) {
    this.amountToBeEnteredByBidder = amountToBeEnteredByBidder;
    return this;
  }

   /**
   * Indicates that the amount for this Position is to be set by the bidder.
   * @return amountToBeEnteredByBidder
  **/
  @ApiModelProperty(required = true, value = "Indicates that the amount for this Position is to be set by the bidder.")
  public Boolean isAmountToBeEnteredByBidder() {
    return amountToBeEnteredByBidder;
  }

  public void setAmountToBeEnteredByBidder(Boolean amountToBeEnteredByBidder) {
    this.amountToBeEnteredByBidder = amountToBeEnteredByBidder;
  }

  public PositionDto priceCompositionRequired(Boolean priceCompositionRequired) {
    this.priceCompositionRequired = priceCompositionRequired;
    return this;
  }

   /**
   * Indicates if the bidder demands for prices to be broken up into their price components.
   * @return priceCompositionRequired
  **/
  @ApiModelProperty(required = true, value = "Indicates if the bidder demands for prices to be broken up into their price components.")
  public Boolean isPriceCompositionRequired() {
    return priceCompositionRequired;
  }

  public void setPriceCompositionRequired(Boolean priceCompositionRequired) {
    this.priceCompositionRequired = priceCompositionRequired;
  }

  public PositionDto useDifferentTaxRate(Boolean useDifferentTaxRate) {
    this.useDifferentTaxRate = useDifferentTaxRate;
    return this;
  }

   /**
   * Indicates if this Position should use a different TaxRate than what is the default for the Project.
   * @return useDifferentTaxRate
  **/
  @ApiModelProperty(required = true, value = "Indicates if this Position should use a different TaxRate than what is the default for the Project.")
  public Boolean isUseDifferentTaxRate() {
    return useDifferentTaxRate;
  }

  public void setUseDifferentTaxRate(Boolean useDifferentTaxRate) {
    this.useDifferentTaxRate = useDifferentTaxRate;
  }

  public PositionDto taxRate(BigDecimal taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Will return either the parent ServiceSpecification&#39;s TaxRate or it&#39;s own if it has a different value. (For example, in Germany Water has a different TaxRate than regular Positions)
   * @return taxRate
  **/
  @ApiModelProperty(required = true, value = "Will return either the parent ServiceSpecification's TaxRate or it's own if it has a different value. (For example, in Germany Water has a different TaxRate than regular Positions)")
  public BigDecimal getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(BigDecimal taxRate) {
    this.taxRate = taxRate;
  }

  public PositionDto itemNumber(ItemNumberDto itemNumber) {
    this.itemNumber = itemNumber;
    return this;
  }

   /**
   * The ItemNumber for this Position.
   * @return itemNumber
  **/
  @ApiModelProperty(value = "The ItemNumber for this Position.")
  public ItemNumberDto getItemNumber() {
    return itemNumber;
  }

  public void setItemNumber(ItemNumberDto itemNumber) {
    this.itemNumber = itemNumber;
  }

  public PositionDto deductionFactor(BigDecimal deductionFactor) {
    this.deductionFactor = deductionFactor;
    return this;
  }

   /**
   * The rate of deductions, i.e. 0.12m means 12% price deduction.
   * @return deductionFactor
  **/
  @ApiModelProperty(required = true, value = "The rate of deductions, i.e. 0.12m means 12% price deduction.")
  public BigDecimal getDeductionFactor() {
    return deductionFactor;
  }

  public void setDeductionFactor(BigDecimal deductionFactor) {
    this.deductionFactor = deductionFactor;
  }

   /**
   * Returns the product of UnitPrice times Quantity.
   * @return totalPrice
  **/
  @ApiModelProperty(required = true, value = "Returns the product of UnitPrice times Quantity.")
  public BigDecimal getTotalPrice() {
    return totalPrice;
  }

   /**
   * The total gross price for this Position.
   * @return totalPriceGross
  **/
  @ApiModelProperty(required = true, value = "The total gross price for this Position.")
  public BigDecimal getTotalPriceGross() {
    return totalPriceGross;
  }

   /**
   * Total gross price after applied deductions.
   * @return totalPriceGrossDeducted
  **/
  @ApiModelProperty(required = true, value = "Total gross price after applied deductions.")
  public BigDecimal getTotalPriceGrossDeducted() {
    return totalPriceGrossDeducted;
  }

   /**
   * Net price after applied deductions.
   * @return deductedPrice
  **/
  @ApiModelProperty(required = true, value = "Net price after applied deductions.")
  public BigDecimal getDeductedPrice() {
    return deductedPrice;
  }

  public PositionDto positionType(PositionTypeDto positionType) {
    this.positionType = positionType;
    return this;
  }

   /**
   * This indicates the type of a position. If this is an alternative position, its AlternativeTo property should be set to the id of the position it can replace.
   * @return positionType
  **/
  @ApiModelProperty(required = true, value = "This indicates the type of a position. If this is an alternative position, its AlternativeTo property should be set to the id of the position it can replace.")
  public PositionTypeDto getPositionType() {
    return positionType;
  }

  public void setPositionType(PositionTypeDto positionType) {
    this.positionType = positionType;
  }

  public PositionDto priceType(PriceTypeDto priceType) {
    this.priceType = priceType;
    return this;
  }

   /**
   * Indicates the PriceType of this Position.
   * @return priceType
  **/
  @ApiModelProperty(required = true, value = "Indicates the PriceType of this Position.")
  public PriceTypeDto getPriceType() {
    return priceType;
  }

  public void setPriceType(PriceTypeDto priceType) {
    this.priceType = priceType;
  }

  public PositionDto serviceType(ServiceTypeDto serviceType) {
    this.serviceType = serviceType;
    return this;
  }

   /**
   * This indicates if this position is regular or describing a labour / hourly paid work service
   * @return serviceType
  **/
  @ApiModelProperty(required = true, value = "This indicates if this position is regular or describing a labour / hourly paid work service")
  public ServiceTypeDto getServiceType() {
    return serviceType;
  }

  public void setServiceType(ServiceTypeDto serviceType) {
    this.serviceType = serviceType;
  }

  public PositionDto shortText(String shortText) {
    this.shortText = shortText;
    return this;
  }

   /**
   * Short description for this DescriptionBase element.
   * @return shortText
  **/
  @ApiModelProperty(value = "Short description for this DescriptionBase element.")
  public String getShortText() {
    return shortText;
  }

  public void setShortText(String shortText) {
    this.shortText = shortText;
  }

  public PositionDto longText(String longText) {
    this.longText = longText;
    return this;
  }

   /**
   * Detailed description for this DescriptionBase element. When the HtmlLongText is set, this is automatically overwritten and filled with the appropriate plain text representation of the Html text. Vice versa, setting this property overrides the HtmlLongText.
   * @return longText
  **/
  @ApiModelProperty(value = "Detailed description for this DescriptionBase element. When the HtmlLongText is set, this is automatically overwritten and filled with the appropriate plain text representation of the Html text. Vice versa, setting this property overrides the HtmlLongText.")
  public String getLongText() {
    return longText;
  }

  public void setLongText(String longText) {
    this.longText = longText;
  }

  public PositionDto htmlLongText(String htmlLongText) {
    this.htmlLongText = htmlLongText;
    return this;
  }

   /**
   * This contains the Html representation of the Longtext. When the LongText is set, this is automatically overwritten and filled with the appropriate Html representation of the plaintext. Vice versa, setting this property overrides the LongText. GAEB 90 and GAEB 2000 exports do not support any image functionality. In GAEB XML, only images that use an embedded Base64 data uri are exported, regular url references are cleared before written out.
   * @return htmlLongText
  **/
  @ApiModelProperty(value = "This contains the Html representation of the Longtext. When the LongText is set, this is automatically overwritten and filled with the appropriate Html representation of the plaintext. Vice versa, setting this property overrides the LongText. GAEB 90 and GAEB 2000 exports do not support any image functionality. In GAEB XML, only images that use an embedded Base64 data uri are exported, regular url references are cleared before written out.")
  public String getHtmlLongText() {
    return htmlLongText;
  }

  public void setHtmlLongText(String htmlLongText) {
    this.htmlLongText = htmlLongText;
  }

  public PositionDto additionType(AdditionTypeDto additionType) {
    this.additionType = additionType;
    return this;
  }

   /**
   * Indicates if this DescriptionBase element contains Buyer or Bidder additions to the text.
   * @return additionType
  **/
  @ApiModelProperty(required = true, value = "Indicates if this DescriptionBase element contains Buyer or Bidder additions to the text.")
  public AdditionTypeDto getAdditionType() {
    return additionType;
  }

  public void setAdditionType(AdditionTypeDto additionType) {
    this.additionType = additionType;
  }

  public PositionDto elementType(String elementType) {
    this.elementType = elementType;
    return this;
  }

   /**
   * Get elementType
   * @return elementType
  **/
  @ApiModelProperty(value = "")
  public String getElementType() {
    return elementType;
  }

  public void setElementType(String elementType) {
    this.elementType = elementType;
  }

  public PositionDto quantityAssignments(List<QuantityAssignmentDto> quantityAssignments) {
    this.quantityAssignments = quantityAssignments;
    return this;
  }

  public PositionDto addQuantityAssignmentsItem(QuantityAssignmentDto quantityAssignmentsItem) {
    if (this.quantityAssignments == null) {
      this.quantityAssignments = new ArrayList<>();
    }
    this.quantityAssignments.add(quantityAssignmentsItem);
    return this;
  }

   /**
   * Quantity assignments are, in contrast to SubDescriptions, used to categorize parts of this Position. For example, it could be categorized by cost group - e.g. a Position describing concrete walls could follow the German DIN 276 Cost Groups Standard and specify that of the total 1.000m² wall, 500m² are classified as exterior walls and 500m² are classified as interior walls. They would then have different cost groups associated, e.g. for accounting purposes.
   * @return quantityAssignments
  **/
  @ApiModelProperty(value = "Quantity assignments are, in contrast to SubDescriptions, used to categorize parts of this Position. For example, it could be categorized by cost group - e.g. a Position describing concrete walls could follow the German DIN 276 Cost Groups Standard and specify that of the total 1.000m² wall, 500m² are classified as exterior walls and 500m² are classified as interior walls. They would then have different cost groups associated, e.g. for accounting purposes.")
  public List<QuantityAssignmentDto> getQuantityAssignments() {
    return quantityAssignments;
  }

  public void setQuantityAssignments(List<QuantityAssignmentDto> quantityAssignments) {
    this.quantityAssignments = quantityAssignments;
  }

  public PositionDto commerceProperties(CommercePropertiesDto commerceProperties) {
    this.commerceProperties = commerceProperties;
    return this;
  }

   /**
   * The CommerceProperties support specialized information that is only useful in GAEB XML 9x data exchange phases. It is intended to provide article information.
   * @return commerceProperties
  **/
  @ApiModelProperty(value = "The CommerceProperties support specialized information that is only useful in GAEB XML 9x data exchange phases. It is intended to provide article information.")
  public CommercePropertiesDto getCommerceProperties() {
    return commerceProperties;
  }

  public void setCommerceProperties(CommercePropertiesDto commerceProperties) {
    this.commerceProperties = commerceProperties;
  }

  public PositionDto alternativeTo(String alternativeTo) {
    this.alternativeTo = alternativeTo;
    return this;
  }

   /**
   * If this position is an Alternative, then this property should point to the id of the position in this service specification that it can replace.
   * @return alternativeTo
  **/
  @ApiModelProperty(value = "If this position is an Alternative, then this property should point to the id of the position in this service specification that it can replace.")
  public String getAlternativeTo() {
    return alternativeTo;
  }

  public void setAlternativeTo(String alternativeTo) {
    this.alternativeTo = alternativeTo;
  }

  public PositionDto isLumpSum(Boolean isLumpSum) {
    this.isLumpSum = isLumpSum;
    return this;
  }

   /**
   * If this is true, it indicates that the position is intended to be a lump sum, \&quot;Pauschal\&quot; in German. This means the position total price that is being invoiced should not depend on the actual quantity. In practice, partial invoices are still often used for partial services rendered. This property does not affect the price calculation for this position. Typically, the Quantity should be set to 1.0 when this flag is used.
   * @return isLumpSum
  **/
  @ApiModelProperty(required = true, value = "If this is true, it indicates that the position is intended to be a lump sum, \"Pauschal\" in German. This means the position total price that is being invoiced should not depend on the actual quantity. In practice, partial invoices are still often used for partial services rendered. This property does not affect the price calculation for this position. Typically, the Quantity should be set to 1.0 when this flag is used.")
  public Boolean isIsLumpSum() {
    return isLumpSum;
  }

  public void setIsLumpSum(Boolean isLumpSum) {
    this.isLumpSum = isLumpSum;
  }

  public PositionDto repetitionTo(String repetitionTo) {
    this.repetitionTo = repetitionTo;
    return this;
  }

   /**
   * This identifier can be used to point to the Id of a position in the same ServiceSpecification that acts as a base position. It matches \&quot;Bezugsposition\&quot; in GAEB. This can be used for positions that repeat partially or are linked together
   * @return repetitionTo
  **/
  @ApiModelProperty(value = "This identifier can be used to point to the Id of a position in the same ServiceSpecification that acts as a base position. It matches \"Bezugsposition\" in GAEB. This can be used for positions that repeat partially or are linked together")
  public String getRepetitionTo() {
    return repetitionTo;
  }

  public void setRepetitionTo(String repetitionTo) {
    this.repetitionTo = repetitionTo;
  }

  public PositionDto projectCatalogues(List<CatalogueDto> projectCatalogues) {
    this.projectCatalogues = projectCatalogues;
    return this;
  }

  public PositionDto addProjectCataloguesItem(CatalogueDto projectCataloguesItem) {
    if (this.projectCatalogues == null) {
      this.projectCatalogues = new ArrayList<>();
    }
    this.projectCatalogues.add(projectCataloguesItem);
    return this;
  }

   /**
   * These are Catalogues that are used within this Position. Catalogues are used to describe catalogues, or collections, that can be used to describe elements with commonly known properties. For example, QuantityAssignments use these to categorize themselves. They are propagate to all child elements, e.g. other containers and QuantityAssignments. In the context of a ServiceSpecification, all elements share the same instance of the collection.
   * @return projectCatalogues
  **/
  @ApiModelProperty(value = "These are Catalogues that are used within this Position. Catalogues are used to describe catalogues, or collections, that can be used to describe elements with commonly known properties. For example, QuantityAssignments use these to categorize themselves. They are propagate to all child elements, e.g. other containers and QuantityAssignments. In the context of a ServiceSpecification, all elements share the same instance of the collection.")
  public List<CatalogueDto> getProjectCatalogues() {
    return projectCatalogues;
  }

  public void setProjectCatalogues(List<CatalogueDto> projectCatalogues) {
    this.projectCatalogues = projectCatalogues;
  }

  public PositionDto catalogueReferences(List<CatalogueReferenceDto> catalogueReferences) {
    this.catalogueReferences = catalogueReferences;
    return this;
  }

  public PositionDto addCatalogueReferencesItem(CatalogueReferenceDto catalogueReferencesItem) {
    if (this.catalogueReferences == null) {
      this.catalogueReferences = new ArrayList<>();
    }
    this.catalogueReferences.add(catalogueReferencesItem);
    return this;
  }

   /**
   * Referenced catalogues for this Position.
   * @return catalogueReferences
  **/
  @ApiModelProperty(value = "Referenced catalogues for this Position.")
  public List<CatalogueReferenceDto> getCatalogueReferences() {
    return catalogueReferences;
  }

  public void setCatalogueReferences(List<CatalogueReferenceDto> catalogueReferences) {
    this.catalogueReferences = catalogueReferences;
  }

  public PositionDto type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PositionDto standardizedDescription(StandardizedDescriptionDto standardizedDescription) {
    this.standardizedDescription = standardizedDescription;
    return this;
  }

   /**
   * This represents a standardized description. This means that instead of solely relying on texts to describe a service, external standards and definitions are referenced for a common understanding.
   * @return standardizedDescription
  **/
  @ApiModelProperty(value = "This represents a standardized description. This means that instead of solely relying on texts to describe a service, external standards and definitions are referenced for a common understanding.")
  public StandardizedDescriptionDto getStandardizedDescription() {
    return standardizedDescription;
  }

  public void setStandardizedDescription(StandardizedDescriptionDto standardizedDescription) {
    this.standardizedDescription = standardizedDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionDto positionDto = (PositionDto) o;
    return Objects.equals(this.unitPrice, positionDto.unitPrice) &&
        Objects.equals(this.unitPriceOverride, positionDto.unitPriceOverride) &&
        Objects.equals(this.quantity, positionDto.quantity) &&
        Objects.equals(this.quantityOverride, positionDto.quantityOverride) &&
        Objects.equals(this.unitTag, positionDto.unitTag) &&
        Objects.equals(this.labourComponents, positionDto.labourComponents) &&
        Objects.equals(this.priceComponents, positionDto.priceComponents) &&
        Objects.equals(this.quantityComponents, positionDto.quantityComponents) &&
        Objects.equals(this.subDescriptions, positionDto.subDescriptions) &&
        Objects.equals(this.comissionStatus, positionDto.comissionStatus) &&
        Objects.equals(this.complementedBy, positionDto.complementedBy) &&
        Objects.equals(this.complemented, positionDto.complemented) &&
        Objects.equals(this.amountToBeEnteredByBidder, positionDto.amountToBeEnteredByBidder) &&
        Objects.equals(this.priceCompositionRequired, positionDto.priceCompositionRequired) &&
        Objects.equals(this.useDifferentTaxRate, positionDto.useDifferentTaxRate) &&
        Objects.equals(this.taxRate, positionDto.taxRate) &&
        Objects.equals(this.itemNumber, positionDto.itemNumber) &&
        Objects.equals(this.deductionFactor, positionDto.deductionFactor) &&
        Objects.equals(this.totalPrice, positionDto.totalPrice) &&
        Objects.equals(this.totalPriceGross, positionDto.totalPriceGross) &&
        Objects.equals(this.totalPriceGrossDeducted, positionDto.totalPriceGrossDeducted) &&
        Objects.equals(this.deductedPrice, positionDto.deductedPrice) &&
        Objects.equals(this.positionType, positionDto.positionType) &&
        Objects.equals(this.priceType, positionDto.priceType) &&
        Objects.equals(this.serviceType, positionDto.serviceType) &&
        Objects.equals(this.shortText, positionDto.shortText) &&
        Objects.equals(this.longText, positionDto.longText) &&
        Objects.equals(this.htmlLongText, positionDto.htmlLongText) &&
        Objects.equals(this.additionType, positionDto.additionType) &&
        Objects.equals(this.elementType, positionDto.elementType) &&
        Objects.equals(this.quantityAssignments, positionDto.quantityAssignments) &&
        Objects.equals(this.commerceProperties, positionDto.commerceProperties) &&
        Objects.equals(this.alternativeTo, positionDto.alternativeTo) &&
        Objects.equals(this.isLumpSum, positionDto.isLumpSum) &&
        Objects.equals(this.repetitionTo, positionDto.repetitionTo) &&
        Objects.equals(this.projectCatalogues, positionDto.projectCatalogues) &&
        Objects.equals(this.catalogueReferences, positionDto.catalogueReferences) &&
        Objects.equals(this.type, positionDto.type) &&
        Objects.equals(this.standardizedDescription, positionDto.standardizedDescription) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitPrice, unitPriceOverride, quantity, quantityOverride, unitTag, labourComponents, priceComponents, quantityComponents, subDescriptions, comissionStatus, complementedBy, complemented, amountToBeEnteredByBidder, priceCompositionRequired, useDifferentTaxRate, taxRate, itemNumber, deductionFactor, totalPrice, totalPriceGross, totalPriceGrossDeducted, deductedPrice, positionType, priceType, serviceType, shortText, longText, htmlLongText, additionType, elementType, quantityAssignments, commerceProperties, alternativeTo, isLumpSum, repetitionTo, projectCatalogues, catalogueReferences, type, standardizedDescription, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    unitPriceOverride: ").append(toIndentedString(unitPriceOverride)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    quantityOverride: ").append(toIndentedString(quantityOverride)).append("\n");
    sb.append("    unitTag: ").append(toIndentedString(unitTag)).append("\n");
    sb.append("    labourComponents: ").append(toIndentedString(labourComponents)).append("\n");
    sb.append("    priceComponents: ").append(toIndentedString(priceComponents)).append("\n");
    sb.append("    quantityComponents: ").append(toIndentedString(quantityComponents)).append("\n");
    sb.append("    subDescriptions: ").append(toIndentedString(subDescriptions)).append("\n");
    sb.append("    comissionStatus: ").append(toIndentedString(comissionStatus)).append("\n");
    sb.append("    complementedBy: ").append(toIndentedString(complementedBy)).append("\n");
    sb.append("    complemented: ").append(toIndentedString(complemented)).append("\n");
    sb.append("    amountToBeEnteredByBidder: ").append(toIndentedString(amountToBeEnteredByBidder)).append("\n");
    sb.append("    priceCompositionRequired: ").append(toIndentedString(priceCompositionRequired)).append("\n");
    sb.append("    useDifferentTaxRate: ").append(toIndentedString(useDifferentTaxRate)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    itemNumber: ").append(toIndentedString(itemNumber)).append("\n");
    sb.append("    deductionFactor: ").append(toIndentedString(deductionFactor)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    totalPriceGross: ").append(toIndentedString(totalPriceGross)).append("\n");
    sb.append("    totalPriceGrossDeducted: ").append(toIndentedString(totalPriceGrossDeducted)).append("\n");
    sb.append("    deductedPrice: ").append(toIndentedString(deductedPrice)).append("\n");
    sb.append("    positionType: ").append(toIndentedString(positionType)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    shortText: ").append(toIndentedString(shortText)).append("\n");
    sb.append("    longText: ").append(toIndentedString(longText)).append("\n");
    sb.append("    htmlLongText: ").append(toIndentedString(htmlLongText)).append("\n");
    sb.append("    additionType: ").append(toIndentedString(additionType)).append("\n");
    sb.append("    elementType: ").append(toIndentedString(elementType)).append("\n");
    sb.append("    quantityAssignments: ").append(toIndentedString(quantityAssignments)).append("\n");
    sb.append("    commerceProperties: ").append(toIndentedString(commerceProperties)).append("\n");
    sb.append("    alternativeTo: ").append(toIndentedString(alternativeTo)).append("\n");
    sb.append("    isLumpSum: ").append(toIndentedString(isLumpSum)).append("\n");
    sb.append("    repetitionTo: ").append(toIndentedString(repetitionTo)).append("\n");
    sb.append("    projectCatalogues: ").append(toIndentedString(projectCatalogues)).append("\n");
    sb.append("    catalogueReferences: ").append(toIndentedString(catalogueReferences)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    standardizedDescription: ").append(toIndentedString(standardizedDescription)).append("\n");
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

