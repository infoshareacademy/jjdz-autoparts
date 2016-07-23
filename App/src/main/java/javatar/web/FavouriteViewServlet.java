package javatar.web;

import javatar.model.FavouritePart;
import javatar.service.FavoutirePartService;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/Favs")
public class FavouriteViewServlet extends HttpServlet {

	@Inject
	SessionData sessionData;

	@Inject
	FavoutirePartService fps;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		HttpSession session = req.getSession();

		List<FavouritePart> favouriteParts = fps.getUserFavourites();
		session.setAttribute("favouriteParts", favouriteParts);

		RequestDispatcher dispatcher = req.getRequestDispatcher("Favourites.jsp");
		dispatcher.forward(req, resp);
	}
}
