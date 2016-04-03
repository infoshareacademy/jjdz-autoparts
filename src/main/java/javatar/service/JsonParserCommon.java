package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javatar.model.DataCarsModels;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonParserCommon {
    final FileReader reader;

    public JsonParserCommon(String filename) throws FileNotFoundException {
        //default filename
        reader = new FileReader(filename);
    }

    public Object parseFile(String className) throws FileNotFoundException, NullPointerException, ClassNotFoundException {
        Gson gson = new GsonBuilder().create();
        Class<?> outputClass = Class.forName(className);
        Object parsedFile = gson.fromJson(reader, outputClass);
        return parsedFile;
    }
}
