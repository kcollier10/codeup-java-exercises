package shapes;

public class Circle {
    private double radius = 10;

    public Circle () {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (Math.PI * (radius * radius));
    }

    public double getCircumference() {
        return (Math.PI * radius * 2);
    }

    public double getRadius() {
        return radius;
    }
}
