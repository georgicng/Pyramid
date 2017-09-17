package com.gaiproject.dao;

import com.sqldalmaker.DataStore;

import com.gaiproject.pojo.Trialbalance;
import java.util.List;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually.
 * SQL DAL Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class TrialbalanceDAO {

	protected final DataStore ds;

	public TrialbalanceDAO(DataStore ds) {
		this.ds = ds;
	}

	/**
	 * CRUD-Create. The table 'trialbalance'.
	 * Auto-generated values are assigned to appropriate fields of DTO.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int createTrialbalance(Trialbalance p) throws Exception {

		String sql = "INSERT INTO trialbalance (AMOUNT, BUSINESSDATE, CONSISTENCYVERSION, STATUS, SYSTEMCREATEDATE, SYSTEMCREATETIMESTAMP, GLACCOUNT_ID, USER_ID) " 
				 + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

		String []genColNames = new String[] {"ID"};
		Object []genValues = new Object[genColNames.length];

		int res = ds.insert(sql, genColNames, genValues, p.getAmount(), p.getBusinessdate(), p.getConsistencyversion(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getGlaccountId(), p.getUserId());

		p.setId(ds.castGeneratedValue(Long.class, genValues[0]));

		return res;
	}

	/**
	 * CRUD-Read. The table 'trialbalance'.
	 */
	public List<Trialbalance> readTrialbalanceList() throws Exception {

		String sql = "SELECT * FROM trialbalance";

		return ds.queryDtoList(sql, new DataStore.RowHandler<Trialbalance>() {

			public Trialbalance handleRow(DataStore.RowData rd) throws Exception {
				Trialbalance obj = new Trialbalance();
				obj.setId(rd.getValue(Long.class, "ID"));
				obj.setAmount(rd.getValue(java.math.BigDecimal.class, "AMOUNT"));
				obj.setBusinessdate(rd.getValue(java.util.Date.class, "BUSINESSDATE"));
				obj.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				obj.setStatus(rd.getValue(String.class, "STATUS"));
				obj.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
				obj.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
				obj.setGlaccountId(rd.getValue(Long.class, "GLACCOUNT_ID"));
				obj.setUserId(rd.getValue(Long.class, "USER_ID"));
				return obj;
			}

		});
	}

	/**
	 * CRUD-Read. The table 'trialbalance'.
	 */
	public Trialbalance readTrialbalance(Long id) throws Exception {

		String sql = "SELECT * FROM trialbalance WHERE ID = ?";

		return ds.queryDto(sql, new DataStore.RowHandler<Trialbalance>() {

			public Trialbalance handleRow(DataStore.RowData rd) throws Exception {
				Trialbalance res = new Trialbalance();
				res.setId(rd.getValue(Long.class, "ID"));
				res.setAmount(rd.getValue(java.math.BigDecimal.class, "AMOUNT"));
				res.setBusinessdate(rd.getValue(java.util.Date.class, "BUSINESSDATE"));
				res.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				res.setStatus(rd.getValue(String.class, "STATUS"));
				res.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
				res.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
				res.setGlaccountId(rd.getValue(Long.class, "GLACCOUNT_ID"));
				res.setUserId(rd.getValue(Long.class, "USER_ID"));
				return res;
			}

		}, id);
	}

	/**
	 * CRUD-Update. The table 'trialbalance'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateTrialbalance(Trialbalance p) throws Exception {

		String sql = "UPDATE trialbalance SET " 
				 + " AMOUNT = ?, BUSINESSDATE = ?, CONSISTENCYVERSION = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, GLACCOUNT_ID = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, p.getAmount(), p.getBusinessdate(), p.getConsistencyversion(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getGlaccountId(), p.getUserId(), p.getId());
	}

	/**
	 * CRUD-Update. The table 'trialbalance'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateTrialbalance(java.math.BigDecimal amount, java.util.Date businessdate, Long consistencyversion, String status, java.util.Date systemcreatedate, java.util.Date systemcreatetimestamp, Long glaccountId, Long userId, Long id) throws Exception {

		String sql = "UPDATE trialbalance SET " 
				 + " AMOUNT = ?, BUSINESSDATE = ?, CONSISTENCYVERSION = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, GLACCOUNT_ID = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, amount, businessdate, consistencyversion, status, systemcreatedate, systemcreatetimestamp, glaccountId, userId, id);
	}

	/**
	 * CRUD-Delete. The table 'trialbalance'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteTrialbalance(Trialbalance p) throws Exception {

		String sql = "DELETE FROM trialbalance WHERE ID = ?";

		return ds.execDML(sql, p.getId());
	}

	/**
	 * CRUD-Delete. The table 'trialbalance'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteTrialbalance(Long id) throws Exception {

		String sql = "DELETE FROM trialbalance WHERE ID = ?";

		return ds.execDML(sql, id);
	}
}