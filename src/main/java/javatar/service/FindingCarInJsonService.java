package javatar.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.io.FileNotFoundException;

@Stateless
public class FindingCarInJsonService {

    @EJB
    BrandsJsonCache brands;

    public String searchCarId(String searchToken) throws FileNotFoundException {
//        String carID = "";
//        Collection<CarsBrands> initializedBrands = brands.initialize();
//
//
//        for (CarsBrands c : initializedBrands) {
//            if (c.getName().contains(searchToken.toUpperCase())) {
//
//                carID = c.getId();
//                return carID;
//
//            }
//
//        }

        return "Error";
    }

}
