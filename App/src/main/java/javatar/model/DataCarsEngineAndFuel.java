package javatar.model;

import java.util.List;

public class DataCarsEngineAndFuel {

    private String datatype;
    private List<CarsEngineAndFuel> data;

    public String getDatatype() {
        return datatype;
    }

    public List<CarsEngineAndFuel> getData() {
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
