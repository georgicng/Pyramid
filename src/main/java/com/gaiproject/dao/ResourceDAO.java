package com.gaiproject.dao;

import com.sqldalmaker.DataStore;

import com.gaiproject.pojo.Resource;
import java.util.List;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually.
 * SQL DAL Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class ResourceDAO {

	protected final DataStore ds;

	public ResourceDAO(DataStore ds) {
		this.ds = ds;
	}

	/**
	 * CRUD-Create. The table 'resource'.
	 * Auto-generated values are assigned to appropriate fields of DTO.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int createResource(Resource p) throws Exception {

		String sql = "INSERT INTO resource (ACTION, CONSISTENCYVERSION, DESCRIPTION, DISPLAYNAME, MODULENAME, NAME) " 
				 + "VALUES (?, ?, ?, ?, ?, ?)";

		String []genColNames = new String[] {"ID"};
		Object []genValues = new Object[genColNames.length];

		int res = ds.insert(sql, genColNames, genValues, p.getAction(), p.getConsistencyversion(), p.getDescription(), p.getDisplayname(), p.getModulename(), p.getName());

		p.setId(ds.castGeneratedValue(Long.class, genValues[0]));

		return res;
	}

	/**
	 * CRUD-Read. The table 'resource'.
	 */
	public List<Resource> readResourceList() throws Exception {

		String sql = "SELECT * FROM resource";

		return ds.queryDtoList(sql, new DataStore.RowHandler<Resource>() {

			public Resource handleRow(DataStore.RowData rd) throws Exception {
				Resource obj = new Resource();
				obj.setId(rd.getValue(Long.class, "ID"));
				obj.setAction(rd.getValue(String.class, "ACTION"));
				obj.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				obj.setDescription(rd.getValue(String.class, "DESCRIPTION"));
				obj.setDisplayname(rd.getValue(String.class, "DISPLAYNAME"));
				obj.setModulename(rd.getValue(String.class, "MODULENAME"));
				obj.setName(rd.getValue(String.class, "NAME"));
				return obj;
			}

		});
	}

	/**
	 * CRUD-Read. The table 'resource'.
	 */
	public Resource readResource(Long id) throws Exception {

		String sql = "SELECT * FROM resource WHERE ID = ?";

		return ds.queryDto(sql, new DataStore.RowHandler<Resource>() {

			public Resource handleRow(DataStore.RowData rd) throws Exception {
				Resource res = new Resource();
				res.setId(rd.getValue(Long.class, "ID"));
				res.setAction(rd.getValue(String.class, "ACTION"));
				res.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
				res.setDescription(rd.getValue(String.class, "DESCRIPTION"));
				res.setDisplayname(rd.getValue(String.class, "DISPLAYNAME"));
				res.setModulename(rd.getValue(String.class, "MODULENAME"));
				res.setName(rd.getValue(String.class, "NAME"));
				return res;
			}

		}, id);
	}

	/**
	 * CRUD-Update. The table 'resource'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateResource(Resource p) throws Exception {

		String sql = "UPDATE resource SET " 
				 + " ACTION = ?, CONSISTENCYVERSION = ?, DESCRIPTION = ?, DISPLAYNAME = ?, MODULENAME = ?, NAME = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, p.getAction(), p.getConsistencyversion(), p.getDescription(), p.getDisplayname(), p.getModulename(), p.getName(), p.getId());
	}

	/**
	 * CRUD-Update. The table 'resource'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateResource(String action, Long consistencyversion, String description, String displayname, String modulename, String name, Long id) throws Exception {

		String sql = "UPDATE resource SET " 
				 + " ACTION = ?, CONSISTENCYVERSION = ?, DESCRIPTION = ?, DISPLAYNAME = ?, MODULENAME = ?, NAME = ? " 
				 + "WHERE ID = ?";

		return ds.execDML(sql, action, consistencyversion, description, displayname, modulename, name, id);
	}

	/**
	 * CRUD-Delete. The table 'resource'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteResource(Resource p) throws Exception {

		String sql = "DELETE FROM resource WHERE ID = ?";

		return ds.execDML(sql, p.getId());
	}

	/**
	 * CRUD-Delete. The table 'resource'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteResource(Long id) throws Exception {

		String sql = "DELETE FROM resource WHERE ID = ?";

		return ds.execDML(sql, id);
	}
}