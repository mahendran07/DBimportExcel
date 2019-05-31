package com.chainsys.exportdb.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.exportdb.service.Exportdboperation;
import com.chainsys.exportdb.serviceImpl.ExportserviceImpl;

/**
 * Servlet implementation class ExportdbExcelServlet
 */
@WebServlet("/ExportdbExcelServlet")
public class ExportdbExcelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExportdbExcelServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String table_name=request.getParameter("tname");
		//System.out.println(table_name);
		List<String> exportdbvalue=new ArrayList<>();
		Exportdboperation exportdboperation=new ExportserviceImpl();
		exportdbvalue=exportdboperation.dbData(table_name);
		System.out.println(exportdbvalue);
		System.out.println(exportdbvalue.size());
		request.setAttribute("table_name", exportdbvalue);
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("result.jsp");
		requestDispatcher.forward(request, response);
	}
}
