package javatar.web;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class SessionData implements Serializable {

    private String user;

    private long userId;

    private int isAdmin = 0;

    public long getUserId() {
        return userId;
    }

    public String getUserData() {
        return user;
    }

    public void logIn(String user, long userId, int isAdmin) {
        this.user = user;
        this.userId = userId;
        this.isAdmin = isAdmin;

    }

    public void logout() {
        this.user = null;
    }

    public boolean isLoggedIn() {
        return (user != null);
    }

    public boolean isAdmin() {
        return (isAdmin  == 1);
    }


}