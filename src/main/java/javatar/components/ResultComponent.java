package javatar.components;

import javatar.model.ResultDatabaseModel;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ResultComponent {

    @PersistenceContext
    EntityManager em;

    public ResultDatabaseModel sendResults(String partName, String partBrand, String partId, String allegroPath, String allegroSearchText){

        ResultDatabaseModel model = new ResultDatabaseModel();
        model.setAutopartName(partName);
        model.setAutopartBrand(partBrand);
        model.setAutopartId(partId);
        model.setAllegroPath(allegroPath);
        model.setAllegroSeatchText(allegroSearchText);

        em.persist(model);

        return model;
    }

}
