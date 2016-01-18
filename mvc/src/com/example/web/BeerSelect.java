package com.example.web;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;

public class BeerSelect extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws IOException,ServletException
	{
		String c = request.getParameter("color");
		/**PrintWriter out=response.getWriter();
		out.println(c);**/
		BeerExpert be = new BeerExpert();
		String result = be.getBrands(c);

		request.setAttribute("styles", result);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}
}