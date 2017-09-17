package com.gaiproject.pojo;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually.
 * SQL DAL Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class Postingsetup  {

	private Long id;
	private Long consistencyversion;
	private String postingtype;
	private String status;
	private java.util.Date systemcreatedate;
	private java.util.Date systemcreatetimestamp;
	private Long glaccountId;
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

	public String getPostingtype() {
		return this.postingtype;
	}

	public void setPostingtype(String postingtype) {
		this.postingtype = postingtype;
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

	public Long getGlaccountId() {
		return this.glaccountId;
	}

	public void setGlaccountId(Long glaccountId) {
		this.glaccountId = glaccountId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}