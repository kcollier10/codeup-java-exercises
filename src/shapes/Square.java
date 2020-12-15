package shapes;

public class Square extends Quadrilateral {


    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea() {
        System.out.println("Area of a square:");
        return (int) Math.pow(super.length, 2);
    }

    @Override
    public double getPerimeter() {
        System.out.println("Perimeter of a square:");
        return super.length * 4;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.length = width;
        this.width = length;

    }
}
