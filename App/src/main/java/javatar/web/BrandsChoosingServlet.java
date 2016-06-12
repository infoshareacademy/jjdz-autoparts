package javatar.web;

import javatar.model.CarsBrands;
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
import java.util.Collection;

@WebServlet(urlPatterns = "/Brands")
public class BrandsChoosingServlet extends HttpServlet {

    private static final Logger LOGGER = LogManager.getLogger();

    @EJB
    BrandsJsonCache cache;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        Collection<CarsBrands> carsBrandsCollection = cache.returnBrandsCollection();

        req.setAttribute("brands", carsBrandsCollection);
        LOGGER.info("carsBransdCollection has size: {}",carsBrandsCollection.size());
        RequestDispatcher dispatcher = req.getRequestDispatcher("CarBranchChoosingForm.jsp");
        dispatcher.forward(req, resp);
    }



}
