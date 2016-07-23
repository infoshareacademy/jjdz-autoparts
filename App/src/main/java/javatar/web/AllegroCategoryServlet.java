package javatar.web;

import javatar.model.*;
import javatar.model.report.PartForReportModule;
import javatar.model.report.ReportWeights;
import javatar.service.CreateAllegroLink;
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
import java.util.List;

@WebServlet(urlPatterns = "/AllegroLink")
public class AllegroCategoryServlet extends HttpServlet {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(AllegroCategoryServlet.class);
    CreateAllegroLink createAllegroLink = new CreateAllegroLink();

    @Inject
    FormData formData;

    @Inject
    FormPartCategories categories;

    @Inject
    SessionData sessionData;

    @EJB
    AllegroCategoriesCache allegroCategoriesCache;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        AutopartAllegroListModel autopartAllegroListModel = new AutopartAllegroListModel();
        Autopart autopart = new Autopart();
        List<AllegroCategories> allegroCategoriesList = allegroCategoriesCache.getAllegroCategoriesList();

        String autopartAsString = req.getParameter("part");

        String[] splitArray = autopartAsString.split(";");
        String brand = splitArray[0];
        String id = splitArray[1];
        String name = splitArray[2];

        autopart.setId(id);
        autopart.setName(name);
        autopart.setBrand(brand);
        autopart.createCategoryListByNames(categories.getPartCategories());

        autopartAllegroListModel.setAutopart(autopart);
        autopartAllegroListModel.setAllegroCategories(allegroCategoriesList);
        String allegroLink = createAllegroLink.createAllegroLink(autopartAllegroListModel) + "?string=" + autopart.getName() + " " + autopart.getBrand() + " " + autopart.getId();

        formData.setAllegroLink(allegroLink);
        formData.setPartBrand(brand);
        formData.setPartId(id);
        formData.setPartName(name);

        PartForReportModule reportPart = new PartForReportModule(formData,sessionData, LocalDateTime.now(), new ReportWeights().getSEARCH_WEIGHT() );

        System.out.println("reportPart.toString() = " + reportPart.toString());

        PostChosenPart post = new PostChosenPart();
        post.postSearchedValues(reportPart);


        LOGGER.info("Created allegro link: {}", allegroLink);

        req.setAttribute("allegroLink", allegroLink);
        req.setAttribute("partName", name);
        req.setAttribute("partBrand", brand);
        req.setAttribute("partId", id);

        RequestDispatcher dispatcher = req.getRequestDispatcher("AllegroCategoryForm.jsp");
        dispatcher.forward(req, resp);
    }


}
