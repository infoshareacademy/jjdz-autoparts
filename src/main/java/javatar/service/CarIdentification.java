package javatar.service;

import javatar.model.Car;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import static javatar.service.JsonParserEngine.listAllEngineTypes;

public class CarIdentification {
    public void main(String[] args) throws IOException {

        FindingCarManagement();
    }

    public Car FindingCarManagement() throws IOException {
        String brand = new String();
        String mainPath = "src/main/resources/";
        Scanner scanner = new Scanner(System.in);
        JsonParserBrands brandFileName = new JsonParserBrands();
        String path = mainPath + "v2.json";
        String brandFileNameOut = "Error";

        //------------------------------------------------------------------------------------------------------
        //Car brands section
        //------------------------------------------------------------------------------------------------------
        while (brandFileNameOut == "Error") {
            System.out.println("Wprowadź nazwę marki lub wybierz z listy i wprowadź przyporządkowany jej numer:\r\n1. OPEL");
            String brandSelection = scanner.nextLine();

            if (brandSelection.length() == 1) {
                switch (brandSelection) {
                    case "1":
                        brand = "OPEL";
                        break;
                    default:
                        brand = "Error";
                        break;
                }
            } else {
                brand = brandSelection;
            }


            brandFileNameOut = brandFileName.searchCarId(path, brand);
        }

        //------------------------------------------------------------------------------------------------------
        //Car models section
        //------------------------------------------------------------------------------------------------------
        JsonParserModels modelId = new JsonParserModels();
        String modelPath = mainPath + brandFileNameOut;
        String modelFileNameOut = "Error";
        String model = new String();
        String year = new String();

        while (modelFileNameOut == "Error") {
            System.out.println("Wprowadź nazwę modelu lub wybierz z listy i wprowadź przyporządkowany jej numer:\r\n1. ASTRA G kombi");
            String modelSelection = scanner.nextLine();
            System.out.println("Wprowadź rok produkcji:");
            year = scanner.nextLine();


            if (modelSelection.length() == 1) {
                switch (modelSelection) {
                    case "1":
                        model = "ASTRA G kombi";
                        break;
                    default:
                        model = "Error";
                        break;
                }
            } else {
                model = modelSelection;
            }

            modelFileNameOut = modelId.searchCarId(modelPath + ".json", model, Integer.parseInt(year));
        }
        //------------------------------------------------------------------------------------------------------
        //CEngines and fuel section
        //------------------------------------------------------------------------------------------------------
        String engineFileNameOut = "Error";

        while(engineFileNameOut=="Error") {

            System.out.println("Wpisz numer przyporządkowany właściwemu silnikowi:");

            HashMap<Integer, String> engineIdsMap = listAllEngineTypes(mainPath + modelFileNameOut + ".json");

            String engineSelection = scanner.nextLine();
            while (Integer.parseInt(engineSelection) > (engineIdsMap.size() - 1) || Integer.parseInt(engineSelection) < 0) {
                System.out.println("Wpisz numer przyporządkowany właściwemu silnikowi:");
                engineSelection = scanner.nextLine();
            }

            engineFileNameOut = engineIdsMap.get(Integer.parseInt(engineSelection));
        }
        JsonParserEngine engine = new JsonParserEngine();
        String engineName = engine.searchEngineType(mainPath + modelFileNameOut + ".json", engineFileNameOut);

        Car car = new Car();
        car.setBrandName(brand);
        car.setBrandId(brandFileNameOut);
        car.setModelId(modelFileNameOut);
        car.setModelName(model);
        car.setProductionYear(Integer.parseInt(year));
        car.setTypeId(engineFileNameOut);
        car.setTypeName(engineName);

        System.out.println(car);

        return car;
    }
}








