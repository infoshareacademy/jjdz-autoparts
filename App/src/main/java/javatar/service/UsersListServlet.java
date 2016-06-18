package javatar.service;

import javatar.model.GlobalUser;
import javatar.web.GlobalUserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
public class UsersListServlet extends HttpServlet{

    private static final Logger LOGGER = LogManager.getLogger();

    @EJB
    GlobalUserService globalUserService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        LOGGER.debug("Creating users list");
        List<GlobalUser> users = globalUserService.getUsers();

        req.setAttribute("users", users);

        RequestDispatcher dispatcher = req.getRequestDispatcher("AdministrationConsole.jsp");
        dispatcher.forward(req, resp);

    }
}
