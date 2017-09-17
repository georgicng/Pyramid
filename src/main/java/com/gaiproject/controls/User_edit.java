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

public class User_edit implements Control {

    private static final Logger log = LoggerFactory.getLogger("customFilterLog");

    public boolean doLogic(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("title", "Edit User");

        if (request.getMethod().equalsIgnoreCase("POST") && request.getParameter("id") != null && !request.getParameter("id").isEmpty()) {
            Long id = Long.parseLong(request.getParameter("id"));
            
            DataStoreManager ds = new DataStoreManager();
            try {
                ds.open();
                AppuserDAO userdao = ds.createAppuserDAO();
                Appuser user = userdao.readAppuser(id);
                if (request.getParameter("name") != null) {
                    user.setName(request.getParameter("name"));
                }
                if (request.getParameter("othernames") != null) {
                    user.setOthernames(request.getParameter("othernames"));
                }
                if (request.getParameter("username") != null) {
                    user.setUsername(request.getParameter("username"));
                }
                if (request.getParameter("password") != null /* && request.getParameter("password") == request.getParameter("confirm_password") */) {
                    log.info("password: " + request.getParameter("password"));
                    Hash hash = new Sha256Hash(request.getParameter("password"));
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

                log.info("user update: " + user.toString());

                int code = userdao.updateAppuser(user);
                log.info("User update dao return value: " + code);
                if (code != -1) {
                    request.setAttribute("updated", true);
                    request.setAttribute("user", user);
                } else {
                    request.setAttribute("errMsg", "Update failed");
                }
                
                RoleDAO roledao = ds.createRoleDAO();
                List<Role> roles = roledao.readRoleList();
                if (!roles.isEmpty()) {
                    request.setAttribute("roles", roles);
                }
                ds.close();
            } catch (Exception e) {
                log.error("insert user error object", e);
                request.setAttribute("errMsg", "Update failed");
            }

        } else if (request.getMethod().equalsIgnoreCase("GET") && request.getParameter("id") != null && !request.getParameter("id").isEmpty()) {
            Long id = Long.parseLong(request.getParameter("id"));
            DataStoreManager ds = new DataStoreManager();
            try {
                ds.open();
                AppuserDAO userdao = ds.createAppuserDAO();
                Appuser user = userdao.readAppuser(id);
                if (user != null) {
                    log.info("User to edit: " + user);
                    request.setAttribute("user", user);
                }
                RoleDAO roledao = ds.createRoleDAO();
                List<Role> roles = roledao.readRoleList();
                if (!roles.isEmpty()) {
                    request.setAttribute("roles", roles);
                } else {
                    request.setAttribute("errMsg", "User not found");
                }
                ds.close();
            } catch (Exception e) {
                log.error("getting roles error object: ", e);
                request.setAttribute("errMsg", "Something went wrong");
            }
        }else {
            request.setAttribute("errMsg", "Missing parameters");
        }
        return true;
    }
}
