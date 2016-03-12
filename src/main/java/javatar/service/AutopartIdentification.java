package javatar.service;


import javatar.model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AutopartIdentification {
    //
    private Autopart autopart;
    private Car car;

    public AutopartIdentification(Autopart autopart, Car car) {
        this.autopart = autopart;
        this.car = car;
    }

    public AutopartCategory chooseCategory(List<AutopartCategory> categories) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        AutopartCategory category = null;
        String userChoice = null;

        int i = 1;

        for (AutopartCategory c : categories) {
            System.out.println(i + ". " + c.getName());
            i++;
        }
        System.out.println("podaj nazwę kategorii z listy: ");
        userChoice = br.readLine();

        for (AutopartCategory c : categories) {
            if (userChoice.equals(c.getName())) {
                return c;
            }
        }

        return category;
    }


    public static void main(String[] args) throws IOException {

        Car car = new Car("AC", "iv", "428 Fastback", "399", "7.0", "2h61", 1970);
        //// TODO: 10.03.16 pobranie samochodu z funkcji Anety 

        Scanner scanner = new Scanner(System.in);
        String mainPath = "src/main/resources/";
        String fileName = car.getTypeId();//carId
        String file = mainPath + fileName + ".json";
        String categoryName = fileName;
        AutopartCategory currentCategory;
        JsonParserAutopartCategories jsonParser = new JsonParserAutopartCategories(file);

        JsonDataAutopartCategories dataAutopartCategories = jsonParser.getCategoryList();
        Autopart autopart = new Autopart();
        Map catMap = new HashMap<>();
//        AutopartCategory chosenCategory;
//        AutopartIdentification autopartIdentification = new AutopartIdentification(autopart, car);

        System.out.println("Pomóż nam pomóc sobie!");

        System.out.println("wybierz kategorię szukanej części: ");
//        Collection<AutopartCategory> autopartCategories = dataAutopartCategories.getData();

        catMap = printCategories(dataAutopartCategories.getData());

        String selectedCategory = scanner.nextLine();
        if (selectedCategory.length() == 1) {
            categoryName = (String) catMap.get(Integer.parseInt(selectedCategory.toString()));
        } else {
            categoryName = selectedCategory;
        }

        currentCategory = jsonParser.searchCategoryId(categoryName, dataAutopartCategories);
//        fileName = jsonParser.searchCategoryId(categoryName, dataAutopartCategories);


        while (currentCategory.isHas_children()) {

            System.out.println("wybierz kategorię szukanej części: ");
            file = mainPath + currentCategory.getId() + ".json";
            jsonParser = new JsonParserAutopartCategories(file);
            dataAutopartCategories = jsonParser.getCategoryList();


            catMap = printCategories(dataAutopartCategories.getData());

            selectedCategory = scanner.nextLine();
            if (selectedCategory.length() == 1) {
                categoryName = (String) catMap.get(Integer.parseInt(selectedCategory.toString()));
            } else {
                categoryName = selectedCategory;
            }

            currentCategory = jsonParser.searchCategoryId(categoryName, dataAutopartCategories);

            // TODO: 28.02.16 zapisanie kategorii z jsona do "categories"

//            //tymczasowa lista kategorii poziom
//            AutopartCategory cat1 = new AutopartCategory("Silnik", "7sz", true);
//            AutopartCategory cat2 = new AutopartCategory("Filtr", "7t2", true);
//            AutopartCategory cat3 = new AutopartCategory("Układ hamulcowy", "7t3", true);
//            AutopartCategory cat4 = new AutopartCategory("Zawieszenie", "7t8", false);
//            categories = new ArrayList<AutopartCategory>();
//            categories.add(cat1);
//            categories.add(cat2);
//            categories.add(cat3);
//            categories.add(cat4);
//
//            chosenCategory = autopartIdentification.chooseCategory(categories);
//            autopart.addCategoryToList(chosenCategory);
//            System.out.println("Wybrałeś: "+chosenCategory.getName());
//            categoryHasChildren = chosenCategory.isHas_children();
//            //infinite loop protection
//            if(i == 2) {
//                break;
//            } else {
//                i++;
//            }
        }

        // TODO: 28.02.16 wyświetl możliwe części

        System.out.println("koniec");

    }

    public static Map printCategories(Collection<AutopartCategory> autopartCategories) {
        int i = 1;

        Map catMap = new HashMap<>();

        catMap.clear();

        for (AutopartCategory ac :
                autopartCategories) {
            String counter = new Integer(i).toString();
            catMap.put(i, ac.getName());
            System.out.println(counter + ". " + catMap.get(i));
            i++;
        }

        return catMap;
    }
}
