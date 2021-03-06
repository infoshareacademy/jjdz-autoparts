package javatar.service;

import javatar.model.FavouritePart;
import javatar.model.FormData;
import javatar.web.SessionData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class FavoutirePartService {
	private static final Logger LOGGER = LogManager.getLogger();

	@PersistenceContext
	EntityManager em;

	@Inject
	SessionData sessionData;

	@Inject
	FormData formData;

	public void addToFavourites()
	{
		FavouritePart partFromDb;

		try {
			partFromDb = find(formData.getPartId());
		} catch (NoResultException e) {
			partFromDb = null;
		}

		FavouritePart favouritePart = new FavouritePart();

		favouritePart.setPartBrand(formData.getPartBrand());
		favouritePart.setPartId(formData.getPartId());
		favouritePart.setPartName(formData.getPartName());
		favouritePart.setPartLink(formData.getAllegroLink());
		favouritePart.setUserId(sessionData.getUserId());

		if (partFromDb == null || !partFromDb.equals(favouritePart)) {

			LOGGER.info("Adding favourite part to DB: {}", favouritePart.toString());

			em.merge(favouritePart);
		} else {
			System.out.println("czesc juz jest w ulubionych");
		}
	}

	public void removeFromFavourites(String partId)
	{
		FavouritePart favouritePart = find(partId);

		em.remove(favouritePart);
	}

	public FavouritePart find(String partId) throws NoResultException{
		Query q = em.createQuery("select f from FavouritePart f where f.partId = :partId and f.userId = :userId", FavouritePart.class);
		q.setParameter("partId", partId);
		q.setParameter("userId", sessionData.getUserId());

		return (FavouritePart) q.getSingleResult();
	}

	public List<FavouritePart> getUserFavourites()
	{
		List<FavouritePart> userFavourites = null;

		Query q = em.createQuery("select f from FavouritePart f where f.userId = :userId");
		q.setParameter("userId", sessionData.getUserId());

		userFavourites = q.getResultList();

		return userFavourites;
	}
}
