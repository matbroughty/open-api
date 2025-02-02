package com.broughty.restapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.Size;
import org.springframework.lang.Nullable;

import java.util.Objects;

/**
 * The Bank Item record represents all cash items (receipts, payments and adjustments) for a particular Bank.   It is not necessary to extract Bank Items as the owning Bank (BankItem.BankReference &#x3D; Bank.Reference) contains the Balance but if it is required to see Bank Statements for a certain period then all Bank Items for a Bank should be extracted.  Bank Items are neither open or closed.  Bank Items either debit or credit the owning Bank  Some of these Bank Items will already exist as a Customer or Supplier &#39;PAY&#39; Ledger item. If possible and known in the accounts package then the BankItem.LedgerItemUniqueKey will be the same as the LedgerItem.UniqueKey.  The OA Service will truncate all field values if they exceed the maximum size limit.
 */

@Schema(name = "BankItem", description = "The Bank Item record represents all cash items (receipts, payments and adjustments) for a particular Bank.   It is not necessary to extract Bank Items as the owning Bank (BankItem.BankReference = Bank.Reference) contains the Balance but if it is required to see Bank Statements for a certain period then all Bank Items for a Bank should be extracted.  Bank Items are neither open or closed.  Bank Items either debit or credit the owning Bank  Some of these Bank Items will already exist as a Customer or Supplier 'PAY' Ledger item. If possible and known in the accounts package then the BankItem.LedgerItemUniqueKey will be the same as the LedgerItem.UniqueKey.  The OA Service will truncate all field values if they exceed the maximum size limit.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-02T13:18:41.397887300Z[Europe/London]", comments = "Generator version: 7.11.0")
public class BankItem {

  private @Nullable String companyId;

  private @Nullable String reference;

  private @Nullable String bankUniqueKey;

  private @Nullable String accountName;

  private @Nullable String accountReference;

  private @Nullable String bankReference;

  private @Nullable Integer createdId;

  private @Nullable Integer deletedId;

  private @Nullable Integer closedId;

  private @Nullable String fingerprint;

  private @Nullable Integer amountBc;

  private @Nullable Integer amountCc;

  private @Nullable Integer amountSc;

  private @Nullable String details;

  private @Nullable String type;

  private @Nullable Integer balanceBc;

  private @Nullable Integer balanceCc;

  private @Nullable Integer balanceSc;

  private @Nullable String dueDate;

  private @Nullable String documentDate;

  private @Nullable String entryDate;

  private @Nullable String userName;

  private @Nullable Integer taxAmountBc;

  private @Nullable Integer taxAmountCc;

  private @Nullable Integer taxAmountSc;

  private @Nullable String ledgerItemKey;

  private @Nullable String originalType;

