package javatar.model;

import java.util.List;

public class AutopartCategoryList {
    private List<Category> categoryList;
    private String partName;

    public AutopartCategoryList(List<Category> categoryList, String partName) {
        this.categoryList = categoryList;
        this.partName = partName;
    }

    public void addCategoryToList(Category category){
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
}
