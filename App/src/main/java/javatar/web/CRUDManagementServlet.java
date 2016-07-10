package javatar.web;


import javatar.model.CRUD.CarInCRUD;
import javatar.model.CRUD.ListCarsParts;
import javatar.model.FormData;
import javatar.model.report.PartForReportModule;
import javatar.model.report.PartSearchSource;
import javatar.service.CRUDService;
import javatar.service.report.PostChosenPart;
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
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

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
                crudService.addToCart(add, user);
                LOGGER.info("Adding part = {}", add);

                PartForReportModule reportPart = new PartForReportModule(formData,sessionData, LocalDateTime.now(), PartSearchSource.CART);

                PostChosenPart post = new PostChosenPart();
                post.postSearchedValues(reportPart);

            }

        }

        List<CarInCRUD> cars = crudService.returnCarsDisctinct(user);
        System.out.println("cars before crudService = " + cars.toString());
        List<ListCarsParts> listCarsParts = crudService.getCarsWithPart(cars, user);
        session.setAttribute("crudViewList", listCarsParts);

        req.setAttribute("cars", cars);


        RequestDispatcher dispatcher = req.getRequestDispatcher("Cart.jsp");
        dispatcher.forward(req, resp);


    }

    private boolean isNotEmpty(String stringParam) {
        return !stringParam.isEmpty();
    }
}
