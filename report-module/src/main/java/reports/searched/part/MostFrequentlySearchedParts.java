package reports.searched.part;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import reports.searched.part.model.DTOwithSum;
import reports.searched.part.model.PartForReportDTO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class MostFrequentlySearchedParts {

    private static final Logger LOGGER = LogManager.getLogger();

    @PersistenceContext
    EntityManager em;


    public List<DTOwithSum> getPartsForReport(LocalDateTime startDate, LocalDateTime endDate) {

        List<PartForReportDTO> resultListDTO = em.createQuery("select distinct p.partDTO " +
                "from DataSavedToDB p " +
                "where " +
                "p.dateTime between :startDate and :endDate ")
                .setParameter("startDate", startDate)
                .setParameter("endDate", endDate)
                .getResultList();

        LOGGER.info("DTO Number of parts from date: {} to date: {} is = {}", startDate, endDate, resultListDTO.size());

        List<DTOwithSum> dtosList = new ArrayList<>();
        for (PartForReportDTO part :
                resultListDTO) {
            double sum = (double) em.createQuery("select sum (d.weight) " +
                    "from DataSavedToDB d " +
                    "where d.partDTO=:part")
                    .setParameter("part", part)
                    .getSingleResult();
            dtosList.add(new DTOwithSum(part, sum));
            LOGGER.info("dtosList = {}", dtosList.toString());

        }

        dtosList.sort((d1, d2) -> {
            return Double.compare(d2.getSum(),d1.getSum());
        });

        LOGGER.info("Sorted dtosList = {}", dtosList.toString());

        if(dtosList.size()>10){
            return dtosList.subList(0,10);
        }

        return dtosList;
    }

}
