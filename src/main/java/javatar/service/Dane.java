package javatar.service;

/**
 * Created by Daniel on 21.03.2016.
 */
public class Dane
{
    private String D5;

    private String Rok_produkcji;

    private String D1;


    public String getD5() {
        return D5;
    }

    public void setD5(String D5) {
        this.D5 = D5;
    }


    public String getRok_produkcji() {
        return Rok_produkcji;
    }

    public void setRok_produkcji(String Rok_produkcji) {
        this.Rok_produkcji = Rok_produkcji;
    }


    public String getD1() {
        return D1;
    }

    public void setD1(String D1) {
        this.D1 = D1;
    }

    @Override
    public String toString() {
        return "ClassPojo [D5 = " + D5 + ", Rok_produkcji = " + Rok_produkcji + ", D1 = " + D1 + "]";
    }
}

