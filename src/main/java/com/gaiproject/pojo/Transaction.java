package com.gaiproject.pojo;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually.
 * SQL DAL Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class Transaction  {

	private Long id;
	private java.util.Date businessdate;
	private Long consistencyversion;
	private java.math.BigDecimal creditamount;
	private java.math.BigDecimal debitamount;
	private java.math.BigDecimal finalacctbalance;
	private java.math.BigDecimal initialacctbalance;
	private String instrumentno;
	private String narration;
	private Boolean reversed;
	private String status;
	private java.util.Date systemcreatedate;
	private java.util.Date systemcreatetimestamp;
	private Integer transactionref;
	private String transactiontype;
	private Long acctsId;
	private Long userId;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public java.util.Date getBusinessdate() {
		return this.businessdate;
	}

	public void setBusinessdate(java.util.Date businessdate) {
		this.businessdate = businessdate;
	}

	public Long getConsistencyversion() {
		return this.consistencyversion;
	}

	public void setConsistencyversion(Long consistencyversion) {
		this.consistencyversion = consistencyversion;
	}

	public java.math.BigDecimal getCreditamount() {
		return this.creditamount;
	}

	public void setCreditamount(java.math.BigDecimal creditamount) {
		this.creditamount = creditamount;
	}

	public java.math.BigDecimal getDebitamount() {
		return this.debitamount;
	}

	public void setDebitamount(java.math.BigDecimal debitamount) {
		this.debitamount = debitamount;
	}

	public java.math.BigDecimal getFinalacctbalance() {
		return this.finalacctbalance;
	}

	public void setFinalacctbalance(java.math.BigDecimal finalacctbalance) {
		this.finalacctbalance = finalacctbalance;
	}

	public java.math.BigDecimal getInitialacctbalance() {
		return this.initialacctbalance;
	}

	public void setInitialacctbalance(java.math.BigDecimal initialacctbalance) {
		this.initialacctbalance = initialacctbalance;
	}

	public String getInstrumentno() {
		return this.instrumentno;
	}

	public void setInstrumentno(String instrumentno) {
		this.instrumentno = instrumentno;
	}

	public String getNarration() {
		return this.narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}

	public Boolean getReversed() {
		return this.reversed;
	}

	public void setReversed(Boolean reversed) {
		this.reversed = reversed;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public java.util.Date getSystemcreatedate() {
		return this.systemcreatedate;
	}

	public void setSystemcreatedate(java.util.Date systemcreatedate) {
		this.systemcreatedate = systemcreatedate;
	}

	public java.util.Date getSystemcreatetimestamp() {
		return this.systemcreatetimestamp;
	}

	public void setSystemcreatetimestamp(java.util.Date systemcreatetimestamp) {
		this.systemcreatetimestamp = systemcreatetimestamp;
	}

	public Integer getTransactionref() {
		return this.transactionref;
	}

	public void setTransactionref(Integer transactionref) {
		this.transactionref = transactionref;
	}

	public String getTransactiontype() {
		return this.transactiontype;
	}

	public void setTransactiontype(String transactiontype) {
		this.transactiontype = transactiontype;
	}

	public Long getAcctsId() {
		return this.acctsId;
	}

	public void setAcctsId(Long acctsId) {
		this.acctsId = acctsId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}