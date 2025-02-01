package com.broughty.restapi.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

import java.time.OffsetDateTime;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

import jakarta.annotation.Generated;

/**
 * The Sales Ledger Account - i.e. a Customer/Debtor All Customer records on the Sales Ledger will be pulled.
 */

@Schema(name = "Customer", description = "The Sales Ledger Account - i.e. a Customer/Debtor All Customer records on the Sales Ledger will be pulled.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-01T19:26:55.251389700Z[Europe/London]", comments = "Generator version: 7.11.0")
public class Customer {

  private @Nullable String accountName;

  private String uniqueKey;

  private String reference;

  private @Nullable String address1;

  private @Nullable String address2;

  private @Nullable String address3;

  private @Nullable String address4;

  private @Nullable String countryCode;

  private @Nullable String postCode;

  private @Nullable String contact;

  private @Nullable String email;

  private @Nullable String emailCopy;

  private @Nullable String contactPhone;

  private @Nullable String fax;

  private @Nullable String fingerprint;

  private @Nullable BigDecimal balancePackage;

  private @Nullable BigDecimal balanceAc;

  private @Nullable BigDecimal balanceSc;

  private @Nullable BigDecimal balanceCc;

  private @Nullable BigDecimal overdueAc;

  private @Nullable BigDecimal creditLimitAc;

  private @Nullable BigDecimal creditLimitCc;

  private @Nullable BigDecimal creditLimitSc;

  private @Nullable BigDecimal overdueCc;

  private @Nullable BigDecimal overdueSc;

  private @Nullable String companyCurrencyCode;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate createdDate;

  private @Nullable Boolean takeOn;

  private @Nullable Integer createdId;

  private @Nullable Integer closedId;

  private @Nullable Integer updatedId;

  private @Nullable Integer deletedId;

  private @Nullable String externalRef1;

  private @Nullable String externalRef2;

  private @Nullable String externalRef3;

  private @Nullable String currencyCode;

  private @Nullable Boolean accountNotified;

  private @Nullable Boolean accountAutoNonNotified;

  private @Nullable Boolean export;

  private @Nullable String companyId;

  private @Nullable String vatNumber;

  private @Nullable String dunsNumber;

  private @Nullable String termsCode;

  private @Nullable String termsDescription;

  public Customer() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Customer(String uniqueKey, String reference) {
    this.uniqueKey = uniqueKey;
    this.reference = reference;
  }

