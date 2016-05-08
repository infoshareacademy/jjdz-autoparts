package javatar.model;

public class CarsBrands {


    private String id;

    private String name;
    private String name_clear;
    private boolean has_image;
    private String link;

    public CarsBrands(String id, String name, String name_clear, boolean has_image, String link) {
        this.id = id;
        this.name = name;
        this.name_clear = name_clear;
        this.has_image = has_image;
        this.link = link;
    }

    public CarsBrands() {

    }

    public CarsBrands(CarFromAztec jsonCar) {
        this.name = jsonCar.getCarFromAztecData().getCarBrand();
    }


    public CarsBrands(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getName_clear() {
        return name_clear;
    }

    public boolean isHas_image() {
        return has_image;
    }

    public String getLink() {
        return link;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName_clear(String name_clear) {
        this.name_clear = name_clear;
    }

    public void setHas_image(boolean has_image) {
        this.has_image = has_image;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "CarsBrands{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", name_clear='" + name_clear + '\'' +
                ", has_image=" + has_image +
                ", link='" + link + '\'' +

                '}';
    }


}
