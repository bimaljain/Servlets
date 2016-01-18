package com;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class BeerSelect extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException,ServletException
	{
		PrintWriter out=response.getWriter();
		if( request.isUserInRole("manager")){out.println("I am assigned manager role");}
		if( request.isUserInRole("admin")){out.println("I am assigned admin role");}
		if( request.isUserInRole("guest")){out.println("I am assigned guest role");}
		if( request.isUserInRole("xyz")){out.println("I am assigned xyz role");}
	}
}