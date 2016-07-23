package javatar.service;

import com.google.gson.Gson;
import javatar.RestApplication;
import javatar.model.AccountType;
import javatar.model.AdminEmail;
import javatar.model.GlobalUser;
import javatar.model.LinkedInUser;
import javatar.web.GlobalUserService;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.junit.InSequence;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(Arquillian.class)
public class UserResourceIT {

    @Deployment
    public static WebArchive deployment() {

        File[] libs = Maven.resolver()
                .resolve("org.apache.logging.log4j:log4j-core:2.5",
                        "org.apache.logging.log4j:log4j-api:2.5",
                        "com.google.code.gson:gson:2.6.1")
                .withTransitivity()
                .asFile();

        return ShrinkWrap.create(WebArchive.class)
                .addAsLibraries(libs)
                .addAsResource("test-persistence.xml", "META-INF/persistence.xml")
                // .addAsResource("log4j2.xml", "log4j2.xml")
                .addClass(RestApplication.class)
                .addClass(GlobalUser.class)
                .addClass(GlobalUserService.class)
                .addClass(LinkedInUser.class)
                .addClass(AccountType.class)
                .addClass(UserResource.class)
                .addClass(AdminEmail.class);
    }

    @EJB
    GlobalUserService globalUserService;

    @PersistenceContext
    EntityManager em;

    @Test
    @InSequence(1)
    public void add_user_to_database() {

        String linkedinJson = "{\n" +
                "\"emailAddress\": \"danielkepczynski@gmail.com\",\n" +
                " \"firstName\": \"Daniel\",\n" +
                " \"lastName\": \"Kępczyński\"\n" +
                "}";
        Gson gson = new Gson();
        LinkedInUser linkedInUser = gson.fromJson(linkedinJson, LinkedInUser.class);

        globalUserService.getGLobalUser(linkedInUser);

        List<GlobalUser> users = em.createQuery("from GlobalUser", GlobalUser.class).getResultList();

        assertThat(users.size(), is(1));
    }

    @Test
    @InSequence(2)
    public void should_return_a_global_user(@ArquillianResource URL baseUrl) throws Exception {

        URI uri = UriBuilder.fromUri(baseUrl.toString())
                .segment("api")
                .segment("users")
                .segment("1")
                .build();

        GlobalUser globalUser = ClientBuilder.newClient()
                .target(uri.toString())
                .request()
                .accept(MediaType.APPLICATION_JSON_TYPE + ";charset=utf-8")
                .get(GlobalUser.class);

        assertThat(globalUser.geteMail(), is("danielkepczynski@gmail.com"));

    }

    @Test
    @InSequence(3)
    public void should_return_admin_user(){

        List<GlobalUser> users = globalUserService.getUsersAdmin();

        assertThat(users.size(), is(1));
    }

    @Test
    @InSequence(4)
    public void should_not_return_report_user(){

        List<GlobalUser> users = globalUserService.getUsersReports();

        assertThat(users.size(), is(0));
    }

}