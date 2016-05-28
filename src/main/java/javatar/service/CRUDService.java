package javatar.service;

import javatar.model.*;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class CRUDService {

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
        System.out.println("Entire CRUD from DB = " + resultList.toString());

        return resultList;

    }



    public List<CRUDwithDuplicatedFlag> getListWithFlags() {

        CRUDViewService crudViewService = new CRUDViewService();
        List<CarInCRUD> carInCRUDList = em.createQuery("select c.car " +
                        "from CRUD c "
                , CarInCRUD.class).getResultList();
        System.out.println("Lista aut: " + carInCRUDList.toString());

        List<CRUDwithDuplicatedFlag> cruDwithDuplicatedFlags = new ArrayList<>();
        for (CarInCRUD car :
                carInCRUDList) {
            cruDwithDuplicatedFlags = crudViewService.duplicatedCarFlag(car);
        }
        return cruDwithDuplicatedFlags;
    }

}
