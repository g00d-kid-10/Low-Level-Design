package parking_system;

class Vehicle {
    private String licsense;

    public Vehicle(String licsense) {
        this.licsense = licsense;
    }

    @Override
    public String toString() {
        return licsense;
    }
}