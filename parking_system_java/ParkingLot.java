package parking_system_java;

import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

class ParkingLot implements Entrance, Egress {
    private final List<Ticket> tickets;
    private final List<Floor> floors;

    public ParkingLot(int floorSize) {
        this.tickets = new ArrayList<>();
        this.floors = new ArrayList<>();
        for(FloorType type : FloorType.values()) {
            Floor floor = new Floor(type.name(), floorSize);
            floors.add(floor);
        }
    }

    public Ticket fileTicket(Vehicle vehicle) {
        Spot vacantSpot = getFirstVacantSpot();
        String ticketId = UUID.randomUUID().toString();
        Ticket tkt = new Ticket(vehicle, ticketId, LocalDateTime.now(), vacantSpot, 35);
        tickets.add(tkt);
        vacantSpot.setOccupied(vehicle);
        return tkt;
    }

    public int processPayment(Ticket tk) {
        LocalDateTime entryTime = tk.entryTime;
        LocalDateTime now = LocalDateTime.now();
        long time = ChronoUnit.SECONDS.between(entryTime, now);
        tk.spot.setFree();
        return (int) time * tk.hourlyRate;
    }

    public Spot getFirstVacantSpot() {
        Spot vacantSpot = null;
        for(Floor floor : floors) {
            for(Spot spot : floor.getSpots()) {
                if(spot.isFree()) {
                    vacantSpot = spot;
                    return vacantSpot;
                }
            }
        }

        if(vacantSpot == null) {
            throw new IllegalStateException("No spot available");
        }

        return vacantSpot;
    }

    public List<Floor> getFloors() {
        return new ArrayList<>(floors);
    }

    public List<Ticket> getTickets() {
        return new ArrayList<>(tickets);
    }
}