package javatar.service;


import javatar.model.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class AutopartIdentification {

    public static final int NUMERIC_OPTION_LENGTH = 1;
    public static final String MAIN_PATH = "src/main/resources/json_data/";

    public AutopartIdentification() {
    }

    public Autopart diagnoseAutopart(Car car) throws IOException {

        AutopartCategory currentCategory;
        Autopart autopart;
        List<AutopartCategory> partCategoryList = new ArrayList<>();

        String fileName = car.getTypeId();
        String file = MAIN_PATH + fileName + ".json";

        currentCategory = findCategory(file);
        partCategoryList.add(currentCategory);

        while (currentCategory.isHas_children()) {
            file = MAIN_PATH + currentCategory.getId() + ".json";

            currentCategory = findCategory(file);
            partCategoryList.add(currentCategory);
        }

        file = MAIN_PATH + currentCategory.getId() + ".json";

        autopart = findAutopart(file);

        autopart.setCategoryList(partCategoryList);

        System.out.println("Twoja część: ");
        System.out.println("Nazwa: " + autopart.getName());
        System.out.println("Producent: " + autopart.getBrand());
        System.out.println("Numer: " + autopart.getId());
        System.out.println("Kategorie: ");
        int categoryNumber = 1;
        for (AutopartCategory ac : autopart.getCategoryList()) {
            System.out.println(new Integer(categoryNumber).toString() + ". " + ac.getName());
            categoryNumber++;
        }

        return autopart;
    }

    public Autopart findAutopart(String file) throws FileNotFoundException {
        Autopart autopart = new Autopart();
        JsonParserAutopart autopartParser;
        JsonDataAutopart jsonDataAutopart;
        Map autopartMap;
        Scanner scanner = new Scanner(System.in);
        String selectedOption;
        String name;

        autopartParser = new JsonParserAutopart(file);
        jsonDataAutopart = autopartParser.getAutopartList();

        System.out.println("Wybierz część: ");
        autopartMap = printAutoparts(jsonDataAutopart.getData());

        selectedOption = scanner.nextLine();

        if (selectedOption.length() == NUMERIC_OPTION_LENGTH) {
            name = autopartMap.get(Integer.parseInt(selectedOption.toString())).toString();
        } else {
            name = selectedOption;
        }

        JsonAutopart foundAutopart = autopartParser.searchAutopartId(name, jsonDataAutopart);

        autopart.setName(foundAutopart.getName());
        autopart.setBrand(foundAutopart.getBrand_clear());
        autopart.setId(foundAutopart.getNumber_clear());

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
