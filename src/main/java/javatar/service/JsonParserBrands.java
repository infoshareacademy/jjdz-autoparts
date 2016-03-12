package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javatar.model.CarsBrands;
import javatar.model.DataCarsBrands;


import java.io.*;

public class JsonParserBrands {
    public void main(String[] args) throws ClassNotFoundException, IOException {

        String searchToken = args[0];
        searchCarId(searchToken);
    }

    final static String DEFAULT_FILENAME = "src/AllegroCategoryObject/resources/v2.json";
    final FileReader reader;

    public JsonParserBrands() throws FileNotFoundException {
        //default filename
        reader = new FileReader(DEFAULT_FILENAME);
    }

    public JsonParserBrands(String filename) throws FileNotFoundException {
        //default filename
        reader = new FileReader(filename);
    }


    public String searchCarId(String searchToken) throws FileNotFoundException {
        Gson gson = new GsonBuilder().create();
        String carID = "";


        DataCarsBrands models = gson.fromJson(reader, DataCarsBrands.class);

        for (CarsBrands c : models.getData()) {
            if (c.getName().contains(searchToken.toUpperCase())) {

                carID = c.getId();
                return carID;

            }

        }

        return "Error";
    }


}






