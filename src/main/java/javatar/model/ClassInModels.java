package javatar.model;

public class ClassInModels {
    private String id;
    private String name;
    private String name_clear;
    private boolean has_image;
    private String link;

    @Override
    public String toString() {
        return "ClassInModels{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", name_clear='" + name_clear + '\'' +
                ", has_image=" + has_image +
                ", link='" + link + '\'' +
                '}';
    }
}
