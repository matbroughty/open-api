package com.broughty.restapi.server;

import com.broughty.restapi.api.AccountingApi;
import com.broughty.restapi.model.*;
import com.broughty.restapi.services.AccountingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@RestController
public class AccountingAPIImpl implements AccountingApi {

  AccountingService accountingService;

  AccountingAPIImpl(AccountingService accountingService) {
    this.accountingService = accountingService;
  }

  @Override
  public ResponseEntity<AccountingGetAccountpackageInfo200Response> accountingGetAccountpackageInfo(String companyId) {
    return null;
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
    return null;
  }

  @Override
  public ResponseEntity<Customer> accountingGetCustomerById(String customerId, String companyId) {
    return ResponseEntity.ok(accountingService.findCustomerById(customerId, companyId));
  }

  @Override
  public ResponseEntity<DataFile> accountingGetDatafile(String companyId, String dataFileId) {
    return null;
  }

  @Override
  public ResponseEntity<Snapshot> accountingGetPreviousSnapshot(String companyId) {
    return null;
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

  @Override
  public ResponseEntity<Customers> accountingListCustomers(String page, Integer pageSize, String orderBy, String companyId, Integer createdId, String updatedId, Integer closedId, Integer deletedId, BigDecimal balanceGtEq, BigDecimal balanceLt, String notified, String notified2) {
    return null;
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
  public ResponseEntity<Items> accountingListPurchaseItems(String page, Integer pageSize, String status, String companyId, String orderByItem, String itemType, Integer createdId, String updatedId, Integer closedId, Integer deletedId, BigDecimal balanceGtEq, BigDecimal balanceLt) {
    return null;
  }

  @Override
  public ResponseEntity<Items> accountingListSalesItems(String page, Integer pageSize, String status, String companyId, String orderByItem, String itemType, Integer createdId, String updatedId, Integer closedId, Integer deletedId, BigDecimal balanceGtEq, BigDecimal balanceLt, String notified) {
    return null;
  }

  @Override
  public ResponseEntity<Snapshots> accountingListSnapshots(String page, Integer pageSize, String companyId, LocalDate snapshotDate, LocalDate snapshotDateGtEq, String snapshotDateLt, Boolean snapshotSalesBalanceChange) {
    return null;
  }

  @Override
  public ResponseEntity<Suppliers> accountingListSuppliers(String page, Integer pageSize, String orderBy, String companyId, Integer createdId, String updatedId, Integer closedId, Integer deletedId, BigDecimal balanceLt, BigDecimal balanceGtEq) {
    return null;
  }
}
