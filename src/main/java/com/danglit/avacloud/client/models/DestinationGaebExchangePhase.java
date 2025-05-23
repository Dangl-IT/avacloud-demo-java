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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The GAEB exchange phase to transform to. The phases are: Base &#x3D; 81 CostEstimate &#x3D; 82 OfferRequest &#x3D; 83 Offer &#x3D; 84 SideOffer &#x3D; 85 Grant &#x3D; 86
 */
@JsonAdapter(DestinationGaebExchangePhase.Adapter.class)
public enum DestinationGaebExchangePhase {
  
  NONE("None"),
  
  BASE("Base"),
  
  OFFERREQUEST("OfferRequest"),
  
  OFFER("Offer"),
  
  GRANT("Grant"),
  
  COSTESTIMATE("CostEstimate"),
  
  SIDEOFFER("SideOffer");

  private String value;

  DestinationGaebExchangePhase(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DestinationGaebExchangePhase fromValue(String text) {
    for (DestinationGaebExchangePhase b : DestinationGaebExchangePhase.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DestinationGaebExchangePhase> {
    @Override
    public void write(final JsonWriter jsonWriter, final DestinationGaebExchangePhase enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DestinationGaebExchangePhase read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DestinationGaebExchangePhase.fromValue(String.valueOf(value));
    }
  }
}

