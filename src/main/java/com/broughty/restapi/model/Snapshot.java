package com.broughty.restapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.lang.Nullable;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * A Snapshot is at Company Level and represents the state of the originating data source at a point in time.  The balances are all at either Company or System level
 */

@Schema(name = "Snapshot", description = "A Snapshot is at Company Level and represents the state of the originating data source at a point in time.  The balances are all at either Company or System level")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-02T13:18:41.397887300Z[Europe/London]", comments = "Generator version: 7.11.0")
public class Snapshot {

  private @Nullable Integer dataFileId;

  private Integer snapshotId;

  private @Nullable String dataFileReceived;

  private @Nullable String receivedDate;

  private @Nullable String loadStarted;

  private @Nullable String loadFinished;

  private @Nullable String extractDate;

  private @Nullable BigDecimal balanceCc;

  private @Nullable BigDecimal balanceSc;

  private @Nullable BigDecimal purchaseBalanceCc;

  private @Nullable BigDecimal purchaseBalanceSc;

  private @Nullable BigDecimal overdueCc;

  private @Nullable BigDecimal overdueSc;

  private @Nullable BigDecimal balanceExcCc;

  private @Nullable BigDecimal balanceExcSc;

  private @Nullable Integer deletedItems;

  private @Nullable Integer modifiedItems;

  private @Nullable Integer newItems;

  private @Nullable Integer cashBalanceCc;

  private @Nullable Integer cashBalanceSc;

  private @Nullable Integer cashNewBalanceCc;

  private @Nullable Integer cashNewBalanceSc;

  private @Nullable Integer deletedPurchaseItems;

  private @Nullable Integer modifiedPurchaseItems;

  private @Nullable Integer newPurchaseItems;

  private @Nullable BigDecimal invoiceBalanceCc;

  private @Nullable BigDecimal invoiceBalanceSc;

  private @Nullable Integer invoiceChangedCc;

  private @Nullable Integer invoiceChangedSc;

  private @Nullable BigDecimal invoiceClosedCc;

  private @Nullable Integer invoiceDeletedCc;

  private @Nullable Integer invoiceDeletedSc;

  private @Nullable Integer invoiceMissing;

  private @Nullable Integer invoiceNew;

  private @Nullable String companyId;

  private @Nullable BigDecimal startBalanceCc;

  private @Nullable BigDecimal startBalanceSc;

  private @Nullable BigDecimal id;

  public Snapshot() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Snapshot(Integer snapshotId) {
    this.snapshotId = snapshotId;
  }

  public Snapshot dataFileId(Integer dataFileId) {
    this.dataFileId = dataFileId;
    return this;
  }

  /**
   * The DataFile id that resulted in the snapshot
   *
   * @return dataFileId
   */

