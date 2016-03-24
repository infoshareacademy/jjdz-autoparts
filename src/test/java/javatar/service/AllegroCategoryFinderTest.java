package javatar.service;

import javatar.model.AllegroCategories;
import javatar.model.Autopart;
import javatar.model.AutopartCategory;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AllegroCategoryFinderTest {

    @Test
    public void testMatch2Categories() throws Exception {

        //given
        Autopart autopart = new Autopart();
        AutopartCategory categoryListElement = new AutopartCategory();
        categoryListElement.setName("Chłodzenie silnika");
        AutopartCategory categoryListElement2 = new AutopartCategory();
        categoryListElement2.setName("Chłodnice");
        autopart.addCategoryToList(categoryListElement);
        autopart.addCategoryToList(categoryListElement2);


        //when
        AllegroCategoryFinder allegroCategoryFinder = new AllegroCategoryFinder();
        String s = allegroCategoryFinder.MatchCategories(autopart);

        //then
        assertThat(s, is(equalTo(" -> Chłodzenie silnika -> Chłodnice")));
    }


}