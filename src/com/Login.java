package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		 response.setContentType("text/html");
		 
		 SQL sqlObj=new SQL();
		 String data0= request.getParameter("abc");
		 String data= request.getParameter("id");
		 String data2= request.getParameter("pass");
		 switch (data0) {
			case "Login":
				
				if(sqlObj.loginCheck(data, data2)>0){
					
					HttpSession session=request.getSession();
					session.setAttribute("check","1");
					
					RequestDispatcher rd= request.getRequestDispatcher("index.html");
					rd.forward(request,response);
				}
				else{	
					out.println("<h2>Login Failed</h2>");
							
					request.getRequestDispatcher("Login.html").include(request, response);
						}				
				break;
	
			case "signup":
				 
				if(sqlObj.signup(data,data2)>0)
					out.println("Sign up successfull ");
				else
					out.println("Sign up failed");
				
				RequestDispatcher  rd = request.getRequestDispatcher("Login.html");
				rd.include(request, response);
				
					
				break;
				
			case "signout":
				
				request.getSession().invalidate();
				out.println("Sign out successfully");
				RequestDispatcher  rd1 = request.getRequestDispatcher("Login.html");
				rd1.include(request, response);
	 
				 break;
		}
		 	 
	}

}
