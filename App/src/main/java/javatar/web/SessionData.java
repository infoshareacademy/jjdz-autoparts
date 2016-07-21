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

    private String errorMessage;

    private String warningMessage;

    public String getWarningMessage() {
        return warningMessage;
    }

    public void setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

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

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void logout() {
        this.user = null;
        this.isAdmin=0;

    }

    public boolean isLoggedIn() {
        return (user != null);
    }

    public boolean isAdmin() {
        return (isAdmin  == 1);
    }


}