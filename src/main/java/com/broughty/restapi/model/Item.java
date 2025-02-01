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
 * The Item record represents all open, changed and closed items on the Sales Ledger (Customer items) and Purchase Ledger (Supplier items).  An open item is either an item where the balance is zero or where the close date is a date in the past.   The Item record will include all Debits (Invoices, Debit Adjustments), Credits (Credit Notes, Credit Adjustments, Discounts) and Cash on both the Sales and Purchase ledger - see Transaction Type.    It is expected that the various account transaction types will be    Transaction Type.    It is expected that the various account transaction types present in the various account packages/ERP systems will be mapped to the five OA transaction types.  The transaction type is stored in the item#TYPE field.  A 3 character string field that accepts the following:  INV  (Invoices)  CRD (Credit Notes)  PAY (Cash, Cheque, etc.)  CRA (Credit Adjustments)  DBA (Debit Adjustments)  The INV and DBA transactions are debits and should be positive (for sales and purchase ledger).  The CRD, PAY, CRA transactions are credits and should be negative (for sales and purchase ledger).   Only the Ledger Item Amount and Balance in the original Customer or Supplier currency are pulled – the OA laoding service completes further currency conversions.  The currency of the item is derived from the owning Supplier or Customer.  It is assumed that when an Item&#39;s Balance is zero that it is closed.   The OA Service will truncate all field values if they exceed the maximum size limit.
 */

@Schema(name = "Item", description = "The Item record represents all open, changed and closed items on the Sales Ledger (Customer items) and Purchase Ledger (Supplier items).  An open item is either an item where the balance is zero or where the close date is a date in the past.   The Item record will include all Debits (Invoices, Debit Adjustments), Credits (Credit Notes, Credit Adjustments, Discounts) and Cash on both the Sales and Purchase ledger - see Transaction Type.    It is expected that the various account transaction types will be    Transaction Type.    It is expected that the various account transaction types present in the various account packages/ERP systems will be mapped to the five OA transaction types.  The transaction type is stored in the item#TYPE field.  A 3 character string field that accepts the following:  INV  (Invoices)  CRD (Credit Notes)  PAY (Cash, Cheque, etc.)  CRA (Credit Adjustments)  DBA (Debit Adjustments)  The INV and DBA transactions are debits and should be positive (for sales and purchase ledger).  The CRD, PAY, CRA transactions are credits and should be negative (for sales and purchase ledger).   Only the Ledger Item Amount and Balance in the original Customer or Supplier currency are pulled – the OA laoding service completes further currency conversions.  The currency of the item is derived from the owning Supplier or Customer.  It is assumed that when an Item's Balance is zero that it is closed.   The OA Service will truncate all field values if they exceed the maximum size limit.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-01T19:26:55.251389700Z[Europe/London]", comments = "Generator version: 7.11.0")
public class Item {

  private String type;

  private BigDecimal amountCc;

  private BigDecimal balanceCc;

  private BigDecimal amountAc;

  private BigDecimal balanceAc;

  private @Nullable BigDecimal amountSc;

  private @Nullable BigDecimal balanceSc;

  private @Nullable BigDecimal taxAmountAc;

  private @Nullable BigDecimal taxAmountCc;

  private @Nullable BigDecimal taxAmountSc;

  private @Nullable String reference;

  private String accountReference;

  private String fingerprint;

  private Boolean retained = false;

  private Boolean nonNotifiedTakeOn = false;

  private String uniqueKey;

  private @Nullable String entryUserName;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate documentDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate dueDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate entryDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate itemReceivedDate;

  private @Nullable Boolean takeOn;

  private Integer createdId;

  private @Nullable Integer updatedId;

  private @Nullable Integer closedId;

  private @Nullable Integer deletedId;

  private @Nullable String accountName;

  private @Nullable Integer accountCreatedId;

  private @Nullable String accountCurrencyCode;

  private @Nullable String accountNotified;

