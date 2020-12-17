package util;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Input {

    private final Scanner myScanner;

    // new constructor for scanner
    public Input () {
        // scanner property from above is set to a new instance of the Scanner class
        myScanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Please enter a string:");
        return this.myScanner.nextLine();
    }
    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

//    public boolean yesNo() {
//        System.out.println("Please enter yes or no:");
//        String userInput = myScanner.next();
//        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("sure");
//    }
    // or

    public boolean yesNo() {
        return yesNo("Please enter yes or no:");
//        String userInput = myScanner.next();
//        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("sure");
    }


    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userInput = myScanner.next();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("sure");
    }

//    public int getInt(int min, int max) {
//        System.out.println("please enter a value to test if valid between %d and %d.\n:");
//        int userInput = getInt();
//        if (userInput >= min && userInput <= max) {
//            System.out.printf("%d is between %d and %d\n", userInput, min, max);
//        } else {
//            System.out.println("Not a valid number.");
//            getInt(min, max);
//        }
//        return userInput;
//    }

    public int getInt(int min, int max, String prompt) {
        return getInt(min, max, "Please enter an int between" + min + " and " + max);
//        int input;
//        do{
//            System.out.printf("Please enter an int between %d and %d.", min, max);
//            input = this.myScanner.nextInt();
//        }while(input < min || input > max);
//
//        return input;
    }

    public int getInt () {
        System.out.println("please enter an integer");
        return this.myScanner.nextInt();
    }

//    public double getDouble(double min, double max) {
//        double userInput = getDouble();
//        if(userInput > min && userInput < max) {
//            System.out.println("number is valid");
//            return userInput;
//        } else {
//            System.out.println("number is not valid");
//            return getDouble(min, max);
//        }
//    }
    public double getDouble(double min, double max) {
        double input;
        do{
            System.out.printf("Please enter an int between %f and %f.", min, max);
            input = this.myScanner.nextInt();
        }while(input < min || input > max);

        return input;
    }

    public double getDouble() {
        System.out.println("please enter a double:");
        return myScanner.nextDouble();
    }

}
