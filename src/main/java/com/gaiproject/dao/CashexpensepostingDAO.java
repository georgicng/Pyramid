package com.gaiproject.dao;

import com.sqldalmaker.DataStore;

import com.gaiproject.pojo.Cashexpenseposting;
import java.util.List;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually.
 * SQL DAL Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class CashexpensepostingDAO {

	protected final DataStore ds;

	public CashexpensepostingDAO(DataStore ds) {
		this.ds = ds;
	}

	/**
	 * CRUD-Create. The table 'cashexpenseposting'.
	 * Auto-generated values are assigned to appropriate fields of DTO.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int createCashexpenseposting(Cashexpenseposting p) throws Exception {

		String sql = "INSERT INTO cashexpenseposting (AMOUNT, CONSISTENCYVERSION, INSTRUMENTNO, NARRATION, STATUS, SYSTEMCREATEDATE, SYSTEMCREATETIMESTAMP, TRANSACTIONREF, POSTINGSETUP_ID, USER_ID) " 
				 + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		String []genColNames = new String[] {"ID"};
		Object []genValues = new Object[genColNames.length];

		int res = ds.insert(sql, genColNames, genValues, p.getAmount(), p.getConsistencyversion(), p.getInstrumentno(), p.getNarration(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getTransactionref(), p.getPostingsetupId(), p.getUserId());

		p.setId(ds.castGeneratedValue(Long.class, genValues[0]));

		return res;
	}

	/**
	 * CRUD-Read. The table 'cashexpenseposting'.
	 */
	public List<Cashexpenseposting> readCashexpensepostingList() throws Exception {

		String sql = "SELECT * FROM cashexpenseposting";

		return ds.queryDtoList(sql, new DataStore.RowHandler<Cashexpenseposting>() {

			public Cashexpenseposting handleRow(DataStore.RowData rd) throws Exception {
				Cashexpenseposting obj = new Cashexpenseposting();
				obj.setId(rd.getValue(Long.class, "ID"));
				obj.setAmount(rd.getValue(java.math.BigDecimal.class, "AMOUNT"));
				obj.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				obj.setInstrumentno(rd.getValue(String.class, "INSTRUMENTNO"));
				obj.setNarration(rd.getValue(String.class, "NARRATION"));
				obj.setStatus(rd.getValue(String.class, "STATUS"));
				obj.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
				obj.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
				obj.setTransactionref(rd.getValue(Integer.class, "TRANSACTIONREF"));
				obj.setPostingsetupId(rd.getValue(Long.class, "POSTINGSETUP_ID"));
				obj.setUserId(rd.getValue(Long.class, "USER_ID"));
				return obj;
			}

		});
	}

	/**
	 * CRUD-Read. The table 'cashexpenseposting'.
	 */
	public Cashexpenseposting readCashexpenseposting(Long id) throws Exception {

		String sql = "SELECT * FROM cashexpenseposting WHERE ID = ?";

		return ds.queryDto(sql, new DataStore.RowHandler<Cashexpenseposting>() {

			public Cashexpenseposting handleRow(DataStore.RowData rd) throws Exception {
				Cashexpenseposting res = new Cashexpenseposting();
				res.setId(rd.getValue(Long.class, "ID"));
				res.setAmount(rd.getValue(java.math.BigDecimal.class, "AMOUNT"));
				res.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				res.setInstrumentno(rd.getValue(String.class, "INSTRUMENTNO"));
				res.setNarration(rd.getValue(String.class, "NARRATION"));
				res.setStatus(rd.getValue(String.class, "STATUS"));
				res.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
				res.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
				res.setTransactionref(rd.getValue(Integer.class, "TRANSACTIONREF"));
				res.setPostingsetupId(rd.getValue(Long.class, "POSTINGSETUP_ID"));
				res.setUserId(rd.getValue(Long.class, "USER_ID"));
				return res;
			}

		}, id);
	}

	/**
	 * CRUD-Update. The table 'cashexpenseposting'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateCashexpenseposting(Cashexpenseposting p) throws Exception {

		String sql = "UPDATE cashexpenseposting SET " 
				 + " AMOUNT = ?, CONSISTENCYVERSION = ?, INSTRUMENTNO = ?, NARRATION = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, TRANSACTIONREF = ?, POSTINGSETUP_ID = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, p.getAmount(), p.getConsistencyversion(), p.getInstrumentno(), p.getNarration(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getTransactionref(), p.getPostingsetupId(), p.getUserId(), p.getId());
	}

	/**
	 * CRUD-Update. The table 'cashexpenseposting'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateCashexpenseposting(java.math.BigDecimal amount, Long consistencyversion, String instrumentno, String narration, String status, java.util.Date systemcreatedate, java.util.Date systemcreatetimestamp, Integer transactionref, Long postingsetupId, Long userId, Long id) throws Exception {

		String sql = "UPDATE cashexpenseposting SET " 
				 + " AMOUNT = ?, CONSISTENCYVERSION = ?, INSTRUMENTNO = ?, NARRATION = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, TRANSACTIONREF = ?, POSTINGSETUP_ID = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, amount, consistencyversion, instrumentno, narration, status, systemcreatedate, systemcreatetimestamp, transactionref, postingsetupId, userId, id);
	}

	/**
	 * CRUD-Delete. The table 'cashexpenseposting'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteCashexpenseposting(Cashexpenseposting p) throws Exception {

		String sql = "DELETE FROM cashexpenseposting WHERE ID = ?";

		return ds.execDML(sql, p.getId());
	}

	/**
	 * CRUD-Delete. The table 'cashexpenseposting'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteCashexpenseposting(Long id) throws Exception {

		String sql = "DELETE FROM cashexpenseposting WHERE ID = ?";

		return ds.execDML(sql, id);
	}
}