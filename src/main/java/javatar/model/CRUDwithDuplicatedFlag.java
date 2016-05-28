package javatar.model;

public class CRUDwithDuplicatedFlag {
    Integer flag;
    CRUD crud;

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public CRUD getCrud() {
        return crud;
    }

    public void setCrud(CRUD crud) {
        this.crud = crud;
    }

    @Override
    public String toString() {
        return "CRUDwithDuplicatedFlag{" +
                "flag=" + flag +
                ", crud=" + crud +
                '}';
    }
}
