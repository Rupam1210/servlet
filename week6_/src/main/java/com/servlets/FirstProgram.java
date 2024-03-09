package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstProgram implements Servlet {
	ServletConfig con;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return con;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "first program";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init call");
		con=config;
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service call 2" );
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        
       out.println("Today is "+new Date().toString());
       
        
       out.print("<html>");
       out.print("<body>");
       out.print("<h2> Servlet interface Example</h2>");
       out.print("<p>Welcome to Edureka YouTube Channel</p>");
       out.print("</body>");
       out.print("</html>");
       out.println(getServletInfo());
       out.println(getServletConfig());

		
	}

}
