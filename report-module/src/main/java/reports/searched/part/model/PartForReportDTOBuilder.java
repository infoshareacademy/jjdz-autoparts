package reports.searched.part.model;

public class PartForReportDTOBuilder {
    private String carBrand;
    private String carModel;
    private String carEngine;
    private String partBrand;
    private String partId;
    private String partName;
    private float weight;

    public PartForReportDTOBuilder setCarBrand(String carBrand) {
        this.carBrand = carBrand;
        return this;
    }

    public PartForReportDTOBuilder setCarModel(String carModel) {
        this.carModel = carModel;
        return this;
    }

    public PartForReportDTOBuilder setCarEngine(String carEngine) {
        this.carEngine = carEngine;
        return this;
    }

    public PartForReportDTOBuilder setPartBrand(String partBrand) {
        this.partBrand = partBrand;
        return this;
    }

    public PartForReportDTOBuilder setPartId(String partId) {
        this.partId = partId;
        return this;
    }

    public PartForReportDTOBuilder setPartName(String partName) {
        this.partName = partName;
        return this;
    }

    public PartForReportDTOBuilder setWeight(float weight) {
        this.weight = weight;
        return this;
    }

    public PartForReportDTO build() {
        return new PartForReportDTO(carBrand, carModel, carEngine, partBrand, partId, partName, weight);
    }
}