package javatar.web;


import javatar.model.AccountType;
import javatar.model.GlobalUser;
import javatar.model.LinkedInUser;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class GlobalUserService {

    @PersistenceContext
    EntityManager em;

    public GlobalUser getGlobalUserByAccountAndEmail(String email, AccountType account) {
        List<GlobalUser> globalUsers= em.createQuery("select u from GlobalUser u where u.eMail = :email and u.accountType = :accountType", GlobalUser.class )
                .setParameter("email", email)
                .setParameter("accountType", account)
                .getResultList();

        if(globalUsers.isEmpty()){
            return null;
        }
        else {
            return globalUsers.get(0);
        }

    }

    public void addGlobalUser(GlobalUser user) {
        em.persist(user);

    }

    public boolean isExists (String email, AccountType type ) {
        GlobalUser user = getGlobalUserByAccountAndEmail(email, type);
        return user != null;

    }

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


}
