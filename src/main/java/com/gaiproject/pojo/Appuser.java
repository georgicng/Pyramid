package com.gaiproject.pojo;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually.
 * SQL DAL Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class Appuser  {

	private Long id;
	private Boolean accountlocked;
	private Long consistencyversion;
	private String email;
	private Integer failedloginattempts;
	private String name;
	private String othernames;
	private String password;
	private String phoneno;
	private String reasonforlockedaccount;
	private Long roleid;
	private String rolename;
	private String status;
	private java.util.Date systemcreatedate;
	private java.util.Date systemcreatetimestamp;
	private String username;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getAccountlocked() {
		return this.accountlocked;
	}

	public void setAccountlocked(Boolean accountlocked) {
		this.accountlocked = accountlocked;
	}

	public Long getConsistencyversion() {
		return this.consistencyversion;
	}

	public void setConsistencyversion(Long consistencyversion) {
		this.consistencyversion = consistencyversion;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getFailedloginattempts() {
		return this.failedloginattempts;
	}

	public void setFailedloginattempts(Integer failedloginattempts) {
		this.failedloginattempts = failedloginattempts;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOthernames() {
		return this.othernames;
	}

	public void setOthernames(String othernames) {
		this.othernames = othernames;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneno() {
		return this.phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

    @Override
    public String toString() {
        return "Appuser{" + "id=" + id + ", accountlocked=" + accountlocked + ", consistencyversion=" + consistencyversion + ", email=" + email + ", failedloginattempts=" + failedloginattempts + ", name=" + name + ", othernames=" + othernames + ", password=" + password + ", phoneno=" + phoneno + ", reasonforlockedaccount=" + reasonforlockedaccount + ", roleid=" + roleid + ", rolename=" + rolename + ", status=" + status + ", systemcreatedate=" + systemcreatedate + ", systemcreatetimestamp=" + systemcreatetimestamp + ", username=" + username + '}';
    }

	public String getReasonforlockedaccount() {
		return this.reasonforlockedaccount;
	}

	public void setReasonforlockedaccount(String reasonforlockedaccount) {
		this.reasonforlockedaccount = reasonforlockedaccount;
	}

	public Long getRoleid() {
		return this.roleid;
	}

	public void setRoleid(Long roleid) {
		this.roleid = roleid;
	}

	public String getRolename() {
		return this.rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
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

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}