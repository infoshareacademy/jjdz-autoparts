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
        Autopart autopart = new Autopart();
        AutopartCategory categoryListElement = new AutopartCategory();
        categoryListElement.setName("Nadwozie");
        autopart.addCategoryToList(categoryListElement);
        AutopartCategory categoryListElement2 = new AutopartCategory();
        categoryListElement2.setName("Silnik");
        autopart.addCategoryToList(categoryListElement2);

        Integer s = allegroCategoryFinder.MatchCategoryFromHashMap(autopart);

        assertThat(s, is(equalTo(19089)));

    }

    @Test
    public void test_matching_category_from_HashMap_not_found() {
        Autopart autopart = new Autopart();
        AutopartCategory categoryListElement = new AutopartCategory();
        categoryListElement.setName("Nadwozie");
        autopart.addCategoryToList(categoryListElement);
        AutopartCategory categoryListElement2 = new AutopartCategory();
        categoryListElement2.setName("abc");
        autopart.addCategoryToList(categoryListElement2);

        Integer s = allegroCategoryFinder.MatchCategoryFromHashMap(autopart);

        assertThat(s, is(equalTo(8683)));

    }

    @Test
    public void test_create_allegro_link() throws Exception {
        Autopart autopart = new Autopart();
        AutopartCategory categoryListElement = new AutopartCategory();
        categoryListElement.setName("Układ chłodzenia");
        autopart.addCategoryToList(categoryListElement);

        String link = allegroCategoryFinder.createAllegroLink(autopart);

        assertThat(link,is(equalTo("http://allegro.pl/czesci-samochodowe-chlodzenie-silnika-19100")));

    }

    @Test
    public void test_create_allegro_link_not_in_HashMap() throws Exception {
        Autopart autopart = new Autopart();
        AutopartCategory categoryListElement = new AutopartCategory();
        categoryListElement.setName("Zawory (wentyle)");
        autopart.addCategoryToList(categoryListElement);

        String link = allegroCategoryFinder.createAllegroLink(autopart);

        assertThat(link,is(equalTo("http://allegro.pl/kola-felgi-zawory-wentyle-252812")));

    }
}