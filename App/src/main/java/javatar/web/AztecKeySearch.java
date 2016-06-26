package javatar.web;

import javatar.model.*;
import javatar.service.CarIdentification;
import javatar.service.GetJsonFromAtenaApi;
import javatar.service.JsonParserAll;
import javatar.service.JsonParserEngine;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/AztecKey")
public class AztecKeySearch extends HttpServlet {

    private static final Logger LOGGER = LogManager.getLogger();

    @EJB
    GetJsonFromAtenaApi getJsonFromAtenaApi;

    @EJB
    CarIdentification carIdentification;

    @EJB
    JsonParserEngine jsonParserEngine;

    @Inject
    FormData formData;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        JsonParserAll parser = new JsonParserAll();
        req.setCharacterEncoding("UTF-8");

        String userSessionApiKey = req.getParameter("apiKey");
        String carDataFromAtenaApi = getJsonFromAtenaApi.getCarFromAtenaApi(userSessionApiKey);
        CarFromAztecData aztecData = getCarFromApiString(carDataFromAtenaApi);
        Car carFromApi = carIdentification.FindingCarByAztecCodeAnswer(aztecData);
        List<CarsEngineAndFuel> engineList = jsonParserEngine.searchEngineTypeByTokens(carFromApi.getFuelType(), carFromApi.getEngineCapacity(), carFromApi.getEnginePower());

        if (engineList.size()>1)
        {
            req.setAttribute("modelName", carFromApi.getCarsModel());
            req.setAttribute("brandName", carFromApi.getCarsBrand());

            formData.setCarBrand(carFromApi.getCarsBrand().toString());
            formData.setCarModel(carFromApi.getCarsModel().toString());

            req.setAttribute("engines", engineList);

            RequestDispatcher dispatcher = req.getRequestDispatcher("CarEngineChoosingForm.jsp");
            dispatcher.forward(req, resp);

        }
        else if (engineList.size()==1){

            String engineName = engineList.get(0).getName();
            String engineLink = engineList.get(0).getLink();

            req.setAttribute("engineName", engineList.get(0).getEngine());
            req.setAttribute("modelName", carFromApi.getCarsModel());
            req.setAttribute("brandName", carFromApi.getCarsBrand());

            req.setAttribute("isFirstCat", true);

            String engineOut = engineName + ";" + engineLink;

            formData.setCarBrand(carFromApi.getCarsBrand().toString());
            formData.setCarModel(carFromApi.getCarsModel().toString());
            formData.setCarEngine(engineName);
            formData.setEngineLookupString(engineOut);

            String url = "http://infoshareacademycom.2find.ru" + engineLink + "?lang=polish";

            JsonDataAutopartCategories autopartCategories = parser.parseCategoryFile(url);
            req.setAttribute("categories", autopartCategories.getData());

            RequestDispatcher dispatcher = req.getRequestDispatcher("PartFirstCategoryChoosingForm.jsp");
            dispatcher.forward(req, resp);
        }
    }

    private CarFromAztecData getCarFromApiString(String apiString) {
        CarFromAztecData carFromApi = new CarFromAztecData();

        String[] apiStringArray = apiString.split(",");

        for (String property : apiStringArray) {
            if (property.contains("D1")) {
                String carBrand = property.split(": ")[1];
                carFromApi.setCarBrand(carBrand.substring(1, carBrand.length() - 1));
                continue;
            }
            if (property.contains("D5")) {
                String carModel = property.split(": ")[1];
                carFromApi.setCarModel(carModel.substring(1, carModel.length() - 1));
                continue;
            }
            if (property.contains("Rok_produkcji")) {
                String productionYear = property.split(": ")[1];
                carFromApi.setProductionYear(productionYear.substring(1, productionYear.length() - 1));
                continue;
            }
            if (property.contains("Error")) {
                String error = property.split(": ")[1];
                carFromApi.setError(error.substring(1, error.length() - 1));
                continue;
            }
            if (property.contains("ErrorText")) {
                String errorText = property.split(": ")[1];
                carFromApi.setErrorText(errorText.substring(1, errorText.length() - 1));
                continue;
            }
            if (property.contains("P.1")) {
                String engineCapacity = property.split(": ")[1];
                carFromApi.setEngineCapacity(engineCapacity.substring(1, engineCapacity.length() - 1));
                continue;
            }
            if (property.contains("P.2")) {
                String enginePower = property.split(": ")[1];
                carFromApi.setEnginePower(enginePower.substring(1, enginePower.length() - 1));
                continue;
            }
            if (property.contains("P.3")) {
                String fuelType = property.split(": ")[1];
                carFromApi.setFuelType(fuelType.substring(1, fuelType.length() - 1));
                continue;
            }
        }

        return carFromApi;
    }
}
