package com.gaiproject.controls;

import com.gaiproject.dao.RoleDAO;
import com.sqldalmaker.DataStoreManager;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Role_delete implements Control {

    private static final Logger log = LoggerFactory.getLogger("customFilterLog");

    public boolean doLogic(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("title", "Delete Role");

        if(request.getParameter("id") != null && !request.getParameter("id").isEmpty()) {
            Long id = Long.parseLong(request.getParameter("id"));
            DataStoreManager ds = new DataStoreManager();
            try {
                ds.open();
                RoleDAO roledao = ds.createRoleDAO();
                int ret = roledao.deleteRole(id);
                if (ret > 0) {
                    log.info("Role deleted: " + id);
                    request.setAttribute("deleted", true);
                } else {
                   request.setAttribute("errMsg", "Couldn't delete record"); 
                }
                ds.close();
            } catch (Exception e) {
                log.error("getting roles error object: ", e);
                request.setAttribute("errMsg", "Something went wrong");
            }
        } else {
            request.setAttribute("errMsg", "No role ID provided");
        }
        return true;
    }
}
