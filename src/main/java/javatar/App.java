package javatar;

import javatar.model.Autopart;
import javatar.model.Car;
import javatar.model.CarFromAztec;
import javatar.service.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        // JsonParserAztecCode car1 = new JsonParserAztecCode("6m7i1");
        //car1.getUserCar("kjsm4");

        ReadingUserInput userInput = new ReadingUserInput();
        int userAnswer = userInput.Hello();
        try {
            Car userCar = userInput.CreateCar(userAnswer);
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





}


