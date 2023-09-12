

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		HttpSession session=request.getSession(false);
		int a=(int)session.getAttribute("fstnum");
		int b=(int)session.getAttribute("secnum");
		int c=(int)session.getAttribute("addition");
		
		request.setAttribute("first", a);
		request.setAttribute("second", b);
		request.setAttribute("calculate", c);
		
		request.getRequestDispatcher("demo/second.jsp").forward(request, response);
		/*
		PrintWriter out=response.getWriter();
		out.println("<html><style>table{text-align:center;}</style><body>");
		out.println("<table border='1' width='300px' height='50px'><tr><td>");
		
		out.println("Addition of "+a+" + "+b+"</td><td width='60px' > = </td><td width='60px'> "+c+"</td></tr></table></body></html>");
			*/
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
