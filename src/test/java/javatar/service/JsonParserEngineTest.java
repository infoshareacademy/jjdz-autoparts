package javatar.service;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.HashMap;

import static javatar.service.JsonParserEngine.listAllEngineTypes;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class JsonParserEngineTest {
    String path = "src/AllegroCategoryObject/resources/2mz.json";

    @Test
    public void should_find_opel() {
        String searchToken = "6yg";

        JsonParserEngine jsonParserList = new JsonParserEngine();


        try {
            String searchTest = jsonParserList.searchEngineType(path, searchToken);
            assertThat(searchTest, is(equalTo("X 18 XE1, Silnik benzynowy")));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void should_list_all_engine_types() throws FileNotFoundException {

        HashMap<Integer, String> engines = new HashMap<>();
        engines = listAllEngineTypes(path);
        assertThat(engines.size(),is(equalTo(23)));
        assertThat(engines.get(0),is(equalTo("6yd")));
        assertThat(engines.get(22),is(equalTo("d3w")));
    }

}