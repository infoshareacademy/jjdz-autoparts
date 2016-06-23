package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javatar.model.AutopartCategory;
import javatar.model.JsonDataAutopartCategories;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonParserAutopartCategories {

    final FileReader reader;

    public JsonParserAutopartCategories(String fileName) throws FileNotFoundException {
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






