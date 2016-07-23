package reports.trigger;

import reports.mailing.Email;
import reports.mailing.EmailService;
import reports.searched.part.MostFrequentlySearchedParts;
import reports.searched.part.model.DTOwithSum;
import reports.users.GetUsersEmail;
import reports.users.User;

import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Startup;
import javax.ejb.Stateless;
import javax.jws.soap.SOAPBinding;
import javax.mail.MessagingException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Stateless
@Startup
public class ReportTrigger {


    public static final String MAIL_TITLE = "Raport tygodniowy wyszukiwanych części";

    @EJB
    GetUsersEmail getUsersEmail;

    @EJB
    EmailService emailService;

    @EJB
    MostFrequentlySearchedParts searchedParts;

    @Schedule(second = "*/30", hour = "*", minute = "*")
    public void run() throws IOException, MessagingException {

        ArrayList<User> users = getUsersEmail.getEmails();

        List<DTOwithSum> weeklyReport = searchedParts.getPartsForReport(LocalDateTime.now().minusDays(7l), LocalDateTime.now());

        String messageBody ="Witaj, \nponiżej znajduje się Twój raport tygodniowy:";

        for (DTOwithSum withSum : weeklyReport) {
            messageBody += withSum.toString();

        }

        for (User user : users) {
            Email email = new Email();
            email.setTitle(MAIL_TITLE);
            email.setMessage(messageBody);
            email.setReceiver(user.geteMail());
            emailService.sendMail(email);
        }

    }


}

