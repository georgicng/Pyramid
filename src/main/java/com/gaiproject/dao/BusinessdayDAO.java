package com.gaiproject.dao;

import com.sqldalmaker.DataStore;

import com.gaiproject.pojo.Businessday;
import java.util.List;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually.
 * SQL DAL Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class BusinessdayDAO {

	protected final DataStore ds;

	public BusinessdayDAO(DataStore ds) {
		this.ds = ds;
	}

	/**
	 * CRUD-Create. The table 'businessday'.
	 * Auto-generated values are assigned to appropriate fields of DTO.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int createBusinessday(Businessday p) throws Exception {

		String sql = "INSERT INTO businessday (BUSINESSDATE, BUSINESSDATESTRINGFORMAT, BUSINESSSTATUS, CONSISTENCYVERSION, STATUS, SYSTEMCREATEDATE, SYSTEMCREATETIMESTAMP, USER_ID) " 
				 + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

		String []genColNames = new String[] {"ID"};
		Object []genValues = new Object[genColNames.length];

		int res = ds.insert(sql, genColNames, genValues, p.getBusinessdate(), p.getBusinessdatestringformat(), p.getBusinessstatus(), p.getConsistencyversion(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getUserId());

		p.setId(ds.castGeneratedValue(Long.class, genValues[0]));

		return res;
	}

	/**
	 * CRUD-Read. The table 'businessday'.
	 */
	public List<Businessday> readBusinessdayList() throws Exception {

		String sql = "SELECT * FROM businessday";

		return ds.queryDtoList(sql, new DataStore.RowHandler<Businessday>() {

			public Businessday handleRow(DataStore.RowData rd) throws Exception {
				Businessday obj = new Businessday();
				obj.setId(rd.getValue(Long.class, "ID"));
				obj.setBusinessdate(rd.getValue(java.util.Date.class, "BUSINESSDATE"));
				obj.setBusinessdatestringformat(rd.getValue(String.class, "BUSINESSDATESTRINGFORMAT"));
				obj.setBusinessstatus(rd.getValue(String.class, "BUSINESSSTATUS"));
				obj.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				obj.setStatus(rd.getValue(String.class, "STATUS"));
				obj.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
				obj.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
				obj.setUserId(rd.getValue(Long.class, "USER_ID"));
				return obj;
			}

		});
	}

	/**
	 * CRUD-Read. The table 'businessday'.
	 */
	public Businessday readBusinessday(Long id) throws Exception {

		String sql = "SELECT * FROM businessday WHERE ID = ?";

		return ds.queryDto(sql, new DataStore.RowHandler<Businessday>() {

			public Businessday handleRow(DataStore.RowData rd) throws Exception {
				Businessday res = new Businessday();
				res.setId(rd.getValue(Long.class, "ID"));
				res.setBusinessdate(rd.getValue(java.util.Date.class, "BUSINESSDATE"));
				res.setBusinessdatestringformat(rd.getValue(String.class, "BUSINESSDATESTRINGFORMAT"));
				res.setBusinessstatus(rd.getValue(String.class, "BUSINESSSTATUS"));
				res.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				res.setStatus(rd.getValue(String.class, "STATUS"));
				res.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
				res.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
				res.setUserId(rd.getValue(Long.class, "USER_ID"));
				return res;
			}

		}, id);
	}

	/**
	 * CRUD-Update. The table 'businessday'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateBusinessday(Businessday p) throws Exception {

		String sql = "UPDATE businessday SET " 
				 + " BUSINESSDATE = ?, BUSINESSDATESTRINGFORMAT = ?, BUSINESSSTATUS = ?, CONSISTENCYVERSION = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, p.getBusinessdate(), p.getBusinessdatestringformat(), p.getBusinessstatus(), p.getConsistencyversion(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getUserId(), p.getId());
	}

	/**
	 * CRUD-Update. The table 'businessday'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateBusinessday(java.util.Date businessdate, String businessdatestringformat, String businessstatus, Long consistencyversion, String status, java.util.Date systemcreatedate, java.util.Date systemcreatetimestamp, Long userId, Long id) throws Exception {

		String sql = "UPDATE businessday SET " 
				 + " BUSINESSDATE = ?, BUSINESSDATESTRINGFORMAT = ?, BUSINESSSTATUS = ?, CONSISTENCYVERSION = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, businessdate, businessdatestringformat, businessstatus, consistencyversion, status, systemcreatedate, systemcreatetimestamp, userId, id);
	}

	/**
	 * CRUD-Delete. The table 'businessday'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteBusinessday(Businessday p) throws Exception {

		String sql = "DELETE FROM businessday WHERE ID = ?";

		return ds.execDML(sql, p.getId());
	}

	/**
	 * CRUD-Delete. The table 'businessday'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteBusinessday(Long id) throws Exception {

		String sql = "DELETE FROM businessday WHERE ID = ?";

		return ds.execDML(sql, id);
	}
}