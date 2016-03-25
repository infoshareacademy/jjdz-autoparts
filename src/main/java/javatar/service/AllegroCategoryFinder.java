package javatar.service;

import javatar.model.AllegroCategories;
import javatar.model.Autopart;
import javatar.model.AutopartCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllegroCategoryFinder {

    XMLParser xmlParser = new XMLParser();
    int parentId = 620;

    public String MatchCategories(Autopart autopart) throws Exception {

        List<AutopartCategory> autopartCategoryList = autopart.getCategoryList();
        Map<Integer, AllegroCategories> allegroCategoriesMap = xmlParser.AllegroCategoryObject();
        List<AllegroCategories> allegroCategoriesList = new ArrayList<>();
        String returnedData = "";

        for (int i = 0; i < allegroCategoriesMap.size(); i++) {
            if (allegroCategoriesMap.get(i) != null) {
                allegroCategoriesList.add(allegroCategoriesMap.get(i));
            }
        }

        for (AutopartCategory p :
                autopartCategoryList) {
            List<AllegroCategories> blist = allegroCategoriesList.stream()
                    .filter(category -> category.getCatName().contentEquals(p.getName()))
                    .collect(Collectors.toList());
            System.out.println(p.getName());
            System.out.println(blist.toString());

            for (AllegroCategories filteredElements
                    : blist
                    ) {

                if (filteredElements.getCatParent() == parentId) {
                    returnedData = returnedData + " -> " + filteredElements.getCatName();
                    parentId = filteredElements.getCatId();
                }

            }
        }

        return returnedData;
    }
}
