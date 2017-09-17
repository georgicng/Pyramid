package com.gaiproject.dao;

import com.sqldalmaker.DataStore;

import com.gaiproject.pojo.Postingsetup;
import java.util.List;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually.
 * SQL DAL Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class PostingsetupDAO {

	protected final DataStore ds;

	public PostingsetupDAO(DataStore ds) {
		this.ds = ds;
	}

	/**
	 * CRUD-Create. The table 'postingsetup'.
	 * Auto-generated values are assigned to appropriate fields of DTO.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int createPostingsetup(Postingsetup p) throws Exception {

		String sql = "INSERT INTO postingsetup (CONSISTENCYVERSION, POSTINGTYPE, STATUS, SYSTEMCREATEDATE, SYSTEMCREATETIMESTAMP, GLACCOUNT_ID, USER_ID) " 
				 + "VALUES (?, ?, ?, ?, ?, ?, ?)";

		String []genColNames = new String[] {"ID"};
		Object []genValues = new Object[genColNames.length];

		int res = ds.insert(sql, genColNames, genValues, p.getConsistencyversion(), p.getPostingtype(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getGlaccountId(), p.getUserId());

		p.setId(ds.castGeneratedValue(Long.class, genValues[0]));

		return res;
	}

	/**
	 * CRUD-Read. The table 'postingsetup'.
	 */
	public List<Postingsetup> readPostingsetupList() throws Exception {

		String sql = "SELECT * FROM postingsetup";

		return ds.queryDtoList(sql, new DataStore.RowHandler<Postingsetup>() {

			public Postingsetup handleRow(DataStore.RowData rd) throws Exception {
				Postingsetup obj = new Postingsetup();
				obj.setId(rd.getValue(Long.class, "ID"));
				obj.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				obj.setPostingtype(rd.getValue(String.class, "POSTINGTYPE"));
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
	 * CRUD-Read. The table 'postingsetup'.
	 */
	public Postingsetup readPostingsetup(Long id) throws Exception {

		String sql = "SELECT * FROM postingsetup WHERE ID = ?";

		return ds.queryDto(sql, new DataStore.RowHandler<Postingsetup>() {

			public Postingsetup handleRow(DataStore.RowData rd) throws Exception {
				Postingsetup res = new Postingsetup();
				res.setId(rd.getValue(Long.class, "ID"));
				res.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				res.setPostingtype(rd.getValue(String.class, "POSTINGTYPE"));
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
	 * CRUD-Update. The table 'postingsetup'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updatePostingsetup(Postingsetup p) throws Exception {

		String sql = "UPDATE postingsetup SET " 
				 + " CONSISTENCYVERSION = ?, POSTINGTYPE = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, GLACCOUNT_ID = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, p.getConsistencyversion(), p.getPostingtype(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getGlaccountId(), p.getUserId(), p.getId());
	}

	/**
	 * CRUD-Update. The table 'postingsetup'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updatePostingsetup(Long consistencyversion, String postingtype, String status, java.util.Date systemcreatedate, java.util.Date systemcreatetimestamp, Long glaccountId, Long userId, Long id) throws Exception {

		String sql = "UPDATE postingsetup SET " 
				 + " CONSISTENCYVERSION = ?, POSTINGTYPE = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, GLACCOUNT_ID = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, consistencyversion, postingtype, status, systemcreatedate, systemcreatetimestamp, glaccountId, userId, id);
	}

	/**
	 * CRUD-Delete. The table 'postingsetup'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deletePostingsetup(Postingsetup p) throws Exception {

		String sql = "DELETE FROM postingsetup WHERE ID = ?";

		return ds.execDML(sql, p.getId());
	}

	/**
	 * CRUD-Delete. The table 'postingsetup'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deletePostingsetup(Long id) throws Exception {

		String sql = "DELETE FROM postingsetup WHERE ID = ?";

		return ds.execDML(sql, id);
	}
}