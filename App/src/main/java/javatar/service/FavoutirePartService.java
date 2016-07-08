package javatar.service;

import javatar.model.Autopart;
import javatar.web.SessionData;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class FavoutirePartService {

	@PersistenceContext
	EntityManager em;

	@Inject
	SessionData sessionData;

	public void addToFavourites(/*część*/)
	{

	}

	public void removeFromFavourites(/*częśćID*/)
	{

	}

	public List<Autopart> getUserFavourites(String userId)
	{
		List<Autopart> userFavourites = null;
		return userFavourites;
	}
}
