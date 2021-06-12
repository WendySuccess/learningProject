package com.flyaway.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();  
        session.invalidate();           
        PrintWriter out = response.getWriter();
        
        out.println("<html><head> <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\"> " 
        		+ "</head><body><style>header {width: 100%;height: 110px;background-color: #0683c9;}header nav {display: block;float: none;height: 30px;text-align: right; margin: 0 auto; }header nav a {color: white; } header nav a:hover {color: white; }#info-bar {background-color: #3cb5f9;   position:fixed; bottom:0; width: 100%; }</style>");
        out.println( "   <header> <div class=\"container clearfix\"> <h1 id=\"logo\">FlyAway !</h1> <h5>Your Airline Booking Portal</h5><nav> <a href=\"adminLogin.jsp\">Admin Login</a> </nav>    </div></header></center><div class=\"container\">	");
      
        out.println("<center>Logged out of session.<br></center>");
        out.println("<center><a href='index.jsp'>Back to Login Page</a><br></center>");
        out.println("</div><div id=\"info-bar\"><div><span><a href=\"\">CopyRight 2021 </a></span></div></div></footer></body></html>");

	}

}
