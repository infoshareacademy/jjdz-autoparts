package javatar.service;


import javatar.model.AllegroCategories;
import javatar.model.Autopart;
import javatar.model.AutopartCategory;
import javatar.model.MappingHashmap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AllegroCategoryFinder {

    private static final Logger LOGGER = LogManager.getLogger();
    XMLParser xmlParser = new XMLParser();
    int parentId = 620;

    public String matchCategories(Autopart autopart) throws Exception {

        List<AutopartCategory> autopartCategoryList = autopart.getCategoryList();
        List<AllegroCategories> allegroCategoriesList = xmlParser.AllegroCategoryObject();
        String returnedData = "";
        List<String> outputCategories = new ArrayList<>();

        LOGGER.info("Autoparts Catategory list containes {} elements", allegroCategoriesList.size());
        for (AutopartCategory p :
                autopartCategoryList) {
            List<AllegroCategories> blist = allegroCategoriesList.stream()
                    .filter(category -> category.getCatName().contentEquals(p.getName()))
                    .filter(
                            category -> category.getCatParent() == parentId
                    )
                    .collect(Collectors.toList());
        LOGGER.info("Filtered list of allegro categories has size: {}",blist.size());
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
            returnedData = "Części samochodowe " + outputCategories.get(outputCategories.size() - 1) + ";" + parentId;
        } else {
            returnedData = "Części samochodowe " + parentId;
        }
        LOGGER.info("Category found: {}",returnedData);
        return returnedData;

    }

    public String MatchCategoryFromHashMap(Autopart autopart) {
        LOGGER.info("Input autopart: {}", autopart);
    public String matchCategoryFromHashMap(Autopart autopart) {
        List<AutopartCategory> autopartCategoryList = autopart.getCategoryList();
        MappingHashmap xmlAllegroCategoriesMap = new MappingHashmap();
        Integer tmpCategoryId = 0;
        List<AutopartCategory> outputAutopartCategoryList = new ArrayList<>();
        AutopartCategory autopartCategory = new AutopartCategory();
        String returnedData = "";
        List<AllegroCategories> allegroCategoriesList = new ArrayList<>();

        try {
            allegroCategoriesList = xmlParser.allegroCategoryObject();
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("Failed to create allegroCategoriesList");
        }
        for (AutopartCategory p :
                autopartCategoryList) {
            String nameTmp = p.getName();
            tmpCategoryId = xmlAllegroCategoriesMap.JsonXmlMapping.get(nameTmp);

            if (tmpCategoryId != null && !outputAutopartCategoryList.toString().contains(tmpCategoryId.toString())) {
                autopartCategory.setName(nameTmp);
                autopartCategory.setId(tmpCategoryId.toString());
                outputAutopartCategoryList.add(autopartCategory);
                p.setId(tmpCategoryId.toString());
                final Integer catIdForLambda = tmpCategoryId;
                List<AllegroCategories> collect = allegroCategoriesList.stream().filter(cat -> cat.getCatId().equals(catIdForLambda)).collect(Collectors.toList());
                LOGGER.info("Old category name: {}",p.getName());
                p.setName(collect.get(0).getCatName());
                LOGGER.info("New category name: {}",p.getName());
            }
        }

        autopart.setCategoryList(autopartCategoryList);
        LOGGER.info("Autopart sent to MatchCategories function: {}", autopart);

        try {
            returnedData = matchCategories(autopart);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("Failed to use MatchCategories function");
        }

        LOGGER.info("MatchCategoryFromHashMap output String: {}", returnedData);
        return returnedData;
    }


}
