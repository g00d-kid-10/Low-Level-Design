package parking_system_java;

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