  public Customer accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Customer or supplier name
   *
   * @return accountName
   */
  @Size(max = 60)
  @Schema(name = "accountName", description = "Customer or supplier name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountName")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public Customer uniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
    return this;
  }

  /**
   * The ID of the custo mer- a Unique static identifier
   *
   * @return uniqueKey
   */
  @NotNull
  @Size(min = 1, max = 50)
  @Schema(name = "uniqueKey", description = "The ID of the custo mer- a Unique static identifier", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("uniqueKey")
  public String getUniqueKey() {
    return uniqueKey;
  }

  public void setUniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
  }

  public Customer reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   *
   * @return reference
   */
  @NotNull
  @Size(min = 1, max = 30)
  @Schema(name = "reference", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reference")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Customer address1(String address1) {
    this.address1 = address1;
    return this;
  }

  /**
   * Address line 1 field
   *
   * @return address1
   */
  @Size(max = 60)
  @Schema(name = "address1", description = "Address line 1 field", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address1")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Customer address2(String address2) {
    this.address2 = address2;
    return this;
  }

  /**
   * Address line 2 field
   *
   * @return address2
   */
  @Size(max = 60)
  @Schema(name = "address2", description = "Address line 2 field", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address2")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public Customer address3(String address3) {
    this.address3 = address3;
    return this;
  }

  /**
   * Address line 3 field
   *
   * @return address3
   */
  @Size(max = 60)
  @Schema(name = "address3", description = "Address line 3 field", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address3")
  public String getAddress3() {
    return address3;
  }

  public void setAddress3(String address3) {
    this.address3 = address3;
  }

  public Customer address4(String address4) {
    this.address4 = address4;
    return this;
  }

  /**
   * Address line 4 field
   *
   * @return address4
   */
  @Size(max = 60)
  @Schema(name = "address4", description = "Address line 4 field", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address4")
  public String getAddress4() {
    return address4;
  }

  public void setAddress4(String address4) {
    this.address4 = address4;
  }

  public Customer countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * ISO country code - although may contain non ISO country codes
   *
   * @return countryCode
   */
  @Size(max = 2)
  @Schema(name = "countryCode", description = "ISO country code - although may contain non ISO country codes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Customer postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Postal code/Zip code
   *
   * @return postCode
   */
  @Size(max = 20)
  @Schema(name = "postCode", description = "Postal code/Zip code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postCode")
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public Customer contact(String contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Contact details - usually a name
   *
   * @return contact
   */
  @Size(max = 60)
  @Schema(name = "contact", description = "Contact details - usually a name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contact")
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public Customer email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   *
   * @return email
   */
  @Size(max = 128)
  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Customer emailCopy(String emailCopy) {
    this.emailCopy = emailCopy;
    return this;
  }

  /**
   * Get emailCopy
   *
   * @return emailCopy
   */
  @Size(max = 128)
  @Schema(name = "email_copy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email_copy")
  public String getEmailCopy() {
    return emailCopy;
  }

  public void setEmailCopy(String emailCopy) {
    this.emailCopy = emailCopy;
  }

  public Customer contactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
    return this;
  }

  /**
   * The contacts phone number
   *
   * @return contactPhone
   */
  @Size(max = 25)
  @Schema(name = "contactPhone", description = "The contacts phone number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactPhone")
  public String getContactPhone() {
    return contactPhone;
  }

  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }

  public Customer fax(String fax) {
    this.fax = fax;
    return this;
  }

  /**
   * Fax or other contact number
   *
   * @return fax
   */
  @Size(max = 25)
  @Schema(name = "fax", description = "Fax or other contact number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fax")
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public Customer fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Internal hash code of Customer.  Will change when the customer changes
   *
   * @return fingerprint
   */
  @Size(max = 32)
  @Schema(name = "fingerprint", description = "Internal hash code of Customer.  Will change when the customer changes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fingerprint")
  public String getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }

  public Customer balancePackage(BigDecimal balancePackage) {
    this.balancePackage = balancePackage;
    return this;
  }

  /**
   * The Customer balance as reported in the origiu
   *
   * @return balancePackage
   */
  @Valid
  @Schema(name = "balancePackage", description = "The Customer balance as reported in the origiu", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balancePackage")
  public BigDecimal getBalancePackage() {
    return balancePackage;
  }

  public void setBalancePackage(BigDecimal balancePackage) {
    this.balancePackage = balancePackage;
  }

  public Customer balanceAc(BigDecimal balanceAc) {
    this.balanceAc = balanceAc;
    return this;
  }

  /**
   * Sales balance in account currency - i.e. the currencyCode.
   *
   * @return balanceAc
   */
  @Valid
  @Schema(name = "balanceAc", description = "Sales balance in account currency - i.e. the currencyCode.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceAc")
  public BigDecimal getBalanceAc() {
    return balanceAc;
  }

  public void setBalanceAc(BigDecimal balanceAc) {
    this.balanceAc = balanceAc;
  }

  public Customer balanceSc(BigDecimal balanceSc) {
    this.balanceSc = balanceSc;
    return this;
  }

  /**
   * Sales balance in System  currency.
   *
   * @return balanceSc
   */
  @Valid
  @Schema(name = "balanceSc", description = "Sales balance in System  currency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceSc")
  public BigDecimal getBalanceSc() {
    return balanceSc;
  }

  public void setBalanceSc(BigDecimal balanceSc) {
    this.balanceSc = balanceSc;
  }

  public Customer balanceCc(BigDecimal balanceCc) {
    this.balanceCc = balanceCc;
    return this;
  }

  /**
   * Sales balance in Company currency.
   *
   * @return balanceCc
   */
  @Valid
  @Schema(name = "balanceCc", description = "Sales balance in Company currency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceCc")
  public BigDecimal getBalanceCc() {
    return balanceCc;
  }

  public void setBalanceCc(BigDecimal balanceCc) {
    this.balanceCc = balanceCc;
  }

  public Customer overdueAc(BigDecimal overdueAc) {
    this.overdueAc = overdueAc;
    return this;
  }

  /**
   * Overdue balance in Customer  currency.
   *
   * @return overdueAc
   */
  @Valid
  @Schema(name = "overdueAc", description = "Overdue balance in Customer  currency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("overdueAc")
  public BigDecimal getOverdueAc() {
    return overdueAc;
  }

  public void setOverdueAc(BigDecimal overdueAc) {
    this.overdueAc = overdueAc;
  }

  public Customer creditLimitAc(BigDecimal creditLimitAc) {
    this.creditLimitAc = creditLimitAc;
    return this;
  }

  /**
   * Originating data source credit limit value on account currency.
   *
   * @return creditLimitAc
   */
  @Valid
  @Schema(name = "creditLimitAc", description = "Originating data source credit limit value on account currency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditLimitAc")
  public BigDecimal getCreditLimitAc() {
    return creditLimitAc;
  }

  public void setCreditLimitAc(BigDecimal creditLimitAc) {
    this.creditLimitAc = creditLimitAc;
  }

  public Customer creditLimitCc(BigDecimal creditLimitCc) {
    this.creditLimitCc = creditLimitCc;
    return this;
  }

  /**
   * Originating data source credit limit value in company currency.
   *
   * @return creditLimitCc
   */
  @Valid
  @Schema(name = "creditLimitCc", description = "Originating data source credit limit value in company currency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditLimitCc")
  public BigDecimal getCreditLimitCc() {
    return creditLimitCc;
  }

  public void setCreditLimitCc(BigDecimal creditLimitCc) {
    this.creditLimitCc = creditLimitCc;
  }

  public Customer creditLimitSc(BigDecimal creditLimitSc) {
    this.creditLimitSc = creditLimitSc;
    return this;
  }

  /**
   * Originating data source credit limit value in System currency.
   *
   * @return creditLimitSc
   */
  @Valid
  @Schema(name = "creditLimitSc", description = "Originating data source credit limit value in System currency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditLimitSc")
  public BigDecimal getCreditLimitSc() {
    return creditLimitSc;
  }

  public void setCreditLimitSc(BigDecimal creditLimitSc) {
    this.creditLimitSc = creditLimitSc;
  }

  public Customer overdueCc(BigDecimal overdueCc) {
    this.overdueCc = overdueCc;
    return this;
  }

  /**
   * Overdue balance in Company currency.
   *
   * @return overdueCc
   */
  @Valid
  @Schema(name = "overdueCc", description = "Overdue balance in Company currency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("overdueCc")
  public BigDecimal getOverdueCc() {
    return overdueCc;
  }

  public void setOverdueCc(BigDecimal overdueCc) {
    this.overdueCc = overdueCc;
  }

  public Customer overdueSc(BigDecimal overdueSc) {
    this.overdueSc = overdueSc;
    return this;
  }

  /**
   * Overdue balance in System currency.
   *
   * @return overdueSc
   */
  @Valid
  @Schema(name = "overdueSc", description = "Overdue balance in System currency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("overdueSc")
  public BigDecimal getOverdueSc() {
    return overdueSc;
  }

  public void setOverdueSc(BigDecimal overdueSc) {
    this.overdueSc = overdueSc;
  }

  public Customer companyCurrencyCode(String companyCurrencyCode) {
    this.companyCurrencyCode = companyCurrencyCode;
    return this;
  }

  /**
   * Company Currency Code
   *
   * @return companyCurrencyCode
   */

  @Schema(name = "companyCurrencyCode", description = "Company Currency Code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("companyCurrencyCode")
  public String getCompanyCurrencyCode() {
    return companyCurrencyCode;
  }

  public void setCompanyCurrencyCode(String companyCurrencyCode) {
    this.companyCurrencyCode = companyCurrencyCode;
  }

  public Customer createdDate(LocalDate createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Snapshot Customer creation date- i.e. the Snapshot createdId date
   *
   * @return createdDate
   */
  @Valid
  @Schema(name = "createdDate", description = "Snapshot Customer creation date- i.e. the Snapshot createdId date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdDate")
  public LocalDate getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDate createdDate) {
    this.createdDate = createdDate;
  }

  public Customer takeOn(Boolean takeOn) {
    this.takeOn = takeOn;
    return this;
  }

  /**
   * True if the Customer was created by the take-on (first) Snapshot for the Company.
   *
   * @return takeOn
   */

  @Schema(name = "takeOn", description = "True if the Customer was created by the take-on (first) Snapshot for the Company.  ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("takeOn")
  public Boolean getTakeOn() {
    return takeOn;
  }

  public void setTakeOn(Boolean takeOn) {
    this.takeOn = takeOn;
  }

  public Customer createdId(Integer createdId) {
    this.createdId = createdId;
    return this;
  }

  /**
   * Snapshot that created the Customer
   *
   * @return createdId
   */

  @Schema(name = "createdId", description = "Snapshot that created the Customer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdId")
  public Integer getCreatedId() {
    return createdId;
  }

  public void setCreatedId(Integer createdId) {
    this.createdId = createdId;
  }

  public Customer closedId(Integer closedId) {
    this.closedId = closedId;
    return this;
  }

  /**
   * Snapshot that closed the Customer,  Customers aren't typically closed
   *
   * @return closedId
   */

  @Schema(name = "closedId", description = "Snapshot that closed the Customer,  Customers aren't typically closed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("closedId")
  public Integer getClosedId() {
    return closedId;
  }

  public void setClosedId(Integer closedId) {
    this.closedId = closedId;
  }

  public Customer updatedId(Integer updatedId) {
    this.updatedId = updatedId;
    return this;
  }

  /**
   * Snapshot that updated the Customer.  Balance changes do not count as a change
   *
   * @return updatedId
   */

  @Schema(name = "updatedId", description = "Snapshot that updated the Customer.  Balance changes do not count as a change", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedId")
  public Integer getUpdatedId() {
    return updatedId;
  }

  public void setUpdatedId(Integer updatedId) {
    this.updatedId = updatedId;
  }

  public Customer deletedId(Integer deletedId) {
    this.deletedId = deletedId;
    return this;
  }

  /**
   * Snapshot that deleted the Customer.  This will usually be null
   *
   * @return deletedId
   */

  @Schema(name = "deletedId", description = "Snapshot that deleted the Customer.  This will usually be null", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deletedId")
  public Integer getDeletedId() {
    return deletedId;
  }

  public void setDeletedId(Integer deletedId) {
    this.deletedId = deletedId;
  }

  public Customer externalRef1(String externalRef1) {
    this.externalRef1 = externalRef1;
    return this;
  }

  /**
   * Extra field information.  Populated slightly differently depending on originating data source.
   *
   * @return externalRef1
   */
  @Size(max = 255)
  @Schema(name = "externalRef1", description = "Extra field information.  Populated slightly differently depending on originating data source.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalRef1")
  public String getExternalRef1() {
    return externalRef1;
  }

  public void setExternalRef1(String externalRef1) {
    this.externalRef1 = externalRef1;
  }

  public Customer externalRef2(String externalRef2) {
    this.externalRef2 = externalRef2;
    return this;
  }

  /**
   * Extra field information.  Populated slightly differently depending on originating data source.
   *
   * @return externalRef2
   */
  @Size(max = 255)
  @Schema(name = "externalRef2", description = "Extra field information.  Populated slightly differently depending on originating data source.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalRef2")
  public String getExternalRef2() {
    return externalRef2;
  }

  public void setExternalRef2(String externalRef2) {
    this.externalRef2 = externalRef2;
  }

  public Customer externalRef3(String externalRef3) {
    this.externalRef3 = externalRef3;
    return this;
  }

  /**
   * Extra field information.  Populated slightly differently depending on originating data source.
   *
   * @return externalRef3
   */
  @Size(max = 255)
  @Schema(name = "externalRef3", description = "Extra field information.  Populated slightly differently depending on originating data source.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalRef3")
  public String getExternalRef3() {
    return externalRef3;
  }

  public void setExternalRef3(String externalRef3) {
    this.externalRef3 = externalRef3;
  }

  public Customer currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * ISO currency code.  All items on the Customer will be in this currency.    **Note** - some data sources will allow the field to be populated with non ISO currency codes.
   *
   * @return currencyCode
   */
  @Size(max = 3)
  @Schema(name = "currencyCode", description = "ISO currency code.  All items on the Customer will be in this currency.    **Note** - some data sources will allow the field to be populated with non ISO currency codes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Customer accountNotified(Boolean accountNotified) {
    this.accountNotified = accountNotified;
    return this;
  }

  /**
   * true if Customer is notified
   *
   * @return accountNotified
   */

  @Schema(name = "accountNotified", description = "true if Customer is notified", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountNotified")
  public Boolean getAccountNotified() {
    return accountNotified;
  }

  public void setAccountNotified(Boolean accountNotified) {
    this.accountNotified = accountNotified;
  }

  public Customer accountAutoNonNotified(Boolean accountAutoNonNotified) {
    this.accountAutoNonNotified = accountAutoNonNotified;
    return this;
  }

  /**
   * true if Customer non notified at take-on due to zero balance.
   *
   * @return accountAutoNonNotified
   */

  @Schema(name = "accountAutoNonNotified", description = "true if Customer non notified at take-on due to zero balance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountAutoNonNotified")
  public Boolean getAccountAutoNonNotified() {
    return accountAutoNonNotified;
  }

  public void setAccountAutoNonNotified(Boolean accountAutoNonNotified) {
    this.accountAutoNonNotified = accountAutoNonNotified;
  }

  public Customer export(Boolean export) {
    this.export = export;
    return this;
  }

  /**
   * true - If Customer flagged as Export.  This is not set by the originating data source, but is a manual process by an Open Accounting back office user.
   *
   * @return export
   */

  @Schema(name = "export", description = "true - If Customer flagged as Export.  This is not set by the originating data source, but is a manual process by an Open Accounting back office user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("export")
  public Boolean getExport() {
    return export;
  }

  public void setExport(Boolean export) {
    this.export = export;
  }

  public Customer companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * The owning Company ID UUID
   *
   * @return companyId
   */
  @Size(min = 36, max = 36)
  @Schema(name = "companyId", description = "The owning Company ID UUID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("companyId")
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public Customer vatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
    return this;
  }

  /**
   * Company registration number
   *
   * @return vatNumber
   */
  @Size(max = 20)
  @Schema(name = "vatNumber", description = "Company registration number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vatNumber")
  public String getVatNumber() {
    return vatNumber;
  }

  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }

  public Customer dunsNumber(String dunsNumber) {
    this.dunsNumber = dunsNumber;
    return this;
  }

  /**
   * DUNS number
   *
   * @return dunsNumber
   */
  @Size(max = 20)
  @Schema(name = "dunsNumber", description = "DUNS number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dunsNumber")
  public String getDunsNumber() {
    return dunsNumber;
  }

  public void setDunsNumber(String dunsNumber) {
    this.dunsNumber = dunsNumber;
  }

  public Customer termsCode(String termsCode) {
    this.termsCode = termsCode;
    return this;
  }

  /**
   * Optional terms code
   *
   * @return termsCode
   */
  @Size(max = 2)
  @Schema(name = "termsCode", description = "Optional terms code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("termsCode")
  public String getTermsCode() {
    return termsCode;
  }

  public void setTermsCode(String termsCode) {
    this.termsCode = termsCode;
  }

  public Customer termsDescription(String termsDescription) {
    this.termsDescription = termsDescription;
    return this;
  }

  /**
   * Optional terms description for the code - i.e. 90 days
   *
   * @return termsDescription
   */
  @Size(max = 60)
  @Schema(name = "termsDescription", description = "Optional terms description for the code - i.e. 90 days", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("termsDescription")
  public String getTermsDescription() {
    return termsDescription;
  }

  public void setTermsDescription(String termsDescription) {
    this.termsDescription = termsDescription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.accountName, customer.accountName) &&
        Objects.equals(this.uniqueKey, customer.uniqueKey) &&
        Objects.equals(this.reference, customer.reference) &&
        Objects.equals(this.address1, customer.address1) &&
        Objects.equals(this.address2, customer.address2) &&
        Objects.equals(this.address3, customer.address3) &&
        Objects.equals(this.address4, customer.address4) &&
        Objects.equals(this.countryCode, customer.countryCode) &&
        Objects.equals(this.postCode, customer.postCode) &&
        Objects.equals(this.contact, customer.contact) &&
        Objects.equals(this.email, customer.email) &&
        Objects.equals(this.emailCopy, customer.emailCopy) &&
        Objects.equals(this.contactPhone, customer.contactPhone) &&
        Objects.equals(this.fax, customer.fax) &&
        Objects.equals(this.fingerprint, customer.fingerprint) &&
        Objects.equals(this.balancePackage, customer.balancePackage) &&
        Objects.equals(this.balanceAc, customer.balanceAc) &&
        Objects.equals(this.balanceSc, customer.balanceSc) &&
        Objects.equals(this.balanceCc, customer.balanceCc) &&
        Objects.equals(this.overdueAc, customer.overdueAc) &&
        Objects.equals(this.creditLimitAc, customer.creditLimitAc) &&
        Objects.equals(this.creditLimitCc, customer.creditLimitCc) &&
        Objects.equals(this.creditLimitSc, customer.creditLimitSc) &&
        Objects.equals(this.overdueCc, customer.overdueCc) &&
        Objects.equals(this.overdueSc, customer.overdueSc) &&
        Objects.equals(this.companyCurrencyCode, customer.companyCurrencyCode) &&
        Objects.equals(this.createdDate, customer.createdDate) &&
        Objects.equals(this.takeOn, customer.takeOn) &&
        Objects.equals(this.createdId, customer.createdId) &&
        Objects.equals(this.closedId, customer.closedId) &&
        Objects.equals(this.updatedId, customer.updatedId) &&
        Objects.equals(this.deletedId, customer.deletedId) &&
        Objects.equals(this.externalRef1, customer.externalRef1) &&
        Objects.equals(this.externalRef2, customer.externalRef2) &&
        Objects.equals(this.externalRef3, customer.externalRef3) &&
        Objects.equals(this.currencyCode, customer.currencyCode) &&
        Objects.equals(this.accountNotified, customer.accountNotified) &&
        Objects.equals(this.accountAutoNonNotified, customer.accountAutoNonNotified) &&
        Objects.equals(this.export, customer.export) &&
        Objects.equals(this.companyId, customer.companyId) &&
        Objects.equals(this.vatNumber, customer.vatNumber) &&
        Objects.equals(this.dunsNumber, customer.dunsNumber) &&
        Objects.equals(this.termsCode, customer.termsCode) &&
        Objects.equals(this.termsDescription, customer.termsDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, uniqueKey, reference, address1, address2, address3, address4, countryCode, postCode, contact, email, emailCopy, contactPhone, fax, fingerprint, balancePackage, balanceAc, balanceSc, balanceCc, overdueAc, creditLimitAc, creditLimitCc, creditLimitSc, overdueCc, overdueSc, companyCurrencyCode, createdDate, takeOn, createdId, closedId, updatedId, deletedId, externalRef1, externalRef2, externalRef3, currencyCode, accountNotified, accountAutoNonNotified, export, companyId, vatNumber, dunsNumber, termsCode, termsDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    uniqueKey: ").append(toIndentedString(uniqueKey)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    address3: ").append(toIndentedString(address3)).append("\n");
    sb.append("    address4: ").append(toIndentedString(address4)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailCopy: ").append(toIndentedString(emailCopy)).append("\n");
    sb.append("    contactPhone: ").append(toIndentedString(contactPhone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    balancePackage: ").append(toIndentedString(balancePackage)).append("\n");
    sb.append("    balanceAc: ").append(toIndentedString(balanceAc)).append("\n");
    sb.append("    balanceSc: ").append(toIndentedString(balanceSc)).append("\n");
    sb.append("    balanceCc: ").append(toIndentedString(balanceCc)).append("\n");
    sb.append("    overdueAc: ").append(toIndentedString(overdueAc)).append("\n");
    sb.append("    creditLimitAc: ").append(toIndentedString(creditLimitAc)).append("\n");
    sb.append("    creditLimitCc: ").append(toIndentedString(creditLimitCc)).append("\n");
    sb.append("    creditLimitSc: ").append(toIndentedString(creditLimitSc)).append("\n");
    sb.append("    overdueCc: ").append(toIndentedString(overdueCc)).append("\n");
    sb.append("    overdueSc: ").append(toIndentedString(overdueSc)).append("\n");
    sb.append("    companyCurrencyCode: ").append(toIndentedString(companyCurrencyCode)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    takeOn: ").append(toIndentedString(takeOn)).append("\n");
    sb.append("    createdId: ").append(toIndentedString(createdId)).append("\n");
    sb.append("    closedId: ").append(toIndentedString(closedId)).append("\n");
    sb.append("    updatedId: ").append(toIndentedString(updatedId)).append("\n");
    sb.append("    deletedId: ").append(toIndentedString(deletedId)).append("\n");
    sb.append("    externalRef1: ").append(toIndentedString(externalRef1)).append("\n");
    sb.append("    externalRef2: ").append(toIndentedString(externalRef2)).append("\n");
    sb.append("    externalRef3: ").append(toIndentedString(externalRef3)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    accountNotified: ").append(toIndentedString(accountNotified)).append("\n");
    sb.append("    accountAutoNonNotified: ").append(toIndentedString(accountAutoNonNotified)).append("\n");
    sb.append("    export: ").append(toIndentedString(export)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
    sb.append("    dunsNumber: ").append(toIndentedString(dunsNumber)).append("\n");
    sb.append("    termsCode: ").append(toIndentedString(termsCode)).append("\n");
    sb.append("    termsDescription: ").append(toIndentedString(termsDescription)).append("\n");
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

