package javatar.service;

import javatar.model.AllegroCategories;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class XMLParserTest {

    @Test
    public void testAllegroCategoryObject() throws Exception {

        XMLParser a = new XMLParser();
        Map<Integer, AllegroCategories> categoriesMap = a.AllegroCategoryObject();
        String pozostale = categoriesMap.get(19024).getCatName();

        assertTrue(categoriesMap.size() > 10);
        assertEquals("", "Pozostałe", pozostale);

    }
}