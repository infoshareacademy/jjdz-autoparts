package javatar.web;

import javatar.model.DataCarsModels;
import javatar.model.FormData;
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

@WebServlet(urlPatterns = "/Models")
public class ModelChoosingServlet extends HttpServlet {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(ModelChoosingServlet.class);

    @Inject
    FormData formData;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        JsonParserAll parser = new JsonParserAll();
        req.setCharacterEncoding("UTF-8");
        String brandOut = req.getParameter("brand");

        String[] splitArray = brandOut.split(";");
        String brandName = splitArray[0];
        String brandLink = splitArray[1];

        req.setAttribute("brandName", brandName);

        formData.setCarBrand(brandName);

        String url = "http://infoshareacademycom.2find.ru" + brandLink + "?lang=polish";

        LOGGER.info("Chosen model file name: {}; resources link: {}",brandName,url);
        DataCarsModels dataCarsModels = parser.parseModelFile(url);
        LOGGER.info("Data parsed on model file has size: {}",dataCarsModels.getData().size());
        req.setAttribute("models", dataCarsModels.getData());

        RequestDispatcher dispatcher = req.getRequestDispatcher("CarModelChoosingForm.jsp");
        dispatcher.forward(req, resp);
    }
}
