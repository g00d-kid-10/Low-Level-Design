package factory;

class CircleFactory extends ShapeFactory {
    private int radius;
    CircleFactory(int radius) {this.radius = radius;}
    
    @Override
    Shape createShape() {
        return new Circle(radius);
    }
}