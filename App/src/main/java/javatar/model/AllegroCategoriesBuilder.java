package javatar.model;

public class AllegroCategoriesBuilder {
    private Integer catId;
    private String catName;
    private Integer catParent;
    private Integer catPosition;
    private Integer catIsProductCatalogueEnabled;

    public AllegroCategoriesBuilder setCatId(Integer catId) {
        this.catId = catId;
        return this;
    }

    public AllegroCategoriesBuilder setCatName(String catName) {
        this.catName = catName;
        return this;
    }

    public AllegroCategoriesBuilder setCatParent(Integer catParent) {
        this.catParent = catParent;
        return this;
    }

    public AllegroCategoriesBuilder setCatPosition(Integer catPosition) {
        this.catPosition = catPosition;
        return this;
    }

    public AllegroCategoriesBuilder setCatIsProductCatalogueEnabled(Integer catIsProductCatalogueEnabled) {
        this.catIsProductCatalogueEnabled = catIsProductCatalogueEnabled;
        return this;
    }

    public AllegroCategories build() {
        return new AllegroCategories(catId, catName, catParent, catPosition, catIsProductCatalogueEnabled);
    }
}