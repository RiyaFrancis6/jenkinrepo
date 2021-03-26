package serv.lti.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


 
public class Serv extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		out.write("<h1>Namaste India</h1>");
		out.write("<h2>"+LocalDateTime.now()+"</h2>");
		out.write("</body></html>");
		
		
	}

	
	}
