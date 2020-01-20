package servlets;

import api.EmployeesApi;
import model.beans.Employees;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;

/**
 * Servlet implementation class UsersServlet
 */
public class UsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LinkedList<Employees> users = new EmployeesApi().getAll();
		request.setAttribute("users",users);
		this.getServletContext().getRequestDispatcher("/WEB-INF/app_views/Users.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	@Override
	protected long getLastModified(HttpServletRequest req) {
				return super.getLastModified(req);
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPut(req, resp);
		String id = req.getParameter("id");
		new EmployeesApi().getById(Integer.parseInt(id));
		doGet(req,resp);


	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		new EmployeesApi().deleteById(Integer.parseInt(id));

		super.doDelete(req, resp);


	}
}
