package javatar.model.CRUD;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@SessionScoped
public class SinglePartToRemove implements Serializable{
    CarInCRUD car;
    PartInCRUD part;

    public CarInCRUD getCar() {
        return car;
    }

    public void setCar(CarInCRUD car) {
        this.car = car;
    }

    public PartInCRUD getPart() {
        return part;
    }

    public void setPart(PartInCRUD part) {
        this.part = part;
    }

    public void setSinglePartToRemove (PartInCRUD part, CarInCRUD car){
        this.part = part;
        this.car = car;
    }

    @Override
    public String toString() {
        return "SinglePartToRemove{" +
                "car=" + car +
                ", part=" + part +
                '}';
    }
}
