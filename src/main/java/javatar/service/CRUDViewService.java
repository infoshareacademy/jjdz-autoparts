package javatar.service;

import javatar.model.CRUD;
import javatar.model.CRUDwithDuplicatedFlag;
import javatar.model.CarInCRUD;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

public class CRUDViewService {
    @PersistenceContext
    EntityManager em;


    public List<CRUD> getCRUDValuesFromDB() {
        List<CRUD> resultList = em.createQuery("select c " +
                        "from CRUD c " +
                        "order by c.car.carBrand, c.car.carModel, c.car.carEngine, c.part.partBrand, c.part.partName, c.part.partId, c.id "
                , CRUD.class).getResultList();
        System.out.println("Entire CRUD from DB = " + resultList.toString());

        return resultList;

    }


    public List<CRUDwithDuplicatedFlag> duplicatedCarFlag (CarInCRUD car) {
        List<CRUD> crudValuesFromDB = getCRUDValuesFromDB();
        Integer check = -1;
        List<CRUDwithDuplicatedFlag> crudList = new ArrayList<>();
        CRUDwithDuplicatedFlag crudListElement = new CRUDwithDuplicatedFlag();

        System.out.println("Input CRUD: " + crudValuesFromDB.toString());
        System.out.println("input car = " + car);

        for (CRUD crud :
                crudValuesFromDB) {
            if (crudValuesFromDB.contains(car)) {
                check++;
                crudListElement.setFlag(check);
            }
            crudListElement.setCrud(crud);
            crudList.add(crudListElement);
        }

        System.out.println(" Output crudList = " + crudList.toString());
        return crudList;
    }


}
