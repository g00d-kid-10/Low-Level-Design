package decorator;

abstract class PizzaDecorator implements Pizza {
    protected Pizza decoratedPizza;
    PizzaDecorator(Pizza pizza) {this.decoratedPizza = pizza;}

    @Override
    public String getName() {
        return decoratedPizza.getName();
    }

    @Override
    public int getCost() {
        return decoratedPizza.getCost();
    }
}
