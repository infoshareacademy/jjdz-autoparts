package javatar.model;

import javax.enterprise.context.SessionScoped;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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

    @ElementCollection
    private List<String> partCategories;

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

    public List<String> getPartCategories() {
        return partCategories;
    }

    public void setPartCategories(List<String> partCategories) {
        this.partCategories = partCategories;
    }

    public void addPartCategory(String categoryName)
    {
        if(this.partCategories == null)
        {
            this.partCategories = new ArrayList<>();
        }
        this.partCategories.add(categoryName);
    }
}
