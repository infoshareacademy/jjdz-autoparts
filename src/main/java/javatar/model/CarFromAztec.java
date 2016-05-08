package javatar.model;


import com.google.gson.annotations.SerializedName;

/**
 * Created by Daniel on 21.03.2016.
 */
public class CarFromAztec {

    @SerializedName("Dane")
    private CarFromAztecData CarFromAztecData;

    public CarFromAztecData getCarFromAztecData()
    {
        return CarFromAztecData;
    }


}
