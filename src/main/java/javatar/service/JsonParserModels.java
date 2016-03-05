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
        String searchToken = args[1];
        searchCarId(inFile, searchToken);
    }

    public static String searchCarId(String inFile, String searchToken) throws FileNotFoundException {
        Gson gson = new GsonBuilder().create();
        String modelID = new String();
        String modelName = new String();
        Integer startYear = new Integer(0);
        Integer endYear = new Integer(0);

        DataCarsModels models = gson.fromJson(new FileReader(inFile), DataCarsModels.class);

        for (CarsModels c : models.getData()) {
            if (c.getName().contains(searchToken.toUpperCase())) {
                modelID = c.getId();
                modelName = c.getName();
                startYear = c.getStart_year();
                endYear = c.getEnd_year();

                return "";

            }

        }

        return "";
    }

    public static String searchModel (String fileModels, String searchTokenModels) throws FileNotFoundException{

        return fileModels;
    }


}






