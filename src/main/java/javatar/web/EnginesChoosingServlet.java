package javatar.web;

import javatar.model.DataCarsEngineAndFuel;
import javatar.model.DataCarsModels;
import javatar.service.JsonParserAll;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        JsonParserAll parser = new JsonParserAll();

        String modelOut = req.getParameter("model");
        String brandName = req.getParameter("brandName");

        String[] splitArray = modelOut.split(";");
        String modelId = splitArray[0];
        String modelName = splitArray[1];
        String modelLink = splitArray[2];

        req.setAttribute("modelName", modelName);
        req.setAttribute("modelId", modelId);
        req.setAttribute("brandName", brandName);

        String url = "http://infoshareacademycom.2find.ru" + modelLink + "?lang=polish";
        LOGGER.info("Chosen brand file name: {}; chosen model file name: {}; resources link: {}",brandName,modelName,url);
        DataCarsEngineAndFuel dataCarsEngineAndFuelModels = parser.parseEngineFile(url);
        req.setAttribute("engines", dataCarsEngineAndFuelModels.getData());

        RequestDispatcher dispatcher = req.getRequestDispatcher("CarEngineChoosingForm.jsp");
        dispatcher.forward(req, resp);
    }
}
