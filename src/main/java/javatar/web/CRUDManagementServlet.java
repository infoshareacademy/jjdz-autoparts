package javatar.web;


import javatar.model.*;
import javatar.model.CRUD.CarInCRUD;
import javatar.model.CRUD.ListCarsParts;
import javatar.model.CRUD.SinglePartToRemove;
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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/CRUD")
public class CRUDManagementServlet extends HttpServlet {
    private static final Logger LOGGER = LogManager.getLogger();

    @Inject
    FormData formData;

    @EJB
    CRUDService crudService;

    @Inject
    SessionData sessionData;

    @Inject
    ListCarsParts listCarsParts;

    @Inject
    SinglePartToRemove singlePartToRemove;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("CRUD servlet is running");
        req.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();

//        String listId = req.getParameter("listId");
//        crudService.removeCRUDValuesFormDB(Long.parseLong(listId));

//        System.out.println("Samochód i część z JSP = " + listCarsParts.getPartsInCRUD().toString());


        List<CarInCRUD> cars = crudService.returnCarsDisctinct();
        System.out.println("cars before crudService = " + cars.toString());
        String user = sessionData.getUserData();
        List<ListCarsParts> listCarsParts = crudService.getCarsWithPart(cars, user);
        session.setAttribute("crudViewList", listCarsParts);

        req.setAttribute("cars", cars);

        Object singlePartToRemove = session.getAttribute("singlePartToRemove");
        System.out.println("singlePartToRemove.toString() = " + singlePartToRemove.toString());
//        String singlePartToRemoveId = req.getParameter("singlePartToRemoveId");
//        singlePartToRemove = (SinglePartToRemove) req.getSession().getAttribute(singlePartToRemoveId);
////        req.getSession().removeAttribute("singlePartToRemove");
////        req.getSession().setAttribute("singlePartToRemove", singlePartToRemove);
////        req.setAttribute("singlePartToRemove", singlePartToRemove);
//
//        System.out.println("singlePartToRemoveId = " + singlePartToRemoveId);
//        System.out.println("singlePartToRemove = " + singlePartToRemove);

        RequestDispatcher dispatcher = req.getRequestDispatcher("Cart_backup.jsp");
        dispatcher.forward(req, resp);


    }
}
