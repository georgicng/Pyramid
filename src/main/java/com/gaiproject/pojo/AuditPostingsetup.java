package com.gaiproject.pojo;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually.
 * SQL DAL Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class AuditPostingsetup  {

	private Long id;
	private String action;
	private Long consistencyversion;
	private String createdby;
	private Long glid;
	private String glname;
	private Long objectid;
	private String postingtype;
	private String status;
	private java.util.Date systemcreatedate;
	private java.util.Date systemcreatetimestamp;
	private Long version;
	private Long userId;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Long getConsistencyversion() {
		return this.consistencyversion;
	}

	public void setConsistencyversion(Long consistencyversion) {
		this.consistencyversion = consistencyversion;
	}

	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Long getGlid() {
		return this.glid;
	}

	public void setGlid(Long glid) {
		this.glid = glid;
	}

	public String getGlname() {
		return this.glname;
	}

	public void setGlname(String glname) {
		this.glname = glname;
	}

	public Long getObjectid() {
		return this.objectid;
	}

	public void setObjectid(Long objectid) {
		this.objectid = objectid;
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

	public Long getVersion() {
		return this.version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}