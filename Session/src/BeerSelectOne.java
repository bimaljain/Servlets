import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class BeerSelectOne extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws IOException,ServletException
	{
		HttpSession session = request.getSession();
		String i1 = request.getParameter("color");
		session.setAttribute("i1", i1);
		RequestDispatcher view = request.getRequestDispatcher("Form2.html");
		view.forward(request, response);
	}
}