package javatar.model;

public class Autopart {
    private AutopartCategoryList autopartCategoryList;
    private String partName;
    private String partId;

    public AutopartCategoryList getAutopartCategoryList() {
        return autopartCategoryList;
    }

    public void setAutopartCategoryList(AutopartCategoryList autopartCategoryList) {
        this.autopartCategoryList = autopartCategoryList;
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
