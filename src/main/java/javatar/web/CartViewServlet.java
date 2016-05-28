package javatar.web;

        import javatar.model.CRUD;
        import javatar.model.FormData;
        import javatar.service.CRUDService;
        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;

        import javax.inject.Inject;
        import javax.servlet.RequestDispatcher;
        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;
        import java.util.ArrayList;
        import java.util.List;

@WebServlet(urlPatterns = "/Cart")
public class CartViewServlet extends HttpServlet {
    private static final Logger LOGGER = LogManager.getLogger();

    @Inject
    FormData formData;

    @Inject
    CRUDService crudService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        List<CRUD> crudValuesFromDB = crudService.getCRUDValuesFromDB();

        req.setAttribute("crudViewList",crudValuesFromDB);

        RequestDispatcher dispatcher = req.getRequestDispatcher("Cart.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher dispatcher = req.getRequestDispatcher("Output.jsp");
        dispatcher.forward(req, resp);
    }
}
