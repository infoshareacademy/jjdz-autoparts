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

@WebServlet(urlPatterns = "/PartFirstCategory")
public class PartFirstCategoryChoosingServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        JsonParserAll parser = new JsonParserAll();
        req.setCharacterEncoding("UTF-8");
        String engineOut = req.getParameter("engine");
        String brandName = req.getParameter("brandName");
        String modelName = req.getParameter("modelName");


        String[] splitArray = engineOut.split(";");
        String engineName = splitArray[1];
        String engineLink = splitArray[2];

        req.setAttribute("engineName", engineName);
	    req.setAttribute("modelName", modelName);
	    req.setAttribute("brandName", brandName);
	    req.setAttribute("isFirstCat", true);

        String url = "http://infoshareacademycom.2find.ru" + engineLink + "?lang=polish";

        //TODO Michał jesli chcesz z tego skorzystać to poniżej uzupełnij klasę o właściwy typ danych i do JsonParserAll dodaj swoją metodę
        JsonDataAutopartCategories autopartCategories = parser.parseCategoryFile(url);
        req.setAttribute("categories", autopartCategories.getData());

        RequestDispatcher dispatcher = req.getRequestDispatcher("PartFirstCategoryChoosingForm.jsp");
        dispatcher.forward(req, resp);
    }
}
