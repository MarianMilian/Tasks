package java_may_08._2;

public class Wheel {
    private String brand;
    private int radius;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Wheel(String brand, int radius) {
        this.brand = brand;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "brand='" + brand + '\'' +
                ", radius=" + radius +
                '}';
    }
}
