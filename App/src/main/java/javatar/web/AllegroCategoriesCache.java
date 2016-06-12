package javatar.web;

import javatar.model.AllegroCategories;
import javatar.service.XMLParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Singleton
@Startup
@Lock(LockType.READ)
public class AllegroCategoriesCache {

    private static final Logger LOGGER = LogManager.getLogger();
    XMLParser xmlParser = new XMLParser();
    List<AllegroCategories> allegroCategoriesList = new ArrayList<>();

    @PostConstruct
    public void initialize() {

        InputStream allegroCategoriesFile = this.getClass().getResourceAsStream("/Allegro_cathegories_2016-02-13.xml");
        allegroCategoriesList = xmlParser.allegroCategoryObject(allegroCategoriesFile);
        LOGGER.info("allegroCategoriesList has size: {}", allegroCategoriesList.size());

    }

    public List<AllegroCategories> returnAllegroCategoriesFromFile() {
        return allegroCategoriesList;
    }

}