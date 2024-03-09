package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class first extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=req.getParameter("em");
		String pass=req.getParameter("pass");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		RequestDispatcher rd;
		if("demo@gmail.com".equals(email)&& "1234".equals(pass)) {
			rd=req.getRequestDispatcher("/second");
			rd.forward(req, resp);
		}else {
			out.println("<h2>Invalid</h4>");
			rd=req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
		}

}
