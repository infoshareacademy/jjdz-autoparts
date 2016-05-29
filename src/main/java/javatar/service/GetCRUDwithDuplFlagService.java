package javatar.service;

import javatar.model.CRUD;
import javatar.model.CRUDwithDuplicatedFlag;
import javatar.model.CarInCRUD;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class GetCRUDwithDuplFlagService {

    @EJB
    CRUDService crudService;

    public List<CRUDwithDuplicatedFlag> getCruDwithDuplicatedFlags() {
        List<CRUD> crudValuesFromDB = crudService.getCRUDValuesFromDB();
        List<CarInCRUD> cars = crudService.returnCarsDisctinct();
        List<CRUDwithDuplicatedFlag> crudViewList = new ArrayList<>();
        System.out.println("cars = " + cars.toString());

        for (CarInCRUD car :
                cars) {
            List<CRUDwithDuplicatedFlag> listWithFlags = crudService.getListWithFlags(car, crudValuesFromDB);
            System.out.println(listWithFlags);
            crudViewList.addAll(listWithFlags);
        }
        System.out.println("crudValuesFromDB = " + crudValuesFromDB);
        System.out.println("Crud element " + crudViewList.toString());
        return crudViewList;
    }
}
