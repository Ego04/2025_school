package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class StaffMenuServlet
 */
@WebServlet("/StaffMenuServlet")
public class StaffMenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffMenuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String staff = "reception";
		staff = "docter";
		
		
		session.setAttribute("staff", staff);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/staffMenu.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		String staff = "reception";
		staff = "docter";
		
		
		session.setAttribute("staff", staff);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/staffMenu.jsp");
		dispatcher.forward(request, response);
	}

}
