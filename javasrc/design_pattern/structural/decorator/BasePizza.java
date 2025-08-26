package decorator;

abstract class BasePizza implements Pizza {
    protected String name;
    protected int cost;

    BasePizza(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }
}