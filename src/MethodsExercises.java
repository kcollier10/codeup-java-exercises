import java.util.Scanner;

public class MethodsExercises {

    public static void main (String[] arg) {

        Scanner myScanner = new Scanner(System.in);
        int x, y, sum, difference, product, quotient;
        System.out.println("Please enter two numbers.");
        x = myScanner.nextInt();
        y = myScanner.nextInt();
        sum = Addition(x, y);
        difference = Subtraction(x, y);
        product = Multiplication(x, y);
        quotient = Division(x, y);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);


    }

    public static int Addition(int x, int y) {
        return x + y;
    }

    public static int Subtraction(int x, int y) {
        return x - y;
    }

    public static int Multiplication(int x, int y) {
        return x * y;
    }

    public static int Division(int x, int y) {
        return x / y;
    }

}
