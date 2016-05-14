package javatar.service;


import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import javatar.model.AllegroCategories;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class XMLParser {
    private static final Logger LOGGER = LogManager.getLogger();
    AllegroCategories allegroCategories = new AllegroCategories();


    public List<AllegroCategories> allegroCategoryObject(InputStream allegroCategoriesFile) {
        LOGGER.info("InputStream:{}",allegroCategoriesFile);
        XMLInputFactory f = XMLInputFactory.newFactory();
        XmlMapper xmlMapper = new XmlMapper();

        List<AllegroCategories> allegroCategoriesList = new ArrayList<>();

        try {
            XMLStreamReader sr = f.createXMLStreamReader(allegroCategoriesFile);
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
        }catch (IOException e) {
            e.printStackTrace();
        }


        LOGGER.info("Output list of allegro categories has size: {}",allegroCategoriesList.size());
        return allegroCategoriesList;
    }
}
