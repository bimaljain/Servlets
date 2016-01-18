package com.example;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class TestInit2 extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException,ServletException
	{
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}
}