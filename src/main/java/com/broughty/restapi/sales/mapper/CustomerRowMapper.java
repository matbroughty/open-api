package com.broughty.restapi.sales.mapper;

import com.broughty.restapi.model.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerRowMapper implements RowMapper<Customer> {
  @Override
  public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
    return new Customer().accountName(rs.getString("NAME"))
        .companyId(rs.getString("EXTRACTOR_CODE"))
        .uniqueKey(rs.getString("UNIQUE_KEY"))
        .reference(rs.getString("REFERENCE"))
        .currencyCode(rs.getString("CURRENCY_CODE"))
        .createdId(rs.getInt("CREATED_ID"))
        .updatedId(rs.getInt("UPDATED_ID"))
        .closedId(rs.getInt("CLOSED_ID"))
        .deletedId(rs.getInt("DELETED_ID"))
        .address1(rs.getString("ADDRESS_1"))
        .address2(rs.getString("ADDRESS_2"))
        .address3(rs.getString("ADDRESS_3"))
        .address4(rs.getString("ADDRESS_4"))
        .postCode(rs.getString("POSTAL_CODE"))
        .countryCode(rs.getString("COUNTRY_CODE"))
        .balanceAc(rs.getBigDecimal("SALESLEDGER_BAL_DC"))
        .balanceCc(rs.getBigDecimal("SALESLEDGER_BAL_LC"))
        .balanceSc(rs.getBigDecimal("SALESLEDGER_BAL_SC"))
        .balancePackage(rs.getBigDecimal("SALESLEDGER_BAL_CLIENT_DC"));
  }
}