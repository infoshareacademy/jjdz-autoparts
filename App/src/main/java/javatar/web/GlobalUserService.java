package javatar.web;


import javatar.model.AccountType;
import javatar.model.GlobalUser;
import javatar.model.LinkedInUser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class GlobalUserService {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(GlobalUserService.class);

    @PersistenceContext
    EntityManager em;

    public GlobalUser getGLobalUser(LinkedInUser linkedInUser) {

        if (isExists(linkedInUser.getEmailAddress(), AccountType.LINKEDIN)) {
            return getGlobalUserByAccountAndEmail(linkedInUser.getEmailAddress(), AccountType.LINKEDIN);

        } else {
            GlobalUser user = new GlobalUser(linkedInUser);
            addGlobalUser(user);
            return user;
        }
    }

    public List<GlobalUser> getUsers() {
        LOGGER.debug("Selecting all users from database");
        return em.createQuery(
                "select u from GlobalUser u"
                , GlobalUser.class).getResultList();
    }

    public List<GlobalUser> getUsersAdmin() {
        LOGGER.debug("Selecting admin users from database");
        return em.createQuery(
                "select u from GlobalUser u where u.administrator = 1"
                , GlobalUser.class).getResultList();
    }

    public List<GlobalUser> getUsersNotAdmin() {
        LOGGER.debug("Selecting non admin users from database");
        return em.createQuery(
                "select u from GlobalUser u where u.administrator <> 1"
                , GlobalUser.class).getResultList();
    }

    public List<GlobalUser> getUsersReports() {
        LOGGER.debug("Selecting users with rights to reports from database");
        return em.createQuery(
                "select u from GlobalUser u where u.reports = 1"
                , GlobalUser.class).getResultList();
    }

    public List<GlobalUser> getUsersNotReports() {
        LOGGER.debug("Selecting users without rights to reports from database");
        return em.createQuery(
                "select u from GlobalUser u where u.reports <> 1"
                , GlobalUser.class).getResultList();
    }

    public GlobalUser getUserById(long id) {
        LOGGER.debug("Selecting user by id:", id);

        return em.find(GlobalUser.class, id);
    }

    public void updateUser (GlobalUser user){
        LOGGER.debug("Updating user data");

        em.merge(user);
    }

    private boolean isExists(String email, AccountType type) {
        LOGGER.debug("Checking if user exists");
        GlobalUser user = getGlobalUserByAccountAndEmail(email, type);
        return user != null;
    }

    private GlobalUser getGlobalUserByAccountAndEmail(String email, AccountType account) {
        List<GlobalUser> globalUsers = em.createQuery("select u from GlobalUser u where u.eMail = :email and u.accountType = :accountType", GlobalUser.class)
                .setParameter("email", email)
                .setParameter("accountType", account)
                .getResultList();

        return returnGlobalUserOrNull(globalUsers);
    }

    private void addGlobalUser(GlobalUser user) {
        LOGGER.debug("Adding user to database");
        em.persist(user);

    }

    private GlobalUser returnGlobalUserOrNull(List<GlobalUser> globalUsers) {
        if (globalUsers.isEmpty()) {
            LOGGER.debug("User does not exists");
            return null;
        } else {
            LOGGER.debug("User exists");
            return globalUsers.get(0);
        }
    }


}
