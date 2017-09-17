package com.gaiproject.controls;

import com.gaiproject.dao.RoleDAO;
import com.gaiproject.pojo.Role;
import com.sqldalmaker.DataStoreManager;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Role_edit implements Control {

    private static final Logger log = LoggerFactory.getLogger("customFilterLog");

    public boolean doLogic(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("title", "Edit Role");

        if ("POST".equalsIgnoreCase(request.getMethod()) && request.getParameter("id") != null && !request.getParameter("id").isEmpty()) {
            Long id = Long.parseLong(request.getParameter("id"));            
            DataStoreManager ds = new DataStoreManager();
            
            try {                
                ds.open();
                RoleDAO roledao = ds.createRoleDAO();
                Role role = roledao.readRole(id);
            if (request.getParameter("name") != null){
                role.setName(request.getParameter("name"));
            }   
            if (request.getParameter("status") != null) {
                role.setStatus(request.getParameter("status"));
            }
            if (request.getParameter("description") != null) {
                role.setDescription(request.getParameter("description"));
            }
            role.setConsistencyversion(1L);
            log.info("role update: " + role.toString());

                int code = roledao.updateRole(role);
                log.info("Role update dao return value: " + code);
                if (code != -1) {
                    request.setAttribute("updated", true);                    
                } else {
                   request.setAttribute("errMsg", "Update failed, please try again");
                   request.setAttribute("role", role);
                }
                ds.close();
            } catch (Exception e) {
                log.error("insert role error object", e);
                request.setAttribute("errMsg", "Something went wrong");
            }

        }else if (request.getMethod().equalsIgnoreCase("GET") && request.getParameter("id") != null && !request.getParameter("id").isEmpty()) {
            Long id = Long.parseLong(request.getParameter("id"));
            DataStoreManager ds = new DataStoreManager();
            try {
                ds.open();
                RoleDAO roledao = ds.createRoleDAO();
                Role role = roledao.readRole(id);
                if (role != null) {
                    log.info("Role to edit: " + role);
                    request.setAttribute("role", role);
                } else {
                    request.setAttribute("errMsg", "User not found");
                }
                ds.close();
            } catch (Exception e) {
                log.error("getting roles error object: ", e);
                request.setAttribute("errMsg", "Something went wrong");
            }
        } else {
            request.setAttribute("errMsg", "Missing parameters");
        }
        return true;
    }
}
