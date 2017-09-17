package com.gaiproject.dao;

import com.sqldalmaker.DataStore;

import com.gaiproject.pojo.RoleAppuser;
import java.util.List;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually.
 * SQL DAL Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class RoleAppuserDAO {

	protected final DataStore ds;

	public RoleAppuserDAO(DataStore ds) {
		this.ds = ds;
	}

	/**
	 * CRUD-Create. The table 'role_appuser'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int createRoleAppuser(RoleAppuser p) throws Exception {

		String sql = "INSERT INTO role_appuser (Role_ID, user_ID) " 
				 + "VALUES (?, ?)";

		return ds.execDML(sql, p.getRoleId(), p.getUserId());
	}

	/**
	 * CRUD-Create. The table 'role_appuser'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int createRoleAppuser(Long roleId, Long userId) throws Exception {

		String sql = "INSERT INTO role_appuser (Role_ID, user_ID) " 
				 + "VALUES (?, ?)";

		return ds.execDML(sql, roleId, userId);
	}

	/**
	 * CRUD-Read. The table 'role_appuser'.
	 */
	public List<RoleAppuser> readRoleAppuserList() throws Exception {

		String sql = "SELECT * FROM role_appuser";

		return ds.queryDtoList(sql, new DataStore.RowHandler<RoleAppuser>() {

			public RoleAppuser handleRow(DataStore.RowData rd) throws Exception {
				RoleAppuser obj = new RoleAppuser();
				obj.setRoleId(rd.getValue(Long.class, "Role_ID"));
				obj.setUserId(rd.getValue(Long.class, "user_ID"));
				return obj;
			}

		});
	}

	/**
	 * CRUD-Read. The table 'role_appuser'.
	 */
	public RoleAppuser readRoleAppuser(Long roleId, Long userId) throws Exception {

		String sql = "SELECT * FROM role_appuser WHERE Role_ID = ? AND user_ID = ?";

		return ds.queryDto(sql, new DataStore.RowHandler<RoleAppuser>() {

			public RoleAppuser handleRow(DataStore.RowData rd) throws Exception {
				RoleAppuser res = new RoleAppuser();
				res.setRoleId(rd.getValue(Long.class, "Role_ID"));
				res.setUserId(rd.getValue(Long.class, "user_ID"));
				return res;
			}

		}, roleId, userId);
	}

	// INFO: updateRoleAppuser is omitted because all columns are part of PK.

	/**
	 * CRUD-Delete. The table 'role_appuser'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteRoleAppuser(RoleAppuser p) throws Exception {

		String sql = "DELETE FROM role_appuser WHERE Role_ID = ? AND user_ID = ?";

		return ds.execDML(sql, p.getRoleId(), p.getUserId());
	}

	/**
	 * CRUD-Delete. The table 'role_appuser'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteRoleAppuser(Long roleId, Long userId) throws Exception {

		String sql = "DELETE FROM role_appuser WHERE Role_ID = ? AND user_ID = ?";

		return ds.execDML(sql, roleId, userId);
	}
}