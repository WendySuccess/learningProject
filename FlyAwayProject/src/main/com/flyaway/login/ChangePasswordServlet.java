package com.flyaway.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class changePasswordServlet
 */
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePasswordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String userId = null;
		  HttpSession session=request.getSession(false);  
		    if (session.getAttribute("userid") != null)
	            userId =(String)session.getAttribute("userid");  
		    
	
			String password=request.getParameter("password");
	   
	        LoginService obj = new LoginService();
	        String Result = obj.UpdatePassword( userId, password);
	        PrintWriter out = response.getWriter();
			request.getRequestDispatcher("DashBoardServlet").include(request, response);
			out.println("<div align=\"center\"><span style='color:red'>" + Result+"</span></div>");
	
	}
}
