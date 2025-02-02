package com.broughty.restapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The Items in the Nominal Account   - Sales accounts: Record all sales, or separate them by product group or product - Wages: Recorded in the cash book and wages account in the nominal ledger - Assets: Recorded in the nominal ledger - Expenses: Recorded in the nominal ledger - Payments: Recorded in the nominal ledger - Accruals and prepayments: Recorded in the nominal ledger
 */

@Schema(name = "NominalItem", description = "The Items in the Nominal Account   - Sales accounts: Record all sales, or separate them by product group or product - Wages: Recorded in the cash book and wages account in the nominal ledger - Assets: Recorded in the nominal ledger - Expenses: Recorded in the nominal ledger - Payments: Recorded in the nominal ledger - Accruals and prepayments: Recorded in the nominal ledger")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-02T13:18:41.397887300Z[Europe/London]", comments = "Generator version: 7.11.0")
public class NominalItem {

  private @Nullable Integer id;

  private @Nullable String code;

  private @Nullable String name;

  private @Nullable BigDecimal debitCc;

  private @Nullable BigDecimal creditCc;

  private @Nullable Integer createdId;

  private @Nullable String companyId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime periodDate;

  public NominalItem id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Transaction identifier
   *
   * @return id
   */

  @Schema(name = "id", description = "Transaction identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public NominalItem code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Code for the transaction
   *
   * @return code
   */
  @Size(max = 30)
  @Schema(name = "code", description = "Code for the transaction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public NominalItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of transaction
   *
   * @return name
   */
  @Size(max = 60)
  @Schema(name = "name", description = "Name of transaction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NominalItem debitCc(BigDecimal debitCc) {
    this.debitCc = debitCc;
    return this;
  }

  /**
   * Populated if a debit transaction
   *
   * @return debitCc
   */
  @Valid
  @Schema(name = "debitCc", description = "Populated if a debit transaction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("debitCc")
  public BigDecimal getDebitCc() {
    return debitCc;
  }

  public void setDebitCc(BigDecimal debitCc) {
    this.debitCc = debitCc;
  }

  public NominalItem creditCc(BigDecimal creditCc) {
    this.creditCc = creditCc;
    return this;
  }

  /**
   * Get creditCc
   *
   * @return creditCc
   */
  @Valid
  @Schema(name = "creditCc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditCc")
  public BigDecimal getCreditCc() {
    return creditCc;
  }

  public void setCreditCc(BigDecimal creditCc) {
    this.creditCc = creditCc;
  }

  public NominalItem createdId(Integer createdId) {
    this.createdId = createdId;
    return this;
  }

  /**
   * Id of the Snapshot that created the transaction
   *
   * @return createdId
   */

  @Schema(name = "createdId", description = "Id of the Snapshot that created the transaction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdId")
  public Integer getCreatedId() {
    return createdId;
  }

  public void setCreatedId(Integer createdId) {
    this.createdId = createdId;
  }

  public NominalItem companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Owning Company Id
   *
   * @return companyId
   */
  @Size(min = 36, max = 36)
  @Schema(name = "companyId", description = "Owning Company Id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("companyId")
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public NominalItem periodDate(OffsetDateTime periodDate) {
    this.periodDate = periodDate;
    return this;
  }

  /**
   * Get periodDate
   *
   * @return periodDate
   */
  @Valid
  @Schema(name = "periodDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("periodDate")
  public OffsetDateTime getPeriodDate() {
    return periodDate;
  }

  public void setPeriodDate(OffsetDateTime periodDate) {
    this.periodDate = periodDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NominalItem nominalItem = (NominalItem) o;
    return Objects.equals(this.id, nominalItem.id) &&
        Objects.equals(this.code, nominalItem.code) &&
        Objects.equals(this.name, nominalItem.name) &&
        Objects.equals(this.debitCc, nominalItem.debitCc) &&
        Objects.equals(this.creditCc, nominalItem.creditCc) &&
        Objects.equals(this.createdId, nominalItem.createdId) &&
        Objects.equals(this.companyId, nominalItem.companyId) &&
        Objects.equals(this.periodDate, nominalItem.periodDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, name, debitCc, creditCc, createdId, companyId, periodDate);
  }

  @Override
  public String toString() {
    String sb = "class NominalItem {\n" +
        "    id: " + toIndentedString(id) + "\n" +
        "    code: " + toIndentedString(code) + "\n" +
        "    name: " + toIndentedString(name) + "\n" +
        "    debitCc: " + toIndentedString(debitCc) + "\n" +
        "    creditCc: " + toIndentedString(creditCc) + "\n" +
        "    createdId: " + toIndentedString(createdId) + "\n" +
        "    companyId: " + toIndentedString(companyId) + "\n" +
        "    periodDate: " + toIndentedString(periodDate) + "\n" +
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

