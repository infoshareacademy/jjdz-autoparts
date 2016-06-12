package javatar.model.CRUD;


import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@SessionScoped
public class ListCarsParts implements Serializable{

    CarInCRUD carInCRUD;
    List<PartInCRUD> partsInCRUD;

    public CarInCRUD getCarInCRUD() {
        return carInCRUD;
    }

    public void setCarInCRUD(CarInCRUD carInCRUD) {
        this.carInCRUD = carInCRUD;
    }

    public List<PartInCRUD> getPartsInCRUD() {
        return partsInCRUD;
    }

    public void setPartsInCRUD(List<PartInCRUD> partsInCRUD) {
        this.partsInCRUD = partsInCRUD;
    }

    @Override
    public String toString() {
        return "ListCarsParts{" +
                "carInCRUD=" + carInCRUD +
                ", partsInCRUD=" + partsInCRUD.toString() +
                '}';
    }
}
