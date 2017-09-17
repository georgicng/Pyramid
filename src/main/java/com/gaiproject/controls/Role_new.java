package com.gaiproject.controls;

import com.gaiproject.dao.RoleDAO;
import com.gaiproject.pojo.Role;
import com.sqldalmaker.DataStoreManager;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Role_new implements Control {

    private static final Logger log = LoggerFactory.getLogger("customFilterLog");

    public boolean doLogic(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("title", "New Role");

        if ("POST".equalsIgnoreCase(request.getMethod())) {
            Role role = new Role();
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
            log.info("role: " + role.toString());
            
            DataStoreManager ds = new DataStoreManager();
            
            try {                
                ds.open();
                RoleDAO dao = ds.createRoleDAO();
                int code = dao.createRole(role);
                log.info("new role dao return value: " + code);
                if (code != -1){
                    request.setAttribute("created", true);
                } else {
                    request.setAttribute("errMsg", "Insertion failed, please try again");
                    request.setAttribute("role", role);
                }
                ds.close();
            } catch (Exception e) {
                log.error("insert role error object", e);
                request.setAttribute("errMsg", "Something went wrong");
            }

        }
        return true;
    }
}
