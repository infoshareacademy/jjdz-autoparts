package javatar.model;

import java.util.ArrayList;
import java.util.List;

public class Autopart {
    private List<AutopartCategory> categoryList;
    private String name;
    private String brand;
    private String id;

    public Autopart() {
        this.categoryList = new ArrayList<AutopartCategory>();
    }

    public Autopart(List<AutopartCategory> categoryList, String name, String brand, String id) {
        this.categoryList = categoryList;
        this.name = name;
        this.brand = brand;
        this.id = id;
    }

    public Autopart(List<AutopartCategory> categoryList, String name, String id) {
        this.categoryList = categoryList;
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Autopart autopart = (Autopart) o;

        if (!getCategoryList().equals(autopart.getCategoryList())) return false;
        if (!getName().equals(autopart.getName())) return false;
        if (!getBrand().equals(autopart.getBrand())) return false;
        return getId().equals(autopart.getId());

    }

    @Override
    public int hashCode() {
        int result = getCategoryList().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getBrand().hashCode();
        result = 31 * result + getId().hashCode();
        return result;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public void createCategoryListByNames (List<String> categoryNames) {
        for (String categoryName:
             categoryNames) {
            this.addCategoryToList(new AutopartCategory(categoryName));
        }
    }

    @Override
    public String toString() {
        return "Autopart{" +
                "categoryList=" + categoryList +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
