package javatar.service;


import javatar.model.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class AutopartIdentification {

    public AutopartIdentification() {
    }

    public Autopart findAutopart(Car car) throws IOException {
//
//        Car car = new Car("AC", "iv", "428 Fastback", "399", "7.0", "2h61", 1970);

        Scanner scanner = new Scanner(System.in);
        String mainPath = "src/main/resources/";
        Map autopartMap;
        String name;
        AutopartCategory currentCategory;
        Autopart autopart = new Autopart();
        String selectedOption;
        JsonAutopart foundAutopart;
        JsonParserAutopart autopartParser;
        JsonDataAutopart jsonDataAutopart;

        String fileName = car.getTypeId();//carId
        String file = mainPath + fileName + ".json";

        currentCategory = findCategory(file);
        autopart.addCategoryToList(currentCategory);

        while (currentCategory.isHas_children()) {
            file = mainPath + currentCategory.getId() + ".json";

            currentCategory = findCategory(file);
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
        for (AutopartCategory ac : autopart.getCategoryList()) {
            System.out.println(new Integer(categoryNumber).toString() + ". " + ac.getName());
            categoryNumber++;
        }
        System.out.println("The End");

        return autopart;
    }

    public AutopartCategory findCategory(String file) throws FileNotFoundException {
        String name;
        Map categoryMap;
        JsonParserAutopartCategories jsonParser;
        JsonDataAutopartCategories dataAutopartCategories;

        jsonParser = new JsonParserAutopartCategories(file);
        dataAutopartCategories = jsonParser.getCategoryList();

        System.out.println("Wybierz kategorię szukanej części: ");
        categoryMap = printCategories(dataAutopartCategories.getData());

        Scanner scanner = new Scanner(System.in);
        String selectedOption = scanner.nextLine();
        if (selectedOption.length() == 1) {
            name = categoryMap.get(Integer.parseInt(selectedOption.toString())).toString();
        } else {
            name = selectedOption;
        }
        return jsonParser.searchCategoryId(name, dataAutopartCategories);
    }

    public Map printCategories(Collection<AutopartCategory> autopartCategories) {
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

    public Map printAutoparts(Collection<JsonAutopart> autoparts) {
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
