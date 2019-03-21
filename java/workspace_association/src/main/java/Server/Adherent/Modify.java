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

@WebServlet("/adherent")
public class Modify extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        AdherentService adherentService = new AdherentService();
        Adherent adherent = adherentService.findById(Integer.valueOf(request.getParameter("id")));
        adherent.setFirstName(request.getParameter("firstName"));
        adherent.setLastName(request.getParameter("lastName"));
        adherent.setDateBirth(request.getParameter("birthDate"));
        adherent.setEmail(request.getParameter("email"));

        adherentService.persist(adherent);
        out.println(adherent);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        AdherentService adherentService = new AdherentService();
        Adherent adherent = adherentService.findById(Integer.valueOf(request.getParameter("id")));
        out.println(adherent);

        String form = "<form method=post>" +
                "<label>\n" +
                "Firstname :\n" +
                "<input type=text name=firstName  value="+ adherent.getFirstName() + ">\n" +
                "Lastname :\n" +
                "<input type=text name=lastName value="+ adherent.getLastName() + ">\n" +
                "Birth date :\n" +
                "<input type=date name=birthDate value="+ adherent.getDateBirth() + ">\n" +
                "Email :\n" +
                "<input type=email name=email value="+ adherent.getEmail() + ">\n" +
                "</label>\n" +
                "<button type=submit >Send</button>" +
                "</form>";
        out.println(form);
    }
}
