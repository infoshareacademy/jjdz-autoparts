package javatar.service;


import javatar.model.AllegroCategories;
import javatar.model.Autopart;
import javatar.model.AutopartCategory;
import javatar.model.MappingHashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AllegroCategoryFinder {

    XMLParser xmlParser = new XMLParser();
    int parentId = 620;

    public String MatchCategories(Autopart autopart) throws Exception {

        List<AutopartCategory> autopartCategoryList = autopart.getCategoryList();
        List<AllegroCategories> allegroCategoriesList = xmlParser.AllegroCategoryObject();
        String returnedData = "";

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
                returnedData = tmp.getCatName() + ";" + tmp.getCatId();
            }

        }

        return returnedData;
    }

    public Integer MatchCategoryFromHashMap(Autopart autopart) {
        List<AutopartCategory> autopartCategoryList = autopart.getCategoryList();
        MappingHashmap xmlAllegroCategoriesMap = new MappingHashmap();
        Integer categoryId = 0;

        for (AutopartCategory p :
                autopartCategoryList) {
            Integer tmpCategoryId = xmlAllegroCategoriesMap.JsonXmlMapping.get(p.getName());
            if (tmpCategoryId != null) {
                categoryId = tmpCategoryId;
            }
        }


        return categoryId;
    }

    public String createAllegroLink(Autopart autopart) {

        final Integer categoryId = MatchCategoryFromHashMap(autopart);
        String catId = "";
        List<AllegroCategories> allegroCategoriesList = new ArrayList<>();
        String catName = "";
        String url = "http://allegro.pl/czesci-samochodowe";

        try {
            allegroCategoriesList = xmlParser.AllegroCategoryObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(categoryId);
        if (categoryId != null) {
            List<AllegroCategories> foundCategory = allegroCategoriesList.stream().filter(cId -> cId.getCatId().equals(categoryId)).collect(Collectors.toList());
            System.out.println(foundCategory);
            catName = foundCategory.get(0).getCatName();
            catId = categoryId.toString();

        } else {
            try {
                String[] categoryToSplit = MatchCategories(autopart).split(";");
                catName = categoryToSplit[0];
                catId = categoryToSplit[1];
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (!catName.isEmpty() && !catId.isEmpty()) {
            url += "-" + catName.replaceAll(" ", "-").toLowerCase().replaceAll("[() .,]","")+ "-" + catId;
        }
        return url.replace("ą", "a")
                .replace("ę", "e")
                .replace("ś", "s")
                .replace("ż", "z")
                .replace("ć", "c")
                .replace("ź", "z")
                .replace("ń", "n")
                .replace("ó", "o")
                .replace("ł", "l");
    }
}
