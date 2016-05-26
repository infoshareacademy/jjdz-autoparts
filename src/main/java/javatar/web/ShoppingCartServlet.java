package javatar.web;

import javatar.model.*;
import javatar.service.CreateAllegroLink;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/Cart")
public class ShoppingCartServlet extends HttpServlet {

    private static final Logger LOGGER = LogManager.getLogger();

    @Inject
    FormData formData;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        req.setAttribute("partName", formData.getPartName());
        req.setAttribute("partBrand", formData.getPartBrand());
        req.setAttribute("partId", formData.getPartId());
        req.setAttribute("allegroLink", formData.getAllegroLink());

        RequestDispatcher dispatcher = req.getRequestDispatcher("AllegroCategoryForm.jsp");
        dispatcher.forward(req, resp);
    }
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        RequestDispatcher dispatcher = req.getRequestDispatcher("Cart.jsp");
//        dispatcher.forward(req, resp);
//    }
}
