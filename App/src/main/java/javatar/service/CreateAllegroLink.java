package javatar.service;

import javatar.model.Autopart;
import javatar.model.AutopartAllegroListModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CreateAllegroLink {
    private static final Logger LOGGER = LogManager.getLogger();

    public String createAllegroLink(AutopartAllegroListModel autopartAllegroListModel ) {
        System.out.println("Input autopart = "+ autopartAllegroListModel.getAutopart().toString());
        System.out.println("Input category list =    "+ autopartAllegroListModel.getAutopart().getCategoryList().toString());
        Autopart autopart = autopartAllegroListModel.getAutopart();
        LOGGER.info("Input autopart element: {}",autopart);
        AllegroCategoryFinder allegroCategoryFinder = new AllegroCategoryFinder();
        String matchedCategory = allegroCategoryFinder.matchCategoryFromHashMap(autopartAllegroListModel);

        String url = "http://allegro.pl/";

        url += matchedCategory.replaceAll(" ", "-").replace(";", "-").toLowerCase().replaceAll("[().,]", "");
        String urlFinal = url.replace("ą", "a")
                .replace("ę", "e")
                .replace("ś", "s")
                .replace("ż", "z")
                .replace("ć", "c")
                .replace("ź", "z")
                .replace("ń", "n")
                .replace("ó", "o")
                .replace("ł", "l");

        LOGGER.info("Created allegro link: {}", urlFinal);

        return urlFinal;
    }

}
