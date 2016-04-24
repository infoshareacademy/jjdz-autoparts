package javatar.web;

import javatar.components.ResultComponent;
import javatar.model.ResultDatabaseModel;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/DatabaseUpdate")
public class DatabaseUpdateServlet extends HttpServlet {

    @EJB
    ResultComponent component;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String partName = req.getParameter("partName");
        String partBrand = req.getParameter("partBrand");
        String partId = req.getParameter("partId");
        String allegroPath = req.getParameter("allegroPath");
        String allegroSearchText = req.getParameter("allegroSearchText");

        ResultDatabaseModel model = component.sendResults(partName,partBrand,partId,allegroPath,allegroSearchText);

        req.setAttribute("model", model);

        RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");
        dispatcher.forward(req,resp);
    }
}
