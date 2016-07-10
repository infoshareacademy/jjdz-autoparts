package javatar.service;

import javatar.model.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AllegroCategoryFinderTest {

    AllegroCategoryFinder allegroCategoryFinder = new AllegroCategoryFinder();
    AutopartAllegroListModel autopartAllegroListModel = new AutopartAllegroListModel();

    @Before
    public void initialize() {
        AllegroCategories cat1 = new AllegroCategoriesBuilder()
                .setCatName("Chłodnice")
                .setCatId(18690)
                .setCatParent(18689)
                .build();

        AllegroCategories cat2 = new AllegroCategoriesBuilder()
                .setCatName("Chłodnice oleju")
                .setCatId(251083)
                .setCatParent(18690)
                .build();

        AllegroCategories cat4 = new AllegroCategoriesBuilder()
                .setCatName("Chłodzenie silnika")
                .setCatId(18689)
                .setCatParent(620)
                .build();

        List<AllegroCategories> allegroCategoriesList = Arrays.asList(cat1, cat2,  cat4);
        autopartAllegroListModel.setAllegroCategories(allegroCategoriesList);
    }

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
        autopartAllegroListModel.setAutopart(autopart);
        //when

        String s = allegroCategoryFinder.matchCategories(autopartAllegroListModel);

        //then
        assertThat(s, is(equalTo("Chłodnice Chłodnice oleju;251083")));

    }

    @Test
    public void test_does_not_match_category() throws Exception {

        //given
        Autopart autopart = new Autopart();
        autopartAllegroListModel.setAutopart(autopart);

        //when
        String s = allegroCategoryFinder.matchCategories(autopartAllegroListModel);

        //then
        assertThat(s, is(equalTo("czesci samochodowe 620")));
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
        autopartAllegroListModel.setAutopart(autopart);

        //when
        String s = allegroCategoryFinder.matchCategoryFromHashMap(autopartAllegroListModel);

        //then
        assertThat(s, is(equalTo("Chłodzenie silnika Chłodnice;18690")));

    }


}