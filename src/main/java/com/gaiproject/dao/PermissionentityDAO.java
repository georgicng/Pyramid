package com.gaiproject.dao;

import com.sqldalmaker.DataStore;

import com.gaiproject.pojo.Permissionentity;
import java.util.List;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually.
 * SQL DAL Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class PermissionentityDAO {

	protected final DataStore ds;

	public PermissionentityDAO(DataStore ds) {
		this.ds = ds;
	}

	/**
	 * CRUD-Create. The table 'permissionentity'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int createPermissionentity(Permissionentity p) throws Exception {

		String sql = "INSERT INTO permissionentity (ACTION, CONSISTENCYVERSION, perm_resource, ROLE, TYPE) " 
				 + "VALUES (?, ?, ?, ?, ?)";
                
                String []genColNames = new String[] {"ID"};
		Object []genValues = new Object[genColNames.length];

		int res = ds.insert(sql, genColNames, genValues, p.getAction(), p.getConsistencyversion(), p.getPermResource(), p.getRole(), p.getType());

		p.setId(ds.castGeneratedValue(Long.class, genValues[0]));

		return res;
	}

	/**
	 * CRUD-Create. The table 'permissionentity'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int createPermissionentity(Long id, String action, Long consistencyversion, String permResource, String role, String type) throws Exception {

		String sql = "INSERT INTO permissionentity (ID, ACTION, CONSISTENCYVERSION, perm_resource, ROLE, TYPE) " 
				 + "VALUES (?, ?, ?, ?, ?, ?)";

		return ds.execDML(sql, id, action, consistencyversion, permResource, role, type);
	}

	/**
	 * CRUD-Read. The table 'permissionentity'.
	 */
	public List<Permissionentity> readPermissionentityList() throws Exception {

		String sql = "SELECT * FROM permissionentity";

		return ds.queryDtoList(sql, new DataStore.RowHandler<Permissionentity>() {

			public Permissionentity handleRow(DataStore.RowData rd) throws Exception {
				Permissionentity obj = new Permissionentity();
				obj.setId(rd.getValue(Long.class, "ID"));
				obj.setAction(rd.getValue(String.class, "ACTION"));
				obj.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				obj.setPermResource(rd.getValue(String.class, "perm_resource"));
				obj.setRole(rd.getValue(String.class, "ROLE"));
				obj.setType(rd.getValue(String.class, "TYPE"));
				return obj;
			}

		});
	}
        
        /**
	 * CRUD-Read. The table 'permissionentity'.
	 */
	public List<Permissionentity> readPermissionentityList(String role) throws Exception {

		String sql = "SELECT * FROM permissionentity WHERE ROLE = ?";

		return ds.queryDtoList(sql, new DataStore.RowHandler<Permissionentity>() {

			public Permissionentity handleRow(DataStore.RowData rd) throws Exception {
				Permissionentity obj = new Permissionentity();
				obj.setId(rd.getValue(Long.class, "ID"));
				obj.setAction(rd.getValue(String.class, "ACTION"));
				obj.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				obj.setPermResource(rd.getValue(String.class, "perm_resource"));
				obj.setRole(rd.getValue(String.class, "ROLE"));
				obj.setType(rd.getValue(String.class, "TYPE"));
				return obj;
			}

		}, role);
	}

	/**
	 * CRUD-Read. The table 'permissionentity'.
	 */
	public Permissionentity readPermissionentity(Long id) throws Exception {

		String sql = "SELECT * FROM permissionentity WHERE ID = ?";

		return ds.queryDto(sql, new DataStore.RowHandler<Permissionentity>() {

			public Permissionentity handleRow(DataStore.RowData rd) throws Exception {
				Permissionentity res = new Permissionentity();
				res.setId(rd.getValue(Long.class, "ID"));
				res.setAction(rd.getValue(String.class, "ACTION"));
				res.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				res.setPermResource(rd.getValue(String.class, "perm_resource"));
				res.setRole(rd.getValue(String.class, "ROLE"));
				res.setType(rd.getValue(String.class, "TYPE"));
				return res;
			}

		}, id);
	}

	/**
	 * CRUD-Update. The table 'permissionentity'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updatePermissionentity(Permissionentity p) throws Exception {

		String sql = "UPDATE permissionentity SET " 
				 + " ACTION = ?, CONSISTENCYVERSION = ?, perm_resource = ?, ROLE = ?, TYPE = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, p.getAction(), p.getConsistencyversion(), p.getPermResource(), p.getRole(), p.getType(), p.getId());
	}

	/**
	 * CRUD-Update. The table 'permissionentity'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updatePermissionentity(String action, Long consistencyversion, String permResource, String role, String type, Long id) throws Exception {

		String sql = "UPDATE permissionentity SET " 
				 + " ACTION = ?, CONSISTENCYVERSION = ?, perm_resource = ?, ROLE = ?, TYPE = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, action, consistencyversion, permResource, role, type, id);
	}

	/**
	 * CRUD-Delete. The table 'permissionentity'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deletePermissionentity(Permissionentity p) throws Exception {

		String sql = "DELETE FROM permissionentity WHERE ID = ?";

		return ds.execDML(sql, p.getId());
	}

	/**
	 * CRUD-Delete. The table 'permissionentity'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deletePermissionentity(Long id) throws Exception {

		String sql = "DELETE FROM permissionentity WHERE ID = ?";

		return ds.execDML(sql, id);
	}
}