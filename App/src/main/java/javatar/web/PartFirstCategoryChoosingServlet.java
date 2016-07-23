package javatar.web;

import javatar.model.FormData;
import javatar.model.JsonDataAutopartCategories;
import javatar.service.JsonParserAll;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

@WebServlet(urlPatterns = "/PartFirstCategory")
public class PartFirstCategoryChoosingServlet extends HttpServlet {

    @Inject
    FormData formData;

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(PartFirstCategoryChoosingServlet.class);
    @Inject
    SessionData sessionData;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        sessionData.setErrorMessage(null);
        sessionData.setWarningMessage(null);

        JsonParserAll parser = new JsonParserAll();
        req.setCharacterEncoding("UTF-8");

        String engineOut = "";
        String engineName = "";
        String engineLink = "";

        Map<String, String[]> parameterMap = req.getParameterMap();
        LOGGER.info("parameterMap = {}", parameterMap.toString());

        if(parameterMap.containsKey("search")){
            String dataFromCart = req.getParameter("search");
            LOGGER.info("Splitting search parameter: {}", dataFromCart);
            String[] split = dataFromCart.split(";");
            engineName = split[0];
            engineLink = split[1];
            String modelName = split[2];
            String brandName = split[3];
            engineOut = engineName + ";" + engineLink;
            req.setAttribute("engineName", engineName);
            req.setAttribute("modelName", modelName);
            req.setAttribute("brandName", brandName);
            formData.setCarBrand(brandName);
            formData.setCarModel(modelName);
        }
        else {
            engineOut = req.getParameter("engine");
            String[] splitArray = engineOut.split(";");
            engineName = splitArray[0];
            engineLink = splitArray[1];
            req.setAttribute("engineName", engineName);
            req.setAttribute("modelName", req.getParameter("modelName"));
            req.setAttribute("brandName", req.getParameter("brandName"));
        }
        req.setAttribute("isFirstCat", true);


        formData.setCarEngine(engineName);
        formData.setEngineLookupString(engineOut);

        String url = "http://infoshareacademycom.2find.ru" + engineLink + "?lang=polish";

        JsonDataAutopartCategories autopartCategories = parser.parseCategoryFile(url);

        if (autopartCategories == null) {
            sessionData.setErrorMessage("BŁĄD! Brak części samochodowych do wyświetlenia!");
            LOGGER.error(sessionData.getErrorMessage());
        }

        req.setAttribute("categories", autopartCategories.getData());
        req.setAttribute("errorMessage", sessionData.getErrorMessage());
        req.setAttribute("warningMessage", sessionData.getWarningMessage());

        RequestDispatcher dispatcher = req.getRequestDispatcher("PartFirstCategoryChoosingForm.jsp");
        dispatcher.forward(req, resp);
    }
}
