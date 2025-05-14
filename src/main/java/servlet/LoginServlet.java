package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/login.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextForward = "WEB-INF/jsp/login.jsp";
		try {
			
			request.setCharacterEncoding("UTF-8");
			String sId = request.getParameter("ID");
			String sPassword = request.getParameter("password");
			
			HttpSession session = request.getSession();
			session.setAttribute("ID", sId);
			session.setAttribute("password", sPassword);
			
			
			if(sId.length() !=0 && sPassword.length() != 0) {
				nextForward = "WEB-INF/jsp/login.jsp";
				
			}
			
			
			
			
		}
		finally {
			RequestDispatcher dispatcher = request.getRequestDispatcher(nextForward);
			dispatcher.forward(request, response);
		}
		PrintWriter out = response.getWriter();
		out.println();
	}

}
