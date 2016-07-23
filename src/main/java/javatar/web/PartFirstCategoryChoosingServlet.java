package javatar.web;

import javatar.model.FormData;
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

@WebServlet(urlPatterns = "/PartFirstCategory")
public class PartFirstCategoryChoosingServlet extends HttpServlet {
    private static final Logger LOGGER = LogManager.getLogger();

    @Inject
    FormData formData;

    @Inject
    SessionData sessionData;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        JsonParserAll parser = new JsonParserAll();
        req.setCharacterEncoding("UTF-8");
        String engineOut = req.getParameter("engine");


        String[] splitArray = engineOut.split(";");
        String engineName = splitArray[0];
        String engineLink = splitArray[1];

        req.setAttribute("engineName", engineName);
        req.setAttribute("modelName", formData.getCarModel());
        req.setAttribute("brandName", formData.getCarBrand());
        req.setAttribute("isFirstCat", true);

        formData.setCarEngine(engineName);

        String url = "http://infoshareacademycom.2find.ru" + engineLink + "?lang=polish";

        JsonDataAutopartCategories autopartCategories = parser.parseCategoryFile(url);
        req.setAttribute("categories", autopartCategories.getData());

        sessionData.setErrorMessage(null);
        if (autopartCategories.getData().isEmpty())
        {
            sessionData.setErrorMessage("BŁĄD! Brak kategorii częśći samochodowych do wyświetlenia!");
            LOGGER.error(sessionData.getErrorMessage());
        }
        req.setAttribute("errorMessage", sessionData.getErrorMessage());

        RequestDispatcher dispatcher = req.getRequestDispatcher("PartFirstCategoryChoosingForm.jsp");
        dispatcher.forward(req, resp);
    }
}
