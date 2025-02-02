package com.broughty.restapi.snapshot.mapper;

import com.broughty.restapi.model.Snapshot;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Only partially mapped in the model and here
 */
public class SnapshotRowMapper implements RowMapper<Snapshot> {
  @Override
  public Snapshot mapRow(ResultSet rs, int rowNum) throws SQLException {
    return new Snapshot()
        .companyId(rs.getString("EXTRACTOR_CODE"))
        .id(rs.getBigDecimal("ID"))
        .balanceCc(rs.getBigDecimal("SALESLEDGER_BAL_LC"))
        .balanceSc(rs.getBigDecimal("SALESLEDGER_BAL_SC"))
        .balanceExcCc(rs.getBigDecimal("SALESLEDGER_BAL_EXC_LC"))
        .balanceExcSc(rs.getBigDecimal("SALESLEDGER_BAL_EXC_SC"))
        .startBalanceCc(rs.getBigDecimal("SALESLEDGER_START_BAL_LC"))
        .startBalanceSc(rs.getBigDecimal("SALESLEDGER_START_BAL_SC"))
        .dataFileReceived(rs.getString("RECEIVED_DATE"))
        .invoiceBalanceCc(rs.getBigDecimal("INVOICE_BAL_LC"))
        .invoiceBalanceSc(rs.getBigDecimal("INVOICE_BAL_SC"))
        .invoiceNew(rs.getInt("INVOICES_NEW"));
  }
}