package java_may_03;

import java.util.Objects;

public class Cars {
    private int vin;
    private String color;
    private double speed;


    public Cars() {
    }

    public Cars(int vin, String color, double speed) {
        this.vin = vin;
        this.color = color;
        this.speed = speed;
    }

    public int getVin() {
        return vin;
    }

    public String getColor() {
        return color;
    }

    public double getSpeed() {
        return speed;
    }


    @Override
    public String toString() {
        return
                " vin=" + vin +
                ", color='" + color + '\'' +
                ", speed=" + speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return vin == cars.vin &&
                Double.compare(cars.speed, speed) == 0 &&
                Objects.equals(color, cars.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin, color, speed);
    }
}
