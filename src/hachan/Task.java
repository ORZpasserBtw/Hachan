package hachan;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Task
 */
@WebServlet("/Task")
public class Task extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Task() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(request.getParameter("liff.state"));
		if (request.getParameter("liff.state").equals("/Account")) {
			response.sendRedirect("/account.jsp");
		}
		if (request.getParameter("liff.state").equals("/Travel")) {
			response.sendRedirect("/travel.html");
		}
		if (request.getParameter("liff.state").equals("/Manager")) {
			response.sendRedirect("/manager.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(request.getParameter("liff.state"));
		if (request.getParameter("liff.state").equals("/Account")) {
			response.sendRedirect("/account.jsp");
		}
		if (request.getParameter("liff.state").equals("/Travel")) {
			response.sendRedirect("/travel.html");
		}
		if (request.getParameter("liff.state").equals("/Manager")) {
			response.sendRedirect("/manager.jsp");
		}
	}

}
