package javatar.model;

import com.google.gson.annotations.SerializedName;

public class CarFromAztecData {

    @SerializedName("D5")
    private String carModel;

    @SerializedName("Rok_produkcji")
    private String productionYear;

    @SerializedName("D1")
    private String carBrand;

    private String Error;

    private String ErrorText;

    @SerializedName("P.1")
    private String engineCapacity;

    @SerializedName("P.3")
    private String fuelType;

    @SerializedName("P.2")
    private String enginePower;

    public String getCarModel() {
        return carModel;
    }

    public String getError() {
        return Error;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setError(String error) {
        Error = error;
    }

    public void setErrorText(String errorText) {
        ErrorText = errorText;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }
}

