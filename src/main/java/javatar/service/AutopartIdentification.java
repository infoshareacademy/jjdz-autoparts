package javatar.service;


import javatar.model.Autopart;
import javatar.model.Car;
import javatar.model.Category;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AutopartIdentification {
//
    private Autopart autopart;
    private Car car;

    public AutopartIdentification(Autopart autopart, Car car) {
        this.autopart = autopart;
        this.car = car;
    }

    public Category chooseCategory (List<Category> categories) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Category category = null;
        String userChoice = null;

        int i = 1;

        for(Category c: categories){
            System.out.println(i+". "+c.getCategoryName());
            i++;
        }
        System.out.println("podaj nazwę kategorii z listy: ");
        userChoice = br.readLine();

        for(Category c: categories){
            if (userChoice.equals(c.getCategoryName())) {
                return c;
            }
        }

        return category;
    }


    public static void main(String[] args) throws IOException {

        Car car = new Car("AC", "iv", "428 Fastback", "399", "7.0", "9lg", 1970);
        Autopart autopart = new Autopart();
        List<Category> categories;
        boolean categoryHasChildren = true;
        Category chosenCategory;
        AutopartIdentification autopartIdentification = new AutopartIdentification(autopart, car);

        System.out.println("Pomóż nam pomóc sobie!");



        int i=0;

        while (categoryHasChildren){

            System.out.println("wybierz kategorię szukanej części: ");
            // TODO: 28.02.16 zapisanie kategorii z jsona do "categories"
            //tymczasowa lista kategorii poziom
            Category cat1 = new Category("Silnik", "7sz", true);
            Category cat2 = new Category("Filtr", "7t2", true);
            Category cat3 = new Category("Układ hamulcowy", "7t3", true);
            Category cat4 = new Category("Zawieszenie", "7t8", false);
            categories = new ArrayList<Category>();
            categories.add(cat1);
            categories.add(cat2);
            categories.add(cat3);
            categories.add(cat4);

            chosenCategory = autopartIdentification.chooseCategory(categories);
            autopart.addCategoryToList(chosenCategory);
            System.out.println("Wybrałeś: "+chosenCategory.getCategoryName());
            categoryHasChildren = chosenCategory.isHasChildren();
            //infinite loop protection
            if(i == 2) {
                break;
            } else {
                i++;
            }
        }

        // TODO: 28.02.16 wyświetl możliwe części
        
        System.out.println("koniec");

    }
}
