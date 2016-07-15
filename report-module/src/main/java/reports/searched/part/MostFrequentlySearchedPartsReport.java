package reports.searched.part;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import reports.searched.part.model.PartForReportDTO;
import reports.searched.part.model.PartSearchSource;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDateTime;
import java.util.List;

@Stateless
public class MostFrequentlySearchedPartsReport {

    private static final Logger LOGGER = LogManager.getLogger();

    @PersistenceContext
    EntityManager em;


    public void getSearchedPartsForReport(LocalDateTime startDate, LocalDateTime endDate) {
        List<PartForReportDTO> resultList = em.createQuery("select distinct p.carBrand, p.carModel, p.carEngine, p.partBrand, p.partId, p.partName, count(p) " +
                "from PartForReportModule p " +
                "where " +
                "p.source=:source " +
                "and p.dateTime between :startDate and :endDate " +
                "group by p.carBrand, p.carModel, p.carEngine, p.partBrand, p.partId, p.partName")
                .setParameter("startDate", startDate)
                .setParameter("endDate", endDate)
                .setParameter("source", PartSearchSource.SEARCH)
                .getResultList();

        System.out.println(" search resultList.toString() = " + resultList.toString());
    }

    public void getCartPartsForReport(LocalDateTime startDate, LocalDateTime endDate) {
        List<PartForReportDTO> resultList = em.createQuery("select distinct p.carBrand, p.carModel, p.carEngine, p.partBrand, p.partId, p.partName, count(p) " +
                "from PartForReportModule p " +
                "where " +
                "p.source=:source " +
                "and p.dateTime between :startDate and :endDate " +
                "group by p.carBrand, p.carModel, p.carEngine, p.partBrand, p.partId, p.partName")
                .setParameter("startDate", startDate)
                .setParameter("endDate", endDate)
                .setParameter("source", PartSearchSource.CART)
                .getResultList();

        System.out.println(" cart resultList.toString() = " + resultList.toString());
    }

    public void getAll() {
        List resultList = em.createQuery("select p from PartForReportModule p ").getResultList();
        System.out.println("resultList = " + resultList);
    }
}
