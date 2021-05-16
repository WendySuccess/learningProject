package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String emailID=request.getParameter("emailID");
		String password=request.getParameter("password");
		
		RequestDispatcher rd = null;
		if (emailID != null) {
		if(emailID.equalsIgnoreCase("admin@yahoo.com")&& password.equals("admin123")) {
			String email_ID = request.getParameter("emailID");
            HttpSession session=request.getSession();  
            session.setAttribute("userid",  email_ID );
			rd=request.getRequestDispatcher("DashBoardServlet");
			rd.forward(request,response);
		}else {
			rd=request.getRequestDispatcher("index.html");
			PrintWriter out=response.getWriter();
			rd.include(request, response);
			out.println("<center><span style='color:red'>Invalid username or password!</span></center>");
		}} else
		{
			rd=request.getRequestDispatcher("index.html");
			rd.forward(request,response);
		}
	}

}
