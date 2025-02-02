package com.broughty.restapi.server;

import com.broughty.restapi.api.AccountingApi;
import com.broughty.restapi.model.*;
import com.broughty.restapi.sales.dao.SalesLedgerDao;
import com.broughty.restapi.server.exception.ResourceNotFoundException;
import com.broughty.restapi.snapshot.dao.SnapshotDao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class AccountingAPIImpl implements AccountingApi {

  private final SalesLedgerDao salesLedgerDao;
  private final SnapshotDao snapshotDao;


  AccountingAPIImpl(SalesLedgerDao salesLedgerDao, SnapshotDao snapshotDao) {
    this.salesLedgerDao = salesLedgerDao;
    this.snapshotDao = snapshotDao;
  }


  @Override
  public ResponseEntity<List<AgeingBucket>> accountingGetAgedCreditor(String companyId, String ageingDate) {
    return null;
  }

  @Override
  public ResponseEntity<List<AgeingBucket>> accountingGetAgedDebtor(String companyId, String notified, String ageingDate) {
    return null;
  }

  @Override
  public ResponseEntity<Snapshot> accountingGetCurrentSnapshot(String companyId) {
    Optional<Snapshot> snapshot = snapshotDao.getCurrentSnapshot(companyId);
    if (snapshot.isEmpty()) {
      throw new ResourceNotFoundException(String.format("Company with Id %s not found or Company has no Snapshots", companyId));
    }
    return ResponseEntity.ok(snapshot.get());
  }


  @Override
  public ResponseEntity<Customer> accountingGetCustomerById(String companyId, String customerId) {
    Optional<Customer> customer = salesLedgerDao.getCustomerByUniqueKey(companyId, customerId);
    if (customer.isEmpty()) {
      throw new ResourceNotFoundException(String.format("Company with Id %s or Customer with key %s not found", companyId, customerId));
    }
    return ResponseEntity.ok(customer.get());
  }

  @Override
  public ResponseEntity<DataFile> accountingGetDatafile(String companyId, String dataFileId) {
    return null;
  }

  @Override
  public ResponseEntity<Snapshot> accountingGetPreviousSnapshot(String companyId) {
    Optional<Snapshot> snapshot = snapshotDao.getPreviousSnapshot(companyId);
    if (snapshot.isEmpty()) {
      throw new ResourceNotFoundException(String.format("Company with Id %s not found or Company not had 2 Snapshots yet", companyId));
    }
    return ResponseEntity.ok(snapshot.get());
  }

  @Override
  public ResponseEntity<Item> accountingGetSalesItem(String companyId, String itemKey) {
    return null;
  }

  @Override
  public ResponseEntity<Supplier> accountingGetSupplierById(String companyId, String supplierId) {
    return null;
  }

  @Override
  public ResponseEntity<List<Bank>> accountingListBanks(String companyId) {
    return null;
  }

  @Override
  public ResponseEntity<BankItems> accountingListBanksItems(String companyId, String bankUniqueKey) {
    return null;
  }


  /**
   * Needs complete rewrite - just testing!
   */
  @Override
  public ResponseEntity<Customers> accountingListCustomers(String page, Integer pageSize, String orderBy, String companyId, Integer createdId, Integer updatedId, Integer closedId, Integer deletedId, BigDecimal balanceGtEq, BigDecimal balanceLt, String notified, String notified2) {
    List<Customer> customersResultList = salesLedgerDao.getCustomersByCompanyId(companyId, createdId, updatedId, balanceGtEq, balanceLt);
    Customers customers = new Customers().results(customersResultList).pageSize(1).totalResults(customersResultList.size());
    return ResponseEntity.ok(customers);
  }

  @Override
  public ResponseEntity<DataFiles> accountingListDatafiles(String page, String orderBy, Integer pageSize, String companyId, Integer createdId) {
    return null;
  }

  @Override
  public ResponseEntity<NominalAccount> accountingListNominal(String companyId) {
    return null;
  }


  @Override
  public ResponseEntity<Snapshots> accountingListSnapshots(String page, Integer pageSize, String companyId, LocalDate snapshotDate, LocalDate snapshotDateGtEq, String snapshotDateLt, Boolean snapshotSalesBalanceChange) {
    List<Snapshot> snapshotResultList = snapshotDao.getSnapshotsByCompanyId(companyId, snapshotDate, snapshotDateGtEq);
    Snapshots snapshots = new Snapshots().results(snapshotResultList).pageSize(1).totalResults(snapshotResultList.size());
    return ResponseEntity.ok(snapshots);

  }

  @Override
  public ResponseEntity<PackageInfo> accountingGetAccountpackageInfo(String companyId) {
    return null;
  }

  @Override
  public ResponseEntity<Items> accountingListPurchaseItems(String page, Integer pageSize, String status, String companyId, String orderByItem, String itemType, Integer createdId, Integer updatedId, Integer closedId, Integer deletedId, BigDecimal balanceGtEq, BigDecimal balanceLt) {
    return null;
  }

  @Override
  public ResponseEntity<Items> accountingListSalesItems(String page, Integer pageSize, String status, String companyId, String orderByItem, String itemType, Integer createdId, Integer updatedId, Integer closedId, Integer deletedId, BigDecimal balanceGtEq, BigDecimal balanceLt, String notified) {
    return null;
  }

  @Override
  public ResponseEntity<Suppliers> accountingListSuppliers(String page, Integer pageSize, String orderBy, String companyId, Integer createdId, Integer updatedId, Integer closedId, Integer deletedId, BigDecimal balanceLt, BigDecimal balanceGtEq) {
    return null;
  }
}
