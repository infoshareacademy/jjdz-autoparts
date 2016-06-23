package javatar.service;

import javatar.model.GlobalUser;
import javatar.web.GlobalUserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/setReportsUser")
public class SetReportsUserServlet extends HttpServlet{

    private static final Logger LOGGER = LogManager.getLogger();

    @EJB
    GlobalUserService globalUserService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.debug("Add reports rights to user");

        String userId = req.getParameter("userId");
        if (Validation.isInteger(userId)) {
            long id = Long.parseLong(userId);
            LOGGER.debug("Id is valid. Updating user. ID: ", id);
            GlobalUser user = globalUserService.getUserById(id);
            user.setReports(1);
            globalUserService.updateUser(user);
        } else {
            LOGGER.debug("User ID is not numeric. ID: ", userId);
        }
        resp.sendRedirect("usersList");

    }

}
