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
import java.math.BigDecimal;

/**
 * This class represents the linking to a complementary position with a specific quantity set. For example, Position &#39;A&#39; could be complementing Position &#39;B&#39; with a total quantity of 20 units
 */
@ApiModel(description = "This class represents the linking to a complementary position with a specific quantity set. For example, Position 'A' could be complementing Position 'B' with a total quantity of 20 units")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-09T18:36:39.750Z")
public class ComplementedByQuantityDto {
  @SerializedName("quantity")
  private BigDecimal quantity = null;

  @SerializedName("complementingPositionId")
  private String complementingPositionId = null;

  public ComplementedByQuantityDto quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity that is complemented. E.g., if the base position has a quantity of 100 m² of a brick wall, a complementing position might be for &#39;walls that exceed 3 m height&#39; and for a total quantity of 10 m².
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The quantity that is complemented. E.g., if the base position has a quantity of 100 m² of a brick wall, a complementing position might be for 'walls that exceed 3 m height' and for a total quantity of 10 m².")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public ComplementedByQuantityDto complementingPositionId(String complementingPositionId) {
    this.complementingPositionId = complementingPositionId;
    return this;
  }

   /**
   * This is the reference to the Id of the Position that is complementing. This means it does NOT reference the base position but the one that contains the actual addition.
   * @return complementingPositionId
  **/
  @ApiModelProperty(value = "This is the reference to the Id of the Position that is complementing. This means it does NOT reference the base position but the one that contains the actual addition.")
  public String getComplementingPositionId() {
    return complementingPositionId;
  }

  public void setComplementingPositionId(String complementingPositionId) {
    this.complementingPositionId = complementingPositionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComplementedByQuantityDto complementedByQuantityDto = (ComplementedByQuantityDto) o;
    return Objects.equals(this.quantity, complementedByQuantityDto.quantity) &&
        Objects.equals(this.complementingPositionId, complementedByQuantityDto.complementingPositionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, complementingPositionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComplementedByQuantityDto {\n");
    
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    complementingPositionId: ").append(toIndentedString(complementingPositionId)).append("\n");
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

