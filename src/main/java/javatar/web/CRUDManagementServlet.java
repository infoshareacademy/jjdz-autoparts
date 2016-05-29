package javatar.web;


import javatar.model.*;
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

        List<CRUD> crudValuesFromDB = crudService.getCRUDValuesFromDB();

        System.out.println("Servlet -- > udValuesFromDB.toString() = " + crudValuesFromDB.toString());
//
//        List<CRUDwithDuplicatedFlag> cruDwithDuplicatedFlags =crudService.getListWithFlags();
//        System.out.println("Servlet --> cruDwithDuplicatedFlags.toString()" + cruDwithDuplicatedFlags.toString());
//
//        req.setAttribute("crudFlagList",cruDwithDuplicatedFlags);

//        List<CarInCRUD> carsInCRUDs = crudService.selectCarsFromCrud();
//        req.setAttribute("car",carsInCRUDs);
//
//        List<PartInCRUD> partinCRUDs = crudService.selectPartsForCar(carsInCRUDs.get(0));
//        req.setAttribute("parts",partinCRUDs);


        RequestDispatcher dispatcher = req.getRequestDispatcher("Cart.jsp");
        dispatcher.forward(req, resp);
    }



}
