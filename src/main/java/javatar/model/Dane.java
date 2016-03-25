package javatar.model;

public class Dane {
    private String D5;

    private String Rok_produkcji;

    private String D1;

    private String Error;

    private String ErrorText;

    public String getErrorText() {
        return ErrorText;
    }

    public void setErrorText(String ErrorText) {
        this.ErrorText = ErrorText;
    }

    public String getD5() {
        return D5;
    }

    public String getError() {
        return Error;
    }

    public void setError(String Error) {
        this.Error = Error;
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
        return "[D5 = " + D5 + ", Rok_produkcji = " + Rok_produkcji + ", D1 = " + D1 + "]";
    }
}

