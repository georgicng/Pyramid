package com.gaiproject.controls;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;

public interface Control {
	public boolean doLogic(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException;
}