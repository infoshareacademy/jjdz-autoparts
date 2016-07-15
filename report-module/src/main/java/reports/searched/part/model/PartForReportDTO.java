package reports.searched.part.model;

import javax.persistence.Embeddable;

@Embeddable
public class PartForReportDTO {

    private String carBrand;
    private String carModel;
    private String carEngine;
    private String partBrand;
    private String partName;
    private String partId;
    private float weight;

    public PartForReportDTO(String carBrand, String carModel, String carEngine, String partBrand, String partId, String partName, float weight) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carEngine = carEngine;
        this.partBrand = partBrand;
        this.partId = partId;
        this.partName = partName;
        this.weight = weight;
    }

    public PartForReportDTO() {
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarEngine() {
        return carEngine;
    }

    public String getPartBrand() {
        return partBrand;
    }

    public String getPartId() {
        return partId;
    }

    public String getPartName() {
        return partName;
    }

    public float getWeight() {
        return weight;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarEngine(String carEngine) {
        this.carEngine = carEngine;
    }

    public void setPartBrand(String partBrand) {
        this.partBrand = partBrand;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "PartForReportDTO{" +
                "carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carEngine='" + carEngine + '\'' +
                ", partBrand='" + partBrand + '\'' +
                ", partId='" + partId + '\'' +
                ", partName='" + partName + '\'' +
                ", count=" + weight +
                '}';
    }
}
