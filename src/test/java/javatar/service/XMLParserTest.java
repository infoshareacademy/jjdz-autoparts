package javatar.service;

import javatar.model.AllegroCategories;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

public class XMLParserTest {

    @Test
    public void testAllegroCategoryObject() throws Exception {

        XMLParser xmlParser = new XMLParser();
        InputStream allegroCategoriesFile = this.getClass().getResourceAsStream("/Allegro_cathegories_2016-02-13.xml");
        List<AllegroCategories> allegroCategoriesList = xmlParser.allegroCategoryObject(allegroCategoriesFile);
        System.out.println("allegroCategoriesList.size() = " + allegroCategoriesList.size());

        assertTrue(allegroCategoriesList.size() > 10000);

    }
}