package javatar.model;

public class JsonAutopart {
    String brand;
    String brand_clear;
    String number;
    String number_clear;
    String name;
    String status;
    String link;

    public JsonAutopart() {
    }

    public JsonAutopart(String brand, String brand_clear, String number, String number_clear, String name, String status, String link) {
        this.brand = brand;
        this.brand_clear = brand_clear;
        this.number = number;
        this.number_clear = number_clear;
        this.name = name;
        this.status = status;
        this.link = link;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand_clear() {
        return brand_clear;
    }

    public void setBrand_clear(String brand_clear) {
        this.brand_clear = brand_clear;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber_clear() {
        return number_clear;
    }

    public void setNumber_clear(String number_clear) {
        this.number_clear = number_clear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
