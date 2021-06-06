package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.flyaway.entity.admin;
import com.HibernateUtil;


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
		
		 try {
             SessionFactory factory = HibernateUtil.getSessionFactory();
             
             Session session = factory.openSession();
             String matchid = "-";
             String matchpassword = "-xx-";
			
			response.setContentType("text/html");
			String emailID=request.getParameter("emailID");
			String password=request.getParameter("password");
	
		
			RequestDispatcher rd = null;
			Query query = session.createQuery("from admin where idadmin = :id ");
			query.setParameter("id",emailID);
			List<admin> list1 = query.list();
			

			for(admin p: list1) {
				matchid = String.valueOf(p.getIdadmin());
				matchpassword = String.valueOf(p.getPassword());
			}
			if(emailID.equalsIgnoreCase(matchid )&& password.equals(matchpassword)) {

				String email_ID = request.getParameter("emailID");
				HttpSession session1=request.getSession();  
				session1.setAttribute("userid",  email_ID );
				rd=request.getRequestDispatcher("DashBoardServlet");
				rd.forward(request,response);
			}else {
				rd=request.getRequestDispatcher("adminLogin.jsp");
				PrintWriter out=response.getWriter();
				rd.include(request, response);
				out.println("<center><span style='color:red'>Invalid username or password!</span></center>");
			}
			
	      
	      } catch (Exception ex) {
	              throw ex;
	      }
	}

}
