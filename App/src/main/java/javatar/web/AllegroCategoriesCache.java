package javatar.web;

import javatar.model.AllegroCategories;
import javatar.service.apiAllegro.APIallegro;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.*;
import java.util.ArrayList;
import java.util.List;

@Singleton
@Startup
@Lock(LockType.READ)
public class AllegroCategoriesCache {

    private static final Logger LOGGER = LogManager.getLogger();
    List<AllegroCategories> allegroCategoriesList = new ArrayList<>();

    @EJB
    APIallegro apIallegro;

//    public AllegroCategoriesCache(final apiAllegro apIallegro){
//        this.apIallegro = apIallegro;
//    }


    @PostConstruct
    public void initialize() {

        allegroCategoriesList = apIallegro.getAllegroCategoriesList();
        LOGGER.info("allegroCategoriesList has size: {}", allegroCategoriesList.size());

    }

    public List<AllegroCategories> getAllegroCategoriesList() {
        return allegroCategoriesList;
    }


}