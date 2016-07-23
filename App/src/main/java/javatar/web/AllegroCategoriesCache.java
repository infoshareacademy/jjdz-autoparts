package javatar.web;

import javatar.model.AllegroCategories;
import javatar.service.apiAllegro.APIallegro;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.ejb.*;
import java.util.ArrayList;
import java.util.List;

@Singleton
@Startup
@Lock(LockType.READ)
public class AllegroCategoriesCache {

    private static final Logger LOGGER = LoggerFactory.getLogger(AllegroCategoriesCache.class);
    List<AllegroCategories> allegroCategoriesList = new ArrayList<>();

    @EJB
    APIallegro apIallegro;

    @PostConstruct
    public void initialize() {

        allegroCategoriesList = apIallegro.getAllegroCategoriesList();
        LOGGER.info("allegroCategoriesList has size: {}", allegroCategoriesList.size());

    }

    public List<AllegroCategories> getAllegroCategoriesList() {
        return allegroCategoriesList;
    }


}