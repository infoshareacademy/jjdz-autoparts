package javatar.web;

import javatar.service.BrandsJsonCache;
import javatar.service.FindingCarInJsonService;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/BrandsOut")
public class BrandsChoosingOutputServlet extends HttpServlet {

    @EJB
    FindingCarInJsonService service;

    @EJB
    BrandsJsonCache cache;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String brandOut = req.getParameter("brand");
        req.setAttribute("brandOut", brandOut);

        RequestDispatcher dispatcher = req.getRequestDispatcher("autoBranchChoosingOutputForm.jsp");
        dispatcher.forward(req, resp);
    }
}
