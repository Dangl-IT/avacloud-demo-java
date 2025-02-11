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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Indicates a ServiceSpecification&#39;s exchange phase, based on the GAEB exchange phases.
 */
@JsonAdapter(ExchangePhaseDto.Adapter.class)
public enum ExchangePhaseDto {
  
  UNDEFINED("Undefined"),
  
  BASE("Base"),
  
  COSTESTIMATE("CostEstimate"),
  
  OFFERREQUEST("OfferRequest"),
  
  OFFER("Offer"),
  
  SIDEOFFER("SideOffer"),
  
  GRANT("Grant");

  private String value;

  ExchangePhaseDto(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ExchangePhaseDto fromValue(String text) {
    for (ExchangePhaseDto b : ExchangePhaseDto.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ExchangePhaseDto> {
    @Override
    public void write(final JsonWriter jsonWriter, final ExchangePhaseDto enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ExchangePhaseDto read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ExchangePhaseDto.fromValue(String.valueOf(value));
    }
  }
}

