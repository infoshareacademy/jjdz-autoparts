package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import javatar.model.Models;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.util.*;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.TreeSet;

public class JsonParserModels{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final Gson gson = new GsonBuilder().create();
        Path path = Paths.get(args[0]);
        String className = args[1];

        final Class<?> outputClass = Class.forName(className);
        try(
            Reader reader = new InputStreamReader(Files.newInputStream(path))){
                Object p = gson.fromJson(reader, outputClass);
            }



    }

}


