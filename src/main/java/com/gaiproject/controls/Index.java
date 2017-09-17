package com.gaiproject.controls;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Index implements Control {
    private static final Logger log = LoggerFactory.getLogger("customFilterLog");
    
	public boolean doLogic(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		request.setAttribute("title", "Home");
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                Subject currentUser = SecurityUtils.getSubject();
                log.info(gson.toJson(currentUser.getPrincipals()));
                request.setAttribute("principals", gson.toJson(currentUser.getPrincipals()));
                request.setAttribute("principal", gson.toJson(currentUser.getPrincipal()));
		return true;
	}
}