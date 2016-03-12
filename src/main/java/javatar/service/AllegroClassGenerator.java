package javatar.service;

import javatar.model.Autopart;
import javatar.model.AutopartCategory;
import javatar.model.Car;

import java.io.IOException;
import java.util.List;

public class AllegroClassGenerator {

    CarIdentification car = new CarIdentification();
    AutopartIdentification part = new AutopartIdentification();





    public void MatchCategories() throws IOException {
        Car car = this.car.FindingCarManagement();
        Autopart autopart = part.findAutopart(car);

        List<AutopartCategory> categoryList = autopart.getCategoryList();


    }
}
