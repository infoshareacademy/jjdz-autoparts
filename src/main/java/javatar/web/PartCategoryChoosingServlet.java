package javatar.web;

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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        JsonParserAll parser = new JsonParserAll();

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
        req.setAttribute("hasChildren", hasChildren);

        String url = "http://infoshareacademycom.2find.ru" + categoryLink + "?lang=polish";

        //TODO Michał jesli chcesz z tego skorzystać to poniżej uzupełnij klasę o właściwy typ danych i do JsonParserAll dodaj swoją metodę
        JsonDataAutopartCategories autopartCategories = parser.parseCategoryFile(url);
        req.setAttribute("categories", autopartCategories.getData());

        RequestDispatcher dispatcher = req.getRequestDispatcher("PartCategoryChoosingForm.jsp");
        dispatcher.forward(req, resp);
    }
}
