

import java.io.IOException;

import javax.servlet.ServletContext;
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
		
		ServletContext context = request.getServletContext();
		Integer counter = (Integer)context.getAttribute("counter");
		counter = counter != null ? counter : 0;
		
		int maxParticipants = 5;
		
		if (counter == maxParticipants)
		{
			response.sendRedirect("LimitReached.jsp");
		}
		else
		{
		
			HttpSession session = request.getSession();
					
			if (session.getAttribute("state") != null)
			{
				response.sendRedirect("AlreadyRegistered.jsp");
			}
			else
			{
				String state = "registered";
				session.setAttribute("state", state);
						
				String name = request.getParameter("name");
				String surname = request.getParameter("surname");
				String email = request.getParameter("email");	
				String company = request.getParameter("company");
				String origin = request.getParameter("origin");
				String position = request.getParameter("postion");
				
				Participant participant = new Participant(name, surname, email, company, origin, position);
								
				counter++;
				context.setAttribute("counter", counter);
				
				response.sendRedirect("Registered.jsp");
			}
		}
	}

}
