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

    //    private void setCarBrand(String carBrand) {
//        this.carBrand = carBrand;
//    }
//
//    private void setCarModel(String carModel) {
//        this.carModel = carModel;
//    }
//
//    private void setCarEngine(String carEngine) {
//        this.carEngine = carEngine;
//    }
//
//    private void setPartBrand(String partBrand) {
//        this.partBrand = partBrand;
//    }
//
//    private void setPartId(String partId) {
//        this.partId = partId;
//    }
//
//    private void setPartName(String partName) {
//        this.partName = partName;
//    }
//
//    private void setAllegroLink(String allegroLink) {
//        this.allegroLink = allegroLink;
//    }
//
//    private void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    private void setUserId(Long userId) {
//        this.userId = String.valueOf(userId);
//    }
//


//    public PartForReportModule mapFormDataToReportModuleFormat(FormData formData, SessionData sessionData) {
//        PartForReportModule part = new PartForReportModule();
//        part.setCarBrand(formData.getCarBrand());
//        part.setCarModel(formData.getCarModel());
//        part.setCarEngine(formData.getCarEngine());
//        part.setPartBrand(formData.getPartBrand());
//        part.setPartId(formData.getPartId());
//        part.setPartName(formData.getPartName());
//        part.setAllegroLink(formData.getAllegroLink());
//        part.setUserName(sessionData.getUserData());
//        part.setUserId(sessionData.getUserId());
//
//        return part;
//


//    }
}
