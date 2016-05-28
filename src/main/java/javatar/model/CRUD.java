package javatar.model;

import javax.persistence.*;

@Entity
public class CRUD {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private String allegroLink;
    @Embedded
    private CarInCRUD car;
    @Embedded
    private PartInCRUD part;

    public PartInCRUD getPart() {
        return part;
    }

    public void setPart(PartInCRUD partinCRUD) {
        this.part = partinCRUD;
    }

    public CarInCRUD getCar() {
        return car;
    }

    public void setCar(CarInCRUD car) {
        this.car = car;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAllegroLink() {
        return allegroLink;
    }

    public void setAllegroLink(String allegroLink) {
        this.allegroLink = allegroLink;
    }

    @Override
    public String toString() {
        return "CRUD{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", allegroLink='" + allegroLink + '\'' +
                ", car=" + car +
                ", part=" + part +
                '}';
    }
}
