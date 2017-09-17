package com.gaiproject.dao;

import com.sqldalmaker.DataStore;

import com.gaiproject.pojo.Glaccount;
import java.util.List;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually.
 * SQL DAL Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class GlaccountDAO {

	protected final DataStore ds;

	public GlaccountDAO(DataStore ds) {
		this.ds = ds;
	}

	/**
	 * CRUD-Create. The table 'glaccounts'.
	 * Auto-generated values are assigned to appropriate fields of DTO.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int createGlaccount(Glaccount p) throws Exception {

		String sql = "INSERT INTO glaccounts (ACCOUNTUSERNAME, BASECATEGORY, CATEGORY, CONSISTENCYVERSION, DESCRIPTION, GLCODE, GLNAME, STATUS, SYSTEMCREATEDATE, SYSTEMCREATETIMESTAMP, TYPE, ACCOUNTUSER_ID, GLAMOUNT_ID, USER_ID) " 
				 + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		String []genColNames = new String[] {"ID"};
		Object []genValues = new Object[genColNames.length];

		int res = ds.insert(sql, genColNames, genValues, p.getAccountusername(), p.getBasecategory(), p.getCategory(), p.getConsistencyversion(), p.getDescription(), p.getGlcode(), p.getGlname(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getType(), p.getAccountuserId(), p.getGlamountId(), p.getUserId());

		p.setId(ds.castGeneratedValue(Long.class, genValues[0]));

		return res;
	}

	/**
	 * CRUD-Read. The table 'glaccounts'.
	 */
	public List<Glaccount> readGlaccountList() throws Exception {

		String sql = "SELECT * FROM glaccounts";

		return ds.queryDtoList(sql, new DataStore.RowHandler<Glaccount>() {

			public Glaccount handleRow(DataStore.RowData rd) throws Exception {
				Glaccount obj = new Glaccount();
				obj.setId(rd.getValue(Long.class, "ID"));
				obj.setAccountusername(rd.getValue(String.class, "ACCOUNTUSERNAME"));
				obj.setBasecategory(rd.getValue(String.class, "BASECATEGORY"));
				obj.setCategory(rd.getValue(String.class, "CATEGORY"));
				obj.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				obj.setDescription(rd.getValue(String.class, "DESCRIPTION"));
				obj.setGlcode(rd.getValue(String.class, "GLCODE"));
				obj.setGlname(rd.getValue(String.class, "GLNAME"));
				obj.setStatus(rd.getValue(String.class, "STATUS"));
				obj.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
				obj.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
				obj.setType(rd.getValue(String.class, "TYPE"));
				obj.setAccountuserId(rd.getValue(Long.class, "ACCOUNTUSER_ID"));
				obj.setGlamountId(rd.getValue(Long.class, "GLAMOUNT_ID"));
				obj.setUserId(rd.getValue(Long.class, "USER_ID"));
				return obj;
			}

		});
	}

	/**
	 * CRUD-Read. The table 'glaccounts'.
	 */
	public Glaccount readGlaccount(Long id) throws Exception {

		String sql = "SELECT * FROM glaccounts WHERE ID = ?";

		return ds.queryDto(sql, new DataStore.RowHandler<Glaccount>() {

			public Glaccount handleRow(DataStore.RowData rd) throws Exception {
				Glaccount res = new Glaccount();
				res.setId(rd.getValue(Long.class, "ID"));
				res.setAccountusername(rd.getValue(String.class, "ACCOUNTUSERNAME"));
				res.setBasecategory(rd.getValue(String.class, "BASECATEGORY"));
				res.setCategory(rd.getValue(String.class, "CATEGORY"));
				res.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				res.setDescription(rd.getValue(String.class, "DESCRIPTION"));
				res.setGlcode(rd.getValue(String.class, "GLCODE"));
				res.setGlname(rd.getValue(String.class, "GLNAME"));
				res.setStatus(rd.getValue(String.class, "STATUS"));
				res.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
				res.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
				res.setType(rd.getValue(String.class, "TYPE"));
				res.setAccountuserId(rd.getValue(Long.class, "ACCOUNTUSER_ID"));
				res.setGlamountId(rd.getValue(Long.class, "GLAMOUNT_ID"));
				res.setUserId(rd.getValue(Long.class, "USER_ID"));
				return res;
			}

		}, id);
	}

	/**
	 * CRUD-Update. The table 'glaccounts'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateGlaccount(Glaccount p) throws Exception {

		String sql = "UPDATE glaccounts SET " 
				 + " ACCOUNTUSERNAME = ?, BASECATEGORY = ?, CATEGORY = ?, CONSISTENCYVERSION = ?, DESCRIPTION = ?, GLCODE = ?, GLNAME = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, TYPE = ?, ACCOUNTUSER_ID = ?, GLAMOUNT_ID = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, p.getAccountusername(), p.getBasecategory(), p.getCategory(), p.getConsistencyversion(), p.getDescription(), p.getGlcode(), p.getGlname(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getType(), p.getAccountuserId(), p.getGlamountId(), p.getUserId(), p.getId());
	}

	/**
	 * CRUD-Update. The table 'glaccounts'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateGlaccount(String accountusername, String basecategory, String category, Long consistencyversion, String description, String glcode, String glname, String status, java.util.Date systemcreatedate, java.util.Date systemcreatetimestamp, String type, Long accountuserId, Long glamountId, Long userId, Long id) throws Exception {

		String sql = "UPDATE glaccounts SET " 
				 + " ACCOUNTUSERNAME = ?, BASECATEGORY = ?, CATEGORY = ?, CONSISTENCYVERSION = ?, DESCRIPTION = ?, GLCODE = ?, GLNAME = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, TYPE = ?, ACCOUNTUSER_ID = ?, GLAMOUNT_ID = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, accountusername, basecategory, category, consistencyversion, description, glcode, glname, status, systemcreatedate, systemcreatetimestamp, type, accountuserId, glamountId, userId, id);
	}

	/**
	 * CRUD-Delete. The table 'glaccounts'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteGlaccount(Glaccount p) throws Exception {

		String sql = "DELETE FROM glaccounts WHERE ID = ?";

		return ds.execDML(sql, p.getId());
	}

	/**
	 * CRUD-Delete. The table 'glaccounts'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteGlaccount(Long id) throws Exception {

		String sql = "DELETE FROM glaccounts WHERE ID = ?";

		return ds.execDML(sql, id);
	}
}