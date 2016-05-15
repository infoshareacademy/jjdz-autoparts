package javatar.web;


import javatar.model.AccountType;
import javatar.model.GlobalUser;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class GlobalUserService {

    @PersistenceContext
    EntityManager em;

    public GlobalUser getGlobalUserByAccountAndEmail (String email, AccountType account){
    return null;
    }

}
