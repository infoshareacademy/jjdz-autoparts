package reports.searched.part.model;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import java.time.LocalDateTime;
public class PartForReportModule {

    private String carBrand;
    private String carModel;
    private String carEngine;
    private String partBrand;
    private String partId;
    private String partName;
    private String userName;
    private String userId;

    private float weight;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime dateTime;

    private String token;

    public PartForReportModule() {
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

    public String getUserName() {
        return userName;
    }

    public String getUserId() {
        return userId;
    }

    public float getWeight() {
        return weight;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getToken() {
        return token;
    }

    public PartForReportModule(String carBrand, String carModel, String carEngine, String partBrand, String partId, String partName, String userName, String userId, float weight, LocalDateTime dateTime, String token) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carEngine = carEngine;
        this.partBrand = partBrand;
        this.partId = partId;
        this.partName = partName;
        this.userName = userName;
        this.userId = userId;
        this.weight = weight;
        this.dateTime = dateTime;
        this.token = token;
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
                ", userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", weight=" + weight +
                ", dateTime=" + dateTime +
                ", token='" + token + '\'' +
                '}';
    }
}
