package javatar.service;

import javatar.model.GlobalUser;
import javatar.web.GlobalUserService;
import org.slf4j.LoggerFactory;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/usersList")
public class UsersListServlet extends HttpServlet {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(UsersListServlet.class);

    @EJB
    GlobalUserService globalUserService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        LOGGER.debug("Selecting all users list");
        List<GlobalUser> users = globalUserService.getUsers();

        LOGGER.debug("Selecting all admin users list");
        List<GlobalUser> usersAdmin = globalUserService.getUsersAdmin();

        LOGGER.debug("Selecting all not admin users list");
        List<GlobalUser> usersNotAdmin = globalUserService.getUsersNotAdmin();

        LOGGER.debug("Creating all users list with rights to reports");
        List<GlobalUser> usersReports = globalUserService.getUsersReports();

        LOGGER.debug("Creating all users list without rights to reports");
        List<GlobalUser> usersNotReports = globalUserService.getUsersNotReports();

        req.setAttribute("users", users);
        req.setAttribute("usersAdmin", usersAdmin);
        req.setAttribute("usersNotAdmin", usersNotAdmin);
        req.setAttribute("usersReports", usersReports);
        req.setAttribute("usersNotReports", usersNotReports);

        RequestDispatcher dispatcher = req.getRequestDispatcher("AdministrationConsole.jsp");
        dispatcher.forward(req, resp);

    }
}
