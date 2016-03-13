package javatar.service;

import javatar.model.Car;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class CarIdentification {

    public CarIdentification() {
    }

//    public void main(String[] args) throws IOException {
//
//        System.out.println("Wybierz metodę wprowadzania w wprowadź odpowiednią cyfrę:\r\n1. QC code\r\n2. Na podstawie serii pytań");
//        Scanner scanner = new Scanner(System.in);
//        Integer answear = scanner.nextInt();
//        if (answear == 2) {
//            Car carReturned = FindingCarManagement();
//        } else {
////            TODO QR code to be called
////            Car answearQR =
////            Car carReturned = FindingCarByQCCodeAnswear(answearQR);
//        }
//    }

    public Car FindingCarByQCCodeAnswear(Car carIn) throws FileNotFoundException {
        String mainPath = "src/main/resources/";
        String brandFileNameOut = "Error";
        JsonParserBrands brandFileName = new JsonParserBrands();

        String brand = carIn.getBrandName();
        brandFileNameOut = brandFileName.searchCarId(brand);

        JsonParserModels modelId = new JsonParserModels(mainPath + brandFileNameOut + ".json");

        String modelFileNameOut = "Error";
        String model = carIn.getModelName();
        Integer year = carIn.getProductionYear();
        String engineFileNameOut = "Error";
        JsonParserEngine engine = new JsonParserEngine(mainPath + modelFileNameOut + ".json");

        modelFileNameOut = modelId.searchCarId(model, year);

        String engineName = engine.searchEngineType(engineFileNameOut);


        Car car = new Car();
        car.setBrandName(brand);
        car.setBrandId(brandFileNameOut);
        car.setModelId(modelFileNameOut);
        car.setModelName(model);
        car.setProductionYear(year);
        car.setTypeId(engineFileNameOut);
        car.setTypeName(engineName);

        System.out.println(car);

        return car;
    }

    public Car FindingCarManagement() throws IOException {
        String brand = new String();
        String mainPath = "src/main/resources/";
        Scanner scanner = new Scanner(System.in);
        JsonParserBrands brandFileName = new JsonParserBrands();
        String brandFileNameOut = "Error";

        //------------------------------------------------------------------------------------------------------
        //Car brands section
        //------------------------------------------------------------------------------------------------------
        //while (brandFileNameOut == "Error") {
            System.out.println("Wprowadź nazwę marki lub wybierz z listy i wprowadź przyporządkowany jej numer:\r\n1. OPEL\r\n2. VOLKSWAGEN");
            String brandSelection = scanner.nextLine();

            if (brandSelection.length() == 1) {
                switch (brandSelection) {
                    case "1":
                        brand = "OPEL";
                        break;
                    case "2":
                        brand = "VOLKSWAGEN";
                        break;
                    default:
                        brand = "Error";
                        break;
                }
            } else {
                brand = brandSelection;
            }


            brandFileNameOut = brandFileName.searchCarId(brand);
       // }

        //------------------------------------------------------------------------------------------------------
        //Car models section
        //------------------------------------------------------------------------------------------------------
        JsonParserModels modelId = new JsonParserModels(mainPath + brandFileNameOut + ".json");
        String modelPath = mainPath + brandFileNameOut;
        String modelFileNameOut = "Error";
        String model = new String();
        String year = new String();

        //while (modelFileNameOut == "Error") {
            System.out.println("Wprowadź nazwę modelu lub wybierz z listy i wprowadź przyporządkowany jej numer:\r\n1. ASTRA G kombi\r\n2. JETTA VII SportWagon");
            String modelSelection = scanner.nextLine();
            System.out.println("Wprowadź rok produkcji:");
            year = scanner.nextLine();


            if (modelSelection.length() == 1) {
                switch (modelSelection) {
                    case "1":
                        model = "ASTRA G kombi";
                        break;
                    case "2":
                        model = "JETTA VII SportWagon";
                        break;
                    default:
                        model = "Error";
                        break;
                }
            } else {
                model = modelSelection;
            }

            modelFileNameOut = modelId.searchCarId(model, Integer.parseInt(year));
       // }
        //------------------------------------------------------------------------------------------------------
        //CEngines and fuel section
        //------------------------------------------------------------------------------------------------------
        String engineFileNameOut = "Error";
        final JsonParserEngine engine = new JsonParserEngine(mainPath + modelFileNameOut + ".json");

        while (engineFileNameOut == "Error") {

            System.out.println("Wpisz numer przyporządkowany właściwemu silnikowi:");

            HashMap<Integer, String> engineIdsMap = engine.listAllEngineTypes();
            String engineSelection = scanner.nextLine();

            while (Integer.parseInt(engineSelection) > (engineIdsMap.size() - 1) || Integer.parseInt(engineSelection) < 0) {
                System.out.println("Wpisz numer przyporządkowany właściwemu silnikowi:");
                engineSelection = scanner.nextLine();
            }

            engineFileNameOut = engineIdsMap.get(Integer.parseInt(engineSelection));
        }

        JsonParserEngine engine1 = new JsonParserEngine(mainPath + modelFileNameOut + ".json");
        //TODO dopytaj dlaczego nie możesz tu skorzystać z engine
        String engineName = engine1.searchEngineType(engineFileNameOut);


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








