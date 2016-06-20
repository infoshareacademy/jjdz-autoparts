package javatar.service;

import javatar.model.GlobalUser;
import javatar.web.GlobalUserService;
import javatar.web.SessionData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/setAdminUser")
public class SetAdminUserServlet extends HttpServlet {

    private static final Logger LOGGER = LogManager.getLogger();

    @EJB
    GlobalUserService globalUserService;

    @Inject
    SessionData sessionData;


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.debug("Set admin user");

        String userId = req.getParameter("userId");
        if (Validation.isInteger(userId)) {
            long id = Long.parseLong(userId);
            LOGGER.debug("Id is valid. Updating user. Id: ", id);
            GlobalUser user = globalUserService.getUserById(id);
            user.setAdministrator(1);
            sessionData.setIsAdmin(1);
            globalUserService.updateUser(user);
        } else {
            LOGGER.debug("User ID is not numeric. ID: ", userId);
        }
        resp.sendRedirect("usersList");

    }

}
