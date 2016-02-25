package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javatar.model.ClassInModels;

import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;

/**
 * Created by Aneta i Maniek on 2016-02-25.
 */
public class JsonParser {
    public static void main(String[] args) {

        Gson gson = new Gson();

        try {

            System.out.println("Reading JSON from a file");
            System.out.println("----------------------------");

            BufferedReader br = new BufferedReader(
                    new FileReader("src\\main\\java\\javatar\\resources\\v2.json"));

            //convert the json string back to object
            ClassInModels modelsObj = gson.fromJson(br, ClassInModels.class);

            System.out.println("Id: "+modelsObj.getId());


            System.out.println("Name: "+modelsObj.getName());



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
