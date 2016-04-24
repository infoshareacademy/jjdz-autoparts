package javatar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ResultDatabaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String autopartName;
    private String autopartBrand;
    private String autopartId;
    private String allegroPath;
    private String allegroSeatchText;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAutopartName() {
        return autopartName;
    }

    public void setAutopartName(String autopartName) {
        this.autopartName = autopartName;
    }

    public String getAutopartBrand() {
        return autopartBrand;
    }

    public void setAutopartBrand(String autopartBrand) {
        this.autopartBrand = autopartBrand;
    }

    public String getAutopartId() {
        return autopartId;
    }

    public void setAutopartId(String autopartId) {
        this.autopartId = autopartId;
    }

    public String getAllegroPath() {
        return allegroPath;
    }

    public void setAllegroPath(String allegroPath) {
        this.allegroPath = allegroPath;
    }

    public String getAllegroSeatchText() {
        return allegroSeatchText;
    }

    public void setAllegroSeatchText(String allegroSeatchText) {
        this.allegroSeatchText = allegroSeatchText;
    }

    @Override
    public String toString() {
        return "ResultDatabaseModel{" +
                "id=" + id +
                ", autopartName='" + autopartName + '\'' +
                ", autopartBrand='" + autopartBrand + '\'' +
                ", autopartId='" + autopartId + '\'' +
                ", allegroPath='" + allegroPath + '\'' +
                ", allegroSeatchText='" + allegroSeatchText + '\'' +
                '}';
    }
}
