package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SunMSServlet
 */
@WebServlet("/sunms")
public class SunMSServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		
//		PrintWriter out = response.getWriter();
//		
//		out.println("<html><head><title>Redirection Servlet</title></head>");
//		out.println("<body>");
//		out.println("<h1>To get the services of java, click on the below link.</h1>");
//		out.println("<a href='http://localhost:8080/OracleApp/index.html'>Oracle DOCS </a>");
//		out.println("</body>");
//		out.println("</html>");
//		
//		out.close();
		
		String location ="http://localhost:8080/OracleApp/index.html";
		response.sendRedirect(location);
	}

}
