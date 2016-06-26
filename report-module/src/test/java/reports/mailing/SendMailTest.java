package reports.mailing;

import org.junit.Test;

public class SendMailTest {

    @Test
    public void should_send_mail() throws Exception {

        String address = "karbowska.aneta@gmail.com";
        String topic = "wiadomość testowa";
        String textMessage = "jest ok";

        SendMail sendMail = new SendMail();

        sendMail.send(address,topic,textMessage);

    }
}