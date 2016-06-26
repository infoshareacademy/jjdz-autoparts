package javatar.model.report;

import javatar.model.FormData;

public class PartForReportModule {

    String carBrand;
    String carModel;
    String carEngine;
    String partBrand;
    String partId;
    String partName;
    String allegroLink;

    public PartForReportModule(FormData formData) {
        this.carBrand = formData.getCarBrand();
        this.carModel = formData.getCarModel();
        this.carEngine = formData.getCarEngine();
        this.partBrand = formData.getPartBrand();
        this.partId = formData.getPartId();
        this.partName = formData.getPartName();
        this.allegroLink = formData.getAllegroLink();
    }

}
