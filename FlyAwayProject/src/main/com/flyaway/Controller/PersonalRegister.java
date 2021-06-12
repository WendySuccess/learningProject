package com.flyaway.Controller;

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
import org.hibernate.query.Query;

import com.flyaway.util.HibernateUtil;
import com.flyaway.entity.Flight;

/**
 * Servlet implementation class PersonalRegister
 */
public class PersonalRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonalRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        PrintWriter out = response.getWriter();
        out.println("<html><head> <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\"> " 
        		+ "</head><body><style>header {width: 100%;height: 110px;background-color: #0683c9;}header nav {display: block;float: none;height: 30px;text-align: right; margin: 0 auto; }header nav a {color: white; } header nav a:hover {color: white; }#info-bar {background-color: #3cb5f9;   position:fixed; bottom:0; width: 100%; }</style>");
        out.println( "   <header> <div class=\"container clearfix\"> <h1 id=\"logo\">FlyAway !</h1> <h5>Your Airline Booking Portal</h5><nav> <a href=\"adminLogin.jsp\">Admin Login</a> </nav>    </div></header></center><div class=\"container\">	");
       
        out.println("<center><h1>Comfirm Flight Details</h1></center>	");
        
        HttpSession session=request.getSession(false);  
        String PassengerName=request.getParameter("PassengerName");
        String DateofBirth=request.getParameter("DateofBirth");
        String Email=request.getParameter("Email");
        String PhoneNumber=request.getParameter("PhoneNumber");
        
        session.setAttribute("PassengerName",  PassengerName);
        session.setAttribute("DateofBirth",  DateofBirth);
        session.setAttribute("Email",  Email);
        session.setAttribute("PhoneNumber",  PhoneNumber);
        
        String userId = null;
        if (session.getAttribute("id") != null)
            userId =(String)session.getAttribute("id");  
        if (userId == null ) {
            out.println("No Flight Selected. Please go to previous page<br>");
        } else {
        	 try {
                 SessionFactory factory = HibernateUtil.getSessionFactory();
                 Session session1 = factory.openSession();
                 
                 Query query = session1.createQuery("from Flight where idFlight = :id");
      
     			query.setParameter("id",userId);
     			List<Flight> list3   = query.list();
//                 Session session1 = factory.openSession();
//                  List<Flight> list3   = session1.createQuery("from Flight").list();
//                  out.println("	Flight details of the flight you booking<br>");
     	
     	               
                  for( Flight f: list3) {
                     	 
     
                     	out.println("	<div class=\"row\"><div class=\"col\">ID: " + String.valueOf( f.getIdflight()) + "</br></div></div>"
                     	+ "<div class=\\\"row\\\"><div class=\\\"col\\\">Source: " + f.getSource() + "</br></div></div>"
                     	+ "<div class=\\\"row\\\"><div class=\\\"col\\\">Destination: " + f.getDestination() + "</br></div></div>"
                     	+ "<div class=\\\"row\\\"><div class=\\\"col\\\">Airline: " + f.getAirline()+ "</br></div></div>"
                     	+ "<div class=\\\"row\\\"><div class=\\\"col\\\">Ticket price: " + f.getPrice()+ "</br></div></div>"
                     	+ "<div class=\\\"row\\\"><div class=\\\"col\\\"><a href = \"payment.jsp\"> Continue to Payment</a></div></div>"
                     			+ "");
                      }
              
                     session1.close();
                         
                         
                   
              
              
          } catch (Exception ex) {
                  throw ex;
          }
        }

        out.println("</div><div id=\"info-bar\"><div><span><a href=\"\">CopyRight 2021 </a></span></div></div></footer></body></html>");
	}

}
