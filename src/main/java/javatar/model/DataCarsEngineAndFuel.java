package javatar.model;

import java.util.Collection;

public class DataCarsEngineAndFuel {

    String datatype;
    Collection<CarsEngineAndFuel> data;

    public String getDatatype() {
        return datatype;
    }

    public Collection<CarsEngineAndFuel> getData() {
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
