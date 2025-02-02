package com.broughty.restapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import org.springframework.lang.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * List of Bank Items - i.e. cash movements, See BankItem
 */

@Schema(name = "BankItems", description = "List of Bank Items - i.e. cash movements, See BankItem")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-02T13:18:41.397887300Z[Europe/London]", comments = "Generator version: 7.11.0")
public class BankItems {

  private @Nullable Integer pageNumber;

  private @Nullable Integer pageSize;

  private @Nullable Integer totalResults;

  private @Nullable PaginginfoLinks links;

  @Valid
  private List<@Valid BankItem> results = new ArrayList<>();

  public BankItems pageNumber(Integer pageNumber) {
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

  public BankItems pageSize(Integer pageSize) {
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

  public BankItems totalResults(Integer totalResults) {
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

  public BankItems links(PaginginfoLinks links) {
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

  public BankItems results(List<@Valid BankItem> results) {
    this.results = results;
    return this;
  }

  public BankItems addResultsItem(BankItem resultsItem) {
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
  public List<@Valid BankItem> getResults() {
    return results;
  }

  public void setResults(List<@Valid BankItem> results) {
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
    BankItems bankItems = (BankItems) o;
    return Objects.equals(this.pageNumber, bankItems.pageNumber) &&
        Objects.equals(this.pageSize, bankItems.pageSize) &&
        Objects.equals(this.totalResults, bankItems.totalResults) &&
        Objects.equals(this.links, bankItems.links) &&
        Objects.equals(this.results, bankItems.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, totalResults, links, results);
  }

  @Override
  public String toString() {
    String sb = "class BankItems {\n" +
        "    pageNumber: " + toIndentedString(pageNumber) + "\n" +
        "    pageSize: " + toIndentedString(pageSize) + "\n" +
        "    totalResults: " + toIndentedString(totalResults) + "\n" +
        "    links: " + toIndentedString(links) + "\n" +
        "    results: " + toIndentedString(results) + "\n" +
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

