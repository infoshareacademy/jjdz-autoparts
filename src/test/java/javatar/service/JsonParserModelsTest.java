package javatar.service;

import javatar.model.CarsBrands;
import javatar.model.CarsModels;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by anna wojtkiewicz on 05.03.2016.
 */
public class JsonParserModelsTest {

    @Test
    public void should_find_opel_astra_g_kombi() {
        String searchToken = "opel astra g kombi";
        String path = "src/main/java/javatar/resources/fy.json";
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