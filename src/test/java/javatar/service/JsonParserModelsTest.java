package javatar.service;

import javatar.model.Car;
import javatar.model.ClassInModels;
import javatar.model.DataForm;
import javatar.model.Models;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.mockito.internal.matchers.NotNull;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class JsonParserModelsTest {

    @Test
    public void should_find_opel()  {
        String searchToken = "opel";
        String path = "src/main/java/javatar/resources/v2.json";
        JsonParserModels jsonParserList = new JsonParserModels();

        final ClassInModels model = new ClassInModels();
        model.setName("OPEL");
        final ClassInModels mdl2 = new ClassInModels();
        mdl2.setName("ACURA");


        List<ClassInModels> list = new ArrayList<>();
        list.add(model);
        list.add(mdl2);
        list.add(mdl2);

        try {
            String searchTest = jsonParserList.searchCarId(path, searchToken);
            assertThat(searchTest,is(equalTo("fy")));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assertThat(list.get(0).getName(),is(equalTo("OPEL")));

        assertThat(list.size(),is(equalTo(list.size())));

    }

}