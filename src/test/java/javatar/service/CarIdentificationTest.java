package javatar.service;

import javatar.model.Car;
import javatar.model.CarsBrands;
import javatar.model.CarsEngineAndFuel;
import javatar.model.CarsModels;
import org.junit.Test;


import java.io.FileNotFoundException;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class CarIdentificationTest {

    @Test
    public void should_define_car_by_astec_code_answer() throws FileNotFoundException {
        //given
        CarIdentification ci = new CarIdentification();

        Car car = new Car();
        CarsBrands brand = new CarsBrands();
        CarsModels model = new CarsModels();

        brand.setName("VOLKSWAGEN");
        model.setName("JETTA VII SportWagon");
        car.setProductionYear(2015);
        car.setEngineCapacity("999,00cm3");
        car.setEnginePower("85,00KW");
        car.setFuelType("P");
        car.setCarsBrand(brand);
        car.setCarsModel(model);

        //when
        Car carOut = ci.FindingCarByAztecCodeAnswer(car);

        //then
        System.out.println(carOut.toString());
        assertThat(carOut.getEngineID(),is(equalTo("2h6l")));
    }

}