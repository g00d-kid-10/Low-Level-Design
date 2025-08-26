package abstract_factory;

class Circle implements Shape {
    private int radius;

    Circle(int radius) {this.radius = radius;}
    
    public int getArea() {
        return (int)Math.PI * radius * radius;
    }

    public int getDimension() {
        return radius;
    }
}