package javatar.web;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class SessionData implements Serializable {

    private String user;

    private long userId;

    public long getUserId() {
        return userId;
    }

    public String getUserData() {
        return user;
    }

    public void logIn(String user, long userId) {
        this.user = user;
        this.userId = userId;
    }

    public void logout() {
        this.user = null;
    }

    public boolean isLoggedIn() {
        return (user != null);
    }

}