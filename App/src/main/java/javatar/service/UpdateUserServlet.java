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

//import static jdk.nashorn.internal.runtime.JSType.isNumber;

@WebServlet(urlPatterns = "/updateUser")
public class UpdateUserServlet extends HttpServlet{

    private static final Logger LOGGER = LogManager.getLogger();

    @EJB
    GlobalUserService globalUserService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (Long.parseLong(req.getParameter("user")) > -200) {
            long id = Long.parseLong(req.getParameter("user"));
            LOGGER.debug("Id is valid. Updating user");
            GlobalUser user = globalUserService.getUserById(id);
            user.setReports(1);
            globalUserService.updateUser(user);
        } else {
            LOGGER.debug("User ID is not numeric");
        }
        resp.sendRedirect("usersList");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
