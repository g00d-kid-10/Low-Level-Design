package abstract_factory;

class SquareFactory implements AbstractFactory {
    private int side;
    private String color;

    SquareFactory(int side, String color) {this.side = side; this.color = color;}

    @Override
    public Shape createShape() {
        return new Square(side);
    }
    
    @Override
    public Color createColor() {
        return new Color(color);
    }
}
