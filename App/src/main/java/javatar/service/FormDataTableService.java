package javatar.service;

import javatar.model.FormData;
import javatar.model.FormDataTable;
import javatar.web.SessionData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDateTime;
import java.util.List;

@Stateless
public class FormDataTableService {

    private static final Logger LOGGER = LogManager.getLogger();

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
                formData.getAllegroLink(),
                formData.getEngineLookupString()));
        formResults.setUserName(sessionData.getUserData());
        formResults.setLocalDateTime(LocalDateTime.now());

        if (isAnyFormDataTableFieldEmpty(formResults)) {
            LOGGER.error("NIEKOMPLETNE DANE WYSYŁANE DO BAZY!");
        }

        System.out.println("Result sent to DB: " + formResults.toString());

        em.persist(formResults);

    }

    public List<FormDataTable> getFormDataTable() {
        List<FormDataTable> resultList = em.createQuery("select fdt " +
                        "from FormDataTable fdt"
                , FormDataTable.class).getResultList();
        System.out.println("resultList.toString() = " + resultList.toString());

        if (resultList.isEmpty()) {
            LOGGER.error("BRAK DANYCH W BAZIE!");
        }

        return resultList;
    }

    public boolean isAnyFormDataTableFieldEmpty(FormDataTable formDataTable) {

        if (formDataTable.getUserName().length() < 1 || formDataTable.getUserName() == null) {
            LOGGER.warn("Pole użytkownika jest puste");
            return true;
        }
        if (formDataTable.getLocalDateTime() == null) {
            LOGGER.warn("Pole daty jest puste");
            return true;
        }
        if (formDataTable.getFormData().getCarBrand().length() < 1 || formDataTable.getFormData().getCarBrand() == null) {
            LOGGER.warn("Pole marki samochodu jest puste");
            return true;
        }
        if (formDataTable.getFormData().getCarModel().length() < 1 || formDataTable.getFormData().getCarModel() == null) {
            LOGGER.warn("Pole modelu samochodu jest puste");
            return true;
        }
        if (formDataTable.getFormData().getCarEngine().length() < 1 || formDataTable.getFormData().getCarEngine() == null) {
            LOGGER.warn("Pole silnika jest puste");
            return true;
        }
        if (formDataTable.getFormData().getPartBrand().length() < 1 || formDataTable.getFormData().getPartBrand() == null) {
            LOGGER.warn("Pole producenta częśći jest puste");
            return true;
        }
        if (formDataTable.getFormData().getPartName().length() < 1 || formDataTable.getFormData().getPartName() == null) {
            LOGGER.warn("Pole nazwy częśći jest puste");
            return true;
        }
        if (formDataTable.getFormData().getPartId().length() < 1 || formDataTable.getFormData().getPartId() == null) {
            LOGGER.warn("Pole nimeru częśći jest puste");
            return true;
        }
        if (formDataTable.getFormData().getAllegroLink().length() < 1 || formDataTable.getFormData().getAllegroLink() == null) {
            LOGGER.warn("Pole linku do allegro jest puste");
            return true;
        }

        return false;
    }
}
