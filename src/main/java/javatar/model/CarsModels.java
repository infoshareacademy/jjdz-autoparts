package javatar.model;

public class CarsModels {
    private String id = new String();
    private String name = new String();
    private Integer end_year = new Integer(0);
    private Integer end_month = new Integer(0);
    private Integer start_year = new Integer(0);
    private Integer start_month = new Integer(0);
    private String vehicle_group = new String();
    private String link = new String();

    public CarsModels() {

    }

    public CarsModels(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public CarsModels(CarFromAztec jsonCar) {
        this.name = jsonCar.getCarFromAztecData().getCarModel();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEnd_year() {
        return end_year;
    }

    public void setEnd_year(Integer end_year) {
        this.end_year = end_year;
    }

    public Integer getEnd_month() {
        return end_month;
    }

    public void setEnd_month(Integer end_month) {
        this.end_month = end_month;
    }

    public Integer getStart_year() {
        return start_year;
    }

    public void setStart_year(Integer start_year) {
        this.start_year = start_year;
    }

    public Integer getStart_month() {
        return start_month;
    }

    public void setStart_month(Integer start_month) {
        this.start_month = start_month;
    }

    public String getVehicle_group() {
        return vehicle_group;
    }

    public void setVehicle_group(String vehicle_group) {
        this.vehicle_group = vehicle_group;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "CarsModels{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", end_year=" + end_year +
                ", end_month=" + end_month +
                ", start_year=" + start_year +
                ", start_month=" + start_month +
                ", vehicle_group='" + vehicle_group + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
