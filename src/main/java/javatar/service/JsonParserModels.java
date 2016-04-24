package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javatar.model.CarsModels;
import javatar.model.DataCarsModels;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonParserModels {
//    public void main(String[] args) throws ClassNotFoundException, IOException {
//        String inFile = args[0];
//        String nameToken = args[1];
//        int date = Integer.parseInt(args[2]);
//
//        parseJsonFile(nameToken, date);
//
//    }

    final FileReader reader;

    public JsonParserModels(String filename) throws FileNotFoundException {
        //default filename
        reader = new FileReader(filename);
    }

    public String searchCarId(String nameToken, int date) throws FileNotFoundException,NullPointerException {
        Gson gson = new GsonBuilder().create();
        String modelID = new String();

        DataCarsModels models = gson.fromJson(reader, DataCarsModels.class);

        for (CarsModels c : models.getData()) {
            if (c.getEnd_year() == null) {
                if (c.getName().toUpperCase().contains(nameToken.toUpperCase()) && c.getStart_year() <= date) {
                    modelID = c.getId();
                    return modelID;
                }
            } else {
                if (c.getName().toUpperCase().contains(nameToken.toUpperCase()) && c.getStart_year() <= date && c.getEnd_year() >= date) {
                    modelID = c.getId();
                    return modelID;

                }
            }
        }

        return "Error";
    }


}






