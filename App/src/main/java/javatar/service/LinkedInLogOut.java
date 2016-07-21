package javatar.service;


import javatar.web.SessionData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/logout")
public class LinkedInLogOut extends HttpServlet{

    private static final Logger LOGGER = LogManager.getLogger();

    @Inject
    SessionData sessionData;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        sessionData.logout();
        resp.sendRedirect("/jjdz-autoparts");

        LOGGER.debug("User log out");
    }

}
