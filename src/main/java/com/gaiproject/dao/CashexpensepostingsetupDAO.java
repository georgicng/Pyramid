package com.gaiproject.dao;

import com.sqldalmaker.DataStore;

import com.gaiproject.pojo.Cashexpensepostingsetup;
import java.util.List;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually.
 * SQL DAL Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class CashexpensepostingsetupDAO {

	protected final DataStore ds;

	public CashexpensepostingsetupDAO(DataStore ds) {
		this.ds = ds;
	}

	/**
	 * CRUD-Create. The table 'cashexpensepostingsetup'.
	 * Auto-generated values are assigned to appropriate fields of DTO.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int createCashexpensepostingsetup(Cashexpensepostingsetup p) throws Exception {

		String sql = "INSERT INTO cashexpensepostingsetup (CONSISTENCYVERSION, NAME, STATUS, SYSTEMCREATEDATE, SYSTEMCREATETIMESTAMP, USERCASHACCOUNT, CRGLACCOUNT_ID, DBGLACCOUNT_ID, USER_ID) " 
				 + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

		String []genColNames = new String[] {"ID"};
		Object []genValues = new Object[genColNames.length];

		int res = ds.insert(sql, genColNames, genValues, p.getConsistencyversion(), p.getName(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getUsercashaccount(), p.getCrglaccountId(), p.getDbglaccountId(), p.getUserId());

		p.setId(ds.castGeneratedValue(Long.class, genValues[0]));

		return res;
	}

	/**
	 * CRUD-Read. The table 'cashexpensepostingsetup'.
	 */
	public List<Cashexpensepostingsetup> readCashexpensepostingsetupList() throws Exception {

		String sql = "SELECT * FROM cashexpensepostingsetup";

		return ds.queryDtoList(sql, new DataStore.RowHandler<Cashexpensepostingsetup>() {

			public Cashexpensepostingsetup handleRow(DataStore.RowData rd) throws Exception {
				Cashexpensepostingsetup obj = new Cashexpensepostingsetup();
				obj.setId(rd.getValue(Long.class, "ID"));
				obj.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				obj.setName(rd.getValue(String.class, "NAME"));
				obj.setStatus(rd.getValue(String.class, "STATUS"));
				obj.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
				obj.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
				obj.setUsercashaccount(rd.getValue(Boolean.class, "USERCASHACCOUNT"));
				obj.setCrglaccountId(rd.getValue(Long.class, "CRGLACCOUNT_ID"));
				obj.setDbglaccountId(rd.getValue(Long.class, "DBGLACCOUNT_ID"));
				obj.setUserId(rd.getValue(Long.class, "USER_ID"));
				return obj;
			}

		});
	}

	/**
	 * CRUD-Read. The table 'cashexpensepostingsetup'.
	 */
	public Cashexpensepostingsetup readCashexpensepostingsetup(Long id) throws Exception {

		String sql = "SELECT * FROM cashexpensepostingsetup WHERE ID = ?";

		return ds.queryDto(sql, new DataStore.RowHandler<Cashexpensepostingsetup>() {

			public Cashexpensepostingsetup handleRow(DataStore.RowData rd) throws Exception {
				Cashexpensepostingsetup res = new Cashexpensepostingsetup();
				res.setId(rd.getValue(Long.class, "ID"));
				res.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				res.setName(rd.getValue(String.class, "NAME"));
				res.setStatus(rd.getValue(String.class, "STATUS"));
				res.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
				res.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
				res.setUsercashaccount(rd.getValue(Boolean.class, "USERCASHACCOUNT"));
				res.setCrglaccountId(rd.getValue(Long.class, "CRGLACCOUNT_ID"));
				res.setDbglaccountId(rd.getValue(Long.class, "DBGLACCOUNT_ID"));
				res.setUserId(rd.getValue(Long.class, "USER_ID"));
				return res;
			}

		}, id);
	}

	/**
	 * CRUD-Update. The table 'cashexpensepostingsetup'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateCashexpensepostingsetup(Cashexpensepostingsetup p) throws Exception {

		String sql = "UPDATE cashexpensepostingsetup SET " 
				 + " CONSISTENCYVERSION = ?, NAME = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, USERCASHACCOUNT = ?, CRGLACCOUNT_ID = ?, DBGLACCOUNT_ID = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, p.getConsistencyversion(), p.getName(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getUsercashaccount(), p.getCrglaccountId(), p.getDbglaccountId(), p.getUserId(), p.getId());
	}

	/**
	 * CRUD-Update. The table 'cashexpensepostingsetup'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateCashexpensepostingsetup(Long consistencyversion, String name, String status, java.util.Date systemcreatedate, java.util.Date systemcreatetimestamp, Boolean usercashaccount, Long crglaccountId, Long dbglaccountId, Long userId, Long id) throws Exception {

		String sql = "UPDATE cashexpensepostingsetup SET " 
				 + " CONSISTENCYVERSION = ?, NAME = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, USERCASHACCOUNT = ?, CRGLACCOUNT_ID = ?, DBGLACCOUNT_ID = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, consistencyversion, name, status, systemcreatedate, systemcreatetimestamp, usercashaccount, crglaccountId, dbglaccountId, userId, id);
	}

	/**
	 * CRUD-Delete. The table 'cashexpensepostingsetup'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteCashexpensepostingsetup(Cashexpensepostingsetup p) throws Exception {

		String sql = "DELETE FROM cashexpensepostingsetup WHERE ID = ?";

		return ds.execDML(sql, p.getId());
	}

	/**
	 * CRUD-Delete. The table 'cashexpensepostingsetup'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteCashexpensepostingsetup(Long id) throws Exception {

		String sql = "DELETE FROM cashexpensepostingsetup WHERE ID = ?";

		return ds.execDML(sql, id);
	}
}