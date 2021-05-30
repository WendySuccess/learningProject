

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class AddProductFilter
 */
@WebFilter(servletNames = { "AddProductServlet" })
public class AddProductFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AddProductFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String name = (String) request.getParameter("name") ;
		 String price=  request.getParameter("price") ;
	        String hdd= (String) request.getParameter("hdd") ;
	        String cpu= (String) request.getParameter("cpu") ;
	        String ram= (String) request.getParameter("ram") ;
	        
	    	if(name== null || price== null  || hdd== null  || cpu== null|| ram== null
	    			|| name == "" || price== ""  || hdd== ""  || cpu== "" || ram== "" ) {
				PrintWriter out = response.getWriter();
				request.getRequestDispatcher("index.jsp").include(request, response);
				out.println("<span style='color:red'>Please complete the form before submit</span>");
			}else
			{
				request.setAttribute("name", name);
				request.setAttribute("price", price);
				request.setAttribute("hdd", hdd);
				request.setAttribute("cpu", cpu);
				request.setAttribute("ram", ram);
				chain.doFilter(request, response);
				System.out.println("Bye from Filter");
			}	 
	        
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
