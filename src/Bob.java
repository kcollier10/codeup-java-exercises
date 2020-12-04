import java.util.Scanner;

public class Bob {

    public static void main (String[] args) {

    Scanner myScanner = new Scanner(System.in);


        System.out.println("*************************");
        System.out.println("Welcome to Bob Simulator!");
        System.out.println("*************************");
        System.out.println("Start typing to speak with Bob!");

        String userInput;
        userInput = myScanner.nextLine();

        if (userInput.equals("")) {
            System.out.println("Fine. Be that way!");
        } else if (userInput.equals(userInput.toUpperCase()) || userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput.endsWith("?")) {
            System.out.println("Sure.");
        } else {
            System.out.println("Whatever");
        }

        userInput = myScanner.next();





    }

}
