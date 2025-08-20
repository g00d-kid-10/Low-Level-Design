package strategy.vehicles;

import strategy.stratagies.DrivingStyle;
import strategy.stratagies.AverageStyle;

public class Vehicle {
    private DrivingStyle style;
    public Vehicle() {this.style = new AverageStyle();}
    public Vehicle(DrivingStyle style) {this.style = style;}

    public void setDrivingStyle(DrivingStyle style) {
        this.style = style;
    }

    public void drive() {style.drive();}
}