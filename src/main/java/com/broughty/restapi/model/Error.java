package com.broughty.restapi.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;

import java.time.OffsetDateTime;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

import jakarta.annotation.Generated;

/**
 * Error
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-01T19:26:55.251389700Z[Europe/London]", comments = "Generator version: 7.11.0")
public class Error {

  private @Nullable Integer statusCode;

  private @Nullable String service;

  private @Nullable String errorMessage;

  private @Nullable String retryable;

  public Error statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Get statusCode
   *
   * @return statusCode
   */

  @Schema(name = "statusCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusCode")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public Error service(String service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   *
   * @return service
   */

  @Schema(name = "service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service")
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public Error errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Error message string
   *
   * @return errorMessage
   */

  @Schema(name = "errorMessage", description = "Error message string", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public Error retryable(String retryable) {
    this.retryable = retryable;
    return this;
  }

  /**
   * Can the API call be retried.
   *
   * @return retryable
   */

  @Schema(name = "retryable", description = "Can the API call be retried.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retryable")
  public String getRetryable() {
    return retryable;
  }

  public void setRetryable(String retryable) {
    this.retryable = retryable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.statusCode, error.statusCode) &&
        Objects.equals(this.service, error.service) &&
        Objects.equals(this.errorMessage, error.errorMessage) &&
        Objects.equals(this.retryable, error.retryable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, service, errorMessage, retryable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    retryable: ").append(toIndentedString(retryable)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

