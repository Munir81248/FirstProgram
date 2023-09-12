

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/First")
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		try
		{
			int a=Integer.parseInt(request.getParameter("num1"));
			int b=Integer.parseInt(request.getParameter("num2"));
			int c=a+b;
			

			HttpSession session=request.getSession();
			session.setAttribute("fstnum", a);
			session.setAttribute("secnum", b);
			session.setAttribute("addition", c);
		
			response.sendRedirect("SecondServlet");
		}
		catch(Exception e) {
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

}
