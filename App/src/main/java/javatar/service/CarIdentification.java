package javatar.service;

import javatar.model.*;
import javatar.web.BrandsJsonCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

@Stateless
public class CarIdentification {

    private static final Logger LOGGER = LoggerFactory.getLogger(CarIdentification.class);

    @EJB
    BrandsJsonCache cache;

    public CarIdentification() {
    }

    public Car FindingCarByAztecCodeAnswer(CarFromAztecData apiAnswer) throws FileNotFoundException {

        LOGGER.debug("Looking for car: brand - " + apiAnswer.getCarBrand() + " ; model - " + apiAnswer.getCarModel());
        Car foundCar = new Car();

        CarsBrands brand = findBrand(apiAnswer.getCarBrand());

        CarsModels model = findModel(brand.getLink(), apiAnswer.getCarModel(), apiAnswer.getProductionYear());

        foundCar.setCarsBrand(brand);
        foundCar.setCarsModel(model);

        LOGGER.debug("Found carBrand: " + foundCar.getCarsBrand().toString());
        LOGGER.debug("Found carModel: " + foundCar.getCarsModel().toString());
        return foundCar;
    }

    private CarsModels findModel(String link, String carModel, String productionYearString) {
        LOGGER.debug("Looking for car model: " + carModel);
        JsonParserAll parser = new JsonParserAll();

        String url = "http://infoshareacademycom.2find.ru" + link + "?lang=polish";
        DataCarsModels dataCarsModels = parser.parseModelFile(url);
        Collection<CarsModels> carsModelsCollection = dataCarsModels.getData();

        Integer startYear;
        Integer endYear;
        Integer productionYear = Integer.parseInt(productionYearString);

        for (CarsModels model :
                carsModelsCollection) {

            startYear = model.getStart_year();
            endYear = (model.getEnd_year() == null) ? LocalDateTime.now().getYear() : model.getEnd_year();

            if (model.getName().toUpperCase().contains(carModel.toUpperCase())
                    && startYear <= productionYear
                    && endYear >= productionYear){

                LOGGER.info("Found: " + model.toString());
                return model;
            }
        }
        LOGGER.error("MODEL NOT FOUND!");
        return null;
    }

    private CarsBrands findBrand(String carBrand) {
        LOGGER.debug("Looking for car brand: " + carBrand);

        Collection<CarsBrands> carsBrandsCollection = cache.returnBrandsCollection();

        for (CarsBrands brand :
                carsBrandsCollection) {
            if (brand.getName().toUpperCase().contains(carBrand.toUpperCase())){
                LOGGER.info("Brand found: " + brand.toString());
                return brand;
            }
        }
        LOGGER.error("BRAND NOT FOUND!");
        return null;
    }

    public List<CarsEngineAndFuel> findMatchingEngines(String url, CarFromAztecData aztecData) {

        JsonParserAll parser = new JsonParserAll();
        DataCarsEngineAndFuel engines = parser.parseEngineFile(url);

        return parser.searchEngineTypeByTokens(engines, aztecData.getFuelType(), aztecData.getEngineCapacity(), aztecData.getEnginePower());
    }
}








