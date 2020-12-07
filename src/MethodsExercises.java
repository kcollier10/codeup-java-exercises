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
        System.out.println("Factorial of " + num + " is " + factorial(num));
        Dice();
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
        long result;
        if (n == 1)
            return 1;

        result = factorial(n - 1) * n;
        return result;

    }

//    public static  String loopFactorial(long n) {
//        int initial = 1;
//        for (int i = 1; i < n; i++) {
//            initial *= i;
//        }
//        return n + "!" + " = " + initial;
//
//    }

    public static void Dice () {
        Scanner myScanner = new Scanner(System.in);
        boolean playGame = true;

        do {
            System.out.println("Enter the number of sides for a pair of dice:");
            int sides = myScanner.nextInt();

            int die1 = (int) (Math.random() * sides) + 1;
            int die2 = (int) (Math.random() * sides) + 1;
            int sum = die1 + die2;

            System.out.printf("You rolled a %d and %d! Your total is: %d \n", die1, die2, sum);
            System.out.println("Would you like to roll again? [yes] or [no]");
            String keepGoing = myScanner.next();

            if (!keepGoing.equalsIgnoreCase("yes")) {
                playGame = false;
                System.out.println("Exiting game.");
            }
        }while(playGame);

    }



}
