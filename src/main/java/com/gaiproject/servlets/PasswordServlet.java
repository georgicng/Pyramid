package com.gaiproject.servlets;

// Import required java libraries
import com.gaiproject.dao.AppuserDAO;
import com.gaiproject.pojo.Appuser;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sqldalmaker.DataStoreManager;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.crypto.hash.Hash;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.subject.Subject;

// Extend HttpServlet class
public class PasswordServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        ServletContext sc = getServletContext();
        PrintWriter out = response.getWriter();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        boolean err = false;
        String json = "";
        if (request.getMethod().equalsIgnoreCase("POST") && request.getParameter("type") != null && request.getParameter("type").equals("change")) {
            try {
                
                //get user id from shiro
                Subject currentUser = SecurityUtils.getSubject();
                String principal = currentUser.getPrincipal().toString();
                sc.log("Principal: " + principal);
                //Appuser appuser = currentUser.getPrincipals().oneByType(com.gaiproject.pojo.Appuser.class);
                //Long id = appuser.getId();
                sc.log("processing change password request");
                DataStoreManager ds = new DataStoreManager();

                ds.open();
                AppuserDAO userdao = ds.createAppuserDAO();
                Appuser user = userdao.readAppuser(principal);
                if (request.getParameter("oldPassword") != null && request.getParameter("newPassword") != null) {
                    Hash oldHash = new Sha256Hash(request.getParameter("oldPassword"));
                    if (user.getPassword().equals(oldHash.toHex())) {
                        sc.log("password: " + request.getParameter("newPassword"));
                        Hash hash = new Sha256Hash(request.getParameter("newPassword"));
                        user.setPassword(hash.toHex());
                        sc.log("password: " + hash.toHex());
                        user.setConsistencyversion(1L);

                        sc.log("user update: " + user.toString());

                        int code = userdao.updateAppuser(user);
                        sc.log("User update dao return value: " + code);
                        if (code != -1) {
                            currentUser.logout();
                            Map resp = new HashMap();
                            resp.put("success", true);
                            resp.put("data", code);
                            json = gson.toJson(resp);
                        } else {
                            Map resp = new HashMap();
                            resp.put("success", false);
                            resp.put("message", "User doesn't exist");
                            json = gson.toJson(resp);
                            err = true;
                        }
                        ds.close();
                    } else {
                        Map resp = new HashMap();
                        resp.put("success", false);
                        resp.put("message", "User doesn't exist");
                        json = gson.toJson(resp);
                        err = true;
                    }
                } else {
                    Map resp = new HashMap();
                    resp.put("success", false);
                    resp.put("message", "Wrong password");
                    json = gson.toJson(resp);
                    err = true;
                }
            } catch (Exception e) {
                sc.log("insert user error object", e);
                Map resp = new HashMap();
                resp.put("success", false);
                resp.put("message", "Something went wrong");
                json = gson.toJson(resp);
                err = true;
            }
        } else if (request.getMethod()
                .equalsIgnoreCase("GET") && request.getParameter("id") != null && !request.getParameter("id").isEmpty() && request.getParameter("type").equals("reset")) {
            Long id = Long.parseLong(request.getParameter("id"));
            sc.log("processing password password request");
            DataStoreManager ds = new DataStoreManager();
            try {
                ds.open();
                AppuserDAO userdao = ds.createAppuserDAO();
                Appuser user = userdao.readAppuser(id);
                if (user != null) {
                    Hash hash = new Sha256Hash(user.getUsername());
                    user.setPassword(hash.toHex());
                    sc.log("password: " + hash.toHex());
                    user.setConsistencyversion(1L);

                    sc.log("user update: " + user.toString());

                    int code = userdao.updateAppuser(user);
                    sc.log("User update dao return value: " + code);
                    if (code != -1) {
                        Map resp = new HashMap();
                        resp.put("success", true);
                        resp.put("data", code);
                        json = gson.toJson(resp);
                    } else {
                        Map resp = new HashMap();
                        resp.put("success", false);
                        resp.put("message", "User doesn't exist");
                        json = gson.toJson(resp);
                        err = true;
                    }
                } else {
                    Map resp = new HashMap();
                    resp.put("success", false);
                    resp.put("message", "User doesn't exist");
                    json = gson.toJson(resp);
                    err = true;
                }
                ds.close();
            } catch (Exception e) {
                sc.log("getting roles error object: ", e);
                Map resp = new HashMap();
                resp.put("success", false);
                resp.put("message", "Something went wrong");
                json = gson.toJson(resp);
                err = true;
            }
        } else {
            Map resp = new HashMap();
            resp.put("success", false);
            resp.put("message", "Missing arguments");
            json = gson.toJson(resp);
            err = true;
        }

        if (err) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND, json);
        } else {
            out.print(json);
        }
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        processRequest(request, response);
    }

    public void destroy() {
        // do nothing.
    }
}
