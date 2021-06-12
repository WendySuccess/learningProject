

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

import com.HibernateUtil;
import com.flyaway.entity.airline;
import com.flyaway.entity.flight;
import com.flyaway.entity.place;

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
        
        out.println("<html><head>\r\n"
        		+ "<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\r\n"
        		+ "</head><body>");
        out.println("<center><h1>Dashboard</h1></center><div class=\"container\">	");
        
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
                List<place> list = session1.createQuery("from place").list();
                out.println("Master list of Places for Source and Destination<br>");
   				out.println("<table class=\"table table-bordered table-sm\">");
               
                // out1.println("<html><body>");
                 for(place p: list) {
                	 
                	 out.println(" <tr>");
                     out.println("<td>ID: " + String.valueOf(p.getIdplace()) + "</td><td>Name: " + p.getPlacename() + "</td>");
                         //out.println("</br>");              
                     out.println("</tr>");
                 }
                 out.println(" </table>");
                 List<airline> list2   = session1.createQuery("from airline").list();
                 out.println("Master list of airlines<br>");
    			 out.println("<table class=\"table table-bordered table-sm\">");
    	               
                    // out1.println("<html><body>");
                 for(airline a: list2) {
                    	 
                	 	out.println(" <tr>");
                    	out.println("<td>ID: " + String.valueOf( a.getIdairline()) + "</td><td>Name: " + a.getAirlineName() + "</td>");
                             //out.println("</br>");              
                        out.println("</tr>");
                     }
                 out.println(" </table>");                 
                 List<flight> list3   = session1.createQuery("from flight").list();
                 out.println("Master list of airlines<br>");
    			 out.println("<table class=\"table table-bordered table-sm\">");
    	               
                    // out1.println("<html><body>");
                 for( flight f: list3) {
                    	 
                	 	out.println(" <tr>");
                    	out.println("<td>ID: " + String.valueOf( f.getIdflight()) 
                    	+ "</td><td>Souce: " + f.getSource() + "</td>"
                    	+ "<td>Destination: " + f.getDestination() + "</td>"
                    	+ "<td>Airline: " + f.getAirline()+ "</td>"
                    	+ "<td>Ticket price: " + f.getPrice()+ "</td>"
                
                    	//+ "<td><a href = \"FlightRegister?id="+ String.valueOf( f.getIdflight()) +"\"> Select</a></td>"
                    			+ "");
                             //out.println("</br>");              
                        out.println("</tr>");
                     }
                     out.println(" </table>");                     
                    session1.close();
                        
                        
                        
             //out1.println("</body></html>");
             
             
         } catch (Exception ex) {
                 throw ex;
         }
        }
        out.println("</div></body></html>");
	}

}
