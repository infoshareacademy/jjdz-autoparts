package javatar.web;

import javatar.model.DataCarsEngineAndFuel;
import javatar.service.JsonParserAll;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Parts")
public class PartsChoosingServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        JsonParserAll parser = new JsonParserAll();

        String engineOut = req.getParameter("engine");

        String[] splitArray = engineOut.split(";");
        String engineId = splitArray[0];
        String engineName = splitArray[1];
        String engineLink = splitArray[2];

        req.setAttribute("engineName", engineName);
        req.setAttribute("engineId", engineId);

        String url = "http://infoshareacademycom.2find.ru" + engineLink + "?lang=polish";

        //TODO Michał jesli chcesz z tego skorzystać to poniżej uzupełnij klasę o właściwy typ danych i do JsonParserAll dodaj swoją metodę
//        DataCarsEngineAndFuel dataCarsEngineAndFuelModels = parser.parseEngineFile(url);
//        req.setAttribute("parts", dataCarsEngineAndFuelModels.getData());

        RequestDispatcher dispatcher = req.getRequestDispatcher("CarEngineChoosingForm.jsp");
        dispatcher.forward(req, resp);
    }
}
