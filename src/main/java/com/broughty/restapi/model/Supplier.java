package com.broughty.restapi.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.math.BigDecimal;

import org.springframework.lang.Nullable;

import java.time.OffsetDateTime;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

import jakarta.annotation.Generated;

/**
 * The Supplier record represents a supplier on the Purchase Ledger.  All Supplier records on the Purchase Ledger (accounts payable) should be extracted.  Supplier Items are pulledbut the balance of the open creditor items is not so it is vital the Supplier.Balance is extracted from the accounting package.   The OA Service will truncate all field values if they exceed the maximum size limit.
 */

@Schema(name = "Supplier", description = "The Supplier record represents a supplier on the Purchase Ledger.  All Supplier records on the Purchase Ledger (accounts payable) should be extracted.  Supplier Items are pulledbut the balance of the open creditor items is not so it is vital the Supplier.Balance is extracted from the accounting package.   The OA Service will truncate all field values if they exceed the maximum size limit.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-01T19:26:55.251389700Z[Europe/London]", comments = "Generator version: 7.11.0")
public class Supplier {

  private String accountName;

  private String uniqueKey;

  private @Nullable String reference;

  private @Nullable String address1;

  private @Nullable String address3;

  private @Nullable String address4;

  private @Nullable String countryCode;

  private @Nullable String postCode;

  private @Nullable String contact;

  private @Nullable String email;

  private @Nullable String contactPhone;

  private @Nullable String fax;

  private @Nullable String fingerprint;

  private @Nullable BigDecimal balancePackage;

  private @Nullable BigDecimal balanceAc;

  private @Nullable BigDecimal balanceCc;

  private @Nullable BigDecimal balanceSc;

  private @Nullable BigDecimal overdueAc;

  private @Nullable BigDecimal overdueCc;

  private @Nullable BigDecimal overdueSc;

  private @Nullable String ledgerCurrencyCode;

  private @Nullable String itemReceivedDate;

  private @Nullable Boolean takeOn;

  private @Nullable Integer itemCreatedId;

  private @Nullable String externalRef1;

  private @Nullable String currencyCode;

  private @Nullable String address2;

  public Supplier() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Supplier(String accountName, String uniqueKey) {
    this.accountName = accountName;
    this.uniqueKey = uniqueKey;
  }

