package javatar.model;

import javax.faces.bean.SessionScoped;
import java.util.List;

@SessionScoped
public class CarInCRUDList {
    public List<CarInCRUD> getCarInCRUDs() {
        return carInCRUDs;
    }

    public void setCarInCRUDs(List<CarInCRUD> carInCRUDs) {
        this.carInCRUDs = carInCRUDs;
    }

    private List<CarInCRUD> carInCRUDs;
}
