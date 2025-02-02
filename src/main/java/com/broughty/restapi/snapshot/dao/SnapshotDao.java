package com.broughty.restapi.snapshot.dao;

import com.broughty.restapi.model.Snapshot;
import com.broughty.restapi.snapshot.mapper.SnapshotRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static com.broughty.restapi.snapshot.sql.SnapshotSQL.*;

@SuppressWarnings("SqlSourceToSinkFlow")
@Service
public class SnapshotDao {

  private final JdbcTemplate jdbcTemplate;


  public SnapshotDao(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }


  public Optional<Snapshot> getCurrentSnapshot(String companyId) {
    return Optional.ofNullable(jdbcTemplate.queryForObject(selectLatestUpdate, new SnapshotRowMapper(), companyId));
  }

  public Optional<Snapshot> getPreviousSnapshot(String companyId) {
    return Optional.ofNullable(jdbcTemplate.queryForObject(selectPreviousUpdate, new SnapshotRowMapper(), companyId));
  }

  /**
   * Nasty date stuff to convert to Date
   */
  public List<Snapshot> getSnapshotsByCompanyId(String companyId, LocalDate snapshotDate, LocalDate snapshotDateGtEq) {
    Map<String, Object> map = new HashMap<>();
    map.put("companyId", companyId);
    map.put("snapshotDate", snapshotDate != null ? Date.from(snapshotDate.atStartOfDay(ZoneId.systemDefault()).toInstant()) : snapshotDate);
    map.put("snapshotDateGtEq", snapshotDateGtEq != null ? Date.from(snapshotDateGtEq.atStartOfDay(ZoneId.systemDefault()).toInstant()) : snapshotDateGtEq);
    return jdbcTemplate.query(selectSnapshotsTemplate.apply(map), new SnapshotRowMapper());
  }
}
