package javatar.service;

import javatar.model.FormData;
import javatar.model.FormDataTable;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDateTime;

@Stateless
public class FormDataTableService {

    @PersistenceContext
    EntityManager em;


    public void sendResults(FormData formData, String user, LocalDateTime dateTime, String allegroLink) {

        FormDataTable formResults = new FormDataTable();
        formResults.setFormData(formData);
        formResults.setUserName(user);
        formResults.setLocalDateTime(dateTime);
        formResults.setAllegroLink(allegroLink);

        em.persist(formResults);

    }
}
