package javatar.model;

import java.util.Collection;

// TODO: 10.03.16 czy nie lepiej uniwersalna klasa zamiast klasa do kazdej podstrony jsona?
public class JsonData {
    private String datatype;
    // TODO: 10.03.16 czy da radę uniwersalna kolekcję? potem określany będzie typ danych?
//    private Collection<Object> data;
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
