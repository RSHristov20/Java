package car;

public class Car {
    private String brand;
    private String model;
    public int horsePower;

    public Car() {
    }

    public Car(String brand) {
        this(brand, "no model");
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString() {
        return "Car{brand='" + this.brand + "', model='" + this.model + "'}";
    }
}