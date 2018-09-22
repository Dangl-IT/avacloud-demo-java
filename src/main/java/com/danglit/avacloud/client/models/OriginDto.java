/*
 * AVACloud API 1.2.0
 * The full AVACloud API specification
 *
 * OpenAPI spec version: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.danglit.avacloud.client.models;

import java.util.Objects;
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
@JsonAdapter(OriginDto.Adapter.class)
public enum OriginDto {
  
  SELF("Self"),
  
  GAEB90("Gaeb90"),
  
  GAEB2000("Gaeb2000"),
  
  GAEBXML("GaebXml"),
  
  OENORM("Oenorm");

  private String value;

  OriginDto(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OriginDto fromValue(String text) {
    for (OriginDto b : OriginDto.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<OriginDto> {
    @Override
    public void write(final JsonWriter jsonWriter, final OriginDto enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OriginDto read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OriginDto.fromValue(String.valueOf(value));
    }
  }
}

