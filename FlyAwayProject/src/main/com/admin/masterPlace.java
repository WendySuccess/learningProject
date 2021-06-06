package com.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.HibernateUtil;
import com.flyaway.entity.admin;
import com.flyaway.entity.place;

/**
 * Servlet implementation class masterPlace
 */
public class masterPlace extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public masterPlace() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 try {
             SessionFactory factory = HibernateUtil.getSessionFactory();
             
             Session session = factory.openSession();
            
			List<place> list = session.createQuery("from place").list();
             
              PrintWriter out = response.getWriter();
              out.println("<html><body>");
              for(place p: list) {
                      out.println("ID: " + String.valueOf(p.getIdplace()) + ", Name: " + p.getPlacename() );
                                     
                      out.println("<hr>");
              }
              
                     session.close();

          out.println("</body></html>");
          
          
      } catch (Exception ex) {
              throw ex;
      }
	}

}
