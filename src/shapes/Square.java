package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    void setLength(double length) {

    }

    @Override
    void setWidth(double width) {

    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return (2 * length) + (2 * length);
    }
}
