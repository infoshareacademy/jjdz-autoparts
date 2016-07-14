package reports.searched.part;

import org.hibernate.sql.Select;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDateTime;
import java.util.List;

public class MostFrequentlySearchedPartsReport {

    @PersistenceContext
    EntityManager em;


    private List<PartForReportModule> getAllPartsForReport(LocalDateTime startDate, LocalDateTime endDate, PartSearchSource source) {
        return em.createQuery("select p. from PartForReportModule p", PartForReportModule.class)
                .getResultList();
    }

}
