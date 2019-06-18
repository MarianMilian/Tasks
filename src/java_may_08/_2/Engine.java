package java_may_08._2;

public class Engine {
    private String model;
    private double volume;
    private int horsePower;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public Engine(String model, double volume, int horsePower) {
        this.model = model;
        this.volume = volume;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", volume=" + volume +
                ", horsePower=" + horsePower +
                '}';
    }
}
