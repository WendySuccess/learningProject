

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DashBoardServlet
 */
public class DashBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DashBoardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        
        out.println("<html><body>");
        out.println("<center><h1>Dashboard</h1></center>");
        
        HttpSession session=request.getSession(false);  
        String userId = null;
    
        if (session.getAttribute("userid") != null)
            userId =(String)session.getAttribute("userid");  
        if (userId == null ) {
        	System.out.println("test");
            out.println("No UserId was found in session.<br>");
            out.println("<a href='index.html'>Back to Login Page</a><br>");
        } else {
            out.println("Welcome back, " + userId + "<br>");
            out.println("<a href='changePassword.jsp'>Change Password</a><br>");
            out.println("<a href='masterPlace'>Master Place</a><br>");
            out.println("<a href='LogoutServlet'>Click here to Logout</a><br>");
        }
        out.println("</body></html>");
	}

}
