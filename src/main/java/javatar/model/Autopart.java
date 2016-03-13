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

    public Autopart(List<AutopartCategory> categoryList, String partName, String partBrand, String partId) {
        this.categoryList = categoryList;
        this.partName = partName;
        this.partBrand = partBrand;
        this.partId = partId;
    }

    public Autopart(List<AutopartCategory> categoryList, String partName, String partId) {
        this.categoryList = categoryList;
        this.partName = partName;
        this.partId = partId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Autopart autopart = (Autopart) o;

        if (!getCategoryList().equals(autopart.getCategoryList())) return false;
        if (!getPartName().equals(autopart.getPartName())) return false;
        if (!getPartBrand().equals(autopart.getPartBrand())) return false;
        return getPartId().equals(autopart.getPartId());

    }

    @Override
    public int hashCode() {
        int result = getCategoryList().hashCode();
        result = 31 * result + getPartName().hashCode();
        result = 31 * result + getPartBrand().hashCode();
        result = 31 * result + getPartId().hashCode();
        return result;
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
