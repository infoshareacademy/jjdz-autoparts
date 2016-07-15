package reports.searched.part.model;

import java.time.LocalDateTime;

public class DataSavedToDBBuilder {
    private PartForReportDTO partDTO;
    private String userName;
    private String userId;
    private LocalDateTime dateTime;

    public DataSavedToDBBuilder setPartDTO(PartForReportDTO partDTO) {
        this.partDTO = partDTO;
        return this;
    }

    public DataSavedToDBBuilder setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public DataSavedToDBBuilder setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public DataSavedToDBBuilder setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public DataSavedToDB build() {
        return new DataSavedToDB(partDTO, userName, userId, dateTime);
    }
}