package reports.searched.part.model;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class PartForReportModule {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String carBrand;
    private String carModel;
    private String carEngine;
    private String partBrand;
    private String partId;
    private String partName;
    private String allegroLink;
    private String userName;
    private String userId;

    @Embedded
    private PartSearchSource source;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime dateTime;

    private String token;

    public String getToken() {
        return token;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getAllegroLink() {
        return allegroLink;
    }

    public void setAllegroLink(String allegroLink) {
        this.allegroLink = allegroLink;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public PartSearchSource getSource() {
        return source;
    }

    public void setSource(PartSearchSource source) {
        this.source = source;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "PartForReportModule{" +
                "id=" + id +
                ", carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carEngine='" + carEngine + '\'' +
                ", partBrand='" + partBrand + '\'' +
                ", partId='" + partId + '\'' +
                ", partName='" + partName + '\'' +
                ", allegroLink='" + allegroLink + '\'' +
                ", userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", dateTime=" + dateTime +
                ", token='" + token + '\'' +
                ", source=" + source +
                '}';
    }

}
