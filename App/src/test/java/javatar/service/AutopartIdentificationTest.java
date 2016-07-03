package javatar.service;

import javatar.model.Autopart;
import javatar.model.AutopartCategory;
import javatar.model.JsonAutopart;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.*;

import static org.junit.Assert.assertEquals;
@Ignore
@RunWith(MockitoJUnitRunner.class)
public class AutopartIdentificationTest {

    @Mock
    private AutopartIdentification cut;
    final static String inputData = "1";
    final static String partInputData = "1\n1\n1";

    @Before
    public void setUp() {
        cut = new AutopartIdentification();
    }

    @Test
    public void testFindAutopart() throws Exception {
        //given
        String file = "src/main/resources/json_data/7tz.json";
        List<AutopartCategory> partCategoryList = new ArrayList<>();
        Autopart expected = new Autopart(partCategoryList, "Jednostka hydrauliczna, układ hamulcowy", "bosch", "0265231022");
        //when
        System.setIn(new java.io.ByteArrayInputStream(partInputData.getBytes()));
        Autopart actual = cut.findAutopart(file);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testFindCategory() throws Exception {
        //given
        String file = "src/main/resources/json_data/2h61.json";
        AutopartCategory expected = new AutopartCategory("Układ hamulcowy", "7t3", true, "/api/v2/find/go/8o2/2h61/7t3");
        //when
        System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));
        AutopartCategory actual = cut.findCategory(file);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintCategories() throws Exception {
        //given
        Collection<AutopartCategory> autopartCategories = Arrays.asList(
                new AutopartCategory("Nadwozie", "7sy", true, "/api/v2/find/fy/2mz/6yg/7sy"),
                new AutopartCategory("Silnik", "7sz", true, "/api/v2/find/fy/2mz/6yg/7sy"),
                new AutopartCategory("Układ wydechowy", "7t1", true, "/api/v2/find/fy/2mz/6yg/7sy")
        );
        Map expected = new HashMap<>();
        expected.put(1, "Nadwozie");
        expected.put(2, "Silnik");
        expected.put(3, "Układ wydechowy");
        //when
        Map actual = cut.printCategories(autopartCategories);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintAutoparts() throws Exception {
        //given
        Collection<JsonAutopart> jsonAutoparts = Arrays.asList(
                new JsonAutopart("BOSCH", "bosch", "1 23 456", "123456", "czesc pierwsza", "ok", "link"),
                new JsonAutopart("BRAND", "brand", "11 2 333", "112333", "czesc druga", "ok", "link"),
                new JsonAutopart("BOSCH", "bosch", "111 1 11", "111111", "czesc trzecia", "ok", "link")
        );
        Map expected = new HashMap<>();
        expected.put(1, "czesc pierwsza");
        expected.put(2, "czesc druga");
        expected.put(3, "czesc trzecia");
        //when
        Map actual = cut.printAutoparts(jsonAutoparts);
        //then
        assertEquals(expected, actual);
    }
}