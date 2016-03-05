package javatar.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CarIdentification {

    private String FirstStep () {
        return "";
    }


    public String FindingCarManagement() throws IOException {
        String brand = new String();
        String mainPath = "src/main/java/javatar/reasources/";
        System.out.println("Wybierz markę z listy i wprowadź przyporządkowany jej numer:\r\n1. OPEL");
        //String readBuffer = System.in.toString();
        Scanner scanner = new Scanner(System.in);
        String modelNumber = scanner.nextLine();

        switch(modelNumber){
            case "1": brand = "OPEL"; break;
            default: brand = "";
        }

        JsonParserModels brandFileName = new JsonParserModels();
        String path = mainPath +"v2.json";
        String brandFileNameOut = brandFileName.searchCarId(brand,path);
        System.out.println(brandFileNameOut);

        return brandFileNameOut;
    }



}








