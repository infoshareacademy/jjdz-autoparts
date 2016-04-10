package javatar;

import javatar.model.Autopart;
import javatar.model.Car;
import javatar.service.*;

import java.io.FileNotFoundException;

public class App {

    public static void main(String[] args) throws Exception {

        // JsonParserAztecCode car1 = new JsonParserAztecCode("6m7i1");
        //car1.getUserCar("kjsm4");

        ReadingUserInput userInput = new ReadingUserInput();
        ProcessingUserInput processingUserInput = new ProcessingUserInput();
        int userAnswer = userInput.Hello();
        try {
            Car userCar = processingUserInput.CreateCar(userAnswer);
            Autopart userAutopart;
            AutopartIdentification partFinder = new AutopartIdentification();
            userAutopart = partFinder.diagnoseAutopart(userCar);
            String categoryName = userAutopart.getCategoryList().stream().toString();
            //  System.out.println(userAutopart.toString());


            System.out.println("Kategoria allegro: ");
            AllegroCategoryFinder allegroClassGenerator = new AllegroCategoryFinder();
            String s = allegroClassGenerator.MatchCategories(userAutopart);
            System.out.println("Motoryzacja -> Części samochodowe" + s);

            String allegroSearch = userAutopart.getPartBrand() + " " + userAutopart.getPartId();
            System.out.println("Tekst do wpisania w wyszukuwarkę: " + allegroSearch);


        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
            System.exit(-1);
        }

//
//        /// TODO: 12.03.16 parsowanie xml i pobarnie kategorii
//        // TODO: 12.03.16 znalezienie kategorii z autopart w xml


    }


}


