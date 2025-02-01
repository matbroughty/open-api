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
 * The Bank record represents a Bank in the accounting package. These may not necessarily be high street banks (although they typically will be), but they could also be other accounts used to process cash in the accounting package (for instance Petty Cash, if recorded).  Bank Items belonging to the Bank and making up the statement items can be pulled but the balance of the Bank is taken from the Bank objects themselves so it is vital the Bank.BalanceBankCurrency is extracted from the accounting package.  The OA service will truncate all field values if they exceed the maximum size limit.
 */

@Schema(name = "Bank", description = "The Bank record represents a Bank in the accounting package. These may not necessarily be high street banks (although they typically will be), but they could also be other accounts used to process cash in the accounting package (for instance Petty Cash, if recorded).  Bank Items belonging to the Bank and making up the statement items can be pulled but the balance of the Bank is taken from the Bank objects themselves so it is vital the Bank.BalanceBankCurrency is extracted from the accounting package.  The OA service will truncate all field values if they exceed the maximum size limit. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-01T19:26:55.251389700Z[Europe/London]", comments = "Generator version: 7.11.0")
public class Bank {

  private String companyId;

  private String uniqueKey;

  private @Nullable String fingerprint;

  private @Nullable Integer createdId;

  private @Nullable Integer deletedId;

  private @Nullable Integer updatedId;

  private @Nullable Integer closedId;

  private @Nullable String name;

  private @Nullable String reference;

  private @Nullable String address1;

  private @Nullable String address2;

  private @Nullable String address3;

  private @Nullable String address4;

  private @Nullable String postCode;

  private @Nullable String contact;

  private @Nullable BigDecimal balanceBankBc;

  private @Nullable BigDecimal balanceBankCc;

  private @Nullable BigDecimal balanceBankSc;

  private @Nullable BigDecimal balanceItemsBc;

  private @Nullable BigDecimal balanceItemsCc;

  private @Nullable BigDecimal balanceItemsSc;

  private @Nullable String description;

  private @Nullable String accountName;

  private @Nullable String sortCode;

  private @Nullable String swiftCode;

  private @Nullable String accountNumber;

  private @Nullable BigDecimal overdraft;

  private @Nullable String iban;

  public Bank() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Bank(String companyId, String uniqueKey) {
    this.companyId = companyId;
    this.uniqueKey = uniqueKey;
  }

  public Bank companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Owning company UUID
   *
   * @return companyId
   */
  @NotNull
  @Size(min = 36, max = 36)
  @Schema(name = "companyId", description = "Owning company UUID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("companyId")
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public Bank uniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
    return this;
  }

  /**
   * A value that can be guaranteed to be unique and static for each extracted Bank.
   *
   * @return uniqueKey
   */
  @NotNull
  @Schema(name = "uniqueKey", description = "A value that can be guaranteed to be unique and static for each extracted Bank.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("uniqueKey")
  public String getUniqueKey() {
    return uniqueKey;
  }

  public void setUniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
  }

