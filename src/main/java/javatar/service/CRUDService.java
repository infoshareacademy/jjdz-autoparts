package javatar.service;

import javatar.model.*;
import javatar.model.CRUD.*;

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
        part.setRecordCount(0);
        crud.setPart(part);


        System.out.println("Result sent to DB: " + crud.toString());

        em.persist(crud);

    }

    public List<ListCarsParts> getCarsWithPart(List<CarInCRUD> cars, String user) {

        List<ListCarsParts> list = new ArrayList<>();


        for (CarInCRUD car :
                cars) {

            List carQuery = em.createQuery("select distinct c.part from CRUD c where c.car=:carQuery and c.userName=:user").setParameter("carQuery", car).setParameter("user", user).getResultList();
            ListCarsParts carsParts = new ListCarsParts();
            carsParts.setCarInCRUD(car);
            if (carQuery.size() > 0) {
                for (Object part :
                        carQuery) {
                    PartInCRUD partInCrud = (PartInCRUD) part;
                    Integer recordSize = em.createQuery("select c.id from CRUD c where c.car=:carQuery and c.part=:partQuery and c.userName=:user")
                            .setParameter("carQuery", car).setParameter("partQuery", partInCrud).setParameter("user", user).getResultList().size();
                    partInCrud.setRecordCount(recordSize);
                    part = partInCrud;

                }
            }

            carsParts.setPartsInCRUD(carQuery);
            list.add(carsParts);

            System.out.println("List of cars with list of parts = " + list);
        }
        return list;

    }


    public List<CarInCRUD> returnCarsDisctinct(String user) {
        List<CarInCRUD> carInCRUDList = em.createQuery("select distinct c.car " +
                        "from CRUD c where c.userName=:user "
                , CarInCRUD.class).setParameter("user", user).getResultList();
        System.out.println("Lista aut: " + carInCRUDList.toString());
        return carInCRUDList;
    }


    public void removeFromCRUD(CarInCRUD inputCar, PartInCRUD inputPart, String user) {
        System.out.println("inputCar.toString() = " + inputCar.toString());
        System.out.println("inputPart = " + inputPart.toString());
        List<Long> listOfIds = em.createQuery("select c.id from CRUD c where c.car.carBrand=:carQuery and c.car.carModel=:carModel and c.part.partBrand=:partQuery and c.userName=:user")
                .setParameter("carQuery", inputCar.getCarBrand())
                .setParameter("partQuery", inputPart.getPartBrand())
                .setParameter("user", user).getResultList();

        if (listOfIds.size() > 0) {
            CRUD crud = em.find(CRUD.class, listOfIds.get(0));
            em.remove(crud);
        }
    }

}