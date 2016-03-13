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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AutopartCategory that = (AutopartCategory) o;

        if (isHas_children() != that.isHas_children()) return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        return getLink() != null ? getLink().equals(that.getLink()) : that.getLink() == null;

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getId() != null ? getId().hashCode() : 0);
        result = 31 * result + (isHas_children() ? 1 : 0);
        result = 31 * result + (getLink() != null ? getLink().hashCode() : 0);
        return result;
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
}
