package javatar.web;

import javatar.model.AllegroCategories;
import javatar.model.AllegroCategoriesBuilder;
import javatar.service.APIallegro.APIallegro;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AllegroCategoriesCacheTest {

    @Mock
    private APIallegro apIallegro;

    @InjectMocks
    private AllegroCategoriesCache cache;

    @Test
    public void testInitialize() throws Exception {

        AllegroCategories brand = new AllegroCategoriesBuilder()
                .setCatName("opel")
                .setCatId(350)
                .setCatParent(620)
                .build();

        AllegroCategories part = new AllegroCategoriesBuilder()
                .setCatName("maska")
                .setCatId(400)
                .setCatParent(620)
                .build();

        List<AllegroCategories> categoriesList = Arrays.asList(brand, part);
        when(apIallegro.getAllegroCategoriesList()).thenReturn(categoriesList);

        cache.initialize();
        List<AllegroCategories> allegroCategories = cache.getAllegroCategoriesList();

        assertThat(allegroCategories.size(), is(2));

    }
}