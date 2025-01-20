package com.broughty.restapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Objects;

/**
 * Item
 */

@JsonTypeName("item")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-20T19:09:02.000162Z[Europe/London]", comments = "Generator version: 7.4.0")
public class Item {

  private String closedId;

  private String takeonExcluded;

  private String dueDate;

  private String amountLc;

  private String createdId;

  private String deletedId;

  private String type;

  private String amountDc;

  private String reference;

  private String balanceDc;

  private String fingerprint;

  private String balanceLc;

  private String balanceSc;

  private String entryDate;

  private String uniqueKey;

  private String taxAmountAc;

  private String amountSc;

  private String extraField1;

  private String debtorReference;

  private String extraField2;

  private String extraField3;

  private String disputeCode;

  private String documentDate;

  private String balanceDpc;

  private String amountDpc;

  private String taxAmountSc;

  private String taxAmountDpc;

  private String updatedId;

  private String userName;

  private String closeDate;

  private String taxAmountLc;

  private String retained;

  private String currencyCode;

  private String retainedDate;

  private String debtor;

  public Item() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Item(String createdId, String type, String uniqueKey) {
    this.createdId = createdId;
    this.type = type;
    this.uniqueKey = uniqueKey;
  }

  public Item closedId(String closedId) {
    this.closedId = closedId;
    return this;
  }

  /**
   * Get closedId
   * @return closedId
  */
  
