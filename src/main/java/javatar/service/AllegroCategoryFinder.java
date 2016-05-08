package javatar.service;


import javatar.model.AllegroCategories;
import javatar.model.Autopart;
import javatar.model.AutopartCategory;
import javatar.model.MappingHashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AllegroCategoryFinder {

    XMLParser xmlParser = new XMLParser();
    int parentId = 620;

    public String MatchCategories(Autopart autopart) throws Exception {

        List<AutopartCategory> autopartCategoryList = autopart.getCategoryList();
        List<AllegroCategories> allegroCategoriesList = xmlParser.AllegroCategoryObject();
        String returnedData = "";
        List<String> outputCategories = new ArrayList<>();

        for (AutopartCategory p :
                autopartCategoryList) {

            List<AllegroCategories> blist = allegroCategoriesList.stream()
                    .filter(category -> category.getCatName().contentEquals(p.getName()))
                    .filter(
                            category -> category.getCatParent() == parentId
                    )
                    .collect(Collectors.toList());

            if (blist.size() != 0) {
                AllegroCategories tmp = blist.get(0);
                parentId = tmp.getCatId();
                outputCategories.add(tmp.getCatName());
            }

        }
        System.out.println(outputCategories.toString());
        if (outputCategories.size() > 2) {
            returnedData = outputCategories.get(outputCategories.size() - 2) + " " + outputCategories.get(outputCategories.size() - 1) + ";" + parentId;
        } else if (outputCategories.size() > 1) {
            returnedData = outputCategories.get(outputCategories.size() - 1) + ";" + parentId;
        }
        System.out.println(returnedData);
        return returnedData;

    }

    public Autopart MatchCategoryFromHashMap(Autopart autopart) {
        List<AutopartCategory> autopartCategoryList = autopart.getCategoryList();
        MappingHashmap xmlAllegroCategoriesMap = new MappingHashmap();
        Integer categoryId = 0;
        List<AutopartCategory> outputAutopartCategoryList = new ArrayList<>();
        AutopartCategory autopartCategory = new AutopartCategory();

        for (AutopartCategory p :
                autopartCategoryList) {
            Integer tmpCategoryId = xmlAllegroCategoriesMap.JsonXmlMapping.get(p.getName());
            if (tmpCategoryId != null) {
                autopartCategory.setName(p.getName());
                autopartCategory.setId(tmpCategoryId.toString());
                outputAutopartCategoryList.add(autopartCategory);
            }
        }
        if (outputAutopartCategoryList.size() > 0) {
            autopart.setCategoryList(outputAutopartCategoryList);
        }

        return autopart;
    }


}
