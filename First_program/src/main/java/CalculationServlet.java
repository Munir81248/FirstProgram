

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		int a=Integer.parseInt(request.getParameter("n1"));
		int b=Integer.parseInt(request.getParameter("n2"));
		int add=a+b;
		int sub=a-b;
		int mul=a*b;
		double divv=(double)a/b;
		String c=request.getParameter("sel1");
		String result="";
		switch(c)
		{
			case "+":
				result=String.valueOf(add);
				break;
			case "-":
				result=String.valueOf(sub);
				break;
			case "*":
				result=String.valueOf(mul);
				break;
			case "/":
				result=String.valueOf(divv);
				break;
		}
		request.setAttribute("Num1", a);
		request.setAttribute("Num2", b);
		request.setAttribute("Char", c);
		request.setAttribute("result", result);
		request.getRequestDispatcher("demo/calculate.jsp").forward(request, response);
	}

}