  public Supplier accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Supplier name
   *
   * @return accountName
   */
  @NotNull
  @Size(max = 60)
  @Schema(name = "accountName", description = "Supplier name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accountName")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public Supplier uniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
    return this;
  }

  /**
   * A value that can be guaranteed to be unique and static for each extracted Supplier per Company
   *
   * @return uniqueKey
   */
  @NotNull
  @Size(min = 1, max = 50)
  @Schema(name = "uniqueKey", description = "   A value that can be guaranteed to be unique and static for each extracted Supplier per Company", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("uniqueKey")
  public String getUniqueKey() {
    return uniqueKey;
  }

  public void setUniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
  }

  public Supplier reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Supplier reference
   *
   * @return reference
   */
  @Size(max = 30)
  @Schema(name = "reference", description = "Supplier reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reference")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Supplier address1(String address1) {
    this.address1 = address1;
    return this;
  }

  /**
   * Address Line 1
   *
   * @return address1
   */
  @Size(max = 60)
  @Schema(name = "address1", description = "Address Line 1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address1")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Supplier address3(String address3) {
    this.address3 = address3;
    return this;
  }

  /**
   * Address Line 3
   *
   * @return address3
   */

  @Schema(name = "address3", description = "Address Line 3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address3")
  public String getAddress3() {
    return address3;
  }

  public void setAddress3(String address3) {
    this.address3 = address3;
  }

  public Supplier address4(String address4) {
    this.address4 = address4;
    return this;
  }

  /**
   * Get address4
   *
   * @return address4
   */

  @Schema(name = "address4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address4")
  public String getAddress4() {
    return address4;
  }

  public void setAddress4(String address4) {
    this.address4 = address4;
  }

  public Supplier countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Get countryCode
   *
   * @return countryCode
   */

  @Schema(name = "countryCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Supplier postCode(String postCode) {
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

  public Supplier contact(String contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   *
   * @return contact
   */

  @Schema(name = "contact", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contact")
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public Supplier email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   *
   * @return email
   */

  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Supplier contactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
    return this;
  }

  /**
   * Get contactPhone
   *
   * @return contactPhone
   */

  @Schema(name = "contactPhone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactPhone")
  public String getContactPhone() {
    return contactPhone;
  }

  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }

  public Supplier fax(String fax) {
    this.fax = fax;
    return this;
  }

  /**
   * Get fax
   *
   * @return fax
   */

  @Schema(name = "fax", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fax")
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public Supplier fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Get fingerprint
   *
   * @return fingerprint
   */

  @Schema(name = "fingerprint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fingerprint")
  public String getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }

  public Supplier balancePackage(BigDecimal balancePackage) {
    this.balancePackage = balancePackage;
    return this;
  }

  /**
   * Get balancePackage
   *
   * @return balancePackage
   */
  @Valid
  @Schema(name = "balancePackage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balancePackage")
  public BigDecimal getBalancePackage() {
    return balancePackage;
  }

  public void setBalancePackage(BigDecimal balancePackage) {
    this.balancePackage = balancePackage;
  }

  public Supplier balanceAc(BigDecimal balanceAc) {
    this.balanceAc = balanceAc;
    return this;
  }

  /**
   * Get balanceAc
   *
   * @return balanceAc
   */
  @Valid
  @Schema(name = "balanceAc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceAc")
  public BigDecimal getBalanceAc() {
    return balanceAc;
  }

  public void setBalanceAc(BigDecimal balanceAc) {
    this.balanceAc = balanceAc;
  }

  public Supplier balanceCc(BigDecimal balanceCc) {
    this.balanceCc = balanceCc;
    return this;
  }

  /**
   * Get balanceCc
   *
   * @return balanceCc
   */
  @Valid
  @Schema(name = "balanceCc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceCc")
  public BigDecimal getBalanceCc() {
    return balanceCc;
  }

  public void setBalanceCc(BigDecimal balanceCc) {
    this.balanceCc = balanceCc;
  }

  public Supplier balanceSc(BigDecimal balanceSc) {
    this.balanceSc = balanceSc;
    return this;
  }

  /**
   * Get balanceSc
   *
   * @return balanceSc
   */
  @Valid
  @Schema(name = "balanceSc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceSc")
  public BigDecimal getBalanceSc() {
    return balanceSc;
  }

  public void setBalanceSc(BigDecimal balanceSc) {
    this.balanceSc = balanceSc;
  }

  public Supplier overdueAc(BigDecimal overdueAc) {
    this.overdueAc = overdueAc;
    return this;
  }

  /**
   * Get overdueAc
   *
   * @return overdueAc
   */
  @Valid
  @Schema(name = "overdueAc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("overdueAc")
  public BigDecimal getOverdueAc() {
    return overdueAc;
  }

  public void setOverdueAc(BigDecimal overdueAc) {
    this.overdueAc = overdueAc;
  }

  public Supplier overdueCc(BigDecimal overdueCc) {
    this.overdueCc = overdueCc;
    return this;
  }

  /**
   * Get overdueCc
   *
   * @return overdueCc
   */
  @Valid
  @Schema(name = "overdueCc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("overdueCc")
  public BigDecimal getOverdueCc() {
    return overdueCc;
  }

  public void setOverdueCc(BigDecimal overdueCc) {
    this.overdueCc = overdueCc;
  }

  public Supplier overdueSc(BigDecimal overdueSc) {
    this.overdueSc = overdueSc;
    return this;
  }

  /**
   * Get overdueSc
   *
   * @return overdueSc
   */
  @Valid
  @Schema(name = "overdueSc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("overdueSc")
  public BigDecimal getOverdueSc() {
    return overdueSc;
  }

  public void setOverdueSc(BigDecimal overdueSc) {
    this.overdueSc = overdueSc;
  }

  public Supplier ledgerCurrencyCode(String ledgerCurrencyCode) {
    this.ledgerCurrencyCode = ledgerCurrencyCode;
    return this;
  }

  /**
   * Get ledgerCurrencyCode
   *
   * @return ledgerCurrencyCode
   */

  @Schema(name = "ledgerCurrencyCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ledgerCurrencyCode")
  public String getLedgerCurrencyCode() {
    return ledgerCurrencyCode;
  }

  public void setLedgerCurrencyCode(String ledgerCurrencyCode) {
    this.ledgerCurrencyCode = ledgerCurrencyCode;
  }

  public Supplier itemReceivedDate(String itemReceivedDate) {
    this.itemReceivedDate = itemReceivedDate;
    return this;
  }

  /**
   * Get itemReceivedDate
   *
   * @return itemReceivedDate
   */

  @Schema(name = "itemReceivedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemReceivedDate")
  public String getItemReceivedDate() {
    return itemReceivedDate;
  }

  public void setItemReceivedDate(String itemReceivedDate) {
    this.itemReceivedDate = itemReceivedDate;
  }

  public Supplier takeOn(Boolean takeOn) {
    this.takeOn = takeOn;
    return this;
  }

  /**
   * Get takeOn
   *
   * @return takeOn
   */

  @Schema(name = "takeOn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("takeOn")
  public Boolean getTakeOn() {
    return takeOn;
  }

  public void setTakeOn(Boolean takeOn) {
    this.takeOn = takeOn;
  }

  public Supplier itemCreatedId(Integer itemCreatedId) {
    this.itemCreatedId = itemCreatedId;
    return this;
  }

  /**
   * Get itemCreatedId
   *
   * @return itemCreatedId
   */

  @Schema(name = "itemCreatedId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemCreatedId")
  public Integer getItemCreatedId() {
    return itemCreatedId;
  }

  public void setItemCreatedId(Integer itemCreatedId) {
    this.itemCreatedId = itemCreatedId;
  }

  public Supplier externalRef1(String externalRef1) {
    this.externalRef1 = externalRef1;
    return this;
  }

  /**
   * Get externalRef1
   *
   * @return externalRef1
   */

  @Schema(name = "externalRef1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalRef1")
  public String getExternalRef1() {
    return externalRef1;
  }

  public void setExternalRef1(String externalRef1) {
    this.externalRef1 = externalRef1;
  }

  public Supplier currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   *
   * @return currencyCode
   */

  @Schema(name = "currencyCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Supplier address2(String address2) {
    this.address2 = address2;
    return this;
  }

  /**
   * 2nd line of address
   *
   * @return address2
   */
  @Size(max = 60)
  @Schema(name = "address2", description = "2nd line of address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address2")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Supplier supplier = (Supplier) o;
    return Objects.equals(this.accountName, supplier.accountName) &&
        Objects.equals(this.uniqueKey, supplier.uniqueKey) &&
        Objects.equals(this.reference, supplier.reference) &&
        Objects.equals(this.address1, supplier.address1) &&
        Objects.equals(this.address3, supplier.address3) &&
        Objects.equals(this.address4, supplier.address4) &&
        Objects.equals(this.countryCode, supplier.countryCode) &&
        Objects.equals(this.postCode, supplier.postCode) &&
        Objects.equals(this.contact, supplier.contact) &&
        Objects.equals(this.email, supplier.email) &&
        Objects.equals(this.contactPhone, supplier.contactPhone) &&
        Objects.equals(this.fax, supplier.fax) &&
        Objects.equals(this.fingerprint, supplier.fingerprint) &&
        Objects.equals(this.balancePackage, supplier.balancePackage) &&
        Objects.equals(this.balanceAc, supplier.balanceAc) &&
        Objects.equals(this.balanceCc, supplier.balanceCc) &&
        Objects.equals(this.balanceSc, supplier.balanceSc) &&
        Objects.equals(this.overdueAc, supplier.overdueAc) &&
        Objects.equals(this.overdueCc, supplier.overdueCc) &&
        Objects.equals(this.overdueSc, supplier.overdueSc) &&
        Objects.equals(this.ledgerCurrencyCode, supplier.ledgerCurrencyCode) &&
        Objects.equals(this.itemReceivedDate, supplier.itemReceivedDate) &&
        Objects.equals(this.takeOn, supplier.takeOn) &&
        Objects.equals(this.itemCreatedId, supplier.itemCreatedId) &&
        Objects.equals(this.externalRef1, supplier.externalRef1) &&
        Objects.equals(this.currencyCode, supplier.currencyCode) &&
        Objects.equals(this.address2, supplier.address2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, uniqueKey, reference, address1, address3, address4, countryCode, postCode, contact, email, contactPhone, fax, fingerprint, balancePackage, balanceAc, balanceCc, balanceSc, overdueAc, overdueCc, overdueSc, ledgerCurrencyCode, itemReceivedDate, takeOn, itemCreatedId, externalRef1, currencyCode, address2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Supplier {\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    uniqueKey: ").append(toIndentedString(uniqueKey)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address3: ").append(toIndentedString(address3)).append("\n");
    sb.append("    address4: ").append(toIndentedString(address4)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    contactPhone: ").append(toIndentedString(contactPhone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    balancePackage: ").append(toIndentedString(balancePackage)).append("\n");
    sb.append("    balanceAc: ").append(toIndentedString(balanceAc)).append("\n");
    sb.append("    balanceCc: ").append(toIndentedString(balanceCc)).append("\n");
    sb.append("    balanceSc: ").append(toIndentedString(balanceSc)).append("\n");
    sb.append("    overdueAc: ").append(toIndentedString(overdueAc)).append("\n");
    sb.append("    overdueCc: ").append(toIndentedString(overdueCc)).append("\n");
    sb.append("    overdueSc: ").append(toIndentedString(overdueSc)).append("\n");
    sb.append("    ledgerCurrencyCode: ").append(toIndentedString(ledgerCurrencyCode)).append("\n");
    sb.append("    itemReceivedDate: ").append(toIndentedString(itemReceivedDate)).append("\n");
    sb.append("    takeOn: ").append(toIndentedString(takeOn)).append("\n");
    sb.append("    itemCreatedId: ").append(toIndentedString(itemCreatedId)).append("\n");
    sb.append("    externalRef1: ").append(toIndentedString(externalRef1)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
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

