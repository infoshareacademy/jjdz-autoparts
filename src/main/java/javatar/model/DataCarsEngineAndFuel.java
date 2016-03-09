package javatar.model;

import java.util.Collection;

public class DataCarsEngineAndFuel {

    private String datatype;
    private Collection<CarsEngineAndFuel> data;

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
