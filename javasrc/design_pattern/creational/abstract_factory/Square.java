package abstract_factory;

class Square implements Shape {
    private int side;

    Square(int side) {this.side = side;}

    public int getArea() {
        return side * side;
    }

    public int getDimension() {
        return side;
    }
}
