package javatar.service;

import org.junit.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class JsonParserAztecCodeTest {

    static String readFile(String path, Charset encoding)
            throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }


    @Test
    public void testGetUserCarDataSampleCar() throws Exception {
        //GIVEN
        String sampleJson = readFile("src/test/resources/atenaAztecReturned.json", Charset.defaultCharset());
        JsonParserAztecCode jpac = new JsonParserAztecCode();
        //WHEN
        int testProductionYear = jpac.getUserCarData(sampleJson).getProductionYear();
        String testBrand = jpac.getUserCarData(sampleJson).getCarsBrand().getName();
        String testModel = jpac.getUserCarData(sampleJson).getCarsModel().getName();
        //THEN
        assertEquals(testProductionYear, 2005);
        assertEquals(testBrand, "PEUGEOT");
        assertEquals(testModel, "206");

    }
}