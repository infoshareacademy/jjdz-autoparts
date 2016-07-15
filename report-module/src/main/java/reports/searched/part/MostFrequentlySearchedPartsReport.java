package reports.searched.part;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import reports.searched.part.model.DataSavedToDB;
import reports.searched.part.model.PartForReportModule;
import reports.searched.part.model.PartForReportDTO;

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


    public void getPartsForReport(LocalDateTime startDate, LocalDateTime endDate) {

        List<DataSavedToDB> resultList = em.createQuery("select p " +
                "from DataSavedToDB p " +
                "where " +
                "p.dateTime between :startDate and :endDate ")
                .setParameter("startDate", startDate)
                .setParameter("endDate", endDate)
                .getResultList();

        LOGGER.info(" Number of parts from date: {} to date: {} is = {}", startDate, endDate, resultList.size());
        System.out.println("resultList.toString() = " + resultList.toString());

        List<PartForReportDTO> resultListDTO = em.createQuery("select distinct p.partDTO " +
                "from DataSavedToDB p " +
                "where " +
                "p.dateTime between :startDate and :endDate ")
                .setParameter("startDate", startDate)
                .setParameter("endDate", endDate)
                .getResultList();

        LOGGER.info("DTO Number of parts from date: {} to date: {} is = {}", startDate, endDate, resultListDTO.size());
        System.out.println("resultListDTO.toString() = " + resultListDTO.toString());

    }

}
