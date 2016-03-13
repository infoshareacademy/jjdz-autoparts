package javatar.service;

import javatar.model.AllegroCategories;
import javatar.model.Autopart;
import javatar.model.AutopartCategory;
import javatar.model.Car;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AllegroClassGenerator {

    CarIdentification car = new CarIdentification();
    AutopartIdentification part = new AutopartIdentification();
    XMLParser xmlParser = new XMLParser();

    public String MatchCategories(Autopart autopart) throws Exception {

        List<AutopartCategory> categoryList = autopart.getCategoryList();
        AutopartCategory autopartCategoryName = categoryList.get(0);
        String CategoryName = autopartCategoryName.getName();
        String allegroCategoryLvl1 = "";
        Map<Integer, AllegroCategories> allegroCategoriesMap = xmlParser.AllegroCategoryObject();
        AutopartCategory CategoryNextLevel = new AutopartCategory();
        int categoryId = 0;
        String allegroCategoryNext = "";

        for (int i = 0; i < allegroCategoriesMap.size(); i++) {
            AllegroCategories categories = allegroCategoriesMap.get(i);
            if (categories != null) {

                if ((CategoryName.contains(categories.getCatName())) && (categories.getCatParent() == 620)) {
                    allegroCategoryLvl1 = categories.getCatName();
                    categoryId = categories.getCatId();


                }
            }


            if (categoryList.size() > 0) {
                for (int k = 1; k < categoryList.size(); k++) {
                    CategoryNextLevel = categoryList.get(k);
                    if (categories != null) {
                        if (CategoryNextLevel.getName().contains(categories.getCatName()) && categories.getCatParent() == categoryId) {
                            allegroCategoryNext = categories.getCatName();
                            allegroCategoryLvl1 = allegroCategoryLvl1 + " -> " + allegroCategoryNext;
                        }
                    }
                }
            }
        }

        String returnCategory = " -> "+allegroCategoryLvl1;

        return returnCategory;
    }


}
