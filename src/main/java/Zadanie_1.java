

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Zadanie_1")
public class Zadanie_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   public Zadanie_1() {
        super();
    }
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		
		if (session.getAttribute("state") != null){
			response.sendRedirect("Registered.jsp");
		}
		
		String state = "registered";
		session.setAttribute("state", state);
		
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		
		response.getWriter().println("Hello " + name + " " + surname + "!");
	
	}

}
