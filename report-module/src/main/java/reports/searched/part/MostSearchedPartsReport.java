package reports.searched.part;

import org.hibernate.sql.Select;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class MostSearchedPartsReport {

    @PersistenceContext
    EntityManager em;


    private List<PartForReportModule> getAllPartsForReport() {
        return em.createQuery("select p from PartForReportModule p", PartForReportModule.class)
                .getResultList();
    }

}
