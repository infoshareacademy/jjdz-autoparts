package javatar.model;

import java.util.ArrayList;
import java.util.List;

public class Autopart {
    private List<AutopartCategory> categoryList;
    private String partName;
    private String partBrand;
    private String partId;

    public Autopart() {
        this.categoryList = new ArrayList<AutopartCategory>();
    }

    public Autopart(List<AutopartCategory> categoryList, String partName, String partId) {
        this.categoryList = categoryList;
        this.partName = partName;
        this.partId = partId;
    }

    public String getPartBrand() {
        return partBrand;
    }

    public void setPartBrand(String partBrand) {
        this.partBrand = partBrand;
    }

    public void addCategoryToList (AutopartCategory category){
        this.categoryList.add(category);
    }

    public List<AutopartCategory> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<AutopartCategory> categoryList) {
        this.categoryList = categoryList;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    @Override
    public String toString() {
        return "Autopart{" +
                "categoryList=" + categoryList +
                ", partName='" + partName + '\'' +
                ", partBrand='" + partBrand + '\'' +
                ", partId='" + partId + '\'' +
                '}';
    }
}
