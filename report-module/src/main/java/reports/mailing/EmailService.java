package reports.mailing;

import javax.ejb.Stateless;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

@Stateless
public class EmailService {

    InputStream inputStream;
    private String SMTP_AUTH_PWD;
    private String SMTP_HOST_NAME;
    private int SMTP_HOST_PORT;
    private String SMTP_AUTH_USER;

    public void sendMail(Email email) throws MessagingException, IOException {

        Properties props = createProperties(SMTP_AUTH_USER);
        getParametersFromFile();
        Session mailSession = createMailSession(props);
        MimeMessage message = createMessage(mailSession, email);
        sendMessage(mailSession, message);
    }

    private void getParametersFromFile() throws IOException{
        try {
            Properties prop = new Properties();
            String propFileName = "email.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            Date time = new Date(System.currentTimeMillis());

            SMTP_AUTH_PWD = prop.getProperty("SMTP_AUTH_PWD");
            SMTP_HOST_NAME = prop.getProperty("SMTP_HOST_NAME");
            SMTP_HOST_PORT = Integer.parseInt(prop.getProperty("SMTP_HOST_PORT"));
            SMTP_AUTH_USER = prop.getProperty("SMTP_AUTH_USER");

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
    }

    private Properties createProperties(String sender) {
        Properties props = new Properties();
        props.put("mail.transport.protocol", "smtps");
        props.put("mail.smtp.host", SMTP_HOST_NAME);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.from", sender);
        props.put("mail.smtp.user", SMTP_AUTH_USER);
        props.put("mail.smtp.password", SMTP_AUTH_PWD);
        props.put("mail.smtp.debug", "true");

        return props;
    }

    private Session createMailSession(Properties props) {
        Session mailSession = Session.getDefaultInstance(props);
        mailSession.setDebug(true);
        return mailSession;
    }

    private MimeMessage createMessage(Session mailSession, Email email) throws MessagingException {
        MimeMessage message = new MimeMessage(mailSession);
        message.setSubject(email.getTitle());
        message.setContent(email.getMessage(), "text/plain; charset=UTF-8");
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(email.getReceiver()));

        try {
            message.setSender(new InternetAddress(SMTP_AUTH_USER, "Powiadomienia"));
        } catch (UnsupportedEncodingException e) {
            //LOG.error("Encoding error in sender addres", e);
            message.setSender(new InternetAddress(SMTP_AUTH_USER));
        }
        return message;
    }

    private void sendMessage(Session mailSession, MimeMessage message) throws MessagingException {
        Transport transport = mailSession.getTransport();
        transport.connect(SMTP_HOST_NAME, SMTP_HOST_PORT, SMTP_AUTH_USER, SMTP_AUTH_PWD);
        transport.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
        transport.close();
    }
}
