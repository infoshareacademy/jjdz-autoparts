package javatar.web;

import javatar.model.DataCarsEngineAndFuel;
import javatar.model.DataCarsModels;
import javatar.service.JsonParserAll;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Engines")
public class EnginesChoosingServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        JsonParserAll parser = new JsonParserAll();

        String modelOut = req.getParameter("model");

        String[] splitArray = modelOut.split(";");
        String modelId = splitArray[0];
        String modelName = splitArray[1];
        String modelLink = splitArray[2];

        req.setAttribute("modelName", modelName);
        req.setAttribute("modelId", modelId);

        String url = "http://infoshareacademycom.2find.ru" + modelLink + "?lang=polish";

        DataCarsEngineAndFuel dataCarsEngineAndFuelModels = parser.parseEngineFile(url);
        req.setAttribute("engines", dataCarsEngineAndFuelModels.getData());

        RequestDispatcher dispatcher = req.getRequestDispatcher("CarEngineChoosingForm.jsp");
        dispatcher.forward(req, resp);
    }
}
