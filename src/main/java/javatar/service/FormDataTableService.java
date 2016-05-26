package javatar.service;

import javatar.model.FormData;
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


    public void sendResults(FormData formData, String user, LocalDateTime dateTime, String allegroLink) {

        FormDataTable formResults = new FormDataTable();
        formResults.setFormData(formData);
        formResults.setUserName(user);
        formResults.setLocalDateTime(dateTime);

        System.out.println("Result sent to DB: " + formResults.toString());

        em.persist(formResults);

    }

    public List<FormDataTable> getFormDataTable() {
        List<FormDataTable> resultList = em.createQuery("select new FormDataTable (fdt.formData, fdt.userName, fdt.localDateTime) " +
                        "from FormDataTable fdt"
                , FormDataTable.class).getResultList();
        System.out.println("resultList.toString() = " + resultList.toString());

        return resultList;


    }
}
