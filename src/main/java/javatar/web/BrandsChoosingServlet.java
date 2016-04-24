package javatar.web;

import javatar.model.CarsBrands;
import javatar.service.BrandsJsonCache;

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

    @EJB
    BrandsJsonCache cache;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        Collection<CarsBrands> carsBrandsCollection = cache.returnBrandsCollection();

        req.setAttribute("brands", carsBrandsCollection);

        RequestDispatcher dispatcher = req.getRequestDispatcher("autoBranchChoosingForm.jsp");
        dispatcher.forward(req, resp);
    }



}
