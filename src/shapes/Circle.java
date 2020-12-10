package shapes;

public class Circle {
    private double radius;
    private static int circleCount = 0;

    public Circle () {

    }

    public Circle(double radius) {
        this.radius = radius;
        circleCount++;
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

    public static int getCircleCount () {
        return circleCount;
    }
}
