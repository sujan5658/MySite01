package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Third extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Third Servelet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>Dyanamic Third Servelet Programming.</h3>");
		int value1=Integer.parseInt(request.getParameter("num1"));
		int value2=Integer.parseInt(request.getParameter("num2"));
		int sum = value1+value2;
		out.println("<p>Value 1 = "+value1+"</p>");
		out.println("<p>Value 1 = "+value2+"</p>");
		out.println("<p>Sum = "+sum+"</p>");
		out.println("<br><a href='index.jsp'>First Servelet</a>");
		out.println("</body>");
		out.println("</html>");
		
	}
}