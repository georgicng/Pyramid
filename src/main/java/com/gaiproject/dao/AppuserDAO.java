package com.gaiproject.dao;

import com.sqldalmaker.DataStore;

import com.gaiproject.pojo.Appuser;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually.
 * SQL DAL Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class AppuserDAO {
    private static final Logger log = LoggerFactory.getLogger("customFilterLog");

	protected final DataStore ds;

	public AppuserDAO(DataStore ds) {
		this.ds = ds;
	}

	/**
	 * CRUD-Create. The table 'appuser'.
	 * Auto-generated values are assigned to appropriate fields of DTO.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int createAppuser(Appuser p) throws Exception {

		String sql = "INSERT INTO appuser (ACCOUNTLOCKED, CONSISTENCYVERSION, EMAIL, FAILEDLOGINATTEMPTS, NAME, OTHERNAMES, PASSWORD, PHONENO, REASONFORLOCKEDACCOUNT, ROLEID, ROLENAME, STATUS, SYSTEMCREATEDATE, SYSTEMCREATETIMESTAMP, USERNAME) " 
				 + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		String []genColNames = new String[] {"ID"};
		Object []genValues = new Object[genColNames.length];

		int res = ds.insert(sql, genColNames, genValues, p.getAccountlocked(), p.getConsistencyversion(), p.getEmail(), p.getFailedloginattempts(), p.getName(), p.getOthernames(), p.getPassword(), p.getPhoneno(), p.getReasonforlockedaccount(), p.getRoleid(), p.getRolename(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getUsername());

		p.setId(ds.castGeneratedValue(Long.class, genValues[0]));

		return res;
	}

	/**
	 * CRUD-Read. The table 'appuser'.
	 */
	public List<Appuser> readAppuserList() throws Exception {

		String sql = "SELECT * FROM appuser";

		return ds.queryDtoList(sql, new DataStore.RowHandler<Appuser>() {

			public Appuser handleRow(DataStore.RowData rd) throws Exception {
				Appuser obj = new Appuser();
				obj.setId(rd.getValue(Long.class, "ID"));
				obj.setAccountlocked(rd.getValue(Boolean.class, "ACCOUNTLOCKED"));
				obj.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				obj.setEmail(rd.getValue(String.class, "EMAIL"));
				obj.setFailedloginattempts(rd.getValue(Integer.class, "FAILEDLOGINATTEMPTS"));
				obj.setName(rd.getValue(String.class, "NAME"));
				obj.setOthernames(rd.getValue(String.class, "OTHERNAMES"));
				obj.setPassword(rd.getValue(String.class, "PASSWORD"));
				obj.setPhoneno(rd.getValue(String.class, "PHONENO"));
				obj.setReasonforlockedaccount(rd.getValue(String.class, "REASONFORLOCKEDACCOUNT"));
				obj.setRoleid(rd.getValue(Long.class, "ROLEID"));
				obj.setRolename(rd.getValue(String.class, "ROLENAME"));
				obj.setStatus(rd.getValue(String.class, "STATUS"));
				obj.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
				obj.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
				obj.setUsername(rd.getValue(String.class, "USERNAME"));
				return obj;
			}

		});
	}
        
        public List<Appuser> readAppuserList(String customQuery, Object... params) throws Exception {

		String sql = customQuery;
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                log.info(sql);
                log.info(gson.toJson(params));

		return ds.queryDtoList(sql, new DataStore.RowHandler<Appuser>() {

			public Appuser handleRow(DataStore.RowData rd) throws Exception {
				Appuser obj = new Appuser();
				obj.setId(rd.getValue(Long.class, "ID"));
				obj.setAccountlocked(rd.getValue(Boolean.class, "ACCOUNTLOCKED"));
				obj.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				obj.setEmail(rd.getValue(String.class, "EMAIL"));
				obj.setFailedloginattempts(rd.getValue(Integer.class, "FAILEDLOGINATTEMPTS"));
				obj.setName(rd.getValue(String.class, "NAME"));
				obj.setOthernames(rd.getValue(String.class, "OTHERNAMES"));
				obj.setPassword(rd.getValue(String.class, "PASSWORD"));
				obj.setPhoneno(rd.getValue(String.class, "PHONENO"));
				obj.setReasonforlockedaccount(rd.getValue(String.class, "REASONFORLOCKEDACCOUNT"));
				obj.setRoleid(rd.getValue(Long.class, "ROLEID"));
				obj.setRolename(rd.getValue(String.class, "ROLENAME"));
				obj.setStatus(rd.getValue(String.class, "STATUS"));
				obj.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
				obj.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
				obj.setUsername(rd.getValue(String.class, "USERNAME"));
				return obj;
			}

		}, params);
	}

	/**
	 * CRUD-Read. The table 'appuser'.
	 */
	public Appuser readAppuser(Long id) throws Exception {

		String sql = "SELECT * FROM appuser WHERE ID = ?";

		return ds.queryDto(sql, new DataStore.RowHandler<Appuser>() {

			public Appuser handleRow(DataStore.RowData rd) throws Exception {
				Appuser res = new Appuser();
				res.setId(rd.getValue(Long.class, "ID"));
				res.setAccountlocked(rd.getValue(Boolean.class, "ACCOUNTLOCKED"));
				res.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				res.setEmail(rd.getValue(String.class, "EMAIL"));
				res.setFailedloginattempts(rd.getValue(Integer.class, "FAILEDLOGINATTEMPTS"));
				res.setName(rd.getValue(String.class, "NAME"));
				res.setOthernames(rd.getValue(String.class, "OTHERNAMES"));
				res.setPassword(rd.getValue(String.class, "PASSWORD"));
				res.setPhoneno(rd.getValue(String.class, "PHONENO"));
				res.setReasonforlockedaccount(rd.getValue(String.class, "REASONFORLOCKEDACCOUNT"));
				res.setRoleid(rd.getValue(Long.class, "ROLEID"));
				res.setRolename(rd.getValue(String.class, "ROLENAME"));
				res.setStatus(rd.getValue(String.class, "STATUS"));
				res.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
				res.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
				res.setUsername(rd.getValue(String.class, "USERNAME"));
				return res;
			}

		}, id);
	}
        
        /**
	 * CRUD-Read. The table 'appuser'.
	 */
	public Appuser readAppuser(String username) throws Exception {

		String sql = "SELECT * FROM appuser WHERE USERNAME = ?";

		return ds.queryDto(sql, new DataStore.RowHandler<Appuser>() {

			public Appuser handleRow(DataStore.RowData rd) throws Exception {
				Appuser res = new Appuser();
				res.setId(rd.getValue(Long.class, "ID"));
				res.setAccountlocked(rd.getValue(Boolean.class, "ACCOUNTLOCKED"));
				res.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				res.setEmail(rd.getValue(String.class, "EMAIL"));
				res.setFailedloginattempts(rd.getValue(Integer.class, "FAILEDLOGINATTEMPTS"));
				res.setName(rd.getValue(String.class, "NAME"));
				res.setOthernames(rd.getValue(String.class, "OTHERNAMES"));
				res.setPassword(rd.getValue(String.class, "PASSWORD"));
				res.setPhoneno(rd.getValue(String.class, "PHONENO"));
				res.setReasonforlockedaccount(rd.getValue(String.class, "REASONFORLOCKEDACCOUNT"));
				res.setRoleid(rd.getValue(Long.class, "ROLEID"));
				res.setRolename(rd.getValue(String.class, "ROLENAME"));
				res.setStatus(rd.getValue(String.class, "STATUS"));
				res.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
				res.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
				res.setUsername(rd.getValue(String.class, "USERNAME"));
				return res;
			}

		}, username);
	}

	/**
	 * CRUD-Update. The table 'appuser'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateAppuser(Appuser p) throws Exception {

		String sql = "UPDATE appuser SET " 
				 + " ACCOUNTLOCKED = ?, CONSISTENCYVERSION = ?, EMAIL = ?, FAILEDLOGINATTEMPTS = ?, NAME = ?, OTHERNAMES = ?, PASSWORD = ?, PHONENO = ?, REASONFORLOCKEDACCOUNT = ?, ROLEID = ?, ROLENAME = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, USERNAME = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, p.getAccountlocked(), p.getConsistencyversion(), p.getEmail(), p.getFailedloginattempts(), p.getName(), p.getOthernames(), p.getPassword(), p.getPhoneno(), p.getReasonforlockedaccount(), p.getRoleid(), p.getRolename(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getUsername(), p.getId());
	}

	/**
	 * CRUD-Update. The table 'appuser'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateAppuser(Boolean accountlocked, Long consistencyversion, String email, Integer failedloginattempts, String name, String othernames, String password, String phoneno, String reasonforlockedaccount, Long roleid, String rolename, String status, java.util.Date systemcreatedate, java.util.Date systemcreatetimestamp, String username, Long id) throws Exception {

		String sql = "UPDATE appuser SET " 
				 + " ACCOUNTLOCKED = ?, CONSISTENCYVERSION = ?, EMAIL = ?, FAILEDLOGINATTEMPTS = ?, NAME = ?, OTHERNAMES = ?, PASSWORD = ?, PHONENO = ?, REASONFORLOCKEDACCOUNT = ?, ROLEID = ?, ROLENAME = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, USERNAME = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, accountlocked, consistencyversion, email, failedloginattempts, name, othernames, password, phoneno, reasonforlockedaccount, roleid, rolename, status, systemcreatedate, systemcreatetimestamp, username, id);
	}

	/**
	 * CRUD-Delete. The table 'appuser'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteAppuser(Appuser p) throws Exception {

		String sql = "DELETE FROM appuser WHERE ID = ?";

		return ds.execDML(sql, p.getId());
	}

	/**
	 * CRUD-Delete. The table 'appuser'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteAppuser(Long id) throws Exception {

		String sql = "DELETE FROM appuser WHERE ID = ?";

		return ds.execDML(sql, id);
	}
        
        public int countAppusers() throws Exception {

		String sql = "SELECT COUNT(*) FROM appuser";

		return ds.query(Long.class, sql).intValue();
	}
}