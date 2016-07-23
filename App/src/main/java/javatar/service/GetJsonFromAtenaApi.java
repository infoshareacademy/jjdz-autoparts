package javatar.service;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Stateless;
import java.io.IOException;

@Stateless
public class GetJsonFromAtenaApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(GetJsonFromAtenaApi.class);

    private final static String USER_KEY = "qY2?0Pw!";

    public String getCarFromAtenaApi(String userSessionKey) {

        LOGGER.debug("User session key " + userSessionKey);

        return getUserCar(userSessionKey);
    }


    private static OkHttpClient client = new OkHttpClient();

    private static String getCarFromRest(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    private String getUserCar(String sessionKey) {

        String json = null;
        try {
            json = getCarFromRest("https://aztec.atena.pl/PWM2/rest/aztec/getbysession?sessionKey=" + sessionKey + "&userKey=" + USER_KEY);

        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.debug("Downloaded json: " + json);
        return json;
    }


}
