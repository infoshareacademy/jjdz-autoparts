package reports.mailing;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


@Stateless
public class SendMail {

    private static final Logger LOGGER = LogManager.getLogger();

    @Resource(name = "java:jboss/mail/gmail")
    private Session session;

    public void send(String addresses, String topic, String textMessage) {

        try {

            Message message = new MimeMessage(session);
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(addresses));
            message.setSubject(topic);
            message.setText(textMessage);

            Transport.send(message);
            System.out.println("meesage sent");

        } catch (MessagingException e) {
            LOGGER.warn( "Cannot send mail {}", e);
            System.out.println("meesage not sent");
        }
    }

}
