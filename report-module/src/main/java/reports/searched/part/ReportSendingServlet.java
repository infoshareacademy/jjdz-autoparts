package reports.searched.part;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet(urlPatterns = "/Report")
public class ReportSendingServlet extends HttpServlet {

    private static final Logger LOGGER = LogManager.getLogger();

    @EJB
    MostFrequentlySearchedPartsReport searchedParts;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        searchedParts.getCartPartsForReport(LocalDateTime.of(2016,06,01,00,00),LocalDateTime.of(2016,07,20,00,00));
        searchedParts.getSearchedPartsForReport(LocalDateTime.of(2016,06,01,00,00),LocalDateTime.of(2016,07,20,00,00));
        RequestDispatcher dispatcher = req.getRequestDispatcher("MostFrequentlySearchedPart.jsp");
        dispatcher.forward(req, resp);
    }

}
