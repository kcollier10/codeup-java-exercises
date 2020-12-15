package shapes;

public class ShapesTest {

    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getLength());
//        System.out.println(box1.getWidth());
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        Square box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

        // use Measurable class instead of Rectangle and Square first
//        Measurable myShape = new Measurable();
        // cannot do this, Measurable is abstract and cannot be instantiated
//        Measurable myShape = new Square();
//        Measurable myShape = new Rectangle();
        // cannot do this, need a parameter


        Measurable square = new Square(5);
        Measurable rectangle = new Rectangle(5, 6);

        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        // Why does code fail to compile if you leave off the getPerimeter method in Rectangle?
        // Rectangle is not abstract and does not override abstract method getPerimeter() in shapes.Measurable

//        square.getLength();
//        square.getWidth();
        // cannot do this because there is no getLength() method in Measurable
    }

}
