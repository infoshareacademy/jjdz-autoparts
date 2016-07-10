package reports.mailing;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.annotation.Resource;
import javax.ejb.EJB;
import java.io.File;

@Ignore
@RunWith(Arquillian.class)
public class SendMailTest {

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
                .addClasses(SendMail.class);

        return archive;
    }

    @EJB
    SendMail sendMail;


    @Test
    public void should_send_mail() throws Exception {

        String address = "karbowska.aneta@gmail.com";
        String topic = "wiadomość testowa";
        String textMessage = "jest ok";

        SendMail sendMail = new SendMail();

        sendMail.send(address, topic, textMessage);

    }
}