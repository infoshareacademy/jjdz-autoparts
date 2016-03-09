package javatar.service;

import javatar.model.Car;
import javatar.model.DataCarsEngineAndFuel;

import java.io.IOException;
import java.util.Scanner;

import static javatar.service.JsonParserEngine.listAllEngineTypes;

public class CarIdentification {
    public static void main(String[] args) throws IOException {

        FindingCarManagement();
    }

    public static Car FindingCarManagement() throws IOException {
        String brand = new String();
        String mainPath = "src/main/java/javatar/resources/";
        System.out.println("Wprowadź nazwę marki lub wybierz z listy i wprowadź przyporządkowany jej numer:\r\n1. OPEL");
        Scanner scanner = new Scanner(System.in);
        String brandSelection = scanner.nextLine();

        if (brandSelection.length() == 1) {
            switch (brandSelection) {
                case "1":
                    brand = "OPEL";
                    break;
                default:
                    brand = "";
            }
        } else {
            brand = brandSelection;
        }
        JsonParserBrands brandFileName = new JsonParserBrands();
        String path = mainPath + "v2.json";
        String brandFileNameOut = brandFileName.searchCarId(path, brand);

        JsonParserModels modelId = new JsonParserModels();
        String modelPath = mainPath + brandFileNameOut;

        System.out.println("Wprowadź nazwę modelu lub wybierz z listy i wprowadź przyporządkowany jej numer:\r\n1. ASTRA G kombi");
        String modelSelection = scanner.nextLine();
        System.out.println("Wprowadź rok produkcji");
        String year = scanner.nextLine();
        String model = new String();

        if (modelSelection.length() == 1) {
            switch (modelSelection) {
                case "1":
                    model = "ASTRA G kombi";
                    break;
                default:
                    model = "";
            }
        } else {
            model = modelSelection;
        }

        String modelFileNameOut = modelId.searchCarId(modelPath + ".json", model, Integer.parseInt(year));

        System.out.println("Wpisz ID silnika wyświetlane na końcu linii");

        listAllEngineTypes(mainPath + modelFileNameOut + ".json");


        String engineSelection = scanner.nextLine();
        JsonParserEngine engineId = new JsonParserEngine();
        String EgineFileNameOut = engineId.searchCarId(mainPath +modelFileNameOut+ ".json", engineSelection);



        System.out.println(EgineFileNameOut);

        Car car = new Car();
        car.setBrandName(brand);
        car.setBrandId(brandFileNameOut);
        car.setModelId(modelFileNameOut);
        car.setModelName(model);
        car.setProductionYear(Integer.parseInt(year));

        System.out.println(car);

        return car;
    }
}








