package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javatar.model.CarsBrands;
import javatar.model.DataCarsBrands;


import java.io.*;

public class JsonParserBrands {
    public  void main (String[] args) throws ClassNotFoundException, IOException {
        String inFile = args[0];
        String searchToken = args[1];
        searchCarId(inFile, searchToken);
    }

    public String searchCarId(String inFile, String searchToken) throws FileNotFoundException {
        Gson gson = new GsonBuilder().create();
        String carID = "";

        DataCarsBrands models = gson.fromJson(new FileReader(inFile), DataCarsBrands.class);

        for (CarsBrands c : models.getData()) {
            if (c.getName().contains(searchToken.toUpperCase())) {

                carID = c.getId();
                return carID;

            }

        }

        return "Error";
    }




}






