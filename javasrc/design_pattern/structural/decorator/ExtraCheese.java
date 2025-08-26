package decorator;

class ExtraCheese extends PizzaDecorator {
    ExtraCheese(Pizza pizza) {super(pizza);}

    @Override
    public String getName() {
        return decoratedPizza.getName() + ", with extra cheese.";
    }

    @Override
    public int getCost() {
        return decoratedPizza.getCost() + 30;
    }
}