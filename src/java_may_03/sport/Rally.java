package java_may_03.sport;

public class Rally  extends SportCars{
     private  String typeOfRoud;


    public Rally(int vin, String color, double speed, String sponsor, String typeOfRoad) {
        super(vin, color, speed, sponsor);
        this.typeOfRoud = typeOfRoad;
    }

    @Override
    public String toString() {
        return
                "typeOfRoud='" + typeOfRoud + '\'' +
                 super.toString();
    }
}
