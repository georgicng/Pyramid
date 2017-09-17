package com.gaiproject.dao;

import com.sqldalmaker.DataStore;

import com.gaiproject.pojo.Applicationuser;
import java.util.List;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually.
 * SQL DAL Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class ApplicationuserDAO {

	protected final DataStore ds;

	public ApplicationuserDAO(DataStore ds) {
		this.ds = ds;
	}

	/**
	 * CRUD-Create. The table 'applicationuser'.
	 * Auto-generated values are assigned to appropriate fields of DTO.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int createApplicationuser(Applicationuser p) throws Exception {

		String sql = "INSERT INTO applicationuser (CONSISTENCYVERSION, EMAIL, NAME, OTHERNAMES, PHONENO, STATUS, SYSTEMCREATEDATE, SYSTEMCREATETIMESTAMP, USERNAME, USER_ID) " 
				 + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		String []genColNames = new String[] {"ID"};
		Object []genValues = new Object[genColNames.length];

		int res = ds.insert(sql, genColNames, genValues, p.getConsistencyversion(), p.getEmail(), p.getName(), p.getOthernames(), p.getPhoneno(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getUsername(), p.getUserId());

		p.setId(ds.castGeneratedValue(Long.class, genValues[0]));

		return res;
	}

	/**
	 * CRUD-Read. The table 'applicationuser'.
	 */
	public List<Applicationuser> readApplicationuserList() throws Exception {

		String sql = "SELECT * FROM applicationuser";

		return ds.queryDtoList(sql, new DataStore.RowHandler<Applicationuser>() {

			public Applicationuser handleRow(DataStore.RowData rd) throws Exception {
				Applicationuser obj = new Applicationuser();
				obj.setId(rd.getValue(Long.class, "ID"));
				obj.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				obj.setEmail(rd.getValue(String.class, "EMAIL"));
				obj.setName(rd.getValue(String.class, "NAME"));
				obj.setOthernames(rd.getValue(String.class, "OTHERNAMES"));
				obj.setPhoneno(rd.getValue(String.class, "PHONENO"));
				obj.setStatus(rd.getValue(String.class, "STATUS"));
				obj.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
				obj.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
				obj.setUsername(rd.getValue(String.class, "USERNAME"));
				obj.setUserId(rd.getValue(Long.class, "USER_ID"));
				return obj;
			}

		});
	}

	/**
	 * CRUD-Read. The table 'applicationuser'.
	 */
	public Applicationuser readApplicationuser(Long id) throws Exception {

		String sql = "SELECT * FROM applicationuser WHERE ID = ?";

		return ds.queryDto(sql, new DataStore.RowHandler<Applicationuser>() {

			public Applicationuser handleRow(DataStore.RowData rd) throws Exception {
				Applicationuser res = new Applicationuser();
				res.setId(rd.getValue(Long.class, "ID"));
				res.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				res.setEmail(rd.getValue(String.class, "EMAIL"));
				res.setName(rd.getValue(String.class, "NAME"));
				res.setOthernames(rd.getValue(String.class, "OTHERNAMES"));
				res.setPhoneno(rd.getValue(String.class, "PHONENO"));
				res.setStatus(rd.getValue(String.class, "STATUS"));
				res.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
				res.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
				res.setUsername(rd.getValue(String.class, "USERNAME"));
				res.setUserId(rd.getValue(Long.class, "USER_ID"));
				return res;
			}

		}, id);
	}

	/**
	 * CRUD-Update. The table 'applicationuser'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateApplicationuser(Applicationuser p) throws Exception {

		String sql = "UPDATE applicationuser SET " 
				 + " CONSISTENCYVERSION = ?, EMAIL = ?, NAME = ?, OTHERNAMES = ?, PHONENO = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, USERNAME = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, p.getConsistencyversion(), p.getEmail(), p.getName(), p.getOthernames(), p.getPhoneno(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getUsername(), p.getUserId(), p.getId());
	}

	/**
	 * CRUD-Update. The table 'applicationuser'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateApplicationuser(Long consistencyversion, String email, String name, String othernames, String phoneno, String status, java.util.Date systemcreatedate, java.util.Date systemcreatetimestamp, String username, Long userId, Long id) throws Exception {

		String sql = "UPDATE applicationuser SET " 
				 + " CONSISTENCYVERSION = ?, EMAIL = ?, NAME = ?, OTHERNAMES = ?, PHONENO = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, USERNAME = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, consistencyversion, email, name, othernames, phoneno, status, systemcreatedate, systemcreatetimestamp, username, userId, id);
	}

	/**
	 * CRUD-Delete. The table 'applicationuser'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteApplicationuser(Applicationuser p) throws Exception {

		String sql = "DELETE FROM applicationuser WHERE ID = ?";

		return ds.execDML(sql, p.getId());
	}

	/**
	 * CRUD-Delete. The table 'applicationuser'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteApplicationuser(Long id) throws Exception {

		String sql = "DELETE FROM applicationuser WHERE ID = ?";

		return ds.execDML(sql, id);
	}
}