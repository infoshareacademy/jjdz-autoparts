package javatar.service;

import javatar.model.CarsEngineAndFuel;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class JsonParserEngineTest {
    String path = "src/main/resources/json_data/2mz.json";
    String path2 = "src/main/resources/json_data/8o2.json";

    @Test
    public void should_find_opel() throws FileNotFoundException {
        String searchToken = "6yg";

        JsonParserEngine jsonParserList = new JsonParserEngine(path);

        String searchTest = jsonParserList.searchEngineTypeByNumber(searchToken);
        assertThat(searchTest, is(equalTo("X 18 XE1, Silnik benzynowy")));

    }

    @Test
    public void should_list_all_engine_types() throws FileNotFoundException {
        JsonParserEngine jsonParserList = new JsonParserEngine(path);
        HashMap<Integer, String> engines = jsonParserList.listAllEngineTypes();
        assertThat(engines.size(), is(equalTo(23)));
        assertThat(engines.get(1), is(equalTo("6yd")));
        assertThat(engines.get(23), is(equalTo("d3w")));
    }


    @Test
    public void should_list_all_engine_types_vw() throws FileNotFoundException {
        JsonParserEngine jsonParserList = new JsonParserEngine(path2);
        HashMap<Integer, String> engines = jsonParserList.listAllEngineTypes();
        assertThat(engines.size(), is(equalTo(1)));
        assertThat(engines.get(1), is(equalTo("2h6l")));
        //assertThat(engines.get(27), is(equalTo("2alo")));
    }

    @Test
    public void should_find_engine_by_name_and_capacity() throws FileNotFoundException {
        //given
        String fuelType = "P";
        String capacity = "1199,00cm3";
        String power ="48,00KW";
        JsonParserEngine jsonParserEngine = new JsonParserEngine(path);

        //when
        List<CarsEngineAndFuel> list = jsonParserEngine.searchEngineTypeByTokens(fuelType, capacity,power);

        //done
        assertThat(list.size(),is(equalTo(1)));
        assertThat(list.get(0).getEngine(),is(equalTo("X 12 XE")));

    }
}