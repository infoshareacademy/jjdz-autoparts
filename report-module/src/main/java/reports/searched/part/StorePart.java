package reports.searched.part;

import reports.searched.part.model.PartForReportModule;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class StorePart {

    @PersistenceContext
    EntityManager em;

    public Long save (PartForReportModule part){
        em.persist(part);
        return part.getId();
    }

    public PartForReportModule getPartById (Long id){
        return em.find(PartForReportModule.class, id);
    }
}
