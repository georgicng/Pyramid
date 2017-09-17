package com.gaiproject.controls;

//import com.gaiproject.dao.AppuserDAO;
//import com.gaiproject.dao.RoleDAO;
//import com.gaiproject.pojo.Appuser;
//import com.gaiproject.pojo.Role;
//import com.sqldalmaker.DataStoreManager;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User_list implements Control {

    private static final Logger log = LoggerFactory.getLogger("customFilterLog");

    public boolean doLogic(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("title", "All Users");

//        DataStoreManager ds = new DataStoreManager();
//        try {
//            ds.open();
//            AppuserDAO dao = ds.createAppuserDAO();
//            List<Appuser> users = dao.readAppuserList();
//            log.info("No of users returned: " + users.size());
//            request.setAttribute("users", users);
//            ds.close();
//        } catch (Exception e) {
//            log.error("insert user error object", e);
//        }

        return true;
    }
}
