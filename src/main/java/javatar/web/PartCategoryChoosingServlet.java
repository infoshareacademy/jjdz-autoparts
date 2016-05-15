package javatar.web;

import javatar.model.FormData;
import javatar.model.JsonDataAutopart;
import javatar.model.JsonDataAutopartCategories;
import javatar.service.JsonParserAll;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/PartCategory")
public class PartCategoryChoosingServlet extends HttpServlet {

    @Inject
    FormData formData;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        JsonParserAll parser = new JsonParserAll();
        req.setCharacterEncoding("UTF-8");
        String categories;
        String categoryOut = req.getParameter("category");


        String[] splitArray = categoryOut.split(";");
        String categoryName = splitArray[0];
        String categoryLink = splitArray[1];
        String hasChildren= splitArray[2];

        formData.addPartCategory(categoryName);
        categories = formData.getPartCategories().get(0);

        if(formData.getPartCategories().size() > 1)
        {
            for (int i=1; i<formData.getPartCategories().size(); i++)
            {
                categories += " -> " + formData.getPartCategories().get(i);
            }
        }

        req.setAttribute("engineName", formData.getCarEngine());
	    req.setAttribute("modelName", formData.getCarModel());
	    req.setAttribute("brandName", formData.getCarBrand());
	    req.setAttribute("categoryName", categories);
        req.setAttribute("hasChildren", Boolean.parseBoolean(hasChildren));

        String url = "http://infoshareacademycom.2find.ru" + categoryLink + "?lang=polish";
        RequestDispatcher dispatcher;

        if (Boolean.parseBoolean(hasChildren)) {
            JsonDataAutopartCategories autopartCategories = parser.parseCategoryFile(url);
            req.setAttribute("categories", autopartCategories.getData());

        } else {
            JsonDataAutopart autopart = parser.parsePartFile(url);
            req.setAttribute("parts", autopart.getData());
        }

        dispatcher = req.getRequestDispatcher("PartCategoryChoosingForm.jsp");
        dispatcher.forward(req, resp);
    }
}
