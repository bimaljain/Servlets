package com.example;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class TestInit1 extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException,ServletException
	{
		PrintWriter out = response.getWriter();
		out.println("Test Init Parameters");
		out.println("Email ID from Config: " + getServletConfig().getInitParameter("adminEmail1"));
		out.println("Email ID from context " + getServletContext().getInitParameter("adminEmail2"));
	}
}