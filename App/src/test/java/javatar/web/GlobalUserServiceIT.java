package javatar.web;

import com.google.gson.Gson;
import javatar.model.AccountType;
import javatar.model.AdminEmail;
import javatar.model.GlobalUser;
import javatar.model.LinkedInUser;
import org.hamcrest.core.Is;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.modules.maven.ArtifactCoordinates;
import org.jboss.modules.maven.MavenResolver;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(Arquillian.class)
public class GlobalUserServiceIT {

    @Deployment
    public static WebArchive deployment() {
        File[] files = Maven.resolver()
                .resolve("org.apache.logging.log4j:log4j-core:2.5",
                        "org.apache.logging.log4j:log4j-api:2.5",
                        "com.google.code.gson:gson:2.6.1")
                .withoutTransitivity().asFile();

        WebArchive archive = ShrinkWrap.create(WebArchive.class)
                .addAsLibraries(files)
                .addAsResource("test-persistence.xml", "META-INF/persistence.xml")
                .addClasses(GlobalUserService.class)
                .addClasses(LinkedInUser.class)
                .addClass(AccountType.class)
                .addClasses(GlobalUser.class, AdminEmail.class);

        return archive;
    }

    @EJB
    GlobalUserService globalUserService;

    @PersistenceContext
    EntityManager em;

    @Test
    public void should_create_new_user() {
        //given
        String linkedinJson = "{\n" +
                "\"emailAddress\": \"danielkepczynski@gmail.com\",\n" +
                " \"firstName\": \"Daniel\",\n" +
                " \"lastName\": \"Kępczyński\"\n" +
                "}";
        Gson gson = new Gson();
        LinkedInUser linkedInUser = gson.fromJson(linkedinJson, LinkedInUser.class);

        //when
        globalUserService.getGLobalUser(linkedInUser);

        //then
        List<GlobalUser> list = em.createQuery("from GlobalUser", GlobalUser.class).getResultList();

        assertThat(list.size(), is(1));
        assertThat(list.get(0).geteMail(), is("danielkepczynski@gmail.com"));
    }


//    @Test
//    public void should_return_new_user() throws Exception {
//
//        LinkedInUser linkedInUser = mock(LinkedInUser.class);
//
//        when(linkedInUser.getEmailAddress()).thenReturn("jan@kowalski.com");
//        when(linkedInUser.getFirstName()).thenReturn("Jan");
//        when(linkedInUser.getLastName()).thenReturn("Kowalski");
//
//        GlobalUser globalUser = globalUserService.getGLobalUser(linkedInUser);
//
//        assertThat(globalUser.getFirstName(), equalTo("Jan"));
//
//    }

}