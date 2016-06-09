package javatar.service;

import javatar.model.*;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
        crud.setAllegroLink(formData.getAllegroLink());
        crud.setPartBrand(formData.getPartBrand());
        crud.setPartName(formData.getPartName());
        crud.setPartId(formData.getPartId());
        crud.setUserName(user);


        System.out.println("Result sent to DB: " + crud.toString());

        em.persist(crud);

    }

    public void removeCRUDValuesFormDB(Long idToRemove) {
        PartInCRUD partInCrud = em.find(CRUD.class, idToRemove);
        em.remove(partInCrud);
    }

    public List<PartInCRUD> getCRUDValuesFromDB() {
        List<PartInCRUD> resultList = em.createQuery("select c " +
                        "from CRUD c " +
                        "order by c.car.carBrand, c.car.carModel, c.car.carEngine,c.partBrand, c.partName, c.partId, c.id "
                , CRUD.class).getResultList();

        return resultList;

    }


    public List<CarInCRUD> returnCarsDisctinct() {
        List<CarInCRUD> carInCRUDList = em.createQuery("select distinct c.car " +
                        "from CRUD c "
                , CarInCRUD.class).getResultList();
        System.out.println("Lista aut: " + carInCRUDList.toString());
        return carInCRUDList;
    }


    public List<>
}
