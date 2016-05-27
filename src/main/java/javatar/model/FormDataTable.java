package javatar.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
//@Table()
public class FormDataTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    private FormData formData;

    private String userName;
    private LocalDateTime localDateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FormData getFormData() {
        return formData;
    }

    public void setFormData(FormData formData) {
        this.formData = formData;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public FormDataTable(FormData formData, String userName, LocalDateTime localDateTime) {
        this.formData = formData;
        this.userName = userName;
        this.localDateTime = localDateTime;
    }

    public FormDataTable(FormData formData, String userName) {
        this.formData = formData;
        this.userName = userName;
    }

    public FormDataTable() {
    }

    @Override
    public String toString() {
        return "FormDataTable{" +
                "id=" + id +
                ", formData=" + formData +
                ", userName='" + userName + '\'' +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
