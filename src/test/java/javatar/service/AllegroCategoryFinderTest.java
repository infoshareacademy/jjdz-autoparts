package javatar.service;

import javatar.model.Autopart;
import javatar.model.AutopartCategory;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AllegroCategoryFinderTest {

    AllegroCategoryFinder allegroCategoryFinder = new AllegroCategoryFinder();

    @Test
    public void test_match_3_categories() throws Exception {

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

        String s = allegroCategoryFinder.MatchCategories(autopart);

        //then
        assertThat(s, is(equalTo("Chłodnice Chłodnice oleju;251083")));

    }

    @Test
    public void test_match_2_categories() throws Exception {

        //given
        Autopart autopart = new Autopart();
        AutopartCategory categoryListElement = new AutopartCategory();
        categoryListElement.setName("Części karoserii");
        autopart.addCategoryToList(categoryListElement);
        AutopartCategory categoryListElement2 = new AutopartCategory();
        categoryListElement2.setName("Maski");
        autopart.addCategoryToList(categoryListElement2);

        //when
        String s = allegroCategoryFinder.MatchCategories(autopart);

        //then
       assertThat(s, is(equalTo("Części samochodowe Części karoserii;4094")));
    }

    @Test
    public void test_does_not_match_category() throws Exception {

        //given
        Autopart autopart = new Autopart();

        //when
        String s = allegroCategoryFinder.MatchCategories(autopart);

        //then
        assertThat(s, is(equalTo("Części samochodowe 620")));
    }

    @Test
    public void test_matching_category_from_HashMap() {
        Autopart autopart = new Autopart();
        AutopartCategory categoryListElement = new AutopartCategory();
        categoryListElement.setName("Układ chłodzenia");
        autopart.addCategoryToList(categoryListElement);
        AutopartCategory categoryListElement2 = new AutopartCategory();
        categoryListElement2.setName("Chłodnice");
        autopart.addCategoryToList(categoryListElement2);

        //when
        String s = allegroCategoryFinder.MatchCategoryFromHashMap(autopart);

        //then
        assertThat(s, is(equalTo("Chłodzenie silnika Chłodnice;18690")));

    }


}