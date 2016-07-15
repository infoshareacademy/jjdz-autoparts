package reports.searched.part;

import reports.searched.part.model.DataSavedToDB;
import reports.searched.part.model.DataSavedToDBBuilder;
import reports.searched.part.model.PartForReportDTOBuilder;
import reports.searched.part.model.PartForReportModule;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class StorePart {

    @PersistenceContext
    EntityManager em;

    public Long save (PartForReportModule part){

        DataSavedToDB data = new DataSavedToDBBuilder()
                .setDateTime(part.getDateTime())
                .setUserId(part.getUserId())
                .setUserName(part.getUserName())
                .setPartDTO(new PartForReportDTOBuilder()
                        .setPartBrand(part.getPartBrand())
                        .setPartId(part.getPartId())
                        .setPartName(part.getPartName())
                        .setCarBrand(part.getCarBrand())
                        .setCarEngine(part.getCarEngine())
                        .setCarModel(part.getCarModel())
                        .setWeight(part.getWeight())
                        .build()
                        )
                .build();
        em.persist(data);
        return data.getId();
    }

    public PartForReportModule getPartById (Long id){
        return em.find(PartForReportModule.class, id);
    }
}
