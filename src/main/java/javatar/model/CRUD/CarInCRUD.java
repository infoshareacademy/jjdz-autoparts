package javatar.model.CRUD;

import javax.persistence.Embeddable;

@Embeddable
public class CarInCRUD {
    private String carBrand;
    private String carModel;
    private String carEngine;
    private String engineLink;

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

    public String getEngineLink() {
        return engineLink;
    }

    public void setEngineLink(String engineLink) {
        this.engineLink = engineLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarInCRUD carInCRUD = (CarInCRUD) o;

        if (getCarBrand() != null ? !getCarBrand().equals(carInCRUD.getCarBrand()) : carInCRUD.getCarBrand() != null)
            return false;
        if (getCarModel() != null ? !getCarModel().equals(carInCRUD.getCarModel()) : carInCRUD.getCarModel() != null)
            return false;
        return getCarEngine() != null ? getCarEngine().equals(carInCRUD.getCarEngine()) : carInCRUD.getCarEngine() == null;

    }

    @Override
    public int hashCode() {
        int result = getCarBrand() != null ? getCarBrand().hashCode() : 0;
        result = 31 * result + (getCarModel() != null ? getCarModel().hashCode() : 0);
        result = 31 * result + (getCarEngine() != null ? getCarEngine().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CarInCRUD{" +
                "carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carEngine='" + carEngine + '\'' +
                ", engineLink='" + engineLink + '\'' +
                '}';
    }

}
