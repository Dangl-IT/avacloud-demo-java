/*
 * AVACloud API 1.55.0
 * AVACloud API specification
 *
 * OpenAPI spec version: 1.55.0
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
 * This class represents a single key reference within the German STLB \&quot;Standardleistungsbuch Bau\&quot;
 */
@ApiModel(description = "This class represents a single key reference within the German STLB \"Standardleistungsbuch Bau\"")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-02-11T12:55:14.413Z")
public class STLBKeyDto {
  @SerializedName("artIdentifier")
  private Integer artIdentifier = null;

  @SerializedName("artIndex")
  private Integer artIndex = null;

  @SerializedName("kindIdentifier")
  private Integer kindIdentifier = null;

  public STLBKeyDto artIdentifier(Integer artIdentifier) {
    this.artIdentifier = artIdentifier;
    return this;
  }

   /**
   * This identifier is required and uniquely describes a single reference within the STLB standard. It maps to \&quot;ArtChrIdent\&quot; in GAEB XML
   * @return artIdentifier
  **/
  @ApiModelProperty(required = true, value = "This identifier is required and uniquely describes a single reference within the STLB standard. It maps to \"ArtChrIdent\" in GAEB XML")
  public Integer getArtIdentifier() {
    return artIdentifier;
  }

  public void setArtIdentifier(Integer artIdentifier) {
    this.artIdentifier = artIdentifier;
  }

  public STLBKeyDto artIndex(Integer artIndex) {
    this.artIndex = artIndex;
    return this;
  }

   /**
   * This optional index property further categorizes a single reference within the STLB standard. It maps to \&quot;ArtChIdx\&quot; in GAEB XML
   * @return artIndex
  **/
  @ApiModelProperty(value = "This optional index property further categorizes a single reference within the STLB standard. It maps to \"ArtChIdx\" in GAEB XML")
  public Integer getArtIndex() {
    return artIndex;
  }

  public void setArtIndex(Integer artIndex) {
    this.artIndex = artIndex;
  }

  public STLBKeyDto kindIdentifier(Integer kindIdentifier) {
    this.kindIdentifier = kindIdentifier;
    return this;
  }

   /**
   * This optional identifier further specifies the execution kind of the reference in the STLB standard. It maps to \&quot;ChVIdent\&quot; in GAEB XML
   * @return kindIdentifier
  **/
  @ApiModelProperty(value = "This optional identifier further specifies the execution kind of the reference in the STLB standard. It maps to \"ChVIdent\" in GAEB XML")
  public Integer getKindIdentifier() {
    return kindIdentifier;
  }

  public void setKindIdentifier(Integer kindIdentifier) {
    this.kindIdentifier = kindIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    STLBKeyDto stLBKeyDto = (STLBKeyDto) o;
    return Objects.equals(this.artIdentifier, stLBKeyDto.artIdentifier) &&
        Objects.equals(this.artIndex, stLBKeyDto.artIndex) &&
        Objects.equals(this.kindIdentifier, stLBKeyDto.kindIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artIdentifier, artIndex, kindIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class STLBKeyDto {\n");
    
    sb.append("    artIdentifier: ").append(toIndentedString(artIdentifier)).append("\n");
    sb.append("    artIndex: ").append(toIndentedString(artIndex)).append("\n");
    sb.append("    kindIdentifier: ").append(toIndentedString(kindIdentifier)).append("\n");
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

