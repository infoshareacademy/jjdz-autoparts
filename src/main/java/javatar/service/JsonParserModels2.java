package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javatar.model.ClassInModels;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class JsonParserModels2 {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        String inFile = args[0];

        Gson gson = new GsonBuilder().create();


        Path path = Paths.get(inFile);
        try (Reader reader = new InputStreamReader(Files.newInputStream(path))) {
            ClassInModels p = gson.fromJson(reader, ClassInModels.class);
            System.out.println(p.toString());
            System.out.println(p.getName());
       }



    }

}
