package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javatar.model.AutopartCategory;
import javatar.model.JsonAutopart;
import javatar.model.JsonDataAutopart;
import javatar.model.JsonDataAutopartCategories;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonParserAutopart {
    public void main(String[] args) throws ClassNotFoundException, IOException {

        String searchToken = args[0];
//        searchCategoryId(searchToken);
    }

    final static String DEFAULT_FILENAME = "src/main/resources/2h61.json";
    final FileReader reader;

    public JsonParserAutopart() throws FileNotFoundException {
        //default filename
        reader = new FileReader(DEFAULT_FILENAME);
    }

    public JsonParserAutopart(String fileName) throws FileNotFoundException {
        reader = new FileReader(fileName);
    }

    public JsonAutopart searchAutopartId(String searchToken, JsonDataAutopart models) throws FileNotFoundException {
        JsonAutopart foundAutopart;

        for (JsonAutopart ja : models.getData()) {
            if (ja.getName().contains(searchToken)) {

                foundAutopart = new JsonAutopart(ja.getBrand(),
                        ja.getBrand_clear(),
                        ja.getNumber(),
                        ja.getNumber_clear(),
                        ja.getName(),
                        ja.getStatus(),
                        ja.getLink());

                return foundAutopart;
            }

        }

        return new JsonAutopart();
    }

    public JsonDataAutopart getAutopartList() {
        Gson gson = new GsonBuilder().create();
        JsonDataAutopart models = gson.fromJson(reader, JsonDataAutopart.class);
        return models;
    }


}