  public Bank fingerprint(String fingerprint) {
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

  public Bank createdId(Integer createdId) {
    this.createdId = createdId;
    return this;
  }

  /**
   * Snapshot that created the Bank
   *
   * @return createdId
   */

  @Schema(name = "createdId", description = "Snapshot that created the Bank", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdId")
  public Integer getCreatedId() {
    return createdId;
  }

  public void setCreatedId(Integer createdId) {
    this.createdId = createdId;
  }

  public Bank deletedId(Integer deletedId) {
    this.deletedId = deletedId;
    return this;
  }

  /**
   * Snapshot that deleted the Bank
   *
   * @return deletedId
   */

  @Schema(name = "deletedId", description = "Snapshot that deleted the Bank", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deletedId")
  public Integer getDeletedId() {
    return deletedId;
  }

  public void setDeletedId(Integer deletedId) {
    this.deletedId = deletedId;
  }

  public Bank updatedId(Integer updatedId) {
    this.updatedId = updatedId;
    return this;
  }

  /**
   * Snapshot that updated the Bank
   *
   * @return updatedId
   */

  @Schema(name = "updatedId", description = "Snapshot that updated the Bank", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedId")
  public Integer getUpdatedId() {
    return updatedId;
  }

  public void setUpdatedId(Integer updatedId) {
    this.updatedId = updatedId;
  }

  public Bank closedId(Integer closedId) {
    this.closedId = closedId;
    return this;
  }

  /**
   * Snapshot that closed the Bank record
   *
   * @return closedId
   */

  @Schema(name = "closedId", description = "Snapshot that closed the Bank record", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("closedId")
  public Integer getClosedId() {
    return closedId;
  }

  public void setClosedId(Integer closedId) {
    this.closedId = closedId;
  }

  public Bank name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the bank - for instance HSBC, Lloyds, Barclays etc.
   *
   * @return name
   */
  @Size(max = 60)
  @Schema(name = "name", description = "   Name of the bank - for instance HSBC, Lloyds, Barclays etc.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Bank reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Reference for Bank in account package
   *
   * @return reference
   */
  @Size(max = 30)
  @Schema(name = "reference", description = "Reference for Bank in account package", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reference")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Bank address1(String address1) {
    this.address1 = address1;
    return this;
  }

  /**
   * First line of bank's postal address.
   *
   * @return address1
   */
  @Size(max = 60)
  @Schema(name = "address1", description = "First line of bank's postal address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address1")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Bank address2(String address2) {
    this.address2 = address2;
    return this;
  }

  /**
   * Second line of bank's postal address.
   *
   * @return address2
   */
  @Size(max = 60)
  @Schema(name = "address2", description = "Second line of bank's postal address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address2")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public Bank address3(String address3) {
    this.address3 = address3;
    return this;
  }

  /**
   * Third line of bank's postal address.
   *
   * @return address3
   */
  @Size(max = 60)
  @Schema(name = "address3", description = "Third line of bank's postal address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address3")
  public String getAddress3() {
    return address3;
  }

  public void setAddress3(String address3) {
    this.address3 = address3;
  }

  public Bank address4(String address4) {
    this.address4 = address4;
    return this;
  }

  /**
   * Fourth line of bank's postal address.
   *
   * @return address4
   */
  @Size(max = 60)
  @Schema(name = "address4", description = "Fourth line of bank's postal address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address4")
  public String getAddress4() {
    return address4;
  }

  public void setAddress4(String address4) {
    this.address4 = address4;
  }

  public Bank postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Post/Zip code of bank's postal address.
   *
   * @return postCode
   */
  @Size(max = 20)
  @Schema(name = "postCode", description = "Post/Zip code of bank's postal address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postCode")
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public Bank contact(String contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Name of Contact for this Bank.
   *
   * @return contact
   */
  @Size(max = 60)
  @Schema(name = "contact", description = "Name of Contact for this Bank.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contact")
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public Bank balanceBankBc(BigDecimal balanceBankBc) {
    this.balanceBankBc = balanceBankBc;
    return this;
  }

  /**
   * Current Bank Balance in Bank.CurrencyCode. Not mandatory but for the Bank information to be useful this should be populated
   *
   * @return balanceBankBc
   */
  @Valid
  @Schema(name = "balanceBankBc", description = "Current Bank Balance in Bank.CurrencyCode. Not mandatory but for the Bank information to be useful this should be populated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceBankBc")
  public BigDecimal getBalanceBankBc() {
    return balanceBankBc;
  }

  public void setBalanceBankBc(BigDecimal balanceBankBc) {
    this.balanceBankBc = balanceBankBc;
  }

  public Bank balanceBankCc(BigDecimal balanceBankCc) {
    this.balanceBankCc = balanceBankCc;
    return this;
  }

  /**
   * Current Bank Balance in Company currency. Not mandatory but for the Bank information to be useful this should be populated
   *
   * @return balanceBankCc
   */
  @Valid
  @Schema(name = "balanceBankCc", description = "Current Bank Balance in Company currency. Not mandatory but for the Bank information to be useful this should be populated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceBankCc")
  public BigDecimal getBalanceBankCc() {
    return balanceBankCc;
  }

  public void setBalanceBankCc(BigDecimal balanceBankCc) {
    this.balanceBankCc = balanceBankCc;
  }

  public Bank balanceBankSc(BigDecimal balanceBankSc) {
    this.balanceBankSc = balanceBankSc;
    return this;
  }

  /**
   * Current Bank Balance in System currency code. Not mandatory but for the Bank information to be useful this should be populated
   *
   * @return balanceBankSc
   */
  @Valid
  @Schema(name = "balanceBankSc", description = "Current Bank Balance in System currency code. Not mandatory but for the Bank information to be useful this should be populated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceBankSc")
  public BigDecimal getBalanceBankSc() {
    return balanceBankSc;
  }

  public void setBalanceBankSc(BigDecimal balanceBankSc) {
    this.balanceBankSc = balanceBankSc;
  }

  public Bank balanceItemsBc(BigDecimal balanceItemsBc) {
    this.balanceItemsBc = balanceItemsBc;
    return this;
  }

  /**
   * Sum of items - if pulled
   *
   * @return balanceItemsBc
   */
  @Valid
  @Schema(name = "balanceItemsBc", description = "Sum of items - if pulled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceItemsBc")
  public BigDecimal getBalanceItemsBc() {
    return balanceItemsBc;
  }

  public void setBalanceItemsBc(BigDecimal balanceItemsBc) {
    this.balanceItemsBc = balanceItemsBc;
  }

  public Bank balanceItemsCc(BigDecimal balanceItemsCc) {
    this.balanceItemsCc = balanceItemsCc;
    return this;
  }

  /**
   * Get balanceItemsCc
   *
   * @return balanceItemsCc
   */
  @Valid
  @Schema(name = "balanceItemsCc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceItemsCc")
  public BigDecimal getBalanceItemsCc() {
    return balanceItemsCc;
  }

  public void setBalanceItemsCc(BigDecimal balanceItemsCc) {
    this.balanceItemsCc = balanceItemsCc;
  }

  public Bank balanceItemsSc(BigDecimal balanceItemsSc) {
    this.balanceItemsSc = balanceItemsSc;
    return this;
  }

  /**
   * Get balanceItemsSc
   *
   * @return balanceItemsSc
   */
  @Valid
  @Schema(name = "balanceItemsSc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceItemsSc")
  public BigDecimal getBalanceItemsSc() {
    return balanceItemsSc;
  }

  public void setBalanceItemsSc(BigDecimal balanceItemsSc) {
    this.balanceItemsSc = balanceItemsSc;
  }

  public Bank description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of what bank account is used for
   *
   * @return description
   */
  @Size(max = 128)
  @Schema(name = "description", description = "Description of what bank account is used for", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Bank accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Name of account owner
   *
   * @return accountName
   */
  @Size(max = 60)
  @Schema(name = "accountName", description = "Name of account owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountName")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public Bank sortCode(String sortCode) {
    this.sortCode = sortCode;
    return this;
  }

  /**
   * Bank Account Sort Code
   *
   * @return sortCode
   */
  @Size(max = 30)
  @Schema(name = "sortCode", description = "Bank Account Sort Code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sortCode")
  public String getSortCode() {
    return sortCode;
  }

  public void setSortCode(String sortCode) {
    this.sortCode = sortCode;
  }

  public Bank swiftCode(String swiftCode) {
    this.swiftCode = swiftCode;
    return this;
  }

  /**
   * Swift Code.
   *
   * @return swiftCode
   */
  @Size(max = 15)
  @Schema(name = "swiftCode", description = "Swift Code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("swiftCode")
  public String getSwiftCode() {
    return swiftCode;
  }

  public void setSwiftCode(String swiftCode) {
    this.swiftCode = swiftCode;
  }

  public Bank accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Bank Account Number
   *
   * @return accountNumber
   */
  @Size(max = 30)
  @Schema(name = "accountNumber", description = "   Bank Account Number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountNumber")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Bank overdraft(BigDecimal overdraft) {
    this.overdraft = overdraft;
    return this;
  }

  /**
   * Overdraft limit in Bank.CurrencyCode
   *
   * @return overdraft
   */
  @Valid
  @Schema(name = "overdraft", description = "Overdraft limit in Bank.CurrencyCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("overdraft")
  public BigDecimal getOverdraft() {
    return overdraft;
  }

  public void setOverdraft(BigDecimal overdraft) {
    this.overdraft = overdraft;
  }

  public Bank iban(String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * Iban code.
   *
   * @return iban
   */
  @Size(max = 34)
  @Schema(name = "iban", description = "Iban code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("iban")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bank bank = (Bank) o;
    return Objects.equals(this.companyId, bank.companyId) &&
        Objects.equals(this.uniqueKey, bank.uniqueKey) &&
        Objects.equals(this.fingerprint, bank.fingerprint) &&
        Objects.equals(this.createdId, bank.createdId) &&
        Objects.equals(this.deletedId, bank.deletedId) &&
        Objects.equals(this.updatedId, bank.updatedId) &&
        Objects.equals(this.closedId, bank.closedId) &&
        Objects.equals(this.name, bank.name) &&
        Objects.equals(this.reference, bank.reference) &&
        Objects.equals(this.address1, bank.address1) &&
        Objects.equals(this.address2, bank.address2) &&
        Objects.equals(this.address3, bank.address3) &&
        Objects.equals(this.address4, bank.address4) &&
        Objects.equals(this.postCode, bank.postCode) &&
        Objects.equals(this.contact, bank.contact) &&
        Objects.equals(this.balanceBankBc, bank.balanceBankBc) &&
        Objects.equals(this.balanceBankCc, bank.balanceBankCc) &&
        Objects.equals(this.balanceBankSc, bank.balanceBankSc) &&
        Objects.equals(this.balanceItemsBc, bank.balanceItemsBc) &&
        Objects.equals(this.balanceItemsCc, bank.balanceItemsCc) &&
        Objects.equals(this.balanceItemsSc, bank.balanceItemsSc) &&
        Objects.equals(this.description, bank.description) &&
        Objects.equals(this.accountName, bank.accountName) &&
        Objects.equals(this.sortCode, bank.sortCode) &&
        Objects.equals(this.swiftCode, bank.swiftCode) &&
        Objects.equals(this.accountNumber, bank.accountNumber) &&
        Objects.equals(this.overdraft, bank.overdraft) &&
        Objects.equals(this.iban, bank.iban);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, uniqueKey, fingerprint, createdId, deletedId, updatedId, closedId, name, reference, address1, address2, address3, address4, postCode, contact, balanceBankBc, balanceBankCc, balanceBankSc, balanceItemsBc, balanceItemsCc, balanceItemsSc, description, accountName, sortCode, swiftCode, accountNumber, overdraft, iban);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bank {\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    uniqueKey: ").append(toIndentedString(uniqueKey)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    createdId: ").append(toIndentedString(createdId)).append("\n");
    sb.append("    deletedId: ").append(toIndentedString(deletedId)).append("\n");
    sb.append("    updatedId: ").append(toIndentedString(updatedId)).append("\n");
    sb.append("    closedId: ").append(toIndentedString(closedId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    address3: ").append(toIndentedString(address3)).append("\n");
    sb.append("    address4: ").append(toIndentedString(address4)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    balanceBankBc: ").append(toIndentedString(balanceBankBc)).append("\n");
    sb.append("    balanceBankCc: ").append(toIndentedString(balanceBankCc)).append("\n");
    sb.append("    balanceBankSc: ").append(toIndentedString(balanceBankSc)).append("\n");
    sb.append("    balanceItemsBc: ").append(toIndentedString(balanceItemsBc)).append("\n");
    sb.append("    balanceItemsCc: ").append(toIndentedString(balanceItemsCc)).append("\n");
    sb.append("    balanceItemsSc: ").append(toIndentedString(balanceItemsSc)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    sortCode: ").append(toIndentedString(sortCode)).append("\n");
    sb.append("    swiftCode: ").append(toIndentedString(swiftCode)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    overdraft: ").append(toIndentedString(overdraft)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
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

