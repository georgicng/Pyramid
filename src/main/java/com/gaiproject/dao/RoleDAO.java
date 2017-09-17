package com.gaiproject.dao;

import com.gaiproject.pojo.Appuser;
import com.sqldalmaker.DataStore;

import com.gaiproject.pojo.Role;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually. SQL DAL
 * Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class RoleDAO {

    private static final Logger log = LoggerFactory.getLogger("customFilterLog");
    protected final DataStore ds;

    public RoleDAO(DataStore ds) {
        this.ds = ds;
    }

    /**
     * CRUD-Create. The table 'role'. Auto-generated values are assigned to
     * appropriate fields of DTO. Returns the number of affected rows or -1 on
     * error.
     */
    public int createRole(Role p) throws Exception {

        String sql = "INSERT INTO role (CONSISTENCYVERSION, DESCRIPTION, NAME, STATUS, SYSTEMCREATEDATE, SYSTEMCREATETIMESTAMP) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        String[] genColNames = new String[]{"ID"};
        Object[] genValues = new Object[genColNames.length];

        int res = ds.insert(sql, genColNames, genValues, p.getConsistencyversion(), p.getDescription(), p.getName(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp());

        p.setId(ds.castGeneratedValue(Long.class, genValues[0]));

        return res;
    }

    /**
     * CRUD-Read. The table 'role'.
     */
    public List<Role> readRoleList() throws Exception {

        String sql = "SELECT * FROM role";

        return ds.queryDtoList(sql, new DataStore.RowHandler<Role>() {

            public Role handleRow(DataStore.RowData rd) throws Exception {
                Role obj = new Role();
                obj.setId(rd.getValue(Long.class, "ID"));
                obj.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
                obj.setDescription(rd.getValue(String.class, "DESCRIPTION"));
                obj.setName(rd.getValue(String.class, "NAME"));
                obj.setStatus(rd.getValue(String.class, "STATUS"));
                obj.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
                obj.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
                return obj;
            }

        });
    }

    public List<Role> readRoleList(String customQuery, Object... params) throws Exception {

        String sql = customQuery;
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        log.info(sql);
        log.info(gson.toJson(params));

        return ds.queryDtoList(sql, new DataStore.RowHandler<Role>() {

            public Role handleRow(DataStore.RowData rd) throws Exception {
                Role obj = new Role();
                obj.setId(rd.getValue(Long.class, "ID"));
                obj.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
                obj.setDescription(rd.getValue(String.class, "DESCRIPTION"));
                obj.setName(rd.getValue(String.class, "NAME"));
                obj.setStatus(rd.getValue(String.class, "STATUS"));
                obj.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
                obj.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
                return obj;
            }

        }, params);
    }

    /**
     * CRUD-Read. The table 'role'.
     */
    public Role readRole(Long id) throws Exception {

        String sql = "SELECT * FROM role WHERE ID = ?";

        return ds.queryDto(sql, new DataStore.RowHandler<Role>() {

            public Role handleRow(DataStore.RowData rd) throws Exception {
                Role res = new Role();
                res.setId(rd.getValue(Long.class, "ID"));
                res.setConsistencyversion(rd.getValue(Long.class, "CONSISTENCYVERSION"));
                res.setDescription(rd.getValue(String.class, "DESCRIPTION"));
                res.setName(rd.getValue(String.class, "NAME"));
                res.setStatus(rd.getValue(String.class, "STATUS"));
                res.setSystemcreatedate(rd.getValue(java.util.Date.class, "SYSTEMCREATEDATE"));
                res.setSystemcreatetimestamp(rd.getValue(java.util.Date.class, "SYSTEMCREATETIMESTAMP"));
                return res;
            }

        }, id);
    }

    /**
     * CRUD-Update. The table 'role'. Returns the number of affected rows or -1
     * on error.
     */
    public int updateRole(Role p) throws Exception {

        String sql = "UPDATE role SET "
                + " CONSISTENCYVERSION = ?, DESCRIPTION = ?, NAME = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ? "
                + "WHERE ID = ?";

        return ds.execDML(sql, p.getConsistencyversion(), p.getDescription(), p.getName(), p.getStatus(), p.getSystemcreatedate(), p.getSystemcreatetimestamp(), p.getId());
    }

    /**
     * CRUD-Update. The table 'role'. Returns the number of affected rows or -1
     * on error.
     */
    public int updateRole(Long consistencyversion, String description, String name, String status, java.util.Date systemcreatedate, java.util.Date systemcreatetimestamp, Long id) throws Exception {

        String sql = "UPDATE role SET "
                + " CONSISTENCYVERSION = ?, DESCRIPTION = ?, NAME = ?, STATUS = ?, SYSTEMCREATEDATE = ?, SYSTEMCREATETIMESTAMP = ? "
                + "WHERE ID = ?";

        return ds.execDML(sql, consistencyversion, description, name, status, systemcreatedate, systemcreatetimestamp, id);
    }

    /**
     * CRUD-Delete. The table 'role'. Returns the number of affected rows or -1
     * on error.
     */
    public int deleteRole(Role p) throws Exception {

        String sql = "DELETE FROM role WHERE ID = ?";

        return ds.execDML(sql, p.getId());
    }

    /**
     * CRUD-Delete. The table 'role'. Returns the number of affected rows or -1
     * on error.
     */
    public int deleteRole(Long id) throws Exception {

        String sql = "DELETE FROM role WHERE ID = ?";

        return ds.execDML(sql, id);
    }
    
     public int countRoles() throws Exception {

		String sql = "SELECT COUNT(*) FROM role";

		return ds.query(Long.class, sql).intValue();
	}
}