  private Boolean accountAutoNonNotified = false;

  private @Nullable String itemCurrencyCode;

  private @Nullable String companyCurrencyCode;

  private String companyId;

  public Item() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Item(String type, BigDecimal amountCc, BigDecimal balanceCc, BigDecimal amountAc, BigDecimal balanceAc, String accountReference, String fingerprint, String uniqueKey, Integer createdId, String companyId) {
    this.type = type;
    this.amountCc = amountCc;
    this.balanceCc = balanceCc;
    this.amountAc = amountAc;
    this.balanceAc = balanceAc;
    this.accountReference = accountReference;
    this.fingerprint = fingerprint;
    this.uniqueKey = uniqueKey;
    this.createdId = createdId;
    this.companyId = companyId;
  }

  public Item type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Transaction Type.  It is expected that the various account transaction types present in the various account packages/ERP systems will be mapped to the five Open Accounting transaction types.    A 3 character string field that accepts the following:    - INV  (Invoices) +  - CRD (Credit Notes) -  - PAY (Cash, Cheque, etc.) -  - CRA (Credit Adjustments) -  - DBA (Debit Adjustments) +    The INV and DBA transactions are debits and should be positive (for sales and purchase ledger).  The CRD, PAY, CRA transactions are credits and should be negative (for sales and purchase ledger).     If you sum up all Balance items for a company then this WILL ALWAYS equal the Sales or Purchase Ledger balance  
   * @return type
   */
  @Size(min = 3, max = 3)
  @Schema(name = "type", accessMode = Schema.AccessMode.READ_ONLY, description = "Transaction Type.  It is expected that the various account transaction types present in the various account packages/ERP systems will be mapped to the five Open Accounting transaction types.    A 3 character string field that accepts the following:    - INV  (Invoices) +  - CRD (Credit Notes) -  - PAY (Cash, Cheque, etc.) -  - CRA (Credit Adjustments) -  - DBA (Debit Adjustments) +    The INV and DBA transactions are debits and should be positive (for sales and purchase ledger).  The CRD, PAY, CRA transactions are credits and should be negative (for sales and purchase ledger).     If you sum up all Balance items for a company then this WILL ALWAYS equal the Sales or Purchase Ledger balance  ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Item amountCc(BigDecimal amountCc) {
    this.amountCc = amountCc;
    return this;
  }

