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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IElementDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-08T14:34:08.693Z")

public class IElementDto {
  @SerializedName("id")
  private String id = null;

  @SerializedName("gaebXmlId")
  private String gaebXmlId = null;

  @SerializedName("elementTypeDiscriminator")
  private String elementTypeDiscriminator = null;

  public IElementDto id(String id) {
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

  public IElementDto gaebXmlId(String gaebXmlId) {
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

  public IElementDto elementTypeDiscriminator(String elementTypeDiscriminator) {
    this.elementTypeDiscriminator = elementTypeDiscriminator;
    return this;
  }

   /**
   * Get elementTypeDiscriminator
   * @return elementTypeDiscriminator
  **/
  @ApiModelProperty(required = true, value = "")
  public String getElementTypeDiscriminator() {
    return elementTypeDiscriminator;
  }

  public void setElementTypeDiscriminator(String elementTypeDiscriminator) {
    this.elementTypeDiscriminator = elementTypeDiscriminator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IElementDto ielementDto = (IElementDto) o;
    return Objects.equals(this.id, ielementDto.id) &&
        Objects.equals(this.gaebXmlId, ielementDto.gaebXmlId) &&
        Objects.equals(this.elementTypeDiscriminator, ielementDto.elementTypeDiscriminator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, gaebXmlId, elementTypeDiscriminator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IElementDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    gaebXmlId: ").append(toIndentedString(gaebXmlId)).append("\n");
    sb.append("    elementTypeDiscriminator: ").append(toIndentedString(elementTypeDiscriminator)).append("\n");
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
