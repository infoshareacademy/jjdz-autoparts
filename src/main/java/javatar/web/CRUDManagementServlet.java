package javatar.web;


import javatar.model.CRUD;
import javatar.model.CRUDwithDuplicatedFlag;
import javatar.model.FormData;
import javatar.service.CRUDService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

    @Inject
    CRUDService crudService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        String listId = req.getParameter("listId");
        crudService.removeCRUDValuesFormDB(Long.parseLong(listId));

        List<CRUD> crudValuesFromDB = crudService.getCRUDValuesFromDB();

        List<CRUDwithDuplicatedFlag> cruDwithDuplicatedFlags =crudService.getListWithFlags();


        System.out.println("cruDwithDuplicatedFlags.toString()" + cruDwithDuplicatedFlags.toString());
        req.setAttribute("crudFlagList",cruDwithDuplicatedFlags);

//        List<CarInCRUD> carsInCRUDs = crudService.selectCarsFromCrud();
//        req.setAttribute("car",carsInCRUDs);
//
//        List<PartInCRUD> partinCRUDs = crudService.selectPartsForCar(carsInCRUDs.get(0));
//        req.setAttribute("parts",partinCRUDs);


        RequestDispatcher dispatcher = req.getRequestDispatcher("Cart.jsp");
        dispatcher.forward(req, resp);
    }



}
