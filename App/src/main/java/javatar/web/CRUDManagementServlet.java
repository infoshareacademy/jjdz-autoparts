package javatar.web;


import javatar.model.CRUD.CarInCRUD;
import javatar.model.CRUD.ListCarsParts;
import javatar.model.FormData;
import javatar.service.CRUDService;
import org.slf4j.LoggerFactory;

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
import java.util.Map;

@WebServlet(urlPatterns = "/CRUD")
public class CRUDManagementServlet extends HttpServlet {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(CRUDManagementServlet.class);

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

        sessionData.setErrorMessage(null);
        sessionData.setWarningMessage(null);

        System.out.println("CRUD servlet is running");
        req.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();

        Map<String, String[]> parameterMap = req.getParameterMap();
        LOGGER.info("parameterMap = {}", parameterMap.toString());

        String user = sessionData.getUserData();

        if (parameterMap.containsKey("remove")) {

            String remove = req.getParameter("remove");
            if (isNotEmpty(remove)) {
                crudService.removeFromCRUD(remove, user);
                LOGGER.info("Removing part = {}", remove);
            }
        }
        if (parameterMap.containsKey("add")) {
            String add = req.getParameter("add");

            if (isNotEmpty(add)) {
                crudService.addToCart(add, sessionData);
                LOGGER.info("Adding part = {}", add);

            }

        }

        List<CarInCRUD> cars = crudService.returnCarsDisctinct(user);
        System.out.println("cars before crudService = " + cars.toString());
        List<ListCarsParts> listCarsParts = crudService.getCarsWithPart(cars, user);
        session.setAttribute("crudViewList", listCarsParts);

        req.setAttribute("cars", cars);
        req.setAttribute("errorMessage", sessionData.getErrorMessage());
        req.setAttribute("warningMessage", sessionData.getWarningMessage());


        RequestDispatcher dispatcher = req.getRequestDispatcher("Cart.jsp");
        dispatcher.forward(req, resp);


    }

    private boolean isNotEmpty(String stringParam) {
        return !stringParam.isEmpty();
    }
}
