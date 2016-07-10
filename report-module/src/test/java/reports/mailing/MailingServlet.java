package reports.mailing;


import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/Mail")
public class MailingServlet extends HttpServlet {

    @Inject
    SendMail sendMail;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        String address = "karbowska.aneta@gmail.com";
        String topic = "wiadomość testowa";
        String textMessage = "jest ok";

        SendMail sendMail = new SendMail();

        sendMail.send(address, topic, textMessage);
    }
}
