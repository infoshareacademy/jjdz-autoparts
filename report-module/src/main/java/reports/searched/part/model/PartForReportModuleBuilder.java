package reports.searched.part.model;

import java.time.LocalDateTime;

public class PartForReportModuleBuilder {
    private String carBrand;
    private String carModel;
    private String carEngine;
    private String partBrand;
    private String partId;
    private String partName;
    private String userName;
    private String userId;
    private float weight;
    private LocalDateTime dateTime;
    private String token;

    public PartForReportModuleBuilder setCarBrand(String carBrand) {
        this.carBrand = carBrand;
        return this;
    }

    public PartForReportModuleBuilder setCarModel(String carModel) {
        this.carModel = carModel;
        return this;
    }

    public PartForReportModuleBuilder setCarEngine(String carEngine) {
        this.carEngine = carEngine;
        return this;
    }

    public PartForReportModuleBuilder setPartBrand(String partBrand) {
        this.partBrand = partBrand;
        return this;
    }

    public PartForReportModuleBuilder setPartId(String partId) {
        this.partId = partId;
        return this;
    }

    public PartForReportModuleBuilder setPartName(String partName) {
        this.partName = partName;
        return this;
    }

    public PartForReportModuleBuilder setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public PartForReportModuleBuilder setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public PartForReportModuleBuilder setWeight(float weight) {
        this.weight = weight;
        return this;
    }

    public PartForReportModuleBuilder setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public PartForReportModuleBuilder setToken(String token) {
        this.token = token;
        return this;
    }

    public PartForReportModule build() {
        return new PartForReportModule(carBrand, carModel, carEngine, partBrand, partId, partName, userName, userId, weight, dateTime, token);
    }
}