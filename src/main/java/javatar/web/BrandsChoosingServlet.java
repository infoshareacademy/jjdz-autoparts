package javatar.web;

import javatar.service.FindingCarInJsonService;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Brands")
public class BrandsChoosingServlet extends HttpServlet {

    @EJB
    FindingCarInJsonService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String optionString = req.getParameter("your_option");

        Integer option = 0;
        if (optionString != null && optionString.matches("[0-9]*")) {
            option = Integer.valueOf(optionString);
        }


        req.setAttribute("option", option);

        RequestDispatcher dispatcher = req.getRequestDispatcher("autoBranchChoosingForm.jsp");
        dispatcher.forward(req, resp);
    }
}
