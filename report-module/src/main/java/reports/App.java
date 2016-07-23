package reports;

import reports.mailing.Email;
import reports.mailing.EmailService;

import javax.mail.MessagingException;
import java.io.IOException;

public class App {



    public static void main(String[] args) throws IOException, MessagingException {


        Email email = new Email();

        EmailService emailService = new EmailService();

        email.setReceiver("danielkepczynski@gmail.com");
        email.setTitle("Raport wyszukiwanych części");
        email.setSender("autoparts.reporting@gmail.com");
        email.setMessage("test");
        emailService.sendMail(email);
    }
}
