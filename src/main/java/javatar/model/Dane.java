package javatar.model;

import com.google.gson.annotations.SerializedName;

public class Dane {
    private String D5;

    private String Rok_produkcji;

    private String D1;

    private String Error;

    private String ErrorText;

    @SerializedName("P.1")
    private String silnik;

    @SerializedName("P.3")

    private String typ_paliwa;

    @SerializedName("P.2")
    private String moc_silnika;

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

    public String getTyp_paliwa() {
        return typ_paliwa;
    }

    public void setTyp_paliwa(String typ_paliwa) {
        this.typ_paliwa = typ_paliwa;
    }

    public String getSilnik() {
        return silnik;
    }

    public void setSilnik(String silnik) {
        this.silnik = silnik;
    }

    public String getMoc_silnika() {
        return moc_silnika;
    }

    public void setMoc_silnika(String moc_silnika) {
        this.moc_silnika = moc_silnika;
    }

    @Override
    public String toString() {
        return "[D5 = " + D5 + ", Rok_produkcji = " + Rok_produkcji + ", D1 = " + D1 + "silnik: " + silnik + " typ paliwa: " + typ_paliwa + "]";
    }
}

