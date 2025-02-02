package com.broughty.restapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.Size;
import org.springframework.lang.Nullable;

import java.util.Objects;

/**
 * This represents the Company information taken from the originating data source  The Company will hold basic information such as the Client name, address and contact details as well as Tax number and information about the account package the data is being retrieved from and whether it is a multi-currency installation. This information is likely to match the information manually entered into the Client\\Company records in the system api.  Pulling this Company data is optional, apart from for Cloud accounting packages (i.e. Xero, QuickBooks online).  There will typically only be one Company per account package instance.  The OA Service will truncate all field values if they exceed the maximum size limit.
 */

@Schema(name = "PackageInfo", description = "This represents the Company information taken from the originating data source  The Company will hold basic information such as the Client name, address and contact details as well as Tax number and information about the account package the data is being retrieved from and whether it is a multi-currency installation. This information is likely to match the information manually entered into the Client\\Company records in the system api.  Pulling this Company data is optional, apart from for Cloud accounting packages (i.e. Xero, QuickBooks online).  There will typically only be one Company per account package instance.  The OA Service will truncate all field values if they exceed the maximum size limit. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-02T13:18:41.397887300Z[Europe/London]", comments = "Generator version: 7.11.0")
public class PackageInfo {

  private @Nullable String companyId;

  private @Nullable String uniqueKey;

  private @Nullable String fingerprint;

  private @Nullable Integer createdId;

  private @Nullable Integer updatedId;

  private @Nullable String name;

  private @Nullable String reference;

  private @Nullable String address1;

  private @Nullable String address2;

  private @Nullable String address3;

  private @Nullable String postCode;

  private @Nullable String countryCode;

  private @Nullable String contactPhone;

  private @Nullable String duns;

  private @Nullable String taxNo;

  private @Nullable Boolean multiCurrency;

  private @Nullable String startMonth;

  private @Nullable String industryType;

  private @Nullable String packageInfo;

  public PackageInfo companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Company UUID
   *
   * @return companyId
   */
  @Size(min = 36, max = 36)
  @Schema(name = "companyId", description = "Company UUID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("companyId")
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public PackageInfo uniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
    return this;
  }

  /**
   * Unique id of the PackageInfo
   *
   * @return uniqueKey
   */
  @Size(max = 50)
  @Schema(name = "uniqueKey", description = "Unique id of the PackageInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uniqueKey")
  public String getUniqueKey() {
    return uniqueKey;
  }

