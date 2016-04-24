package javatar.components;

import javatar.model.ResultDatabaseModel;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


@RunWith(Arquillian.class)
public class ResultComponentTest {

    @PersistenceContext
    EntityManager em;

    @EJB
    ResultComponent component;

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addAsManifestResource("test-persistence.xml", "persistence.xml")
                .addClasses(ResultComponent.class)
                .addClasses(ResultDatabaseModel.class);
    }

    @Test
    public void should_update_database_with_given_data() throws Exception {

        //given
        final Integer id                = 1;
        final String partName           = "partName";
        final String partBrand          = "partBrand";
        final String partId             = "partId";
        final String allegroPath        = "allegroPath";
        final String allegroSearchText  = "allegroSearchText";

        ResultDatabaseModel model = new ResultDatabaseModel();
        model.setId(id);
        model.setAutopartName(partName);
        model.setAutopartBrand(partBrand);
        model.setAutopartId(partId);
        model.setAllegroPath(allegroPath);
        model.setAllegroSeatchText(allegroSearchText);

        //when
        component.sendResults(partName,partBrand,partId,allegroPath,allegroSearchText);

        //then
        ResultDatabaseModel entity = em.find(ResultDatabaseModel.class, id);
        assertThat(entity, is(equalTo(model)));
    }
}