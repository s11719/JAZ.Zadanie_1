

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       public MyServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//response.getWriter().println("Hello world");
		//response.sendRedirect("test.jsp");
		
		String name = request.getParameter("name");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if(name != null && !name.equals(""))
		{
			session.setAttribute("name", name);
			context.setAttribute("name", name);
		}
		
		response.getWriter().println("Hello " + name + "!");
		response.getWriter().println("Hello from session " + session.getAttribute("name") + "!");
		response.getWriter().println("Hello from session " + context.getAttribute("name") + "!");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
