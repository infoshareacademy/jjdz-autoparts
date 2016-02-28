package javatar.model;

import com.sun.media.sound.ModelSource;
import com.sun.org.apache.xpath.internal.operations.Mod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
