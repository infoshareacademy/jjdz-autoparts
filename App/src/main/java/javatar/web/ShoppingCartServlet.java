package javatar.web;

import javatar.model.FormData;
import javatar.model.report.PartForReportModule;
import javatar.model.report.ReportWeights;
import javatar.service.CRUDService;
import javatar.service.report.PostChosenPart;
import org.slf4j.LoggerFactory;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet(urlPatterns = "/AddingToCart")
public class ShoppingCartServlet extends HttpServlet {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(ShoppingCartServlet.class);

    @Inject
    FormData formData;

    @Inject
    SessionData sessionData;

    @EJB
    CRUDService crudService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        LOGGER.info("Saving part data ... ");
        sessionData.setErrorMessage(null);
        sessionData.setWarningMessage(null);

        req.setCharacterEncoding("UTF-8");

        req.setAttribute("partName", formData.getPartName());
        req.setAttribute("partBrand", formData.getPartBrand());
        req.setAttribute("partId", formData.getPartId());
        req.setAttribute("allegroLink", formData.getAllegroLink());

        crudService.sendResults(formData,
                sessionData.getUserData());

        PartForReportModule reportPart = new PartForReportModule(formData,sessionData, LocalDateTime.now(), new ReportWeights().getCART_WEIGHT());

        PostChosenPart post = new PostChosenPart();
        post.postSearchedValues(reportPart);

        LOGGER.info("Data succesfully saved!");
        req.setAttribute("errorMessage", sessionData.getErrorMessage());
        req.setAttribute("warningMessage", sessionData.getWarningMessage());

        RequestDispatcher dispatcher = req.getRequestDispatcher("AllegroCategoryForm.jsp");
        dispatcher.forward(req, resp);
    }

}
