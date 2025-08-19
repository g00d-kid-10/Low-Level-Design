package parking_system_java;

import parking_system_java.ParkingLot;
import parking_system_java.Vehicle;
import parking_system_java.Ticket;

class Main {
    public static void main(String[] args) {
        ParkingLot parking = new ParkingLot(10);
        System.out.println("Before parking: " +  parking.getFloors());

        Vehicle car1 = new Vehicle("MH123Helllo");
        Ticket tkt = parking.fileTicket(car1);

        System.out.println("After parking" + parking.getFloors());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException exp) {}

        int amount = parking.processPayment(tkt);
        System.out.println("Parking charges: " + amount);

        System.out.println("After payment processing: " +  parking.getFloors());
    }
}