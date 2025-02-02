package com.broughty.restapi.sales.sql;

import com.markgrand.smileyVars.SmileyVarsTemplate;

public interface SalesSQL {

  /**
   * Allows for one or many params to be added/picked up
   * Externalise these
   */
  SmileyVarsTemplate selectCustomersTemplate
      = SmileyVarsTemplate.ansiTemplate("SELECT L.EXTRACTOR_CODE, D.* FROM DEBTOR D INNER JOIN LEDGER L ON L.ID = D.LEDGER_ID " +
      "WHERE L.EXTRACTOR_CODE=:companyId " +
      "(: and CREATED_ID=:createdId :) " +
      "(: and UPDATED_ID=:updatedId :) " +
      "(: and SALESLEDGER_BAL_DC>=:balanceGtEq :) " +
      "(: and SALESLEDGER_BAL_DC<:balanceLt :)");


  String selectCustomer =
      "SELECT L.EXTRACTOR_CODE, D.* FROM DEBTOR D INNER JOIN LEDGER L ON L.ID = D.LEDGER_ID WHERE D.UNIQUE_KEY = ? AND L.EXTRACTOR_CODE = ?";

}
