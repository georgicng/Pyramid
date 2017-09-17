package com.gaiproject.dao;

import com.sqldalmaker.DataStore;

import com.gaiproject.pojo.Doubleentry;
import java.util.List;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually.
 * SQL DAL Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class DoubleentryDAO {

	protected final DataStore ds;

	public DoubleentryDAO(DataStore ds) {
		this.ds = ds;
	}

	/**
	 * CRUD-Create. The table 'doubleentry'.
	 * Auto-generated values are assigned to appropriate fields of DTO.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int createDoubleentry(Doubleentry p) throws Exception {

		String sql = "INSERT INTO doubleentry (AMOUNT, CONSISTENCYVERSION, INSTRUMENTNO, NARRATION, STATUS, SYSTEMCREATEDATE, SYSTEMCREATETIMESTAMP, TRANSACTIONREF, CRACCTS_ID, DBACCTS_ID, USER_ID) " 
				 + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		String []genColNames = new String[] {"ID"};
		Object []genValues = new Object[genColNames.length];

		int res = ds.insert(sql, genColNames, genValues, p.getAmount(), p.getConsistencyversion(), p.getInstrumentno(), p.getNarration(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getTransactionref(), p.getCracctsId(), p.getDbacctsId(), p.getUserId());

		p.setId(ds.castGeneratedValue(Long.class, genValues[0]));

		return res;
	}

	/**
	 * CRUD-Read. The table 'doubleentry'.
	 */
	public List<Doubleentry> readDoubleentryList() throws Exception {

		String sql = "SELECT * FROM doubleentry";

		return ds.queryDtoList(sql, new DataStore.RowHandler<Doubleentry>() {

			public Doubleentry handleRow(DataStore.RowData rd) throws Exception {
				Doubleentry obj = new Doubleentry();
				obj.setId(rd.getValue(Long.class, "ID"));
				obj.setAmount(rd.getValue(java.math.BigDecimal.class, "AMOUNT"));
				obj.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				obj.setInstrumentno(rd.getValue(String.class, "INSTRUMENTNO"));
				obj.setNarration(rd.getValue(String.class, "NARRATION"));
				obj.setStatus(rd.getValue(String.class, "STATUS"));
				obj.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
				obj.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
				obj.setTransactionref(rd.getValue(Integer.class, "TRANSACTIONREF"));
				obj.setCracctsId(rd.getValue(Long.class, "CRACCTS_ID"));
				obj.setDbacctsId(rd.getValue(Long.class, "DBACCTS_ID"));
				obj.setUserId(rd.getValue(Long.class, "USER_ID"));
				return obj;
			}

		});
	}

	/**
	 * CRUD-Read. The table 'doubleentry'.
	 */
	public Doubleentry readDoubleentry(Long id) throws Exception {

		String sql = "SELECT * FROM doubleentry WHERE ID = ?";

		return ds.queryDto(sql, new DataStore.RowHandler<Doubleentry>() {

			public Doubleentry handleRow(DataStore.RowData rd) throws Exception {
				Doubleentry res = new Doubleentry();
				res.setId(rd.getValue(Long.class, "ID"));
				res.setAmount(rd.getValue(java.math.BigDecimal.class, "AMOUNT"));
				res.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				res.setInstrumentno(rd.getValue(String.class, "INSTRUMENTNO"));
				res.setNarration(rd.getValue(String.class, "NARRATION"));
				res.setStatus(rd.getValue(String.class, "STATUS"));
				res.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
				res.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
				res.setTransactionref(rd.getValue(Integer.class, "TRANSACTIONREF"));
				res.setCracctsId(rd.getValue(Long.class, "CRACCTS_ID"));
				res.setDbacctsId(rd.getValue(Long.class, "DBACCTS_ID"));
				res.setUserId(rd.getValue(Long.class, "USER_ID"));
				return res;
			}

		}, id);
	}

	/**
	 * CRUD-Update. The table 'doubleentry'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateDoubleentry(Doubleentry p) throws Exception {

		String sql = "UPDATE doubleentry SET " 
				 + " AMOUNT = ?, CONSISTENCYVERSION = ?, INSTRUMENTNO = ?, NARRATION = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, TRANSACTIONREF = ?, CRACCTS_ID = ?, DBACCTS_ID = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, p.getAmount(), p.getConsistencyversion(), p.getInstrumentno(), p.getNarration(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getTransactionref(), p.getCracctsId(), p.getDbacctsId(), p.getUserId(), p.getId());
	}

	/**
	 * CRUD-Update. The table 'doubleentry'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateDoubleentry(java.math.BigDecimal amount, Long consistencyversion, String instrumentno, String narration, String status, java.util.Date systemcreatedate, java.util.Date systemcreatetimestamp, Integer transactionref, Long cracctsId, Long dbacctsId, Long userId, Long id) throws Exception {

		String sql = "UPDATE doubleentry SET " 
				 + " AMOUNT = ?, CONSISTENCYVERSION = ?, INSTRUMENTNO = ?, NARRATION = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, TRANSACTIONREF = ?, CRACCTS_ID = ?, DBACCTS_ID = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, amount, consistencyversion, instrumentno, narration, status, systemcreatedate, systemcreatetimestamp, transactionref, cracctsId, dbacctsId, userId, id);
	}

	/**
	 * CRUD-Delete. The table 'doubleentry'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteDoubleentry(Doubleentry p) throws Exception {

		String sql = "DELETE FROM doubleentry WHERE ID = ?";

		return ds.execDML(sql, p.getId());
	}

	/**
	 * CRUD-Delete. The table 'doubleentry'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteDoubleentry(Long id) throws Exception {

		String sql = "DELETE FROM doubleentry WHERE ID = ?";

		return ds.execDML(sql, id);
	}
}