package javatar.web;

import javatar.model.JsonDataAutopart;
import javatar.model.JsonDataAutopartCategories;
import javatar.service.JsonParserAll;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/PartCategory")
public class PartCategoryChoosingServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        JsonParserAll parser = new JsonParserAll();
        req.setCharacterEncoding("UTF-8");
        String categoryName = null;
        String categoryOut = req.getParameter("category");
        String brandName = req.getParameter("brandName");
        String modelName = req.getParameter("modelName");
        String engineName = req.getParameter("engineName");

        if(req.getParameterMap().containsKey("categoryName")) {
            categoryName = req.getParameter("categoryName");
        }


        String[] splitArray = categoryOut.split(";");
        if(categoryName != null) {
            categoryName += " -> " + splitArray[1];
        } else {
            categoryName = splitArray[1];
        }
        String categoryLink = splitArray[2];
        String hasChildren= splitArray[3];

        req.setAttribute("engineName", engineName);
	    req.setAttribute("modelName", modelName);
	    req.setAttribute("brandName", brandName);
	    req.setAttribute("categoryName", categoryName);
	    req.setAttribute("isFirstCat", false);
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
