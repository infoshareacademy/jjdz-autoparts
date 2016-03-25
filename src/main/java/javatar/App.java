package javatar;

import javatar.model.Autopart;
import javatar.model.Car;
import javatar.model.CarFromAztec;
import javatar.service.AllegroClassGenerator;
import javatar.service.AutopartIdentification;
import javatar.service.CarIdentification;
import javatar.service.JsonParserAztecCode;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        // JsonParserAztecCode car1 = new JsonParserAztecCode("6m7i1");
        //car1.getUserCar("kjsm4");


        int userAnswer = Hello();
        try {
            Car userCar = CreateCar(userAnswer);
            Autopart userAutopart;
            AutopartIdentification partFinder = new AutopartIdentification();
            userAutopart = partFinder.diagnoseAutopart(userCar);
            String categoryName = userAutopart.getCategoryList().stream().toString();
            //  System.out.println(userAutopart.toString());


            System.out.println("Kategoria allegro: ");
            AllegroClassGenerator allegroClassGenerator = new AllegroClassGenerator();
            String s = allegroClassGenerator.MatchCategories(userAutopart);
            System.out.print("Motoryzacja -> Części samochodowe" + s);


        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
            System.exit(-1);
        }

//
//        /// TODO: 12.03.16 parsowanie xml i pobarnie kategorii
//        // TODO: 12.03.16 znalezienie kategorii z autopart w xml


    }


    private static int Hello() {
        String message = "Wybierz metodę wprowadzania w wprowadź odpowiednią cyfrę:\r\n1. Aztec 2d code\r\n2. Na podstawie serii pytań";
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        while (answer != 1 && answer != 2) {
            System.out.println(message);
            answer = scanner.nextInt();
        }
        return answer;

    }

    private static String GetSessionKey() {
        String message = "Wprowadź kod sesji z aplikacji";
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        while (answer.isEmpty()) {
            System.out.println(message);
            answer = scanner.nextLine();
        }
        return answer;

    }

    private static Car CreateCar(int answer) throws IOException {
        CarIdentification carFinder = new CarIdentification();
        if (answer == 2) {
            return carFinder.FindingCarManagement();

        } else if (answer == 1) {

            JsonParserAztecCode carFromAtenaApi = new JsonParserAztecCode(GetSessionKey());
            Car answerAztec = carFromAtenaApi.getUserCarData(carFromAtenaApi.getUserCar());
            return carFinder.FindingCarByQCCodeAnswear(answerAztec);

        }
        return null;

    }


}


