package javatar.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetJsonFromAtenaApiTest {
    @Test
    public void getCarFromAtenaApi() throws Exception {

        GetJsonFromAtenaApi getJsonFromAtenaApi = new GetJsonFromAtenaApi();

        String s = getJsonFromAtenaApi.getCarFromAtenaApi("absd");

        assertNotNull(s);

    }

}