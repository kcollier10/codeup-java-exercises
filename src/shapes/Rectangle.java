package shapes;

public class Rectangle {

    protected int length;
    protected int width;

    public Rectangle (int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getArea () {
        System.out.println("Area of a rectangle:");
        return length * width;
    }

    public int getPerimeter () {
        System.out.println("Perimeter of a rectangle:");
        return ((2 * width) + (2 * length));
    }

    public int getLength () {
        System.out.println("Length:");
        return this.length;
    }

    public int getWidth () {
        System.out.println("Width:");
        return this.width;
    }

    public void setLength () {
        int length;
    }

    public void setWidth () {
        int width;
    }
}
