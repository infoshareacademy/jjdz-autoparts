package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javatar.model.ClassInModels;
import javatar.model.DataForm;
import javatar.model.Models;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class JsonParserModels {
    public static void main (String[] args) throws ClassNotFoundException, IOException {
        String inFile = args[0];
        String searchToken = args[1];
        searchCarId(inFile, searchToken);
    }

    public static String searchCarId(String inFile, String searchToken) throws FileNotFoundException {
        Gson gson = new GsonBuilder().create();
        String carID = "";

        DataForm models = gson.fromJson(new FileReader(inFile), DataForm.class);

        for (ClassInModels c : models.getData()) {
            if (c.getName().contains(searchToken.toUpperCase())) {

                carID = c.getId();
                return carID;

            }

        }

        return "";
    }

    public static String searchModel (String fileModels, String searchTokenModels) throws FileNotFoundException{

        return fileModels;
    }


}






