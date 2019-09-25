package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Second extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Second Servelet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>Dyanamic Second Servelet Programming.</h3>");
		out.println("<br><a href='hello'>First Servelet</a>");
		out.println("</body>");
		out.println("</html>");
		
	}
}