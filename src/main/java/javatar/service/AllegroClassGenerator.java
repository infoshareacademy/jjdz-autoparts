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

    public void MatchCategories(Autopart autopart) throws Exception {

        List<AutopartCategory> categoryList = autopart.getCategoryList();
        AutopartCategory autopartCategoryName = categoryList.get(0);
        String CategoryName = autopartCategoryName.getName();
        Map<Integer, AllegroCategories> allegroCategoriesMap = xmlParser.AllegroCategoryObject();

//        Map<Integer, AllegroCategories> categoriesMap = a.AllegroCategoryObject();
//        String pozostale = categoriesMap.get(19024).getCatName();

        for (int i = 0; i < allegroCategoriesMap.size(); i++) {
            AllegroCategories categories = allegroCategoriesMap.get(i);
            if (categories != null) {

                if (CategoryName.contains(categories.getCatName() &)) {



                }


            }
        }

    }
}
