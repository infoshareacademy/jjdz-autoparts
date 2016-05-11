package javatar.service;


import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import javatar.model.AllegroCategories;

import javax.servlet.ServletContext;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XMLParser {

    AllegroCategories allegroCategories = null;

    public List<AllegroCategories> allegroCategoryObject() {


        FileReader reader = null;
        try {
            reader = new FileReader("src/main/resources/Allegro_cathegories_2016-02-13.xml");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        XMLInputFactory f = XMLInputFactory.newFactory();

        XMLStreamReader sr = null;
        try {
            sr = f.createXMLStreamReader(reader);
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
        XmlMapper xmlMapper = new XmlMapper();

        List<AllegroCategories> allegroCategoriesList = new ArrayList<>();

        try {
            while (sr.hasNext()) {
                if (sr.next() == XMLStreamConstants.START_ELEMENT && sr.getLocalName() == "item") {

                    allegroCategories = xmlMapper.readValue(sr, AllegroCategories.class);
                    if (allegroCategories != null) {
                        allegroCategoriesList.add(allegroCategories);
                    }
                }

            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(allegroCategoriesList.toString());
        return allegroCategoriesList;
    }
}
