package javatar.web;

import javatar.model.CRUD.CarInCRUD;
import javatar.model.CRUD.ListCarsParts;
import javatar.model.CRUD.SinglePartToRemove;
import javatar.service.CRUDService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
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
import java.util.UUID;

@WebServlet(urlPatterns = "/Cart")
public class CartViewServlet extends HttpServlet {
    private static final Logger LOGGER = LogManager.getLogger();


    @EJB
    CRUDService crudService;

    @Inject
    ListCarsParts listCarsParts;

    @Inject
    SessionData sessionData;

    @Inject
    SinglePartToRemove singlePartToRemove;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();

        List<CarInCRUD> cars = crudService.returnCarsDisctinct();
        System.out.println("cars before crudService = " + cars.toString());
        String user = sessionData.getUserData();
        List<ListCarsParts> listCarsParts = crudService.getCarsWithPart(cars, user);
        session.setAttribute("crudViewList", listCarsParts);

        req.setAttribute("cars", cars);

        String singlePartToRemoveId = UUID.randomUUID().toString();
        req.getSession().setAttribute(singlePartToRemoveId, singlePartToRemove);
        req.setAttribute("singlePartToRemoveId", singlePartToRemoveId);

        RequestDispatcher dispatcher = req.getRequestDispatcher("Cart_backup.jsp");
        dispatcher.forward(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher dispatcher = req.getRequestDispatcher("Output.jsp");
        dispatcher.forward(req, resp);
    }
}
