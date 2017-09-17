package com.gaiproject.dao;

import com.sqldalmaker.DataStore;

import com.gaiproject.pojo.AuditCashexpensepostingsetup;
import java.util.List;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually.
 * SQL DAL Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class AuditCashexpensepostingsetupDAO {

	protected final DataStore ds;

	public AuditCashexpensepostingsetupDAO(DataStore ds) {
		this.ds = ds;
	}

	/**
	 * CRUD-Create. The table 'audit_cashexpensepostingsetup'.
	 * Auto-generated values are assigned to appropriate fields of DTO.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int createAuditCashexpensepostingsetup(AuditCashexpensepostingsetup p) throws Exception {

		String sql = "INSERT INTO audit_cashexpensepostingsetup (ACTION, CONSISTENCYVERSION, CRGLACCOUNTID, CRGLACCOUNTNAME, CREATEDBY, DBGLACCOUNTID, DBGLACCOUNTNAME, ISUSERCASHACCOUNT, NAME, OBJECTID, STATUS, SYSTEMCREATEDATE, SYSTEMCREATETIMESTAMP, VERSION, USER_ID) " 
				 + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		String []genColNames = new String[] {"ID"};
		Object []genValues = new Object[genColNames.length];

		int res = ds.insert(sql, genColNames, genValues, p.getAction(), p.getConsistencyversion(), p.getCrglaccountid(), p.getCrglaccountname(), p.getCreatedby(), p.getDbglaccountid(), p.getDbglaccountname(), p.getIsusercashaccount(), p.getName(), p.getObjectid(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getVersion(), p.getUserId());

		p.setId(ds.castGeneratedValue(Long.class, genValues[0]));

		return res;
	}

	/**
	 * CRUD-Read. The table 'audit_cashexpensepostingsetup'.
	 */
	public List<AuditCashexpensepostingsetup> readAuditCashexpensepostingsetupList() throws Exception {

		String sql = "SELECT * FROM audit_cashexpensepostingsetup";

		return ds.queryDtoList(sql, new DataStore.RowHandler<AuditCashexpensepostingsetup>() {

			public AuditCashexpensepostingsetup handleRow(DataStore.RowData rd) throws Exception {
				AuditCashexpensepostingsetup obj = new AuditCashexpensepostingsetup();
				obj.setId(rd.getValue(Long.class, "ID"));
				obj.setAction(rd.getValue(String.class, "ACTION"));
				obj.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				obj.setCrglaccountid(rd.getValue(Long.class, "CRGLACCOUNTID"));
				obj.setCrglaccountname(rd.getValue(String.class, "CRGLACCOUNTNAME"));
				obj.setCreatedby(rd.getValue(String.class, "CREATEDBY"));
				obj.setDbglaccountid(rd.getValue(Long.class, "DBGLACCOUNTID"));
				obj.setDbglaccountname(rd.getValue(String.class, "DBGLACCOUNTNAME"));
				obj.setIsusercashaccount(rd.getValue(Boolean.class, "ISUSERCASHACCOUNT"));
				obj.setName(rd.getValue(String.class, "NAME"));
				obj.setObjectid(rd.getValue(Long.class, "OBJECTID"));
				obj.setStatus(rd.getValue(String.class, "STATUS"));
				obj.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
				obj.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
				obj.setVersion(rd.getValue(Long.class, "VERSION"));
				obj.setUserId(rd.getValue(Long.class, "USER_ID"));
				return obj;
			}

		});
	}

	/**
	 * CRUD-Read. The table 'audit_cashexpensepostingsetup'.
	 */
	public AuditCashexpensepostingsetup readAuditCashexpensepostingsetup(Long id) throws Exception {

		String sql = "SELECT * FROM audit_cashexpensepostingsetup WHERE ID = ?";

		return ds.queryDto(sql, new DataStore.RowHandler<AuditCashexpensepostingsetup>() {

			public AuditCashexpensepostingsetup handleRow(DataStore.RowData rd) throws Exception {
				AuditCashexpensepostingsetup res = new AuditCashexpensepostingsetup();
				res.setId(rd.getValue(Long.class, "ID"));
				res.setAction(rd.getValue(String.class, "ACTION"));
				res.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				res.setCrglaccountid(rd.getValue(Long.class, "CRGLACCOUNTID"));
				res.setCrglaccountname(rd.getValue(String.class, "CRGLACCOUNTNAME"));
				res.setCreatedby(rd.getValue(String.class, "CREATEDBY"));
				res.setDbglaccountid(rd.getValue(Long.class, "DBGLACCOUNTID"));
				res.setDbglaccountname(rd.getValue(String.class, "DBGLACCOUNTNAME"));
				res.setIsusercashaccount(rd.getValue(Boolean.class, "ISUSERCASHACCOUNT"));
				res.setName(rd.getValue(String.class, "NAME"));
				res.setObjectid(rd.getValue(Long.class, "OBJECTID"));
				res.setStatus(rd.getValue(String.class, "STATUS"));
				res.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
				res.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
				res.setVersion(rd.getValue(Long.class, "VERSION"));
				res.setUserId(rd.getValue(Long.class, "USER_ID"));
				return res;
			}

		}, id);
	}

	/**
	 * CRUD-Update. The table 'audit_cashexpensepostingsetup'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateAuditCashexpensepostingsetup(AuditCashexpensepostingsetup p) throws Exception {

		String sql = "UPDATE audit_cashexpensepostingsetup SET " 
				 + " ACTION = ?, CONSISTENCYVERSION = ?, CRGLACCOUNTID = ?, CRGLACCOUNTNAME = ?, CREATEDBY = ?, DBGLACCOUNTID = ?, DBGLACCOUNTNAME = ?, ISUSERCASHACCOUNT = ?, NAME = ?, OBJECTID = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, VERSION = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, p.getAction(), p.getConsistencyversion(), p.getCrglaccountid(), p.getCrglaccountname(), p.getCreatedby(), p.getDbglaccountid(), p.getDbglaccountname(), p.getIsusercashaccount(), p.getName(), p.getObjectid(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getVersion(), p.getUserId(), p.getId());
	}

	/**
	 * CRUD-Update. The table 'audit_cashexpensepostingsetup'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateAuditCashexpensepostingsetup(String action, Long consistencyversion, Long crglaccountid, String crglaccountname, String createdby, Long dbglaccountid, String dbglaccountname, Boolean isusercashaccount, String name, Long objectid, String status, java.util.Date systemcreatedate, java.util.Date systemcreatetimestamp, Long version, Long userId, Long id) throws Exception {

		String sql = "UPDATE audit_cashexpensepostingsetup SET " 
				 + " ACTION = ?, CONSISTENCYVERSION = ?, CRGLACCOUNTID = ?, CRGLACCOUNTNAME = ?, CREATEDBY = ?, DBGLACCOUNTID = ?, DBGLACCOUNTNAME = ?, ISUSERCASHACCOUNT = ?, NAME = ?, OBJECTID = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, VERSION = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, action, consistencyversion, crglaccountid, crglaccountname, createdby, dbglaccountid, dbglaccountname, isusercashaccount, name, objectid, status, systemcreatedate, systemcreatetimestamp, version, userId, id);
	}

	/**
	 * CRUD-Delete. The table 'audit_cashexpensepostingsetup'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteAuditCashexpensepostingsetup(AuditCashexpensepostingsetup p) throws Exception {

		String sql = "DELETE FROM audit_cashexpensepostingsetup WHERE ID = ?";

		return ds.execDML(sql, p.getId());
	}

	/**
	 * CRUD-Delete. The table 'audit_cashexpensepostingsetup'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteAuditCashexpensepostingsetup(Long id) throws Exception {

		String sql = "DELETE FROM audit_cashexpensepostingsetup WHERE ID = ?";

		return ds.execDML(sql, id);
	}
}