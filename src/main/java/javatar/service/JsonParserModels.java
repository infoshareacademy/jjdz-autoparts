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
        String className = args[1];
        String searchToken = args[2];
        search(inFile, searchToken);
    }

    private static String search(String inFile, String searchToken) throws FileNotFoundException {
        Gson gson = new GsonBuilder().create();
        ArrayList<ClassInModels> specifiedModel = new ArrayList<ClassInModels>();
        String carID = "";

//        Class<?> outputClass = Class.forName(className);
//        Path path = Paths.get(inFile);
//        try (Reader reader = new InputStreamReader(Files.newInputStream(path))) {
//            Object p = gson.fromJson(reader, outputClass);
//            System.out.println(p.toString());
//
//       }


        DataForm models = gson.fromJson(new FileReader(inFile), DataForm.class);

        DataForm data = new DataForm();
        Collection<ClassInModels> collectionModels = models.getData();

        for (ClassInModels c : models.getData()) {
            if (c.getName().contains(searchToken.toUpperCase())) {
                specifiedModel.add(c);
                carID = c.getId();
                System.out.println("carID = " + carID);
                return carID;

            }

        }

        return carID;
    }


}






