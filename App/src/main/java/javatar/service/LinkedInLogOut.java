package javatar.service;


import javatar.web.SessionData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/logout")
public class LinkedInLogOut extends HttpServlet{

    private static final Logger LOGGER = LoggerFactory.getLogger(LinkedInLogOut.class);

    @Inject
    SessionData sessionData;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        sessionData.logout();
        resp.sendRedirect("/jjdz-autoparts");

        LOGGER.debug("User log out");
    }

}