  @Schema(name = "closedId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("closedId")
  public String getClosedId() {
    return closedId;
  }

  public void setClosedId(String closedId) {
    this.closedId = closedId;
  }

  public Item takeonExcluded(String takeonExcluded) {
    this.takeonExcluded = takeonExcluded;
    return this;
  }

  /**
   * Get takeonExcluded
   * @return takeonExcluded
  */
  
  @Schema(name = "takeonExcluded", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("takeonExcluded")
  public String getTakeonExcluded() {
    return takeonExcluded;
  }

  public void setTakeonExcluded(String takeonExcluded) {
    this.takeonExcluded = takeonExcluded;
  }

  public Item dueDate(String dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Get dueDate
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

  public Item amountLc(String amountLc) {
    this.amountLc = amountLc;
    return this;
  }

  /**
   * Get amountLc
   * @return amountLc
  */
  
  @Schema(name = "amountLc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amountLc")
  public String getAmountLc() {
    return amountLc;
  }

  public void setAmountLc(String amountLc) {
    this.amountLc = amountLc;
  }

  public Item createdId(String createdId) {
    this.createdId = createdId;
    return this;
  }

  /**
   * Get createdId
   * @return createdId
  */
  @NotNull
  @Schema(name = "createdId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("createdId")
  public String getCreatedId() {
    return createdId;
  }

  public void setCreatedId(String createdId) {
    this.createdId = createdId;
  }

  public Item deletedId(String deletedId) {
    this.deletedId = deletedId;
    return this;
  }

  /**
   * Get deletedId
   * @return deletedId
  */
  
  @Schema(name = "deletedId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deletedId")
  public String getDeletedId() {
    return deletedId;
  }

  public void setDeletedId(String deletedId) {
    this.deletedId = deletedId;
  }

  public Item type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Item amountDc(String amountDc) {
    this.amountDc = amountDc;
    return this;
  }

  /**
   * Get amountDc
   * @return amountDc
  */
  
  @Schema(name = "amountDc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amountDc")
  public String getAmountDc() {
    return amountDc;
  }

  public void setAmountDc(String amountDc) {
    this.amountDc = amountDc;
  }

  public Item reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
  */
  
  @Schema(name = "reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reference")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Item balanceDc(String balanceDc) {
    this.balanceDc = balanceDc;
    return this;
  }

  /**
   * Get balanceDc
   * @return balanceDc
  */
  
  @Schema(name = "balanceDc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceDc")
  public String getBalanceDc() {
    return balanceDc;
  }

  public void setBalanceDc(String balanceDc) {
    this.balanceDc = balanceDc;
  }

  public Item fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Get fingerprint
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

  public Item balanceLc(String balanceLc) {
    this.balanceLc = balanceLc;
    return this;
  }

  /**
   * Get balanceLc
   * @return balanceLc
  */
  
  @Schema(name = "balanceLc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceLc")
  public String getBalanceLc() {
    return balanceLc;
  }

  public void setBalanceLc(String balanceLc) {
    this.balanceLc = balanceLc;
  }

  public Item balanceSc(String balanceSc) {
    this.balanceSc = balanceSc;
    return this;
  }

  /**
   * Get balanceSc
   * @return balanceSc
  */
  
  @Schema(name = "balanceSc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceSc")
  public String getBalanceSc() {
    return balanceSc;
  }

  public void setBalanceSc(String balanceSc) {
    this.balanceSc = balanceSc;
  }

  public Item entryDate(String entryDate) {
    this.entryDate = entryDate;
    return this;
  }

  /**
   * Get entryDate
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

  public Item uniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
    return this;
  }

  /**
   * Get uniqueKey
   * @return uniqueKey
  */
  @Size(max = 250)
  @Schema(name = "uniqueKey", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("uniqueKey")
  public String getUniqueKey() {
    return uniqueKey;
  }

  public void setUniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
  }

  public Item taxAmountAc(String taxAmountAc) {
    this.taxAmountAc = taxAmountAc;
    return this;
  }

  /**
   * Get taxAmountAc
   * @return taxAmountAc
  */
  
  @Schema(name = "taxAmountAc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxAmountAc")
  public String getTaxAmountAc() {
    return taxAmountAc;
  }

  public void setTaxAmountAc(String taxAmountAc) {
    this.taxAmountAc = taxAmountAc;
  }

  public Item amountSc(String amountSc) {
    this.amountSc = amountSc;
    return this;
  }

  /**
   * Get amountSc
   * @return amountSc
  */
  
  @Schema(name = "amountSc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amountSc")
  public String getAmountSc() {
    return amountSc;
  }

  public void setAmountSc(String amountSc) {
    this.amountSc = amountSc;
  }

  public Item extraField1(String extraField1) {
    this.extraField1 = extraField1;
    return this;
  }

  /**
   * Get extraField1
   * @return extraField1
  */
  
  @Schema(name = "extraField1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extraField1")
  public String getExtraField1() {
    return extraField1;
  }

  public void setExtraField1(String extraField1) {
    this.extraField1 = extraField1;
  }

  public Item debtorReference(String debtorReference) {
    this.debtorReference = debtorReference;
    return this;
  }

  /**
   * Get debtorReference
   * @return debtorReference
  */
  
  @Schema(name = "debtorReference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("debtorReference")
  public String getDebtorReference() {
    return debtorReference;
  }

  public void setDebtorReference(String debtorReference) {
    this.debtorReference = debtorReference;
  }

  public Item extraField2(String extraField2) {
    this.extraField2 = extraField2;
    return this;
  }

  /**
   * Get extraField2
   * @return extraField2
  */
  
  @Schema(name = "extraField2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extraField2")
  public String getExtraField2() {
    return extraField2;
  }

  public void setExtraField2(String extraField2) {
    this.extraField2 = extraField2;
  }

  public Item extraField3(String extraField3) {
    this.extraField3 = extraField3;
    return this;
  }

  /**
   * Get extraField3
   * @return extraField3
  */
  
  @Schema(name = "extraField3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extraField3")
  public String getExtraField3() {
    return extraField3;
  }

  public void setExtraField3(String extraField3) {
    this.extraField3 = extraField3;
  }

  public Item disputeCode(String disputeCode) {
    this.disputeCode = disputeCode;
    return this;
  }

  /**
   * Get disputeCode
   * @return disputeCode
  */
  
  @Schema(name = "disputeCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disputeCode")
  public String getDisputeCode() {
    return disputeCode;
  }

  public void setDisputeCode(String disputeCode) {
    this.disputeCode = disputeCode;
  }

  public Item documentDate(String documentDate) {
    this.documentDate = documentDate;
    return this;
  }

  /**
   * Get documentDate
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

  public Item balanceDpc(String balanceDpc) {
    this.balanceDpc = balanceDpc;
    return this;
  }

  /**
   * Get balanceDpc
   * @return balanceDpc
  */
  
  @Schema(name = "balanceDpc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceDpc")
  public String getBalanceDpc() {
    return balanceDpc;
  }

  public void setBalanceDpc(String balanceDpc) {
    this.balanceDpc = balanceDpc;
  }

  public Item amountDpc(String amountDpc) {
    this.amountDpc = amountDpc;
    return this;
  }

  /**
   * Get amountDpc
   * @return amountDpc
  */
  
  @Schema(name = "amountDpc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amountDpc")
  public String getAmountDpc() {
    return amountDpc;
  }

  public void setAmountDpc(String amountDpc) {
    this.amountDpc = amountDpc;
  }

  public Item taxAmountSc(String taxAmountSc) {
    this.taxAmountSc = taxAmountSc;
    return this;
  }

  /**
   * Get taxAmountSc
   * @return taxAmountSc
  */
  
  @Schema(name = "taxAmountSc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxAmountSc")
  public String getTaxAmountSc() {
    return taxAmountSc;
  }

  public void setTaxAmountSc(String taxAmountSc) {
    this.taxAmountSc = taxAmountSc;
  }

  public Item taxAmountDpc(String taxAmountDpc) {
    this.taxAmountDpc = taxAmountDpc;
    return this;
  }

  /**
   * Get taxAmountDpc
   * @return taxAmountDpc
  */
  
  @Schema(name = "taxAmountDpc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxAmountDpc")
  public String getTaxAmountDpc() {
    return taxAmountDpc;
  }

  public void setTaxAmountDpc(String taxAmountDpc) {
    this.taxAmountDpc = taxAmountDpc;
  }

  public Item updatedId(String updatedId) {
    this.updatedId = updatedId;
    return this;
  }

  /**
   * Get updatedId
   * @return updatedId
  */
  
  @Schema(name = "updatedId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedId")
  public String getUpdatedId() {
    return updatedId;
  }

  public void setUpdatedId(String updatedId) {
    this.updatedId = updatedId;
  }

  public Item userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
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

  public Item closeDate(String closeDate) {
    this.closeDate = closeDate;
    return this;
  }

  /**
   * Get closeDate
   * @return closeDate
  */
  
  @Schema(name = "closeDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("closeDate")
  public String getCloseDate() {
    return closeDate;
  }

  public void setCloseDate(String closeDate) {
    this.closeDate = closeDate;
  }

  public Item taxAmountLc(String taxAmountLc) {
    this.taxAmountLc = taxAmountLc;
    return this;
  }

  /**
   * Get taxAmountLc
   * @return taxAmountLc
  */
  
  @Schema(name = "taxAmountLc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxAmountLc")
  public String getTaxAmountLc() {
    return taxAmountLc;
  }

  public void setTaxAmountLc(String taxAmountLc) {
    this.taxAmountLc = taxAmountLc;
  }

  public Item retained(String retained) {
    this.retained = retained;
    return this;
  }

  /**
   * Get retained
   * @return retained
  */
  
  @Schema(name = "retained", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retained")
  public String getRetained() {
    return retained;
  }

  public void setRetained(String retained) {
    this.retained = retained;
  }

  public Item currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
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

  public Item retainedDate(String retainedDate) {
    this.retainedDate = retainedDate;
    return this;
  }

  /**
   * Get retainedDate
   * @return retainedDate
  */
  
  @Schema(name = "retainedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retainedDate")
  public String getRetainedDate() {
    return retainedDate;
  }

  public void setRetainedDate(String retainedDate) {
    this.retainedDate = retainedDate;
  }

  public Item debtor(String debtor) {
    this.debtor = debtor;
    return this;
  }

  /**
   * Get debtor
   * @return debtor
  */
  
  @Schema(name = "debtor", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("debtor")
  public String getDebtor() {
    return debtor;
  }

  public void setDebtor(String debtor) {
    this.debtor = debtor;
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
    return Objects.equals(this.closedId, item.closedId) &&
        Objects.equals(this.takeonExcluded, item.takeonExcluded) &&
        Objects.equals(this.dueDate, item.dueDate) &&
        Objects.equals(this.amountLc, item.amountLc) &&
        Objects.equals(this.createdId, item.createdId) &&
        Objects.equals(this.deletedId, item.deletedId) &&
        Objects.equals(this.type, item.type) &&
        Objects.equals(this.amountDc, item.amountDc) &&
        Objects.equals(this.reference, item.reference) &&
        Objects.equals(this.balanceDc, item.balanceDc) &&
        Objects.equals(this.fingerprint, item.fingerprint) &&
        Objects.equals(this.balanceLc, item.balanceLc) &&
        Objects.equals(this.balanceSc, item.balanceSc) &&
        Objects.equals(this.entryDate, item.entryDate) &&
        Objects.equals(this.uniqueKey, item.uniqueKey) &&
        Objects.equals(this.taxAmountAc, item.taxAmountAc) &&
        Objects.equals(this.amountSc, item.amountSc) &&
        Objects.equals(this.extraField1, item.extraField1) &&
        Objects.equals(this.debtorReference, item.debtorReference) &&
        Objects.equals(this.extraField2, item.extraField2) &&
        Objects.equals(this.extraField3, item.extraField3) &&
        Objects.equals(this.disputeCode, item.disputeCode) &&
        Objects.equals(this.documentDate, item.documentDate) &&
        Objects.equals(this.balanceDpc, item.balanceDpc) &&
        Objects.equals(this.amountDpc, item.amountDpc) &&
        Objects.equals(this.taxAmountSc, item.taxAmountSc) &&
        Objects.equals(this.taxAmountDpc, item.taxAmountDpc) &&
        Objects.equals(this.updatedId, item.updatedId) &&
        Objects.equals(this.userName, item.userName) &&
        Objects.equals(this.closeDate, item.closeDate) &&
        Objects.equals(this.taxAmountLc, item.taxAmountLc) &&
        Objects.equals(this.retained, item.retained) &&
        Objects.equals(this.currencyCode, item.currencyCode) &&
        Objects.equals(this.retainedDate, item.retainedDate) &&
        Objects.equals(this.debtor, item.debtor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(closedId, takeonExcluded, dueDate, amountLc, createdId, deletedId, type, amountDc, reference, balanceDc, fingerprint, balanceLc, balanceSc, entryDate, uniqueKey, taxAmountAc, amountSc, extraField1, debtorReference, extraField2, extraField3, disputeCode, documentDate, balanceDpc, amountDpc, taxAmountSc, taxAmountDpc, updatedId, userName, closeDate, taxAmountLc, retained, currencyCode, retainedDate, debtor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    sb.append("    closedId: ").append(toIndentedString(closedId)).append("\n");
    sb.append("    takeonExcluded: ").append(toIndentedString(takeonExcluded)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    amountLc: ").append(toIndentedString(amountLc)).append("\n");
    sb.append("    createdId: ").append(toIndentedString(createdId)).append("\n");
    sb.append("    deletedId: ").append(toIndentedString(deletedId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amountDc: ").append(toIndentedString(amountDc)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    balanceDc: ").append(toIndentedString(balanceDc)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    balanceLc: ").append(toIndentedString(balanceLc)).append("\n");
    sb.append("    balanceSc: ").append(toIndentedString(balanceSc)).append("\n");
    sb.append("    entryDate: ").append(toIndentedString(entryDate)).append("\n");
    sb.append("    uniqueKey: ").append(toIndentedString(uniqueKey)).append("\n");
    sb.append("    taxAmountAc: ").append(toIndentedString(taxAmountAc)).append("\n");
    sb.append("    amountSc: ").append(toIndentedString(amountSc)).append("\n");
    sb.append("    extraField1: ").append(toIndentedString(extraField1)).append("\n");
    sb.append("    debtorReference: ").append(toIndentedString(debtorReference)).append("\n");
    sb.append("    extraField2: ").append(toIndentedString(extraField2)).append("\n");
    sb.append("    extraField3: ").append(toIndentedString(extraField3)).append("\n");
    sb.append("    disputeCode: ").append(toIndentedString(disputeCode)).append("\n");
    sb.append("    documentDate: ").append(toIndentedString(documentDate)).append("\n");
    sb.append("    balanceDpc: ").append(toIndentedString(balanceDpc)).append("\n");
    sb.append("    amountDpc: ").append(toIndentedString(amountDpc)).append("\n");
    sb.append("    taxAmountSc: ").append(toIndentedString(taxAmountSc)).append("\n");
    sb.append("    taxAmountDpc: ").append(toIndentedString(taxAmountDpc)).append("\n");
    sb.append("    updatedId: ").append(toIndentedString(updatedId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    closeDate: ").append(toIndentedString(closeDate)).append("\n");
    sb.append("    taxAmountLc: ").append(toIndentedString(taxAmountLc)).append("\n");
    sb.append("    retained: ").append(toIndentedString(retained)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    retainedDate: ").append(toIndentedString(retainedDate)).append("\n");
    sb.append("    debtor: ").append(toIndentedString(debtor)).append("\n");
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

