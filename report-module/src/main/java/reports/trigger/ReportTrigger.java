package reports.trigger;

import reports.users.GetUsersEmail;

import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Startup;
import javax.ejb.Stateless;
import java.io.IOException;
import javax.ejb.Schedule;
import javax.ejb.Startup;
import javax.ejb.Stateless;

@Stateless
@Startup
public class ReportTrigger {

    @EJB
    GetUsersEmail getUsersEmail;

    @Schedule(second = "*/5",  hour = "*", minute = "*")
    public void run() throws IOException {
        System.out.println("test");
        String userEmails = getUsersEmail.getEmails();

    }


}
