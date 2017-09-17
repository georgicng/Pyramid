package com.gaiproject.controls;

import com.gaiproject.dao.AppuserDAO;
import com.gaiproject.dao.RoleDAO;
import com.gaiproject.pojo.Appuser;
import com.gaiproject.pojo.Role;
import com.sqldalmaker.DataStoreManager;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;
import org.apache.shiro.crypto.hash.Hash;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User_new implements Control {

    private static final Logger log = LoggerFactory.getLogger("customFilterLog");

    public boolean doLogic(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("title", "New User");

        if (request.getMethod().equalsIgnoreCase("POST")) {
            Appuser user = new Appuser();
            if (request.getParameter("name") != null){
                user.setName(request.getParameter("name"));
            }           
            if (request.getParameter("othernames") != null) {
                user.setOthernames(request.getParameter("othernames"));
            }
            if (request.getParameter("username") != null) {
                user.setUsername(request.getParameter("username"));
                Hash hash = new Sha256Hash(user.getUsername());
                user.setPassword(hash.toHex());
                log.info("password: " + hash.toHex());
            }
            if (request.getParameter("phone") != null) {
                user.setPhoneno(request.getParameter("phone"));
            }
            if (request.getParameter("role") != null) {
                user.setRolename(request.getParameter("role"));
            }
            if (request.getParameter("status") != null) {
                user.setStatus(request.getParameter("status"));
            }
            if (request.getParameter("email") != null) {
                user.setEmail(request.getParameter("email"));
            }
            
            user.setConsistencyversion(1L);
            
            log.info("user: " + user.toString());
            
            DataStoreManager ds = new DataStoreManager();
            try {
                ds.open();
                AppuserDAO dao = ds.createAppuserDAO();
                int code = dao.createAppuser(user);
                log.info("new User dao return value: " + code);
                if (code != -1){
                    request.setAttribute("created", true);
                } else {
                    request.setAttribute("errMsg", "Insertion failed, please try again");
                    request.setAttribute("user", user);
                }
                ds.close();
            } catch (Exception e) {
                log.error("insert user error object", e);
                request.setAttribute("errMsg", "Something went wrong");
            } 

        } else {
            DataStoreManager ds = new DataStoreManager();
            try {
                ds.open();
                RoleDAO dao = ds.createRoleDAO();
                List<Role> roles = dao.readRoleList();
                if (!roles.isEmpty()){
                    request.setAttribute("roles", roles);
                }
                ds.close();
            } catch (Exception e) {
                log.error("getting roles error object: ", e);
            } 
        }
        return true;
    }
}
