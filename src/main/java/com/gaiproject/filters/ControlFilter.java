package com.gaiproject.filters;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.gaiproject.controls.*;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ControlFilter implements Filter {
	protected FilterConfig config = null;
        
        private static final Logger log = LoggerFactory.getLogger("customFilterLog");

	public void init(FilterConfig filterConfig) {
		config = filterConfig;
	}

	public void doFilter ( ServletRequest req, ServletResponse res, FilterChain chain )
		throws IOException, ServletException {
		if (!(req instanceof HttpServletRequest)) {
			throw new ServletException("Filter requires a HTTP request.");
		}
                ServletContext sc = config.getServletContext();
                
                
		// determine name of implicit control component.
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)res;
                sc.log("resquest object: " + request);
                log.info("resquest object: ", request);
                log.info("resquest object_: " + request);
		String uri = request.getRequestURI();
		String start = request.getContextPath() + "/app/";
		String stop = ".jsp";
		String name = StringUtils.substringBetween(uri, start, stop);
                name = StringUtils.replaceChars(name, '/', '_');                
                name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
		if (name == null || name.isEmpty()) {
			name = "Index";
		}
                log.info("name: " + name);
                sc.log("control name: " + name);
		boolean doFilter = true;
		// try to load and run an implicit MVC control component.
		try {
			Object o = Class.forName("com.gaiproject.controls."+name).newInstance();
			if (!(o instanceof Control)) {
				throw new ServletException("Class com.gaiproject.controls. " + name + " does not implement com.gaiproject.controls.Control");
			}
			Control control = (Control)o;
			doFilter = control.doLogic(request, response);
		}
		catch (ClassNotFoundException e) {
		//ignore
		}
		catch (InstantiationException e) {
			throw new ServletException(e);
		}
		catch (IllegalAccessException e) {
			throw new ServletException(e);
		}
		// do whatever is next
		if (doFilter) {
			chain.doFilter(request, response);
		}
	}
	
	public void destroy() {
	// noop
	}
}