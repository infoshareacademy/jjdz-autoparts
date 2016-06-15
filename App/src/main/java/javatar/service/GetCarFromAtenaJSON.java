package javatar.service;

import com.google.gson.Gson;
import javatar.model.Car;
import javatar.model.CarFromAztec;
import javatar.model.CarsBrands;
import javatar.model.CarsModels;

import javax.ejb.Stateless;

@Stateless
public class GetCarFromAtenaJSON {

    private static final String ERROR_BAD_SESSION_FROM_ATENA = "-4";


    public Car getUserCarData(String jsonString) throws NumberFormatException {
        Gson gson = new Gson();

        CarFromAztec jsonCar = gson.fromJson(jsonString, CarFromAztec.class);
        String aztecError = jsonCar.getCarFromAztecData().getError();

        if (aztecError.equals(ERROR_BAD_SESSION_FROM_ATENA)) {
            System.out.println("Błędny kod sesji");
            System.exit(-1);
            return null;
        }

        CarsBrands cb = new CarsBrands(jsonCar);
        CarsModels cm = new CarsModels(jsonCar);

        return new Car(cb, cm, jsonCar);

    }
}
