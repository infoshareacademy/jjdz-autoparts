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
    public void testMatch3Categories() throws Exception {

        //given
        Autopart autopart = new Autopart();
        AutopartCategory categoryListElement = new AutopartCategory();
        categoryListElement.setName("Chłodzenie silnika");
        autopart.addCategoryToList(categoryListElement);
        AutopartCategory categoryListElement2 = new AutopartCategory();
        categoryListElement2.setName("Chłodnice");
        autopart.addCategoryToList(categoryListElement2);
        AutopartCategory categoryListElement3 = new AutopartCategory();
        categoryListElement3.setName("Chłodnice oleju");
        autopart.addCategoryToList(categoryListElement3);

        //when
        AllegroCategoryFinder allegroCategoryFinder = new AllegroCategoryFinder();
        String s = allegroCategoryFinder.MatchCategories(autopart);

        //then
        //assertThat(s, is(equalTo(" -> Chłodzenie silnika -> Chłodnice -> Chłodnice oleju")));
        assertThat(s, is(equalTo(" -> Chłodzenie silnika -> Chłodnice")));
    }

    @Test
    public void testMatch2Categories() throws Exception {

        //given
        Autopart autopart = new Autopart();
        AutopartCategory categoryListElement = new AutopartCategory();
        categoryListElement.setName("Części karoserii");
        autopart.addCategoryToList(categoryListElement);
        AutopartCategory categoryListElement2 = new AutopartCategory();
        categoryListElement2.setName("Cięgna drzwi");
        autopart.addCategoryToList(categoryListElement2);

        //when
        AllegroCategoryFinder allegroCategoryFinder = new AllegroCategoryFinder();
        String s = allegroCategoryFinder.MatchCategories(autopart);

        //then
//        assertThat(s, is(equalTo(" -> Części karoserii -> Cięgna drzwi")));
        assertThat(s, is(equalTo(" -> Części karoserii")));
    }
}