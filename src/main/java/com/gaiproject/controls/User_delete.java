package com.gaiproject.controls;

import com.gaiproject.dao.AppuserDAO;
import com.sqldalmaker.DataStoreManager;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User_delete implements Control {

    private static final Logger log = LoggerFactory.getLogger("customFilterLog");

    public boolean doLogic(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("title", "Delete User");

        if(request.getParameter("id") != null && !request.getParameter("id").isEmpty()) {
            Long id = Long.parseLong(request.getParameter("id"));
            DataStoreManager ds = new DataStoreManager();
            try {
                ds.open();
                AppuserDAO userdao = ds.createAppuserDAO();
                int ret = userdao.deleteAppuser(id);
                if (ret > 0) {
                    log.info("User deleted: " + id);
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
            request.setAttribute("errMsg", "No user ID is provide");
        }
        return true;
    }
}
