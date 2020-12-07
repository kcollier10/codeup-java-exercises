import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {


    public static void main (String[] arg) {

        Scanner myScanner = new Scanner(System.in);
        int x, y, sum, difference, product, quotient, modulus, userInput;
        System.out.println("Please enter two numbers.");
        x = myScanner.nextInt();
        y = myScanner.nextInt();
        sum = Addition(x, y);
        difference = Subtraction(x, y);
        product = Multiplication(x, y);
        quotient = Division(x, y);
        modulus = Remainder(x, y);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + modulus);


        System.out.println("Enter a number between 1 and 10.");
        userInput = myScanner.nextInt();
        getInteger(1, 10, userInput);

        System.out.println("Please enter a number for factorialization:");
        long num = myScanner.nextInt();
        System.out.println("Factorial of " + num + " is " + factorial(5));
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
        if (y == 0) {
            System.out.println("Infinity");
        }
        return x / y;
    }

    public static int Remainder(int x, int y) {
        return x % y;
    }

    public static void getInteger(int min, int max, int userInput) {

        if (userInput >= min && userInput <= max) {
            System.out.println("Valid number entered");
        } else {
            System.out.println("Please enter a different number.");
        }
    }
    public static long factorial(long n) {
        if (n == 1L)
            return 1;

        return n * factorial(n-1);

    }

    public static  String loopFactorial(long n) {
        int initial = 1;
        for (int i = 1; i < n; i++) {
            initial *= i;
        }
        return n + "!" + " = " + initial;

    }

    public static int Dice () {

        System.out.println("Would you like to roll the dice?");


        int die1 = (int) (Math.random() * 6 + 1);
        int die2 = (int) (Math.random() * 6 + 1);
        int sum = die1 + die2;
        return sum;


    }



}
