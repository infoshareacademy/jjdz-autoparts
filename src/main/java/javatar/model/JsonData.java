package javatar.model;

import java.util.Collection;

public class JsonData {
    private String datatype;
    private Collection<Autopart> data;

    public String getDatatype() {
        return datatype;
    }

    public Collection<Autopart> getAutopartData() {
        return data;
    }

    @Override
    public String toString() {
        return "JsonData{" +
                "datatype='" + datatype + '\'' +
                ", data=" + data +
                '}';
    }
}
