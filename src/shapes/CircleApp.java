package shapes;



public class CircleApp {
    public static void main(String[] args) {

        Circle userInput = new Circle();
        Circle circle = new Circle(5);
        double radius = userInput.getRadius();
        double area = userInput.getArea();
        double circumference = userInput.getCircumference();
        System.out.printf("The radius of your circle is %f.\nThe area of your circle is %f.\nThe circumference of your circle is %f.\n", radius, area, circumference);
    }
}
