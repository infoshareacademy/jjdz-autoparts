package javatar.service;

import javatar.model.FormData;
import javatar.model.FormDataTable;
import javatar.web.SessionData;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDateTime;
import java.util.List;

@Stateless
public class FormDataTableService {

    @PersistenceContext
    EntityManager em;

    @Inject
    FormData formData;

    @Inject
    SessionData sessionData;


    public void sendResults() {

        FormDataTable formResults = new FormDataTable();
        formResults.setFormData(new FormData(formData.getCarBrand(),
                formData.getCarModel(),
                formData.getCarEngine(),
                formData.getPartBrand(),
                formData.getPartName(),
                formData.getPartId(),
                formData.getAllegroLink()));
        formResults.setUserName(sessionData.getUserData());
        formResults.setLocalDateTime(LocalDateTime.now());

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
