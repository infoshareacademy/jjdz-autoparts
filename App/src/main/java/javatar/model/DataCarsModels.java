package javatar.model;

import java.util.Collection;

public class DataCarsModels {

    String datatype;
    Collection<CarsModels> data;

    public String getDatatype() {
        return datatype;
    }

    public Collection<CarsModels> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "DataCarsModels{" +
                "datatype='" + datatype + '\'' +
                ", data=" + data +
                '}';
    }
}
