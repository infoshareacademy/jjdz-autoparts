package javatar.web;

import javatar.model.FormData;
import javatar.model.FormPartCategories;
import javatar.model.JsonDataAutopart;
import javatar.model.JsonDataAutopartCategories;
import javatar.service.JsonParserAll;
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

@WebServlet(urlPatterns = "/PartCategory")
public class PartCategoryChoosingServlet extends HttpServlet {
    private static final Logger LOGGER = LogManager.getLogger();

    @Inject
    FormData formData;

    @Inject
    SessionData sessionData;

    @Inject
    FormPartCategories formPartCategories;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        sessionData.setErrorMessage(null);
        JsonParserAll parser = new JsonParserAll();
        req.setCharacterEncoding("UTF-8");
        String categories;
        String categoryOut = req.getParameter("category");


        String[] splitArray = categoryOut.split(";");
        String categoryName = splitArray[0];
        String categoryLink = splitArray[1];
        String hasChildren = splitArray[2];

        formPartCategories.addPartCategory(categoryName);
        categories = formPartCategories.getPartCategories().get(0);

        if (formPartCategories.getPartCategories().size() > 1) {
            for (int i = 1; i < formPartCategories.getPartCategories().size(); i++) {
                categories += " -> " + formPartCategories.getPartCategories().get(i);
            }
        }

        req.setAttribute("engineName", formData.getCarEngine());
        req.setAttribute("modelName", formData.getCarModel());
        req.setAttribute("brandName", formData.getCarBrand());
        req.setAttribute("categoryName", categories);
        req.setAttribute("hasChildren", Boolean.parseBoolean(hasChildren));

        String url = "http://infoshareacademycom.2find.ru" + categoryLink + "?lang=polish";
        RequestDispatcher dispatcher;

        if (Boolean.parseBoolean(hasChildren)) {
            JsonDataAutopartCategories autopartCategories = parser.parseCategoryFile(url);
            req.setAttribute("categories", autopartCategories.getData());
            if (autopartCategories.getData().isEmpty())
            {
                sessionData.setErrorMessage("BŁĄD! Brak kategorii częśći samochodowych do wyświetlenia!");
                LOGGER.error(sessionData.getErrorMessage());
            }

        } else {
            JsonDataAutopart autopart = parser.parsePartFile(url);
            req.setAttribute("parts", autopart.getData());
            if (autopart.getData().isEmpty())
            {
                sessionData.setErrorMessage("BŁĄD! Brak częśći samochodowych do wyświetlenia!");
                LOGGER.error(sessionData.getErrorMessage());
            }
        }

        req.setAttribute("errorMessage", sessionData.getErrorMessage());

        dispatcher = req.getRequestDispatcher("PartCategoryChoosingForm.jsp");
        dispatcher.forward(req, resp);
    }
}
