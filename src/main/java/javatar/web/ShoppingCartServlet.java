package javatar.web;

import javatar.model.*;
import javatar.service.CRUDService;
import javatar.service.CreateAllegroLink;
import javatar.service.FormDataTableService;
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
import java.time.LocalDateTime;
import java.util.List;

@WebServlet(urlPatterns = "/AddingToCart")
public class ShoppingCartServlet extends HttpServlet {

    private static final Logger LOGGER = LogManager.getLogger();

    @Inject
    FormData formData;

    @Inject
    SessionData sessionData;

    @EJB
    CRUDService crudService;


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        req.setAttribute("partName", formData.getPartName());
        req.setAttribute("partBrand", formData.getPartBrand());
        req.setAttribute("partId", formData.getPartId());
        req.setAttribute("allegroLink", formData.getAllegroLink());

        crudService.sendResults(formData,
                sessionData.getUserData());

        RequestDispatcher dispatcher = req.getRequestDispatcher("AllegroCategoryForm.jsp");
        dispatcher.forward(req, resp);
    }

}
