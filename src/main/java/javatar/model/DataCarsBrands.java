package javatar.model;

import javax.persistence.Entity;
import java.util.Collection;

@Entity
public class DataCarsBrands {

    String datatype;
    Collection<CarsBrands> data;

    public String getDatatype() {
        return datatype;
    }

    public Collection<CarsBrands> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "DataCarsBrands{" +
                "datatype='" + datatype + '\'' +
                ", data=" + data +
                '}';
    }


}
