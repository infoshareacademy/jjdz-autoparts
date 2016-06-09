package javatar.web;


import javatar.model.*;
import javatar.model.CRUD.CarInCRUD;
import javatar.model.CRUD.ListCarsParts;
import javatar.service.CRUDService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/CRUD")
public class CRUDManagementServlet extends HttpServlet {
    private static final Logger LOGGER = LogManager.getLogger();

    @Inject
    FormData formData;

    @EJB
    CRUDService crudService;



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("CRUD servlet is running");
        req.setCharacterEncoding("UTF-8");

        String listId = req.getParameter("listId");
        crudService.removeCRUDValuesFormDB(Long.parseLong(listId));

        List<CarInCRUD> cars = crudService.returnCarsDisctinct();
        List<ListCarsParts> carsWithPart = crudService.getCarsWithPart(cars);

        req.setAttribute("crudViewList", carsWithPart);
        req.setAttribute("cars", cars);

        RequestDispatcher dispatcher = req.getRequestDispatcher("Cart_backup.jsp");
        dispatcher.forward(req, resp);
    }



}
