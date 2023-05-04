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
 * Enumeration for the different types of checks performed
 */
@JsonAdapter(ValidationCheckType.Adapter.class)
public enum ValidationCheckType {
  
  GENERAL("General"),
  
  XMLSCHEMACHECK("XmlSchemaCheck"),
  
  OBJECTVALIDATION("ObjectValidation"),
  
  PROJECTVALIDATION("ProjectValidation");

  private String value;

  ValidationCheckType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ValidationCheckType fromValue(String text) {
    for (ValidationCheckType b : ValidationCheckType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ValidationCheckType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ValidationCheckType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ValidationCheckType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ValidationCheckType.fromValue(String.valueOf(value));
    }
  }
}

