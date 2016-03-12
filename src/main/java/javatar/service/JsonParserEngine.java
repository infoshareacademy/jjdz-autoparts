package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javatar.model.CarsEngineAndFuel;
import javatar.model.DataCarsEngineAndFuel;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class JsonParserEngine {

    final FileReader reader;

    public JsonParserEngine(String filename) throws FileNotFoundException {
        //default filename
        reader = new FileReader(filename);
    }

    public String searchEngineType(String engineToken) throws FileNotFoundException {
        Gson gson = new GsonBuilder().create();
        String engineType = new String();

        DataCarsEngineAndFuel models = gson.fromJson(reader, DataCarsEngineAndFuel.class);

        for (CarsEngineAndFuel c : models.getData()) {
            if (c.getId().contains(engineToken)) {
                engineType = c.getEngine() + ", " + c.getEngine_txt();
                System.out.println(engineType);
                return engineType;

            }

        }

        return "Error";
    }


    public HashMap<Integer, String> listAllEngineTypes() throws FileNotFoundException {

        Gson gson = new GsonBuilder().create();
        int i = 0;
        HashMap<Integer, String> engineIds = new HashMap<>();

        DataCarsEngineAndFuel engines = gson.fromJson(reader, DataCarsEngineAndFuel.class);

        for (CarsEngineAndFuel c : engines.getData()) {

            System.out.println(i + ". " + "Typ silnika: " + c.getEngine() + ", " + c.getEngine_txt() + ", Rok produkcji od " + c.getStart_year().toString() + " do " + c.getEnd_year().toString() + " ID: " + c.getId());
            engineIds.put(i, c.getId());
            i++;

        }
        return engineIds;

    }

}









