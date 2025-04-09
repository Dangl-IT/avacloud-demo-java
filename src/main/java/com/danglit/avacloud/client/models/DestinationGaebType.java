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
 * Represents valid GAEB target types
 */
@JsonAdapter(DestinationGaebType.Adapter.class)
public enum DestinationGaebType {
  
  GAEB90("Gaeb90"),
  
  GAEB2000("Gaeb2000"),
  
  GAEB2000COMMERCE("Gaeb2000Commerce"),
  
  GAEBXML_V3_1("GaebXml_V3_1"),
  
  GAEBXML_V3_2("GaebXml_V3_2"),
  
  GAEBXML_V3_2_COMMERCE("GaebXml_V3_2_Commerce"),
  
  GAEBXML_V3_3("GaebXml_V3_3"),
  
  GAEBXML_V3_3_COMMERCE("GaebXml_V3_3_Commerce"),
  
  GAEBXML_V3_3_2019("GaebXml_V3_3_2019"),
  
  GAEBXML_V3_3_2019_COMMERCE("GaebXml_V3_3_2019_Commerce");

  private String value;

  DestinationGaebType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DestinationGaebType fromValue(String text) {
    for (DestinationGaebType b : DestinationGaebType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DestinationGaebType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DestinationGaebType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DestinationGaebType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DestinationGaebType.fromValue(String.valueOf(value));
    }
  }
}

