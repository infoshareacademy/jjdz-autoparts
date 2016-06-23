package javatar.service;

import com.google.gson.Gson;
import javatar.model.Car;
import javatar.model.CarFromAztec;
import javatar.model.CarsBrands;
import javatar.model.CarsModels;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class GetCarFromAtenaJSON {

    private static final Logger LOGGER = LogManager.getLogger();


    private static final String ERROR_BAD_SESSION_FROM_ATENA = "-4";


    public Car getUserCarData(String jsonString) throws NumberFormatException {
        Gson gson = new Gson();
        LOGGER.debug("Creating car from Atena JSON");

        CarFromAztec jsonCar = gson.fromJson(jsonString, CarFromAztec.class);

        LOGGER.debug("Car created");
        return createCarFromJsonCar(jsonCar);

    }

    private Car createCarFromJsonCar(CarFromAztec carFromAztec) {

        String aztecError = carFromAztec.getCarFromAztecData().getError();

        if (aztecError.equals(ERROR_BAD_SESSION_FROM_ATENA)) {
            LOGGER.debug("Wrong session key");
            System.exit(-1);
            return null;
        }

        CarsBrands cb = new CarsBrands(carFromAztec);
        CarsModels cm = new CarsModels(carFromAztec);

        return new Car(cb, cm, carFromAztec);

    }
}
