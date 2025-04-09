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
 * This enumeration models types of price components for better classification.
 */
@JsonAdapter(PriceComponentTypeDto.Adapter.class)
public enum PriceComponentTypeDto {
  
  UNKNOWN("Unknown"),
  
  WAGES("Wages"),
  
  MATERIALS("Materials"),
  
  PLANT("Plant"),
  
  MISCELLANEOUS("Miscellaneous");

  private String value;

  PriceComponentTypeDto(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PriceComponentTypeDto fromValue(String text) {
    for (PriceComponentTypeDto b : PriceComponentTypeDto.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PriceComponentTypeDto> {
    @Override
    public void write(final JsonWriter jsonWriter, final PriceComponentTypeDto enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PriceComponentTypeDto read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PriceComponentTypeDto.fromValue(String.valueOf(value));
    }
  }
}

