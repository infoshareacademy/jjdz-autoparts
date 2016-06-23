package javatar.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetCarFromAtenaJSONTest {
    @Test
    public void getUserCarData() throws Exception {

        GetJsonFromAtenaApi getJsonFromAtenaApi = new GetJsonFromAtenaApi();

        GetCarFromAtenaJSON getCarFromAtenaJSON = new GetCarFromAtenaJSON();

        Object o = getCarFromAtenaJSON.getUserCarData(getJsonFromAtenaApi.getCarFromAtenaApi("abcd"));

        assertNull(o);
    }

}