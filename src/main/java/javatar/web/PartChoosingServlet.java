package javatar.web;

import javatar.service.JsonParserAll;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Parts")
public class PartChoosingServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        JsonParserAll parser = new JsonParserAll();
        req.setCharacterEncoding("UTF-8");
        String categoryName = req.getParameter("categoryName");
        String partOut = req.getParameter("part");
        String brandName = req.getParameter("brandName");
        String modelName = req.getParameter("modelName");
        String engineName = req.getParameter("engineName");

        String[] splitArray = partOut.split(";");
        String brand = splitArray[0];
        String number_clear = splitArray[1];
        String name = splitArray[2];
        String link = splitArray[3];

        req.setAttribute("engineName", engineName);
	    req.setAttribute("modelName", modelName);
	    req.setAttribute("brandName", brandName);
	    req.setAttribute("categoryName", categoryName);
	    req.setAttribute("partBrand", brand);
	    req.setAttribute("partNumber", number_clear);
	    req.setAttribute("partName", name);

        String url = "http://infoshareacademycom.2find.ru" + link + "?lang=polish";

        //System.out.println(link);

        //JsonDataAutopart autopart = parser.parsePartFile(url);
        //req.setAttribute("parts", autopart.getData());

        RequestDispatcher dispatcher = req.getRequestDispatcher("PartChoosingForm.jsp");
        dispatcher.forward(req, resp);
    }
}
