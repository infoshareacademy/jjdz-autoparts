package javatar.service;

import javatar.model.Autopart;
import javatar.model.AutopartCategory;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class CreateAllegroLinkTest {
    AllegroCategoryFinder allegroCategoryFinder = new AllegroCategoryFinder();
    CreateAllegroLink createAllegroLink = new CreateAllegroLink();

    @Test
    public void test_create_allegro_link() throws Exception {
        Autopart autopart = new Autopart();
        AutopartCategory categoryListElement = new AutopartCategory();
        categoryListElement.setName("Układ chłodzenia");
        autopart.addCategoryToList(categoryListElement);

        String link = createAllegroLink.createAllegroLink(autopart);

        assertThat(link,is(equalTo("http://allegro.pl/czesci-samochodowe-chlodzenie-silnika-19100")));

    }

    @Test
    public void test_create_allegro_link_not_in_HashMap() throws Exception {
        Autopart autopart = new Autopart();
        AutopartCategory categoryListElement = new AutopartCategory();
        categoryListElement.setName("Dwużlad");
        autopart.addCategoryToList(categoryListElement);

        String link = createAllegroLink.createAllegroLink(autopart);

        assertThat(link,is(equalTo("http://allegro.pl/czesci-samochodowe")));

    }
}