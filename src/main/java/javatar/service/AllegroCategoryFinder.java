package javatar.service;


import javatar.model.AllegroCategories;
import javatar.model.Autopart;
import javatar.model.AutopartCategory;
import javatar.model.MappingHashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
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
        if (outputCategories.size() > 1) {
            returnedData = outputCategories.get(outputCategories.size() - 2) + " " + outputCategories.get(outputCategories.size() - 1) + ";" + parentId;
        } else if (outputCategories.size() > 0) {
            returnedData = outputCategories.get(outputCategories.size() - 1) + ";" + parentId;
        } else {
            returnedData = ";" + parentId;
        }
        return returnedData;

    }

    public String MatchCategoryFromHashMap(Autopart autopart) {
        List<AutopartCategory> autopartCategoryList = autopart.getCategoryList();
        MappingHashmap xmlAllegroCategoriesMap = new MappingHashmap();
        Integer categoryId = 0;
        Integer tmpCategoryId = 0;
        List<AutopartCategory> outputAutopartCategoryList = new ArrayList<>();
        AutopartCategory autopartCategory = new AutopartCategory();
        List<String> outputCategories = new ArrayList<>();
        String returnedData = "";
        List<AllegroCategories> allegroCategoriesList = new ArrayList<>();

        try {
            allegroCategoriesList = xmlParser.AllegroCategoryObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (AutopartCategory p :
                autopartCategoryList) {
            tmpCategoryId = xmlAllegroCategoriesMap.JsonXmlMapping.get(p.getName());
            if (tmpCategoryId != null && !outputAutopartCategoryList.contains(tmpCategoryId)) {
                autopartCategory.setName(p.getName());
                autopartCategory.setId(tmpCategoryId.toString());
                outputAutopartCategoryList.add(autopartCategory);
                p.setId(tmpCategoryId.toString());
                final Integer ccc = tmpCategoryId;
                List<AllegroCategories> collect = allegroCategoriesList.stream().filter(cat -> cat.getCatId().equals(ccc)).collect(Collectors.toList());
                p.setName(collect.get(0).getCatName());
            }
        }

        autopart.setCategoryList(autopartCategoryList);

        try {
            returnedData = MatchCategories(autopart);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return returnedData;
    }


}
