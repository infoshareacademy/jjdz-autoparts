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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResultDatabaseModel model = (ResultDatabaseModel) o;

        if (getId() != null ? !getId().equals(model.getId()) : model.getId() != null) return false;
        if (getAutopartName() != null ? !getAutopartName().equals(model.getAutopartName()) : model.getAutopartName() != null)
            return false;
        if (getAutopartBrand() != null ? !getAutopartBrand().equals(model.getAutopartBrand()) : model.getAutopartBrand() != null)
            return false;
        if (getAutopartId() != null ? !getAutopartId().equals(model.getAutopartId()) : model.getAutopartId() != null)
            return false;
        if (getAllegroPath() != null ? !getAllegroPath().equals(model.getAllegroPath()) : model.getAllegroPath() != null)
            return false;
        return getAllegroSeatchText() != null ? getAllegroSeatchText().equals(model.getAllegroSeatchText()) : model.getAllegroSeatchText() == null;

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getAutopartName() != null ? getAutopartName().hashCode() : 0);
        result = 31 * result + (getAutopartBrand() != null ? getAutopartBrand().hashCode() : 0);
        result = 31 * result + (getAutopartId() != null ? getAutopartId().hashCode() : 0);
        result = 31 * result + (getAllegroPath() != null ? getAllegroPath().hashCode() : 0);
        result = 31 * result + (getAllegroSeatchText() != null ? getAllegroSeatchText().hashCode() : 0);
        return result;
    }
}
