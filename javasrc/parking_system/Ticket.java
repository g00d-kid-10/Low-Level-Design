package parking_system;

import java.time.LocalDateTime;

class Ticket {
    private final Vehicle vehicle;
    private final String ticketId;
    public final LocalDateTime entryTime;
    public final int hourlyRate;
    public Spot spot;

    public Ticket(Vehicle v, String ticketId, LocalDateTime time, Spot spot, int rate) {
        this.vehicle = v; this.ticketId = ticketId; this.entryTime = time; this.spot = spot; this.hourlyRate = rate;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "vehicle=" + vehicle +
                ", ticketId='" + ticketId + '\'' +
                ", entryTime=" + entryTime +
                ", spot=" + spot +
                ", hourlyRate=" + hourlyRate +
                '}';
    }
}