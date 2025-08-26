package decorator;

class ExtraChilly extends PizzaDecorator {
    ExtraChilly(Pizza pizza) {super(pizza);}

    @Override
    public String getName() {
        return decoratedPizza.getName() + ", with extra chilly.";
    }

    @Override
    public int getCost() {
        return decoratedPizza.getCost() + 5;
    }
}