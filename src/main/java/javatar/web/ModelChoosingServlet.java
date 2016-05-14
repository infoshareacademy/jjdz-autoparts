package javatar.web;

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

@WebServlet(urlPatterns = "/Models")
public class ModelChoosingServlet extends HttpServlet {
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        JsonParserAll parser = new JsonParserAll();
        req.setCharacterEncoding("UTF-8");
        String brandOut = req.getParameter("brand");

        String[] splitArray = brandOut.split(";");
        String brandId = splitArray[0];
        String brandName = splitArray[1];
        String brandLink = splitArray[2];

        req.setAttribute("brandName", brandName);
        req.setAttribute("brandId", brandId);

        String url = "http://infoshareacademycom.2find.ru" + brandLink + "?lang=polish";

        LOGGER.info("Chosen model file name: {}; resources link: {}",brandName,url);
        DataCarsModels dataCarsModels = parser.parseModelFile(url);
        LOGGER.info("Data parsed on model file has size: {}",dataCarsModels.getData().size());
        req.setAttribute("models", dataCarsModels.getData());

        RequestDispatcher dispatcher = req.getRequestDispatcher("CarModelChoosingForm.jsp");
        dispatcher.forward(req, resp);
    }
}
