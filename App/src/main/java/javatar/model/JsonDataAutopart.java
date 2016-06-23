package javatar.model;

import java.util.Collection;

public class JsonDataAutopart {
    private String datatype;
    private Collection<JsonAutopart> data;

    public String getDatatype() {
        return datatype;
    }

    public Collection<JsonAutopart> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "JsonDataAutopart{" +
                "datatype='" + datatype + '\'' +
                ", data=" + data +
                '}';
    }
}
