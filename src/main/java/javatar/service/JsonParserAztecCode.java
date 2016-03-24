package javatar.service;


import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * Created by Daniel on 20.03.2016.
 */
public class JsonParserAztecCode {

    private static  String USER_KEY = "qY2?0Pw!";

    private static OkHttpClient client = new OkHttpClient();

    public static String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public static String[] getUserCar() {

        String json = null;
        try {
           json = run("https://aztec.atena.pl/PWM2/rest/aztec/getbysession?sessionKey=glkt0&userKey=qY2?0Pw!");
        //    json = run("src/main/resources/atenaAzterReturned.json");
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Gson gson = new Gson();

        AtenaApi aa = gson.fromJson(json, AtenaApi.class);

        return new String[]{
               "d1: :" + aa.getDane().getD1(),
                "d5: " + aa.getDane().getD5(),
                "rok " + aa.getDane().getRok_produkcji()
        };
    }

    public static void main(String[] args) {
        for(String str : getUserCar()){
            System.out.println(str);
        }
    }

}
