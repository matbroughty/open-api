package com.broughty.restapi.sales.dao;

import com.broughty.restapi.model.Customer;
import com.broughty.restapi.sales.mapper.CustomerRowMapper;
import com.markgrand.smileyVars.SmileyVarsTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

@Service
public class SalesLedgerDao {

  private static final Logger log = LoggerFactory.getLogger(SalesLedgerDao.class);
  /**
   * Allows for one or many params to be added/picked up
   * Externalise these
   */
  private static final SmileyVarsTemplate selectDebtorsTemplate
      = SmileyVarsTemplate.ansiTemplate("SELECT L.EXTRACTOR_CODE, D.* FROM DEBTOR D INNER JOIN LEDGER L ON L.ID = D.LEDGER_ID " +
      "WHERE L.EXTRACTOR_CODE=:companyId " +
      "(: and CREATED_ID=:createdId :) " +
      "(: and UPDATED_ID=:updatedId :) " +
      "(: and SALESLEDGER_BAL_DC>=:balanceGtEq :) " +
      "(: and SALESLEDGER_BAL_DC<:balanceLt :)");

  private final JdbcTemplate jdbcTemplate;


  public SalesLedgerDao(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }


  public Optional<Customer> getCustomerByUniqueKey(String companyId, String customerId) {
    log.info("In getCustomerByUniqueKey with companyId {} and customerId {}", companyId, customerId);

    String query = "SELECT L.EXTRACTOR_CODE, D.* FROM DEBTOR D INNER JOIN LEDGER L ON L.ID = D.LEDGER_ID WHERE D.UNIQUE_KEY = ? AND L.EXTRACTOR_CODE = ?";
    // if this doesn't find one it will throw a EmptyResultDataAccessException
    Customer customer = jdbcTemplate.queryForObject(query, new CustomerRowMapper(), customerId, companyId);
    log.info("Customer is {}", customer);
    return Optional.ofNullable(customer);
  }

  /**
   * Not paged yet
   *
   * @param companyId the Ledger Extractor_code
   *
   * @return List of Customers (debtor) records
   */
  @SuppressWarnings("SqlSourceToSinkFlow")
  public List<Customer> getCustomersByCompanyId(String companyId, Integer createdId, Integer updatedId, BigDecimal balanceGtEq,
                                                BigDecimal balanceLt) {
    log.info("In getCustomersByCompanyId with customerId {} and updatedId {} and createdId {}", companyId, createdId, updatedId);
    Map<String, Object> map = new HashMap<>();
    map.put("companyId", companyId);
    map.put("createdId", createdId);
    map.put("updatedId", updatedId);
    map.put("balanceGtEq", balanceGtEq);
    map.put("balanceLt", balanceLt);

    String sql = selectDebtorsTemplate.apply(map);
    log.info("SQL = {}", sql);
    return jdbcTemplate.query(sql, new CustomerRowMapper());
  }
}
