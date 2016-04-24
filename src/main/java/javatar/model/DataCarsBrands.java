package javatar.model;

import java.util.Collection;


public class DataCarsBrands {

    private Long id;

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
