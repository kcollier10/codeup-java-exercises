package util;

import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {

        Input input = new Input();

        System.out.println("please enter a string:");
        String userString = input.getString();
        System.out.println(userString);
        System.out.println("please enter a value to test for true/false:");
        Boolean userBoolean = input.yesNo();
        System.out.println(userBoolean);
        input.getInt(1, 10);
        System.out.println("please enter a value to test if entry is valid integer:");
        input.getInt();
        input.getDouble(1.0, 10.0);




    }
}