package reports.searched.part.model;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@SessionScoped
public class SessionScopedListOfReports implements Serializable {

//    List<List<DTOwithSum>> listList;
//
//    public List<List<DTOwithSum>> getListList() {
//        return listList;
//    }
//
//    public void setListList(List<List<DTOwithSum>> listList) {
//        this.listList = listList;
//    }

    List<DTOwithSum> list;

    public List<DTOwithSum> getList() {
        return list;
    }

    public void setList(List<DTOwithSum> list) {
        this.list = list;
    }
}
