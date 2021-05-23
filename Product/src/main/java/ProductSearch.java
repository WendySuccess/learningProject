

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecommerce.DBConnection;

/**
 * Servlet implementation class ProductSearch
 */
public class ProductSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductSearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String ProductID=request.getParameter("ProductID");
		RequestDispatcher rd = null;
		rd=request.getRequestDispatcher("index.html");
		
        try {
            PrintWriter out = response.getWriter();
            rd.include(request, response);
           // out.println("<html><body>");
            
           InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
           Properties props = new Properties();
           props.load(in);
           
           DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
           Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
           ResultSet rst = stmt.executeQuery("select * from eproduct where ID = '" + ProductID + "'" );
           
        if(rst.next()) {
          
                   out.println("ID = "+ rst.getInt("ID") + "<br> " );
                   out.println("Name = "+ rst.getString("name") + "<Br>");
                   out.println("Price = "+ rst.getString("price") + "<Br>");
                   out.println("Date Added = "+ rst.getString("date_added") + "<Br>");
    
        }
        else
        	   out.println("<span style='color:red'>Invalid ID</span>");
       
           stmt.close();
           
           
           
         //  out.println("</body></html>");
           conn.closeConnection();
           
   } catch (ClassNotFoundException e) {
           e.printStackTrace();
   } catch (SQLException e) {
           e.printStackTrace();
   }
		
	}

}
