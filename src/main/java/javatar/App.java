package javatar;

import javatar.model.Autopart;
import javatar.model.Car;
import javatar.service.*;

import java.io.FileNotFoundException;

public class App {

    public static void main(String[] args) throws Exception {

        ReadingUserInput userInput = new ReadingUserInput();
        ProcessingUserInput processingUserInput = new ProcessingUserInput();
        int userAnswer = userInput.Hello();

//        try {
//            Car userCar = processingUserInput.CreateCar(userAnswer);
//            Autopart userAutopart;
//            AutopartIdentification partFinder = new AutopartIdentification();
//            userAutopart = partFinder.diagnoseAutopart(userCar);
//
//            System.out.println("Kategoria allegro: ");
//            AllegroCategoryFinder allegroClassGenerator = new AllegroCategoryFinder();
//            String s = allegroClassGenerator.matchCategories(userAutopart);
//            System.out.println("Motoryzacja -> Części samochodowe" + s);
//
//            String allegroSearch = userAutopart.getBrand() + " " + userAutopart.getId();
//            System.out.println("Tekst do wpisania w wyszukuwarkę: " + allegroSearch);
//
//        } catch (FileNotFoundException e) {
//            System.out.println("Nie znaleziono pliku");
//            System.exit(-1);
//        }

    }


}


