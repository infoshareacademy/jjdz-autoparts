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

    public PartForReportDTO(String carBrand, String carModel, String carEngine, String partBrand, String partId, String partName) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carEngine = carEngine;
        this.partBrand = partBrand;
        this.partId = partId;
        this.partName = partName;
    }

    public PartForReportDTO() {
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(String carEngine) {
        this.carEngine = carEngine;
    }

    public String getPartBrand() {
        return partBrand;
    }

    public void setPartBrand(String partBrand) {
        this.partBrand = partBrand;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    @Override
    public String toString() {
        return "PartForReportDTO{" +
                "carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carEngine='" + carEngine + '\'' +
                ", partBrand='" + partBrand + '\'' +
                ", partName='" + partName + '\'' +
                ", partId='" + partId + '\'' +
                '}';
    }
}
