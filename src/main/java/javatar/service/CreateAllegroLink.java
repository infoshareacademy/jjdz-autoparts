package javatar.service;

import javatar.model.AllegroCategories;
import javatar.model.Autopart;

import java.util.ArrayList;
import java.util.List;

public class CreateAllegroLink {
    public String createAllegroLink(Autopart autopart) {

        // final Integer categoryId = MatchCategoryFromHashMap(autopart);
        String catId = "";
        List<AllegroCategories> allegroCategoriesList = new ArrayList<>();
        String catName = "";
        String url = "http://allegro.pl/czesci-samochodowe";
        AllegroCategoryFinder allegroCategoryFinder = new AllegroCategoryFinder();
        String matchCategories ="";
//        try {
//            allegroCategoriesList = xmlParser.AllegroCategoryObject();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(categoryId);
//        if (categoryId != null) {
//            List<AllegroCategories> foundCategory = allegroCategoriesList.stream().filter(cId -> cId.getCatId().equals(categoryId)).collect(Collectors.toList());
//            System.out.println(foundCategory);
//            catName = foundCategory.get(0).getCatName();
//            catId = categoryId.toString();
//
//        } else {
//            try {
//                String[] categoryToSplit = MatchCategories(autopart).split(";");
//                catName = categoryToSplit[0];
//                catId = categoryToSplit[1];
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
        Autopart autopartWithNewCategories = allegroCategoryFinder.MatchCategoryFromHashMap(autopart);
        System.out.println(autopartWithNewCategories.toString());
        try {
            matchCategories = allegroCategoryFinder.MatchCategories(autopartWithNewCategories);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(matchCategories);
        if (!matchCategories.isEmpty() ) {
            url += "-" + matchCategories.replaceAll(" ", "-").toLowerCase().replaceAll("[() .,]", "");
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
