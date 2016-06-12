package javatar.service;

import javatar.model.CarsBrands;
import javatar.model.DataCarsBrands;

import javax.ejb.Stateless;
import java.io.FileNotFoundException;

@Stateless
public class FindingTokenInJsonService {

    //TODO usunąć po poprawieniu formularzy

    final String DEFAULT_URL = "http://infoshareacademycom.2find.ru/api/v2?lang=polish";
    HtmlReader reader = new HtmlReader();
    JsonParserAll jsonParser = null;


    public String searchCarNameById(String carId) throws FileNotFoundException {

        DataCarsBrands dataCarsBrands = jsonParser.parseCarFile();
        for (CarsBrands c : dataCarsBrands.getData()) {
            if (c.getName().contains(carId.toUpperCase())) {
                String carName = c.getId();
                return carName;
            }
        }
        return "Error";
    }

}
