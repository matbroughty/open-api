package com.broughty.restapi.model;

import java.net.URI;
import java.util.Objects;

import com.broughty.restapi.model.PaginginfoLinksSelf;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;

import java.time.OffsetDateTime;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

import jakarta.annotation.Generated;

/**
 * PaginginfoLinks
 */

@JsonTypeName("Paginginfo__links")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-01T19:26:55.251389700Z[Europe/London]", comments = "Generator version: 7.11.0")
public class PaginginfoLinks {

  private @Nullable PaginginfoLinksSelf self;

  private @Nullable PaginginfoLinksSelf current;

  public PaginginfoLinks self(PaginginfoLinksSelf self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   *
   * @return self
   */
  @Valid
  @Schema(name = "self", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public PaginginfoLinksSelf getSelf() {
    return self;
  }

  public void setSelf(PaginginfoLinksSelf self) {
    this.self = self;
  }

  public PaginginfoLinks current(PaginginfoLinksSelf current) {
    this.current = current;
    return this;
  }

  /**
   * Get current
   *
   * @return current
   */
  @Valid
  @Schema(name = "current", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("current")
  public PaginginfoLinksSelf getCurrent() {
    return current;
  }

  public void setCurrent(PaginginfoLinksSelf current) {
    this.current = current;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginginfoLinks paginginfoLinks = (PaginginfoLinks) o;
    return Objects.equals(this.self, paginginfoLinks.self) &&
        Objects.equals(this.current, paginginfoLinks.current);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, current);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginginfoLinks {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
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

