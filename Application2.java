
import java.io.*;
import java.io.IOException;
import java.sql.*;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 class Application2 extends HttpServlet{
	//Connection con=null;
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("<h1> Init Parameters Names are:");
		Enumeration enumaration=getServletContext().getInitParameterNames();
		while(enumaration.hasMoreElements()){
			out.print(enumaration.nextElement()+" ");
		}
		ServletContext con1=getServletContext();
		out.println("<h1>Company:"+con1.getInitParameter("company"));
		out.println("venue:"+con1.getInitParameter("venue"));
		out.println("training:"+con1.getInitParameter("training"));
		
		out.println("<h1>Company:"+getServletContext().getInitParameter("company"));
		out.println("venue:"+getServletContext().getInitParameter("venue"));
		out.println("Training:"+getServletContext().getInitParameter("training"));
		try {
			String url=getServletContext().getInitParameter("url");
			String usr=getServletContext().getInitParameter("user");
			String pass=getServletContext().getInitParameter("password");
			
			Class.forName(getServletContext().getInitParameter("driver"));
			Connection con=DriverManager.getConnection("url","usr","pass");
			System.out.println("connecting");
		}
		catch(ClassNotFoundException | SQLException cf) {
			System.out.println(cf);
		}
			
			
		}
	} 