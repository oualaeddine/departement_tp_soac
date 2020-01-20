package servlets;

import model.beans.Students;
import api.StudensApi;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;

/**
 * Servlet implementation class ReinscriptionsServlet
 */
public class ReinscriptionsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReinscriptionsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
		LinkedList<Students> students=new StudensApi().getAll();
		request.setAttribute("students",students);
		this.getServletContext().getRequestDispatcher("/WEB-INF/app_views/Students.jsp").forward(request, response);
    }


    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        switch (request.getParameter("action")) {
            case "add": {
                doGet(request, response);
                break;
            }
            case "edit": {
                doGet(request, response);
                break;
            }
            case "delete": {
                doGet(request, response);
                break;
            }
        doGet(request, response);
    }

}
}