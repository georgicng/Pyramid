package com.gaiproject.pojo;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually.
 * SQL DAL Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class Doubleentry  {

	private Long id;
	private java.math.BigDecimal amount;
	private Long consistencyversion;
	private String instrumentno;
	private String narration;
	private String status;
	private java.util.Date systemcreatedate;
	private java.util.Date systemcreatetimestamp;
	private Integer transactionref;
	private Long cracctsId;
	private Long dbacctsId;
	private Long userId;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public java.math.BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(java.math.BigDecimal amount) {
		this.amount = amount;
	}

	public Long getConsistencyversion() {
		return this.consistencyversion;
	}

	public void setConsistencyversion(Long consistencyversion) {
		this.consistencyversion = consistencyversion;
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

	public Long getCracctsId() {
		return this.cracctsId;
	}

	public void setCracctsId(Long cracctsId) {
		this.cracctsId = cracctsId;
	}

	public Long getDbacctsId() {
		return this.dbacctsId;
	}

	public void setDbacctsId(Long dbacctsId) {
		this.dbacctsId = dbacctsId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}