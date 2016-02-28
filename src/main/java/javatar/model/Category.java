package javatar.model;

public class Category {
    private String categoryName;
    private String categoryId;
    private boolean hasChildren;

    public Category(String categoryName, String categoryId, boolean hasChildren) {
        this.categoryName = categoryName;
        this.categoryId = categoryId;
        this.hasChildren = hasChildren;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }
}
