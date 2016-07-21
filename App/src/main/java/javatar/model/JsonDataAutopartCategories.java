package javatar.model;

import java.util.Collection;

public class JsonDataAutopartCategories {
    private String datatype;
    private Collection<AutopartCategory> data;

    public String getDatatype() {
        return datatype;
    }

    public Collection<AutopartCategory> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "JsonDataAutopartCategories{" +
                "datatype='" + datatype + '\'' +
                ", data=" + data +
                '}';
    }
}
