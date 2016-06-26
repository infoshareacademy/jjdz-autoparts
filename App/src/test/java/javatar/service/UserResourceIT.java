package javatar.service;

import com.google.gson.Gson;
import javatar.RestApplication;
import javatar.model.AccountType;
import javatar.model.GlobalUser;
import javatar.model.LinkedInUser;
import javatar.web.GlobalUserService;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.security.auth.spi.Users;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import java.io.File;
import java.net.URI;
import java.net.URL;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(Arquillian.class)
public class UserResourceIT {

    @Deployment
    public static WebArchive create() {

        File libs[] = Maven.resolver()
                .resolve("org.apache.logging.log4j:log4j-core:2.5").withTransitivity()
                .asFile();

        return ShrinkWrap.create(WebArchive.class)
                .addAsLibraries(libs)
                .addAsResource("test-persistence.xml", "META-INF/persistence.xml")
                .addAsResource("log4j2.xml", "log4j2.xml")
                .addClass(RestApplication.class)
                .addClass(GlobalUser.class)
                .addClass(GlobalUserService.class)
                .addClass(LinkedInUser.class)
                .addClass(AccountType.class)
                .addClass(UserResource.class);
    }

    static LinkedInUser linkedInUser;

    @EJB
    GlobalUserService globalUserService;

    static URI create_user_location;

    @Before
    public void setup_linkedin_user_and_database() {

        String linkedinJson = "{\n" +
                "\"emailAddress\": \"danielkepczynski@gmail.com\",\n" +
                " \"firstName\": \"Daniel\",\n" +
                " \"lastName\": \"Kępczyński\"\n" +
                "}";
        Gson gson = new Gson();
        linkedInUser = gson.fromJson(linkedinJson, LinkedInUser.class);

    }



    @Test
    @RunAsClient
    public void should_return_a_global_user(@ArquillianResource URL baseUrl) throws Exception {

        GlobalUser user = globalUserService.getGLobalUser(linkedInUser);

        URI uri = UriBuilder.fromUri(baseUrl.toString())
                .segment("api")
                .segment("users")
                .segment("all")
                .build();

        GlobalUser globalUser = ClientBuilder.newClient()
                .target(create_user_location)
                .request()
                .accept(MediaType.APPLICATION_JSON_TYPE + ";charset=utf-8")
                .get(GlobalUser.class);

        assertThat(globalUser.geteMail(), is("danielkepczynski@gmail.com"));


    }

//    @Ignore
//    @Test
//    public void should_return_all_user() throws Exception {
//
//    }
//
//    @Ignore
//    @Test
//    public void Should_return_users_with_rights_to_reports() throws Exception {
//
//    }
}