package javatar.service;

import javatar.model.AllegroCategories;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class XMLParserTest {

    @Test
    public void testAllegroCategoryObject() throws Exception {

        XMLParser xmlParser = new XMLParser();
        List<AllegroCategories> allegroCategoriesList = xmlParser.allegroCategoryObject();

        assertTrue(allegroCategoriesList.size() > 10000);

    }
}