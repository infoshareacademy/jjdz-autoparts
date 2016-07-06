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
import java.util.Collection;
import java.util.List;

@WebServlet(urlPatterns = "/AztecKey")
public class AztecKeySearchServlet extends HttpServlet {

    private static final Logger LOGGER = LogManager.getLogger();

    @EJB
    JsonParserEngine jsonParserEngine;

    @EJB
    BrandsJsonCache cache;

    @Inject
    FormData formData;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        JsonParserAll parser = new JsonParserAll();
        req.setCharacterEncoding("UTF-8");

        GetJsonFromAtenaApi getJsonFromAtenaApi = new GetJsonFromAtenaApi();
        CarIdentification carIdentification = new CarIdentification();

        String userSessionApiKey = req.getParameter("apiKey");
        String carDataFromAtenaApi = getJsonFromAtenaApi.getCarFromAtenaApi(userSessionApiKey);
        CarFromAztecData aztecData = getCarFromApiString(carDataFromAtenaApi);
        Car carFromApi = carIdentification.FindingCarByAztecCodeAnswer(aztecData);

        if (carFromApi.getCarsBrand() == null) {
//            BrandsChoosingServlet brandsServ = new BrandsChoosingServlet();
//            brandsServ.doGet(req, resp);
            req.setCharacterEncoding("UTF-8");
            Collection<CarsBrands> carsBrandsCollection = cache.returnBrandsCollection();

            req.setAttribute("brands", carsBrandsCollection);
            LOGGER.info("carsBransdCollection has size: {}",carsBrandsCollection.size());
            RequestDispatcher dispatcher = req.getRequestDispatcher("CarBranchChoosingForm.jsp");
            dispatcher.forward(req, resp);
        }

        if (carFromApi.getCarsModel() == null)
        {
            req.setCharacterEncoding("UTF-8");

            String brandName = carFromApi.getCarsBrand().getName();
            String brandLink = carFromApi.getCarsBrand().getLink();

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

        //// TODO: 27.06.16 jsonparser bez ejb
        List<CarsEngineAndFuel> engineList = jsonParserEngine.searchEngineTypeByTokens(aztecData.getFuelType(), aztecData.getEngineCapacity(), aztecData.getEnginePower());

        LOGGER.debug("engineList.size = " + engineList.size());

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
