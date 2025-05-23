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
 * This enum configures rounding modes for price calculations in projects
 */
@JsonAdapter(PriceRoundingModeDto.Adapter.class)
public enum PriceRoundingModeDto {
  
  NORMAL("Normal"),
  
  FLOOR("Floor"),
  
  CEILING("Ceiling");

  private String value;

  PriceRoundingModeDto(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PriceRoundingModeDto fromValue(String text) {
    for (PriceRoundingModeDto b : PriceRoundingModeDto.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PriceRoundingModeDto> {
    @Override
    public void write(final JsonWriter jsonWriter, final PriceRoundingModeDto enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PriceRoundingModeDto read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PriceRoundingModeDto.fromValue(String.valueOf(value));
    }
  }
}

