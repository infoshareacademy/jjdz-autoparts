package javatar.web;

import javatar.model.FormData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/CRUD")
public class CRUDServlet extends HttpServlet {
    private static final Logger LOGGER = LogManager.getLogger();

    @Inject
    FormData formData;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");



        RequestDispatcher dispatcher = req.getRequestDispatcher("Cart.jsp");
        dispatcher.forward(req, resp);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher dispatcher = req.getRequestDispatcher("Output.jsp");
        dispatcher.forward(req, resp);
    }
}
