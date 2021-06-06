

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.*;
import javax.xml.bind.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.flyaway.entity.*;
import com.HibernateUtil;

/**
 * Servlet implementation class admindetails
 */

@WebServlet("/admindetails")
public class admindetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public admindetails() {
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
            
			List<admin> list = session.createQuery("from admin").list();
             
              PrintWriter out = response.getWriter();
              out.println("<html><body>");
              
              out.println("<b>Component Mapping</b><br>");
              for(admin p: list) {
                      out.println("ID: " + String.valueOf(p.getIdadmin()) + ", Name: " + p.getPassword() );
                                     
                      out.println("<hr>");
              }
              
                     session.close();

          out.println("</body></html>");
          
          
      } catch (Exception ex) {
              throw ex;
      }
         
	}

}
