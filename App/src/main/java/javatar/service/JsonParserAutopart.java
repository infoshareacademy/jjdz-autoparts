package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javatar.model.JsonAutopart;
import javatar.model.JsonDataAutopart;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonParserAutopart {

    final FileReader reader;

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






