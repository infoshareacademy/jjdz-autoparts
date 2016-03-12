package javatar.service;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class JsonParserModelsTest {

    @Test
    public void should_find_opel_astra_g_kombi() {
        String searchToken = "astra g kombi";
        String path = "src/AllegroCategoryObject/resources/fy.json";
        Integer date = 2004;
        JsonParserModels jsonParserList = new JsonParserModels();

        try {
            String searchTest = jsonParserList.searchCarId(path, searchToken, date);
            assertThat(searchTest, is(equalTo("2mz")));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}