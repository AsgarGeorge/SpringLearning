package tutorial.autowire.byType;

public class Specification {

    private String brand;
    private String model;

    public Specification() {
    }

    public Specification(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public void setModel(String model) {
        this.model = model;
    }
}
