package javatar.model;


import java.util.List;

public class AutopartAllegroListModel {
    Autopart autopart;
    List<AllegroCategories> allegroCategories;

    public Autopart getAutopart() {
        return autopart;
    }

    public void setAutopart(Autopart autopart) {
        this.autopart = autopart;
    }

    public List<AllegroCategories> getAllegroCategories() {
        return allegroCategories;
    }

    public void setAllegroCategories(List<AllegroCategories> allegroCategories) {
        this.allegroCategories = allegroCategories;
    }
}
