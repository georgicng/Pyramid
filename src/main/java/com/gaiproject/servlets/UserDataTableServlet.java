package com.gaiproject.servlets;

// Import required java libraries
import com.gaiproject.dao.AppuserDAO;
import com.gaiproject.data.DataTable;
import com.gaiproject.pojo.Appuser;
import com.github.danfickle.javasqlquerybuilder.QbFactory;
import com.github.danfickle.javasqlquerybuilder.QbSelect;
import com.github.danfickle.javasqlquerybuilder.QbSelect.QbOrderBy;
import com.github.danfickle.javasqlquerybuilder.QbWhere.QbWhereOperator;
import com.github.danfickle.javasqlquerybuilder.generic.QbFactoryImp;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sqldalmaker.DataStoreManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

// Extend HttpServlet class
public class UserDataTableServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        ServletContext sc = getServletContext();
        String Echo = request.getParameter("sEcho");
        String Start = request.getParameter("iDisplayStart");
        String Amount = request.getParameter("iDisplayLength");
        String sCol = request.getParameter("iSortCol_0");
        String sdir = request.getParameter("sSortDir_0");
        String SEARCH_TERM = request.getParameter("sSearch");

        QbFactory f = new QbFactoryImp();
        QbSelect sel = f.newSelectQuery();
        sel.select(f.newAllField())
                .from("Appuser");
        if (SEARCH_TERM != null && !SEARCH_TERM.isEmpty()) {
            sel.where()
                    .where(f.newStdField("name"), QbWhereOperator.LIKE, ":search")
                    .orWhere(f.newStdField("othernames"), QbWhereOperator.LIKE, ":search")
                    .orWhere(f.newStdField("email"), QbWhereOperator.LIKE, ":search")
                    .orWhere(f.newStdField("phoneno"), QbWhereOperator.LIKE, ":search")
                    .orWhere(f.newStdField("username"), QbWhereOperator.LIKE, ":search")
                    .orWhere(f.newStdField("rolename"), QbWhereOperator.LIKE, ":search");
        }

        if (sCol != null) {
            String col_name = request.getParameter("mDataProp_" + sCol);
            if (col_name != null) {
                sel.orderBy(QbOrderBy.valueOf(sdir.toUpperCase()), f.newStdField(col_name));
            }
        }

        if (Start != null) {
            sel.limit(Integer.parseInt(Start), Integer.parseInt(Amount));
        }

        sc.log("Generated query: " + sel.getQueryString());

        response.setContentType("application/json");

        PrintWriter out = response.getWriter();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = "";
        boolean err = false;
        List<Appuser> users;
        AppuserDAO dao;
        DataTable<Appuser> dataTableObject;
        DataStoreManager ds = new DataStoreManager();
        try {
            ds.open();
            dao = ds.createAppuserDAO();
            if (SEARCH_TERM != null && !SEARCH_TERM.isEmpty()) {
                SEARCH_TERM = "%" + SEARCH_TERM + "%";
                users = dao.readAppuserList(sel.getQueryString(), (Object[]) StringUtils.split(StringUtils.repeat(SEARCH_TERM, " ", 6)));
            } else {
                users = dao.readAppuserList(sel.getQueryString());
            }
            dataTableObject = new DataTable<Appuser>();
            dataTableObject.setAaData(users);
            dataTableObject.setiTotalDisplayRecords(users.size());
            dataTableObject.setiTotalRecords(dao.countAppusers());
            dataTableObject.setsEcho(Echo);
            json = gson.toJson(dataTableObject);
            sc.log("No of users returned: " + users.size());
            ds.close();
        } catch (Exception e) {
            sc.log("insert user error object", e);
            Map resp = new HashMap();
            resp.put("success", false);
            resp.put("message", "Something went wrong");
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
