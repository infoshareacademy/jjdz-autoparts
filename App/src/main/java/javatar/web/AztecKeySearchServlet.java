package javatar.web;

import javatar.model.*;
import javatar.service.CarIdentification;
import javatar.service.GetJsonFromAtenaApi;
import javatar.service.JsonParserAll;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet(urlPatterns = "/AztecKey")
public class AztecKeySearchServlet extends HttpServlet {

	private static final Logger LOGGER = LogManager.getLogger();

	@EJB
	BrandsJsonCache cache;

	@EJB
	CarIdentification carIdentification;

	@Inject
	FormData formData;

	@EJB
	GetJsonFromAtenaApi getJsonFromAtenaApi;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		JsonParserAll parser = new JsonParserAll();
		Collection<CarsBrands> carsBrandsCollection = cache.returnBrandsCollection();

		String url;

		req.setCharacterEncoding("UTF-8");

		System.out.println("zaczynamy");

		System.out.println("cache return collection size: " + carsBrandsCollection.size());

		String userSessionApiKey = req.getParameter("apiKey");

		System.out.println("user key: " + userSessionApiKey);

		String carDataFromAtenaApi = getJsonFromAtenaApi.getCarFromAtenaApi(userSessionApiKey);

		System.out.println("carDataFromAtenaApi: " + carDataFromAtenaApi);

		CarFromAztecData aztecData = getCarFromApiString(carDataFromAtenaApi);

		Car carFromApi = new Car();
		carFromApi.setCarsBrand(null);

		if (aztecData != null) {
			carFromApi = carIdentification.FindingCarByAztecCodeAnswer(aztecData);
			System.out.println(carFromApi.toString());
		}


		if (carFromApi.getCarsBrand() == null) {
			// TODO: 11.07.16 info dla użytkownika, że nie znaleziono branda
			req.setCharacterEncoding("UTF-8");

			req.setAttribute("brands", carsBrandsCollection);
			LOGGER.info("carsBransdCollection has size: {}", carsBrandsCollection.size());
			RequestDispatcher dispatcher = req.getRequestDispatcher("CarBranchChoosingForm.jsp");
			dispatcher.forward(req, resp);
		} else if (carFromApi.getCarsModel() == null) {
			req.setCharacterEncoding("UTF-8");

			String brandName = carFromApi.getCarsBrand().getName();
			String brandLink = carFromApi.getCarsBrand().getLink();

			req.setAttribute("brandName", brandName);

			formData.setCarBrand(brandName);

			url = "http://infoshareacademycom.2find.ru" + brandLink + "?lang=polish";

			LOGGER.info("Chosen model file name: {}; resources link: {}", brandName, url);
			DataCarsModels dataCarsModels = parser.parseModelFile(url);
			LOGGER.info("Data parsed on model file has size: {}", dataCarsModels.getData().size());
			req.setAttribute("models", dataCarsModels.getData());

			RequestDispatcher dispatcher = req.getRequestDispatcher("CarModelChoosingForm.jsp");
			dispatcher.forward(req, resp);
		} else {

			String modelLink = carFromApi.getCarsModel().getLink();
			url = "http://infoshareacademycom.2find.ru" + modelLink + "?lang=polish";

			List<CarsEngineAndFuel> engineList = carIdentification.findMatchingEngines(url, aztecData);

			LOGGER.debug("engineList.size = " + engineList.size());

			System.out.println("engineList.size = " + engineList.size());

			if (engineList.size() > 1) {
				req.setAttribute("modelName", carFromApi.getCarsModel());
				req.setAttribute("brandName", carFromApi.getCarsBrand());

				formData.setCarBrand(carFromApi.getCarsBrand().getName());
				formData.setCarModel(carFromApi.getCarsModel().getName());

				req.setAttribute("engines", engineList);

				RequestDispatcher dispatcher = req.getRequestDispatcher("CarEngineChoosingForm.jsp");
				dispatcher.forward(req, resp);

			} else if (engineList.size() == 1) {

				String engineName = engineList.get(0).getName();
				String engineLink = engineList.get(0).getLink();

				req.setAttribute("engineName", engineList.get(0).getEngine());
				req.setAttribute("modelName", carFromApi.getCarsModel());
				req.setAttribute("brandName", carFromApi.getCarsBrand());

				req.setAttribute("isFirstCat", true);

				String engineOut = engineName + ";" + engineLink;

				formData.setCarBrand(carFromApi.getCarsBrand().getName());
				formData.setCarModel(carFromApi.getCarsModel().getName());
				formData.setCarEngine(engineName);
				formData.setEngineLookupString(engineOut);

				url = "http://infoshareacademycom.2find.ru" + engineLink + "?lang=polish";

				JsonDataAutopartCategories autopartCategories = parser.parseCategoryFile(url);
				req.setAttribute("categories", autopartCategories.getData());

				RequestDispatcher dispatcher = req.getRequestDispatcher("PartFirstCategoryChoosingForm.jsp");
				dispatcher.forward(req, resp);
			} else {
				req.setAttribute("modelName", carFromApi.getCarsModel().getName());
				req.setAttribute("brandName", carFromApi.getCarsBrand().getName());

				formData.setCarBrand(carFromApi.getCarsBrand().getName());
				formData.setCarModel(carFromApi.getCarsModel().getName());

				DataCarsEngineAndFuel dataCarsEngineAndFuelModels = parser.parseEngineFile(url);
				req.setAttribute("engines", dataCarsEngineAndFuelModels.getData());

				RequestDispatcher dispatcher = req.getRequestDispatcher("CarEngineChoosingForm.jsp");
				dispatcher.forward(req, resp);
			}
		}
	}

	private CarFromAztecData getCarFromApiString(String apiString) {
		CarFromAztecData carFromApi = new CarFromAztecData();
		carFromApi.setError("" + apiString.charAt(apiString.indexOf("\"Error\"") + 8));

		System.out.println("Error Code: " + carFromApi.getError());

		if (carFromApi.getError().equals("0")) {

			String[] apiStringArray = apiString.split(",\"");

			for (String property : apiStringArray) {
				if (property.contains("D1")) {
					carFromApi.setCarBrand(getPropertyValue(property));
					continue;
				}
				if (property.contains("D5")) {
					carFromApi.setCarModel(getPropertyValue(property));
					continue;
				}
				if (property.contains("Rok_produkcji")) {
					carFromApi.setProductionYear(getPropertyValue(property));
					continue;
				}
				if (property.contains("ErrorText")) {
					carFromApi.setErrorText(getPropertyValue(property));
					continue;
				}
				if (property.contains("P.1")) {
					carFromApi.setEngineCapacity(getPropertyValue(property));
					continue;
				}
				if (property.contains("P.2")) {
					carFromApi.setEnginePower(getPropertyValue(property));
					continue;
				}
				if (property.contains("P.3")) {
					carFromApi.setFuelType(getPropertyValue(property));
					continue;
				}
			}
			return carFromApi;
		} else {
			return null;
		}

	}

	private String getPropertyValue(String property) {
		System.out.println("getPropertyValue(" + property + ")");

		String value = property.split(":")[1];

		System.out.println("value: " + value);

		Pattern p = Pattern.compile("\\\".*?\\\"");
		Matcher m = p.matcher(value);
		if (m.find())
			value = m.group().subSequence(1, m.group().length() - 1).toString();

		System.out.println("value final: " + value);
		return value;
	}
}
