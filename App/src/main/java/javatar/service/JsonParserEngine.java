package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javatar.model.CarsEngineAndFuel;
import javatar.model.DataCarsEngineAndFuel;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class JsonParserEngine {

    final FileReader reader;
//    final Object parsedFile;

    public JsonParserEngine(String filename) throws FileNotFoundException {
        //default filename
        reader = new FileReader(filename);
//        JsonParserStateless parser = new JsonParserStateless(reader.toString());
//        parsedFile = parser.parseFile("DataCarsEngineAndFuel");
    }


    public String searchEngineTypeByNumber(String engineToken) throws FileNotFoundException {
        Gson gson = new GsonBuilder().create();
        String engineType = new String();

        DataCarsEngineAndFuel models = gson.fromJson(reader, DataCarsEngineAndFuel.class);

        for (CarsEngineAndFuel c : models.getData()) {
            if (c.getId().contains(engineToken)) {
                engineType = c.getEngine() + ", " + c.getEngine_txt();
                System.out.println(engineType);
                return engineType;

            }

        }

        return "Error";
    }

    public List<CarsEngineAndFuel> searchEngineTypeByTokens(String fuelType, String engineCapacity, String power ) {

        String fuel_txt = "";

        switch (fuelType) {
            case "P":
                fuel_txt = "benzyna";
                break;
            case "D":
                fuel_txt = "olej napędowy";
                break;
            default:
                fuel_txt = "Nie znaleziono";
                break;
        }

        String capacity_txt = engineCapacity.substring(0, engineCapacity.length() - 6);
        String powerSubs = power.substring(0, power.length() - 5);
        int capacity = Integer.parseInt(capacity_txt);

        Gson gson = new GsonBuilder().create();
        DataCarsEngineAndFuel engines = gson.fromJson(reader, DataCarsEngineAndFuel.class);

        List<CarsEngineAndFuel> enginesList = engines.getData();

        final String finalFuel_txt = fuel_txt;
        List<CarsEngineAndFuel> blist = enginesList.stream()
                .filter(fuel -> fuel.getCcm().equals(capacity))
                .filter(f -> f.getFuel().equals(finalFuel_txt))
                .filter(f -> f.getKw().toString().equals(powerSubs))
                .collect(Collectors.toList());

        System.out.println(blist.toString());
        System.out.println(blist.size());
        System.out.println(powerSubs);
        System.out.println(capacity);
        System.out.println(fuel_txt);
        return blist;
    }


    public HashMap<Integer, String> listAllEngineTypes() throws FileNotFoundException {

        Gson gson = new GsonBuilder().create();
        int i = 1;
        HashMap<Integer, String> engineIds = new HashMap<>();


        DataCarsEngineAndFuel engines = gson.fromJson(reader, DataCarsEngineAndFuel.class);

        for (CarsEngineAndFuel c : engines.getData()) {

            if (c.getEnd_year() == null) {
                System.out.println(i + ". " + "Typ silnika: " + c.getEngine() + ", " + c.getEngine_txt() + ", Rok produkcji od " + c.getStart_year().toString() + " ID: " + c.getId());

            } else {
                System.out.println(i + ". " + "Typ silnika: " + c.getEngine() + ", " + c.getEngine_txt() + ", Rok produkcji od " + c.getStart_year().toString() + " do " + c.getEnd_year().toString() + " ID: " + c.getId());

            }

            engineIds.put(i, c.getId());
            i++;

        }
        return engineIds;

    }

}









