package com;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Query")
public class Query extends HttpServlet {
	private static final long serialVersionUID = 1L;

    SQL sqlObj=new SQL(); 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data=request.getParameter("number");
		
		//PrintWriter out=response.getWriter();
	    response.setContentType("text/html");
	    
		int res=-1;			RequestDispatcher  rd ;
		
		HttpSession s = request.getSession();
		
		if(s.getAttribute("check")==null){
			response.getWriter().println("Please login to use the services");
			request.getRequestDispatcher("Login.html").forward(request, response);
		}
		
    	switch (data) {
		case "Insert":
			
			res=sqlObj.insert(Integer.parseInt(request.getParameter("id")),request.getParameter("name"),Float.parseFloat(request.getParameter("salary")));
			
			if(res>0)
				request.setAttribute("res_insert", 1);
			else
				request.setAttribute("res_insert", 0);
			
			rd = request.getRequestDispatcher("InsertTag.jsp");
			rd.forward(request, response);	
			
			break;
			
		case "update":
			
			res=sqlObj.update(Integer.parseInt(request.getParameter("id")),request.getParameter("name"),Float.parseFloat(request.getParameter("salary")));
			
			if(res>0)
				request.setAttribute("res_update", 1);
			else
				request.setAttribute("res_update", 0);
			
			rd = request.getRequestDispatcher("UpdateTag.jsp");
			rd.forward(request, response);
			
			break;
			
		case "Delete":
			
			res=sqlObj.delete(Integer.parseInt(request.getParameter("id")));
			
			if(res>0)
				request.setAttribute("res_delete", 1);
			else
				request.setAttribute("res_delete", 0);
			try {
				sqlObj.delete(Integer.parseInt(request.getParameter("flag")));
				rd = request.getRequestDispatcher("ViewAllTag.jsp");
				rd.forward(request, response);
			} catch (Exception e) {
				
			}
			
			rd = request.getRequestDispatcher("DeleteTag.jsp");
			rd.forward(request, response);
		
			break;
			
		case "search":
			
		//  String[] value=sqlObj.search(Integer.parseInt(request.getParameter("id")));
			request.setAttribute("ID",Integer.parseInt(request.getParameter("id")));
			rd = request.getRequestDispatcher("Search.jsp");
			rd.forward(request, response);
		
			break;
			
		case "viewAll":
			
		/*	String[][] table=sqlObj.viewAll();
			
			if(table!=null){
					out.println("ID"+"&nbsp&nbsp&nbsp"+"Name"+"&nbsp&nbsp&nbsp"+"Salary<br>");
					for(int i=0;i<table.length;i++){
						for(int j=0;j<3;j++)
							out.print(table[i][j]+"&nbsp&nbsp");
					out.println("<br>");
					}
			}
			*/
			rd = request.getRequestDispatcher("ViewAllTag.jsp");
			rd.forward(request, response);
			
			break;
		
		default:
			break;
		}
    	
	}

}
