package javatar.model;

import java.util.Collection;

public class DataForm {

    String datatype;
    Collection<ClassInModels> data;

    public String getDatatype() {
        return datatype;
    }

    public Collection<ClassInModels> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "DataForm{" +
                "datatype='" + datatype + '\'' +
                ", data=" + data +
                '}';
    }
}
