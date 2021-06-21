package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import accountManagement.Account;

/**
 * Servlet implementation class SimpleServelet
 */
@WebServlet("/SimpleServelet")
public class SimpleServelet extends HttpServlet {
	
	Account model = new Account();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = request.getParameter("username");
		String password = request.getParameter("pswd");
		String email = request.getParameter("emal");
		String id = request.getParameter("auid");
		String name = request.getParameter("nam");
		String phone = request.getParameter("pho");
		int type = Integer.parseInt(request.getParameter("ty"));
		
			model.insert(user, password, name, type, email, id, phone);
			RequestDispatcher req = request.getRequestDispatcher("welcome.jsp");
			req.include(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				String user = request.getParameter("username");
				String password = request.getParameter("pswd");
				
				if(model.validateUser(user, password) ) {
					//response.sendRedirect("success.html");
					RequestDispatcher req = request.getRequestDispatcher("success.jsp");
					req.include(request, response);
				} else {
					response.sendRedirect("error.html");
				}
	}
}
