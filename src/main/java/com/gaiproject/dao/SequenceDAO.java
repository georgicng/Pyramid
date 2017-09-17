package com.gaiproject.dao;

import com.sqldalmaker.DataStore;

import com.gaiproject.pojo.Sequence;
import java.util.List;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually.
 * SQL DAL Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class SequenceDAO {

	protected final DataStore ds;

	public SequenceDAO(DataStore ds) {
		this.ds = ds;
	}

	/**
	 * CRUD-Create. The table 'sequence'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int createSequence(Sequence p) throws Exception {

		String sql = "INSERT INTO sequence (SEQ_NAME, SEQ_COUNT) " 
				 + "VALUES (?, ?)";

		return ds.execDML(sql, p.getSeqName(), p.getSeqCount());
	}

	/**
	 * CRUD-Create. The table 'sequence'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int createSequence(String seqName, java.math.BigDecimal seqCount) throws Exception {

		String sql = "INSERT INTO sequence (SEQ_NAME, SEQ_COUNT) " 
				 + "VALUES (?, ?)";

		return ds.execDML(sql, seqName, seqCount);
	}

	/**
	 * CRUD-Read. The table 'sequence'.
	 */
	public List<Sequence> readSequenceList() throws Exception {

		String sql = "SELECT * FROM sequence";

		return ds.queryDtoList(sql, new DataStore.RowHandler<Sequence>() {

			public Sequence handleRow(DataStore.RowData rd) throws Exception {
				Sequence obj = new Sequence();
				obj.setSeqName(rd.getValue(String.class, "SEQ_NAME"));
				obj.setSeqCount(rd.getValue(java.math.BigDecimal.class, "SEQ_COUNT"));
				return obj;
			}

		});
	}

	/**
	 * CRUD-Read. The table 'sequence'.
	 */
	public Sequence readSequence(String seqName) throws Exception {

		String sql = "SELECT * FROM sequence WHERE SEQ_NAME = ?";

		return ds.queryDto(sql, new DataStore.RowHandler<Sequence>() {

			public Sequence handleRow(DataStore.RowData rd) throws Exception {
				Sequence res = new Sequence();
				res.setSeqName(rd.getValue(String.class, "SEQ_NAME"));
				res.setSeqCount(rd.getValue(java.math.BigDecimal.class, "SEQ_COUNT"));
				return res;
			}

		}, seqName);
	}

	/**
	 * CRUD-Update. The table 'sequence'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateSequence(Sequence p) throws Exception {

		String sql = "UPDATE sequence SET " 
				 + " SEQ_COUNT = ? " 
				 + "WHERE SEQ_NAME = ?";

		return ds.execDML(sql, p.getSeqCount(), p.getSeqName());
	}

	/**
	 * CRUD-Update. The table 'sequence'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateSequence(java.math.BigDecimal seqCount, String seqName) throws Exception {

		String sql = "UPDATE sequence SET " 
				 + " SEQ_COUNT = ? " 
				 + "WHERE SEQ_NAME = ?";

		return ds.execDML(sql, seqCount, seqName);
	}

	/**
	 * CRUD-Delete. The table 'sequence'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteSequence(Sequence p) throws Exception {

		String sql = "DELETE FROM sequence WHERE SEQ_NAME = ?";

		return ds.execDML(sql, p.getSeqName());
	}

	/**
	 * CRUD-Delete. The table 'sequence'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteSequence(String seqName) throws Exception {

		String sql = "DELETE FROM sequence WHERE SEQ_NAME = ?";

		return ds.execDML(sql, seqName);
	}
}