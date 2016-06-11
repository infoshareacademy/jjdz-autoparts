package javatar.web;


import javatar.model.CRUD.CarInCRUD;
import javatar.model.CRUD.ListCarsParts;
import javatar.model.CRUD.PartInCRUD;
import javatar.model.FormData;
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

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("CRUD servlet is running");
        req.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();

        String remove = req.getParameter("remove");
        System.out.println("remove = " + remove);
        String[] split = remove.split(";;");
        String entireCar = split[0];
        String entirePart = split[1];

        String[] carSplitted = entireCar.split(";");
        String[] partSplitted = entirePart.split(";");

        CarInCRUD car = new CarInCRUD();
        PartInCRUD part = new PartInCRUD();
        car.setCarBrand(carSplitted[0]);
        car.setCarEngine(carSplitted[2]);
        car.setCarModel(carSplitted[1]);
        car.setEngineLink(carSplitted[4]);
        part.setPartBrand(partSplitted[0]);
        part.setPartId(partSplitted[2]);
        part.setPartName(partSplitted[1]);
        part.setRecordCount(0);


//        CarInCRUD car = new CarInCRUD();
//        PartInCRUD part = new PartInCRUD();
//        car.setCarBrand(req.getParameter("carBrand"));
//        car.setCarEngine(req.getParameter("carEngine"));
//        car.setCarModel(req.getParameter("carModel"));
//        car.setEngineLink(req.getParameter("engineLink"));
//        part.setPartBrand(req.getParameter("partBrand"));
//        part.setPartId(req.getParameter("partId"));
//        part.setPartName(req.getParameter("partName"));
//        part.setRecordCount(0);

        System.out.println("part.toString() = " + part.toString());
        System.out.println("car = " + car.toString());


        String user = sessionData.getUserData();
        crudService.removeFromCRUD(car,part,user);

        List<CarInCRUD> cars = crudService.returnCarsDisctinct(user);
        System.out.println("cars before crudService = " + cars.toString());
        List<ListCarsParts> listCarsParts = crudService.getCarsWithPart(cars, user);
        session.setAttribute("crudViewList", listCarsParts);

        req.setAttribute("cars", cars);


        RequestDispatcher dispatcher = req.getRequestDispatcher("Cart.jsp");
        dispatcher.forward(req, resp);


    }
}
