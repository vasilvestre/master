package Server.Adherent;

import Model.Adherent;
import Service.AdherentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/remove")
public class Remove extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        AdherentService adherentService = new AdherentService();
        adherentService.delete(Integer.valueOf(request.getParameter("id")));

        out.println("adherent a l'id " + request.getParameter("id") + " supprimé");
        out.println("<a href=/listing>Listing</a>");
    }
}
