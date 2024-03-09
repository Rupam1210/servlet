 
package com.parameter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/second")
public class second extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 int a=Integer.parseInt(req.getParameter("a"));
		 int b=Integer.parseInt(req.getParameter("b"));
		 int sum=(int)req.getAttribute("s");
		 int mul=a*b;
		 resp.setContentType("text/html");
		 PrintWriter out=resp.getWriter();
		 out.print("<h1>Sum = "+sum+" </h1>");
		 out.print("<h1>Multiply = "+mul+" </h1>");
;	}

}
