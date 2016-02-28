package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javatar.model.ClassInModels;
import javatar.model.DataForm;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class JsonParserModels {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        String inFile = args[0];
        String className = args[1];
        Gson gson = new GsonBuilder().create();

//        Class<?> outputClass = Class.forName(className);
//        Path path = Paths.get(inFile);
//        try (Reader reader = new InputStreamReader(Files.newInputStream(path))) {
//            Object p = gson.fromJson(reader, outputClass);
//            System.out.println(p.toString());
//
//       }



        DataForm models = gson.fromJson(new FileReader(inFile), DataForm.class);
        System.out.println("models = " + models);


        DataForm data = new DataForm();
        Collection<ClassInModels> collectionModels = models.getData();
        System.out.println("collectionModels = " + collectionModels);



        if(collectionModels.contains("AC")){
            System.out.println("ok");
        }


    }

}
