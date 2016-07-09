package javatar.model;

public class AllegroCategories {

    Integer catId;
    String catName;
    Integer catParent;
    Integer catPosition;
    Integer catIsProductCatalogueEnabled;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AllegroCategories that = (AllegroCategories) o;

        if (catId != null ? !catId.equals(that.catId) : that.catId != null) return false;
        if (catName != null ? !catName.equals(that.catName) : that.catName != null) return false;
        if (catParent != null ? !catParent.equals(that.catParent) : that.catParent != null) return false;
        if (catPosition != null ? !catPosition.equals(that.catPosition) : that.catPosition != null) return false;
        return catIsProductCatalogueEnabled != null ? catIsProductCatalogueEnabled.equals(that.catIsProductCatalogueEnabled) : that.catIsProductCatalogueEnabled == null;

    }

    @Override
    public int hashCode() {
        int result = catId != null ? catId.hashCode() : 0;
        result = 31 * result + (catName != null ? catName.hashCode() : 0);
        result = 31 * result + (catParent != null ? catParent.hashCode() : 0);
        result = 31 * result + (catPosition != null ? catPosition.hashCode() : 0);
        result = 31 * result + (catIsProductCatalogueEnabled != null ? catIsProductCatalogueEnabled.hashCode() : 0);
        return result;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Integer getCatParent() {
        return catParent;
    }

    public void setCatParent(Integer catParent) {
        this.catParent = catParent;
    }

    public Integer getCatPosition() {
        return catPosition;
    }

    public void setCatPosition(Integer catPosition) {
        this.catPosition = catPosition;
    }

    public Integer getCatIsProductCatalogueEnabled() {
        return catIsProductCatalogueEnabled;
    }

    public void setCatIsProductCatalogueEnabled(Integer catIsProductCatalogueEnabled) {
        this.catIsProductCatalogueEnabled = catIsProductCatalogueEnabled;
    }

    public AllegroCategories(Integer catId, String catName, Integer catParent, Integer catPosition, Integer catIsProductCatalogueEnabled) {
        this.catId = catId;
        this.catName = catName;
        this.catParent = catParent;
        this.catPosition = catPosition;
        this.catIsProductCatalogueEnabled = catIsProductCatalogueEnabled;
    }

    @Override
    public String toString() {
        return "AllegroCategories{" +
                "catId=" + catId +
                ", catName='" + catName + '\'' +
                ", catParent=" + catParent +
                ", catPosition=" + catPosition +
                ", catIsProductCatalogueEnabled=" + catIsProductCatalogueEnabled +
                '}';
    }
}
