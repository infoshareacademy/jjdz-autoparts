package javatar.model;

import java.util.ArrayList;
import java.util.List;

public class Autopart {
    private List<Category> categoryList;
    private String partName;
    private String partId;

    public Autopart() {
        this.categoryList = new ArrayList<Category>();
    }

    public Autopart(List<Category> categoryList, String partName, String partId) {
        this.categoryList = categoryList;
        this.partName = partName;
        this.partId = partId;
    }

    public void addCategoryToList (Category category){
        this.categoryList.add(category);
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
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
}
