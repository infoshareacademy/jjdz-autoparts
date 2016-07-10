package javatar.service.apiAllegro;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.Ignore;
import org.junit.runner.RunWith;

import javax.ejb.EJB;
import java.io.File;

@Ignore
@RunWith(Arquillian.class)
public class APIallegroTest {

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
                .addClass(APIallegro.class);

    }

    @EJB
    APIallegro apIallegro;

}