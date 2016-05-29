package javatar.model;

import javax.persistence.Embeddable;

@Embeddable
public class PartInCRUD {
    private String partBrand;
    private String partId;
    private String partName;



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
    public String toString() {
        return "PartInCRUD{" +
                "partBrand='" + partBrand + '\'' +
                ", partId='" + partId + '\'' +
                ", partName='" + partName + '\'' +
                '}';
    }
}
