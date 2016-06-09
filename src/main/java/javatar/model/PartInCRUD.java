package javatar.model;

import javax.persistence.Embeddable;

@Embeddable
public class PartInCRUD {
    protected String partBrand;
    protected String partId;
    protected String partName;

    public String getPartBrand() {
        return partBrand;
    }

    public void setPartBrand(String partBrand) {
        this.partBrand = partBrand;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PartInCRUD that = (PartInCRUD) o;

        if (getPartBrand() != null ? !getPartBrand().equals(that.getPartBrand()) : that.getPartBrand() != null)
            return false;
        if (getPartId() != null ? !getPartId().equals(that.getPartId()) : that.getPartId() != null) return false;
        return getPartName() != null ? getPartName().equals(that.getPartName()) : that.getPartName() == null;

    }

    @Override
    public int hashCode() {
        int result = getPartBrand() != null ? getPartBrand().hashCode() : 0;
        result = 31 * result + (getPartId() != null ? getPartId().hashCode() : 0);
        result = 31 * result + (getPartName() != null ? getPartName().hashCode() : 0);
        return result;
    }
}
