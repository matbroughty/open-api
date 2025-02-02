package com.broughty.restapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * If the DataFile was suspended (status&#x3D;40) then this will hold details of why
 */

@Schema(name = "DataFile_suspendedDetails", description = "If the DataFile was suspended (status=40) then this will hold details of why")
@JsonTypeName("DataFile_suspendedDetails")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-02T13:18:41.397887300Z[Europe/London]", comments = "Generator version: 7.11.0")
public class DataFileSuspendedDetails {

  private @Nullable Integer id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime supsendedDate;

  private @Nullable BigDecimal previousSalesBalanceCc;

  private @Nullable BigDecimal proposedSalesBalanceCc;

  private @Nullable Integer proposedSalesBalanceChangePercent;

  public DataFileSuspendedDetails id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Suspended data id
   * @return id
   */

  @Schema(name = "id", description = "Suspended data id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public DataFileSuspendedDetails supsendedDate(OffsetDateTime supsendedDate) {
    this.supsendedDate = supsendedDate;
    return this;
  }

  /**
   * Date file was suspended
   * @return supsendedDate
   */
  @Valid 
  @Schema(name = "supsendedDate", description = "Date file was suspended", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supsendedDate")
  public OffsetDateTime getSupsendedDate() {
    return supsendedDate;
  }

  public void setSupsendedDate(OffsetDateTime supsendedDate) {
    this.supsendedDate = supsendedDate;
  }

  public DataFileSuspendedDetails previousSalesBalanceCc(BigDecimal previousSalesBalanceCc) {
    this.previousSalesBalanceCc = previousSalesBalanceCc;
    return this;
  }

  /**
   * Previous sales ledger balance prior to this DataFile
   * @return previousSalesBalanceCc
   */
  @Valid 
  @Schema(name = "previousSalesBalanceCc", description = "Previous sales ledger balance prior to this DataFile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("previousSalesBalanceCc")
  public BigDecimal getPreviousSalesBalanceCc() {
    return previousSalesBalanceCc;
  }

  public void setPreviousSalesBalanceCc(BigDecimal previousSalesBalanceCc) {
    this.previousSalesBalanceCc = previousSalesBalanceCc;
  }

  public DataFileSuspendedDetails proposedSalesBalanceCc(BigDecimal proposedSalesBalanceCc) {
    this.proposedSalesBalanceCc = proposedSalesBalanceCc;
    return this;
  }

  /**
   * Proposed sales ledger balance if this DataFile let through
   * @return proposedSalesBalanceCc
   */
  @Valid 
  @Schema(name = "proposedSalesBalanceCc", description = "Proposed sales ledger balance if this DataFile let through", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("proposedSalesBalanceCc")
  public BigDecimal getProposedSalesBalanceCc() {
    return proposedSalesBalanceCc;
  }

  public void setProposedSalesBalanceCc(BigDecimal proposedSalesBalanceCc) {
    this.proposedSalesBalanceCc = proposedSalesBalanceCc;
  }

  public DataFileSuspendedDetails proposedSalesBalanceChangePercent(Integer proposedSalesBalanceChangePercent) {
    this.proposedSalesBalanceChangePercent = proposedSalesBalanceChangePercent;
    return this;
  }

  /**
   * Proposed Sales Ledger Balance change
   * @return proposedSalesBalanceChangePercent
   */

  @Schema(name = "proposedSalesBalanceChangePercent", description = "Proposed Sales Ledger Balance change", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("proposedSalesBalanceChangePercent")
  public Integer getProposedSalesBalanceChangePercent() {
    return proposedSalesBalanceChangePercent;
  }

  public void setProposedSalesBalanceChangePercent(Integer proposedSalesBalanceChangePercent) {
    this.proposedSalesBalanceChangePercent = proposedSalesBalanceChangePercent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataFileSuspendedDetails dataFileSuspendedDetails = (DataFileSuspendedDetails) o;
    return Objects.equals(this.id, dataFileSuspendedDetails.id) &&
        Objects.equals(this.supsendedDate, dataFileSuspendedDetails.supsendedDate) &&
        Objects.equals(this.previousSalesBalanceCc, dataFileSuspendedDetails.previousSalesBalanceCc) &&
        Objects.equals(this.proposedSalesBalanceCc, dataFileSuspendedDetails.proposedSalesBalanceCc) &&
        Objects.equals(this.proposedSalesBalanceChangePercent, dataFileSuspendedDetails.proposedSalesBalanceChangePercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, supsendedDate, previousSalesBalanceCc, proposedSalesBalanceCc, proposedSalesBalanceChangePercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataFileSuspendedDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    supsendedDate: ").append(toIndentedString(supsendedDate)).append("\n");
    sb.append("    previousSalesBalanceCc: ").append(toIndentedString(previousSalesBalanceCc)).append("\n");
    sb.append("    proposedSalesBalanceCc: ").append(toIndentedString(proposedSalesBalanceCc)).append("\n");
    sb.append("    proposedSalesBalanceChangePercent: ").append(toIndentedString(proposedSalesBalanceChangePercent)).append("\n");
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

