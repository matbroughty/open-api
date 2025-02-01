package com.broughty.restapi.model;

import java.net.URI;
import java.util.Objects;

import com.broughty.restapi.model.PaginginfoLinks;
import com.broughty.restapi.model.Supplier;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.lang.Nullable;

import java.time.OffsetDateTime;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

import jakarta.annotation.Generated;

/**
 * Suppliers
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-01T19:26:55.251389700Z[Europe/London]", comments = "Generator version: 7.11.0")
public class Suppliers {

  private @Nullable Integer pageNumber;

  private @Nullable Integer pageSize;

  private @Nullable Integer totalResults;

  private @Nullable PaginginfoLinks links;

  @Valid
  private List<@Valid Supplier> results = new ArrayList<>();

  public Suppliers pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Get pageNumber
   *
   * @return pageNumber
   */

  @Schema(name = "pageNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public Suppliers pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   *
   * @return pageSize
   */

  @Schema(name = "pageSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public Suppliers totalResults(Integer totalResults) {
    this.totalResults = totalResults;
    return this;
  }

  /**
   * Get totalResults
   *
   * @return totalResults
   */

  @Schema(name = "totalResults", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalResults")
  public Integer getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }

  public Suppliers links(PaginginfoLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   *
   * @return links
   */
  @Valid
  @Schema(name = "_links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_links")
  public PaginginfoLinks getLinks() {
    return links;
  }

  public void setLinks(PaginginfoLinks links) {
    this.links = links;
  }

  public Suppliers results(List<@Valid Supplier> results) {
    this.results = results;
    return this;
  }

  public Suppliers addResultsItem(Supplier resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   *
   * @return results
   */
  @Valid
  @Schema(name = "results", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("results")
  public List<@Valid Supplier> getResults() {
    return results;
  }

  public void setResults(List<@Valid Supplier> results) {
    this.results = results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Suppliers suppliers = (Suppliers) o;
    return Objects.equals(this.pageNumber, suppliers.pageNumber) &&
        Objects.equals(this.pageSize, suppliers.pageSize) &&
        Objects.equals(this.totalResults, suppliers.totalResults) &&
        Objects.equals(this.links, suppliers.links) &&
        Objects.equals(this.results, suppliers.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, totalResults, links, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Suppliers {\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

