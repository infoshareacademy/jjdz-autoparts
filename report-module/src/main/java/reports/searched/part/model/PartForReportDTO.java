package reports.searched.part.model;

public class PartForReportDTO {

    private String carBrand;
    private String carModel;
    private String carEngine;
    private String partBrand;
    private String partId;
    private String partName;
    private int count;

    public PartForReportDTO(String carBrand, String carModel, String carEngine, String partBrand, String partId, String partName, int count) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carEngine = carEngine;
        this.partBrand = partBrand;
        this.partId = partId;
        this.partName = partName;
        this.count = count;
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

    public int getCount() {
        return count;
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
                ", count=" + count +
                '}';
    }
}
