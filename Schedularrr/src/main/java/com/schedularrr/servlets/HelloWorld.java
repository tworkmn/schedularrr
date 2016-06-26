package com.schedularrr.servlets;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/hello-world")
public class HelloWorld extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
    
    throws ServletException, IOException {
    	PrintWriter out = response.getWriter();
    	out.println("Hello World");
	}
}