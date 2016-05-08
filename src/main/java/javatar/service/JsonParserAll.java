package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javatar.model.DataCarsBrands;
import javatar.model.DataCarsEngineAndFuel;
import javatar.model.DataCarsModels;

import java.io.FileNotFoundException;
import java.io.IOException;

public class JsonParserAll {
    final String DEFAULT_URL = "http://infoshareacademycom.2find.ru/api/v2?lang=polish";
    HtmlReader reader = new HtmlReader();
    DataCarsBrands brands = null;
    DataCarsModels model = null;
    DataCarsEngineAndFuel engine = null;

    public DataCarsBrands parseCarFile() {

        try {
            String readString = reader.getText(DEFAULT_URL);
            Gson gson = new GsonBuilder().create();

            brands = gson.fromJson(readString, DataCarsBrands.class);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return brands;
    }

    public DataCarsModels parseModelFile(String url) {

        try {
            String readString = reader.getText(url);
            Gson gson = new GsonBuilder().create();

            model = gson.fromJson(readString, DataCarsModels.class);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return model;
    }

    public DataCarsEngineAndFuel parseEngineFile(String url) {

        try {
            String readString = reader.getText(url);
            Gson gson = new GsonBuilder().create();

            engine = gson.fromJson(readString, DataCarsEngineAndFuel.class);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return engine;
    }

}
