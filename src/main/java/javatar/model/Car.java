package javatar.model;

public class Car {
    //// TODO: 10.03.16 mcymerys - zamiast stringow klasy carbrands i carmodel
    private CarsBrands carsBrand;
    private CarsModels carsModel;
    //    private String brandName;
//    private String brandId;
//    private String modelName;
//    private String modelId;
    private String typeName;
    private String typeId;
    private int productionYear;
    private String fuelType;
    private String engineCapacity;
    private String enginePower;
    private String engineID;

    public String getEngineID() {
        return engineID;
    }

    public void setEngineID(String engineID) {
        this.engineID = engineID;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carsBrand=" + carsBrand +
                ", carsModel=" + carsModel +
                ", typeName='" + typeName + '\'' +
                ", typeId='" + typeId + '\'' +
                ", productionYear=" + productionYear +
                ", fuelType='" + fuelType + '\'' +
                ", engineCapacity='" + engineCapacity + '\'' +
                ", enginePower='" + enginePower + '\'' +
                ", engineID='" + engineID + '\'' +
                '}';
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "carsBrand=" + carsBrand.getName() +
//                ", carsModel=" + carsModel.getName() +
//                ", typeName='" + typeName + '\'' +
//                ", typeId='" + typeId + '\'' +
//                ", productionYear=" + productionYear +
//                '}';
//    }

    //    @Override
//    public String toString() {
//        return "Car{" +
//                "brandName='" + brandName + '\'' +
//                ", brandId='" + brandId + '\'' +
//                ", modelName='" + modelName + '\'' +
//                ", modelId='" + modelId + '\'' +
//                ", typeName='" + typeName + '\'' +
//                ", typeId='" + typeId + '\'' +
//                ", productionYear=" + productionYear +
//                '}';
//    }

//    public Car(String brandName, String brandId, String modelName, String modelId, String typeName, String typeId, int productionYear) {
//        this.brandName = brandName;
//        this.brandId = brandId;
//        this.modelName = modelName;
//        this.modelId = modelId;
//        this.typeName = typeName;
//        this.typeId = typeId;
//        this.productionYear = productionYear;
//    }

    public Car(CarsBrands carsBrand, CarsModels carsModel, String typeName, String typeId, int productionYear) {
        this.carsBrand = carsBrand;
        this.carsModel = carsModel;
        this.typeName = typeName;
        this.typeId = typeId;
        this.productionYear = productionYear;
    }

    public Car() {
    }
//
//    public String getBrandName() {
//        return brandName;
//    }
//
//    public void setBrandName(String brandName) {
//        this.brandName = brandName;
//    }
//
//    public String getBrandId() {
//        return brandId;
//    }
//
//    public void setBrandId(String brandId) {
//        this.brandId = brandId;
//    }
//
//    public String getModelName() {
//        return modelName;
//    }
//
//    public void setModelName(String modelName) {
//        this.modelName = modelName;
//    }
//
//    public String getModelId() {
//        return modelId;
//    }
//
//    public void setModelId(String modelId) {
//        this.modelId = modelId;
//    }

    public CarsBrands getCarsBrand() {
        return carsBrand;
    }

    public void setCarsBrand(CarsBrands carsBrand) {
        this.carsBrand = carsBrand;
    }

    public CarsModels getCarsModel() {
        return carsModel;
    }

    public void setCarsModel(CarsModels carsModel) {
        this.carsModel = carsModel;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }
}
