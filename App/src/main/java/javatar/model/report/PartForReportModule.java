package javatar.model.report;

import javatar.model.FormData;
import javatar.web.SessionData;

public class PartForReportModule {

    public String carBrand;
    public String carModel;
    public String carEngine;
    public String partBrand;
    public String partId;
    public String partName;
    public String allegroLink;
    public String userName;
    public String userId;

    public PartForReportModule(FormData formData, SessionData sessionData) {
        this.carBrand = formData.getCarBrand();
        this.carModel = formData.getCarModel();
        this.carEngine = formData.getCarEngine();
        this.partBrand = formData.getPartBrand();
        this.partId = formData.getPartId();
        this.partName = formData.getPartName();
        this.allegroLink = formData.getAllegroLink();
        this.userName = sessionData.getUserData();
        this.userId = String.valueOf(sessionData.getUserId());
    }

    @Override
    public String toString() {
        return "PartForReportModule{" +
                "carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carEngine='" + carEngine + '\'' +
                ", partBrand='" + partBrand + '\'' +
                ", partId='" + partId + '\'' +
                ", partName='" + partName + '\'' +
                ", allegroLink='" + allegroLink + '\'' +
                ", userName='" + userName + '\'' +
                ", userId=" + userId +
                '}';
    }

}
