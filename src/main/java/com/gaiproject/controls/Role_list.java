package com.gaiproject.controls;

//import com.gaiproject.dao.RoleDAO;
//import com.gaiproject.pojo.Role;
//import com.sqldalmaker.DataStoreManager;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Role_list implements Control {

    private static final Logger log = LoggerFactory.getLogger("customFilterLog");

    public boolean doLogic(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("title", "All Roles");

//        DataStoreManager ds = new DataStoreManager();
//
//        try {
//            ds.open();
//            RoleDAO dao = ds.createRoleDAO();
//            List<Role> roles = dao.readRoleList();
//            log.info("No of roles record returned: " + roles.size());
//            request.setAttribute("roles", roles);
//            ds.close();
//        } catch (Exception e) {
//            log.error("insert role error object", e);
//        }

        return true;
    }
}
