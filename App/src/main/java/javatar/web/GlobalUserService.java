package javatar.web;


import javatar.model.AccountType;
import javatar.model.GlobalUser;
import javatar.model.LinkedInUser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class GlobalUserService {

    private static final Logger LOGGER = LogManager.getLogger();

    @PersistenceContext
    EntityManager em;

    public GlobalUser getGLobalUser (LinkedInUser linkedInUser){

        if(isExists(linkedInUser.getEmailAddress(), AccountType.LINKEDIN)){
            return getGlobalUserByAccountAndEmail(linkedInUser.getEmailAddress(), AccountType.LINKEDIN);

        }
        else {
            GlobalUser user =new GlobalUser(linkedInUser);
            addGlobalUser(user);
            return user;
        }

    }

    private boolean isExists (String email, AccountType type ) {
        LOGGER.debug("Checking if user exists");
        GlobalUser user = getGlobalUserByAccountAndEmail(email, type);
        return user != null;

    }

    private GlobalUser getGlobalUserByAccountAndEmail(String email, AccountType account) {
        List<GlobalUser> globalUsers= em.createQuery("select u from GlobalUser u where u.eMail = :email and u.accountType = :accountType", GlobalUser.class )
                .setParameter("email", email)
                .setParameter("accountType", account)
                .getResultList();

        if(globalUsers.isEmpty()){
            LOGGER.debug("User does not exists");
            return null;
        }
        else {
            LOGGER.debug("User exists");
            return globalUsers.get(0);
        }

    }

    private void addGlobalUser(GlobalUser user) {
        LOGGER.debug("Adding user to database");
        em.persist(user);

    }


}
