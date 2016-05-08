package javatar.web;

import javatar.model.DataCarsModels;
import javatar.service.JsonParserAll;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Models")
public class ModelChoosingServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        JsonParserAll parser = new JsonParserAll();

        String brandOut = req.getParameter("brand");

        String[] splitArray = brandOut.split(";");
        String brandId = splitArray[0];
        String brandName = splitArray[1];
        String brandLink = splitArray[2];

        req.setAttribute("brandName", brandName);
        req.setAttribute("brandId", brandId);

        String url = "http://infoshareacademycom.2find.ru" + brandLink + "?lang=polish";

        DataCarsModels dataCarsModels = parser.parseModelFile(url);
        req.setAttribute("models", dataCarsModels.getData());

        RequestDispatcher dispatcher = req.getRequestDispatcher("CarModelChoosingForm.jsp");
        dispatcher.forward(req, resp);
    }
}
