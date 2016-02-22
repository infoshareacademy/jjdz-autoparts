package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class JsonParserModels {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        String inFile = args[0];
        String className = args[1];
        Gson gson = new GsonBuilder().create();

        Class<?> outputClass = Class.forName(className);
        Path path = Paths.get(inFile);
        try (Reader reader = new InputStreamReader(Files.newInputStream(path))) {
            Object p = gson.fromJson(reader, outputClass);
            System.out.println(p.toString());
       }



    }

}
