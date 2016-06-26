package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javatar.model.CarsModels;
import javatar.model.DataCarsModels;

import javax.ejb.Stateless;
import java.io.FileNotFoundException;
import java.io.FileReader;

@Stateless
public class JsonParserModels {
//    public void main(String[] args) throws ClassNotFoundException, IOException {
//        String inFile = args[0];
//        String nameToken = args[1];
//        int date = Integer.parseInt(args[2]);
//
//        parseJsonFile(nameToken, date);
//
//    }


    public JsonParserModels() {
    }

    public String searchModelId(String nameToken, int date) throws FileNotFoundException,NullPointerException {
        Gson gson = new GsonBuilder().create();
        String modelID = new String();


        String url = "http://infoshareacademycom.2find.ru" + brandLink + "?lang=polish";

        DataCarsModels models = parser.parseModelFile(url);

        for (CarsModels c : models.getData()) {
            if (c.getEnd_year() == null) {
                if (c.getName().toUpperCase().contains(nameToken.toUpperCase()) && c.getStart_year() <= date) {
                    modelID = c.getId();
                    return modelID;
                }
            } else {
                if (c.getName().toUpperCase().contains(nameToken.toUpperCase()) && c.getStart_year() <= date && c.getEnd_year() >= date) {
                    modelID = c.getId();
                    return modelID;

                }
            }
        }

        return "Error";
    }


}






