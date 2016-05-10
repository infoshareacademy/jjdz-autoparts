package javatar.service;


import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import javatar.model.AllegroCategories;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XMLParser {

    AllegroCategories allegroCategories = null;

    public List<AllegroCategories> AllegroCategoryObject() throws Exception {


        FileReader reader = new FileReader("src/main/resources/Allegro_cathegories_2016-02-13.xml");
        XMLInputFactory f = XMLInputFactory.newFactory();

        XMLStreamReader sr = f.createXMLStreamReader(reader);
        XmlMapper xmlMapper = new XmlMapper();

        List<AllegroCategories> allegroCategoriesList = new ArrayList<>();

        while (sr.hasNext()) {
            if (sr.next() == XMLStreamConstants.START_ELEMENT && sr.getLocalName() == "item") {

                allegroCategories = xmlMapper.readValue(sr, AllegroCategories.class);
                if (allegroCategories != null) {
                    allegroCategoriesList.add(allegroCategories);
                }
            }

        }
        System.out.println(allegroCategoriesList.toString());
        return allegroCategoriesList;
    }
}
