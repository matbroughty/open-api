package com.broughty.restapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The raw data file that will become a Snapshot if allowed through. If status is 40 then the suspendedDetails will be populated and the createdId will be null.
 */

@Schema(name = "DataFile", description = "The raw data file that will become a Snapshot if allowed through. If status is 40 then the suspendedDetails will be populated and the createdId will be null.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-02T13:18:41.397887300Z[Europe/London]", comments = "Generator version: 7.11.0")
public class DataFile {

  private String id;

  private Integer status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime receivedDate;

  private @Nullable String content;

  private @Nullable String createdId;

  private @Nullable Integer previousStatus;

  private @Nullable DataFileSuspendedDetails suspendedDetails;

  public DataFile() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DataFile(String id, Integer status) {
    this.id = id;
    this.status = status;
  }

  public DataFile id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique Id of the DataFile instance
   *
   * @return id
   */
  @NotNull
  @Schema(name = "id", description = "Unique Id of the DataFile instance", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DataFile status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * - 0  = WAITING   : Awaiting processing by the Engine  - 5  = PAUSED    : Data file processing is PAUSED  - 20 = COMPLETED : Data file finished and Snapshot createdId is populated  - 30 = COMPLETED ERROR : Data file failed on server side  - 35 = COMPLETED ERROR TIMEOUT : Data file failed on server side due to exceeding processing time (30 mins default)  - 40 = SUSPENDED : Data suspended.  Exceeds Company suspension limit percentage, i.e. the load would increase or decrese the sales ledger by too much if let through  - 50 - CLIENT FAILURE : Typicalls an on-premise connector has failed.
   *
   * @return status
   */
  @NotNull
  @Schema(name = "status", description = "- 0  = WAITING   : Awaiting processing by the Engine  - 5  = PAUSED    : Data file processing is PAUSED  - 20 = COMPLETED : Data file finished and Snapshot createdId is populated  - 30 = COMPLETED ERROR : Data file failed on server side  - 35 = COMPLETED ERROR TIMEOUT : Data file failed on server side due to exceeding processing time (30 mins default)  - 40 = SUSPENDED : Data suspended.  Exceeds Company suspension limit percentage, i.e. the load would increase or decrese the sales ledger by too much if let through  - 50 - CLIENT FAILURE : Typicalls an on-premise connector has failed.  ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public DataFile receivedDate(OffsetDateTime receivedDate) {
    this.receivedDate = receivedDate;
    return this;
  }

  /**
   * Date the DataFile was first seen by Open Accounting
   *
   * @return receivedDate
   */
  @Valid
  @Schema(name = "receivedDate", description = "Date the DataFile was first seen by Open Accounting", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("receivedDate")
  public OffsetDateTime getReceivedDate() {
    return receivedDate;
  }

  public void setReceivedDate(OffsetDateTime receivedDate) {
    this.receivedDate = receivedDate;
  }

  public DataFile content(String content) {
    this.content = content;
    return this;
  }

  /**
   * The raw content from the data source.  This will be empty for the list method and only populated for the single Get
   *
   * @return content
   */

  @Schema(name = "content", description = "The raw content from the data source.  This will be empty for the list method and only populated for the single Get ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public DataFile createdId(String createdId) {
    this.createdId = createdId;
    return this;
  }

  /**
   * The Snapshot id if the status is completed
   *
   * @return createdId
   */

  @Schema(name = "createdId", description = "The Snapshot id if the status is completed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdId")
  public String getCreatedId() {
    return createdId;
  }

  public void setCreatedId(String createdId) {
    this.createdId = createdId;
  }

  public DataFile previousStatus(Integer previousStatus) {
    this.previousStatus = previousStatus;
    return this;
  }

  /**
   * See status - stores the previous status.  Useful to trouble shoot.
   *
   * @return previousStatus
   */

  @Schema(name = "previousStatus", description = "See status - stores the previous status.  Useful to trouble shoot.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("previousStatus")
  public Integer getPreviousStatus() {
    return previousStatus;
  }

  public void setPreviousStatus(Integer previousStatus) {
    this.previousStatus = previousStatus;
  }

  public DataFile suspendedDetails(DataFileSuspendedDetails suspendedDetails) {
    this.suspendedDetails = suspendedDetails;
    return this;
  }

  /**
   * Get suspendedDetails
   *
   * @return suspendedDetails
   */
  @Valid
  @Schema(name = "suspendedDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suspendedDetails")
  public DataFileSuspendedDetails getSuspendedDetails() {
    return suspendedDetails;
  }

  public void setSuspendedDetails(DataFileSuspendedDetails suspendedDetails) {
    this.suspendedDetails = suspendedDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataFile dataFile = (DataFile) o;
    return Objects.equals(this.id, dataFile.id) &&
        Objects.equals(this.status, dataFile.status) &&
        Objects.equals(this.receivedDate, dataFile.receivedDate) &&
        Objects.equals(this.content, dataFile.content) &&
        Objects.equals(this.createdId, dataFile.createdId) &&
        Objects.equals(this.previousStatus, dataFile.previousStatus) &&
        Objects.equals(this.suspendedDetails, dataFile.suspendedDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, receivedDate, content, createdId, previousStatus, suspendedDetails);
  }

  @Override
  public String toString() {
    String sb = "class DataFile {\n" +
        "    id: " + toIndentedString(id) + "\n" +
        "    status: " + toIndentedString(status) + "\n" +
        "    receivedDate: " + toIndentedString(receivedDate) + "\n" +
        "    content: " + toIndentedString(content) + "\n" +
        "    createdId: " + toIndentedString(createdId) + "\n" +
        "    previousStatus: " + toIndentedString(previousStatus) + "\n" +
        "    suspendedDetails: " + toIndentedString(suspendedDetails) + "\n" +
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

