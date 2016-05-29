package javatar.service;

import javatar.model.*;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class CRUDService {

    private static final Integer DEFAULT_FLAG = 0;
    @PersistenceContext
    EntityManager em;


    public void sendResults(FormData formData, String user) {

        CRUD crud = new CRUD();
        CarInCRUD carInCRUD = new CarInCRUD();
        PartInCRUD partinCRUD = new PartInCRUD();
        carInCRUD.setCarBrand(formData.getCarBrand());
        carInCRUD.setCarEngine(formData.getCarEngine());
        carInCRUD.setCarModel(formData.getCarModel());
        crud.setCar(carInCRUD);
        crud.setAllegroLink(formData.getAllegroLink());
        partinCRUD.setPartBrand(formData.getPartBrand());
        partinCRUD.setPartName(formData.getPartName());
        partinCRUD.setPartId(formData.getPartId());
        crud.setPart(partinCRUD);
        crud.setUserName(user);
        crud.setEngineLink(formData.getEngineLookupString());


        System.out.println("Result sent to DB: " + crud.toString());

        em.persist(crud);

    }

    public void removeCRUDValuesFormDB(Long idToRemove) {
        CRUD crud = em.find(CRUD.class, idToRemove);
        em.remove(crud);
    }

    public List<CRUD> getCRUDValuesFromDB() {
        List<CRUD> resultList = em.createQuery("select c " +
                        "from CRUD c " +
                        "order by c.car.carBrand, c.car.carModel, c.car.carEngine, c.part.partBrand, c.part.partName, c.part.partId, c.id "
                , CRUD.class).getResultList();

        return resultList;

    }


    public List<CRUDwithDuplicatedFlag> getListWithFlags(CarInCRUD car, List<CRUD> crudList) {
        List<CRUDwithDuplicatedFlag> cruDwithDuplicatedFlags = new ArrayList<>();
        Integer duplicatedFlag = 0;

        for (CRUD crudElement :
                crudList) {
            System.out.println("crudElement.getCar() = "+crudElement.getCar());
            System.out.println("car = " + car);
            if (crudElement.getCar().equals(car)) {
                System.out.println("Updated CRUD row: " + crudElement.toString());
                CRUDwithDuplicatedFlag newListElement = new CRUDwithDuplicatedFlag();
                newListElement.setCrud(crudElement);
                newListElement.setFlag(duplicatedFlag);
                cruDwithDuplicatedFlags.add(newListElement);
                duplicatedFlag++;
            } else {
                System.out.println("crudElement not updated = " + crudElement.toString());
            }
        }
        return cruDwithDuplicatedFlags;
    }

    public List<CarInCRUD> returnCarsDisctinct() {
        List<CarInCRUD> carInCRUDList = em.createQuery("select distinct c.car " +
                        "from CRUD c "
                , CarInCRUD.class).getResultList();
        System.out.println("Lista aut: " + carInCRUDList.toString());
        return carInCRUDList;
    }


}
