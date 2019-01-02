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
@JsonAdapter(ResponseErrorType.Adapter.class)
public enum ResponseErrorType {
  
  NONE("None"),
  
  PROTOCOL("Protocol"),
  
  HTTP("Http"),
  
  EXCEPTION("Exception"),
  
  POLICYVIOLATION("PolicyViolation");

  private String value;

  ResponseErrorType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ResponseErrorType fromValue(String text) {
    for (ResponseErrorType b : ResponseErrorType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ResponseErrorType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResponseErrorType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ResponseErrorType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResponseErrorType.fromValue(String.valueOf(value));
    }
  }
}

