package abstract_factory;

class CircleFactory implements AbstractFactory {
    private int radius;
    private String color;

    CircleFactory(int radius, String color) {this.radius = radius; this.color = color;}
    
    @Override
    public Shape createShape() {
        return new Circle(radius);
    }

    @Override
    public Color createColor() {
        return new Color(color);
    }
}