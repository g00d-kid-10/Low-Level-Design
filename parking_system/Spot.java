package parking_system;

class Spot {
    private String spotId;
    private Vehicle vehicle;

    public Spot(String spotId) {
        this.spotId = spotId;
    }

    public boolean isFree() {
        return vehicle == null;
    }

    public void setOccupied(Vehicle veh) {
        vehicle = veh;
    }

    public void setFree() {
        this.vehicle = null;
    }

    @Override
    public String toString() {
    return "[" + spotId + " -> " + (vehicle != null ? vehicle : "FREE") + "]";
    }
}
