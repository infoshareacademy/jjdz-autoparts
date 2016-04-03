package javatar.service;

import com.sun.xml.internal.bind.v2.TODO;
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

       // for (int k = 0; k < autopartCategoryList.size(); k++) {


             for (AutopartCategory p :
                     autopartCategoryList) {
            //AutopartCategory p = autopartCategoryList.get(k);
            System.out.println(p.getName());
                 System.out.println(parentId);
            List<AllegroCategories> blist = allegroCategoriesList.stream()
                    .filter(category -> category.getCatName().contentEquals(p.getName()))
                    .filter(
                            category -> category.getCatParent() == parentId
                    )
                    .collect(Collectors.toList());
            System.out.println(blist.toString());
            if (blist.size() != 0) {
                AllegroCategories tmp = blist.get(0);
                parentId = tmp.getCatId();
                returnedData = returnedData + " -> " + tmp.getCatName();
            }
//                 TODO dlaczego nie działa ostatni poziom filtrowania?
        }

        return returnedData;
    }
}
