package java_may_03.sport;

import java_may_03.Cars;

public class SportCars extends Cars {
     private  String sponsor;



    public SportCars(int vin, String color, double speed, String sponsor) {
        super(vin, color, speed);
        this.sponsor = sponsor;
    }

    @Override
    public String toString() {
        return
                " sponsor='" + sponsor + '\''
                        + super.toString();
    }
}
