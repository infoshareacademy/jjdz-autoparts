package javatar.model.report;

import javatar.model.FormData;
import javatar.web.SessionData;

public class PartForReportModule {

    String carBrand;
    String carModel;
    String carEngine;
    String partBrand;
    String partId;
    String partName;
    String allegroLink;
    String userName;
    Long userId;

    public PartForReportModule(FormData formData, SessionData sessionData) {
        this.carBrand = formData.getCarBrand();
        this.carModel = formData.getCarModel();
        this.carEngine = formData.getCarEngine();
        this.partBrand = formData.getPartBrand();
        this.partId = formData.getPartId();
        this.partName = formData.getPartName();
        this.allegroLink = formData.getAllegroLink();
        this.userName = sessionData.getUserData();
        this.userId = sessionData.getUserId();
    }

}
