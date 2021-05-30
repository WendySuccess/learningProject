

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecommerce.AddProduct;

/**
 * Servlet implementation class AddProductServlet
 */
@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = (String) request.getAttribute("name") ;
		double price = 0;
		BigDecimal bd = null;
		if(request.getAttribute("price")!= null && request.getAttribute("price")!= "") {
		   price= Double.valueOf((String) request.getAttribute("price") );
		    bd = new BigDecimal(price).setScale(2, RoundingMode.HALF_UP);
		}
		
	        Date dateAdded= new Date();
	        String hdd= (String) request.getAttribute("hdd") ;
	        String cpu= (String) request.getAttribute("cpu") ;
	        String ram= (String) request.getAttribute("ram") ;
	        
	   
	        AddProduct obj = new AddProduct();
	        String Result = obj.result(name, bd, hdd, cpu, ram);
	        PrintWriter out = response.getWriter();
			request.getRequestDispatcher("index.jsp").include(request, response);
			out.println("<span style='color:red'>" + Result+"</span>");
			
		
	}

}
