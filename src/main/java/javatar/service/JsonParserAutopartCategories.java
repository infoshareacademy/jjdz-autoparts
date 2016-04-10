package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javatar.model.AutopartCategory;
import javatar.model.JsonDataAutopartCategories;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class JsonParserAutopartCategories {
    public void main(String[] args) throws ClassNotFoundException, IOException {

        String searchToken = args[0];
//        searchCategoryId(searchToken);
    }

    final static String DEFAULT_FILENAME = "src/main/resources/json_data/2h61.json";
    final FileReader reader;

    public JsonParserAutopartCategories() throws FileNotFoundException {
        //default filename
        reader = new FileReader(DEFAULT_FILENAME);
    }

    public JsonParserAutopartCategories(String fileName) throws FileNotFoundException {
        //default filename
        reader = new FileReader(fileName);
    }

    public AutopartCategory searchCategoryId(String searchToken, JsonDataAutopartCategories models) throws FileNotFoundException {
        AutopartCategory foundCategory;

        for (AutopartCategory ac : models.getData()) {
            if (ac.getName().contains(searchToken)) {

                foundCategory = new AutopartCategory(ac.getName(), ac.getId(), ac.isHas_children(), ac.getLink());
                return foundCategory;
            }

        }

        return new AutopartCategory();
    }

    public JsonDataAutopartCategories getCategoryList(){
        Gson gson = new GsonBuilder().create();
        JsonDataAutopartCategories models = gson.fromJson(reader, JsonDataAutopartCategories.class);
        return models;
    }


}






