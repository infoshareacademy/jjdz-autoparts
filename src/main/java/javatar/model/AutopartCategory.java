package javatar.model;

public class AutopartCategory {
    private String name;
    private String id;
    private boolean has_children;
    private String link;

    public AutopartCategory() {
    }

    public AutopartCategory(String name, String id, boolean has_children, String link) {
        this.name = name;
        this.id = id;
        this.has_children = has_children;
        this.link = link;
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

    public boolean isHas_children() {
        return has_children;
    }

    public void setHas_children(boolean has_children) {
        this.has_children = has_children;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "AutopartCategory{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", has_children=" + has_children +
                ", link='" + link + '\'' +
                '}';
    }
}
