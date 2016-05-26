package javatar.web;

import javatar.model.AccountType;
import javatar.model.GlobalUser;
import javatar.model.LinkedInUser;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(Arquillian.class)
public class GlobalUserServiceTest {

    @Deployment
    public static WebArchive deployment() {
        WebArchive archive = ShrinkWrap.create(WebArchive.class)
                .addAsResource("mysql-persistence.xml", "META-INF/persistence.xml")
                .addClasses(GlobalUserService.class)
                .addClasses(LinkedInUser.class)
                .addClass(AccountType.class)
                .addClass(GlobalUser.class);

        return archive;
    }

    @EJB
    GlobalUserService globalUserService;


    @Test
    public void should_return_new_user() throws Exception {

        LinkedInUser linkedInUser = mock(LinkedInUser.class);

        when(linkedInUser.getEmailAddress()).thenReturn("jan@kowalski.com");
        when(linkedInUser.getFirstName()).thenReturn("Jan");
        when(linkedInUser.getLastName()).thenReturn("Kowalski");

        GlobalUser globalUser = globalUserService.getGLobalUser(linkedInUser);

        assertThat(globalUser.getFirstName(), equalTo("Jan"));

    }

}