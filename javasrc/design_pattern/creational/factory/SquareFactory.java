package factory;

class SquareFactory extends ShapeFactory {
    private int side;

    SquareFactory(int side) {
        this.side = side;
    }

    @Override
    Shape createShape() {
        return new Square(side);
    }
}
