package javatar.web;

import javatar.model.AllegroCategories;
import javatar.model.Autopart;
import javatar.model.AutopartAllegroListModel;
import javatar.model.AutopartCategory;
import javatar.service.CreateAllegroLink;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/AllegroLink")
public class AllegroCategoryServlet extends HttpServlet {

    private static final Logger LOGGER = LogManager.getLogger();
    CreateAllegroLink createAllegroLink = new CreateAllegroLink();

    @EJB
    AllegroCategoriesCache allegroCategoriesCache;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        AutopartAllegroListModel autopartAllegroListModel = new AutopartAllegroListModel();
        Autopart autopart = new Autopart();
        List<AutopartCategory> categoryList = new ArrayList<>();
        AutopartCategory autopartCategory;
        List<AllegroCategories> allegroCategoriesList = allegroCategoriesCache.returnAllegroCategoriesFromFile();

        String autopartAsString = req.getParameter("part");

        String[] splitArray = autopartAsString.split(";");
        String brand = splitArray[0];
        String id = splitArray[1];
        String name = splitArray[2];
        String[] categoriesSplit = req.getParameter("categoryName").split(" -> ");


        for (int i = 0; i < categoriesSplit.length; i++) {
            autopartCategory = new AutopartCategory();
            autopartCategory.setName(categoriesSplit[i]);
            categoryList.add(autopartCategory);
        }

        autopart.setId(id);
        autopart.setName(name);
        autopart.setBrand(brand);
        autopart.setCategoryList(categoryList);

        autopartAllegroListModel.setAutopart(autopart);
        autopartAllegroListModel.setAllegroCategories(allegroCategoriesList);
        String allegroLink = createAllegroLink.createAllegroLink(autopartAllegroListModel) + "?string=" + autopart.getName() + " " + autopart.getBrand() + " " + autopart.getId();
        LOGGER.info("Created allegro link: {}", allegroLink);

        req.setAttribute("allegroLink", allegroLink);
        req.setAttribute("partName", name);
        req.setAttribute("partBrand", brand);
        req.setAttribute("partId", id);

        RequestDispatcher dispatcher = req.getRequestDispatcher("AllegroCategoryForm.jsp");
        dispatcher.forward(req, resp);
    }
}
