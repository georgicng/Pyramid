package com.gaiproject.dao;

import com.sqldalmaker.DataStore;

import com.gaiproject.pojo.AuditGlaccount;
import java.util.List;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually.
 * SQL DAL Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class AuditGlaccountDAO {

	protected final DataStore ds;

	public AuditGlaccountDAO(DataStore ds) {
		this.ds = ds;
	}

	/**
	 * CRUD-Create. The table 'audit_glaccounts'.
	 * Auto-generated values are assigned to appropriate fields of DTO.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int createAuditGlaccount(AuditGlaccount p) throws Exception {

		String sql = "INSERT INTO audit_glaccounts (ACCOUNTUSERNAME, ACTION, AMOUNT, BASECATEGORY, CATEGORY, CONSISTENCYVERSION, CREATEDBY, DESCRIPTION, GLCODE, GLNAME, OBJECTID, STATUS, SYSTEMCREATEDATE, SYSTEMCREATETIMESTAMP, TYPE, VERSION, USER_ID) " 
				 + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		String []genColNames = new String[] {"ID"};
		Object []genValues = new Object[genColNames.length];

		int res = ds.insert(sql, genColNames, genValues, p.getAccountusername(), p.getAction(), p.getAmount(), p.getBasecategory(), p.getCategory(), p.getConsistencyversion(), p.getCreatedby(), p.getDescription(), p.getGlcode(), p.getGlname(), p.getObjectid(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getType(), p.getVersion(), p.getUserId());

		p.setId(ds.castGeneratedValue(Long.class, genValues[0]));

		return res;
	}

	/**
	 * CRUD-Read. The table 'audit_glaccounts'.
	 */
	public List<AuditGlaccount> readAuditGlaccountList() throws Exception {

		String sql = "SELECT * FROM audit_glaccounts";

		return ds.queryDtoList(sql, new DataStore.RowHandler<AuditGlaccount>() {

			public AuditGlaccount handleRow(DataStore.RowData rd) throws Exception {
				AuditGlaccount obj = new AuditGlaccount();
				obj.setId(rd.getValue(Long.class, "ID"));
				obj.setAccountusername(rd.getValue(String.class, "ACCOUNTUSERNAME"));
				obj.setAction(rd.getValue(String.class, "ACTION"));
				obj.setAmount(rd.getValue(String.class, "AMOUNT"));
				obj.setBasecategory(rd.getValue(String.class, "BASECATEGORY"));
				obj.setCategory(rd.getValue(String.class, "CATEGORY"));
				obj.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				obj.setCreatedby(rd.getValue(String.class, "CREATEDBY"));
				obj.setDescription(rd.getValue(String.class, "DESCRIPTION"));
				obj.setGlcode(rd.getValue(String.class, "GLCODE"));
				obj.setGlname(rd.getValue(String.class, "GLNAME"));
				obj.setObjectid(rd.getValue(Long.class, "OBJECTID"));
				obj.setStatus(rd.getValue(String.class, "STATUS"));
				obj.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
				obj.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
				obj.setType(rd.getValue(String.class, "TYPE"));
				obj.setVersion(rd.getValue(Long.class, "VERSION"));
				obj.setUserId(rd.getValue(Long.class, "USER_ID"));
				return obj;
			}

		});
	}

	/**
	 * CRUD-Read. The table 'audit_glaccounts'.
	 */
	public AuditGlaccount readAuditGlaccount(Long id) throws Exception {

		String sql = "SELECT * FROM audit_glaccounts WHERE ID = ?";

		return ds.queryDto(sql, new DataStore.RowHandler<AuditGlaccount>() {

			public AuditGlaccount handleRow(DataStore.RowData rd) throws Exception {
				AuditGlaccount res = new AuditGlaccount();
				res.setId(rd.getValue(Long.class, "ID"));
				res.setAccountusername(rd.getValue(String.class, "ACCOUNTUSERNAME"));
				res.setAction(rd.getValue(String.class, "ACTION"));
				res.setAmount(rd.getValue(String.class, "AMOUNT"));
				res.setBasecategory(rd.getValue(String.class, "BASECATEGORY"));
				res.setCategory(rd.getValue(String.class, "CATEGORY"));
				res.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				res.setCreatedby(rd.getValue(String.class, "CREATEDBY"));
				res.setDescription(rd.getValue(String.class, "DESCRIPTION"));
				res.setGlcode(rd.getValue(String.class, "GLCODE"));
				res.setGlname(rd.getValue(String.class, "GLNAME"));
				res.setObjectid(rd.getValue(Long.class, "OBJECTID"));
				res.setStatus(rd.getValue(String.class, "STATUS"));
				res.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
				res.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
				res.setType(rd.getValue(String.class, "TYPE"));
				res.setVersion(rd.getValue(Long.class, "VERSION"));
				res.setUserId(rd.getValue(Long.class, "USER_ID"));
				return res;
			}

		}, id);
	}

	/**
	 * CRUD-Update. The table 'audit_glaccounts'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateAuditGlaccount(AuditGlaccount p) throws Exception {

		String sql = "UPDATE audit_glaccounts SET " 
				 + " ACCOUNTUSERNAME = ?, ACTION = ?, AMOUNT = ?, BASECATEGORY = ?, CATEGORY = ?, CONSISTENCYVERSION = ?, CREATEDBY = ?, DESCRIPTION = ?, GLCODE = ?, GLNAME = ?, OBJECTID = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, TYPE = ?, VERSION = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, p.getAccountusername(), p.getAction(), p.getAmount(), p.getBasecategory(), p.getCategory(), p.getConsistencyversion(), p.getCreatedby(), p.getDescription(), p.getGlcode(), p.getGlname(), p.getObjectid(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getType(), p.getVersion(), p.getUserId(), p.getId());
	}

	/**
	 * CRUD-Update. The table 'audit_glaccounts'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateAuditGlaccount(String accountusername, String action, String amount, String basecategory, String category, Long consistencyversion, String createdby, String description, String glcode, String glname, Long objectid, String status, java.util.Date systemcreatedate, java.util.Date systemcreatetimestamp, String type, Long version, Long userId, Long id) throws Exception {

		String sql = "UPDATE audit_glaccounts SET " 
				 + " ACCOUNTUSERNAME = ?, ACTION = ?, AMOUNT = ?, BASECATEGORY = ?, CATEGORY = ?, CONSISTENCYVERSION = ?, CREATEDBY = ?, DESCRIPTION = ?, GLCODE = ?, GLNAME = ?, OBJECTID = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, TYPE = ?, VERSION = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, accountusername, action, amount, basecategory, category, consistencyversion, createdby, description, glcode, glname, objectid, status, systemcreatedate, systemcreatetimestamp, type, version, userId, id);
	}

	/**
	 * CRUD-Delete. The table 'audit_glaccounts'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteAuditGlaccount(AuditGlaccount p) throws Exception {

		String sql = "DELETE FROM audit_glaccounts WHERE ID = ?";

		return ds.execDML(sql, p.getId());
	}

	/**
	 * CRUD-Delete. The table 'audit_glaccounts'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteAuditGlaccount(Long id) throws Exception {

		String sql = "DELETE FROM audit_glaccounts WHERE ID = ?";

		return ds.execDML(sql, id);
	}
}