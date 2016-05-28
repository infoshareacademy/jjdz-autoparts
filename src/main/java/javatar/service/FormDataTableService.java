package javatar.service;

import javatar.model.FormData;
import javatar.model.FormData2;
import javatar.model.FormDataTable;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDateTime;
import java.util.List;

@Stateless
public class FormDataTableService {

    @PersistenceContext
    EntityManager em;


    public void sendResults(FormData formData, String user, LocalDateTime dateTime) {

        FormData2 formData2 = new FormData2();
        formData2.setCarBrand(formData.getCarBrand());
        formData2.setCarModel(formData.getCarModel());
        formData2.setCarEngine(formData.getCarEngine());
        formData2.setPartBrand(formData.getPartBrand());
        formData2.setPartName(formData.getPartName());
        formData2.setPartId(formData.getPartId());
        formData2.setAllegroLink(formData.getAllegroLink());

        FormDataTable formResults = new FormDataTable();
        formResults.setFormData(formData2);
        formResults.setUserName(user);
        formResults.setLocalDateTime(dateTime);

        System.out.println("Result sent to DB: " + formResults.toString());

        em.persist(formResults);

    }

    public List<FormDataTable> getFormDataTable() {
                List<FormDataTable> resultList = em.createQuery("select fdt " +
                        "from FormDataTable fdt"
                , FormDataTable.class).getResultList();
        System.out.println("resultList.toString() = " + resultList.toString());

        return resultList;


    }
}
