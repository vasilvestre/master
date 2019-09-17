package Server;

import Model.Adherent;
import Service.AdherentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Register extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        AdherentService adherentService = new AdherentService();
        Adherent adherent = new Adherent();
        adherent.setFirstName(request.getParameter("firstName"));
        adherent.setLastName(request.getParameter("lastName"));
        adherent.setDateBirth(request.getParameter("birthDate"));
        adherent.setEmail(request.getParameter("email"));

        adherentService.persist(adherent);

        out.println("Un adhérent à été crée !");
        out.println(adherent);

        out.println("<a href=/ >accueil</a>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
