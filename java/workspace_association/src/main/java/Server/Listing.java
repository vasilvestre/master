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

@WebServlet("/listing")
public class Listing extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        AdherentService adherentService = new AdherentService();
        for (Adherent adherent : adherentService.findAllOrderBy("dateSubscription", request.getParameter("orderBy"))) {
            out.println(adherent +
                    "<a href=/adherent?id="+ adherent.getId() +">Modify</a> <br>" +
                    "<a href=/remove?id="+ adherent.getId() +">Remove</a> <br>");
        }
        String form = "<form method=post >" +
                "<input type=text list=orderBy name=orderBy>\n" +
                "<datalist id=orderBy >\n" +
                "   <option> ASC\n" +
                "   <option> DESC\n" +
                "</datalist>" +
                "<button type=submit>Submit</button>" +
                "</form>";
        out.println(form);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        AdherentService adherentService = new AdherentService();
        for (Adherent adherent : adherentService.findAll()) {
            out.println(adherent +
                    "<a href=/adherent?id="+ adherent.getId() +">Modify</a> <br>" +
                    "<a href=/remove?id="+ adherent.getId() +">Remove</a> <br>");
        }
        String form = "<form method=post >" +
                "<input type=text list=orderBy name=orderBy>\n" +
                "<datalist id=orderBy >\n" +
                "   <option> ASC\n" +
                "   <option> DESC\n" +
                "</datalist>" +
                "<button type=submit>Submit</button>" +
                "</form>";
        out.println(form);
    }
}
