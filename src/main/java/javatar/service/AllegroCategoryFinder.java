package javatar.service;

import javatar.model.AllegroCategories;
import javatar.model.Autopart;
import javatar.model.AutopartCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllegroCategoryFinder {

    CarIdentification car = new CarIdentification();
    AutopartIdentification part = new AutopartIdentification();
    XMLParser xmlParser = new XMLParser();

    public String MatchCategories(Autopart autopart) throws Exception {

        List<AutopartCategory> autopartCategoryList = autopart.getCategoryList();
        Map<Integer, AllegroCategories> allegroCategoriesMap = xmlParser.AllegroCategoryObject();
        List<AllegroCategories> allegroCategoriesList = new ArrayList<>();

        int iter = 0;

        for (int i = 0; i < allegroCategoriesMap.size(); i++) {
            allegroCategoriesList.add(allegroCategoriesMap.get(i));
            System.out.println(allegroCategoriesList.toString());
            i++;
        }

        for (AutopartCategory p :
                autopartCategoryList) {
            List<AllegroCategories> blist = allegroCategoriesList.stream()
                    .filter(category -> category.getCatName().contentEquals(p.getName()))
                    .collect(Collectors.toList());
            System.out.println(blist.toString());
        }


        return "";
    }
}
