package decorator;

class Margehrita implements Pizza {
    private final String name = "Margehrita";
    private final int cost = 500;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }
}