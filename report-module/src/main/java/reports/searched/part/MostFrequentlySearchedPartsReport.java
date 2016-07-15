package reports.searched.part;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDateTime;
import java.util.List;

@Stateless
public class MostFrequentlySearchedPartsReport {

    @PersistenceContext
    EntityManager em;


    public void getSearchedPartsForReport(LocalDateTime startDate, LocalDateTime endDate) {
        List resultList = em.createQuery("select distinct p.partBrand from PartForReportModule p " +
                "where p.source=:source " +
                "and p.dateTime between :startDate and :endDate")
                .setParameter("startDate", startDate)
                .setParameter("endDate", endDate)
                .setParameter("source", PartSearchSource.SEARCH)
                .getResultList();

        System.out.println(" search resultList.toString() = " + resultList.toString());
    }


    public void getCartPartsForReport(LocalDateTime startDate, LocalDateTime endDate) {
        List resultList = em.createQuery("select p.partBrand from PartForReportModule p " +
                "where p.source=:source and p.dateTime between :startDate and :endDate")
                .setParameter("startDate", startDate)
                .setParameter("endDate", endDate)
                .setParameter("source", PartSearchSource.CART)
                .getResultList();

        System.out.println(" cart resultList.toString() = " + resultList.toString());
    }

    public void getAll(){
        List resultList = em.createQuery("select p from PartForReportModule p ").getResultList();
        System.out.println("resultList = " + resultList);
    }
}
