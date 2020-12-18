package util;

import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {

        Input input = new Input();

//        System.out.println("please enter a string:");
//        String userString = input.getString();
//        System.out.println(userString);
//        System.out.println("please enter a value to test for true/false:");
//        Boolean userBoolean = input.yesNo();
//        System.out.println(userBoolean);
        System.out.println(input.getInt("Enter an integer:"));
//        System.out.println(input.getInt(1, 10, "hello"));
//        System.out.println("please enter a value to test if entry is valid integer:");
//        input.getInt();
        System.out.println(input.getDouble("Enter a floating number (number with decimals):"));
//        System.out.println(input.getDouble(1.0, 50.0));

        System.out.println(input.getBinary());
        System.out.println(input.getHex());

    }
}
