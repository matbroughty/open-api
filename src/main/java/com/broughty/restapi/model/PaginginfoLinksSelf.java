package com.broughty.restapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import org.springframework.lang.Nullable;

import java.util.Objects;

/**
 * PaginginfoLinksSelf
 */

@JsonTypeName("Paginginfo__links_self")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-02T13:18:41.397887300Z[Europe/London]", comments = "Generator version: 7.11.0")
public class PaginginfoLinksSelf {

  private @Nullable String href;

  public PaginginfoLinksSelf href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Get href
   *
   * @return href
   */

  @Schema(name = "href", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginginfoLinksSelf paginginfoLinksSelf = (PaginginfoLinksSelf) o;
    return Objects.equals(this.href, paginginfoLinksSelf.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href);
  }

  @Override
  public String toString() {
    String sb = "class PaginginfoLinksSelf {\n" +
        "    href: " + toIndentedString(href) + "\n" +
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

