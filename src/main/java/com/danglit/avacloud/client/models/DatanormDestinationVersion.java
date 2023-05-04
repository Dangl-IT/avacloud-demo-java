/*
 * AVACloud API 1.41.0
 * AVACloud API specification
 *
 * OpenAPI spec version: 1.41.0
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
 * Represents valid Datanorm versions for export
 */
@JsonAdapter(DatanormDestinationVersion.Adapter.class)
public enum DatanormDestinationVersion {
  
  V4("V4"),
  
  V5("V5");

  private String value;

  DatanormDestinationVersion(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DatanormDestinationVersion fromValue(String text) {
    for (DatanormDestinationVersion b : DatanormDestinationVersion.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DatanormDestinationVersion> {
    @Override
    public void write(final JsonWriter jsonWriter, final DatanormDestinationVersion enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DatanormDestinationVersion read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DatanormDestinationVersion.fromValue(String.valueOf(value));
    }
  }
}