  public BankItem companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Owning Company UUID
   *
   * @return companyId
   */
  @Size(min = 36, max = 36)
  @Schema(name = "companyId", description = "Owning Company UUID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("companyId")
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public BankItem reference(String reference) {
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

  public BankItem bankUniqueKey(String bankUniqueKey) {
    this.bankUniqueKey = bankUniqueKey;
    return this;
  }

  /**
   * Get bankUniqueKey
   *
   * @return bankUniqueKey
   */
  @Size(max = 50)
  @Schema(name = "bankUniqueKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bankUniqueKey")
  public String getBankUniqueKey() {
    return bankUniqueKey;
  }

  public void setBankUniqueKey(String bankUniqueKey) {
    this.bankUniqueKey = bankUniqueKey;
  }

  public BankItem accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Get accountName
   *
   * @return accountName
   */

  @Schema(name = "accountName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountName")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public BankItem accountReference(String accountReference) {
    this.accountReference = accountReference;
    return this;
  }

  /**
   * Get accountReference
   *
   * @return accountReference
   */

  @Schema(name = "accountReference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountReference")
  public String getAccountReference() {
    return accountReference;
  }

  public void setAccountReference(String accountReference) {
    this.accountReference = accountReference;
  }

  public BankItem bankReference(String bankReference) {
    this.bankReference = bankReference;
    return this;
  }

  /**
   * Get bankReference
   *
   * @return bankReference
   */

  @Schema(name = "bankReference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bankReference")
  public String getBankReference() {
    return bankReference;
  }

  public void setBankReference(String bankReference) {
    this.bankReference = bankReference;
  }

  public BankItem createdId(Integer createdId) {
    this.createdId = createdId;
    return this;
  }

  /**
   * Get createdId
   *
   * @return createdId
   */

  @Schema(name = "createdId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdId")
  public Integer getCreatedId() {
    return createdId;
  }

  public void setCreatedId(Integer createdId) {
    this.createdId = createdId;
  }

  public BankItem deletedId(Integer deletedId) {
    this.deletedId = deletedId;
    return this;
  }

  /**
   * Get deletedId
   *
   * @return deletedId
   */

  @Schema(name = "deletedId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deletedId")
  public Integer getDeletedId() {
    return deletedId;
  }

  public void setDeletedId(Integer deletedId) {
    this.deletedId = deletedId;
  }

  public BankItem closedId(Integer closedId) {
    this.closedId = closedId;
    return this;
  }

  /**
   * Get closedId
   *
   * @return closedId
   */

  @Schema(name = "closedId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("closedId")
  public Integer getClosedId() {
    return closedId;
  }

  public void setClosedId(Integer closedId) {
    this.closedId = closedId;
  }

  public BankItem fingerprint(String fingerprint) {
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

  public BankItem amountBc(Integer amountBc) {
    this.amountBc = amountBc;
    return this;
  }

  /**
   * Get amountBc
   *
   * @return amountBc
   */

  @Schema(name = "amountBc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amountBc")
  public Integer getAmountBc() {
    return amountBc;
  }

  public void setAmountBc(Integer amountBc) {
    this.amountBc = amountBc;
  }

  public BankItem amountCc(Integer amountCc) {
    this.amountCc = amountCc;
    return this;
  }

  /**
   * Get amountCc
   *
   * @return amountCc
   */

  @Schema(name = "amountCc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amountCc")
  public Integer getAmountCc() {
    return amountCc;
  }

  public void setAmountCc(Integer amountCc) {
    this.amountCc = amountCc;
  }

  public BankItem amountSc(Integer amountSc) {
    this.amountSc = amountSc;
    return this;
  }

  /**
   * Get amountSc
   *
   * @return amountSc
   */

  @Schema(name = "amountSc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amountSc")
  public Integer getAmountSc() {
    return amountSc;
  }

  public void setAmountSc(Integer amountSc) {
    this.amountSc = amountSc;
  }

  public BankItem details(String details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   *
   * @return details
   */

  @Schema(name = "details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("details")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public BankItem type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */

  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public BankItem balanceBc(Integer balanceBc) {
    this.balanceBc = balanceBc;
    return this;
  }

  /**
   * Get balanceBc
   *
   * @return balanceBc
   */

  @Schema(name = "balanceBc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceBc")
  public Integer getBalanceBc() {
    return balanceBc;
  }

  public void setBalanceBc(Integer balanceBc) {
    this.balanceBc = balanceBc;
  }

  public BankItem balanceCc(Integer balanceCc) {
    this.balanceCc = balanceCc;
    return this;
  }

  /**
   * Get balanceCc
   *
   * @return balanceCc
   */

  @Schema(name = "balanceCc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceCc")
  public Integer getBalanceCc() {
    return balanceCc;
  }

  public void setBalanceCc(Integer balanceCc) {
    this.balanceCc = balanceCc;
  }

  public BankItem balanceSc(Integer balanceSc) {
    this.balanceSc = balanceSc;
    return this;
  }

  /**
   * Get balanceSc
   *
   * @return balanceSc
   */

  @Schema(name = "balanceSc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceSc")
  public Integer getBalanceSc() {
    return balanceSc;
  }

  public void setBalanceSc(Integer balanceSc) {
    this.balanceSc = balanceSc;
  }

  public BankItem dueDate(String dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Get dueDate
   *
   * @return dueDate
   */

  @Schema(name = "dueDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dueDate")
  public String getDueDate() {
    return dueDate;
  }

  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }

  public BankItem documentDate(String documentDate) {
    this.documentDate = documentDate;
    return this;
  }

  /**
   * Get documentDate
   *
   * @return documentDate
   */

  @Schema(name = "documentDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("documentDate")
  public String getDocumentDate() {
    return documentDate;
  }

  public void setDocumentDate(String documentDate) {
    this.documentDate = documentDate;
  }

  public BankItem entryDate(String entryDate) {
    this.entryDate = entryDate;
    return this;
  }

  /**
   * Get entryDate
   *
   * @return entryDate
   */

  @Schema(name = "entryDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entryDate")
  public String getEntryDate() {
    return entryDate;
  }

  public void setEntryDate(String entryDate) {
    this.entryDate = entryDate;
  }

  public BankItem userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   *
   * @return userName
   */

  @Schema(name = "userName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public BankItem taxAmountBc(Integer taxAmountBc) {
    this.taxAmountBc = taxAmountBc;
    return this;
  }

  /**
   * Get taxAmountBc
   *
   * @return taxAmountBc
   */

  @Schema(name = "taxAmountBc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxAmountBc")
  public Integer getTaxAmountBc() {
    return taxAmountBc;
  }

  public void setTaxAmountBc(Integer taxAmountBc) {
    this.taxAmountBc = taxAmountBc;
  }

  public BankItem taxAmountCc(Integer taxAmountCc) {
    this.taxAmountCc = taxAmountCc;
    return this;
  }

  /**
   * Get taxAmountCc
   *
   * @return taxAmountCc
   */

  @Schema(name = "taxAmountCc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxAmountCc")
  public Integer getTaxAmountCc() {
    return taxAmountCc;
  }

  public void setTaxAmountCc(Integer taxAmountCc) {
    this.taxAmountCc = taxAmountCc;
  }

  public BankItem taxAmountSc(Integer taxAmountSc) {
    this.taxAmountSc = taxAmountSc;
    return this;
  }

  /**
   * Get taxAmountSc
   *
   * @return taxAmountSc
   */

  @Schema(name = "taxAmountSc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxAmountSc")
  public Integer getTaxAmountSc() {
    return taxAmountSc;
  }

  public void setTaxAmountSc(Integer taxAmountSc) {
    this.taxAmountSc = taxAmountSc;
  }

  public BankItem ledgerItemKey(String ledgerItemKey) {
    this.ledgerItemKey = ledgerItemKey;
    return this;
  }

  /**
   * Get ledgerItemKey
   *
   * @return ledgerItemKey
   */

  @Schema(name = "ledgerItemKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ledgerItemKey")
  public String getLedgerItemKey() {
    return ledgerItemKey;
  }

  public void setLedgerItemKey(String ledgerItemKey) {
    this.ledgerItemKey = ledgerItemKey;
  }

  public BankItem originalType(String originalType) {
    this.originalType = originalType;
    return this;
  }

  /**
   * Get originalType
   *
   * @return originalType
   */

  @Schema(name = "originalType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("originalType")
  public String getOriginalType() {
    return originalType;
  }

  public void setOriginalType(String originalType) {
    this.originalType = originalType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankItem bankItem = (BankItem) o;
    return Objects.equals(this.companyId, bankItem.companyId) &&
        Objects.equals(this.reference, bankItem.reference) &&
        Objects.equals(this.bankUniqueKey, bankItem.bankUniqueKey) &&
        Objects.equals(this.accountName, bankItem.accountName) &&
        Objects.equals(this.accountReference, bankItem.accountReference) &&
        Objects.equals(this.bankReference, bankItem.bankReference) &&
        Objects.equals(this.createdId, bankItem.createdId) &&
        Objects.equals(this.deletedId, bankItem.deletedId) &&
        Objects.equals(this.closedId, bankItem.closedId) &&
        Objects.equals(this.fingerprint, bankItem.fingerprint) &&
        Objects.equals(this.amountBc, bankItem.amountBc) &&
        Objects.equals(this.amountCc, bankItem.amountCc) &&
        Objects.equals(this.amountSc, bankItem.amountSc) &&
        Objects.equals(this.details, bankItem.details) &&
        Objects.equals(this.type, bankItem.type) &&
        Objects.equals(this.balanceBc, bankItem.balanceBc) &&
        Objects.equals(this.balanceCc, bankItem.balanceCc) &&
        Objects.equals(this.balanceSc, bankItem.balanceSc) &&
        Objects.equals(this.dueDate, bankItem.dueDate) &&
        Objects.equals(this.documentDate, bankItem.documentDate) &&
        Objects.equals(this.entryDate, bankItem.entryDate) &&
        Objects.equals(this.userName, bankItem.userName) &&
        Objects.equals(this.taxAmountBc, bankItem.taxAmountBc) &&
        Objects.equals(this.taxAmountCc, bankItem.taxAmountCc) &&
        Objects.equals(this.taxAmountSc, bankItem.taxAmountSc) &&
        Objects.equals(this.ledgerItemKey, bankItem.ledgerItemKey) &&
        Objects.equals(this.originalType, bankItem.originalType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, reference, bankUniqueKey, accountName, accountReference, bankReference, createdId, deletedId, closedId, fingerprint, amountBc, amountCc, amountSc, details, type, balanceBc, balanceCc, balanceSc, dueDate, documentDate, entryDate, userName, taxAmountBc, taxAmountCc, taxAmountSc, ledgerItemKey, originalType);
  }

  @Override
  public String toString() {
    String sb = "class BankItem {\n" +
        "    companyId: " + toIndentedString(companyId) + "\n" +
        "    reference: " + toIndentedString(reference) + "\n" +
        "    bankUniqueKey: " + toIndentedString(bankUniqueKey) + "\n" +
        "    accountName: " + toIndentedString(accountName) + "\n" +
        "    accountReference: " + toIndentedString(accountReference) + "\n" +
        "    bankReference: " + toIndentedString(bankReference) + "\n" +
        "    createdId: " + toIndentedString(createdId) + "\n" +
        "    deletedId: " + toIndentedString(deletedId) + "\n" +
        "    closedId: " + toIndentedString(closedId) + "\n" +
        "    fingerprint: " + toIndentedString(fingerprint) + "\n" +
        "    amountBc: " + toIndentedString(amountBc) + "\n" +
        "    amountCc: " + toIndentedString(amountCc) + "\n" +
        "    amountSc: " + toIndentedString(amountSc) + "\n" +
        "    details: " + toIndentedString(details) + "\n" +
        "    type: " + toIndentedString(type) + "\n" +
        "    balanceBc: " + toIndentedString(balanceBc) + "\n" +
        "    balanceCc: " + toIndentedString(balanceCc) + "\n" +
        "    balanceSc: " + toIndentedString(balanceSc) + "\n" +
        "    dueDate: " + toIndentedString(dueDate) + "\n" +
        "    documentDate: " + toIndentedString(documentDate) + "\n" +
        "    entryDate: " + toIndentedString(entryDate) + "\n" +
        "    userName: " + toIndentedString(userName) + "\n" +
        "    taxAmountBc: " + toIndentedString(taxAmountBc) + "\n" +
        "    taxAmountCc: " + toIndentedString(taxAmountCc) + "\n" +
        "    taxAmountSc: " + toIndentedString(taxAmountSc) + "\n" +
        "    ledgerItemKey: " + toIndentedString(ledgerItemKey) + "\n" +
        "    originalType: " + toIndentedString(originalType) + "\n" +
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

