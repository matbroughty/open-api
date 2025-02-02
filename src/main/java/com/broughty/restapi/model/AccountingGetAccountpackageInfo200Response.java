package com.broughty.restapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import org.springframework.lang.Nullable;

import java.util.Objects;

/**
 * AccountingGetAccountpackageInfo200Response
 */

@JsonTypeName("accounting_get_accountpackage_info_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-02T10:51:26.254693400Z[Europe/London]", comments = "Generator version: 7.11.0")
public class AccountingGetAccountpackageInfo200Response {

  private @Nullable PackageInfo company;

  public AccountingGetAccountpackageInfo200Response company(PackageInfo company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   *
   * @return company
   */
  @Valid
  @Schema(name = "company", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("company")
  public PackageInfo getCompany() {
    return company;
  }

  public void setCompany(PackageInfo company) {
    this.company = company;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountingGetAccountpackageInfo200Response accountingGetAccountpackageInfo200Response = (AccountingGetAccountpackageInfo200Response) o;
    return Objects.equals(this.company, accountingGetAccountpackageInfo200Response.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company);
  }

  @Override
  public String toString() {
    String sb = "class AccountingGetAccountpackageInfo200Response {\n" +
        "    company: " + toIndentedString(company) + "\n" +
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

