package javatar.model;

import javax.enterprise.context.SessionScoped;
import javax.persistence.Embeddable;
import java.io.Serializable;

@SessionScoped
@Embeddable
public class FormData implements Serializable {

    private String carBrand;
    private String carModel;
    private String carEngine;
    private String partBrand;
    private String partId;
    private String partName;
    private String allegroLink;
    private String engineLookupString;

    public FormData() {
    }

    public FormData(String carBrand, String carModel, String carEngine, String partBrand, String partId, String partName, String allegroLink, String engineLookupString) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carEngine = carEngine;
        this.partBrand = partBrand;
        this.partId = partId;
        this.partName = partName;
        this.allegroLink = allegroLink;
        this.engineLookupString = engineLookupString;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(String carEngine) {
        this.carEngine = carEngine;
    }

    public String getPartBrand() {
        return partBrand;
    }

    public void setPartBrand(String partBrand) {
        this.partBrand = partBrand;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getAllegroLink() {
        return allegroLink;
    }

    public void setAllegroLink(String allegroLink) {
        this.allegroLink = allegroLink;
    }

    public String getEngineLookupString() {
        return engineLookupString;
    }

    public void setEngineLookupString(String engineLookupString) {
        this.engineLookupString = engineLookupString;
    }

    @Override
    public String toString() {
        return "FormData{" +
                "carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carEngine='" + carEngine + '\'' +
                ", partBrand='" + partBrand + '\'' +
                ", partId='" + partId + '\'' +
                ", partName='" + partName + '\'' +
                ", allegroLink='" + allegroLink + '\'' +
                ", engineLookupString='" + engineLookupString + '\'' +
                '}';
    }

}
