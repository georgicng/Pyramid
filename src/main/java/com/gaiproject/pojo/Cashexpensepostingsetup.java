package com.gaiproject.pojo;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually.
 * SQL DAL Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class Cashexpensepostingsetup  {

	private Long id;
	private Long consistencyversion;
	private String name;
	private String status;
	private java.util.Date systemcreatedate;
	private java.util.Date systemcreatetimestamp;
	private Boolean usercashaccount;
	private Long crglaccountId;
	private Long dbglaccountId;
	private Long userId;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getConsistencyversion() {
		return this.consistencyversion;
	}

	public void setConsistencyversion(Long consistencyversion) {
		this.consistencyversion = consistencyversion;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Boolean getUsercashaccount() {
		return this.usercashaccount;
	}

	public void setUsercashaccount(Boolean usercashaccount) {
		this.usercashaccount = usercashaccount;
	}

	public Long getCrglaccountId() {
		return this.crglaccountId;
	}

	public void setCrglaccountId(Long crglaccountId) {
		this.crglaccountId = crglaccountId;
	}

	public Long getDbglaccountId() {
		return this.dbglaccountId;
	}

	public void setDbglaccountId(Long dbglaccountId) {
		this.dbglaccountId = dbglaccountId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}