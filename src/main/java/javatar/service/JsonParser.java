package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javatar.model.Autopart;
import javatar.model.JsonData;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collection;

public class JsonParser {

    final static String DEFAULT_FILENAME = "src/main/resources/json_data/v2.json";
    final FileReader reader;

    public JsonParser() throws FileNotFoundException {
        //default filename
        reader = new FileReader(DEFAULT_FILENAME);
    }

    public JsonParser(String fileName) throws FileNotFoundException {
        //default filename
        reader = new FileReader(fileName);
    }

    public String searchPartId(String searchToken, JsonData data) throws FileNotFoundException {
//        Gson gson = new GsonBuilder().create();
        String partID = "";

//        JsonData data = gson.fromJson(reader, JsonData.class);
//        Collection<Object> objects =  data.getAutopartData();

        for (Autopart a : data.getAutopartData()) {
            if (a.getPartName().contains(searchToken.toUpperCase())) {

                partID = a.getPartId();
                return partID;

            }

        }

        return "Error";
    }

    public JsonData getCollection() throws FileNotFoundException {
        JsonData data;
        Gson gson = new GsonBuilder().create();

        data = gson.fromJson(reader, JsonData.class);

        return data;
    }
}
