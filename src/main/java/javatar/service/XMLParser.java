package javatar.service;


import javatar.model.AllegroCategories;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XMLParser {

    public static void main(String... arg) throws Exception {
        File file = new File("g:\\krzysztofjelonek.net\\jaxb\\postCode.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(AllegroCategories.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        PostCode postCode = (PostCode) jaxbUnmarshaller.unmarshal(file);

        System.out.println("Kod pocztowy: " + postCode.getCode());
        System.out.println("Miasto: " + postCode.getCity());
    }
}