  public void setUniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
  }

  public PackageInfo fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Get fingerprint
   *
   * @return fingerprint
   */
  @Size(max = 32)
  @Schema(name = "fingerprint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fingerprint")
  public String getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }

  public PackageInfo createdId(Integer createdId) {
    this.createdId = createdId;
    return this;
  }

  /**
   * The Snapshot ID that created this Package Info record
   *
   * @return createdId
   */

  @Schema(name = "createdId", description = "The Snapshot ID that created this Package Info record", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdId")
  public Integer getCreatedId() {
    return createdId;
  }

  public void setCreatedId(Integer createdId) {
    this.createdId = createdId;
  }

  public PackageInfo updatedId(Integer updatedId) {
    this.updatedId = updatedId;
    return this;
  }

  /**
   * The Snapshot ID that updated this Package Info record
   *
   * @return updatedId
   */

  @Schema(name = "updatedId", description = "The Snapshot ID that updated this Package Info record", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedId")
  public Integer getUpdatedId() {
    return updatedId;
  }

  public void setUpdatedId(Integer updatedId) {
    this.updatedId = updatedId;
  }

  public PackageInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the Company
   *
   * @return name
   */
  @Size(max = 60)
  @Schema(name = "name", description = "Name of the Company ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PackageInfo reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   *
   * @return reference
   */
  @Size(max = 30)
  @Schema(name = "reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reference")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public PackageInfo address1(String address1) {
    this.address1 = address1;
    return this;
  }

  /**
   * Get address1
   *
   * @return address1
   */
  @Size(max = 60)
  @Schema(name = "address1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address1")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public PackageInfo address2(String address2) {
    this.address2 = address2;
    return this;
  }

  /**
   * Get address2
   *
   * @return address2
   */
  @Size(max = 60)
  @Schema(name = "address2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address2")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public PackageInfo address3(String address3) {
    this.address3 = address3;
    return this;
  }

  /**
   * Get address3
   *
   * @return address3
   */
  @Size(max = 60)
  @Schema(name = "address3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address3")
  public String getAddress3() {
    return address3;
  }

  public void setAddress3(String address3) {
    this.address3 = address3;
  }

  public PackageInfo postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Get postCode
   *
   * @return postCode
   */
  @Size(max = 20)
  @Schema(name = "postCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postCode")
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public PackageInfo countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Get countryCode
   *
   * @return countryCode
   */
  @Size(max = 2)
  @Schema(name = "countryCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public PackageInfo contactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
    return this;
  }

  /**
   * Get contactPhone
   *
   * @return contactPhone
   */
  @Size(max = 25)
  @Schema(name = "contactPhone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactPhone")
  public String getContactPhone() {
    return contactPhone;
  }

  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }

  public PackageInfo duns(String duns) {
    this.duns = duns;
    return this;
  }

  /**
   * Get duns
   *
   * @return duns
   */
  @Size(max = 20)
  @Schema(name = "duns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("duns")
  public String getDuns() {
    return duns;
  }

  public void setDuns(String duns) {
    this.duns = duns;
  }

  public PackageInfo taxNo(String taxNo) {
    this.taxNo = taxNo;
    return this;
  }

  /**
   * Get taxNo
   *
   * @return taxNo
   */
  @Size(max = 20)
  @Schema(name = "taxNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxNo")
  public String getTaxNo() {
    return taxNo;
  }

  public void setTaxNo(String taxNo) {
    this.taxNo = taxNo;
  }

  public PackageInfo multiCurrency(Boolean multiCurrency) {
    this.multiCurrency = multiCurrency;
    return this;
  }

  /**
   * true if multi-currency company
   *
   * @return multiCurrency
   */

  @Schema(name = "multiCurrency", description = "true if multi-currency company", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("multiCurrency")
  public Boolean getMultiCurrency() {
    return multiCurrency;
  }

  public void setMultiCurrency(Boolean multiCurrency) {
    this.multiCurrency = multiCurrency;
  }

  public PackageInfo startMonth(String startMonth) {
    this.startMonth = startMonth;
    return this;
  }

  /**
   * Compant financial start month
   *
   * @return startMonth
   */

  @Schema(name = "startMonth", description = "Compant financial start month", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startMonth")
  public String getStartMonth() {
    return startMonth;
  }

  public void setStartMonth(String startMonth) {
    this.startMonth = startMonth;
  }

  public PackageInfo industryType(String industryType) {
    this.industryType = industryType;
    return this;
  }

  /**
   * Industry type for the company
   *
   * @return industryType
   */
  @Size(max = 50)
  @Schema(name = "industryType", description = "Industry type for the company", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("industryType")
  public String getIndustryType() {
    return industryType;
  }

  public void setIndustryType(String industryType) {
    this.industryType = industryType;
  }

  public PackageInfo packageInfo(String packageInfo) {
    this.packageInfo = packageInfo;
    return this;
  }

  /**
   * Details in short the accounting package/ERP system
   *
   * @return packageInfo
   */
  @Size(max = 50)
  @Schema(name = "packageInfo", description = "Details in short the accounting package/ERP system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("packageInfo")
  public String getPackageInfo() {
    return packageInfo;
  }

  public void setPackageInfo(String packageInfo) {
    this.packageInfo = packageInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageInfo packageInfo = (PackageInfo) o;
    return Objects.equals(this.companyId, packageInfo.companyId) &&
        Objects.equals(this.uniqueKey, packageInfo.uniqueKey) &&
        Objects.equals(this.fingerprint, packageInfo.fingerprint) &&
        Objects.equals(this.createdId, packageInfo.createdId) &&
        Objects.equals(this.updatedId, packageInfo.updatedId) &&
        Objects.equals(this.name, packageInfo.name) &&
        Objects.equals(this.reference, packageInfo.reference) &&
        Objects.equals(this.address1, packageInfo.address1) &&
        Objects.equals(this.address2, packageInfo.address2) &&
        Objects.equals(this.address3, packageInfo.address3) &&
        Objects.equals(this.postCode, packageInfo.postCode) &&
        Objects.equals(this.countryCode, packageInfo.countryCode) &&
        Objects.equals(this.contactPhone, packageInfo.contactPhone) &&
        Objects.equals(this.duns, packageInfo.duns) &&
        Objects.equals(this.taxNo, packageInfo.taxNo) &&
        Objects.equals(this.multiCurrency, packageInfo.multiCurrency) &&
        Objects.equals(this.startMonth, packageInfo.startMonth) &&
        Objects.equals(this.industryType, packageInfo.industryType) &&
        Objects.equals(this.packageInfo, packageInfo.packageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, uniqueKey, fingerprint, createdId, updatedId, name, reference, address1, address2, address3, postCode, countryCode, contactPhone, duns, taxNo, multiCurrency, startMonth, industryType, packageInfo);
  }

  @Override
  public String toString() {
    String sb = "class PackageInfo {\n" +
        "    companyId: " + toIndentedString(companyId) + "\n" +
        "    uniqueKey: " + toIndentedString(uniqueKey) + "\n" +
        "    fingerprint: " + toIndentedString(fingerprint) + "\n" +
        "    createdId: " + toIndentedString(createdId) + "\n" +
        "    updatedId: " + toIndentedString(updatedId) + "\n" +
        "    name: " + toIndentedString(name) + "\n" +
        "    reference: " + toIndentedString(reference) + "\n" +
        "    address1: " + toIndentedString(address1) + "\n" +
        "    address2: " + toIndentedString(address2) + "\n" +
        "    address3: " + toIndentedString(address3) + "\n" +
        "    postCode: " + toIndentedString(postCode) + "\n" +
        "    countryCode: " + toIndentedString(countryCode) + "\n" +
        "    contactPhone: " + toIndentedString(contactPhone) + "\n" +
        "    duns: " + toIndentedString(duns) + "\n" +
        "    taxNo: " + toIndentedString(taxNo) + "\n" +
        "    multiCurrency: " + toIndentedString(multiCurrency) + "\n" +
        "    startMonth: " + toIndentedString(startMonth) + "\n" +
        "    industryType: " + toIndentedString(industryType) + "\n" +
        "    packageInfo: " + toIndentedString(packageInfo) + "\n" +
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

