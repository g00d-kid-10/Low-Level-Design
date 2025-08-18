package Strategy;

import Strategy.Stratagies.*;
import Strategy.Vehicles.*;

class Main {
    public static void main(String[] args) {
        Vehicle baleno = new NormalCar(new NormalStyle());
        Vehicle porche = new SuperCar(new CrazyStyle());
        Vehicle ferrari = new  RaceCar(new CrazyStyle());
        Vehicle cycle = new Vehicle(new AverageStyle());
    
        baleno.drive(); // Normal
        porche.drive(); // Crazy
        ferrari.drive(); // Crazy
        ferrari.setDrivingStyle(new NormalStyle()); ferrari.drive(); // Normal 
        cycle.drive(); // Average
    }
}