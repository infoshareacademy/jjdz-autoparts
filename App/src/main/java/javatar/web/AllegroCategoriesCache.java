package javatar.web;

import javatar.model.AllegroCategories;
import javatar.service.APIallegro.APIallegro;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.ArrayList;
import java.util.List;

@Singleton
@Startup
@Lock(LockType.READ)
public class AllegroCategoriesCache {

    private static final Logger LOGGER = LogManager.getLogger();
    List<AllegroCategories> allegroCategoriesList = new ArrayList<>();
    APIallegro apIallegro = new APIallegro();

    @PostConstruct
    public void initialize() {

        allegroCategoriesList = apIallegro.getAllegroCategoriesList();
        LOGGER.info("allegroCategoriesList has size: {}", allegroCategoriesList.size());

    }

    public List<AllegroCategories> returnAllegroCategoriesFromFile() {
        return allegroCategoriesList;
    }

}