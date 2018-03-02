package shapes;

public class Circle {

    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    private double pi = 3.14159265359;

    public double getArea() {
        return pi * (radius * radius);
    }

    public double getCircumference() {
        return 2 * pi * radius;
    }
}
