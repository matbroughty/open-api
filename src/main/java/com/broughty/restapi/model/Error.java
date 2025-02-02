package com.broughty.restapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import org.springframework.lang.Nullable;

import java.util.Objects;

/**
 * Describes an Error from the OA API service
 */

@Schema(name = "Error", description = "Describes an Error from the OA API service")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-02T13:18:41.397887300Z[Europe/London]", comments = "Generator version: 7.11.0")
public class Error {

  private @Nullable Integer status;

  private @Nullable String timestamp;

  private @Nullable String error;

  private @Nullable String path;

  public Error status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * HTTP status code
   *
   * @return status
   */

  @Schema(name = "status", description = "HTTP status code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Error timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Timestamp of error
   *
   * @return timestamp
   */

  @Schema(name = "timestamp", description = "Timestamp of error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public Error error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Error message string
   *
   * @return error
   */

  @Schema(name = "error", description = "Error message string", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public Error path(String path) {
    this.path = path;
    return this;
  }

  /**
   * The API path
   *
   * @return path
   */

  @Schema(name = "path", description = "The API path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
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
    return Objects.equals(this.status, error.status) &&
        Objects.equals(this.timestamp, error.timestamp) &&
        Objects.equals(this.error, error.error) &&
        Objects.equals(this.path, error.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, timestamp, error, path);
  }

  @Override
  public String toString() {
    String sb = "class Error {\n" +
        "    status: " + toIndentedString(status) + "\n" +
        "    timestamp: " + toIndentedString(timestamp) + "\n" +
        "    error: " + toIndentedString(error) + "\n" +
        "    path: " + toIndentedString(path) + "\n" +
        "}";
    return sb;
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

