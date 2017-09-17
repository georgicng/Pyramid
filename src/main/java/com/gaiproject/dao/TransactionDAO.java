package com.gaiproject.dao;

import com.sqldalmaker.DataStore;

import com.gaiproject.pojo.Transaction;
import java.util.List;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually.
 * SQL DAL Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class TransactionDAO {

	protected final DataStore ds;

	public TransactionDAO(DataStore ds) {
		this.ds = ds;
	}

	/**
	 * CRUD-Create. The table 'transactions'.
	 * Auto-generated values are assigned to appropriate fields of DTO.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int createTransaction(Transaction p) throws Exception {

		String sql = "INSERT INTO transactions (BUSINESSDATE, CONSISTENCYVERSION, CREDITAMOUNT, DEBITAMOUNT, FINALACCTBALANCE, INITIALACCTBALANCE, INSTRUMENTNO, NARRATION, REVERSED, STATUS, SYSTEMCREATEDATE, SYSTEMCREATETIMESTAMP, TRANSACTIONREF, TRANSACTIONTYPE, ACCTS_ID, USER_ID) " 
				 + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		String []genColNames = new String[] {"ID"};
		Object []genValues = new Object[genColNames.length];

		int res = ds.insert(sql, genColNames, genValues, p.getBusinessdate(), p.getConsistencyversion(), p.getCreditamount(), p.getDebitamount(), p.getFinalacctbalance(), p.getInitialacctbalance(), p.getInstrumentno(), p.getNarration(), p.getReversed(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getTransactionref(), p.getTransactiontype(), p.getAcctsId(), p.getUserId());

		p.setId(ds.castGeneratedValue(Long.class, genValues[0]));

		return res;
	}

	/**
	 * CRUD-Read. The table 'transactions'.
	 */
	public List<Transaction> readTransactionList() throws Exception {

		String sql = "SELECT * FROM transactions";

		return ds.queryDtoList(sql, new DataStore.RowHandler<Transaction>() {

			public Transaction handleRow(DataStore.RowData rd) throws Exception {
				Transaction obj = new Transaction();
				obj.setId(rd.getValue(Long.class, "ID"));
				obj.setBusinessdate(rd.getValue(java.util.Date.class, "BUSINESSDATE"));
				obj.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				obj.setCreditamount(rd.getValue(java.math.BigDecimal.class, "CREDITAMOUNT"));
				obj.setDebitamount(rd.getValue(java.math.BigDecimal.class, "DEBITAMOUNT"));
				obj.setFinalacctbalance(rd.getValue(java.math.BigDecimal.class, "FINALACCTBALANCE"));
				obj.setInitialacctbalance(rd.getValue(java.math.BigDecimal.class, "INITIALACCTBALANCE"));
				obj.setInstrumentno(rd.getValue(String.class, "INSTRUMENTNO"));
				obj.setNarration(rd.getValue(String.class, "NARRATION"));
				obj.setReversed(rd.getValue(Boolean.class, "REVERSED"));
				obj.setStatus(rd.getValue(String.class, "STATUS"));
				obj.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
				obj.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
				obj.setTransactionref(rd.getValue(Integer.class, "TRANSACTIONREF"));
				obj.setTransactiontype(rd.getValue(String.class, "TRANSACTIONTYPE"));
				obj.setAcctsId(rd.getValue(Long.class, "ACCTS_ID"));
				obj.setUserId(rd.getValue(Long.class, "USER_ID"));
				return obj;
			}

		});
	}

	/**
	 * CRUD-Read. The table 'transactions'.
	 */
	public Transaction readTransaction(Long id) throws Exception {

		String sql = "SELECT * FROM transactions WHERE ID = ?";

		return ds.queryDto(sql, new DataStore.RowHandler<Transaction>() {

			public Transaction handleRow(DataStore.RowData rd) throws Exception {
				Transaction res = new Transaction();
				res.setId(rd.getValue(Long.class, "ID"));
				res.setBusinessdate(rd.getValue(java.util.Date.class, "BUSINESSDATE"));
				res.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				res.setCreditamount(rd.getValue(java.math.BigDecimal.class, "CREDITAMOUNT"));
				res.setDebitamount(rd.getValue(java.math.BigDecimal.class, "DEBITAMOUNT"));
				res.setFinalacctbalance(rd.getValue(java.math.BigDecimal.class, "FINALACCTBALANCE"));
				res.setInitialacctbalance(rd.getValue(java.math.BigDecimal.class, "INITIALACCTBALANCE"));
				res.setInstrumentno(rd.getValue(String.class, "INSTRUMENTNO"));
				res.setNarration(rd.getValue(String.class, "NARRATION"));
				res.setReversed(rd.getValue(Boolean.class, "REVERSED"));
				res.setStatus(rd.getValue(String.class, "STATUS"));
				res.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
				res.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
				res.setTransactionref(rd.getValue(Integer.class, "TRANSACTIONREF"));
				res.setTransactiontype(rd.getValue(String.class, "TRANSACTIONTYPE"));
				res.setAcctsId(rd.getValue(Long.class, "ACCTS_ID"));
				res.setUserId(rd.getValue(Long.class, "USER_ID"));
				return res;
			}

		}, id);
	}

	/**
	 * CRUD-Update. The table 'transactions'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateTransaction(Transaction p) throws Exception {

		String sql = "UPDATE transactions SET " 
				 + " BUSINESSDATE = ?, CONSISTENCYVERSION = ?, CREDITAMOUNT = ?, DEBITAMOUNT = ?, FINALACCTBALANCE = ?, INITIALACCTBALANCE = ?, INSTRUMENTNO = ?, NARRATION = ?, REVERSED = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, TRANSACTIONREF = ?, TRANSACTIONTYPE = ?, ACCTS_ID = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, p.getBusinessdate(), p.getConsistencyversion(), p.getCreditamount(), p.getDebitamount(), p.getFinalacctbalance(), p.getInitialacctbalance(), p.getInstrumentno(), p.getNarration(), p.getReversed(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getTransactionref(), p.getTransactiontype(), p.getAcctsId(), p.getUserId(), p.getId());
	}

	/**
	 * CRUD-Update. The table 'transactions'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateTransaction(java.util.Date businessdate, Long consistencyversion, java.math.BigDecimal creditamount, java.math.BigDecimal debitamount, java.math.BigDecimal finalacctbalance, java.math.BigDecimal initialacctbalance, String instrumentno, String narration, Boolean reversed, String status, java.util.Date systemcreatedate, java.util.Date systemcreatetimestamp, Integer transactionref, String transactiontype, Long acctsId, Long userId, Long id) throws Exception {

		String sql = "UPDATE transactions SET " 
				 + " BUSINESSDATE = ?, CONSISTENCYVERSION = ?, CREDITAMOUNT = ?, DEBITAMOUNT = ?, FINALACCTBALANCE = ?, INITIALACCTBALANCE = ?, INSTRUMENTNO = ?, NARRATION = ?, REVERSED = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ?, TRANSACTIONREF = ?, TRANSACTIONTYPE = ?, ACCTS_ID = ?, USER_ID = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, businessdate, consistencyversion, creditamount, debitamount, finalacctbalance, initialacctbalance, instrumentno, narration, reversed, status, systemcreatedate, systemcreatetimestamp, transactionref, transactiontype, acctsId, userId, id);
	}

	/**
	 * CRUD-Delete. The table 'transactions'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteTransaction(Transaction p) throws Exception {

		String sql = "DELETE FROM transactions WHERE ID = ?";

		return ds.execDML(sql, p.getId());
	}

	/**
	 * CRUD-Delete. The table 'transactions'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteTransaction(Long id) throws Exception {

		String sql = "DELETE FROM transactions WHERE ID = ?";

		return ds.execDML(sql, id);
	}
}