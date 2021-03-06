package javatar.service;

import javatar.model.GlobalUser;
import javatar.web.GlobalUserService;
import org.slf4j.LoggerFactory;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/revokeReports")
public class RevokeReportsServlet extends HttpServlet {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(RevokeReportsServlet.class);

    @EJB
    GlobalUserService globalUserService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.debug("Revoke reports rights");

        String userId = req.getParameter("userId");
        if (Validation.isInteger(userId)) {
            long id = Long.parseLong(userId);
            LOGGER.debug("Id is valid. Updating user");
            GlobalUser user = globalUserService.getUserById(id);
            user.setReports(0);
            globalUserService.updateUser(user);
        } else {
            LOGGER.debug("User ID is not numeric");
        }
        resp.sendRedirect("usersList");

    }
}
