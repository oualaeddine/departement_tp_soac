package servlets;

import api.StudentsApi;
import model.beans.Students;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Servlet implementation class InscriptionsServlet
 */
@WebServlet("/inscription")
public class InscriptionsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscriptionsServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/app_views/Inscriptions.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String date_naiss = request.getParameter("date_naiss");
        String sexe = request.getParameter("sexe");
        String num_bac = request.getParameter("num_bac");
        Students s = new Students();
        s.setNom(nom);
        s.setPrenom(prenom);
        s.setDateNaiss(new Date(date_naiss));
        s.setSexe(sexe);
        s.setNumBac(num_bac);
        s.setDateInsc(new Date());
        StudentsApi api = new StudentsApi();

        api.add(s);

        doGet(request, response);
    }
}
