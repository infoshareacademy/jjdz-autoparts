package reports.searched.part.model;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class DataSavedToDB {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    PartForReportDTO partDTO;

    private String userName;
    private String userId;
    private float weight;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime dateTime;

    public DataSavedToDB() {
    }

    public DataSavedToDB(PartForReportDTO partDTO, String userName, String userId, LocalDateTime dateTime, float weight) {
        this.partDTO = partDTO;
        this.userName = userName;
        this.userId = userId;
        this.dateTime = dateTime;
        this.weight = weight;
    }

    public Long getId() {
        return id;
    }

    public PartForReportDTO getPartDTO() {
        return partDTO;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserId() {
        return userId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "DataSavedToDB{" +
                "id=" + id +
                ", partDTO=" + partDTO +
                ", userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", weight=" + weight +
                ", dateTime=" + dateTime +
                '}';
    }
}
