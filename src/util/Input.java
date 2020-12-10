package util;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Input {

    private final Scanner myScanner;

    // new constructor for scanner
    public Input () {
        this.myScanner = new Scanner(System.in);
    }

    public String getString() {
        return myScanner.nextLine();
    }

    public boolean yesNo() {
        String userInput = myScanner.nextLine();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("sure");
    }

    public int getInt(int min, int max) {
        System.out.println("please enter a value to test if valid between %d and %d.\n:");
        int userInput = getInt();
        if (userInput >= min && userInput <= max) {
            System.out.printf("%d is between %d and %d\n", userInput, min, max);
        } else {
            System.out.println("Not a valid number.");
            getInt(min, max);
        }
        return userInput;
    }

    public int getInt () {
        System.out.println("enter an integer");
        return myScanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double userInput = getDouble();
        if(userInput > min && userInput < max) {
            System.out.println("number is valid");
            return userInput;
        } else {
            System.out.println("number is not valid");
            return getDouble(min, max);
        }
    }

    public double getDouble() {
        System.out.println("please enter a double:");
        return myScanner.nextDouble();
    }




}
