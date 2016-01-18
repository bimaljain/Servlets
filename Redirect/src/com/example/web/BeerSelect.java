package com.example.web;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class BeerSelect extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws IOException,ServletException
	{
		// all 3 works independently
		//response.sendRedirect("http://localhost:8080/Redirect/result.jsp");
		response.sendRedirect("result.jsp");
		//response.sendRedirect("/result.jsp");
	}
}