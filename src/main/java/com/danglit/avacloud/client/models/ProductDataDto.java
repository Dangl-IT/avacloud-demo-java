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
import com.danglit.avacloud.client.models.ArticleDataDto;
import com.danglit.avacloud.client.models.PartyInformationDto;
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
 * This class represents data about products and their vendor
 */
@ApiModel(description = "This class represents data about products and their vendor")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-09T18:36:39.750Z")
public class ProductDataDto {
  @SerializedName("id")
  private String id = null;

  @SerializedName("vendor")
  private PartyInformationDto vendor = null;

  @SerializedName("articles")
  private List<ArticleDataDto> articles = null;

  @SerializedName("shortText")
  private String shortText = null;

  @SerializedName("longText")
  private String longText = null;

  @SerializedName("htmlLongText")
  private String htmlLongText = null;

  public ProductDataDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Elements GUID identifier.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Elements GUID identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductDataDto vendor(PartyInformationDto vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * This PartyInformation is used to describe details about the vendor of this ProductData.
   * @return vendor
  **/
  @ApiModelProperty(value = "This PartyInformation is used to describe details about the vendor of this ProductData.")
  public PartyInformationDto getVendor() {
    return vendor;
  }

  public void setVendor(PartyInformationDto vendor) {
    this.vendor = vendor;
  }

  public ProductDataDto articles(List<ArticleDataDto> articles) {
    this.articles = articles;
    return this;
  }

  public ProductDataDto addArticlesItem(ArticleDataDto articlesItem) {
    if (this.articles == null) {
      this.articles = new ArrayList<>();
    }
    this.articles.add(articlesItem);
    return this;
  }

   /**
   * The collection of ArticleData that describe this product, e.g. a pipe product could be composed out of multiple pipe segments and fittings.
   * @return articles
  **/
  @ApiModelProperty(value = "The collection of ArticleData that describe this product, e.g. a pipe product could be composed out of multiple pipe segments and fittings.")
  public List<ArticleDataDto> getArticles() {
    return articles;
  }

  public void setArticles(List<ArticleDataDto> articles) {
    this.articles = articles;
  }

  public ProductDataDto shortText(String shortText) {
    this.shortText = shortText;
    return this;
  }

   /**
   * Short description for this ITextElement element.
   * @return shortText
  **/
  @ApiModelProperty(value = "Short description for this ITextElement element.")
  public String getShortText() {
    return shortText;
  }

  public void setShortText(String shortText) {
    this.shortText = shortText;
  }

  public ProductDataDto longText(String longText) {
    this.longText = longText;
    return this;
  }

   /**
   * Detailed description for this ITextElement element. When the HtmlLongText is set, this is automatically overwritten and filled with the appropriate plain text representation of the Html text. Vice versa, setting this property overrides the HtmlLongText.
   * @return longText
  **/
  @ApiModelProperty(value = "Detailed description for this ITextElement element. When the HtmlLongText is set, this is automatically overwritten and filled with the appropriate plain text representation of the Html text. Vice versa, setting this property overrides the HtmlLongText.")
  public String getLongText() {
    return longText;
  }

  public void setLongText(String longText) {
    this.longText = longText;
  }

  public ProductDataDto htmlLongText(String htmlLongText) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDataDto productDataDto = (ProductDataDto) o;
    return Objects.equals(this.id, productDataDto.id) &&
        Objects.equals(this.vendor, productDataDto.vendor) &&
        Objects.equals(this.articles, productDataDto.articles) &&
        Objects.equals(this.shortText, productDataDto.shortText) &&
        Objects.equals(this.longText, productDataDto.longText) &&
        Objects.equals(this.htmlLongText, productDataDto.htmlLongText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, vendor, articles, shortText, longText, htmlLongText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDataDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    articles: ").append(toIndentedString(articles)).append("\n");
    sb.append("    shortText: ").append(toIndentedString(shortText)).append("\n");
    sb.append("    longText: ").append(toIndentedString(longText)).append("\n");
    sb.append("    htmlLongText: ").append(toIndentedString(htmlLongText)).append("\n");
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

