package javatar.service;

import java.io.IOException;
import java.util.Scanner;

public class CarIdentification {
    public static void main(String[] args) throws IOException {

        FindingCarManagement();
    }

    public static String FindingCarManagement() throws IOException {
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
        Scanner scannerModel = new Scanner(System.in);
        String modelSelection = scannerModel.nextLine();
        System.out.println("Wprowadź rok produkcji");
        Scanner scannerYear = new Scanner(System.in);
        Integer year = scannerYear.nextInt();
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

        String modelFileNameOut = modelId.searchCarId(modelPath+".json",model,year);


        //TODO foreach loop


        System.out.println(brandFileNameOut);
        System.out.println(modelFileNameOut);
        return brandFileNameOut;
    }
}








