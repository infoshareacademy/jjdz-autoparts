package javatar.service;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class JsonParserModelsTest {

    @Test
    public void should_find_opel_astra_g_kombi() throws FileNotFoundException {
        String searchToken = "astra g kombi";
        String path = "src/main/resources/json_data/fy.json";
        Integer date = 2004;
        JsonParserModels jsonParserList = new JsonParserModels(path);

        try {
            String searchTest = jsonParserList.searchCarId(searchToken, date);
            assertThat(searchTest, is(equalTo("2mz")));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


    @Test
    public void should_find_vw_jetta() throws FileNotFoundException {
        String searchToken = "JETTA VII SportWagon";
        String path = "src/main/resources/json_data/go.json";
        Integer date = 2015;
        JsonParserModels jsonParserList = new JsonParserModels(path);

        try {
            String searchTest = jsonParserList.searchCarId(searchToken, date);
            assertThat(searchTest, is(equalTo("8o2")));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}