package javatar.service;

import javatar.model.CarsBrands;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class JsonParserBrandsTest {

    @Test
    public void should_find_opel()  {
        String searchToken = "opel";
        String path = "src/main/java/javatar/resources/v2.json";
        JsonParserBrands jsonParserList = new JsonParserBrands();

//        final CarsBrands model = new CarsBrands();
//        model.setName("OPEL");
//        final CarsBrands mdl2 = new CarsBrands();
//        mdl2.setName("ACURA");
//
//
//        List<CarsBrands> list = new ArrayList<>();
//        list.add(model);
//        list.add(mdl2);
//        list.add(mdl2);

        try {
            String searchTest = jsonParserList.searchCarId(path, searchToken);
            assertThat(searchTest,is(equalTo("fy")));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        assertThat(list.get(0).getName(),is(equalTo("OPEL")));
//
//        assertThat(list.size(),is(equalTo(list.size())));

    }

}