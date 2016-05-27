package javatar.service;

import javatar.model.CRUD;
import javatar.model.FormData;
import javatar.model.FormDataTable;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDateTime;
import java.util.List;

@Stateless
public class CRUDService {

    @PersistenceContext
    EntityManager em;


    public void sendResults(FormData formData, String user) {

        CRUD crud = new CRUD();
        crud.setAllegroLink(formData.getAllegroLink());
        crud.setCarBrand(formData.getCarBrand());
        crud.setCarEngine(formData.getCarEngine());
        crud.setCarModel(formData.getCarModel());
        crud.setPartBrand(formData.getPartBrand());
        crud.setPartName(formData.getPartName());
        crud.setPartId(formData.getPartId());
        crud.setUserName(user);


        System.out.println("Result sent to DB: " + crud.toString());

        em.persist(crud);

    }

    public List<CRUD> getFormDataTable() {
        List<CRUD> resultList = em.createQuery("select c " +
                        "from CRUD c"
                , CRUD.class).getResultList();
        System.out.println("resultList.toString() = " + resultList.toString());

        return resultList;


    }
}
