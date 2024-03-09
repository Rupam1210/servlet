package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Thirdprogram extends HttpServlet{
	protected void doGet (HttpServletRequest requ, HttpServletResponse res)
            throws ServletException, IOException{
		System.out.println("http servlet ");
	}
	 
}
