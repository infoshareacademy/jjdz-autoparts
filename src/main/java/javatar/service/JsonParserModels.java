package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javatar.model.CarsModels;
import javatar.model.DataCarsModels;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonParserModels {
    public static void main (String[] args) throws ClassNotFoundException, IOException {
        String inFile = args[0];
        String nameToken = args[1];
        int date = Integer.parseInt(args[2]);

        searchCarId(inFile, nameToken, date);

    }

    public static String searchCarId(String inFile, String nameToken, int date) throws FileNotFoundException {
        Gson gson = new GsonBuilder().create();
        String modelID = new String();

        DataCarsModels models = gson.fromJson(new FileReader(inFile), DataCarsModels.class);

        for (CarsModels c : models.getData()) {
            if (c.getName().toUpperCase().contains(nameToken.toUpperCase()) && c.getStart_year() < date && c.getEnd_year() > date) {
                modelID = c.getId();
                return modelID;

            }

        }

        return "";
    }



}






