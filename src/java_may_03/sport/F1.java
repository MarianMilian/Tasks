package java_may_03.sport;

public class F1  extends  SportCars{
    private String pilotName;

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public F1(int vin, String color, double speed, String sponsor, String pilotName) {
        super(vin, color, speed, sponsor);
        this.pilotName = pilotName;
    }

    @Override
    public String toString() {
        return
                "pilotName='" + pilotName + '\'' +
                 super.toString();
    }
}
