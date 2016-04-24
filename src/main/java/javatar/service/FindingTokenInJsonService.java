package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.ejb.Stateless;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.Collection;

@Stateless
public class FindingTokenInJsonService {



    public String searchIdByToken(String searchToken, String json, String className) throws FileNotFoundException {
        String carID = "";
        Class<?> outputClass = null;
        try {
            outputClass = Class.forName(className);
        } catch (ClassNotFoundException e) {


        }
        Gson gson = new GsonBuilder().create();

        Collection<?> objectRead = gson.fromJson(json, (Type) outputClass);

        Object o = objectRead.stream().filter(a -> a.toString().contains("\"id\": \"" + searchToken)).findFirst().get();
//        for (Object c : objectRead) {
//
//            if(objectRead.contains("\"id\": \""+ searchToken));
//
//                carID = c.toString();
//                return carID;
//
//            }
//
//        }

        return "Error";
    }

}
