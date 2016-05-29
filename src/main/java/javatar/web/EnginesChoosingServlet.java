package javatar.web;

import javatar.model.DataCarsEngineAndFuel;
import javatar.model.FormData;
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

@WebServlet(urlPatterns = "/Engines")
public class EnginesChoosingServlet extends HttpServlet {
    private static final Logger LOGGER = LogManager.getLogger();

    @Inject
    FormData formData;

    @Inject
    SessionData sessionData;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        JsonParserAll parser = new JsonParserAll();
        req.setCharacterEncoding("UTF-8");
        String modelOut = req.getParameter("model");

        String[] splitArray = modelOut.split(";");
        String modelName = splitArray[0];
        String modelLink = splitArray[1];

        req.setAttribute("modelName", modelName);
        req.setAttribute("brandName", formData.getCarBrand());

        formData.setCarModel(modelName);

        String url = "http://infoshareacademycom.2find.ru" + modelLink + "?lang=polish";
        LOGGER.info("Chosen brand file name: {}; chosen model file name: {}; resources link: {}",formData.getCarBrand(),modelName,url);
        DataCarsEngineAndFuel dataCarsEngineAndFuelModels = parser.parseEngineFile(url);
        req.setAttribute("engines", dataCarsEngineAndFuelModels.getData());

        sessionData.setErrorMessage(null);
        if (dataCarsEngineAndFuelModels.getData().isEmpty())
        {
            sessionData.setErrorMessage("BŁĄD! Brak silników samochodowych do wyświetlenia!");
            LOGGER.error(sessionData.getErrorMessage());
        }
        req.setAttribute("errorMessage", sessionData.getErrorMessage());

        RequestDispatcher dispatcher = req.getRequestDispatcher("CarEngineChoosingForm.jsp");
        dispatcher.forward(req, resp);
    }
}
