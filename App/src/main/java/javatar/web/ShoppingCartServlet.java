package javatar.web;

import javatar.model.FormData;
import javatar.service.CRUDService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.net.URI;

@WebServlet(urlPatterns = "/AddingToCart")
public class ShoppingCartServlet extends HttpServlet {

    private static final Logger LOGGER = LogManager.getLogger();

    @Inject
    FormData formData;

    @Inject
    SessionData sessionData;

    @EJB
    CRUDService crudService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        req.setAttribute("partName", formData.getPartName());
        req.setAttribute("partBrand", formData.getPartBrand());
        req.setAttribute("partId", formData.getPartId());
        req.setAttribute("allegroLink", formData.getAllegroLink());

        crudService.sendResults(formData,
                sessionData.getUserData());
//
//        Client c = ClientBuilder.newClient();
//
//        WebTarget target = c.target("http://localhost:18080/report-module/api/searched/part");
//
//        Response response = target.request().post(Entity.entity(formData, MediaType.APPLICATION_JSON_TYPE));

        URI uri = UriBuilder.fromUri("http://localhost:18080/report-module/api/searched/part").build();

        Response post = ClientBuilder.newClient()
                .target(uri)
                .request()
                .post(Entity.json(formData));

        System.out.println("response = " + post.getStatus());

        RequestDispatcher dispatcher = req.getRequestDispatcher("AllegroCategoryForm.jsp");
        dispatcher.forward(req, resp);
    }

}
