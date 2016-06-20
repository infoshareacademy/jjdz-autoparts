package javatar.model;

import javax.persistence.*;

import java.awt.*;

import static javatar.model.AccountType.LINKEDIN;

@Entity
//@Table(name = "users")
public class GlobalUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Long id;
    //    @Column(name = "Usr_Name")
    private String firstName;
    //    @Column(name = "Usr_LastName")
    private String lastName;
    //    @Column(name = "Usr_eMail")
    private String eMail;
    //    @Column(name = "Usr_accountType")
    private AccountType accountType;

    private int administrator;

    private int reports;

    public GlobalUser(LinkedInUser linkedInUser) {
        this.accountType = LINKEDIN;
        this.firstName = linkedInUser.getFirstName();
        this.lastName = linkedInUser.getLastName();
        this.eMail = linkedInUser.getEmailAddress();
        this.administrator = AdminEmail.getIsAdmin(linkedInUser.getEmailAddress().trim());
        this.reports = 0;
    }

    public GlobalUser() {
    }

    public int getAdministrator() {
        return administrator;
    }

    public void setAdministrator(int administrator) {
        this.administrator = administrator;
    }

    public int getReports() {
        return reports;
    }

    public void setReports(int reports) {
        this.reports = reports;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GlobalUser that = (GlobalUser) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (eMail != null ? !eMail.equals(that.eMail) : that.eMail != null) return false;
        return accountType == that.accountType;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (eMail != null ? eMail.hashCode() : 0);
        result = 31 * result + (accountType != null ? accountType.hashCode() : 0);
        return result;
    }
}
