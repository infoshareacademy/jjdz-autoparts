package javatar.service;


import com.google.gson.Gson;
import javatar.model.Car;
import javatar.model.CarFromAztec;
import javatar.model.CarsBrands;
import javatar.model.CarsModels;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * Created by Daniel on 20.03.2016.
 */
public class JsonParserAztecCode {

    private final static String USER_KEY = "qY2?0Pw!";
    private String sessionKey = null;



    private static OkHttpClient client = new OkHttpClient();

    public JsonParserAztecCode(String session) {
        this.sessionKey = session;
    }

    private String getCarFromRest(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    private String getUserCar() {

        String json = null;
        try {
            json = getCarFromRest("https://aztec.atena.pl/PWM2/rest/aztec/getbysession?sessionKey=" + sessionKey + "&userKey=" + USER_KEY);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return json;
    }

    public Car getUserCarData() {
        Gson gson = new Gson();

        CarFromAztec jsonCar = gson.fromJson(getUserCar(), CarFromAztec.class);

        CarsBrands cb = new CarsBrands();
        cb.setName(jsonCar.getDane().getD1());
        CarsModels cm = new CarsModels();
        cm.setName(jsonCar.getDane().getD5());
        Car carFromAztec = new Car();
        carFromAztec.setProductionYear(Integer.parseInt(jsonCar.getDane().getRok_produkcji()));
        carFromAztec.setCarsBrand(cb);
        carFromAztec.setCarsModel(cm);

        return carFromAztec;


//        return new String[]{
//                jsonCar.getDane().getD1(),//Brand
//                jsonCar.getDane().getD5(),//Model
//                jsonCar.getDane().getRok_produkcji()
//        };
    }


//    public static void main(String[] args) {
//        for (String str : getUserCar("kjsm4")) {
//            System.out.println(str);
//        }
//    }

}
