package com.flyaway.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.flyaway.util.HibernateUtil;
import com.flyaway.entity.Airline;
import com.flyaway.entity.Flight;
import com.flyaway.entity.Place;

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
        
        out.println("<html><head> <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\"> " 
        		+ "</head><body><style>header {width: 100%;height: 110px;background-color: #0683c9;}header nav {display: block;float: none;height: 30px;text-align: right; margin: 0 auto; }header nav a {color: white; } header nav a:hover {color: white; }#info-bar {background-color: #3cb5f9;   position:fixed; bottom:0; width: 100%; }</style>");
        out.println( "   <header> <div class=\"container clearfix\"> <h1 id=\"logo\">FlyAway !</h1> <h5>Your Airline Booking Portal</h5><nav> <a href=\"adminLogin.jsp\">Admin Login</a> </nav>    </div></header></center><div class=\"container\">	");
        
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
            out.println("<a href='changePassword.jsp'>Change Password</a> ||");
            //out.println("<a href='masterPlace'>Master Place</a><br>");
            out.println("<a href='LogoutServlet'>Click here to Logout</a><br><br>");    
            
            try {
                SessionFactory factory = HibernateUtil.getSessionFactory();
                
                Session session1 = factory.openSession();
                List<Place> list = session1.createQuery("from Place").list();
                out.println("Master list of Places for Source and Destination<br>");
   				out.println("<table class=\"table table-bordered table-sm\">");
              
                 for(Place p: list) {
                	 
                	 out.println(" <tr>");
                     out.println("<td>ID: " + String.valueOf(p.getIdplace()) + "</td><td>Name: " + p.getPlacename() + "</td>");
           
                     out.println("</tr>");
                 }
                 out.println(" </table>");
                 List<Airline> list2   = session1.createQuery("from Airline").list();
                 out.println("Master list of airlines<br>");
    			 out.println("<table class=\"table table-bordered table-sm\">");
    	               

                 for(Airline a: list2) {
                    	 
                	 	out.println(" <tr>");
                    	out.println("<td>ID: " + String.valueOf( a.getIdairline()) + "</td><td>Name: " + a.getAirlineName() + "</td>");  
                        out.println("</tr>");
                     }
                 out.println(" </table>");                 
                 List<Flight> list3   = session1.createQuery("from Flight").list();
                 out.println("Master list of Flight<br>");
    			 out.println("<table class=\"table table-bordered table-sm\">");
                 for( Flight f: list3) {
                    	 
                	 	out.println(" <tr>");
                    	out.println("<td>ID: " + String.valueOf( f.getIdflight()) 
                    	+ "</td><td>Souce: " + f.getSource() + "</td>"
                    	+ "<td>Destination: " + f.getDestination() + "</td>"
                    	+ "<td>Airline: " + f.getAirline()+ "</td>"
                    	+ "<td>Ticket price: " + f.getPrice()+ "</td>"
                    			+ "");        
                        out.println("</tr>");
                     }
                     out.println(" </table>");                     
                    session1.close();  
         } catch (Exception ex) {
                 throw ex;
         }
        }
        out.println("</div><div id=\"info-bar\"><div><span><a href=\"\">CopyRight 2021 </a></span></div></div></footer></body></html>");
	}

}
