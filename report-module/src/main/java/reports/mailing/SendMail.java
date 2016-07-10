package reports.mailing;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Resource;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.naming.InitialContext;

@Stateless
public class SendMail {

    private static final Logger LOGGER = LogManager.getLogger();

    @Resource(mappedName = "java:jboss/mail/Default")
    private Session mailSession;

    public void send(String addresses, String topic, String textMessage) {

        try {

            Message message = new MimeMessage(mailSession);
            Address from = new InternetAddress("autoparts.reporting@gmail.com");
            message.setFrom(from);
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(addresses));
            message.setSubject(topic);
            message.setContent(textMessage, "text/plain");

            Transport.send(message);
            System.out.println("message sent");

        } catch (AddressException e) {
            LOGGER.warn("Cannot send mail {}", e);
            System.out.println("message not sent");
        } catch (MessagingException e) {
            LOGGER.warn( "Cannot send mail {}", e);
            System.out.println("message not sent");
        }
    }


}
