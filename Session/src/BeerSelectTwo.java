import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class BeerSelectTwo extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws IOException,ServletException
	{
		HttpSession session = request.getSession();
		String i2 = request.getParameter("Range");
		session.setAttribute("i2", i2);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}
}