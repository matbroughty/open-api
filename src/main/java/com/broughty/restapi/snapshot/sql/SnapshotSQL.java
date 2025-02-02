package com.broughty.restapi.snapshot.sql;

import com.markgrand.smileyVars.SmileyVarsTemplate;

public interface SnapshotSQL {

  SmileyVarsTemplate selectSnapshotsTemplate
      = SmileyVarsTemplate.ansiTemplate("SELECT L.EXTRACTOR_CODE, LU.* FROM LEDGERUPDATE LU INNER JOIN LEDGER L ON L.ID = LU.LEDGER_ID " +
      "WHERE L.EXTRACTOR_CODE=:companyId " +
      "(: and RECEIVED_DATE=:snapshotDate :) " +
      "(: and RECEIVED_DATE>=:snapshotDateGtEq :) ");


  String selectLatestUpdate =
      "SELECT L.EXTRACTOR_CODE, LU.* FROM LEDGERUPDATE LU INNER JOIN LEDGER L ON L.ID = LU.LEDGER_ID WHERE L.EXTRACTOR_CODE = ? AND LU.ID = L.LATEST_LEDGERUPDATE_ID";

  String selectPreviousUpdate =
      "SELECT L.EXTRACTOR_CODE, LU.* FROM LEDGERUPDATE LU INNER JOIN LEDGER L ON L.ID = LU.LEDGER_ID WHERE L.EXTRACTOR_CODE = ? AND LU.ID = L.PREVIOUS_LEDGERUPDATE_ID";

}
