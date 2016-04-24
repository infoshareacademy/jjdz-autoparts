package javatar.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Models")
public class ModelChoosingServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String brandOut = req.getParameter("brand");
        req.setAttribute("brandOut", brandOut);

        RequestDispatcher dispatcher = req.getRequestDispatcher("autoBranchChoosingOutputForm.jsp");
        dispatcher.forward(req, resp);
    }
}
