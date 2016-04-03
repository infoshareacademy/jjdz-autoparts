package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javatar.model.CarsBrands;
import javatar.model.CarsEngineAndFuel;
import javatar.model.DataCarsBrands;
import javatar.model.DataCarsEngineAndFuel;


import java.io.*;
import java.util.HashMap;

public class JsonParserBrands {
    public void main(String[] args) throws ClassNotFoundException, IOException {

        String searchToken = args[0];
        searchCarId(searchToken);
    }

    final static String DEFAULT_FILENAME = "src/main/resources/v2.json";
    final FileReader reader;

    public JsonParserBrands() throws FileNotFoundException {
        //default filename
        reader = new FileReader(DEFAULT_FILENAME);
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

    public HashMap<Integer, String> listAllBrands() throws FileNotFoundException {

        Gson gson = new GsonBuilder().create();
        int i = 1;
        HashMap<Integer, String> brands = new HashMap<>();

        DataCarsBrands brandsRead = gson.fromJson(reader, DataCarsBrands.class);

        for (CarsBrands c : brandsRead.getData()) {

                System.out.println(i + ". " + "Typ silnika: " + c.getName() );

            brands.put(i, c.getId());
            i++;

        }
        return brands;

    }


}






