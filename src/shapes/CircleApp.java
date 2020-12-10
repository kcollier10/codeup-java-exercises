package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {

        Input userInput = new Input();

        boolean answer = true;
        do{
            double radius = userInput.getDouble(1,100);
            Circle circle = new Circle(radius);
            double area = circle.getArea();
            double circumference = circle.getCircumference();
            System.out.printf("The radius of your circle is %f.\nThe area of your circle is %f.\nThe circumference of your circle is %f.\n", radius, area, circumference);

            answer = userInput.yesNo("Do you want to create another circle?");

        }while(answer);
        System.out.println("You've created " + Circle.getCircleCount() + " circles!");
//        double radius1 = userInput.getDouble();
//
//        Circle circle = new Circle(radius1);
//
//        double radius = circle.getRadius();
//        double area = circle.getArea();
//        double circumference = circle.getCircumference();
//        System.out.printf("The radius of your circle is %f.\nThe area of your circle is %f.\nThe circumference of your circle is %f.\n", radius, area, circumference);
    }
}
