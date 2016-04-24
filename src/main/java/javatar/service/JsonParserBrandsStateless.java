package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javatar.model.DataCarsBrands;

import javax.ejb.Stateless;
import java.io.FileNotFoundException;
import java.io.FileReader;

@Stateless
public class JsonParserBrandsStateless {


    final static String DEFAULT_FILENAME = "src/main/resources/json_data/v2.json";
    final FileReader reader;

    public JsonParserBrandsStateless() throws FileNotFoundException {
        reader = new FileReader(DEFAULT_FILENAME);
    }

    public DataCarsBrands parseJsonFile() throws FileNotFoundException {
        Gson gson = new GsonBuilder().create();
        String carID = "";

        DataCarsBrands models = gson.fromJson(reader, DataCarsBrands.class);

        return models;
    }
}






