

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.HibernateUtil;
import com.flyaway.entity.admin;
import com.flyaway.entity.airline;
import com.flyaway.entity.flight;
import com.flyaway.entity.place;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchFlight
 */
public class SearchFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchFlight() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String destination=request.getParameter("Destination");
		String source=request.getParameter("Source");
		System.out.println(destination + ' ' + source);
		request.getRequestDispatcher("index.jsp").include(request, response);
		
		 try {
             SessionFactory factory = HibernateUtil.getSessionFactory();
             
             Session session1 = factory.openSession();
             Query query = session1.createQuery("from flight where destination = :destination and source = :source");
  
 			query.setParameter("destination",destination);
 			query.setParameter("source",source);
 			List<flight> list3   = query.list();
 			Collections.sort(list3);
 			
 			 out.println("<div class=\"container\">	Master list of airlines<br>");
 			if (list3.size()<1)
 			{
 				 out.println("No Result for this selection <br>");
 			}
 			
 			
             // List<flight> list3   = session1.createQuery("from flight").list();
            
 			 out.println("<table class=\"table table-bordered table-sm\">");
 	               
              for( flight f: list3) {
                 	 
             	 	out.println(" <tr>");
                 	out.println("<td>ID: " + String.valueOf( f.getIdflight()) 
                 	+ "</td><td>Souce: " + f.getSource() + "</td>"
                 	+ "<td>Destination: " + f.getDestination() + "</td>"
                 	+ "<td>Airline: " + f.getAirline()+ "</td>"
                 	+ "<td>Ticket price: " + f.getPrice()+ "</td>"
                 	+ "<td><a href = \"FlightRegister?id="+ String.valueOf( f.getIdflight()) +"\"> Select</a></td>"
                 			+ "");
                          //out.println("</br>");              
                     out.println("</tr>");
                  }
                  out.println(" </table></div>");                     
                 session1.close();
                     
                     
               
          
          
      } catch (Exception ex) {
              throw ex;
      }
	}

}
