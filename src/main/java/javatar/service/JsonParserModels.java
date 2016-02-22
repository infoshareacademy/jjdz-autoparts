package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import static org.apache.commons.lang3.builder.ToStringBuilder.*;


public class JsonParserModels {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        String inFile = args[0];
        String className = args[1];
        Gson gson = new GsonBuilder().create();

        Class<?> outputClass = Class.forName(className);
        Path path = Paths.get(inFile);
        try (Reader reader = new InputStreamReader(Files.newInputStream(path))) {
            Object p = gson.fromJson(reader, outputClass);
            System.out.println(reflectionToString(p, ToStringStyle.MULTI_LINE_STYLE));
       }



    }

}
