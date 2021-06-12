

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.HibernateUtil;
import com.flyaway.entity.flight;

/**
 * Servlet implementation class PaymentStatus
 */
public class PaymentStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentStatus() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
        PrintWriter out = response.getWriter();
        out.println("<html><head>\r\n"
        		+ "<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\r\n"
        		+ "</head><body>");
        out.println("<center><h1>Comfirm Flight Details</h1></center><div class=\"container\">	");
     
		   HttpSession session=request.getSession(false);  
		   String userId = null;
		   if (session.getAttribute("id") != null)
	            userId =(String)session.getAttribute("id");  
	        if (userId == null ) {
	            out.println("No Flight Selected. Please go to previous page<br>");
	        } else {
	        	 try {
	                 SessionFactory factory = HibernateUtil.getSessionFactory();
	                 
	                 Session session1 = factory.openSession();
	                  List<flight> list3   = session1.createQuery("from flight").list();
	                  out.println("<div class=\"container\">	Success Payment <br>");
	                  out.println("Below is your booked Flight Details <br>");
	     			 //out.println("<table class=\"table table-bordered table-sm\">");
	     	               
	                  for( flight f: list3) {
	                     	 
	                 	 	//out.println(" <tr>");
	                     	out.println("<div class=\\\"row\\\"><div class=\\\"col\\\">ID: " + String.valueOf( f.getIdflight()) + "</br></div></div>"
	                     	+ "<div class=\\\"row\\\"><div class=\\\"col\\\">Souce: " + f.getSource() + "</br></div></div>"
	                     	+ "<div class=\\\"row\\\"><div class=\\\"col\\\">Destination: " + f.getDestination() + "</br></div></div>"
	                     	+ "<div class=\\\"row\\\"><div class=\\\"col\\\">Airline: " + f.getAirline()+ "</br></div></div>"
	                     	+ "<div class=\\\"row\\\"><div class=\\\"col\\\">Ticket price: " + f.getPrice()+ "</br></div></div>"
	                     	//+ "<div class=\\\"row\\\"><div class=\\\"col\\\"><a href = \"FlightRegister?id="+ String.valueOf( f.getIdflight()) +"\"> Select</a></br></div></div>"
	                     			+ "");
	                              //out.println("</br>");              
	                       //  out.println("</tr>");
	                      }
	                     // out.println(" </table></div>");                     
	                     session1.close();
	                         
	                     out.println( "<div class=\\\"row\\\"><div class=\\\"col\\\"> Passenge Name = " + session.getAttribute("PassengerName")+ "</br></div></div>");
	                     out.println(  "<div class=\\\"row\\\"><div class=\\\"col\\\">Date of Birth =" + session.getAttribute("DateofBirth")+"</br></div></div>");
	                     out.println(  "<div class=\\\"row\\\"><div class=\\\"col\\\">Email =" + session.getAttribute("Email" )+"</br></div></div>");
	                     out.println(  "<div class=\\\"row\\\"><div class=\\\"col\\\">PhoneNumber =" + session.getAttribute("PhoneNumber")+"</br></div></div>"); 
	                   
	              
	              
	          } catch (Exception ex) {
	                  throw ex;
	          }
	}

	}}
