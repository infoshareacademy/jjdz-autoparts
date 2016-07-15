package reports.searched.part;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import reports.searched.part.model.DTOwithSum;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

@WebServlet(urlPatterns = "/Report")
public class ReportSendingServlet extends HttpServlet {

    private final Logger LOGGER = LogManager.getLogger();

//    @Inject
//    Logger LOGGER;

    @EJB
    MostFrequentlySearchedParts searchedParts;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        List<DTOwithSum> dailyReport = searchedParts.getPartsForReport(LocalDateTime.now().minusDays(1l), LocalDateTime.now());
        List<DTOwithSum> weeklyReport = searchedParts.getPartsForReport(LocalDateTime.now().minusDays(7l), LocalDateTime.now());
        List<DTOwithSum> hourReport = searchedParts.getPartsForReport(LocalDateTime.now().minusHours(1l), LocalDateTime.now());

        LOGGER.info("hourReport = {}", hourReport.toString());
        LOGGER.info("weeklyReport = {}", weeklyReport.toString());
        LOGGER.info("dailyReport = {}" + dailyReport.toString());

        req.getSession().setAttribute("daily",dailyReport);
        req.getSession().setAttribute("weekly",weeklyReport);
        req.getSession().setAttribute("hour",hourReport);

        RequestDispatcher dispatcher = req.getRequestDispatcher("MostFrequentlySearchedPart.jsp");
        dispatcher.forward(req, resp);
    }

}
