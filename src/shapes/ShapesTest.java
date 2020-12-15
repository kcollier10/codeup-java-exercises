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
//        Measurable myShape = new Square(5);
        Measurable myShape = new Rectangle(5, 6);
    }

}
