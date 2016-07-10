package javatar.web;

import javatar.model.Email;
import javatar.service.EmailService;

import javax.ejb.EJB;
import javax.mail.MessagingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Email")
public class EmailServlet extends HttpServlet {

    @EJB
    EmailService emailService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String recipent = req.getParameter("recipent");
        String title = "test";
        String message = req.getParameter("message");

        Email email = new Email("autoparts.reporting@gmail.com", recipent, title, message);

        try {
            emailService.sendMail(email);
        } catch (MessagingException e) {
            e.printStackTrace();
        }


        RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
        dispatcher.forward(req, resp);
    }
}
