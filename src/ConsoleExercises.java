import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner myScanner;
        myScanner = new Scanner(System.in);


        double pi = 3.14159;
        System.out.format("%.2f%n", pi);


        int number;

        System.out.println("Please type a number below.");
        number = myScanner.nextInt();
        System.out.printf("You entered: %d.%n", number);
        // if character/string is typed, error is thrown

        System.out.println("Please enter your first, second, and third favorite colors.");
        String firstColor = myScanner.next();
        String secondColor = myScanner.next();
        String thirdColor = myScanner.next();

        System.out.println(firstColor);
        System.out.println(secondColor);
        System.out.println(thirdColor);

        System.out.printf("Thank you for your cooperation! Here are your top three colors: %s, %s, %s.%n", firstColor, secondColor, thirdColor);

        System.out.println("Please enter a sentence: ");
        String sentence;
        sentence = myScanner.next();
        // using .next() only prints first word of string (prints to first whitespace)
        System.out.printf("You entered: %s%n", sentence);

        String sentence2;
        sentence2 = myScanner.nextLine();
        System.out.printf("You entered: %s%n", sentence2);




    }
}
