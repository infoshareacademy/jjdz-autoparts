package javatar.web;

import javatar.model.*;
import javatar.service.CreateAllegroLink;
import javatar.service.FormDataTableService;
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
import java.time.LocalDateTime;
import java.util.List;

@WebServlet(urlPatterns = "/AllegroLink")
public class AllegroCategoryServlet extends HttpServlet {

    private static final Logger LOGGER = LogManager.getLogger();
    CreateAllegroLink createAllegroLink = new CreateAllegroLink();

    @Inject
    FormData formData;

    @Inject
    SessionData sessionData;

    @EJB
    FormDataTableService formDataTableService;

    @EJB
    AllegroCategoriesCache allegroCategoriesCache;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        AutopartAllegroListModel autopartAllegroListModel = new AutopartAllegroListModel();
        Autopart autopart = new Autopart();
        List<AllegroCategories> allegroCategoriesList = allegroCategoriesCache.returnAllegroCategoriesFromFile();

        String autopartAsString = req.getParameter("part");

        String[] splitArray = autopartAsString.split(";");
        String brand = splitArray[0];
        String id = splitArray[1];
        String name = splitArray[2];

        formData.setPartBrand(brand);
        formData.setPartId(id);
        formData.setPartName(name);

        autopart.setId(id);
        autopart.setName(name);
        autopart.setBrand(brand);
        autopart.createCategoryListByNames(formData.getPartCategories());

        autopartAllegroListModel.setAutopart(autopart);
        autopartAllegroListModel.setAllegroCategories(allegroCategoriesList);
        String allegroLink = createAllegroLink.createAllegroLink(autopartAllegroListModel) + "?string=" + autopart.getName() + " " + autopart.getBrand() + " " + autopart.getId();
        formData.setAllegroLink(allegroLink);
        LOGGER.info("Created allegro link: {}", allegroLink);

        req.setAttribute("allegroLink", allegroLink);
        req.setAttribute("partName", name);
        req.setAttribute("partBrand", brand);
        req.setAttribute("partId", id);

        formDataTableService.sendResults(formData,
                sessionData.getUserData(),
                LocalDateTime.now(),
                allegroLink);

        RequestDispatcher dispatcher = req.getRequestDispatcher("AllegroCategoryForm.jsp");
        dispatcher.forward(req, resp);
    }
}
