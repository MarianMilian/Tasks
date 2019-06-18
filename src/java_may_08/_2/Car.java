package java_may_08._2;

public class Car implements Comparable<Car>{
    private String model;
    private int year;
    private int number;
    private String color ;
    private Wheel wheel;
    private Engine engine;

    public Car(String model, int year, int number, String color, String brand,int radius, String modelE,double volume, int  horsePower) {
        this.model = model;
        this.year = year;
        this.number = number;
        this.color = color;

        this.wheel = new Wheel(brand,radius);
        this.engine = new Engine(modelE,  volume,horsePower);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", number=" + number +
                ", color='" + color + '\'' +
                ", wheel=" + wheel +
                ", engine=" + engine +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }



    @Override
    public int compareTo(Car o) {
        return this.year-o.year;
    }
}
