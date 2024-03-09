package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/first")
public class first extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String token=req.getParameter("name");
		PrintWriter out=resp.getWriter();
		
		Cookie ck=new Cookie("token",token);
		resp.addCookie(ck);
		
		
		resp.setContentType("text/html");
		out.print("<h1> Welcome to servlet 1 , name = "+token+ " </h1>");
		out.print("<a href='second'> Go to servlet 2  </a>");
	}

}
