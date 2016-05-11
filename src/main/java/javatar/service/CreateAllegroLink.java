package javatar.service;

import javatar.model.Autopart;
public class CreateAllegroLink {

    public String createAllegroLink(Autopart autopart) {

        AllegroCategoryFinder allegroCategoryFinder = new AllegroCategoryFinder();
        String matchedCategory = allegroCategoryFinder.matchCategoryFromHashMap(autopart);

        String url = "http://allegro.pl/";

        url += matchedCategory.replaceAll(" ", "-").replace(";", "-").toLowerCase().replaceAll("[().,]", "");

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