  @Schema(name = "dataFileId", description = "The DataFile id that resulted in the snapshot", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataFileId")
  public Integer getDataFileId() {
    return dataFileId;
  }

  public void setDataFileId(Integer dataFileId) {
    this.dataFileId = dataFileId;
  }

  public Snapshot snapshotId(Integer snapshotId) {
    this.snapshotId = snapshotId;
    return this;
  }

  /**
   * Id of the Snapshot.  Used as the createdId, closedId, updatedId and deletedId in Customer, Supplier and Items records.
   *
   * @return snapshotId
   */
  @NotNull
  @Schema(name = "snapshotId", description = "Id of the Snapshot.  Used as the createdId, closedId, updatedId and deletedId in Customer, Supplier and Items records.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("snapshotId")
  public Integer getSnapshotId() {
    return snapshotId;
  }

  public void setSnapshotId(Integer snapshotId) {
    this.snapshotId = snapshotId;
  }

  public Snapshot dataFileReceived(String dataFileReceived) {
    this.dataFileReceived = dataFileReceived;
    return this;
  }

  /**
   * Get dataFileReceived
   *
   * @return dataFileReceived
   */

  @Schema(name = "dataFileReceived", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataFileReceived")
  public String getDataFileReceived() {
    return dataFileReceived;
  }

  public void setDataFileReceived(String dataFileReceived) {
    this.dataFileReceived = dataFileReceived;
  }

  public Snapshot receivedDate(String receivedDate) {
    this.receivedDate = receivedDate;
    return this;
  }

  /**
   * Get receivedDate
   *
   * @return receivedDate
   */

  @Schema(name = "receivedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("receivedDate")
  public String getReceivedDate() {
    return receivedDate;
  }

  public void setReceivedDate(String receivedDate) {
    this.receivedDate = receivedDate;
  }

  public Snapshot loadStarted(String loadStarted) {
    this.loadStarted = loadStarted;
    return this;
  }

  /**
   * Get loadStarted
   *
   * @return loadStarted
   */

  @Schema(name = "loadStarted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("loadStarted")
  public String getLoadStarted() {
    return loadStarted;
  }

  public void setLoadStarted(String loadStarted) {
    this.loadStarted = loadStarted;
  }

  public Snapshot loadFinished(String loadFinished) {
    this.loadFinished = loadFinished;
    return this;
  }

  /**
   * Get loadFinished
   *
   * @return loadFinished
   */

  @Schema(name = "loadFinished", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("loadFinished")
  public String getLoadFinished() {
    return loadFinished;
  }

  public void setLoadFinished(String loadFinished) {
    this.loadFinished = loadFinished;
  }

  public Snapshot extractDate(String extractDate) {
    this.extractDate = extractDate;
    return this;
  }

  /**
   * Get extractDate
   *
   * @return extractDate
   */

  @Schema(name = "extractDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extractDate")
  public String getExtractDate() {
    return extractDate;
  }

  public void setExtractDate(String extractDate) {
    this.extractDate = extractDate;
  }

  public Snapshot balanceCc(BigDecimal balanceCc) {
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

  public Snapshot balanceSc(BigDecimal balanceSc) {
    this.balanceSc = balanceSc;
    return this;
  }

  /**
   * Slaes ledger balance in Company currency as a result of this snapshot.
   *
   * @return balanceSc
   */
  @Valid
  @Schema(name = "balanceSc", description = "Slaes ledger balance in Company currency as a result of this snapshot.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceSc")
  public BigDecimal getBalanceSc() {
    return balanceSc;
  }

  public void setBalanceSc(BigDecimal balanceSc) {
    this.balanceSc = balanceSc;
  }

  public Snapshot purchaseBalanceCc(BigDecimal purchaseBalanceCc) {
    this.purchaseBalanceCc = purchaseBalanceCc;
    return this;
  }

  /**
   * Get purchaseBalanceCc
   *
   * @return purchaseBalanceCc
   */
  @Valid
  @Schema(name = "purchaseBalanceCc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purchaseBalanceCc")
  public BigDecimal getPurchaseBalanceCc() {
    return purchaseBalanceCc;
  }

  public void setPurchaseBalanceCc(BigDecimal purchaseBalanceCc) {
    this.purchaseBalanceCc = purchaseBalanceCc;
  }

  public Snapshot purchaseBalanceSc(BigDecimal purchaseBalanceSc) {
    this.purchaseBalanceSc = purchaseBalanceSc;
    return this;
  }

  /**
   * Get purchaseBalanceSc
   *
   * @return purchaseBalanceSc
   */
  @Valid
  @Schema(name = "purchaseBalanceSc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purchaseBalanceSc")
  public BigDecimal getPurchaseBalanceSc() {
    return purchaseBalanceSc;
  }

  public void setPurchaseBalanceSc(BigDecimal purchaseBalanceSc) {
    this.purchaseBalanceSc = purchaseBalanceSc;
  }

  public Snapshot overdueCc(BigDecimal overdueCc) {
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

  public Snapshot overdueSc(BigDecimal overdueSc) {
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

  public Snapshot balanceExcCc(BigDecimal balanceExcCc) {
    this.balanceExcCc = balanceExcCc;
    return this;
  }

  /**
   * Get balanceExcCc
   *
   * @return balanceExcCc
   */
  @Valid
  @Schema(name = "balanceExcCc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceExcCc")
  public BigDecimal getBalanceExcCc() {
    return balanceExcCc;
  }

  public void setBalanceExcCc(BigDecimal balanceExcCc) {
    this.balanceExcCc = balanceExcCc;
  }

  public Snapshot balanceExcSc(BigDecimal balanceExcSc) {
    this.balanceExcSc = balanceExcSc;
    return this;
  }

  /**
   * Get balanceExcSc
   *
   * @return balanceExcSc
   */
  @Valid
  @Schema(name = "balanceExcSc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceExcSc")
  public BigDecimal getBalanceExcSc() {
    return balanceExcSc;
  }

  public void setBalanceExcSc(BigDecimal balanceExcSc) {
    this.balanceExcSc = balanceExcSc;
  }

  public Snapshot deletedItems(Integer deletedItems) {
    this.deletedItems = deletedItems;
    return this;
  }

  /**
   * Get deletedItems
   *
   * @return deletedItems
   */

  @Schema(name = "deletedItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deletedItems")
  public Integer getDeletedItems() {
    return deletedItems;
  }

  public void setDeletedItems(Integer deletedItems) {
    this.deletedItems = deletedItems;
  }

  public Snapshot modifiedItems(Integer modifiedItems) {
    this.modifiedItems = modifiedItems;
    return this;
  }

  /**
   * Get modifiedItems
   *
   * @return modifiedItems
   */

  @Schema(name = "modifiedItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modifiedItems")
  public Integer getModifiedItems() {
    return modifiedItems;
  }

  public void setModifiedItems(Integer modifiedItems) {
    this.modifiedItems = modifiedItems;
  }

  public Snapshot newItems(Integer newItems) {
    this.newItems = newItems;
    return this;
  }

  /**
   * Get newItems
   *
   * @return newItems
   */

  @Schema(name = "newItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("newItems")
  public Integer getNewItems() {
    return newItems;
  }

  public void setNewItems(Integer newItems) {
    this.newItems = newItems;
  }

  public Snapshot cashBalanceCc(Integer cashBalanceCc) {
    this.cashBalanceCc = cashBalanceCc;
    return this;
  }

  /**
   * Get cashBalanceCc
   *
   * @return cashBalanceCc
   */

  @Schema(name = "cashBalanceCc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cashBalanceCc")
  public Integer getCashBalanceCc() {
    return cashBalanceCc;
  }

  public void setCashBalanceCc(Integer cashBalanceCc) {
    this.cashBalanceCc = cashBalanceCc;
  }

  public Snapshot cashBalanceSc(Integer cashBalanceSc) {
    this.cashBalanceSc = cashBalanceSc;
    return this;
  }

  /**
   * Get cashBalanceSc
   *
   * @return cashBalanceSc
   */

  @Schema(name = "cashBalanceSc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cashBalanceSc")
  public Integer getCashBalanceSc() {
    return cashBalanceSc;
  }

  public void setCashBalanceSc(Integer cashBalanceSc) {
    this.cashBalanceSc = cashBalanceSc;
  }

  public Snapshot cashNewBalanceCc(Integer cashNewBalanceCc) {
    this.cashNewBalanceCc = cashNewBalanceCc;
    return this;
  }

  /**
   * Get cashNewBalanceCc
   *
   * @return cashNewBalanceCc
   */

  @Schema(name = "cashNewBalanceCc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cashNewBalanceCc")
  public Integer getCashNewBalanceCc() {
    return cashNewBalanceCc;
  }

  public void setCashNewBalanceCc(Integer cashNewBalanceCc) {
    this.cashNewBalanceCc = cashNewBalanceCc;
  }

  public Snapshot cashNewBalanceSc(Integer cashNewBalanceSc) {
    this.cashNewBalanceSc = cashNewBalanceSc;
    return this;
  }

  /**
   * Get cashNewBalanceSc
   *
   * @return cashNewBalanceSc
   */

  @Schema(name = "cashNewBalanceSc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cashNewBalanceSc")
  public Integer getCashNewBalanceSc() {
    return cashNewBalanceSc;
  }

  public void setCashNewBalanceSc(Integer cashNewBalanceSc) {
    this.cashNewBalanceSc = cashNewBalanceSc;
  }

  public Snapshot deletedPurchaseItems(Integer deletedPurchaseItems) {
    this.deletedPurchaseItems = deletedPurchaseItems;
    return this;
  }

  /**
   * Get deletedPurchaseItems
   *
   * @return deletedPurchaseItems
   */

  @Schema(name = "deletedPurchaseItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deletedPurchaseItems")
  public Integer getDeletedPurchaseItems() {
    return deletedPurchaseItems;
  }

  public void setDeletedPurchaseItems(Integer deletedPurchaseItems) {
    this.deletedPurchaseItems = deletedPurchaseItems;
  }

  public Snapshot modifiedPurchaseItems(Integer modifiedPurchaseItems) {
    this.modifiedPurchaseItems = modifiedPurchaseItems;
    return this;
  }

  /**
   * Get modifiedPurchaseItems
   *
   * @return modifiedPurchaseItems
   */

  @Schema(name = "modifiedPurchaseItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modifiedPurchaseItems")
  public Integer getModifiedPurchaseItems() {
    return modifiedPurchaseItems;
  }

  public void setModifiedPurchaseItems(Integer modifiedPurchaseItems) {
    this.modifiedPurchaseItems = modifiedPurchaseItems;
  }

  public Snapshot newPurchaseItems(Integer newPurchaseItems) {
    this.newPurchaseItems = newPurchaseItems;
    return this;
  }

  /**
   * Get newPurchaseItems
   *
   * @return newPurchaseItems
   */

  @Schema(name = "newPurchaseItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("newPurchaseItems")
  public Integer getNewPurchaseItems() {
    return newPurchaseItems;
  }

  public void setNewPurchaseItems(Integer newPurchaseItems) {
    this.newPurchaseItems = newPurchaseItems;
  }

  public Snapshot invoiceBalanceCc(BigDecimal invoiceBalanceCc) {
    this.invoiceBalanceCc = invoiceBalanceCc;
    return this;
  }

  /**
   * Get invoiceBalanceCc
   *
   * @return invoiceBalanceCc
   */
  @Valid
  @Schema(name = "invoiceBalanceCc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invoiceBalanceCc")
  public BigDecimal getInvoiceBalanceCc() {
    return invoiceBalanceCc;
  }

  public void setInvoiceBalanceCc(BigDecimal invoiceBalanceCc) {
    this.invoiceBalanceCc = invoiceBalanceCc;
  }

  public Snapshot invoiceBalanceSc(BigDecimal invoiceBalanceSc) {
    this.invoiceBalanceSc = invoiceBalanceSc;
    return this;
  }

  /**
   * Get invoiceBalanceSc
   *
   * @return invoiceBalanceSc
   */
  @Valid
  @Schema(name = "invoiceBalanceSc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invoiceBalanceSc")
  public BigDecimal getInvoiceBalanceSc() {
    return invoiceBalanceSc;
  }

  public void setInvoiceBalanceSc(BigDecimal invoiceBalanceSc) {
    this.invoiceBalanceSc = invoiceBalanceSc;
  }

  public Snapshot invoiceChangedCc(Integer invoiceChangedCc) {
    this.invoiceChangedCc = invoiceChangedCc;
    return this;
  }

  /**
   * Get invoiceChangedCc
   *
   * @return invoiceChangedCc
   */

  @Schema(name = "invoiceChangedCc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invoiceChangedCc")
  public Integer getInvoiceChangedCc() {
    return invoiceChangedCc;
  }

  public void setInvoiceChangedCc(Integer invoiceChangedCc) {
    this.invoiceChangedCc = invoiceChangedCc;
  }

  public Snapshot invoiceChangedSc(Integer invoiceChangedSc) {
    this.invoiceChangedSc = invoiceChangedSc;
    return this;
  }

  /**
   * Get invoiceChangedSc
   *
   * @return invoiceChangedSc
   */

  @Schema(name = "invoiceChangedSc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invoiceChangedSc")
  public Integer getInvoiceChangedSc() {
    return invoiceChangedSc;
  }

  public void setInvoiceChangedSc(Integer invoiceChangedSc) {
    this.invoiceChangedSc = invoiceChangedSc;
  }

  public Snapshot invoiceClosedCc(BigDecimal invoiceClosedCc) {
    this.invoiceClosedCc = invoiceClosedCc;
    return this;
  }

  /**
   * Get invoiceClosedCc
   *
   * @return invoiceClosedCc
   */
  @Valid
  @Schema(name = "invoiceClosedCc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invoiceClosedCc")
  public BigDecimal getInvoiceClosedCc() {
    return invoiceClosedCc;
  }

  public void setInvoiceClosedCc(BigDecimal invoiceClosedCc) {
    this.invoiceClosedCc = invoiceClosedCc;
  }

  public Snapshot invoiceDeletedCc(Integer invoiceDeletedCc) {
    this.invoiceDeletedCc = invoiceDeletedCc;
    return this;
  }

  /**
   * Get invoiceDeletedCc
   *
   * @return invoiceDeletedCc
   */

  @Schema(name = "invoiceDeletedCc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invoiceDeletedCc")
  public Integer getInvoiceDeletedCc() {
    return invoiceDeletedCc;
  }

  public void setInvoiceDeletedCc(Integer invoiceDeletedCc) {
    this.invoiceDeletedCc = invoiceDeletedCc;
  }

  public Snapshot invoiceDeletedSc(Integer invoiceDeletedSc) {
    this.invoiceDeletedSc = invoiceDeletedSc;
    return this;
  }

  /**
   * Get invoiceDeletedSc
   *
   * @return invoiceDeletedSc
   */

  @Schema(name = "invoiceDeletedSc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invoiceDeletedSc")
  public Integer getInvoiceDeletedSc() {
    return invoiceDeletedSc;
  }

  public void setInvoiceDeletedSc(Integer invoiceDeletedSc) {
    this.invoiceDeletedSc = invoiceDeletedSc;
  }

  public Snapshot invoiceMissing(Integer invoiceMissing) {
    this.invoiceMissing = invoiceMissing;
    return this;
  }

  /**
   * Get invoiceMissing
   *
   * @return invoiceMissing
   */

  @Schema(name = "invoiceMissing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invoiceMissing")
  public Integer getInvoiceMissing() {
    return invoiceMissing;
  }

  public void setInvoiceMissing(Integer invoiceMissing) {
    this.invoiceMissing = invoiceMissing;
  }

  public Snapshot invoiceNew(Integer invoiceNew) {
    this.invoiceNew = invoiceNew;
    return this;
  }

  /**
   * Get invoiceNew
   *
   * @return invoiceNew
   */

  @Schema(name = "invoiceNew", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invoiceNew")
  public Integer getInvoiceNew() {
    return invoiceNew;
  }

  public void setInvoiceNew(Integer invoiceNew) {
    this.invoiceNew = invoiceNew;
  }

  public Snapshot companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * The Company Identifier UUID
   *
   * @return companyId
   */
  @Size(min = 36, max = 36)
  @Schema(name = "companyId", description = "The Company Identifier UUID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("companyId")
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public Snapshot startBalanceCc(BigDecimal startBalanceCc) {
    this.startBalanceCc = startBalanceCc;
    return this;
  }

  /**
   * Sales ledger balance in Company Currency before this Snapshot.
   *
   * @return startBalanceCc
   */
  @Valid
  @Schema(name = "startBalanceCc", description = "Sales ledger balance in Company Currency before this Snapshot.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startBalanceCc")
  public BigDecimal getStartBalanceCc() {
    return startBalanceCc;
  }

  public void setStartBalanceCc(BigDecimal startBalanceCc) {
    this.startBalanceCc = startBalanceCc;
  }

  public Snapshot startBalanceSc(BigDecimal startBalanceSc) {
    this.startBalanceSc = startBalanceSc;
    return this;
  }

  /**
   * Sales ledger balance in System Currency before this Snapshot
   *
   * @return startBalanceSc
   */
  @Valid
  @Schema(name = "startBalanceSc", description = "Sales ledger balance in System Currency before this Snapshot", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startBalanceSc")
  public BigDecimal getStartBalanceSc() {
    return startBalanceSc;
  }

  public void setStartBalanceSc(BigDecimal startBalanceSc) {
    this.startBalanceSc = startBalanceSc;
  }

  public Snapshot id(BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * This snapshot id
   *
   * @return id
   */
  @Valid
  @Schema(name = "id", description = "This snapshot id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Snapshot snapshot = (Snapshot) o;
    return Objects.equals(this.dataFileId, snapshot.dataFileId) &&
        Objects.equals(this.snapshotId, snapshot.snapshotId) &&
        Objects.equals(this.dataFileReceived, snapshot.dataFileReceived) &&
        Objects.equals(this.receivedDate, snapshot.receivedDate) &&
        Objects.equals(this.loadStarted, snapshot.loadStarted) &&
        Objects.equals(this.loadFinished, snapshot.loadFinished) &&
        Objects.equals(this.extractDate, snapshot.extractDate) &&
        Objects.equals(this.balanceCc, snapshot.balanceCc) &&
        Objects.equals(this.balanceSc, snapshot.balanceSc) &&
        Objects.equals(this.purchaseBalanceCc, snapshot.purchaseBalanceCc) &&
        Objects.equals(this.purchaseBalanceSc, snapshot.purchaseBalanceSc) &&
        Objects.equals(this.overdueCc, snapshot.overdueCc) &&
        Objects.equals(this.overdueSc, snapshot.overdueSc) &&
        Objects.equals(this.balanceExcCc, snapshot.balanceExcCc) &&
        Objects.equals(this.balanceExcSc, snapshot.balanceExcSc) &&
        Objects.equals(this.deletedItems, snapshot.deletedItems) &&
        Objects.equals(this.modifiedItems, snapshot.modifiedItems) &&
        Objects.equals(this.newItems, snapshot.newItems) &&
        Objects.equals(this.cashBalanceCc, snapshot.cashBalanceCc) &&
        Objects.equals(this.cashBalanceSc, snapshot.cashBalanceSc) &&
        Objects.equals(this.cashNewBalanceCc, snapshot.cashNewBalanceCc) &&
        Objects.equals(this.cashNewBalanceSc, snapshot.cashNewBalanceSc) &&
        Objects.equals(this.deletedPurchaseItems, snapshot.deletedPurchaseItems) &&
        Objects.equals(this.modifiedPurchaseItems, snapshot.modifiedPurchaseItems) &&
        Objects.equals(this.newPurchaseItems, snapshot.newPurchaseItems) &&
        Objects.equals(this.invoiceBalanceCc, snapshot.invoiceBalanceCc) &&
        Objects.equals(this.invoiceBalanceSc, snapshot.invoiceBalanceSc) &&
        Objects.equals(this.invoiceChangedCc, snapshot.invoiceChangedCc) &&
        Objects.equals(this.invoiceChangedSc, snapshot.invoiceChangedSc) &&
        Objects.equals(this.invoiceClosedCc, snapshot.invoiceClosedCc) &&
        Objects.equals(this.invoiceDeletedCc, snapshot.invoiceDeletedCc) &&
        Objects.equals(this.invoiceDeletedSc, snapshot.invoiceDeletedSc) &&
        Objects.equals(this.invoiceMissing, snapshot.invoiceMissing) &&
        Objects.equals(this.invoiceNew, snapshot.invoiceNew) &&
        Objects.equals(this.companyId, snapshot.companyId) &&
        Objects.equals(this.startBalanceCc, snapshot.startBalanceCc) &&
        Objects.equals(this.startBalanceSc, snapshot.startBalanceSc) &&
        Objects.equals(this.id, snapshot.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataFileId, snapshotId, dataFileReceived, receivedDate, loadStarted, loadFinished, extractDate, balanceCc, balanceSc, purchaseBalanceCc, purchaseBalanceSc, overdueCc, overdueSc, balanceExcCc, balanceExcSc, deletedItems, modifiedItems, newItems, cashBalanceCc, cashBalanceSc, cashNewBalanceCc, cashNewBalanceSc, deletedPurchaseItems, modifiedPurchaseItems, newPurchaseItems, invoiceBalanceCc, invoiceBalanceSc, invoiceChangedCc, invoiceChangedSc, invoiceClosedCc, invoiceDeletedCc, invoiceDeletedSc, invoiceMissing, invoiceNew, companyId, startBalanceCc, startBalanceSc, id);
  }

  @Override
  public String toString() {
    String sb = "class Snapshot {\n" +
        "    dataFileId: " + toIndentedString(dataFileId) + "\n" +
        "    snapshotId: " + toIndentedString(snapshotId) + "\n" +
        "    dataFileReceived: " + toIndentedString(dataFileReceived) + "\n" +
        "    receivedDate: " + toIndentedString(receivedDate) + "\n" +
        "    loadStarted: " + toIndentedString(loadStarted) + "\n" +
        "    loadFinished: " + toIndentedString(loadFinished) + "\n" +
        "    extractDate: " + toIndentedString(extractDate) + "\n" +
        "    balanceCc: " + toIndentedString(balanceCc) + "\n" +
        "    balanceSc: " + toIndentedString(balanceSc) + "\n" +
        "    purchaseBalanceCc: " + toIndentedString(purchaseBalanceCc) + "\n" +
        "    purchaseBalanceSc: " + toIndentedString(purchaseBalanceSc) + "\n" +
        "    overdueCc: " + toIndentedString(overdueCc) + "\n" +
        "    overdueSc: " + toIndentedString(overdueSc) + "\n" +
        "    balanceExcCc: " + toIndentedString(balanceExcCc) + "\n" +
        "    balanceExcSc: " + toIndentedString(balanceExcSc) + "\n" +
        "    deletedItems: " + toIndentedString(deletedItems) + "\n" +
        "    modifiedItems: " + toIndentedString(modifiedItems) + "\n" +
        "    newItems: " + toIndentedString(newItems) + "\n" +
        "    cashBalanceCc: " + toIndentedString(cashBalanceCc) + "\n" +
        "    cashBalanceSc: " + toIndentedString(cashBalanceSc) + "\n" +
        "    cashNewBalanceCc: " + toIndentedString(cashNewBalanceCc) + "\n" +
        "    cashNewBalanceSc: " + toIndentedString(cashNewBalanceSc) + "\n" +
        "    deletedPurchaseItems: " + toIndentedString(deletedPurchaseItems) + "\n" +
        "    modifiedPurchaseItems: " + toIndentedString(modifiedPurchaseItems) + "\n" +
        "    newPurchaseItems: " + toIndentedString(newPurchaseItems) + "\n" +
        "    invoiceBalanceCc: " + toIndentedString(invoiceBalanceCc) + "\n" +
        "    invoiceBalanceSc: " + toIndentedString(invoiceBalanceSc) + "\n" +
        "    invoiceChangedCc: " + toIndentedString(invoiceChangedCc) + "\n" +
        "    invoiceChangedSc: " + toIndentedString(invoiceChangedSc) + "\n" +
        "    invoiceClosedCc: " + toIndentedString(invoiceClosedCc) + "\n" +
        "    invoiceDeletedCc: " + toIndentedString(invoiceDeletedCc) + "\n" +
        "    invoiceDeletedSc: " + toIndentedString(invoiceDeletedSc) + "\n" +
        "    invoiceMissing: " + toIndentedString(invoiceMissing) + "\n" +
        "    invoiceNew: " + toIndentedString(invoiceNew) + "\n" +
        "    companyId: " + toIndentedString(companyId) + "\n" +
        "    startBalanceCc: " + toIndentedString(startBalanceCc) + "\n" +
        "    startBalanceSc: " + toIndentedString(startBalanceSc) + "\n" +
        "    id: " + toIndentedString(id) + "\n" +
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

