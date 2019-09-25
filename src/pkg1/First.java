package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class First extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>First Servelet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>Dyanamic Servelet Programming.</h3>");
		out.println("<br><a href='welcome'>First Servelet</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
