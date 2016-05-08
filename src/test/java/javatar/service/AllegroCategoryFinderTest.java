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

        String s = allegroCategoryFinder.MatchCategories(autopart);

        //then
        assertThat(s, is(equalTo("Chłodnice Chłodnice oleju;251083")));

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
        String s = allegroCategoryFinder.MatchCategories(autopart);

        //then
       assertThat(s, is(equalTo("Części karoserii Cięgna drzwi;252811")));
    }

    @Test
    public void test_matching_category_from_HashMap() {
        //given
        Autopart autopart = new Autopart();
        AutopartCategory categoryListElement = new AutopartCategory();
        categoryListElement.setName("Części karoserii");
        autopart.addCategoryToList(categoryListElement);
        AutopartCategory categoryListElement2 = new AutopartCategory();
        categoryListElement2.setName("Cięgna drzwi");
        autopart.addCategoryToList(categoryListElement2);

        //when
        Autopart autopartOut = allegroCategoryFinder.MatchCategoryFromHashMap(autopart);

        //then
        //TODO wymyśl jakiś sensowny test
        assertThat(autopartOut.getCategoryList().size(), is(equalTo(2)));
    }

    @Test
    public void test_matching_category_from_HashMap_not_found() {
        Autopart autopart = new Autopart();
        AutopartCategory categoryListElement = new AutopartCategory();
        categoryListElement.setName("Zabytkowe");
        autopart.addCategoryToList(categoryListElement);
        AutopartCategory categoryListElement2 = new AutopartCategory();
        categoryListElement2.setName("abc");
        autopart.addCategoryToList(categoryListElement2);

        Autopart autopartOut = allegroCategoryFinder.MatchCategoryFromHashMap(autopart);

        //TODO wymyśl jakiś sensowny test
        assertThat(autopartOut.getCategoryList().size(), is(equalTo(2)));

    }


}