package factory;

class Main {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory(5);
        ShapeFactory squareFactory = new SquareFactory(10);

        Shape circle = circleFactory.createShape(); // Drawn a cirlce
        System.out.println("Dimension: " + circle.getDimension() + " Area: " + circle.getArea());
        
        Shape square = squareFactory.createShape(); // Drawn a square
        System.out.println("Dimension: " + square.getDimension() + " Area: " + square.getArea());
    }
}
