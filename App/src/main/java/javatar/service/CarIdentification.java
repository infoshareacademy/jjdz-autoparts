package javatar.service;

import javatar.model.*;
import javatar.web.BrandsJsonCache;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Collection;

@Stateless
public class CarIdentification {

    private static final Logger LOGGER = LogManager.getLogger();

    @EJB
    BrandsJsonCache cache;

    public CarIdentification() {
    }

    public Car FindingCarByAztecCodeAnswer(CarFromAztecData apiAnswer) throws FileNotFoundException {

        LOGGER.debug("Looking for car: brand - " + apiAnswer.getCarBrand() + " ; model - " + apiAnswer.getCarModel());
        System.out.println("Looking for car: brand - " + apiAnswer.getCarBrand() + " ; model - " + apiAnswer.getCarModel());
        Car foundCar = new Car();

        //Collection<CarsBrands> carsBrandsCollection = cache.returnBrandsCollection();

        CarsBrands brand = findBrand(apiAnswer.getCarBrand());

        System.out.println(brand.toString());

        CarsModels model = findModel(brand.getLink(), apiAnswer.getCarModel(), apiAnswer.getProductionYear());

        System.out.println(model.toString());

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

        System.out.println("=============================================" + cache.returnBrandsCollection().size());

        Collection<CarsBrands> carsBrandsCollection = cache.returnBrandsCollection();

        System.out.println("carsBrandsCollection " + carsBrandsCollection.size() + " }");

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

    public Car FindingCarManagement() throws IOException {
//        String brand = new String();
//        Scanner scanner = new Scanner(System.in);
//        JsonParserBrands brandFileName = new JsonParserBrands();
//        String brandFileNameOut = "Error";
//
//        //------------------------------------------------------------------------------------------------------
//        //Car brands section
//        //------------------------------------------------------------------------------------------------------
//        //while (brandFileNameOut == "Error") {
//        System.out.println("Wprowadź nazwę marki lub wybierz z listy i wprowadź przyporządkowany jej numer:\r\n1. OPEL\r\n2. VOLKSWAGEN");
//        String brandSelection = scanner.nextLine();
//
//        if (brandSelection.length() == 1) {
//            switch (brandSelection) {
//                case "1":
//                    brand = "OPEL";
//                    break;
//                case "2":
//                    brand = "VOLKSWAGEN";
//                    break;
//                default:
//                    brand = "Error";
//                    break;
//            }
//        } else {
//            brand = brandSelection;
//        }
//
//
//        brandFileNameOut = brandFileName.searchCarId(brand);
//        // }
//
//        //------------------------------------------------------------------------------------------------------
//        //Car models section
//        //------------------------------------------------------------------------------------------------------
////        JsonParserModels modelId = new JsonParserModels(mainPath + brandFileNameOut + ".json");
//        JsonParserModels modelId = new JsonParserModels();
//        String modelPath = mainPath + brandFileNameOut;
//        String modelFileNameOut = "Error";
//        String model = new String();
//        String year = new String();
//
//        //while (modelFileNameOut == "Error") {
//        System.out.println("Wprowadź nazwę modelu lub wybierz z listy i wprowadź przyporządkowany jej numer:\r\n1. ASTRA G kombi\r\n2. JETTA VII SportWagon");
//        String modelSelection = scanner.nextLine();
//        System.out.println("Wprowadź rok produkcji:");
//        year = scanner.nextLine();
//
//
//        if (modelSelection.length() == 1) {
//            switch (modelSelection) {
//                case "1":
//                    model = "ASTRA G kombi";
//                    break;
//                case "2":
//                    model = "JETTA VII SportWagon";
//                    break;
//                default:
//                    model = "Error";
//                    break;
//            }
//        } else {
//            model = modelSelection;
//        }
//
//        modelFileNameOut = modelId.searchModelId(model, Integer.parseInt(year));
//        // }
//        //------------------------------------------------------------------------------------------------------
//        //CEngines and fuel section
//        //------------------------------------------------------------------------------------------------------
//        String engineFileNameOut = "Error";
//        final JsonParserEngine engine = new JsonParserEngine(mainPath + modelFileNameOut + ".json");
//
//        while (engineFileNameOut == "Error") {
//
//            System.out.println("Wpisz numer przyporządkowany właściwemu silnikowi:");
//
//            HashMap<Integer, String> engineIdsMap = engine.listAllEngineTypes();
//            String engineSelection = scanner.nextLine();
////
////            while (Integer.parseInt(engineSelection) > (engineIdsMap.size() - 1) || Integer.parseInt(engineSelection) < 0) {
////                System.out.println("Wpisz numer przyporządkowany właściwemu silnikowi:");
////                engineSelection = scanner.nextLine();
////            }
//
//            engineFileNameOut = engineIdsMap.get(Integer.parseInt(engineSelection));
//        }
//
//        JsonParserEngine engine1 = new JsonParserEngine(mainPath + modelFileNameOut + ".json");
//        //TODO dopytaj dlaczego nie możesz tu skorzystać z engine
//        String engineName = engine1.searchEngineTypeByNumber(engineFileNameOut);
//

        Car car = new Car();
//        car.setCarsBrand(new CarsBrands(brandFileNameOut, brand));
//        car.setCarsModel(new CarsModels(modelFileNameOut, model));
////        car.setBrandName(brand);
////        car.setBrandId(brandFileNameOut);
////        car.setModelId(modelFileNameOut);
////        car.setModelName(model);
//        car.setProductionYear(Integer.parseInt(year));
//        car.setTypeId(engineFileNameOut);
//        car.setTypeName(engineName);

        System.out.println(car);

        return car;
    }
}








