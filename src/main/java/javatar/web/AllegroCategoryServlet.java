package javatar.web;

import javatar.model.AllegroCategories;
import javatar.model.Autopart;
import javatar.model.AutopartAllegroListModel;
import javatar.model.AutopartCategory;
import javatar.service.CreateAllegroLink;
import javatar.service.XMLParser;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/AllegroLink")
public class AllegroCategoryServlet extends HttpServlet {

    CreateAllegroLink createAllegroLink = new CreateAllegroLink();
    XMLParser xmlParser = new XMLParser();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        AutopartAllegroListModel autopartAllegroListModel = new AutopartAllegroListModel();
        Autopart autopart = new Autopart();
        List<AutopartCategory> categoryList = new ArrayList<>();
        AutopartCategory categoryInList1 = new AutopartCategory();
        AutopartCategory categoryInList2 = new AutopartCategory();
        ServletContext servletContext = null;
        InputStream allegroCategoriesFile = this.getClass().getResourceAsStream("/Allegro_cathegories_2016-02-13.xml");
        List<AllegroCategories> allegroCategoriesList = xmlParser.allegroCategoryObject(allegroCategoriesFile);
        System.out.println("allegroCategoriesList = " + allegroCategoriesList.size());

        //***********************************************************************************
        //TODO ta część jest tylko do testów - usunąć po ukończeniu wszystkich formularzy
        //***********************************************************************************
        String name = "CHŁODNICA OLEJU";
        String brand = "VOYAGER";
        String id = "";
        String category1 = "Chłodnice";
        String category2 = "Chłodnice oleju";
        categoryInList1.setName(category1);
        categoryList.add(categoryInList1);
        categoryInList2.setName(category2);
        categoryList.add(categoryInList2);

        //***********************************************************************************


        //TODO tą część należy odkomentować i uzupełnić po ukonczeniu wszystkich formularzy
//        String autopartAsString = req.getParameter("autopart");
//
//        String[] splitArray = autopartAsString.split(";");
//        String name = splitArray[0];
//        String brand = splitArray[1];
//        String id = splitArray[2];
//        String category1 = splitArray[3];
//        String category2 = splitArray[4];
//        if (!category1.isEmpty() {
//            categoryInList1.setName(category1);
//            categoryList.add(categoryInList1);
//        }
//        if (!category2.isEmpty()) {
//            categoryInList2.setName(category2);
//            categoryList.add(categoryInList2);
//        }

        autopart.setId(id);
        autopart.setName(name);
        autopart.setBrand(brand);
        autopart.setCategoryList(categoryList);

        autopartAllegroListModel.setAutopart(autopart);
        autopartAllegroListModel.setAllegroCategories(allegroCategoriesList);
        System.out.println(autopartAllegroListModel.getAllegroCategories().size());
        System.out.println(autopartAllegroListModel.getAutopart().toString());
        String allegroLink = createAllegroLink.createAllegroLink(autopartAllegroListModel) + "?string=" + autopart.getName() + " " + autopart.getBrand() + " " + autopart.getId();

        req.setAttribute("allegroLink", allegroLink);
        req.setAttribute("partName", name);
        req.setAttribute("partBrand", brand);
        req.setAttribute("partId", id);

        RequestDispatcher dispatcher = req.getRequestDispatcher("AllegroCategoryForm.jsp");
        dispatcher.forward(req, resp);
    }
}
