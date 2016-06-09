package javatar.service;

import javatar.model.*;
import javatar.model.CRUD.CRUD;
import javatar.model.CRUD.CarInCRUD;
import javatar.model.CRUD.ListCarsParts;
import javatar.model.CRUD.PartInCRUD;

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
        carInCRUD.setCarBrand(formData.getCarBrand());
        carInCRUD.setCarEngine(formData.getCarEngine());
        carInCRUD.setCarModel(formData.getCarModel());
        carInCRUD.setEngineLink(formData.getEngineLookupString());
        crud.setCar(carInCRUD);
        crud.setUserName(user);
        crud.setAllegroLink(formData.getAllegroLink());
        PartInCRUD part = new PartInCRUD();
        part.setPartBrand(formData.getPartBrand());
        part.setPartName(formData.getPartName());
        part.setPartId(formData.getPartId());
        crud.setPart(part);


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
                        "order by c.car.carBrand, c.car.carModel, c.car.carEngine,c.part.partBrand, c.part.partName, c.part.partId, c.id "
                , CRUD.class).getResultList();

        return resultList;

    }

    public List<ListCarsParts> getCarsWithPart(List<CarInCRUD> cars, String user) {

        List<ListCarsParts> list = new ArrayList<>();


        for (CarInCRUD car :
                cars) {

            List carQuery = em.createQuery("select distinct c.part from CRUD c where c.car=:carQuery and c.userName=:user").setParameter("carQuery", car).setParameter("user",user).getResultList();
            ListCarsParts carsParts = new ListCarsParts();
            carsParts.setCarInCRUD(car);
            carsParts.setPartsInCRUD(carQuery);

            list.add(carsParts);

            System.out.println("List of cars with list of parts = " + list);
        }
        return list;

    }


    public List<CarInCRUD> returnCarsDisctinct() {
        List<CarInCRUD> carInCRUDList = em.createQuery("select distinct c.car " +
                        "from CRUD c "
                , CarInCRUD.class).getResultList();
        System.out.println("Lista aut: " + carInCRUDList.toString());
        return carInCRUDList;
    }


}
