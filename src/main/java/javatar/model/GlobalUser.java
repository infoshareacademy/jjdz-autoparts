package javatar.model;

import static javatar.model.AccountType.LinkedIn;

public class GlobalUser {

    private AccountType accountType;
    private String firstName;
    private String lastName;
    private String eMail;

    public GlobalUser(LinkedInUser linkedInUser) {
        this.accountType = LinkedIn;
        this.firstName = linkedInUser.getFirstName();
        this.lastName = linkedInUser.getLastName();
        this.eMail = linkedInUser.getEmailAddress();
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return  firstName + " " + lastName;
    }
}
