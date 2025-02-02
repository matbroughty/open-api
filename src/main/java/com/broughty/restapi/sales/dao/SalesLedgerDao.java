package com.broughty.restapi.sales.dao;

import com.broughty.restapi.model.Customer;
import com.broughty.restapi.sales.mapper.CustomerRowMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static com.broughty.restapi.sales.sql.SalesSQL.selectCustomer;
import static com.broughty.restapi.sales.sql.SalesSQL.selectCustomersTemplate;

@SuppressWarnings("SqlSourceToSinkFlow")
@Service
public class SalesLedgerDao {

  private static final Logger log = LoggerFactory.getLogger(SalesLedgerDao.class);

  private final JdbcTemplate jdbcTemplate;

  public SalesLedgerDao(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public Optional<Customer> getCustomerByUniqueKey(String companyId, String customerId) {
    log.info("In getCustomerByUniqueKey with companyId {} and customerId {}", companyId, customerId);
    // if this doesn't find one it will throw a EmptyResultDataAccessException
    return Optional.ofNullable(jdbcTemplate.queryForObject(selectCustomer, new CustomerRowMapper(), customerId, companyId));
  }

  /**
   * Not paged yet
   *
   * @param companyId the Ledger Extractor_code
   *
   * @return List of Customers (debtor) records
   */
  public List<Customer> getCustomersByCompanyId(String companyId, Integer createdId, Integer updatedId, BigDecimal balanceGtEq,
                                                BigDecimal balanceLt) {
    log.info("In getCustomersByCompanyId with customerId {} and updatedId {} and createdId {}", companyId, createdId, updatedId);
    Map<String, Object> map = new HashMap<>();
    map.put("companyId", companyId);
    map.put("createdId", createdId);
    map.put("updatedId", updatedId);
    map.put("balanceGtEq", balanceGtEq);
    map.put("balanceLt", balanceLt);
    String sql = selectCustomersTemplate.apply(map);
    log.info("SQL = {}", sql);
    return jdbcTemplate.query(sql, new CustomerRowMapper());
  }
}
