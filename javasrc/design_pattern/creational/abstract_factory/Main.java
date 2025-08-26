package abstract_factory;

class Main {
    public static void main(String[] args) {
        AbstractFactory circleFactory = new CircleFactory(5, "Red");
        AbstractFactory squareFactory = new SquareFactory(10, "Blue");

        Shape circle = circleFactory.createShape(); // Drawn a cirlce
        System.out.println("Dimension: " + circle.getDimension() + " Area: " + circle.getArea());
        
        Shape square = squareFactory.createShape(); // Drawn a square
        System.out.println("Dimension: " + square.getDimension() + " Area: " + square.getArea());
    }
}