  /**
   * Item original amount in Company currency
   * @return amountCc
   */
  @NotNull
  @Valid
  @Schema(name = "amountCc", description = "Item original amount in Company currency", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amountCc")
  public BigDecimal getAmountCc() {
    return amountCc;
  }

  public void setAmountCc(BigDecimal amountCc) {
    this.amountCc = amountCc;
  }

  public Item balanceCc(BigDecimal balanceCc) {
    this.balanceCc = balanceCc;
    return this;
  }

  /**
   * Item balance in company currency
   *
   * @return balanceCc
   */
  @NotNull
  @Valid
  @Schema(name = "balanceCc", description = "Item balance in company currency  ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("balanceCc")
  public BigDecimal getBalanceCc() {
    return balanceCc;
  }

  public void setBalanceCc(BigDecimal balanceCc) {
    this.balanceCc = balanceCc;
  }

  public Item amountAc(BigDecimal amountAc) {
    this.amountAc = amountAc;
    return this;
  }

  /**
   * Amount in account currency
   *
   * @return amountAc
   */
  @NotNull
  @Valid
  @Schema(name = "amountAc", description = "Amount in account currency", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amountAc")
  public BigDecimal getAmountAc() {
    return amountAc;
  }

  public void setAmountAc(BigDecimal amountAc) {
    this.amountAc = amountAc;
  }

  public Item balanceAc(BigDecimal balanceAc) {
    this.balanceAc = balanceAc;
    return this;
  }

  /**
   * Outsatnding Balance in account currency
   *
   * @return balanceAc
   */
  @NotNull
  @Valid
  @Schema(name = "balanceAc", description = "Outsatnding Balance in account currency", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("balanceAc")
  public BigDecimal getBalanceAc() {
    return balanceAc;
  }

  public void setBalanceAc(BigDecimal balanceAc) {
    this.balanceAc = balanceAc;
  }

  public Item amountSc(BigDecimal amountSc) {
    this.amountSc = amountSc;
    return this;
  }

  /**
   * Amount in system currency
   *
   * @return amountSc
   */
  @Valid
  @Schema(name = "amountSc", description = "Amount in system currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amountSc")
  public BigDecimal getAmountSc() {
    return amountSc;
  }

  public void setAmountSc(BigDecimal amountSc) {
    this.amountSc = amountSc;
  }

  public Item balanceSc(BigDecimal balanceSc) {
    this.balanceSc = balanceSc;
    return this;
  }

  /**
   * Balance in system currency
   *
   * @return balanceSc
   */
  @Valid
  @Schema(name = "balanceSc", description = "Balance in system currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceSc")
  public BigDecimal getBalanceSc() {
    return balanceSc;
  }

  public void setBalanceSc(BigDecimal balanceSc) {
    this.balanceSc = balanceSc;
  }

  public Item taxAmountAc(BigDecimal taxAmountAc) {
    this.taxAmountAc = taxAmountAc;
    return this;
  }

  /**
   * Tax amount in Customer/Supplier currency
   *
   * @return taxAmountAc
   */
  @Valid
  @Schema(name = "taxAmountAc", description = "Tax amount in Customer/Supplier currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxAmountAc")
  public BigDecimal getTaxAmountAc() {
    return taxAmountAc;
  }

  public void setTaxAmountAc(BigDecimal taxAmountAc) {
    this.taxAmountAc = taxAmountAc;
  }

  public Item taxAmountCc(BigDecimal taxAmountCc) {
    this.taxAmountCc = taxAmountCc;
    return this;
  }

  /**
   * Tax amount in Company currency
   *
   * @return taxAmountCc
   */
  @Valid
  @Schema(name = "taxAmountCc", description = "Tax amount in Company currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxAmountCc")
  public BigDecimal getTaxAmountCc() {
    return taxAmountCc;
  }

  public void setTaxAmountCc(BigDecimal taxAmountCc) {
    this.taxAmountCc = taxAmountCc;
  }

  public Item taxAmountSc(BigDecimal taxAmountSc) {
    this.taxAmountSc = taxAmountSc;
    return this;
  }

  /**
   * Tax amount in System currency.
   *
   * @return taxAmountSc
   */
  @Valid
  @Schema(name = "taxAmountSc", description = "Tax amount in System currency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxAmountSc")
  public BigDecimal getTaxAmountSc() {
    return taxAmountSc;
  }

  public void setTaxAmountSc(BigDecimal taxAmountSc) {
    this.taxAmountSc = taxAmountSc;
  }

  public Item reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * User populated reference for the item.  Could be empty.
   * @return reference
   */
  @Size(max = 30)
  @Schema(name = "reference", accessMode = Schema.AccessMode.READ_ONLY, description = "User populated reference for the item.  Could be empty.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reference")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Item accountReference(String accountReference) {
    this.accountReference = accountReference;
    return this;
  }

  /**
   * The Customer or Supplier reference
   *
   * @return accountReference
   */
  @NotNull
  @Size(max = 30)
  @Schema(name = "accountReference", description = "The Customer or Supplier reference", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accountReference")
  public String getAccountReference() {
    return accountReference;
  }

  public void setAccountReference(String accountReference) {
    this.accountReference = accountReference;
  }

  public Item fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * An internal hash used to indicate current state of item.  Changes between snapshots if the item changes.
   * @return fingerprint
   */
  @NotNull
  @Schema(name = "fingerprint", description = "An internal hash used to indicate current state of item.  Changes between snapshots if the item changes.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fingerprint")
  public String getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }

  public Item retained(Boolean retained) {
    this.retained = retained;
    return this;
  }

  /**
   * Indicates if the item has been retained.  See the Company retained days for more information
   * @return retained
   */

  @Schema(name = "retained", description = "Indicates if the item has been retained.  See the Company retained days for more information", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retained")
  public Boolean getRetained() {
    return retained;
  }

  public void setRetained(Boolean retained) {
    this.retained = retained;
  }

  public Item nonNotifiedTakeOn(Boolean nonNotifiedTakeOn) {
    this.nonNotifiedTakeOn = nonNotifiedTakeOn;
    return this;
  }

  /**
   * true - if the item was non-notified at take-on, i.e. if customer was non-notified when the item was first created.
   * @return nonNotifiedTakeOn
   */

  @Schema(name = "nonNotifiedTakeOn", description = "true - if the item was non-notified at take-on, i.e. if customer was non-notified when the item was first created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nonNotifiedTakeOn")
  public Boolean getNonNotifiedTakeOn() {
    return nonNotifiedTakeOn;
  }

  public void setNonNotifiedTakeOn(Boolean nonNotifiedTakeOn) {
    this.nonNotifiedTakeOn = nonNotifiedTakeOn;
  }

  public Item uniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
    return this;
  }

  /**
   * A value that can be guaranteed to be unique and static for each individual extracted Item.    This uniqueKey can be used to find individual items
   * @return uniqueKey
   */
  @Size(max = 50)
  @Schema(name = "uniqueKey", accessMode = Schema.AccessMode.READ_ONLY, description = "A value that can be guaranteed to be unique and static for each individual extracted Item.    This uniqueKey can be used to find individual items", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("uniqueKey")
  public String getUniqueKey() {
    return uniqueKey;
  }

  public void setUniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
  }

  public Item entryUserName(String entryUserName) {
    this.entryUserName = entryUserName;
    return this;
  }

  /**
   * Get entryUserName
   *
   * @return entryUserName
   */
  @Size(max = 50)
  @Schema(name = "entryUserName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entryUserName")
  public String getEntryUserName() {
    return entryUserName;
  }

  public void setEntryUserName(String entryUserName) {
    this.entryUserName = entryUserName;
  }

  public Item documentDate(LocalDate documentDate) {
    this.documentDate = documentDate;
    return this;
  }

  /**
   * Original document date 
   * @return documentDate
   */
  @Valid
  @Schema(name = "documentDate", description = "Original document date ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("documentDate")
  public LocalDate getDocumentDate() {
    return documentDate;
  }

  public void setDocumentDate(LocalDate documentDate) {
    this.documentDate = documentDate;
  }

  public Item dueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Date item is due.  Typically only populated for debit   items
   *
   * @return dueDate
   */
  @Valid
  @Schema(name = "dueDate", description = "Date item is due.  Typically only populated for debit   items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dueDate")
  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public Item entryDate(LocalDate entryDate) {
    this.entryDate = entryDate;
    return this;
  }

  /**
   * Date item was physically entered into accounting package (by UserName).
   *
   * @return entryDate
   */
  @Valid
  @Schema(name = "entryDate", description = "Date item was physically entered into accounting package (by UserName).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entryDate")
  public LocalDate getEntryDate() {
    return entryDate;
  }

  public void setEntryDate(LocalDate entryDate) {
    this.entryDate = entryDate;
  }

  public Item itemReceivedDate(LocalDate itemReceivedDate) {
    this.itemReceivedDate = itemReceivedDate;
    return this;
  }

  /**
   * Date that Open Accounting first saw the item
   *
   * @return itemReceivedDate
   */
  @Valid
  @Schema(name = "itemReceivedDate", description = "Date that Open Accounting first saw the item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemReceivedDate")
  public LocalDate getItemReceivedDate() {
    return itemReceivedDate;
  }

  public void setItemReceivedDate(LocalDate itemReceivedDate) {
    this.itemReceivedDate = itemReceivedDate;
  }

  public Item takeOn(Boolean takeOn) {
    this.takeOn = takeOn;
    return this;
  }

  /**
   * Was the item created as part of the take-on
   * @return takeOn
   */

  @Schema(name = "takeOn", description = "Was the item created as part of the take-on", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("takeOn")
  public Boolean getTakeOn() {
    return takeOn;
  }

  public void setTakeOn(Boolean takeOn) {
    this.takeOn = takeOn;
  }

  public Item createdId(Integer createdId) {
    this.createdId = createdId;
    return this;
  }

  /**
   * Snapshot ID that created this item.  Always populated.
   *
   * @return createdId
   */
  @NotNull
  @Schema(name = "createdId", description = "Snapshot ID that created this item.  Always populated.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("createdId")
  public Integer getCreatedId() {
    return createdId;
  }

  public void setCreatedId(Integer createdId) {
    this.createdId = createdId;
  }

  public Item updatedId(Integer updatedId) {
    this.updatedId = updatedId;
    return this;
  }

  /**
   * Snapshot ID that updated this item. 
   * @return updatedId
   */

  @Schema(name = "updatedId", description = "Snapshot ID that updated this item. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedId")
  public Integer getUpdatedId() {
    return updatedId;
  }

  public void setUpdatedId(Integer updatedId) {
    this.updatedId = updatedId;
  }

  public Item closedId(Integer closedId) {
    this.closedId = closedId;
    return this;
  }

  /**
   * Snapshot ID that closed this item. If this ID is populated then then the balance will be 0
   *
   * @return closedId
   */

  @Schema(name = "closedId", description = "Snapshot ID that closed this item. If this ID is populated then then the balance will be 0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("closedId")
  public Integer getClosedId() {
    return closedId;
  }

  public void setClosedId(Integer closedId) {
    this.closedId = closedId;
  }

  public Item deletedId(Integer deletedId) {
    this.deletedId = deletedId;
    return this;
  }

  /**
   * Snapshot ID that deleted  this item.  Indicates the item went missing
   * @return deletedId
   */

  @Schema(name = "deletedId", description = "Snapshot ID that deleted  this item.  Indicates the item went missing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deletedId")
  public Integer getDeletedId() {
    return deletedId;
  }

  public void setDeletedId(Integer deletedId) {
    this.deletedId = deletedId;
  }

  public Item accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * The account (customer or supplier) name  
   * @return accountName
   */

  @Schema(name = "accountName", description = "The account (customer or supplier) name  ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountName")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public Item accountCreatedId(Integer accountCreatedId) {
    this.accountCreatedId = accountCreatedId;
    return this;
  }

  /**
   * The customer or supplier snapshot id that created the account
   *
   * @return accountCreatedId
   */

  @Schema(name = "accountCreatedId", description = "The customer or supplier snapshot id that created the account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountCreatedId")
  public Integer getAccountCreatedId() {
    return accountCreatedId;
  }

  public void setAccountCreatedId(Integer accountCreatedId) {
    this.accountCreatedId = accountCreatedId;
  }

  public Item accountCurrencyCode(String accountCurrencyCode) {
    this.accountCurrencyCode = accountCurrencyCode;
    return this;
  }

  /**
   * Customer or Supplier currency code.  This will be the currency of the item
   * @return accountCurrencyCode
   */

  @Schema(name = "accountCurrencyCode", description = "Customer or Supplier currency code.  This will be the currency of the item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountCurrencyCode")
  public String getAccountCurrencyCode() {
    return accountCurrencyCode;
  }

  public void setAccountCurrencyCode(String accountCurrencyCode) {
    this.accountCurrencyCode = accountCurrencyCode;
  }

  public Item accountNotified(String accountNotified) {
    this.accountNotified = accountNotified;
    return this;
  }

  /**
   * Is the Customer notified
   *
   * @return accountNotified
   */

  @Schema(name = "accountNotified", description = "Is the Customer notified", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountNotified")
  public String getAccountNotified() {
    return accountNotified;
  }

  public void setAccountNotified(String accountNotified) {
    this.accountNotified = accountNotified;
  }

  public Item accountAutoNonNotified(Boolean accountAutoNonNotified) {
    this.accountAutoNonNotified = accountAutoNonNotified;
    return this;
  }

  /**
   * Was the Customer auto non-notified - i.e. Customer had a zero balance at take-on
   * @return accountAutoNonNotified
   */

  @Schema(name = "accountAutoNonNotified", description = "Was the Customer auto non-notified - i.e. Customer had a zero balance at take-on", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountAutoNonNotified")
  public Boolean getAccountAutoNonNotified() {
    return accountAutoNonNotified;
  }

  public void setAccountAutoNonNotified(Boolean accountAutoNonNotified) {
    this.accountAutoNonNotified = accountAutoNonNotified;
  }

  public Item itemCurrencyCode(String itemCurrencyCode) {
    this.itemCurrencyCode = itemCurrencyCode;
    return this;
  }

  /**
   * Future use item level currency field.  Will allow multiple currency items
   *
   * @return itemCurrencyCode
   */
  @Size(max = 3)
  @Schema(name = "itemCurrencyCode", description = "Future use item level currency field.  Will allow multiple currency items  ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemCurrencyCode")
  public String getItemCurrencyCode() {
    return itemCurrencyCode;
  }

  public void setItemCurrencyCode(String itemCurrencyCode) {
    this.itemCurrencyCode = itemCurrencyCode;
  }

  public Item companyCurrencyCode(String companyCurrencyCode) {
    this.companyCurrencyCode = companyCurrencyCode;
    return this;
  }

  /**
   * Owning company currency code
   *
   * @return companyCurrencyCode
   */
  @Size(max = 3)
  @Schema(name = "companyCurrencyCode", description = "Owning company currency code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("companyCurrencyCode")
  public String getCompanyCurrencyCode() {
    return companyCurrencyCode;
  }

  public void setCompanyCurrencyCode(String companyCurrencyCode) {
    this.companyCurrencyCode = companyCurrencyCode;
  }

  public Item companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * The Company UUID
   *
   * @return companyId
   */
  @NotNull
  @Size(min = 36, max = 36)
  @Schema(name = "companyId", description = "The Company UUID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("companyId")
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.type, item.type) &&
        Objects.equals(this.amountCc, item.amountCc) &&
        Objects.equals(this.balanceCc, item.balanceCc) &&
        Objects.equals(this.amountAc, item.amountAc) &&
        Objects.equals(this.balanceAc, item.balanceAc) &&
        Objects.equals(this.amountSc, item.amountSc) &&
        Objects.equals(this.balanceSc, item.balanceSc) &&
        Objects.equals(this.taxAmountAc, item.taxAmountAc) &&
        Objects.equals(this.taxAmountCc, item.taxAmountCc) &&
        Objects.equals(this.taxAmountSc, item.taxAmountSc) &&
        Objects.equals(this.reference, item.reference) &&
        Objects.equals(this.accountReference, item.accountReference) &&
        Objects.equals(this.fingerprint, item.fingerprint) &&
        Objects.equals(this.retained, item.retained) &&
        Objects.equals(this.nonNotifiedTakeOn, item.nonNotifiedTakeOn) &&
        Objects.equals(this.uniqueKey, item.uniqueKey) &&
        Objects.equals(this.entryUserName, item.entryUserName) &&
        Objects.equals(this.documentDate, item.documentDate) &&
        Objects.equals(this.dueDate, item.dueDate) &&
        Objects.equals(this.entryDate, item.entryDate) &&
        Objects.equals(this.itemReceivedDate, item.itemReceivedDate) &&
        Objects.equals(this.takeOn, item.takeOn) &&
        Objects.equals(this.createdId, item.createdId) &&
        Objects.equals(this.updatedId, item.updatedId) &&
        Objects.equals(this.closedId, item.closedId) &&
        Objects.equals(this.deletedId, item.deletedId) &&
        Objects.equals(this.accountName, item.accountName) &&
        Objects.equals(this.accountCreatedId, item.accountCreatedId) &&
        Objects.equals(this.accountCurrencyCode, item.accountCurrencyCode) &&
        Objects.equals(this.accountNotified, item.accountNotified) &&
        Objects.equals(this.accountAutoNonNotified, item.accountAutoNonNotified) &&
        Objects.equals(this.itemCurrencyCode, item.itemCurrencyCode) &&
        Objects.equals(this.companyCurrencyCode, item.companyCurrencyCode) &&
        Objects.equals(this.companyId, item.companyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, amountCc, balanceCc, amountAc, balanceAc, amountSc, balanceSc, taxAmountAc, taxAmountCc, taxAmountSc, reference, accountReference, fingerprint, retained, nonNotifiedTakeOn, uniqueKey, entryUserName, documentDate, dueDate, entryDate, itemReceivedDate, takeOn, createdId, updatedId, closedId, deletedId, accountName, accountCreatedId, accountCurrencyCode, accountNotified, accountAutoNonNotified, itemCurrencyCode, companyCurrencyCode, companyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amountCc: ").append(toIndentedString(amountCc)).append("\n");
    sb.append("    balanceCc: ").append(toIndentedString(balanceCc)).append("\n");
    sb.append("    amountAc: ").append(toIndentedString(amountAc)).append("\n");
    sb.append("    balanceAc: ").append(toIndentedString(balanceAc)).append("\n");
    sb.append("    amountSc: ").append(toIndentedString(amountSc)).append("\n");
    sb.append("    balanceSc: ").append(toIndentedString(balanceSc)).append("\n");
    sb.append("    taxAmountAc: ").append(toIndentedString(taxAmountAc)).append("\n");
    sb.append("    taxAmountCc: ").append(toIndentedString(taxAmountCc)).append("\n");
    sb.append("    taxAmountSc: ").append(toIndentedString(taxAmountSc)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    accountReference: ").append(toIndentedString(accountReference)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    retained: ").append(toIndentedString(retained)).append("\n");
    sb.append("    nonNotifiedTakeOn: ").append(toIndentedString(nonNotifiedTakeOn)).append("\n");
    sb.append("    uniqueKey: ").append(toIndentedString(uniqueKey)).append("\n");
    sb.append("    entryUserName: ").append(toIndentedString(entryUserName)).append("\n");
    sb.append("    documentDate: ").append(toIndentedString(documentDate)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    entryDate: ").append(toIndentedString(entryDate)).append("\n");
    sb.append("    itemReceivedDate: ").append(toIndentedString(itemReceivedDate)).append("\n");
    sb.append("    takeOn: ").append(toIndentedString(takeOn)).append("\n");
    sb.append("    createdId: ").append(toIndentedString(createdId)).append("\n");
    sb.append("    updatedId: ").append(toIndentedString(updatedId)).append("\n");
    sb.append("    closedId: ").append(toIndentedString(closedId)).append("\n");
    sb.append("    deletedId: ").append(toIndentedString(deletedId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountCreatedId: ").append(toIndentedString(accountCreatedId)).append("\n");
    sb.append("    accountCurrencyCode: ").append(toIndentedString(accountCurrencyCode)).append("\n");
    sb.append("    accountNotified: ").append(toIndentedString(accountNotified)).append("\n");
    sb.append("    accountAutoNonNotified: ").append(toIndentedString(accountAutoNonNotified)).append("\n");
    sb.append("    itemCurrencyCode: ").append(toIndentedString(itemCurrencyCode)).append("\n");
    sb.append("    companyCurrencyCode: ").append(toIndentedString(companyCurrencyCode)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
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

