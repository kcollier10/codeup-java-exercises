package shapes;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    @Override
    public int getArea() {
        System.out.println("Area of a square:");
        return (int) Math.pow(length, 2);
    }

    @Override
    public int getPerimeter() {
        System.out.println("Perimeter of a square:");
        return length * 4;
    }
}
