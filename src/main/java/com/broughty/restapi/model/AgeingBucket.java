package com.broughty.restapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import org.springframework.lang.Nullable;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Represents a bucket for ageing - i.e. 0-30 days.  A group of Ageing Buckets make up an aged Customer or Supplier report
 */

@Schema(name = "AgeingBucket", description = "Represents a bucket for ageing - i.e. 0-30 days.  A group of Ageing Buckets make up an aged Customer or Supplier report")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-02T13:18:41.397887300Z[Europe/London]", comments = "Generator version: 7.11.0")
public class AgeingBucket {

  private @Nullable String companyId;

  private @Nullable String companyRef;

  private @Nullable Integer bucketNumber;

  private @Nullable BigDecimal amountAc;

  private @Nullable Integer itemCount;

  public AgeingBucket companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   *
   * @return companyId
   */
  @Size(min = 36, max = 36)
  @Schema(name = "companyId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("companyId")
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public AgeingBucket companyRef(String companyRef) {
    this.companyRef = companyRef;
    return this;
  }

  /**
   * Company reference
   *
   * @return companyRef
   */

  @Schema(name = "companyRef", description = "Company reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("companyRef")
  public String getCompanyRef() {
    return companyRef;
  }

  public void setCompanyRef(String companyRef) {
    this.companyRef = companyRef;
  }

  public AgeingBucket bucketNumber(Integer bucketNumber) {
    this.bucketNumber = bucketNumber;
    return this;
  }

  /**
   * Bucket number
   *
   * @return bucketNumber
   */

  @Schema(name = "bucketNumber", description = "Bucket number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bucketNumber")
  public Integer getBucketNumber() {
    return bucketNumber;
  }

  public void setBucketNumber(Integer bucketNumber) {
    this.bucketNumber = bucketNumber;
  }

  public AgeingBucket amountAc(BigDecimal amountAc) {
    this.amountAc = amountAc;
    return this;
  }

  /**
   * Ageing amount in Account currency
   *
   * @return amountAc
   */
  @Valid
  @Schema(name = "amountAc", description = "Ageing amount in Account currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amountAc")
  public BigDecimal getAmountAc() {
    return amountAc;
  }

  public void setAmountAc(BigDecimal amountAc) {
    this.amountAc = amountAc;
  }

  public AgeingBucket itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

  /**
   * No of items making up the amountAc
   *
   * @return itemCount
   */

  @Schema(name = "itemCount", description = "No of items making up the amountAc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemCount")
  public Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgeingBucket ageingBucket = (AgeingBucket) o;
    return Objects.equals(this.companyId, ageingBucket.companyId) &&
        Objects.equals(this.companyRef, ageingBucket.companyRef) &&
        Objects.equals(this.bucketNumber, ageingBucket.bucketNumber) &&
        Objects.equals(this.amountAc, ageingBucket.amountAc) &&
        Objects.equals(this.itemCount, ageingBucket.itemCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, companyRef, bucketNumber, amountAc, itemCount);
  }

  @Override
  public String toString() {
    String sb = "class AgeingBucket {\n" +
        "    companyId: " + toIndentedString(companyId) + "\n" +
        "    companyRef: " + toIndentedString(companyRef) + "\n" +
        "    bucketNumber: " + toIndentedString(bucketNumber) + "\n" +
        "    amountAc: " + toIndentedString(amountAc) + "\n" +
        "    itemCount: " + toIndentedString(itemCount) + "\n" +
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

