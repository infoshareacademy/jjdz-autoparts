package javatar.model;


public class ClassInModelsLvl2 {
    private String id;
    private String name;
    private boolean has_childen;
    private String link;

    @Override
    public String toString() {
        return "ClassInModelsLvl2{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", has_childen=" + has_childen +
                ", link='" + link + '\'' +
                '}';
    }
}
