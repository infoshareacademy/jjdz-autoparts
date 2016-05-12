package javatar.service;

import javatar.model.Autopart;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CreateAllegroLink {
    private static final Logger LOGGER = LogManager.getLogger();

    public String createAllegroLink(Autopart autopart) {
        LOGGER.info("Input autopart element: {}",autopart);
        AllegroCategoryFinder allegroCategoryFinder = new AllegroCategoryFinder();
        String matchedCategory = allegroCategoryFinder.matchCategoryFromHashMap(autopart);

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
