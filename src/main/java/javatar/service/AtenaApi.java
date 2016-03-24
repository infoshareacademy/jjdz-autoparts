package javatar.service;


/**
 * Created by Daniel on 21.03.2016.
 */
public class AtenaApi {


    private Dane Dane;

    public Dane getDane ()
    {
        return Dane;
    }

    public void setDane (Dane Dane)
    {
        this.Dane = Dane;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Dane = "+Dane+"]";
    }
}
