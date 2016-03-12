package javatar.service;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.HashMap;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class JsonParserEngineTest {
    String path = "src/AllegroCategoryObject/resources/2mz.json";


    @Test
    public void should_find_opel() throws FileNotFoundException {
        String searchToken = "6yg";

        JsonParserEngine jsonParserList = new JsonParserEngine(path);

        String searchTest = jsonParserList.searchEngineType(searchToken);
        assertThat(searchTest, is(equalTo("X 18 XE1, Silnik benzynowy")));

    }

    @Test
    public void should_list_all_engine_types() throws FileNotFoundException {
        JsonParserEngine jsonParserList = new JsonParserEngine(path);
        HashMap<Integer, String> engines = jsonParserList.listAllEngineTypes();
        assertThat(engines.size(), is(equalTo(23)));
        assertThat(engines.get(0), is(equalTo("6yd")));
        assertThat(engines.get(22), is(equalTo("d3w")));
    }

}