package javatar.model;

import javax.persistence.*;

import static javatar.model.AccountType.LINKEDIN;

@Entity
//@Table(name = "users")
public class GlobalUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( unique = true, nullable = false)
    private Long id;
//    @Column(name = "Usr_Name")
    private String firstName;
//    @Column(name = "Usr_LastName")
    private String lastName;
//    @Column(name = "Usr_eMail")
    private String eMail;
//    @Column(name = "Usr_accountType")
    private AccountType accountType;

    public GlobalUser(LinkedInUser linkedInUser) {
        this.accountType = LINKEDIN;
        this.firstName = linkedInUser.getFirstName();
        this.lastName = linkedInUser.getLastName();
        this.eMail = linkedInUser.getEmailAddress();
    }

    public GlobalUser() {
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
}
