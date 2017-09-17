package com.gaiproject.dao;

import com.sqldalmaker.DataStore;

import com.gaiproject.pojo.Glamount;
import java.util.List;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually.
 * SQL DAL Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class GlamountDAO {

	protected final DataStore ds;

	public GlamountDAO(DataStore ds) {
		this.ds = ds;
	}

	/**
	 * CRUD-Create. The table 'glamounts'.
	 * Auto-generated values are assigned to appropriate fields of DTO.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int createGlamount(Glamount p) throws Exception {

		String sql = "INSERT INTO glamounts (AMOUNT, CONSISTENCYVERSION, STATUS, SYSTEMCREATEDATE, SYSTEMCREATETIMESTAMP, USER_ID) " 
				 + "VALUES (?, ?, ?, ?, ?, ?)";

		String []genColNames = new String[] {"ID"};
		Object []genValues = new Object[genColNames.length];

		int res = ds.insert(sql, genColNames, genValues, p.getAmount(), p.getConsistencyversion(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getUserId());

		p.setId(ds.castGeneratedValue(Long.class, genValues[0]));

		return res;
	}

	/**
	 * CRUD-Read. The table 'glamounts'.
	 */
	public List<Glamount> readGlamountList() throws Exception {

		String sql = "SELECT * FROM glamounts";

		return ds.queryDtoList(sql, new DataStore.RowHandler<Glamount>() {

			public Glamount handleRow(DataStore.RowData rd) throws Exception {
				Glamount obj = new Glamount();
				obj.setId(rd.getValue(Long.class, "ID"));
				obj.setAmount(rd.getValue(java.math.BigDecimal.class, "AMOUNT"));
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
	 * CRUD-Read. The table 'glamounts'.
	 */
	public Glamount readGlamount(Long id) throws Exception {

		String sql = "SELECT * FROM glamounts WHERE ID = ?";

		return ds.queryDto(sql, new DataStore.RowHandler<Glamount>() {

			public Glamount handleRow(DataStore.RowData rd) throws Exception {
				Glamount res = new Glamount();
				res.setId(rd.getValue(Long.class, "ID"));
				res.setAmount(rd.getValue(java.math.BigDecimal.class, "AMOUNT"));
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
	 * CRUD-Update. The table 'glamounts'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateGlamount(Glamount p) throws Exception {

		String sql = "UPDATE glamounts SET " 
				 + " AMOUNT = ?, CONSISTENCYVERSION = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, p.getAmount(), p.getConsistencyversion(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getUserId(), p.getId());
	}

	/**
	 * CRUD-Update. The table 'glamounts'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateGlamount(java.math.BigDecimal amount, Long consistencyversion, String status, java.util.Date systemcreatedate, java.util.Date systemcreatetimestamp, Long userId, Long id) throws Exception {

		String sql = "UPDATE glamounts SET " 
				 + " AMOUNT = ?, CONSISTENCYVERSION = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, amount, consistencyversion, status, systemcreatedate, systemcreatetimestamp, userId, id);
	}

	/**
	 * CRUD-Delete. The table 'glamounts'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteGlamount(Glamount p) throws Exception {

		String sql = "DELETE FROM glamounts WHERE ID = ?";

		return ds.execDML(sql, p.getId());
	}

	/**
	 * CRUD-Delete. The table 'glamounts'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteGlamount(Long id) throws Exception {

		String sql = "DELETE FROM glamounts WHERE ID = ?";

		return ds.execDML(sql, id);
	}
}