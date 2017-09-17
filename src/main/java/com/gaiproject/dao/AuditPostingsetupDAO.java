package com.gaiproject.dao;

import com.sqldalmaker.DataStore;

import com.gaiproject.pojo.AuditPostingsetup;
import java.util.List;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually.
 * SQL DAL Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class AuditPostingsetupDAO {

	protected final DataStore ds;

	public AuditPostingsetupDAO(DataStore ds) {
		this.ds = ds;
	}

	/**
	 * CRUD-Create. The table 'audit_postingsetup'.
	 * Auto-generated values are assigned to appropriate fields of DTO.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int createAuditPostingsetup(AuditPostingsetup p) throws Exception {

		String sql = "INSERT INTO audit_postingsetup (ACTION, CONSISTENCYVERSION, CREATEDBY, GLID, GLNAME, OBJECTID, POSTINGTYPE, STATUS, SYSTEMCREATEDATE, SYSTEMCREATETIMESTAMP, VERSION, USER_ID) " 
				 + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		String []genColNames = new String[] {"ID"};
		Object []genValues = new Object[genColNames.length];

		int res = ds.insert(sql, genColNames, genValues, p.getAction(), p.getConsistencyversion(), p.getCreatedby(), p.getGlid(), p.getGlname(), p.getObjectid(), p.getPostingtype(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getVersion(), p.getUserId());

		p.setId(ds.castGeneratedValue(Long.class, genValues[0]));

		return res;
	}

	/**
	 * CRUD-Read. The table 'audit_postingsetup'.
	 */
	public List<AuditPostingsetup> readAuditPostingsetupList() throws Exception {

		String sql = "SELECT * FROM audit_postingsetup";

		return ds.queryDtoList(sql, new DataStore.RowHandler<AuditPostingsetup>() {

			public AuditPostingsetup handleRow(DataStore.RowData rd) throws Exception {
				AuditPostingsetup obj = new AuditPostingsetup();
				obj.setId(rd.getValue(Long.class, "ID"));
				obj.setAction(rd.getValue(String.class, "ACTION"));
				obj.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				obj.setCreatedby(rd.getValue(String.class, "CREATEDBY"));
				obj.setGlid(rd.getValue(Long.class, "GLID"));
				obj.setGlname(rd.getValue(String.class, "GLNAME"));
				obj.setObjectid(rd.getValue(Long.class, "OBJECTID"));
				obj.setPostingtype(rd.getValue(String.class, "POSTINGTYPE"));
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
	 * CRUD-Read. The table 'audit_postingsetup'.
	 */
	public AuditPostingsetup readAuditPostingsetup(Long id) throws Exception {

		String sql = "SELECT * FROM audit_postingsetup WHERE ID = ?";

		return ds.queryDto(sql, new DataStore.RowHandler<AuditPostingsetup>() {

			public AuditPostingsetup handleRow(DataStore.RowData rd) throws Exception {
				AuditPostingsetup res = new AuditPostingsetup();
				res.setId(rd.getValue(Long.class, "ID"));
				res.setAction(rd.getValue(String.class, "ACTION"));
				res.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				res.setCreatedby(rd.getValue(String.class, "CREATEDBY"));
				res.setGlid(rd.getValue(Long.class, "GLID"));
				res.setGlname(rd.getValue(String.class, "GLNAME"));
				res.setObjectid(rd.getValue(Long.class, "OBJECTID"));
				res.setPostingtype(rd.getValue(String.class, "POSTINGTYPE"));
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
	 * CRUD-Update. The table 'audit_postingsetup'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateAuditPostingsetup(AuditPostingsetup p) throws Exception {

		String sql = "UPDATE audit_postingsetup SET " 
				 + " ACTION = ?, CONSISTENCYVERSION = ?, CREATEDBY = ?, GLID = ?, GLNAME = ?, OBJECTID = ?, POSTINGTYPE = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, VERSION = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, p.getAction(), p.getConsistencyversion(), p.getCreatedby(), p.getGlid(), p.getGlname(), p.getObjectid(), p.getPostingtype(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getVersion(), p.getUserId(), p.getId());
	}

	/**
	 * CRUD-Update. The table 'audit_postingsetup'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateAuditPostingsetup(String action, Long consistencyversion, String createdby, Long glid, String glname, Long objectid, String postingtype, String status, java.util.Date systemcreatedate, java.util.Date systemcreatetimestamp, Long version, Long userId, Long id) throws Exception {

		String sql = "UPDATE audit_postingsetup SET " 
				 + " ACTION = ?, CONSISTENCYVERSION = ?, CREATEDBY = ?, GLID = ?, GLNAME = ?, OBJECTID = ?, POSTINGTYPE = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, VERSION = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, action, consistencyversion, createdby, glid, glname, objectid, postingtype, status, systemcreatedate, systemcreatetimestamp, version, userId, id);
	}

	/**
	 * CRUD-Delete. The table 'audit_postingsetup'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteAuditPostingsetup(AuditPostingsetup p) throws Exception {

		String sql = "DELETE FROM audit_postingsetup WHERE ID = ?";

		return ds.execDML(sql, p.getId());
	}

	/**
	 * CRUD-Delete. The table 'audit_postingsetup'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteAuditPostingsetup(Long id) throws Exception {

		String sql = "DELETE FROM audit_postingsetup WHERE ID = ?";

		return ds.execDML(sql, id);
	}
}