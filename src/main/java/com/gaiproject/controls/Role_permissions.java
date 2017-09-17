package com.gaiproject.controls;

//import com.gaiproject.dao.RoleDAO;
//import com.gaiproject.pojo.Role;
//import com.sqldalmaker.DataStoreManager;
import com.gaiproject.dao.RoleDAO;
import com.gaiproject.dao.ResourceDAO;
import com.gaiproject.dao.PermissionentityDAO;
import com.gaiproject.pojo.Permissionentity;
import com.gaiproject.pojo.Resource;
import com.gaiproject.pojo.Role;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sqldalmaker.DataStoreManager;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Role_permissions implements Control {

    private static final Logger log = LoggerFactory.getLogger("customFilterLog");

    public boolean doLogic(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("title", "All Roles");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        if ("GET".equalsIgnoreCase(request.getMethod()) && request.getParameter("roleId") != null && !request.getParameter("roleId").isEmpty()) {
            Long id = Long.parseLong(request.getParameter("roleId"));
            DataStoreManager ds = new DataStoreManager();

            try {
                ds.open();

                RoleDAO roledao = ds.createRoleDAO();
                Role role = roledao.readRole(id);
                request.setAttribute("role", role);

                ResourceDAO resourcedao = ds.createResourceDAO();
                List<Resource> resources = resourcedao.readResourceList();
                request.setAttribute("resources", resources);
                
                Map module_map = new HashMap();
                module_map.put("A","Admin");
                module_map.put("AS","Account Setup");
                module_map.put("AC","Account Report");
                module_map.put("PS","Posting");
                        
                request.setAttribute("modules", module_map);

                PermissionentityDAO permissiondao = ds.createPermissionentityDAO();
                List<Permissionentity> permissions = permissiondao.readPermissionentityList();
                if(permissions.size() > 0){
                    Map<String,String[]> perm_map = new HashMap<String,String[]>();
                    for(Permissionentity perm : permissions){
                        String key = perm.getPermResource();
                        String[] value = {perm.getId().toString(), perm.getType()};
                        perm_map.put(key, value);
                    }
                    request.setAttribute("permissions", perm_map);
                }
                log.info("No of roles record returned: " + resources.size());

                ds.close();
            } catch (Exception e) {
                log.error("insert role error object", e);
            }
        }

        if ("POST".equalsIgnoreCase(request.getMethod()) && request.getParameter("roleId") != null) {
            DataStoreManager ds = new DataStoreManager();
            Long roleId = Long.parseLong(request.getParameter("roleId"));
            String[] perm_resource = {}, action = {}, type = {}, perm_id = {};

            if (request.getParameterValues("perm_resource") != null) {
                perm_resource = request.getParameterValues("perm_resource");
                log.info(gson.toJson(perm_resource));
            }
            if (request.getParameterValues("action") != null) {
                action = request.getParameterValues("action");
                log.info(gson.toJson(action));
            }
            if (request.getParameterValues("type") != null) {
                type = request.getParameterValues("type");
                log.info(gson.toJson(type));
            }

            if (request.getParameterValues("perm_id") != null) {
                perm_id = request.getParameterValues("perm_id");
                log.info(gson.toJson(perm_id));
            }

            try {
                ds.open();

                PermissionentityDAO permissiondao = ds.createPermissionentityDAO();

                Permissionentity permission;

                for (int i = 0; i < perm_resource.length; i++) {

                    if (perm_id[i].isEmpty() || perm_id[i] == null) {
                        permission = new Permissionentity();
                        permission.setPermResource(perm_resource[i]);
                        permission.setType(type[i]);
                        permission.setRole(roleId.toString());
                        permission.setAction(action[i]);
                        permission.setConsistencyversion(1L);
                        permissiondao.createPermissionentity(permission);
                    } else {
                        permission = permissiondao.readPermissionentity(Long.parseLong(perm_id[i]));
                        permission.setType(type[i]);
                        permissiondao.updatePermissionentity(permission);
                    }
                }
                
                request.setAttribute("saved", true);

                RoleDAO roledao = ds.createRoleDAO();
                Role role = roledao.readRole(roleId);
                request.setAttribute("role", role);

                ResourceDAO resourcedao = ds.createResourceDAO();
                List<Resource> resources = resourcedao.readResourceList();
                request.setAttribute("resources", resources);
                Map module_map = new HashMap();
                module_map.put("A","Admin");
                module_map.put("AS","Account Setup");
                module_map.put("AC","Account Report");
                module_map.put("PS","Posting");
                        
                request.setAttribute("modules", module_map);

                List<Permissionentity> permissions = permissiondao.readPermissionentityList(role.getId().toString());
                if(permissions.size() > 0){
                    Map<String,String[]> perm_map = new HashMap<String,String[]>();
                    for(Permissionentity perm : permissions){
                        String key = perm.getPermResource();
                        String[] value = {perm.getId().toString(), perm.getType()};
                        perm_map.put(key, value);
                    }
                    request.setAttribute("permissions", perm_map);
                }
                log.info("No of roles record returned: " + resources.size());
                ds.close();
                
            } catch (Exception e) {
                log.error("insert role error object", e);
            }
        }

        return true;
    }
}
