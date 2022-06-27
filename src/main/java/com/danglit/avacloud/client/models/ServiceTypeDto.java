/*
 * AVACloud API 1.29.0
 * AVACloud API specification
 *
 * OpenAPI spec version: 1.29.0
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
 * The service type describes the type of service a Position represents.
 */
@JsonAdapter(ServiceTypeDto.Adapter.class)
public enum ServiceTypeDto {
  
  REGULAR("Regular"),
  
  HOURLYPAIDWORK("HourlyPaidWork");

  private String value;

  ServiceTypeDto(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ServiceTypeDto fromValue(String text) {
    for (ServiceTypeDto b : ServiceTypeDto.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ServiceTypeDto> {
    @Override
    public void write(final JsonWriter jsonWriter, final ServiceTypeDto enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ServiceTypeDto read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ServiceTypeDto.fromValue(String.valueOf(value));
    }
  }
}

