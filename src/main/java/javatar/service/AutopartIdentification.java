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


    public Autopart findAutopart(Car car) throws IOException {
//
//        Car car = new Car("AC", "iv", "428 Fastback", "399", "7.0", "2h61", 1970);

        Scanner scanner = new Scanner(System.in);
        String mainPath = "src/main/resources/";
        Map categoryMap = new HashMap<>();
        Map autopartMap = new HashMap<>();
        String name;
        AutopartCategory currentCategory;
        Autopart autopart = new Autopart();
        JsonParserAutopartCategories jsonParser;
        JsonDataAutopartCategories dataAutopartCategories;
        String selectedOption;
        JsonAutopart foundAutopart;
        JsonParserAutopart autopartParser;
        JsonDataAutopart jsonDataAutopart;

        String fileName = car.getTypeId();//carId
        String file = mainPath + fileName + ".json";

        jsonParser = new JsonParserAutopartCategories(file);
        dataAutopartCategories = jsonParser.getCategoryList();

        System.out.println("Wybierz kategorię szukanej części: ");

        categoryMap = printCategories(dataAutopartCategories.getData());

        selectedOption = scanner.nextLine();
        if (selectedOption.length() == 1) {
            name = categoryMap.get(Integer.parseInt(selectedOption.toString())).toString();
        } else {
            name = selectedOption;
        }

        currentCategory = jsonParser.searchCategoryId(name, dataAutopartCategories);
        autopart.addCategoryToList(currentCategory);


        while (currentCategory.isHas_children()) {

            System.out.println("Wybierz kategorię szukanej części: ");
            file = mainPath + currentCategory.getId() + ".json";
            jsonParser = new JsonParserAutopartCategories(file);
            dataAutopartCategories = jsonParser.getCategoryList();


            categoryMap = printCategories(dataAutopartCategories.getData());

            selectedOption = scanner.nextLine();
            if (selectedOption.length() == 1) {
                name = categoryMap.get(Integer.parseInt(selectedOption.toString())).toString();
            } else {
                name = selectedOption;
            }

            currentCategory = jsonParser.searchCategoryId(name, dataAutopartCategories);
            autopart.addCategoryToList(currentCategory);
        }

        System.out.println("Wybierz część: ");
        file = mainPath + currentCategory.getId() + ".json";
        autopartParser = new JsonParserAutopart(file);
        jsonDataAutopart = autopartParser.getAutopartList();

        autopartMap = printAutoparts(jsonDataAutopart.getData());

        selectedOption = scanner.nextLine();

        if (selectedOption.length() == 1) {
            name = autopartMap.get(Integer.parseInt(selectedOption.toString())).toString();
        } else {
            name = selectedOption;
        }

        foundAutopart = autopartParser.searchAutopartId(name, jsonDataAutopart);

        autopart.setPartName(foundAutopart.getName());
        autopart.setPartBrand(foundAutopart.getBrand_clear());
        autopart.setPartId(foundAutopart.getNumber_clear());

        System.out.println("Twoja część: ");
        System.out.println("Nazwa: " + autopart.getPartName());
        System.out.println("Producent: " + autopart.getPartBrand());
        System.out.println("Numer: " + autopart.getPartId());
        System.out.println("Kategorie: ");
        int categoryNumber = 1;
        for (AutopartCategory ac: autopart.getCategoryList()) {
            System.out.println(new Integer(categoryNumber).toString() + ". " + ac.getName());
            categoryNumber++;
        }
        System.out.println("The End");

        return autopart;
    }

    public static Map printCategories(Collection<AutopartCategory> autopartCategories) {
        int i = 1;

        Map catMap = new HashMap<>();

        catMap.clear();

        for (AutopartCategory ac : autopartCategories) {
            String counter = new Integer(i).toString();
            catMap.put(i, ac.getName());
            System.out.println(counter + ". " + catMap.get(i));
            i++;
        }

        return catMap;
    }

    public static Map printAutoparts(Collection<JsonAutopart> autoparts) {
        int i = 1;

        Map partMap = new HashMap<>();

        partMap.clear();

        for (JsonAutopart ja : autoparts) {
            String counter = new Integer(i).toString();
            partMap.put(i, ja.getName());
            System.out.println(counter + ". " + partMap.get(i));
            i++;
        }

        return partMap;
    }
}
