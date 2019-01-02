/*
 * AVACloud API 1.4.0
 * AVACloud API specification
 *
 * OpenAPI spec version: 1.4.0
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
 * 
 */
@JsonAdapter(ComissionStatusDto.Adapter.class)
public enum ComissionStatusDto {
  
  UNDEFINED("Undefined"),
  
  COMMISSIONED("Commissioned"),
  
  POSTPONED("Postponed"),
  
  REMOVED("Removed");

  private String value;

  ComissionStatusDto(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ComissionStatusDto fromValue(String text) {
    for (ComissionStatusDto b : ComissionStatusDto.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ComissionStatusDto> {
    @Override
    public void write(final JsonWriter jsonWriter, final ComissionStatusDto enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ComissionStatusDto read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ComissionStatusDto.fromValue(String.valueOf(value));
    }
  }
}

